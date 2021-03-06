package firstvoices.api.endpoints;

import com.google.inject.Inject;
import firstvoices.api.model.QueryBean;
import firstvoices.api.representations.*;
import firstvoices.api.representations.containers.Metadata;
import firstvoices.aws.JWTAuth;
import firstvoices.services.FirstVoicesService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.security.SecurityRequirements;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/authorizations")
@SecurityRequirements(
	{
		@SecurityRequirement(name = "oauth2", scopes = {"archives:public"})
	}
)
public class AuthorizationEndpoint {

	@Path("/scopes")
	@GET
	@Operation(
		description = "List available scopes (authorizations)",
		operationId = "LIST SCOPES",
		tags = {"Access"}
	)
	public Response getAvailableScopes() {
		return Response.ok().build();
	}


	@Path("/tokens")
	@GET
	@Operation(
		description = "List tokens for current principal",
		operationId = "LIST CURRENT TOKENS",
		tags = {"Access"}
	)
	public Response getCurrentTokens() {
		return Response.ok().build();
	}


	@Path("/tokens/all")
	@GET
	@Operation(
		description = "List all active tokens",
		operationId = "LIST ALL TOKENS",
		tags = {"Integration"}
	)
	public Response getTokens() {
		return Response.ok().build();
	}

	@Path("/tokens")
	@POST
	@Operation(
		description = "Create a new token with default access",
		operationId = "CREATE TOKEN",
		tags = {"Access"}

	)
	public Response createToken() {
		return Response.ok().build();
	}

	@Path("/pendingRequests")
	@GET
	@Operation(
		description = "List tokens with pending access requests (filter by scope if provided)",
		operationId = "LIST PENDING REQUESTS",
		tags = {"Integration"}
	)
	public Response pendingRequests(@QueryParam("scopes") String scope) {
		return Response.ok().build();
	}

	@Path("/tokens/{tokenID}/requestScopeAccess")
	@POST
	@Operation(
		description = "Request access to another scope (approval required)",
		operationId = "REQUEST SCOPE ACCESS",
		tags = {"Access"}
	)
	public Response requestAccess(@PathParam("tokenID") String tokenID
	) {
		return Response.ok().build();
	}

	@Path("/tokens/{tokenID}/grantScopeAccess")
	@POST
	@Operation(
		description = "Approve a scope access request",
		operationId = "GRANT SCOPE ACCESS",
		tags = {"Integration"}
	)
	public Response grantScopeAccess(@PathParam("tokenID") String tokenID) {
		return Response.ok().build();
	}

	@Path("/tokens/{tokenID}/revokeScopeAccess")
	@POST
	@Operation(
		description = "Revoke access to a scope for a given token",
		operationId = "REVOKE SCOPE ACCESS",
		tags = {"Integration"}
	)
	public Response revokeScopeAccess(@PathParam("tokenID") String tokenID) {
		return Response.ok().build();
	}

	@Path("/tokens/{tokenID}")
	@DELETE
	@Operation(
		description = "Delete a token, revoking all granted access",
		operationId = "DELETE TOKEN",
		tags = {"Integration", "Access"}
	)
	public Response deleteToken(@PathParam("tokenID") String tokenID) {
		return Response.ok().build();
	}

}
