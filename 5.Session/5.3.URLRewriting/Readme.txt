1.If cookies don't work, the Container falls back to URL rewriting, but only if you have explicitly encode your URLs.
2.If you don't encode URL and client won't accept cookies, you don't get to use sessions.
3.If you do encode your URLs, the container will first attempt to use cookies for session management, and fall back
  to URL rewriting only if the cookie approach fails.