package io.swagger.client.api

import io.swagger.client.model.Variable
import io.swagger.client.model.UserVariables
import io.swagger.client.model.VariableCategory
import io.swagger.client.model.VariablesNew
import io.swagger.client._
import scala.concurrent.{ Future, Await }
import scala.concurrent.duration._
import collection.mutable

class VariablesApi(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

  
  def correlationsPost(cause: String,
      effect: String,
      correlationcoefficient: String,
      vote: String)(implicit reader: ClientResponseReader[Unit]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/correlations"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    

    
    if(cause != null)   queryParams += "cause" -> cause.toString
    if(effect != null)   queryParams += "effect" -> effect.toString
    if(correlationcoefficient != null)   queryParams += "correlationcoefficient" -> correlationcoefficient.toString
    if(vote != null)   queryParams += "vote" -> vote.toString

    

    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  
  def publicVariablesGet()(implicit reader: ClientResponseReader[Variable]): Future[Variable] = {
    // create path and map variables
    val path = (addFmt("/public/variables"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    

    

    

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  
  def publicVariablesSearchSearchGet(search: String,
      effectOrCause: Option[String] = None,
      limit: Option[Integer] = None,
      offset: Option[Integer] = None,
      sort: Option[Integer] = None
      )(implicit reader: ClientResponseReader[Variable]): Future[Variable] = {
    // create path and map variables
    val path = (addFmt("/public/variables/search/{search}")
        replaceAll ("\\{" + "search" + "\\}",search.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    

    if(effectOrCause != null) effectOrCause.foreach { v => queryParams += "effectOrCause" -> v.toString }if(limit != null) limit.foreach { v => queryParams += "limit" -> v.toString }if(offset != null) offset.foreach { v => queryParams += "offset" -> v.toString }if(sort != null) sort.foreach { v => queryParams += "sort" -> v.toString }

    

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  
  def v1UserVariablesPost(sharingData: UserVariables)(implicit reader: ClientResponseReader[Unit], writer: RequestWriter[UserVariables]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/v1/userVariables"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    

    

    

    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(sharingData))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  
  def variableCategoriesGet()(implicit reader: ClientResponseReader[List[VariableCategory]]): Future[List[VariableCategory]] = {
    // create path and map variables
    val path = (addFmt("/variableCategories"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    

    

    

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  
  def variablesGet(userId: Option[Integer] = None,
      category: Option[String] = None,
      limit: Option[Integer] = None,
      offset: Option[Integer] = None,
      sort: Option[Integer] = None
      )(implicit reader: ClientResponseReader[Variable]): Future[Variable] = {
    // create path and map variables
    val path = (addFmt("/variables"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    

    if(userId != null) userId.foreach { v => queryParams += "userId" -> v.toString }if(category != null) category.foreach { v => queryParams += "category" -> v.toString }if(limit != null) limit.foreach { v => queryParams += "limit" -> v.toString }if(offset != null) offset.foreach { v => queryParams += "offset" -> v.toString }if(sort != null) sort.foreach { v => queryParams += "sort" -> v.toString }

    

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  
  def variablesPost(variableName: VariablesNew)(implicit reader: ClientResponseReader[Unit], writer: RequestWriter[VariablesNew]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/variables"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    

    

    

    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(variableName))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  
  def variablesSearchSearchGet(search: String,
      categoryName: Option[String] = None,
      source: Option[String] = None,
      limit: Option[Integer] = None,
      offset: Option[Integer] = None
      )(implicit reader: ClientResponseReader[List[Variable]]): Future[List[Variable]] = {
    // create path and map variables
    val path = (addFmt("/variables/search/{search}")
        replaceAll ("\\{" + "search" + "\\}",search.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    

    if(categoryName != null) categoryName.foreach { v => queryParams += "categoryName" -> v.toString }if(source != null) source.foreach { v => queryParams += "source" -> v.toString }if(limit != null) limit.foreach { v => queryParams += "limit" -> v.toString }if(offset != null) offset.foreach { v => queryParams += "offset" -> v.toString }

    

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  
  def variablesVariableNameGet(variableName: String)(implicit reader: ClientResponseReader[Variable]): Future[Variable] = {
    // create path and map variables
    val path = (addFmt("/variables/{variableName}")
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
