package com.bolsadeideas.springboot.backed.apirest.auth;

public class JwtConfig {
	public static final String LLAVE_SECRETA = "alguna.clave.secreta.12345678"; 
	
	public static final String RSA_PRIVATE = "-----BEGIN RSA PRIVATE KEY-----\r\n" + 
			"MIIEpQIBAAKCAQEA5qpZAcAykArS6fphmIdhnwf3OekvCYgX6GEOzg9yjon0WBeo\r\n" + 
			"4wTTQBfenoJ6G/LxK17j/Uszw51t6SRnKsnACHDd8lMWO9YK2qNZSmAF3PoxY5Hw\r\n" + 
			"1pmq67fqQrDVDC+bZW8xocl0EcpyiwpB2/4N09K/lLn/EhZ0eMKrMmE7MHY+F/DZ\r\n" + 
			"V4Bwv+HHWhKYn7jivTDGwhHVzgw/OoiHBVCkPfhljMugm6u/Z5aoKixwOgPVFfH2\r\n" + 
			"fmnnRyeYMpZewPESU+sj9PNfMx38hVkk+0iKg+L1ifp7TawjulbAXS71TObNUhOL\r\n" + 
			"MuQOPPFhcr9oaOlEHnZOJ2tVzdWEEpGe14bCPwIDAQABAoIBAGgXwbj3ihnUuJ+c\r\n" + 
			"PUS++3/v8VJx96cegmN8wVieQf0vJlRGwRFJ0SdgXjc7/Gz2cn03Aj4BHOgO+FW4\r\n" + 
			"9tGpX/6vKIm9kxAHpLhL9PSKZrr1MSqU5pGBoU9knNPhxxMLvN3GkyhGqBmLOauj\r\n" + 
			"QltLx+OqfIhac1AvT/pbJzTCChrwte9e0OvOmFJlvb1M67Nq7YewzJsqNX43V0TH\r\n" + 
			"b7pT1M4ZcZff71Wrx/1yGiuMLCzaKhckvXC+bE+opWN6EZ6jpMgF+90MpkPRSsF+\r\n" + 
			"waq/ocy/JPxwMx2XGRsVe8e/7X6BKjdNVLUrRvXe/c2cTmzVgNWkUqhxGyWC4ZUx\r\n" + 
			"wzlHpaECgYEA+C6w/I+A3rPlxodrf04Hp0K0NDFZdpQPuU/1+6AulHUjniJgqp0r\r\n" + 
			"QJMdj0eu1XSZDEmHQZPoWDRLkdFiqtSkj43OV8jRlSYlHjKAKzHSHXjp6vFeqSpq\r\n" + 
			"7E6p4suU4oNWFCY+g0kYQfQEbAwcKquDAPfRr/6nG685zO2+Z+tiEQ8CgYEA7e5m\r\n" + 
			"475wC3+nRwomJqwdnTLqkeP1H1m6sLpGVUNB5+GRV9H/xbkodWbTw1dGHRYfUnx2\r\n" + 
			"k98+8TAx5EHAO0LxV7aez6A2blY0lLlNwHrqdE+C3SfsfVZMDm7dPHZHCxamS+CF\r\n" + 
			"RCMZQlD1cbrb9GfERNZtSUxaa46bg/ga+jwx29ECgYEA2LeM/T4iflYBM5dVG1l7\r\n" + 
			"/WaWDW16fb1U7bERT6TUh/ayH4hNeS69cioFCfTCisrCSqR6Y51QqpUf2DlLO3ls\r\n" + 
			"KZ7erHFD8kXY68GVgiKDJBFN0kbrLjVIIQmf99dmL1YYeIfc1q+haxY2NlNs1SXn\r\n" + 
			"w5Sjmld4fQhKJNUGC6DThakCgYEA3k8sT4r2QagqcdPnxaZ3nROf3GRz+bDrIIlL\r\n" + 
			"ggrvn2tBVB7grqvMQ7WqExCOcErlRTsJyCyFMPHpC+7rX/OycFQvmquFcB6XzoY9\r\n" + 
			"QaUXP0mzalQNQSbKtYmcqQuSYafuBWNo4TsyNKZUTslbDseNuQvo3N28dlaus+Wz\r\n" + 
			"vy9THqECgYEAgnskh51GJ1kKS4Y4OaPNEN7NXRCzpVsw/7kzHw4U0zdRWuCEbPUu\r\n" + 
			"PlKW3dcCd+LRZorlozy7+3FdGBXOuXqqg8ghrSedA+e6fPfdamVzeTvR5a1Puu3f\r\n" + 
			"1+va5n1EpGLJZeru3uSz55tzqO2AnRB+HHB4o719l8Cf/rWDaNiiyn8=\r\n" + 
			"-----END RSA PRIVATE KEY-----";
	
	public static final String RSA_PUBLICA= "-----BEGIN PUBLIC KEY-----\r\n" + 
			"MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA5qpZAcAykArS6fphmIdh\r\n" + 
			"nwf3OekvCYgX6GEOzg9yjon0WBeo4wTTQBfenoJ6G/LxK17j/Uszw51t6SRnKsnA\r\n" + 
			"CHDd8lMWO9YK2qNZSmAF3PoxY5Hw1pmq67fqQrDVDC+bZW8xocl0EcpyiwpB2/4N\r\n" + 
			"09K/lLn/EhZ0eMKrMmE7MHY+F/DZV4Bwv+HHWhKYn7jivTDGwhHVzgw/OoiHBVCk\r\n" + 
			"PfhljMugm6u/Z5aoKixwOgPVFfH2fmnnRyeYMpZewPESU+sj9PNfMx38hVkk+0iK\r\n" + 
			"g+L1ifp7TawjulbAXS71TObNUhOLMuQOPPFhcr9oaOlEHnZOJ2tVzdWEEpGe14bC\r\n" + 
			"PwIDAQAB\r\n" + 
			"-----END PUBLIC KEY-----";
	
}
