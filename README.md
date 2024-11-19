# java

<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:sch="http://messagepoint.com/api/schemas">
   <soapenv:Header>
      <wsse:Security soapenv:mustUnderstand="1" xmlns:wsse="http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd" xmlns:wsu="http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd">
         <wsse:UsernameToken wsu:Id="">
            <wsse:Username>NWB-2CP-Users</wsse:Username>
            <wsse:Password Type="http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-username-token-profile-1.0#Password">TmF0d2VzdEAxMjM0</wsse:Password>
         </wsse:UsernameToken>
      </wsse:Security>
   </soapenv:Header>
   <soapenv:Body>
      <sch:TouchpointListRequest>
         <sch:BranchId>natwest</sch:BranchId>
         <sch:NodeId>development</sch:NodeId>
         <sch:Prerelease>false</sch:Prerelease>
         <sch:RequesterUsername>nikhil.agarwal@natwest.com</sch:RequesterUsername>
         <sch:ListAll>false</sch:ListAll>
         <sch:ExplicitResponse>true</sch:ExplicitResponse>
      </sch:TouchpointListRequest>
   </soapenv:Body>
</soapenv:Envelope>
