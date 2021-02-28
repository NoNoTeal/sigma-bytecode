public class \u56bd\u8413\u647c\u5bc4\ud158.\u7c6b\u12cb\uc2bd\ub6ab\uf995 {
    public void \u7c6b\u12cb\uc2bd\ub6ab\uf995() {
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
            invokespecial:\u9937\ubb2b\u600f\u6b0d\u74b1(\u9937\ubb2b\u600f\u6b0d\u74b1::<init>, this:\u7c6b\u12cb\uc2bd\ub6ab\uf995)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static \u56bd\u8413\u647c\u5bc4\ud158.\u7c6b\u12cb\uc2bd\ub6ab\uf995 \u839e\uf995\u120d\u6cfe\ud523\u7873(java.lang.String p0) {
        var_1_64 : int
        var_3_6C : JsonParser
        var_1_71 : int
        var_4_79 : \u7c6b\u12cb\uc2bd\ub6ab\uf995
        var_5_C1 : JsonElement
        var_6_124 : Iterator
        var_5_1B7 : Exception
        
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
            var_1_64 = and:int(and:int(ldc:int(-1701741325), ldc:int(-1833435137)), ldc:int(-1147192013))
            var_3_6C = initobject:JsonParser(JsonParser::<init>)
            var_1_71 = and:int(var_1_64:int, ldc:int(-553672969))
            var_4_79 = initobject:\u7c6b\u12cb\uc2bd\ub6ab\uf995(\u7c6b\u12cb\uc2bd\ub6ab\uf995::<init>)
            
            loop {
                if (cmpeq:boolean(and:int(var_1_71:int, ldc:int(4096)), ldc:int(0))) {
                    var_1_71 = and:int(var_1_71:int, ldc:int(1112080799))
                }
                else {
                    var_1_71 = and:int(var_1_71:int, ldc:int(-1701749541))
                    putfield:List<\u3dd3\u76bc\u8753\u071d\u56bd>(\u7c6b\u12cb\uc2bd\ub6ab\uf995::\u7049\u7ce1\u9255\u4975\u718f\ub102, var_4_79:\u7c6b\u12cb\uc2bd\ub6ab\uf995, invokestatic:ArrayList[expected:List<\u3dd3\u76bc\u8753\u071d\u56bd>](Lists::newArrayList))
                }
                
                try {
                    if (cmpeq:boolean(and:int(var_1_71:int, ldc:int(4096)), ldc:int(0))) {
                        var_1_71 = and:int(var_1_71:int, ldc:int(-1765461143))
                        loopcontinue()
                    }
                    
                    var_1_71 = and:int(var_1_71:int, ldc:int(-678052677))
                    var_5_C1 = invokevirtual:JsonElement(JsonObject::get, invokevirtual:JsonObject(JsonElement::getAsJsonObject, invokevirtual:JsonElement(JsonParser::parse, var_3_6C:JsonParser, p0:String)), loadelement:String(getstatic:String[](\u7c6b\u12cb\uc2bd\ub6ab\uf995::\u8cae\u7d52\u51fa\u0a06\uc910\u93a2), and:int(ldc:int(3612), ldc:int(-7773))))
                    
                    loop {
                        if (cmpne:boolean(and:int(var_1_71:int, ldc:int(16777216)), ldc:int(0))) {
                            var_1_71 = and:int(var_1_71:int, ldc:int(1053136644))
                            goto(Label_0257)
                        }
                        
                        if (cmpne:boolean(and:int(var_1_71:int, ldc:int(65536)), ldc:int(0))) {
                            var_1_71 = and:int(var_1_71:int, ldc:int(-1835197417))
                            
                            if (logicalnot:boolean(invokevirtual:boolean(JsonElement::isJsonArray, var_5_C1:JsonElement))) {
                                looporswitchbreak()
                            }
                        }
                        
                        Label_0230:
                        
                        if (cmpne:boolean(and:int(var_1_71:int, ldc:int(2097152)), ldc:int(0))) {
                            var_1_71 = and:int(var_1_71:int, ldc:int(-2009521145))
                        }
                        else {
                            if (cmpeq:boolean(and:int(var_1_71:int, ldc:int(4096)), ldc:int(0))) {
                                loopcontinue()
                            }
                            
                            var_1_71 = and:int(var_1_71:int, ldc:int(-1164607917))
                        }
                        
                        Label_0257:
                        
                        if (cmpeq:boolean(and:int(var_1_71:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0230)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_71:int, ldc:int(4096)), ldc:int(0))) {
                            var_1_71 = and:int(var_1_71:int, ldc:int(-359956771))
                        }
                        else {
                            var_1_71 = and:int(var_1_71:int, ldc:int(-1835303301))
                            var_6_124 = invokevirtual:Iterator(JsonArray::iterator, invokevirtual:JsonArray(JsonElement::getAsJsonArray, var_5_C1:JsonElement))
                            
                            loop {
                                if (cmpne:boolean(and:int(var_1_71:int, ldc:int(67108864)), ldc:int(0))) {
                                    var_1_71 = and:int(var_1_71:int, ldc:int(-1576894556))
                                    goto(Label_0374)
                                }
                                
                                if (cmpeq:boolean(and:int(var_1_71:int, ldc:int(2)), ldc:int(0))) {
                                    var_1_71 = and:int(var_1_71:int, ldc:int(-480744393))
                                }
                                else {
                                    var_1_71 = and:int(var_1_71:int, ldc:int(-1076388365))
                                    
                                    if (logicalnot:boolean(invokeinterface:boolean(Iterator::hasNext, var_6_124:Iterator))) {
                                        looporswitchbreak(Label_0432)
                                    }
                                }
                                
                                Label_0339:
                                
                                if (cmpne:boolean(and:int(var_1_71:int, ldc:int(1073741824)), ldc:int(0))) {
                                    var_1_71 = and:int(var_1_71:int, ldc:int(447805618))
                                }
                                else {
                                    if (cmpeq:boolean(and:int(var_1_71:int, ldc:int(1024)), ldc:int(0))) {
                                        var_1_71 = and:int(var_1_71:int, ldc:int(-1284853560))
                                        loopcontinue()
                                    }
                                    
                                    var_1_71 = and:int(var_1_71:int, ldc:int(-1762190281))
                                }
                                
                                Label_0374:
                                
                                if (cmpne:boolean(and:int(var_1_71:int, ldc:int(2097152)), ldc:int(0))) {
                                    var_1_71 = and:int(var_1_71:int, ldc:int(-1046734990))
                                    goto(Label_0339)
                                }
                                
                                if (cmpeq:boolean(and:int(var_1_71:int, ldc:int(16)), ldc:int(0))) {
                                    loopcontinue()
                                }
                                
                                var_1_71 = and:int(var_1_71:int, ldc:int(-401933))
                                invokeinterface:boolean(List<\u3dd3\u76bc\u8753\u071d\u56bd>::add, getfield:List<\u3dd3\u76bc\u8753\u071d\u56bd>(\u7c6b\u12cb\uc2bd\ub6ab\uf995::\u7049\u7ce1\u9255\u4975\u718f\ub102, var_4_79:\u7c6b\u12cb\uc2bd\ub6ab\uf995), invokestatic:\u3dd3\u76bc\u8753\u071d\u56bd(\u3dd3\u76bc\u8753\u071d\u56bd::\uc229\u3711\u6198\ud7e8\u7873\uf995, checkcast:JsonElement(com.google.gson.JsonElement.class, invokeinterface:JsonElement(Iterator<JsonElement>::next, var_6_124:Iterator<JsonElement>))))
                            }
                        }
                    }
                    
                    Label_0432:
                }
                catch (java.lang.Exception var_5_1B7) {
                    invokeinterface:void(Logger::error, getstatic:Logger(\u7c6b\u12cb\uc2bd\ub6ab\uf995::\u392e\u47c2\ud171\ub171\u4f4a\u64ab), invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u7c6b\u12cb\uc2bd\ub6ab\uf995::\u8cae\u7d52\u51fa\u0a06\uc910\u93a2), and:int(ldc:int(4361), ldc:int(1091)))), invokevirtual:String(Throwable::getMessage, var_5_1B7:Exception[expected:Throwable]))))
                }
                
                looporswitchbreak()
            }
            
            return:\u7c6b\u12cb\uc2bd\ub6ab\uf995(var_4_79:\u7c6b\u12cb\uc2bd\ub6ab\uf995)
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_215 : int
        expr_6B : int [generated]
        stack_A3_0 : byte[] [generated]
        stack_A5_0 : byte[] [generated]
        stack_E7_0 : byte[] [generated]
        stack_E9_0 : byte[] [generated]
        stack_129_0 : byte[] [generated]
        stack_12B_0 : byte[] [generated]
        stack_163_0 : byte[] [generated]
        stack_165_0 : byte[] [generated]
        stack_194_0 : byte[] [generated]
        stack_227_0 : byte[] [generated]
        stack_261_0 : byte[] [generated]
        stack_2D4_0 : byte[] [generated]
        stack_33D_0 : byte[] [generated]
        stack_3AD_0 : byte[] [generated]
        var_4_1FB : int
        var_3_200 : byte[]
        var_5_201 : int
        expr_2D4 : byte [generated]
        var_0_333 : int
        expr_33D : byte [generated]
        stack_379_2 : byte [generated]
        stack_358_0 : byte [generated]
        var_2_A3 : byte[]
        expr_A7 : int [generated]
        var_3_250 : byte[]
        var_5_251 : int
        expr_E9 : int [generated]
        expr_12B : int [generated]
        expr_165 : int [generated]
        var_3_39C : byte[]
        var_5_39D : int
        var_3_1A0 : String
        stack_1EE_0 : String[] [generated]
        expr_1B2 : String[] [generated]
        
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
        var_0_215 = and:int(ldc:int(-1550489984), ldc:int(-1114548373))
        expr_6B = arraylength:int(stack_A3_0 = stack_A5_0 = stack_E7_0 = stack_E9_0 = stack_129_0 = stack_12B_0 = stack_163_0 = stack_165_0 = stack_194_0 = stack_227_0 = stack_261_0 = stack_2D4_0 = stack_33D_0 = stack_3AD_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("Ro4HxHtWaQU6BKpRggJA+K7zAPh6B8lPhsIBtK75/4GAD0+O")))
        
        if (cmpeq:boolean(expr_6B:int, ldc:int(0))) {
            goto(Label_0112)
        }
        
        var_4_1FB = expr_6B:int
        var_3_200 = newarray:byte[](byte.class, expr_6B:int)
        var_5_201 = expr_6B:int
        Label_0515:
        
        while (cmpne:boolean(and:int(var_0_215:int, ldc:int(1024)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_215:int, ldc:int(1)), ldc:int(0))) {
                var_0_215 = and:int(var_0_215:int, ldc:int(442196765))
                goto(Label_0680)
            }
            
            var_0_215 = and:int(var_0_215:int, ldc:int(-466392031))
            var_5_201 = add:int(var_5_201:int, ldc:int(-1))
            storeelement:byte(var_3_200:byte[], var_5_201:int, xor:byte(loadelement:byte(stack_227_0:byte[], var_5_201:int), ldc:byte(70)))
            
            if (cmpne:boolean(var_5_201:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A5_0 = stack_A3_0 = stack_E7_0 = stack_E9_0 = stack_129_0 = stack_12B_0 = stack_163_0 = stack_165_0 = stack_194_0 = stack_227_0 = stack_261_0 = stack_2D4_0 = stack_33D_0 = stack_3AD_0 = var_3_200:byte[]
            goto(Label_0112)
        }
        
        goto(Label_0793)
        Label_0680:
        
        while (cmpeq:boolean(and:int(var_0_215:int, ldc:int(32)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_215:int, ldc:int(256)), ldc:int(0))) {
                var_0_215 = and:int(var_0_215:int, ldc:int(-1505149318))
                goto(Label_0515)
            }
            
            var_0_215 = and:int(var_0_215:int, ldc:int(-849490253))
            var_5_201 = add:int(var_5_201:int, ldc:int(-1))
            expr_2D4 = loadelement:byte(stack_2D4_0:byte[], var_5_201:int)
            storeelement:byte(var_3_200:byte[], var_5_201:int, or:int(and:int(shl:int(expr_2D4:byte, xor:int(ldc:int(10753), ldc:int(10757))), ldc:int(-16)), and:int(shr:int(expr_2D4:byte[expected:int], xor:int(ldc:int(18947), ldc:int(18951))), ldc:int(15))))
            
            if (cmpne:boolean(var_5_201:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A5_0 = stack_A3_0 = stack_E7_0 = stack_E9_0 = stack_129_0 = stack_12B_0 = stack_163_0 = stack_165_0 = stack_194_0 = stack_227_0 = stack_261_0 = stack_2D4_0 = stack_33D_0 = stack_3AD_0 = var_3_200:byte[]
            goto(Label_0238)
        }
        
        var_0_215 = and:int(var_0_215:int, ldc:int(-1672971263))
        Label_0793:
        
        while (cmpeq:boolean(and:int(var_0_215:int, ldc:int(268435456)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_215:int, ldc:int(16)), ldc:int(0))) {
                goto(Label_0515)
            }
            
            var_0_333 = and:int(var_0_215:int, ldc:int(-209730087))
            var_5_201 = add:int(var_5_201:int, ldc:int(-1))
            expr_33D = stack_379_2 = loadelement(stack_33D_0, var_5_201)
            
            if (cmplt:boolean(add:int(add:int(var_5_201:int, ldc:int(5)), neg:int(var_4_1FB:int)), ldc:int(0))) {
                stack_379_2 = stack_358_0 = add:byte(expr_33D:byte, loadelement:byte(var_3_200:byte[], add:int(var_5_201:int, ldc:int(5))))
                goto(Label_0872)
            }
            
            Label_0842:
            
            if (cmpeq:boolean(and:int(var_0_333:int, ldc:int(268435456)), ldc:int(0))) {
                var_0_333 = and:int(var_0_333:int, ldc:int(-1628219504))
                stack_379_2 = stack_358_0 = add:byte(expr_33D:byte, ldc:byte(5))
            }
            
            Label_0872:
            
            if (cmpne:boolean(and:int(var_0_333:int, ldc:int(2)), ldc:int(0))) {
                goto(Label_0842)
            }
            
            var_0_215 = and:int(var_0_333:int, ldc:int(-343179954))
            storeelement:byte(var_3_200:byte[], var_5_201:int, stack_379_2:byte)
            
            if (cmpne:boolean(var_5_201:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A5_0 = stack_A3_0 = stack_E7_0 = stack_E9_0 = stack_129_0 = stack_12B_0 = stack_163_0 = stack_165_0 = stack_194_0 = stack_227_0 = stack_261_0 = stack_2D4_0 = stack_33D_0 = stack_3AD_0 = var_3_200:byte[]
            goto(Label_0304)
        }
        
        var_0_215 = and:int(var_0_215:int, ldc:int(-906121083))
        goto(Label_0680)
        Label_0112:
        
        if (cmpeq:boolean(and:int(var_0_215:int, ldc:int(65536)), ldc:int(0))) {
            goto(Label_0362)
        }
        
        if (cmpne:boolean(and:int(var_0_215:int, ldc:int(67108864)), ldc:int(0))) {
            var_0_215 = and:int(var_0_215:int, ldc:int(-1486679460))
            goto(Label_0304)
        }
        
        if (cmpne:boolean(and:int(var_0_215:int, ldc:int(1)), ldc:int(0))) {
            goto(Label_0238)
        }
        
        if (cmpne:boolean(and:int(var_0_215:int, ldc:int(8)), ldc:int(0))) {
            var_0_215 = and:int(var_0_215:int, ldc:int(237385008))
        }
        else {
            var_0_215 = and:int(var_0_215:int, ldc:int(-1969525725))
            var_2_A3 = stack_A3_0:byte[]
            expr_A7 = add:int(arraylength:int(stack_A5_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_A7:int, ldc:int(0))) {
                var_3_250 = newarray:byte[](byte.class, expr_A7:int)
                var_5_251 = expr_A7:int
                
                loop {
                    var_0_215 = and:int(var_0_215:int, ldc:int(-1088076277))
                    var_5_251 = add:int(var_5_251:int, ldc:int(-1))
                    storeelement:byte(var_3_250:byte[], var_5_251:int, add:int(shl:int(loadelement:byte(stack_261_0:byte[], var_5_251:int), ldc:int(6)), and:int(shr:int(loadelement:byte(var_2_A3:byte[], add:int(var_5_251:int, xor:int(ldc:int(228), ldc:int(229)))), ldc:int(2)), and:int(ldc:int(16575), ldc:int(8255)))))
                    
                    if (cmpne:boolean(var_5_251:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_A5_0 = stack_A3_0 = stack_E7_0 = stack_E9_0 = stack_129_0 = stack_12B_0 = stack_163_0 = stack_165_0 = stack_194_0 = stack_227_0 = stack_261_0 = stack_2D4_0 = stack_33D_0 = stack_3AD_0 = var_3_250:byte[]
            }
        }
        
        Label_0172:
        
        if (cmpne:boolean(and:int(var_0_215:int, ldc:int(2)), ldc:int(0))) {
            goto(Label_0362)
        }
        
        if (cmpne:boolean(and:int(var_0_215:int, ldc:int(256)), ldc:int(0))) {
            var_0_215 = and:int(var_0_215:int, ldc:int(-1631808750))
            goto(Label_0304)
        }
        
        if (cmpeq:boolean(and:int(var_0_215:int, ldc:int(2147483647)), ldc:int(0))) {
            var_0_215 = and:int(var_0_215:int, ldc:int(-1205923604))
        }
        else {
            if (cmpne:boolean(and:int(var_0_215:int, ldc:int(16)), ldc:int(0))) {
                var_0_215 = and:int(var_0_215:int, ldc:int(-1792704987))
                goto(Label_0112)
            }
            
            var_0_215 = and:int(var_0_215:int, ldc:int(-1773443617))
            expr_E9 = arraylength:int(stack_E9_0:byte[])
            
            if (cmpne:boolean(expr_E9:int, ldc:int(0))) {
                var_4_1FB = expr_E9:int
                var_3_200 = newarray:byte[](byte.class, expr_E9:int)
                var_5_201 = expr_E9:int
                goto(Label_0680)
            }
        }
        
        Label_0238:
        
        if (cmpne:boolean(and:int(var_0_215:int, ldc:int(2048)), ldc:int(0))) {
            var_0_215 = and:int(var_0_215:int, ldc:int(-1988710218))
            goto(Label_0362)
        }
        
        if (cmpeq:boolean(and:int(var_0_215:int, ldc:int(65536)), ldc:int(0))) {
            var_0_215 = and:int(var_0_215:int, ldc:int(-489994141))
        }
        else {
            if (cmpne:boolean(and:int(var_0_215:int, ldc:int(2)), ldc:int(0))) {
                var_0_215 = and:int(var_0_215:int, ldc:int(-1154770227))
                goto(Label_0172)
            }
            
            if (cmpne:boolean(and:int(var_0_215:int, ldc:int(1073741824)), ldc:int(0))) {
                goto(Label_0112)
            }
            
            var_0_215 = and:int(var_0_215:int, ldc:int(-1930301778))
            expr_12B = arraylength:int(stack_12B_0:byte[])
            
            if (cmpne:boolean(expr_12B:int, ldc:int(0))) {
                var_4_1FB = expr_12B:int
                var_3_200 = newarray:byte[](byte.class, expr_12B:int)
                var_5_201 = expr_12B:int
                goto(Label_0793)
            }
        }
        
        Label_0304:
        
        if (cmpeq:boolean(and:int(var_0_215:int, ldc:int(67108864)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_215:int, ldc:int(8)), ldc:int(0))) {
                goto(Label_0238)
            }
            
            if (cmpne:boolean(and:int(var_0_215:int, ldc:int(1073741824)), ldc:int(0))) {
                var_0_215 = and:int(var_0_215:int, ldc:int(170950250))
                goto(Label_0172)
            }
            
            if (cmpne:boolean(and:int(var_0_215:int, ldc:int(4194304)), ldc:int(0))) {
                var_0_215 = and:int(var_0_215:int, ldc:int(1289517632))
                goto(Label_0112)
            }
            
            var_0_215 = and:int(var_0_215:int, ldc:int(-190362423))
            expr_165 = arraylength:int(stack_165_0:byte[])
            
            if (cmpne:boolean(expr_165:int, ldc:int(0))) {
                var_3_39C = newarray:byte[](byte.class, expr_165:int)
                var_5_39D = expr_165:int
                
                loop {
                    var_0_215 = and:int(var_0_215:int, ldc:int(-1365381813))
                    var_5_39D = add:int(var_5_39D:int, ldc:int(-1))
                    storeelement:byte(var_3_39C:byte[], var_5_39D:int, add:byte(loadelement:byte(stack_3AD_0:byte[], var_5_39D:int), ldc:byte(71)))
                    
                    if (cmpne:boolean(var_5_39D:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_A5_0 = stack_A3_0 = stack_E7_0 = stack_E9_0 = stack_129_0 = stack_12B_0 = stack_163_0 = stack_165_0 = stack_194_0 = stack_227_0 = stack_261_0 = stack_2D4_0 = stack_33D_0 = stack_3AD_0 = var_3_39C:byte[]
            }
        }
        
        Label_0362:
        
        if (cmpne:boolean(and:int(var_0_215:int, ldc:int(2097152)), ldc:int(0))) {
            goto(Label_0304)
        }
        
        if (cmpne:boolean(and:int(var_0_215:int, ldc:int(524288)), ldc:int(0))) {
            goto(Label_0238)
        }
        
        if (cmpeq:boolean(and:int(var_0_215:int, ldc:int(65536)), ldc:int(0))) {
            var_0_215 = and:int(var_0_215:int, ldc:int(-229771850))
            goto(Label_0172)
        }
        
        if (cmpeq:boolean(and:int(var_0_215:int, ldc:int(32)), ldc:int(0))) {
            var_3_1A0 = initobject:String(String::<init>, stack_194_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_1EE_0 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(17088), ldc:int(17090)))
            expr_1B2 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(1101), ldc:int(1103)))
            storeelement:String(expr_1B2:String[], and:int(ldc:int(12353), ldc:int(2059)), invokevirtual:String[expected:String](String::substring, var_3_1A0:String, and:int(ldc:int(-7192), ldc:int(7190)), xor:int(ldc:int(68), ldc:int(88))))
            storeelement:String(expr_1B2:String[], and:int(ldc:int(-5596), ldc:int(5531)), invokevirtual:String[expected:String](String::substring, var_3_1A0:String, xor:int(ldc:int(16458), ldc:int(16470)), and:int(ldc:int(35), ldc:int(551))))
            putstatic:String[](\u7c6b\u12cb\uc2bd\ub6ab\uf995::\u8cae\u7d52\u51fa\u0a06\uc910\u93a2, expr_1B2:String[])
            putstatic:Logger(\u7c6b\u12cb\uc2bd\ub6ab\uf995::\u392e\u47c2\ud171\ub171\u4f4a\u64ab, invokestatic:Logger(LogManager::getLogger))
            return:void()
        }
        
        goto(Label_0112)
    }
    
    public void \u6c52\u983f\u7873\u92ff\ua068\u4c2b(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_68A : int
        var_5_88 : int
        var_6_8F : int
        var_7_9E : double
        var_9_CE : double
        var_3_E0 : int
        var_11_F1 : int
        var_14_11B : double
        var_16_11F : int
        var_12_117 : double
        var_17_695 : int
        
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
        var_3_68A = and:int(ldc:int(891273665), ldc:int(-111258639))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u7c6b\u12cb\uc2bd\ub6ab\uf995[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0178)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(33554432)), ldc:int(0))) {
            var_3_68A = and:int(var_3_68A:int, ldc:int(-621565361))
        }
        else {
            var_3_68A = and:int(var_3_68A:int, ldc:int(325055857))
            var_5_88 = and:int(ldc:int(-25907), ldc:int(25906))
            var_6_8F = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9E = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(14424), ldc:int(-15483)))
            invokestatic:int(m::a)
            
            loop {
                var_9_CE = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_E0 = and:int(var_3_68A:int, ldc:int(1534992419))
                    var_9_CE = sub:double(var_7_9E:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_F1 = var_5_88:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_F1:int, sub:int(var_6_8F:int, xor:int(ldc:int(34), ldc:int(35)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_F1:int, and:int(ldc:int(5155), ldc:int(16405)))), var_7_9E:double))) {
                        inc:int(var_11_F1, ldc:int(1))
                    }
                    
                    var_3_68A = and:int(var_3_E0:int, ldc:int(-801230545))
                    var_14_11B = var_7_9E:double
                    var_16_11F = var_11_F1:int
                }
                else {
                    var_11_F1 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_88:int), and:int(ldc:int(65), ldc:int(9227)))
                    var_12_117 = var_14_11B = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_88)
                    
                    if (cmplt:boolean(var_16_11F = var_11_F1:int, var_6_8F:int)) {
                        var_9_CE = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_F1:int)
                        var_16_11F = var_11_F1:int
                        var_14_11B = var_12_117:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(-48156510))
                        goto(Label_1558)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(279723909))
                        goto(Label_1418)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(2026447554))
                        goto(Label_1280)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(1834689735))
                        goto(Label_1152)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(445372640))
                        goto(Label_0998)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(-1651147577))
                        goto(Label_0861)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(-83774129))
                        goto(Label_0744)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0617)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(269300743))
                    }
                    else {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(2076126121))
                        
                        if (cmplt:boolean(var_16_11F:int, var_6_8F:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0617)
                            }
                            
                            goto(Label_0861)
                        }
                    }
                    
                    Label_0447:
                    
                    if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(-1687799528))
                        goto(Label_1558)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(1544291972))
                        goto(Label_1418)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1280)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1152)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(-1856205806))
                        goto(Label_0998)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0861)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(914983823))
                        goto(Label_0744)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(268435456)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_68A = and:int(var_3_68A:int, ldc:int(-1300324854))
                            loopcontinue()
                        }
                        
                        var_3_68A = and:int(var_3_68A:int, ldc:int(-652236563))
                        var_11_F1 = and:int(ldc:int(6563), ldc:int(-7608))
                        goto(Label_1547)
                    }
                    
                    Label_0617:
                    
                    if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(-133984359))
                        goto(Label_1558)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1418)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(2040663359))
                        goto(Label_1280)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(-716634764))
                        goto(Label_1152)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0998)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(1)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(963695200))
                        goto(Label_0861)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(1)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0447)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_68A = and:int(var_3_68A:int, ldc:int(-1043648203))
                            loopcontinue()
                        }
                        
                        var_3_68A = and:int(var_3_68A:int, ldc:int(1042223573))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_11B = var_9_CE:double
                            goto(Label_0861)
                        }
                    }
                    
                    Label_0744:
                    
                    if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1558)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(-17302647))
                        goto(Label_1418)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(-1201708993))
                        goto(Label_1280)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(1)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(-307487594))
                        goto(Label_1152)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0998)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(1)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0617)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0447)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(512)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_68A = and:int(var_3_68A:int, ldc:int(-746622941))
                        var_14_11B = mul:double(ldc:double(0.5), add:double(var_9_CE:double, var_14_11B:double))
                    }
                    
                    Label_0861:
                    
                    if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(216008174))
                        goto(Label_1558)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(-1278069514))
                        goto(Label_1418)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(1082865969))
                        goto(Label_1280)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(464183980))
                        goto(Label_1152)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(553248861))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0744)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(1)), ldc:int(0))) {
                            var_3_68A = and:int(var_3_68A:int, ldc:int(61501136))
                            goto(Label_0617)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0447)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(524288)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_68A = and:int(var_3_68A:int, ldc:int(-115455775))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_88:int), var_7_9E:double)) {
                                var_11_F1 = and:int(ldc:int(4871), ldc:int(25625))
                                goto(Label_1152)
                            }
                        }
                    }
                    
                    Label_0998:
                    
                    if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(672243756))
                        goto(Label_1558)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(-1184466454))
                        goto(Label_1418)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(409230809))
                        goto(Label_1280)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(8192)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0861)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0744)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0617)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0447)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(1)), ldc:int(0))) {
                            var_3_68A = and:int(var_3_68A:int, ldc:int(384825103))
                            loopcontinue()
                        }
                        
                        var_3_68A = and:int(var_3_68A:int, ldc:int(-549530027))
                        var_11_F1 = and:int(ldc:int(10253), ldc:int(-10254))
                    }
                    
                    Label_1152:
                    
                    if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1558)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(-992358680))
                        goto(Label_1418)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(524288)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_68A = and:int(var_3_68A:int, ldc:int(-323720047))
                            goto(Label_0998)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0861)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(32)), ldc:int(0))) {
                            var_3_68A = and:int(var_3_68A:int, ldc:int(-590948879))
                            goto(Label_0744)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_68A = and:int(var_3_68A:int, ldc:int(935476908))
                            goto(Label_0617)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0447)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_68A = and:int(var_3_68A:int, ldc:int(-717188422))
                            loopcontinue()
                        }
                        
                        var_3_68A = and:int(var_3_68A:int, ldc:int(-1289867909))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_F1:int, ldc:int(0))) {
                                goto(Label_1418)
                            }
                        }
                    }
                    
                    Label_1280:
                    
                    if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1558)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(1105317809))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_68A = and:int(var_3_68A:int, ldc:int(1837171864))
                            goto(Label_1152)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_68A = and:int(var_3_68A:int, ldc:int(-1857390644))
                            goto(Label_0998)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0861)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_68A = and:int(var_3_68A:int, ldc:int(-1239052551))
                            goto(Label_0744)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_68A = and:int(var_3_68A:int, ldc:int(1192948587))
                            goto(Label_0617)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0447)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_68A = and:int(var_3_68A:int, ldc:int(-172034511))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_11B:double, var_5_88:int, var_16_11F:int)
                            goto(Label_1547)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1418:
                    
                    if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(-1148544992))
                        goto(Label_1558)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1280)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1152)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0998)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(1913142674))
                        goto(Label_0861)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(1586950981))
                        goto(Label_0744)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(-1903048473))
                        goto(Label_0617)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0447)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(524288)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_68A = and:int(var_3_68A:int, ldc:int(-1830857043))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_11B:double, ldc:double(0.0))
                    Label_1547:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_695 = var_5_88:int
                        
                        if (cmpeq:boolean(var_11_F1:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1558:
                    
                    if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1418)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(-965861237))
                        goto(Label_1280)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(-540059017))
                        goto(Label_1152)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0998)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(1)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(1013443100))
                        goto(Label_0861)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0744)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(-117238948))
                        goto(Label_0617)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(-742559190))
                        goto(Label_0447)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(-1700897577))
                        var_17_695 = add:int(var_16_11F:int, xor:int(ldc:int(8713), ldc:int(8712)))
                        looporswitchbreak()
                    }
                }
                
                var_3_68A = and:int(var_3_68A:int, ldc:int(2118052605))
                
                if (cmple:boolean(var_5_88 = var_17_695:int, sub:int(var_6_8F:int, and:int(ldc:int(21579), ldc:int(277))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0178:
        
        if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(1073741824)), ldc:int(0))) {
            var_3_68A = and:int(var_3_68A:int, ldc:int(1276170090))
            goto(Label_0106)
        }
    }
}
