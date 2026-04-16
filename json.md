when ever I say json object means

{} --- json object starts with { and ends with }

as I said json object with name as type string or
attribute name of type string means 
email of type string 

```json
{
  "name": "some value",
  "email": "someone@example.com",
  "tags": [
    "tag1",
    "2"
  ],
  "is_ready": true,
  "age": 12,
  "address": {
    "ares": "bangalore",
    "pin": 560018
  },
  "friends": [
    {
      "name": "Aman",
      "address": {
        "ares": "bangalore",
        "pin": 560018
      }
    },
    {
      "name": "Raman",
      "address": {
        "ares": "bangalore",
        "pin": 560019
      }
    }
  ]
}
```

object starts with "{" and ends with "}"

array starts with "[" and ends with "]"

if I say tags of type array of string means

there could be n level of nesting and array of any particular type, 

here friends are array of object 

so basically there are following data types

string
numeric 
bool
object 
array 

// I guess time is also there but I am not sure about it 

here address is of type object

let me show you some object nesting and array of objects

similarly there are other data types like numeric, bool

// here name is attribute or field name and its value is of type string
// each attribute is seperated by comma (,)
