package org.lutra.yandexmaps.model;

public class RouteWrapper
{
	public Route response;
}
/*TODO:DELETE ME
{
   "response":{
      "type":"FeatureCollection",
      "properties":{
         "RouterRouteMetaData":{
            "length":31214.98,
            "humanLength":{
               "unit":"kilometers",
               "value":31.210000000000001
            },
            "Length":{
               "value":31214.98,
               "text":"31 км"
            },
            "time":2880.54,
            "Time":{
               "value":2880.54,
               "text":"48 мин"
            },
            "jamsTime":4366.46,
            "JamsTime":{
               "value":4366.46,
               "text":"1 ч 13 мин"
            }
         },
         "boundedBy":[
            [
               37.411034000000001,
               55.744827000000001
            ],
            [
               37.792788999999999,
               55.793711000000002
            ]
         ]
      },
      "features":[
         {
            "type":"Feature",
            "properties":{
               "GeocoderMetaData":{
                  "kind":"street",
                  "text":"Россия, Москва, улица Крылатские Холмы",
                  "precision":"street",
                  "AddressDetails":{
                     "Country":{
                        "AddressLine":"Москва, улица Крылатские Холмы",
                        "CountryNameCode":"RU",
                        "CountryName":"Россия",
                        "AdministrativeArea":{
                           "AdministrativeAreaName":"Центральный федеральный округ",
                           "SubAdministrativeArea":{
                              "SubAdministrativeAreaName":"Москва",
                              "Locality":{
                                 "LocalityName":"Москва",
                                 "Thoroughfare":{
                                    "ThoroughfareName":"улица Крылатские Холмы"
                                 }
                              }
                           }
                        }
                     }
                  }
               },
               "boundedBy":[
                  [
                     37.404761000000001,
                     55.745812999999998
                  ],
                  [
                     37.425153000000002,
                     55.764622000000003
                  ]
               ]
            },
            "geometry":{
               "type":"Point",
               "coordinates":[
                  37.414876,
                  55.755743000000002
               ]
            }
         },
         {
            "type":"FeatureCollection",
            "properties":{
               "RouterRouteMetaData":{
                  "length":31214.98,
                  "humanLength":{
                     "unit":"kilometers",
                     "value":31.210000000000001
                  },
                  "Length":{
                     "value":31214.98,
                     "text":"31 км"
                  },
                  "time":2880.54,
                  "Time":{
                     "value":2880.54,
                     "text":"48 мин"
                  },
                  "jamsTime":4366.46,
                  "JamsTime":{
                     "value":4366.46,
                     "text":"1 ч 13 мин"
                  }
               },
               "boundedBy":[
                  [
                     37.411034000000001,
                     55.744827000000001
                  ],
                  [
                     37.792788999999999,
                     55.793711000000002
                  ]
               ],
               "polylod":{
                  "polyline":"2uc6AuLDUgNH_f__j____-n-___G____Kv___7r___-W_v__O____3v___-Z____Nv___y3___-1____lP___8n___8s____CwAAAIP___89AAAAG____xEBAACZ_f__OgAAAJ7___93AAAAev___4EAAACR____zwAAAIf____GAAAArP___1AAAACU____KQAAAKT___8RAAAArv___93___82____WvT__174___3FQAAavX__7kHAABi_P__cgUAAI79__8iAQAAkP___2oBAAA7____EgEAAEz___8tAgAAUP7__8MAAAB8____tAIAAJL-___MAQAALP___zMBAADEAAAAnAMAAIECAACmAgAAzAIAAG4AAACRAAAAGgAAAE8AAAD7____NAAAAMQRAACiCgAAxQAAAGIAAACbAAAANwAAAAcDAADsAAAAVwEAAGkAAAA6AgAAkwAAAMQAAAAkAAAAOAEAACwAAAARAQAACQAAAFcBAAD0____FgEAAOD___9JAQAAwf___y8NAAAT_f__iQsAALP9___EAwAAhv___4EBAADr____bwIAAPD___8_AwAAJAAAAOQBAAA7AAAA-AQAAAgBAADmIgAAnwgAAP8GAADVAQAAcQEAAIoAAADcAAAAcwAAAIoBAAAtAQAADwMAAKACAAAeBgAAoQUAALsBAABbAQAADQMAAMUBAADqEQAA9QkAAHMBAAD0AAAABAEAANYAAACJAAAAoAAAAI0AAADYAAAAhwsAAPMVAACiAAAA6wAAAKoAAADSAAAAqwAAAKkAAACxAQAAOAEAAD4BAAC0AAAAEAIAAOgAAAAiAQAAXwAAAAgCAABtAAAAbgEAADIAAABuDQAAYAEAALIBAABWAAAA0QAAAFcAAAClAAAAZQAAAIUAAABvAAAAeAAAAIAAAAA6AAAAagAAACEAAACZAAAA4f___6UAAACh____QwEAACT___-CAgAAP____wUCAAAeAAAAOgAAANj___8gAQAAwv___-QAAACb____SwIAAA4AAADPAAAARgAAAL0AAABvAQAAwwIAABoBAABcAgAA7QEAABgCAAASAQAAlwEAABAEAABgBwAAagAAALgAAABQAAAAUAAAAHYAAABGAAAAQgEAAGoAAABtAQAAFQAAAM0EAACl____nw4AAJj9__8kCgAAj_7__6QKAABK_v__wwkAAIT-__9uDwAAx_3__8IGAADv_v__3hkAAJr7____DQAA3v3__2ASAABP_f__2T8AAPv3__-sEQAA3P3__9scAABm_P__6gIAAH3____PAAAAtf___yQAAADc____DAAAALz____Q____uf___5j____W____ff____r___9v_P__2gAAAHD5___RAAAAXP___1AAAABj____wgAAAD4BAAC7AgAArgAAAC0BAACfAAAA2gAAAOQBAADbAQAA0wEAAJcBAACVAQAAUQEAAO4BAABTAQAA_QEAAC4BAAAgBQAAnAIAAIABAAD-AAAAhAEAAFABAABmBwAACAcAAGIBAAAWAQAAGwEAALwAAAD5AAAAjgAAAEkBAACZAAAALQIAANwAAABTAgAArwAAAIMBAABbAAAAdwIAAGAAAAARDQAAbgEAADsCAABlAAAAfQIAAK8AAABIAgAA2AAAABYBAAB4AAAAwwEAABUBAADTAAAApQAAAHsBAABkAQAA-AMAAEYEAAC4CAAARQsAAIEBAACjAQAAMwIAAMMBAAAXDQAAdgkAABQRAAA3DAAAZAcAAGUFAABhAwAAbAIAAPQCAAAGAgAABQ4AACUKAADhAQAATAEAAJ4AAABlAAAAowAAAFAAAAAAAQAAWwAAAKgBAABeAAAAPwEAACIAAACHDgAAFAAAABwDAAAUAAAAvQMAACsAAACTDgAADgEAAM4DAAAeAAAAowwAABkAAADRGQAA______8DAAA6AAAA1hAAAGYBAAANMAAA5QEAAF4JAAA1AAAAUQYAAO7___91BAAA3P___0gOAAAZ____SxcAALv-__8iBAAAkP___9kHAACS_v__FgMAAI7_____AQAAz____3wCAADc____dQMAAP____-ADwAAuAAAAAEDAABAAAAAIAIAAFUAAACVAwAArAAAAGMVAABYBAAAYwQAAMUAAAAGAgAAPwAAACsDAAA-AAAAygMAAAsAAACLAwAA0P___7ICAACw____2wEAALj___-NAgAAfv___z0CAABt____1QEAAHD___8WAgAAQP___xwCAAAc____oAEAAC_____rAQAA4P7__3MDAAB8_f__AQYAAHL7__8NAwAAlP3__2ogAAAb5___vwMAAHf9__-AAwAA9_3__2YLAAAz-v__KgMAAHn-___tAgAAuf7__34CAAAB____NxgAAET3___SAwAAff7__6cFAADn-___yQQAAFf8___KAAAAfP___6UCAACy_v__NAEAAIMAAABPBAAANQIAAJsJAAAABQAA-wcAADwEAABWAgAAcAEAAOAHAABLBQAA-wAAAIwAAACYDAAA0gUAAGUBAAC1AAAA1QAAAIoAAACYAAAAgQAAAJMAAACbAAAAUAAAAHYAAAAtAAAAZAAAAG4AAAAxAAAAOAAAAAIBAABRAAAApgAAAEYAAABJAAAAfgAAAFAAAACbAAAAPAAAAGoQAABiAAAAcgMAABAAAAABAgAA9f___4kAAAAxAAAAdQYAANv-__9uAwAAl____3UPAAD__v__NRoAADX7__-oAAAA2f___4ECAAAh____lAIAABr___-jAQAAWv___ykCAABO____OQEAAL3___8gBgAAUv___1ICAACw____YwUAAJwHAAAsAAAAfgAAAOX___82AgAAvv7__10LAADj____nAAAADcEAAATAQAAtgMAAEwBAACVAAAALgAAAIcAAAAPAAAAeRYAAHsBAACXCwAAkQAAALspAAClAQAA0gYAAFUAAAAWAQAArAAAACgBAACQAAAAQgIAAOsAAABIAQAAXwAAAPoAAAAzAAAAFgEAAB8AAAAYOQAALQIAAEsFAABnAAAAPAUAAKUAAAA-BAAAtwAAAOYDAADYAAAAWQUAAHEBAABsBQAAmgEAABoZAACZBwAA8QIAAMsAAADvAQAAVwAAAEQUAADaAgAAqwEAADMAAABvBwAAkwAAAMQMAAA2AAAAXgsAAGIAAACABgAAHgAAAA==",
                  "levels":"AOPLPNPIOMOKPOMPAPNOAANOPLPNPMPAPLNOPALPOAPPMOPKPOOLPMOIOMNOGONOOKPMOIPNMPOIOMPKPNOJPMPOKNPAAMONPOKPPANMAPMOKOANOPOAPNPKPPAOLPNMOKNLNANPLPKOMOOLPMOPIPNPLOOLOMOIPNLMNJPPPPPPKPOMOEPMOOLPLOLOIPMPLNOMPOIOKPONPKOMOFPNPLPNPJPOPLOINPKOOAOMOAPOPLOPLPKPNOPNMOAPOAAPNLOMKLPPPAOMPAOJOPAOOPKOMPAPOMOPKAOMOKPONOIMPKOPA",
                  "maxlevel":"P"
               }
            },
            "features":[
               {
                  "type":"Feature",
                  "properties":{
                     "RouterSegmentMetaData":{
                        "street":"улица Крылатские Холмы",
                        "action":"none",
                        "Action":{
                           "value":"none",
                           "text":"прямо"
                        },
                        "angle":0,
                        "length":376.13,
                        "humanLength":{
                           "unit":"meters",
                           "value":376
                        },
                        "Length":{
                           "value":376.13,
                           "text":"380 м"
                        },
                        "time":75.230000000000004,
                        "Time":{
                           "value":75.230000000000004,
                           "text":"1 мин"
                        },
                        "jamsTime":75.230000000000004,
                        "JamsTime":{
                           "value":75.230000000000004,
                           "text":"1 мин"
                        },
                        "text":"улица Крылатские Холмы"
                     },
                     "boundedBy":[
                        [
                           37.412857000000002,
                           55.753157000000002
                        ],
                        [
                           37.414873999999998,
                           55.755746000000002
                        ]
                     ]
                  },
                  "geometry":{
                     "type":"GeometryCollection",
                     "geometries":[
                        {
                           "type":"LineString",
                           "lodIndex":0
                        }
                     ]
                  }
               },
               {
                  "type":"Feature",
                  "properties":{
                     "RouterSegmentMetaData":{
                        "street":"Рубежный проезд",
                        "action":"right",
                        "Action":{
                           "value":"right",
                           "text":"направо"
                        },
                        "angle":-30.149999999999999,
                        "length":55.280000000000001,
                        "humanLength":{
                           "unit":"meters",
                           "value":55
                        },
                        "Length":{
                           "value":55.280000000000001,
                           "text":"55 м"
                        },
                        "time":31.059999999999999,
                        "Time":{
                           "value":31.059999999999999,
                           "text":"1 мин"
                        },
                        "jamsTime":31.059999999999999,
                        "JamsTime":{
                           "value":31.059999999999999,
                           "text":"1 мин"
                        },
                        "text":"Направо, Рубежный проезд"
                     },
                     "boundedBy":[
                        [
                           37.413913000000001,
                           55.752673999999999
                        ],
                        [
                           37.414050000000003,
                           55.753157000000002
                        ]
                     ]
                  },
                  "geometry":{
                     "type":"GeometryCollection",
                     "geometries":[
                        {
                           "type":"LineString",
                           "lodIndex":17
                        }
                     ]
                  }
               },
               {
                  "type":"Feature",
                  "properties":{
                     "RouterSegmentMetaData":{
                        "street":"Рубежный проезд",
                        "action":"none",
                        "Action":{
                           "value":"none",
                           "text":"прямо"
                        },
                        "angle":-33.659999999999997,
                        "length":287.06999999999999,
                        "humanLength":{
                           "unit":"meters",
                           "value":287
                        },
                        "Length":{
                           "value":287.06999999999999,
                           "text":"290 м"
                        },
                        "time":57.409999999999997,
                        "Time":{
                           "value":57.409999999999997,
                           "text":"1 мин"
                        },
                        "jamsTime":77.010000000000005,
                        "JamsTime":{
                           "value":77.010000000000005,
                           "text":"1 мин"
                        },
                        "text":"Рубежный проезд"
                     },
                     "boundedBy":[
                        [
                           37.411034000000001,
                           55.750720000000001
                        ],
                        [
                           37.414015999999997,
                           55.752673999999999
                        ]
                     ]
                  },
                  "geometry":{
                     "type":"GeometryCollection",
                     "geometries":[
                        {
                           "type":"LineString",
                           "lodIndex":21
                        }
                     ]
                  }
               },
               {
                  "type":"Feature",
                  "properties":{
                     "RouterSegmentMetaData":{
                        "street":"Рублевское шоссе (дублер)",
                        "action":"left",
                        "Action":{
                           "value":"left",
                           "text":"налево"
                        },
                        "angle":89.890000000000001,
                        "length":993.25,
                        "humanLength":{
                           "unit":"meters",
                           "value":993
                        },
                        "Length":{
                           "value":993.25,
                           "text":"990 м"
                        },
                        "time":130.30000000000001,
                        "Time":{
                           "value":130.30000000000001,
                           "text":"2 мин"
                        },
                        "jamsTime":135.44,
                        "JamsTime":{
                           "value":135.44,
                           "text":"2 мин"
                        },
                        "text":"Налево, Рублевское шоссе (дублер)"
                     },
                     "boundedBy":[
                        [
                           37.411034000000001,
                           55.744827000000001
                        ],
                        [
                           37.422856000000003,
                           55.750720000000001
                        ]
                     ]
                  },
                  "geometry":{
                     "type":"GeometryCollection",
                     "geometries":[
                        {
                           "type":"LineString",
                           "lodIndex":22
                        }
                     ]
                  }
               },
               {
                  "type":"Feature",
                  "properties":{
                     "RouterSegmentMetaData":{
                        "street":"Крылатская улица",
                        "action":"left",
                        "Action":{
                           "value":"exit left",
                           "text":"съезд налево"
                        },
                        "angle":87.849999999999994,
                        "length":243.81,
                        "humanLength":{
                           "unit":"meters",
                           "value":243
                        },
                        "Length":{
                           "value":243.81,
                           "text":"240 м"
                        },
                        "time":67.090000000000003,
                        "Time":{
                           "value":67.090000000000003,
                           "text":"1 мин"
                        },
                        "jamsTime":106.31999999999999,
                        "JamsTime":{
                           "value":106.31999999999999,
                           "text":"2 мин"
                        },
                        "text":"Съезд налево, Крылатская улица"
                     },
                     "boundedBy":[
                        [
                           37.422856000000003,
                           55.744827000000001
                        ],
                        [
                           37.424900999999998,
                           55.746656000000002
                        ]
                     ]
                  },
                  "geometry":{
                     "type":"GeometryCollection",
                     "geometries":[
                        {
                           "type":"LineString",
                           "lodIndex":32
                        }
                     ]
                  }
               },
               {
                  "type":"Feature",
                  "properties":{
                     "RouterSegmentMetaData":{
                        "street":"Крылатская улица",
                        "action":"none",
                        "Action":{
                           "value":"none",
                           "text":"прямо"
                        },
                        "angle":-46.079999999999998,
                        "length":499.75999999999999,
                        "humanLength":{
                           "unit":"meters",
                           "value":499
                        },
                        "Length":{
                           "value":499.75999999999999,
                           "text":"500 м"
                        },
                        "time":38.439999999999998,
                        "Time":{
                           "value":38.439999999999998,
                           "text":"1 мин"
                        },
                        "jamsTime":38.439999999999998,
                        "JamsTime":{
                           "value":38.439999999999998,
                           "text":"1 мин"
                        },
                        "text":"Крылатская улица"
                     },
                     "boundedBy":[
                        [
                           37.424895999999997,
                           55.746656000000002
                        ],
                        [
                           37.430571,
                           55.749766999999999
                        ]
                     ]
                  },
                  "geometry":{
                     "type":"GeometryCollection",
                     "geometries":[
                        {
                           "type":"LineString",
                           "lodIndex":38
                        }
                     ]
                  }
               },
               {
                  "type":"Feature",
                  "properties":{
                     "RouterSegmentMetaData":{
                        "street":"улица Нижние Мневники",
                        "action":"none",
                        "Action":{
                           "value":"none",
                           "text":"прямо"
                        },
                        "angle":0,
                        "length":3945.9200000000001,
                        "humanLength":{
                           "unit":"kilometers",
                           "value":3.9500000000000002
                        },
                        "Length":{
                           "value":3945.9200000000001,
                           "text":"3,9 км"
                        },
                        "time":303.52999999999997,
                        "Time":{
                           "value":303.52999999999997,
                           "text":"5 мин"
                        },
                        "jamsTime":303.52999999999997,
                        "JamsTime":{
                           "value":303.52999999999997,
                           "text":"5 мин"
                        },
                        "text":"улица Нижние Мневники"
                     },
                     "boundedBy":[
                        [
                           37.430571,
                           55.748502999999999
                        ],
                        [
                           37.475377000000002,
                           55.767212999999998
                        ]
                     ]
                  },
                  "geometry":{
                     "type":"GeometryCollection",
                     "geometries":[
                        {
                           "type":"LineString",
                           "lodIndex":42
                        }
                     ]
                  }
               },
               {
                  "type":"Feature",
                  "properties":{
                     "RouterSegmentMetaData":{
                        "street":"Карамышевский мост",
                        "action":"none",
                        "Action":{
                           "value":"none",
                           "text":"прямо"
                        },
                        "angle":0.01,
                        "length":72.829999999999998,
                        "humanLength":{
                           "unit":"meters",
                           "value":72
                        },
                        "Length":{
                           "value":72.829999999999998,
                           "text":"72 м"
                        },
                        "time":5.5999999999999996,
                        "Time":{
                           "value":5.5999999999999996,
                           "text":"1 мин"
                        },
                        "jamsTime":8.8000000000000007,
                        "JamsTime":{
                           "value":8.8000000000000007,
                           "text":"1 мин"
                        },
                        "text":"Карамышевский мост"
                     },
                     "boundedBy":[
                        [
                           37.475031000000001,
                           55.767212999999998
                        ],
                        [
                           37.475250000000003,
                           55.767854999999997
                        ]
                     ]
                  },
                  "geometry":{
                     "type":"GeometryCollection",
                     "geometries":[
                        {
                           "type":"LineString",
                           "lodIndex":92
                        }
                     ]
                  }
               },
               {
                  "type":"Feature",
                  "properties":{
                     "RouterSegmentMetaData":{
                        "street":"улица Народного Ополчения",
                        "action":"none",
                        "Action":{
                           "value":"none",
                           "text":"прямо"
                        },
                        "angle":0.02,
                        "length":385.06,
                        "humanLength":{
                           "unit":"meters",
                           "value":385
                        },
                        "Length":{
                           "value":385.06,
                           "text":"390 м"
                        },
                        "time":35.009999999999998,
                        "Time":{
                           "value":35.009999999999998,
                           "text":"1 мин"
                        },
                        "jamsTime":45.5,
                        "JamsTime":{
                           "value":45.5,
                           "text":"1 мин"
                        },
                        "text":"улица Народного Ополчения"
                     },
                     "boundedBy":[
                        [
                           37.474665000000002,
                           55.767854999999997
                        ],
                        [
                           37.475397999999998,
                           55.771239000000001
                        ]
                     ]
                  },
                  "geometry":{
                     "type":"GeometryCollection",
                     "geometries":[
                        {
                           "type":"LineString",
                           "lodIndex":93
                        }
                     ]
                  }
               },
               {
                  "type":"Feature",
                  "properties":{
                     "RouterSegmentMetaData":{
                        "street":"улица Мневники",
                        "action":"right",
                        "Action":{
                           "value":"exit right",
                           "text":"съезд направо"
                        },
                        "angle":-13.6,
                        "length":335.88999999999999,
                        "humanLength":{
                           "unit":"meters",
                           "value":335
                        },
                        "Length":{
                           "value":335.88999999999999,
                           "text":"340 м"
                        },
                        "time":37.32,
                        "Time":{
                           "value":37.32,
                           "text":"1 мин"
                        },
                        "jamsTime":37.32,
                        "JamsTime":{
                           "value":37.32,
                           "text":"1 мин"
                        },
                        "text":"Съезд направо, улица Мневники"
                     },
                     "boundedBy":[
                        [
                           37.475397999999998,
                           55.771239000000001
                        ],
                        [
                           37.477204,
                           55.774070999999999
                        ]
                     ]
                  },
                  "geometry":{
                     "type":"GeometryCollection",
                     "geometries":[
                        {
                           "type":"LineString",
                           "lodIndex":102
                        }
                     ]
                  }
               },
               {
                  "type":"Feature",
                  "properties":{
                     "RouterSegmentMetaData":{
                        "street":"",
                        "action":"slight right",
                        "Action":{
                           "value":"slight right",
                           "text":"правее"
                        },
                        "angle":0.55000000000000004,
                        "length":166.74000000000001,
                        "humanLength":{
                           "unit":"meters",
                           "value":166
                        },
                        "Length":{
                           "value":166.74000000000001,
                           "text":"170 м"
                        },
                        "time":18.530000000000001,
                        "Time":{
                           "value":18.530000000000001,
                           "text":"1 мин"
                        },
                        "jamsTime":18.530000000000001,
                        "JamsTime":{
                           "value":18.530000000000001,
                           "text":"1 мин"
                        },
                        "text":"Правее"
                     },
                     "boundedBy":[
                        [
                           37.477204,
                           55.774070999999999
                        ],
                        [
                           37.479424000000002,
                           55.774531000000003
                        ]
                     ]
                  },
                  "geometry":{
                     "type":"GeometryCollection",
                     "geometries":[
                        {
                           "type":"LineString",
                           "lodIndex":105
                        }
                     ]
                  }
               },
               {
                  "type":"Feature",
                  "properties":{
                     "RouterSegmentMetaData":{
                        "street":"улица Мневники",
                        "action":"none",
                        "Action":{
                           "value":"none",
                           "text":"прямо"
                        },
                        "angle":-9.0600000000000005,
                        "length":1008.8200000000001,
                        "humanLength":{
                           "unit":"kilometers",
                           "value":1.01
                        },
                        "Length":{
                           "value":1008.8200000000001,
                           "text":"1 км"
                        },
                        "time":56.049999999999997,
                        "Time":{
                           "value":56.049999999999997,
                           "text":"1 мин"
                        },
                        "jamsTime":57.240000000000002,
                        "JamsTime":{
                           "value":57.240000000000002,
                           "text":"1 мин"
                        },
                        "text":"улица Мневники"
                     },
                     "boundedBy":[
                        [
                           37.479424000000002,
                           55.772069000000002
                        ],
                        [
                           37.494936000000003,
                           55.774441000000003
                        ]
                     ]
                  },
                  "geometry":{
                     "type":"GeometryCollection",
                     "geometries":[
                        {
                           "type":"LineString",
                           "lodIndex":111
                        }
                     ]
                  }
               },
               {
                  "type":"Feature",
                  "properties":{
                     "RouterSegmentMetaData":{
                        "street":"Звенигородское шоссе",
                        "action":"none",
                        "Action":{
                           "value":"none",
                           "text":"прямо"
                        },
                        "angle":-2.2400000000000002,
                        "length":2901.27,
                        "humanLength":{
                           "unit":"kilometers",
                           "value":2.8999999999999999
                        },
                        "Length":{
                           "value":2901.27,
                           "text":"2,9 км"
                        },
                        "time":161.18000000000001,
                        "Time":{
                           "value":161.18000000000001,
                           "text":"3 мин"
                        },
                        "jamsTime":162.96000000000001,
                        "JamsTime":{
                           "value":162.96000000000001,
                           "text":"3 мин"
                        },
                        "text":"Звенигородское шоссе"
                     },
                     "boundedBy":[
                        [
                           37.494936000000003,
                           55.765912
                        ],
                        [
                           37.539831,
                           55.772069000000002
                        ]
                     ]
                  },
                  "geometry":{
                     "type":"GeometryCollection",
                     "geometries":[
                        {
                           "type":"LineString",
                           "lodIndex":116
                        }
                     ]
                  }
               },
               {
                  "type":"Feature",
                  "properties":{
                     "RouterSegmentMetaData":{
                        "street":"ТТК",
                        "action":"right",
                        "Action":{
                           "value":"exit right",
                           "text":"съезд направо"
                        },
                        "angle":-4.9000000000000004,
                        "length":309.81999999999999,
                        "humanLength":{
                           "unit":"meters",
                           "value":309
                        },
                        "Length":{
                           "value":309.81999999999999,
                           "text":"310 м"
                        },
                        "time":28.170000000000002,
                        "Time":{
                           "value":28.170000000000002,
                           "text":"1 мин"
                        },
                        "jamsTime":61.729999999999997,
                        "JamsTime":{
                           "value":61.729999999999997,
                           "text":"1 мин"
                        },
                        "text":"Съезд направо, ТТК"
                     },
                     "boundedBy":[
                        [
                           37.537635999999999,
                           55.765481000000001
                        ],
                        [
                           37.540832000000002,
                           55.766184000000003
                        ]
                     ]
                  },
                  "geometry":{
                     "type":"GeometryCollection",
                     "geometries":[
                        {
                           "type":"LineString",
                           "lodIndex":123
                        }
                     ]
                  }
               },
               {
                  "type":"Feature",
                  "properties":{
                     "RouterSegmentMetaData":{
                        "street":"ТТК",
                        "action":"none",
                        "Action":{
                           "value":"none",
                           "text":"прямо"
                        },
                        "angle":-36.240000000000002,
                        "length":11236.27,
                        "humanLength":{
                           "unit":"kilometers",
                           "value":11.24
                        },
                        "Length":{
                           "value":11236.27,
                           "text":"11 км"
                        },
                        "time":591.38,
                        "Time":{
                           "value":591.38,
                           "text":"10 мин"
                        },
                        "jamsTime":1320.0599999999999,
                        "JamsTime":{
                           "value":1320.0599999999999,
                           "text":"22 мин"
                        },
                        "text":"ТТК"
                     },
                     "boundedBy":[
                        [
                           37.537635999999999,
                           55.766184000000003
                        ],
                        [
                           37.680095000000001,
                           55.793711000000002
                        ]
                     ]
                  },
                  "geometry":{
                     "type":"GeometryCollection",
                     "geometries":[
                        {
                           "type":"LineString",
                           "lodIndex":134
                        }
                     ]
                  }
               },
               {
                  "type":"Feature",
                  "properties":{
                     "RouterSegmentMetaData":{
                        "street":"Спартаковская площадь",
                        "action":"slight right",
                        "Action":{
                           "value":"slight right",
                           "text":"правее"
                        },
                        "angle":-13.890000000000001,
                        "length":353.38,
                        "humanLength":{
                           "unit":"meters",
                           "value":353
                        },
                        "Length":{
                           "value":353.38,
                           "text":"350 м"
                        },
                        "time":44.170000000000002,
                        "Time":{
                           "value":44.170000000000002,
                           "text":"1 мин"
                        },
                        "jamsTime":74.159999999999997,
                        "JamsTime":{
                           "value":74.159999999999997,
                           "text":"1 мин"
                        },
                        "text":"Правее, Спартаковская площадь"
                     },
                     "boundedBy":[
                        [
                           37.680095000000001,
                           55.774662999999997
                        ],
                        [
                           37.683644999999999,
                           55.777115000000002
                        ]
                     ]
                  },
                  "geometry":{
                     "type":"GeometryCollection",
                     "geometries":[
                        {
                           "type":"LineString",
                           "lodIndex":230
                        }
                     ]
                  }
               },
               {
                  "type":"Feature",
                  "properties":{
                     "RouterSegmentMetaData":{
                        "street":"Бакунинская улица",
                        "action":"left",
                        "Action":{
                           "value":"left",
                           "text":"налево"
                        },
                        "angle":77.930000000000007,
                        "length":1210.03,
                        "humanLength":{
                           "unit":"kilometers",
                           "value":1.21
                        },
                        "Length":{
                           "value":1210.03,
                           "text":"1,2 км"
                        },
                        "time":191.25,
                        "Time":{
                           "value":191.25,
                           "text":"3 мин"
                        },
                        "jamsTime":247.12,
                        "JamsTime":{
                           "value":247.12,
                           "text":"4 мин"
                        },
                        "text":"Налево, Бакунинская улица"
                     },
                     "boundedBy":[
                        [
                           37.683644999999999,
                           55.774662999999997
                        ],
                        [
                           37.696886999999997,
                           55.782370999999998
                        ]
                     ]
                  },
                  "geometry":{
                     "type":"GeometryCollection",
                     "geometries":[
                        {
                           "type":"LineString",
                           "lodIndex":234
                        }
                     ]
                  }
               },
               {
                  "type":"Feature",
                  "properties":{
                     "RouterSegmentMetaData":{
                        "street":"Электрозаводский мост",
                        "action":"right",
                        "Action":{
                           "value":"right",
                           "text":"направо"
                        },
                        "angle":-13.17,
                        "length":32.899999999999999,
                        "humanLength":{
                           "unit":"meters",
                           "value":32
                        },
                        "Length":{
                           "value":32.899999999999999,
                           "text":"32 м"
                        },
                        "time":25.48,
                        "Time":{
                           "value":25.48,
                           "text":"1 мин"
                        },
                        "jamsTime":25.48,
                        "JamsTime":{
                           "value":25.48,
                           "text":"1 мин"
                        },
                        "text":"Направо, Электрозаводский мост"
                     },
                     "boundedBy":[
                        [
                           37.696886999999997,
                           55.782370999999998
                        ],
                        [
                           37.697237999999999,
                           55.782584
                        ]
                     ]
                  },
                  "geometry":{
                     "type":"GeometryCollection",
                     "geometries":[
                        {
                           "type":"LineString",
                           "lodIndex":251
                        }
                     ]
                  }
               },
               {
                  "type":"Feature",
                  "properties":{
                     "RouterSegmentMetaData":{
                        "street":"Электрозаводский мост",
                        "action":"none",
                        "Action":{
                           "value":"none",
                           "text":"прямо"
                        },
                        "angle":-29.719999999999999,
                        "length":263.86000000000001,
                        "humanLength":{
                           "unit":"meters",
                           "value":263
                        },
                        "Length":{
                           "value":263.86000000000001,
                           "text":"260 м"
                        },
                        "time":21.989999999999998,
                        "Time":{
                           "value":21.989999999999998,
                           "text":"1 мин"
                        },
                        "jamsTime":51.039999999999999,
                        "JamsTime":{
                           "value":51.039999999999999,
                           "text":"1 мин"
                        },
                        "text":"Электрозаводский мост"
                     },
                     "boundedBy":[
                        [
                           37.697237999999999,
                           55.782584
                        ],
                        [
                           37.701439000000001,
                           55.782682000000001
                        ]
                     ]
                  },
                  "geometry":{
                     "type":"GeometryCollection",
                     "geometries":[
                        {
                           "type":"LineString",
                           "lodIndex":254
                        }
                     ]
                  }
               },
               {
                  "type":"Feature",
                  "properties":{
                     "RouterSegmentMetaData":{
                        "street":"Большая Семеновская улица",
                        "action":"none",
                        "Action":{
                           "value":"none",
                           "text":"прямо"
                        },
                        "angle":0.01,
                        "length":1094.8900000000001,
                        "humanLength":{
                           "unit":"kilometers",
                           "value":1.0900000000000001
                        },
                        "Length":{
                           "value":1094.8900000000001,
                           "text":"1,1 км"
                        },
                        "time":136.86000000000001,
                        "Time":{
                           "value":136.86000000000001,
                           "text":"2 мин"
                        },
                        "jamsTime":253.30000000000001,
                        "JamsTime":{
                           "value":253.30000000000001,
                           "text":"4 мин"
                        },
                        "text":"Большая Семеновская улица"
                     },
                     "boundedBy":[
                        [
                           37.701439000000001,
                           55.780197000000001
                        ],
                        [
                           37.718057999999999,
                           55.782736
                        ]
                     ]
                  },
                  "geometry":{
                     "type":"GeometryCollection",
                     "geometries":[
                        {
                           "type":"LineString",
                           "lodIndex":255
                        }
                     ]
                  }
               },
               {
                  "type":"Feature",
                  "properties":{
                     "RouterSegmentMetaData":{
                        "street":"Измайловское шоссе",
                        "action":"none",
                        "Action":{
                           "value":"none",
                           "text":"прямо"
                        },
                        "angle":5.29,
                        "length":199.61000000000001,
                        "humanLength":{
                           "unit":"meters",
                           "value":199
                        },
                        "Length":{
                           "value":199.61000000000001,
                           "text":"200 м"
                        },
                        "time":24.949999999999999,
                        "Time":{
                           "value":24.949999999999999,
                           "text":"1 мин"
                        },
                        "jamsTime":35.060000000000002,
                        "JamsTime":{
                           "value":35.060000000000002,
                           "text":"1 мин"
                        },
                        "text":"Измайловское шоссе"
                     },
                     "boundedBy":[
                        [
                           37.718057999999999,
                           55.779699000000001
                        ],
                        [
                           37.721086,
                           55.780197000000001
                        ]
                     ]
                  },
                  "geometry":{
                     "type":"GeometryCollection",
                     "geometries":[
                        {
                           "type":"LineString",
                           "lodIndex":266
                        }
                     ]
                  }
               },
               {
                  "type":"Feature",
                  "properties":{
                     "RouterSegmentMetaData":{
                        "street":"Вельяминовская улица",
                        "action":"left",
                        "Action":{
                           "value":"left",
                           "text":"налево"
                        },
                        "angle":81.980000000000004,
                        "length":652.91999999999996,
                        "humanLength":{
                           "unit":"meters",
                           "value":652
                        },
                        "Length":{
                           "value":652.91999999999996,
                           "text":"650 м"
                        },
                        "time":121.62,
                        "Time":{
                           "value":121.62,
                           "text":"2 мин"
                        },
                        "jamsTime":376.05000000000001,
                        "JamsTime":{
                           "value":376.05000000000001,
                           "text":"6 мин"
                        },
                        "text":"Налево, Вельяминовская улица"
                     },
                     "boundedBy":[
                        [
                           37.721086,
                           55.779699000000001
                        ],
                        [
                           37.722509000000002,
                           55.785404999999997
                        ]
                     ]
                  },
                  "geometry":{
                     "type":"GeometryCollection",
                     "geometries":[
                        {
                           "type":"LineString",
                           "lodIndex":270
                        }
                     ]
                  }
               },
               {
                  "type":"Feature",
                  "properties":{
                     "RouterSegmentMetaData":{
                        "street":"Ткацкая улица",
                        "action":"right",
                        "Action":{
                           "value":"right",
                           "text":"направо"
                        },
                        "angle":-74.629999999999995,
                        "length":1495.9000000000001,
                        "humanLength":{
                           "unit":"kilometers",
                           "value":1.5
                        },
                        "Length":{
                           "value":1495.9000000000001,
                           "text":"1,5 км"
                        },
                        "time":206.99000000000001,
                        "Time":{
                           "value":206.99000000000001,
                           "text":"3 мин"
                        },
                        "jamsTime":246.53,
                        "JamsTime":{
                           "value":246.53,
                           "text":"4 мин"
                        },
                        "text":"Направо, Ткацкая улица"
                     },
                     "boundedBy":[
                        [
                           37.722132000000002,
                           55.785404999999997
                        ],
                        [
                           37.745595000000002,
                           55.787103999999999
                        ]
                     ]
                  },
                  "geometry":{
                     "type":"GeometryCollection",
                     "geometries":[
                        {
                           "type":"LineString",
                           "lodIndex":275
                        }
                     ]
                  }
               },
               {
                  "type":"Feature",
                  "properties":{
                     "RouterSegmentMetaData":{
                        "street":"Измайловское шоссе",
                        "action":"none",
                        "Action":{
                           "value":"none",
                           "text":"прямо"
                        },
                        "angle":42.899999999999999,
                        "length":1071.8299999999999,
                        "humanLength":{
                           "unit":"kilometers",
                           "value":1.0700000000000001
                        },
                        "Length":{
                           "value":1071.8299999999999,
                           "text":"1,1 км"
                        },
                        "time":133.97999999999999,
                        "Time":{
                           "value":133.97999999999999,
                           "text":"2 мин"
                        },
                        "jamsTime":179.05000000000001,
                        "JamsTime":{
                           "value":179.05000000000001,
                           "text":"3 мин"
                        },
                        "text":"Измайловское шоссе"
                     },
                     "boundedBy":[
                        [
                           37.745595000000002,
                           55.787103999999999
                        ],
                        [
                           37.762219000000002,
                           55.788389000000002
                        ]
                     ]
                  },
                  "geometry":{
                     "type":"GeometryCollection",
                     "geometries":[
                        {
                           "type":"LineString",
                           "lodIndex":283
                        }
                     ]
                  }
               },
               {
                  "type":"Feature",
                  "properties":{
                     "RouterSegmentMetaData":{
                        "street":"Первомайская улица",
                        "action":"none",
                        "Action":{
                           "value":"none",
                           "text":"прямо"
                        },
                        "angle":2.3500000000000001,
                        "length":2021.73,
                        "humanLength":{
                           "unit":"kilometers",
                           "value":2.02
                        },
                        "Length":{
                           "value":2021.73,
                           "text":"2 км"
                        },
                        "time":336.95999999999998,
                        "Time":{
                           "value":336.95999999999998,
                           "text":"6 мин"
                        },
                        "jamsTime":399.49000000000001,
                        "JamsTime":{
                           "value":399.49000000000001,
                           "text":"7 мин"
                        },
                        "text":"Первомайская улица"
                     },
                     "boundedBy":[
                        [
                           37.762219000000002,
                           55.788389000000002
                        ],
                        [
                           37.792788999999999,
                           55.793180999999997
                        ]
                     ]
                  },
                  "geometry":{
                     "type":"GeometryCollection",
                     "geometries":[
                        {
                           "type":"LineString",
                           "lodIndex":290
                        }
                     ]
                  }
               }
            ]
         },
         {
            "type":"Feature",
            "properties":{
               "GeocoderMetaData":{
                  "kind":"street",
                  "text":"Россия, Москва, Первомайская улица",
                  "precision":"street",
                  "AddressDetails":{
                     "Country":{
                        "AddressLine":"Москва, Первомайская улица",
                        "CountryNameCode":"RU",
                        "CountryName":"Россия",
                        "AdministrativeArea":{
                           "AdministrativeAreaName":"Центральный федеральный округ",
                           "SubAdministrativeArea":{
                              "SubAdministrativeAreaName":"Москва",
                              "Locality":{
                                 "LocalityName":"Москва",
                                 "Thoroughfare":{
                                    "ThoroughfareName":"Первомайская улица"
                                 }
                              }
                           }
                        }
                     }
                  }
               },
               "boundedBy":[
                  [
                     37.762210000000003,
                     55.788387999999998
                  ],
                  [
                     37.823447999999999,
                     55.793616999999998
                  ]
               ]
            },
            "geometry":{
               "type":"Point",
               "coordinates":[
                  37.792788999999999,
                  55.793176000000003
               ]
            }
         }
      ]
   }
}


 */