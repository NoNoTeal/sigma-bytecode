public class \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\uf9c5\u759a\u8df4\u4f52\u839e\u927d {
    public void \uf9c5\u759a\u8df4\u4f52\u839e\u927d() {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            invokespecial:Object(Object::<init>, this:\uf9c5\u759a\u8df4\u4f52\u839e\u927d)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static void \u5f50\uc7fe\u071d\u416d\u8413\u8753(com.google.gson.JsonElement p0, \u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u836c\u67e9\u5d20\u5fe1\u7e3f.\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709 p1) {
        var_2_231 : int
        var_4_97 : JsonObject
        var_5_116 : JsonObject
        var_6_164 : String
        var_7_18E : JsonElement
        var_8_21A : JsonArray
        var_9_224 : Iterator
        var_10_273 : JsonElement
        var_5_2F1 : Iterator
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpeq:boolean(ldc:int(14), ldc:int(0))) {
            goto(Label_0006)
        }
        
        if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
            loop {
                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                
                if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                    loop {
                        Label_0028:
                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                        
                        if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                
                                if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                    loopcontinue(Label_0028)
                                }
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            looporswitchbreak(Label_0088)
                        }
                        
                        looporswitchbreak()
                    }
                }
            }
        }
        
        Label_0088:
        var_2_231 = and:int(ldc:int(1756913523), ldc:int(-1392904145))
        
        if (instanceof:boolean(com.google.gson.JsonObject.class, p0:JsonElement)) {
            var_4_97 = checkcast:JsonObject(com.google.gson.JsonObject.class, p0:JsonElement[expected:JsonObject])
            
            if (invokevirtual:boolean(JsonObject::has, var_4_97:JsonObject, loadelement:String(getstatic:String[](\uf9c5\u759a\u8df4\u4f52\u839e\u927d::\u0c95\ubff1\ube23\uc229\u7330\u6fb0), and:int(ldc:int(1686), ldc:int(-1687))))) {
                if (logicalnot:boolean(instanceof:boolean(com.google.gson.JsonObject.class, invokevirtual:JsonElement(JsonObject::get, var_4_97:JsonObject, loadelement:String(getstatic:String[](\uf9c5\u759a\u8df4\u4f52\u839e\u927d::\u0c95\ubff1\ube23\uc229\u7330\u6fb0), and:int(ldc:int(4692), ldc:int(-6743))))))) {
                    goto(Label_0211)
                }
                
                var_5_116 = checkcast:JsonObject(com.google.gson.JsonObject.class, invokevirtual:JsonElement[expected:JsonObject](JsonObject::get, var_4_97:JsonObject, loadelement:String(getstatic:String[](\uf9c5\u759a\u8df4\u4f52\u839e\u927d::\u0c95\ubff1\ube23\uc229\u7330\u6fb0), and:int(ldc:int(11113), ldc:int(-11264)))))
                
                if (invokevirtual:boolean(JsonObject::has, var_5_116:JsonObject, loadelement:String(getstatic:String[](\uf9c5\u759a\u8df4\u4f52\u839e\u927d::\u0c95\ubff1\ube23\uc229\u7330\u6fb0), and:int(ldc:int(97), ldc:int(10257))))) {
                    if (invokevirtual:boolean(JsonObject::has, var_5_116:JsonObject, loadelement:String(getstatic:String[](\uf9c5\u759a\u8df4\u4f52\u839e\u927d::\u0c95\ubff1\ube23\uc229\u7330\u6fb0), xor:int(ldc:int(20745), ldc:int(20747))))) {
                        var_6_164 = invokevirtual:String(JsonElement::getAsString, invokevirtual:JsonElement(JsonObject::get, var_5_116:JsonObject, loadelement:String(getstatic:String[](\uf9c5\u759a\u8df4\u4f52\u839e\u927d::\u0c95\ubff1\ube23\uc229\u7330\u6fb0), and:int(ldc:int(19457), ldc:int(907)))))
                        
                        if (logicalor:boolean(invokevirtual:boolean(String::equals, var_6_164:String, loadelement:String[expected:Object](getstatic:String[](\uf9c5\u759a\u8df4\u4f52\u839e\u927d::\u0c95\ubff1\ube23\uc229\u7330\u6fb0), xor:int(ldc:int(6242), ldc:int(6241)))), invokevirtual:boolean(String::equals, var_6_164:String, loadelement:String[expected:Object](getstatic:String[](\uf9c5\u759a\u8df4\u4f52\u839e\u927d::\u0c95\ubff1\ube23\uc229\u7330\u6fb0), xor:int(ldc:int(8225), ldc:int(8229)))))) {
                            var_2_231 = and:int(var_2_231:int, ldc:int(939473231))
                            var_7_18E = invokevirtual:JsonElement(JsonObject::get, var_5_116:JsonObject, loadelement:String(getstatic:String[](\uf9c5\u759a\u8df4\u4f52\u839e\u927d::\u0c95\ubff1\ube23\uc229\u7330\u6fb0), xor:int(ldc:int(4228), ldc:int(4230))))
                            
                            if (logicaland:boolean(invokevirtual:boolean(JsonElement::isJsonPrimitive, var_7_18E:JsonElement), invokevirtual:boolean(JsonPrimitive::isString, invokevirtual:JsonPrimitive(JsonElement::getAsJsonPrimitive, var_7_18E:JsonElement)))) {
                                invokevirtual:void(JsonObject::addProperty, var_5_116:JsonObject, loadelement:String(getstatic:String[](\uf9c5\u759a\u8df4\u4f52\u839e\u927d::\u0c95\ubff1\ube23\uc229\u7330\u6fb0), and:int(ldc:int(4102), ldc:int(17475))), invokevirtual:String(Matcher::replaceAll, invokevirtual:Matcher(Pattern::matcher, getstatic:Pattern(\uf9c5\u759a\u8df4\u4f52\u839e\u927d::\ucb79\u72f1\u97e6\u8350\u8df4\u52d3), invokevirtual:String(JsonElement::getAsString, var_7_18E:JsonElement)), loadelement:String(getstatic:String[](\uf9c5\u759a\u8df4\u4f52\u839e\u927d::\u0c95\ubff1\ube23\uc229\u7330\u6fb0), and:int(ldc:int(20525), ldc:int(1541)))))
                            }
                            else {
                                var_2_231 = and:int(var_2_231:int, ldc:int(-131489849))
                                
                                if (invokevirtual:boolean(JsonElement::isJsonArray, var_7_18E:JsonElement)) {
                                    var_8_21A = initobject:JsonArray(JsonArray::<init>)
                                    var_9_224 = invokevirtual:Iterator(JsonArray::iterator, invokevirtual:JsonArray(JsonElement::getAsJsonArray, var_7_18E:JsonElement))
                                    
                                    loop {
                                        if (cmpeq:boolean(and:int(var_2_231:int, ldc:int(262144)), ldc:int(0))) {
                                            var_2_231 = and:int(var_2_231:int, ldc:int(-395978169))
                                            
                                            if (invokeinterface:boolean(Iterator::hasNext, var_9_224:Iterator)) {
                                                var_10_273 = checkcast:JsonElement(com.google.gson.JsonElement.class, invokeinterface:JsonElement(Iterator<JsonElement>::next, var_9_224:Iterator<JsonElement>))
                                                
                                                if (invokevirtual:boolean(JsonElement::isJsonPrimitive, var_10_273:JsonElement)) {
                                                    if (invokevirtual:boolean(JsonPrimitive::isString, invokevirtual:JsonPrimitive(JsonElement::getAsJsonPrimitive, var_10_273:JsonElement))) {
                                                        invokevirtual:void(JsonArray::add, var_8_21A:JsonArray, initobject:JsonPrimitive(JsonPrimitive::<init>, invokevirtual:String(Matcher::replaceAll, invokevirtual:Matcher(Pattern::matcher, getstatic:Pattern(\uf9c5\u759a\u8df4\u4f52\u839e\u927d::\ucb79\u72f1\u97e6\u8350\u8df4\u52d3), invokevirtual:String(JsonElement::getAsString, var_10_273:JsonElement)), loadelement:String(getstatic:String[](\uf9c5\u759a\u8df4\u4f52\u839e\u927d::\u0c95\ubff1\ube23\uc229\u7330\u6fb0), and:int(ldc:int(5), ldc:int(3213))))))
                                                    }
                                                }
                                                
                                                var_2_231 = and:int(var_2_231:int, ldc:int(1916320927))
                                                loopcontinue()
                                            }
                                        }
                                        
                                        if (cmpeq:boolean(and:int(var_2_231:int, ldc:int(131072)), ldc:int(0))) {
                                            looporswitchbreak()
                                        }
                                        
                                        var_2_231 = and:int(var_2_231:int, ldc:int(-580949237))
                                    }
                                    
                                    var_2_231 = and:int(var_2_231:int, ldc:int(-345089729))
                                    invokevirtual:void(JsonObject::add, var_5_116:JsonObject, loadelement:String(getstatic:String[](\uf9c5\u759a\u8df4\u4f52\u839e\u927d::\u0c95\ubff1\ube23\uc229\u7330\u6fb0), and:int(ldc:int(19522), ldc:int(258))), var_8_21A:JsonElement)
                                }
                            }
                        }
                    }
                }
                
                var_2_231 = and:int(var_2_231:int, ldc:int(908564619))
                goto(Label_0211)
            }
            
            Label_0172:
            
            if (cmpne:boolean(and:int(var_2_231:int, ldc:int(8192)), ldc:int(0))) {
                var_2_231 = and:int(var_2_231:int, ldc:int(222316524))
            }
            else {
                var_2_231 = and:int(var_2_231:int, ldc:int(1810479199))
                
                if (invokevirtual:boolean(JsonObject::has, var_4_97:JsonObject, loadelement:String(getstatic:String[](\uf9c5\u759a\u8df4\u4f52\u839e\u927d::\u0c95\ubff1\ube23\uc229\u7330\u6fb0), and:int(ldc:int(18062), ldc:int(103))))) {
                    invokestatic:void(\uf9c5\u759a\u8df4\u4f52\u839e\u927d::\u5f50\uc7fe\u071d\u416d\u8413\u8753, invokevirtual:JsonElement(JsonObject::get, var_4_97:JsonObject, loadelement:String(getstatic:String[](\uf9c5\u759a\u8df4\u4f52\u839e\u927d::\u0c95\ubff1\ube23\uc229\u7330\u6fb0), and:int(ldc:int(16526), ldc:int(5127)))), p1:\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709)
                }
            }
            
            Label_0211:
            
            if (cmpne:boolean(and:int(var_2_231:int, ldc:int(536870912)), ldc:int(0))) {
                var_2_231 = and:int(var_2_231:int, ldc:int(614996215))
                goto(Label_0130)
            }
            
            goto(Label_0172)
        }
        
        Label_0103:
        
        if (cmpeq:boolean(and:int(var_2_231:int, ldc:int(536870912)), ldc:int(0))) {
            var_2_231 = and:int(var_2_231:int, ldc:int(1515474009))
        }
        else {
            var_2_231 = and:int(var_2_231:int, ldc:int(1031747675))
            
            if (instanceof:boolean(com.google.gson.JsonArray.class, p0:JsonElement)) {
                var_5_2F1 = invokevirtual:Iterator(JsonArray::iterator, checkcast:JsonArray(com.google.gson.JsonArray.class, p0:JsonElement[expected:JsonArray]))
                
                loop {
                    var_2_231 = and:int(var_2_231:int, ldc:int(1794096991))
                    
                    if (logicalnot:boolean(invokeinterface:boolean(Iterator::hasNext, var_5_2F1:Iterator))) {
                        looporswitchbreak()
                    }
                    
                    invokestatic:void(\uf9c5\u759a\u8df4\u4f52\u839e\u927d::\u5f50\uc7fe\u071d\u416d\u8413\u8753, checkcast:JsonElement(com.google.gson.JsonElement.class, invokeinterface:JsonElement(Iterator<JsonElement>::next, var_5_2F1:Iterator<JsonElement>)), p1:\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709)
                }
            }
        }
        
        Label_0130:
        
        if (cmpne:boolean(and:int(var_2_231:int, ldc:int(2)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0103)
    }
    
    static {
        var_0_245 : int
        expr_6B : int [generated]
        stack_9C_0 : byte[] [generated]
        stack_9E_0 : byte[] [generated]
        stack_BF_0 : byte[] [generated]
        stack_C1_0 : byte[] [generated]
        stack_FC_0 : byte[] [generated]
        stack_FE_0 : byte[] [generated]
        stack_11E_0 : byte[] [generated]
        stack_257_0 : byte[] [generated]
        stack_2A6_0 : byte[] [generated]
        stack_31B_0 : byte[] [generated]
        stack_370_0 : byte[] [generated]
        var_4_232 : int
        var_3_237 : byte[]
        var_5_238 : int
        var_0_29C : int
        expr_2A6 : byte [generated]
        stack_2EA_2 : byte [generated]
        stack_2C9_0 : byte [generated]
        expr_9E : int [generated]
        var_2_BF : byte[]
        expr_C3 : int [generated]
        var_3_30A : byte[]
        var_5_30B : int
        expr_FE : int [generated]
        var_3_35F : byte[]
        var_5_360 : int
        expr_370 : byte [generated]
        var_3_12A : String
        expr_132 : String[] [generated]
        expr_13C : String[] [generated]
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpeq:boolean(ldc:int(14), ldc:int(0))) {
            goto(Label_0006)
        }
        
        if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
            loop {
                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                
                if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                    loop {
                        Label_0028:
                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                        
                        if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                
                                if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                    loopcontinue(Label_0028)
                                }
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            looporswitchbreak(Label_0088)
                        }
                        
                        looporswitchbreak()
                    }
                }
            }
        }
        
        Label_0088:
        var_0_245 = and:int(ldc:int(-699019721), ldc:int(-134550297))
        expr_6B = arraylength:int(stack_9C_0 = stack_9E_0 = stack_BF_0 = stack_C1_0 = stack_FC_0 = stack_FE_0 = stack_11E_0 = stack_257_0 = stack_2A6_0 = stack_31B_0 = stack_370_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("lKYGRoYv79QuHr/mD3iN7UYlFWWfxz2Wh5XWFh6G9he95Z+mvQevrwUG55319Z933i+npm2WbQ5GJ3UE1RS0ZHZulk6GRsYmjpZ3JmZWng51zgYPDj62xi49Jsa+pj8WDi4mHv3+jhYBO5PrM7OQ")))
        
        if (cmpeq:boolean(expr_6B:int, ldc:int(0))) {
            goto(Label_0112)
        }
        
        var_4_232 = expr_6B:int
        var_3_237 = newarray:byte[](byte.class, expr_6B:int)
        var_5_238 = expr_6B:int
        Label_0570:
        
        while (cmpne:boolean(and:int(var_0_245:int, ldc:int(4194304)), ldc:int(0))) {
            var_0_245 = and:int(var_0_245:int, ldc:int(2136258252))
            var_5_238 = add:int(var_5_238:int, ldc:int(-1))
            storeelement:byte(var_3_237:byte[], var_5_238:int, xor:byte(add:byte(loadelement:byte(stack_257_0:byte[], var_5_238:int), ldc:byte(46)), ldc:byte(68)))
            
            if (cmpne:boolean(var_5_238:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9E_0 = stack_9C_0 = stack_BF_0 = stack_C1_0 = stack_FC_0 = stack_FE_0 = stack_11E_0 = stack_257_0 = stack_2A6_0 = stack_31B_0 = stack_370_0 = var_3_237:byte[]
            goto(Label_0112)
        }
        
        var_0_245 = and:int(var_0_245:int, ldc:int(-1984255210))
        Label_0649:
        
        while (cmpne:boolean(and:int(var_0_245:int, ldc:int(1024)), ldc:int(0))) {
            var_0_29C = and:int(var_0_245:int, ldc:int(2004541405))
            var_5_238 = add:int(var_5_238:int, ldc:int(-1))
            expr_2A6 = stack_2EA_2 = loadelement(stack_2A6_0, var_5_238)
            
            if (cmplt:boolean(add:int(add:int(var_5_238:int, ldc:int(6)), neg:int(var_4_232:int)), ldc:int(0))) {
                stack_2EA_2 = stack_2C9_0 = add:byte(expr_2A6:byte, loadelement:byte(var_3_237:byte[], add:int(var_5_238:int, ldc:int(6))))
                goto(Label_0729)
            }
            
            Label_0691:
            
            if (cmpeq:boolean(and:int(var_0_29C:int, ldc:int(1048576)), ldc:int(0))) {
                var_0_29C = and:int(var_0_29C:int, ldc:int(-811152784))
            }
            else {
                var_0_29C = and:int(var_0_29C:int, ldc:int(-688093316))
                stack_2EA_2 = stack_2C9_0 = add:byte(expr_2A6:byte, ldc:byte(6))
            }
            
            Label_0729:
            
            if (cmpne:boolean(and:int(var_0_29C:int, ldc:int(128)), ldc:int(0))) {
                goto(Label_0691)
            }
            
            var_0_245 = and:int(var_0_29C:int, ldc:int(-332419))
            storeelement:byte(var_3_237:byte[], var_5_238:int, stack_2EA_2:byte)
            
            if (cmpne:boolean(var_5_238:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9E_0 = stack_9C_0 = stack_BF_0 = stack_C1_0 = stack_FC_0 = stack_FE_0 = stack_11E_0 = stack_257_0 = stack_2A6_0 = stack_31B_0 = stack_370_0 = var_3_237:byte[]
            goto(Label_0163)
        }
        
        var_0_245 = and:int(var_0_245:int, ldc:int(1273266051))
        goto(Label_0570)
        Label_0112:
        
        if (cmpne:boolean(and:int(var_0_245:int, ldc:int(4096)), ldc:int(0))) {
            goto(Label_0259)
        }
        
        if (cmpeq:boolean(and:int(var_0_245:int, ldc:int(1024)), ldc:int(0))) {
            var_0_245 = and:int(var_0_245:int, ldc:int(281582097))
            goto(Label_0200)
        }
        
        if (cmpeq:boolean(and:int(var_0_245:int, ldc:int(2147483647)), ldc:int(0))) {
            var_0_245 = and:int(var_0_245:int, ldc:int(1854849489))
        }
        else {
            var_0_245 = and:int(var_0_245:int, ldc:int(-153437035))
            expr_9E = arraylength:int(stack_9E_0:byte[])
            
            if (cmpne:boolean(expr_9E:int, ldc:int(0))) {
                var_4_232 = expr_9E:int
                var_3_237 = newarray:byte[](byte.class, expr_9E:int)
                var_5_238 = expr_9E:int
                goto(Label_0649)
            }
        }
        
        Label_0163:
        
        if (cmpeq:boolean(and:int(var_0_245:int, ldc:int(4194304)), ldc:int(0))) {
            goto(Label_0259)
        }
        
        if (cmpne:boolean(and:int(var_0_245:int, ldc:int(2147483647)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_245:int, ldc:int(67108864)), ldc:int(0))) {
                goto(Label_0112)
            }
            
            var_0_245 = and:int(var_0_245:int, ldc:int(-142618972))
            var_2_BF = stack_BF_0:byte[]
            expr_C3 = add:int(arraylength:int(stack_C1_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_C3:int, ldc:int(0))) {
                var_3_30A = newarray:byte[](byte.class, expr_C3:int)
                var_5_30B = expr_C3:int
                
                loop {
                    var_0_245 = and:int(var_0_245:int, ldc:int(-562897465))
                    var_5_30B = add:int(var_5_30B:int, ldc:int(-1))
                    storeelement:byte(var_3_30A:byte[], var_5_30B:int, add:int(shl:int(loadelement:byte(stack_31B_0:byte[], var_5_30B:int), ldc:int(1)), and:int(shr:int(loadelement:byte(var_2_BF:byte[], add:int(var_5_30B:int, and:int(ldc:int(2565), ldc:int(4227)))), ldc:int(7)), and:int(ldc:int(543), ldc:int(13729)))))
                    
                    if (cmpne:boolean(var_5_30B:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_9E_0 = stack_9C_0 = stack_BF_0 = stack_C1_0 = stack_FC_0 = stack_FE_0 = stack_11E_0 = stack_257_0 = stack_2A6_0 = stack_31B_0 = stack_370_0 = var_3_30A:byte[]
            }
        }
        
        Label_0200:
        
        if (cmpne:boolean(and:int(var_0_245:int, ldc:int(134217728)), ldc:int(0))) {
            var_0_245 = and:int(var_0_245:int, ldc:int(-794253922))
        }
        else {
            if (cmpeq:boolean(and:int(var_0_245:int, ldc:int(1024)), ldc:int(0))) {
                var_0_245 = and:int(var_0_245:int, ldc:int(-386869464))
                goto(Label_0163)
            }
            
            if (cmpeq:boolean(and:int(var_0_245:int, ldc:int(4194304)), ldc:int(0))) {
                var_0_245 = and:int(var_0_245:int, ldc:int(-1926517690))
                goto(Label_0112)
            }
            
            var_0_245 = and:int(var_0_245:int, ldc:int(1457425852))
            expr_FE = arraylength:int(stack_FE_0:byte[])
            
            if (cmpne:boolean(expr_FE:int, ldc:int(0))) {
                var_3_35F = newarray:byte[](byte.class, expr_FE:int)
                var_5_360 = expr_FE:int
                
                loop {
                    var_0_245 = and:int(var_0_245:int, ldc:int(2138105652))
                    var_5_360 = add:int(var_5_360:int, ldc:int(-1))
                    expr_370 = loadelement:byte(stack_370_0:byte[], var_5_360:int)
                    storeelement:byte(var_3_35F:byte[], var_5_360:int, or:int(and:int(shl:int(expr_370:byte, xor:int(ldc:int(5376), ldc:int(5380))), ldc:int(-16)), and:int(shr:int(expr_370:byte[expected:int], xor:int(ldc:int(-32631), ldc:int(-32627))), ldc:int(15))))
                    
                    if (cmpne:boolean(var_5_360:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_9E_0 = stack_9C_0 = stack_BF_0 = stack_C1_0 = stack_FC_0 = stack_FE_0 = stack_11E_0 = stack_257_0 = stack_2A6_0 = stack_31B_0 = stack_370_0 = var_3_35F:byte[]
            }
        }
        
        Label_0259:
        
        if (cmpeq:boolean(and:int(var_0_245:int, ldc:int(1073741824)), ldc:int(0))) {
            goto(Label_0200)
        }
        
        if (cmpeq:boolean(and:int(var_0_245:int, ldc:int(1048576)), ldc:int(0))) {
            goto(Label_0163)
        }
        
        if (cmpne:boolean(and:int(var_0_245:int, ldc:int(4194304)), ldc:int(0))) {
            var_3_12A = initobject:String(String::<init>, stack_11E_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            expr_132 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(49), ldc:int(57)))
            expr_13C = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(4360), ldc:int(17609)))
            storeelement:String(expr_13C:String[], and:int(ldc:int(6151), ldc:int(9733)), invokevirtual:String[expected:String](String::substring, var_3_12A:String, and:int(ldc:int(29132), ldc:int(-29133)), and:int(ldc:int(-14055), ldc:int(9892))))
            storeelement:String(expr_132:String[], xor:int(ldc:int(5160), ldc:int(5167)), invokevirtual:String[expected:String](String::substring, var_3_12A:String, and:int(ldc:int(-31682), ldc:int(23233)), and:int(ldc:int(82), ldc:int(18664))))
            storeelement:String(expr_13C:String[], xor:int(ldc:int(708), ldc:int(709)), invokevirtual:String[expected:String](String::substring, var_3_12A:String, and:int(ldc:int(8387), ldc:int(20820)), and:int(ldc:int(70), ldc:int(2118))))
            storeelement:String(expr_13C:String[], xor:int(ldc:int(10242), ldc:int(10244)), invokevirtual:String[expected:String](String::substring, var_3_12A:String, xor:int(ldc:int(-28558), ldc:int(-28620)), xor:int(ldc:int(386), ldc:int(457))))
            storeelement:String(expr_13C:String[], and:int(ldc:int(-13280), ldc:int(8526)), invokevirtual:String[expected:String](String::substring, var_3_12A:String, xor:int(ldc:int(162), ldc:int(233)), xor:int(ldc:int(4167), ldc:int(4114))))
            storeelement:String(expr_13C:String[], and:int(ldc:int(1852), ldc:int(18564)), invokevirtual:String[expected:String](String::substring, var_3_12A:String, and:int(ldc:int(12413), ldc:int(2135)), xor:int(ldc:int(17673), ldc:int(17769))))
            storeelement:String(expr_13C:String[], xor:int(ldc:int(8257), ldc:int(8258)), invokevirtual:String[expected:String](String::substring, var_3_12A:String, xor:int(ldc:int(-16298), ldc:int(-16330)), xor:int(ldc:int(-24226), ldc:int(-24265))))
            storeelement:String(expr_13C:String[], and:int(ldc:int(18), ldc:int(17538)), invokevirtual:String[expected:String](String::substring, var_3_12A:String, xor:int(ldc:int(21640), ldc:int(21729)), xor:int(ldc:int(1644), ldc:int(1538))))
            putstatic:String[](\uf9c5\u759a\u8df4\u4f52\u839e\u927d::\u0c95\ubff1\ube23\uc229\u7330\u6fb0, expr_13C:String[])
            putstatic:Pattern(\uf9c5\u759a\u8df4\u4f52\u839e\u927d::\ucb79\u72f1\u97e6\u8350\u8df4\u52d3, invokestatic:Pattern(Pattern::compile, loadelement:String(expr_132:String[], and:int(ldc:int(55), ldc:int(9359)))))
            return:void()
        }
        
        goto(Label_0112)
    }
    
    public void \u7e3f\ubf56\u7c6b\u760c\u873d\ub7dc(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_6BC : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C3 : double
        var_3_D5 : int
        var_11_E6 : int
        var_14_110 : double
        var_16_114 : int
        var_12_10C : double
        var_17_6C7 : int
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpeq:boolean(ldc:int(14), ldc:int(0))) {
            goto(Label_0006)
        }
        
        if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
            loop {
                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                
                if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                    loop {
                        Label_0028:
                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                        
                        if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                
                                if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                    loopcontinue(Label_0028)
                                }
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            looporswitchbreak(Label_0088)
                        }
                        
                        looporswitchbreak()
                    }
                }
            }
        }
        
        Label_0088:
        var_3_6BC = and:int(ldc:int(1321773954), ldc:int(1458069415))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\uf9c5\u759a\u8df4\u4f52\u839e\u927d[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_6BC:int, ldc:int(8)), ldc:int(0))) {
            var_3_6BC = and:int(var_3_6BC:int, ldc:int(1372119553))
        }
        else {
            var_3_6BC = and:int(var_3_6BC:int, ldc:int(2128371524))
            var_5_85 = and:int(ldc:int(9618), ldc:int(-16284))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-5567), ldc:int(5310)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C3 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D5 = and:int(var_3_6BC:int, ldc:int(-673244277))
                    var_9_C3 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E6 = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E6:int, sub:int(var_6_8C:int, xor:int(ldc:int(3), ldc:int(2)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E6:int, and:int(ldc:int(17413), ldc:int(6161)))), var_7_9B:double))) {
                        inc:int(var_11_E6, ldc:int(1))
                    }
                    
                    var_3_6BC = and:int(var_3_D5:int, ldc:int(1454267769))
                    var_14_110 = var_7_9B:double
                    var_16_114 = var_11_E6:int
                }
                else {
                    var_11_E6 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), xor:int(ldc:int(1028), ldc:int(1029)))
                    var_12_10C = var_14_110 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_114 = var_11_E6:int, var_6_8C:int)) {
                        var_9_C3 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E6:int)
                        var_16_114 = var_11_E6:int
                        var_14_110 = var_12_10C:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_6BC:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_6BC = and:int(var_3_6BC:int, ldc:int(-1175277749))
                        goto(Label_1595)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BC:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_6BC = and:int(var_3_6BC:int, ldc:int(-1157943281))
                        goto(Label_1461)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BC:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1312)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BC:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_6BC = and:int(var_3_6BC:int, ldc:int(1654384842))
                        goto(Label_1163)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BC:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0997)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BC:int, ldc:int(1)), ldc:int(0))) {
                        var_3_6BC = and:int(var_3_6BC:int, ldc:int(-826422629))
                        goto(Label_0863)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BC:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_6BC = and:int(var_3_6BC:int, ldc:int(-127368351))
                        goto(Label_0733)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BC:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_6BC = and:int(var_3_6BC:int, ldc:int(-1426293649))
                        goto(Label_0613)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BC:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_6BC = and:int(var_3_6BC:int, ldc:int(-273961004))
                        
                        if (cmplt:boolean(var_16_114:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0613)
                            }
                            
                            goto(Label_0863)
                        }
                    }
                    
                    Label_0420:
                    
                    if (cmpeq:boolean(and:int(var_3_6BC:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_6BC = and:int(var_3_6BC:int, ldc:int(1265608393))
                        goto(Label_1595)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BC:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1461)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BC:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_6BC = and:int(var_3_6BC:int, ldc:int(1102477488))
                        goto(Label_1312)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BC:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_6BC = and:int(var_3_6BC:int, ldc:int(1663905399))
                        goto(Label_1163)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BC:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_6BC = and:int(var_3_6BC:int, ldc:int(754150162))
                        goto(Label_0997)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BC:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_6BC = and:int(var_3_6BC:int, ldc:int(785465824))
                        goto(Label_0863)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BC:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_6BC = and:int(var_3_6BC:int, ldc:int(-2020661142))
                        goto(Label_0733)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BC:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_6BC = and:int(var_3_6BC:int, ldc:int(-1974380636))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6BC:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_6BC = and:int(var_3_6BC:int, ldc:int(1191029724))
                            var_11_E6 = and:int(ldc:int(14688), ldc:int(-16229))
                            goto(Label_1584)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0613:
                    
                    if (cmpeq:boolean(and:int(var_3_6BC:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_6BC = and:int(var_3_6BC:int, ldc:int(-1195352560))
                        goto(Label_1595)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BC:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1461)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BC:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1312)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BC:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1163)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BC:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_6BC = and:int(var_3_6BC:int, ldc:int(879710423))
                        goto(Label_0997)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BC:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0863)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BC:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_6BC = and:int(var_3_6BC:int, ldc:int(-1446070446))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6BC:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0420)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6BC:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_6BC = and:int(var_3_6BC:int, ldc:int(1751627784))
                            loopcontinue()
                        }
                        
                        var_3_6BC = and:int(var_3_6BC:int, ldc:int(-409121931))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_110 = var_9_C3:double
                            goto(Label_0863)
                        }
                    }
                    
                    Label_0733:
                    
                    if (cmpne:boolean(and:int(var_3_6BC:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1595)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BC:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1461)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BC:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_6BC = and:int(var_3_6BC:int, ldc:int(897130287))
                        goto(Label_1312)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BC:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1163)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BC:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0997)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BC:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_6BC = and:int(var_3_6BC:int, ldc:int(-566218939))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6BC:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_6BC = and:int(var_3_6BC:int, ldc:int(652044324))
                            goto(Label_0613)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6BC:int, ldc:int(32)), ldc:int(0))) {
                            var_3_6BC = and:int(var_3_6BC:int, ldc:int(1466034639))
                            goto(Label_0420)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6BC:int, ldc:int(2097152)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6BC = and:int(var_3_6BC:int, ldc:int(1452064037))
                        var_14_110 = mul:double(ldc:double(0.5), add:double(var_9_C3:double, var_14_110:double))
                    }
                    
                    Label_0863:
                    
                    if (cmpne:boolean(and:int(var_3_6BC:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1595)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BC:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1461)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BC:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_6BC = and:int(var_3_6BC:int, ldc:int(-333552913))
                        goto(Label_1312)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BC:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1163)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BC:int, ldc:int(4)), ldc:int(0))) {
                        var_3_6BC = and:int(var_3_6BC:int, ldc:int(1883264117))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6BC:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0733)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6BC:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_6BC = and:int(var_3_6BC:int, ldc:int(1302341150))
                            goto(Label_0613)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6BC:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_6BC = and:int(var_3_6BC:int, ldc:int(1222964385))
                            goto(Label_0420)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6BC:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_6BC = and:int(var_3_6BC:int, ldc:int(-1955675594))
                            loopcontinue()
                        }
                        
                        var_3_6BC = and:int(var_3_6BC:int, ldc:int(1590332802))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_E6 = xor:int(ldc:int(-32764), ldc:int(-32763))
                                goto(Label_1163)
                            }
                        }
                    }
                    
                    Label_0997:
                    
                    if (cmpne:boolean(and:int(var_3_6BC:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_6BC = and:int(var_3_6BC:int, ldc:int(-1760158444))
                        goto(Label_1595)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BC:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1461)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BC:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1312)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BC:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_6BC = and:int(var_3_6BC:int, ldc:int(786901652))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6BC:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0863)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6BC:int, ldc:int(1)), ldc:int(0))) {
                            var_3_6BC = and:int(var_3_6BC:int, ldc:int(-1641602662))
                            goto(Label_0733)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6BC:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0613)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6BC:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_6BC = and:int(var_3_6BC:int, ldc:int(1540955908))
                            goto(Label_0420)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6BC:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_6BC = and:int(var_3_6BC:int, ldc:int(249469260))
                            loopcontinue()
                        }
                        
                        var_3_6BC = and:int(var_3_6BC:int, ldc:int(1740479957))
                        var_11_E6 = and:int(ldc:int(-7662), ldc:int(1385))
                    }
                    
                    Label_1163:
                    
                    if (cmpne:boolean(and:int(var_3_6BC:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1595)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BC:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_6BC = and:int(var_3_6BC:int, ldc:int(906590304))
                        goto(Label_1461)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BC:int, ldc:int(1)), ldc:int(0))) {
                        var_3_6BC = and:int(var_3_6BC:int, ldc:int(-1101478435))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6BC:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_6BC = and:int(var_3_6BC:int, ldc:int(-162326381))
                            goto(Label_0997)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6BC:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0863)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6BC:int, ldc:int(4)), ldc:int(0))) {
                            var_3_6BC = and:int(var_3_6BC:int, ldc:int(1379774338))
                            goto(Label_0733)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6BC:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_6BC = and:int(var_3_6BC:int, ldc:int(-111721059))
                            goto(Label_0613)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6BC:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_6BC = and:int(var_3_6BC:int, ldc:int(348286715))
                            goto(Label_0420)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6BC:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_6BC = and:int(var_3_6BC:int, ldc:int(1617941534))
                            loopcontinue()
                        }
                        
                        var_3_6BC = and:int(var_3_6BC:int, ldc:int(-426161824))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E6:int, ldc:int(0))) {
                                goto(Label_1461)
                            }
                        }
                    }
                    
                    Label_1312:
                    
                    if (cmpne:boolean(and:int(var_3_6BC:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1595)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BC:int, ldc:int(1)), ldc:int(0))) {
                        var_3_6BC = and:int(var_3_6BC:int, ldc:int(-2063157519))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6BC:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_1163)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6BC:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_6BC = and:int(var_3_6BC:int, ldc:int(1088039338))
                            goto(Label_0997)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6BC:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_6BC = and:int(var_3_6BC:int, ldc:int(-419121917))
                            goto(Label_0863)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6BC:int, ldc:int(8)), ldc:int(0))) {
                            var_3_6BC = and:int(var_3_6BC:int, ldc:int(1862930036))
                            goto(Label_0733)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6BC:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0613)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6BC:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_6BC = and:int(var_3_6BC:int, ldc:int(-1244281862))
                            goto(Label_0420)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6BC:int, ldc:int(8)), ldc:int(0))) {
                            var_3_6BC = and:int(var_3_6BC:int, ldc:int(-1091890411))
                            loopcontinue()
                        }
                        
                        var_3_6BC = and:int(var_3_6BC:int, ldc:int(-275932907))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_110:double, var_5_85:int, var_16_114:int)
                        goto(Label_1584)
                    }
                    
                    Label_1461:
                    
                    if (cmpne:boolean(and:int(var_3_6BC:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1595)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BC:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1312)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BC:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6BC = and:int(var_3_6BC:int, ldc:int(-755914018))
                        goto(Label_1163)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BC:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0997)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BC:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0863)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BC:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0733)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BC:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6BC = and:int(var_3_6BC:int, ldc:int(1767689427))
                        goto(Label_0613)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BC:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0420)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BC:int, ldc:int(8)), ldc:int(0))) {
                        var_3_6BC = and:int(var_3_6BC:int, ldc:int(3280427))
                        loopcontinue()
                    }
                    
                    var_3_6BC = and:int(var_3_6BC:int, ldc:int(-424017967))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_110:double, ldc:double(0.0))
                    Label_1584:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_6C7 = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_E6:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1595:
                    
                    if (cmpne:boolean(and:int(var_3_6BC:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_6BC = and:int(var_3_6BC:int, ldc:int(-1317304345))
                        goto(Label_1461)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BC:int, ldc:int(256)), ldc:int(0))) {
                        var_3_6BC = and:int(var_3_6BC:int, ldc:int(-1949710906))
                        goto(Label_1312)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BC:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_6BC = and:int(var_3_6BC:int, ldc:int(-821787818))
                        goto(Label_1163)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BC:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_6BC = and:int(var_3_6BC:int, ldc:int(-1141178626))
                        goto(Label_0997)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BC:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0863)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BC:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0733)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BC:int, ldc:int(1)), ldc:int(0))) {
                        var_3_6BC = and:int(var_3_6BC:int, ldc:int(1743010726))
                        goto(Label_0613)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BC:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0420)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BC:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_6BC = and:int(var_3_6BC:int, ldc:int(1335803895))
                        var_17_6C7 = add:int(var_16_114:int, xor:int(ldc:int(6), ldc:int(7)))
                        looporswitchbreak()
                    }
                    
                    var_3_6BC = and:int(var_3_6BC:int, ldc:int(733561877))
                }
                
                var_3_6BC = and:int(var_3_6BC:int, ldc:int(1720671554))
                
                if (cmple:boolean(var_5_85 = var_17_6C7:int, sub:int(var_6_8C:int, and:int(ldc:int(3235), ldc:int(4101))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpne:boolean(and:int(var_3_6BC:int, ldc:int(256)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
