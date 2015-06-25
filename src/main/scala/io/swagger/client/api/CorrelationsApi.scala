package io.swagger.client.api

import io.swagger.client.model.Correlation
import io.swagger.client.model.PostCorrelation
import io.swagger.client.model.JsonErrorResponse
import io.swagger.client._
import scala.concurrent.{ Future, Await }
import scala.concurrent.duration._
import collection.mutable

class CorrelationsApi(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

  
  def correlationsGet(effect: String,
      cause: String)(implicit reader: ClientResponseReader[List[Correlation]]): Future[List[Correlation]] = {
    // create path and map variables
    val path = (addFmt("/correlations"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    

    
    if(effect != null)   queryParams += "effect" -> effect.toString
    if(cause != null)   queryParams += "cause" -> cause.toString

    

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  
  def publicCorrelationsSearchSearchGet(search: String,
      effectOrCause: String)(implicit reader: ClientResponseReader[List[Correlation]]): Future[List[Correlation]] = {
    // create path and map variables
    val path = (addFmt("/public/correlations/search/{search}")
        replaceAll ("\\{" + "search" + "\\}",search.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    

    
    if(effectOrCause != null)   queryParams += "effectOrCause" -> effectOrCause.toString

    

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  
  def v1CorrelationsPost(body: PostCorrelation)(implicit reader: ClientResponseReader[Unit], writer: RequestWriter[PostCorrelation]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/v1/correlations"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    

    

    

    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(body))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  
  def v1OrganizationsOrganizationIdUsersUserIdVariablesVariableNameCausesGet(organizationId: Integer,
      userId: Integer,
      variableName: String,
      organizationToken: String,
      includePublic: String)(implicit reader: ClientResponseReader[List[Correlation]]): Future[List[Correlation]] = {
    // create path and map variables
    val path = (addFmt("/v1/organizations/{organizationId}/users/{userId}/variables/{variableName}/causes")
        replaceAll ("\\{" + "organizationId" + "\\}",organizationId.toString)
        replaceAll ("\\{" + "userId" + "\\}",userId.toString)
        replaceAll ("\\{" + "variableName" + "\\}",variableName.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    

    
    if(organizationToken != null)   queryParams += "organization_token" -> organizationToken.toString
    if(includePublic != null)   queryParams += "include_public" -> includePublic.toString

    

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  
  def v1OrganizationsOrganizationIdUsersUserIdVariablesVariableNameEffectsGet(organizationId: Integer,
      userId: Integer,
      variableName: String,
      organizationToken: String,
      includePublic: String)(implicit reader: ClientResponseReader[List[Correlation]]): Future[List[Correlation]] = {
    // create path and map variables
    val path = (addFmt("/v1/organizations/{organizationId}/users/{userId}/variables/{variableName}/effects")
        replaceAll ("\\{" + "organizationId" + "\\}",organizationId.toString)
        replaceAll ("\\{" + "userId" + "\\}",userId.toString)
        replaceAll ("\\{" + "variableName" + "\\}",variableName.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    

    
    if(organizationToken != null)   queryParams += "organization_token" -> organizationToken.toString
    if(includePublic != null)   queryParams += "include_public" -> includePublic.toString

    

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  
  def v1VariablesVariableNameCausesGet(variableName: String)(implicit reader: ClientResponseReader[List[Correlation]]): Future[List[Correlation]] = {
    // create path and map variables
    val path = (addFmt("/v1/variables/{variableName}/causes")
        replaceAll ("\\{" + "variableName" + "\\}",variableName.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    

    

    

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  
  def v1VariablesVariableNameEffectsGet(variableName: String)(implicit reader: ClientResponseReader[List[Correlation]]): Future[List[Correlation]] = {
    // create path and map variables
    val path = (addFmt("/v1/variables/{variableName}/effects")
        replaceAll ("\\{" + "variableName" + "\\}",variableName.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    

    

    

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  
  def v1VariablesVariableNamePublicCausesGet(variableName: String)(implicit reader: ClientResponseReader[List[Correlation]]): Future[List[Correlation]] = {
    // create path and map variables
    val path = (addFmt("/v1/variables/{variableName}/public/causes")
        replaceAll ("\\{" + "variableName" + "\\}",variableName.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    

    

    

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  
  def v1VariablesVariableNamePublicEffectsGet(variableName: String)(implicit reader: ClientResponseReader[List[Correlation]]): Future[List[Correlation]] = {
    // create path and map variables
    val path = (addFmt("/v1/variables/{variableName}/public/effects")
        replaceAll ("\\{" + "variableName" + "\\}",variableName.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    

    

    

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  

}