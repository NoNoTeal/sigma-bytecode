public class \u516c\u3d64\u718f\ub171\u6b5f.\u7006\u8709\u6435\u51b2\ucb79 {
    public void \u7006\u8709\u6435\u51b2\ucb79() {
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
            invokespecial:\u9937\ubb2b\u600f\u6b0d\u74b1(\u9937\ubb2b\u600f\u6b0d\u74b1::<init>, this:\u7006\u8709\u6435\u51b2\ucb79)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static \u516c\u3d64\u718f\ub171\u6b5f.\u7006\u8709\u6435\u51b2\ucb79 \ub102\uf9c5\u99f7\ub171\u71f1\u3d4b(java.lang.String p0) {
        var_1_93 : int
        var_3_6C : \u7006\u8709\u6435\u51b2\ucb79
        var_4_9B : JsonParser
        var_5_AB : JsonObject
        var_6_127 : JsonArray
        var_7_133 : Iterator
        var_4_1C0 : Exception
        
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
            var_1_93 = and:int(and:int(ldc:int(1134708733), ldc:int(663584761)), ldc:int(-611857473))
            var_3_6C = initobject:\u7006\u8709\u6435\u51b2\ucb79(\u7006\u8709\u6435\u51b2\ucb79::<init>)
            
            loop {
                if (cmpeq:boolean(and:int(var_1_93:int, ldc:int(32768)), ldc:int(0))) {
                    var_1_93 = and:int(var_1_93:int, ldc:int(2146855787))
                    putfield:List<\ud12e\u946b\u97b7\u51b2\u3d64>(\u7006\u8709\u6435\u51b2\ucb79::\u8350\u4f52\u62da\ub19c\ubf56\u12cb, var_3_6C:\u7006\u8709\u6435\u51b2\ucb79, invokestatic:ArrayList[expected:List<\ud12e\u946b\u97b7\u51b2\u3d64>](Lists::newArrayList))
                }
                
                try {
                    if (cmpeq:boolean(and:int(var_1_93:int, ldc:int(16777216)), ldc:int(0))) {
                        var_1_93 = and:int(var_1_93:int, ldc:int(1981782506))
                        loopcontinue()
                    }
                    
                    var_1_93 = and:int(var_1_93:int, ldc:int(-7307479))
                    var_4_9B = initobject:JsonParser(JsonParser::<init>)
                    var_1_93 = and:int(var_1_93:int, ldc:int(-1011093575))
                    var_5_AB = invokevirtual:JsonObject(JsonElement::getAsJsonObject, invokevirtual:JsonElement(JsonParser::parse, var_4_9B:JsonParser, p0:String))
                    
                    loop {
                        if (cmpeq:boolean(and:int(var_1_93:int, ldc:int(256)), ldc:int(0))) {
                            var_1_93 = and:int(var_1_93:int, ldc:int(882435776))
                            goto(Label_0257)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_93:int, ldc:int(8388608)), ldc:int(0))) {
                            var_1_93 = and:int(var_1_93:int, ldc:int(-713576514))
                        }
                        else {
                            var_1_93 = and:int(var_1_93:int, ldc:int(-1481875603))
                            
                            if (logicalnot:boolean(invokevirtual:boolean(JsonElement::isJsonArray, invokevirtual:JsonElement(JsonObject::get, var_5_AB:JsonObject, loadelement:String(getstatic:String[](\u7006\u8709\u6435\u51b2\ucb79::\u97e6\u6198\u8258\u446c\ub7dc\u59ec), and:int(ldc:int(-22153), ldc:int(22024))))))) {
                                looporswitchbreak()
                            }
                        }
                        
                        Label_0230:
                        
                        if (cmpne:boolean(and:int(var_1_93:int, ldc:int(1048576)), ldc:int(0))) {
                            var_1_93 = and:int(var_1_93:int, ldc:int(-2058020803))
                        }
                        else {
                            if (cmpne:boolean(and:int(var_1_93:int, ldc:int(32768)), ldc:int(0))) {
                                loopcontinue()
                            }
                            
                            var_1_93 = and:int(var_1_93:int, ldc:int(1809924907))
                        }
                        
                        Label_0257:
                        
                        if (cmpeq:boolean(and:int(var_1_93:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0230)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_93:int, ldc:int(32)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_1_93 = and:int(var_1_93:int, ldc:int(-739125335))
                        var_6_127 = invokevirtual:JsonArray(JsonElement::getAsJsonArray, invokevirtual:JsonElement(JsonObject::get, var_5_AB:JsonObject, loadelement:String(getstatic:String[](\u7006\u8709\u6435\u51b2\ucb79::\u97e6\u6198\u8258\u446c\ub7dc\u59ec), and:int(ldc:int(-23907), ldc:int(23874)))))
                        var_1_93 = and:int(var_1_93:int, ldc:int(330528767))
                        var_7_133 = invokevirtual:Iterator(JsonArray::iterator, var_6_127:JsonArray)
                        
                        loop {
                            if (cmpeq:boolean(and:int(var_1_93:int, ldc:int(2147483647)), ldc:int(0))) {
                                goto(Label_0373)
                            }
                            
                            if (cmpne:boolean(and:int(var_1_93:int, ldc:int(1)), ldc:int(0))) {
                                var_1_93 = and:int(var_1_93:int, ldc:int(-671484995))
                                
                                if (logicalnot:boolean(invokeinterface:boolean(Iterator::hasNext, var_7_133:Iterator))) {
                                    looporswitchbreak(Label_0441)
                                }
                            }
                            
                            Label_0338:
                            
                            if (cmpne:boolean(and:int(var_1_93:int, ldc:int(268435456)), ldc:int(0))) {
                                var_1_93 = and:int(var_1_93:int, ldc:int(-1755647497))
                            }
                            else {
                                if (cmpeq:boolean(and:int(var_1_93:int, ldc:int(8388608)), ldc:int(0))) {
                                    var_1_93 = and:int(var_1_93:int, ldc:int(-990178533))
                                    loopcontinue()
                                }
                                
                                var_1_93 = and:int(var_1_93:int, ldc:int(-946910405))
                            }
                            
                            Label_0373:
                            
                            if (cmpeq:boolean(and:int(var_1_93:int, ldc:int(8)), ldc:int(0))) {
                                var_1_93 = and:int(var_1_93:int, ldc:int(621043235))
                                goto(Label_0338)
                            }
                            
                            if (cmpeq:boolean(and:int(var_1_93:int, ldc:int(16384)), ldc:int(0))) {
                                var_1_93 = and:int(var_1_93:int, ldc:int(-181085269))
                            }
                            else {
                                var_1_93 = and:int(var_1_93:int, ldc:int(663872507))
                                invokeinterface:boolean(List<\ud12e\u946b\u97b7\u51b2\u3d64>::add, getfield:List<\ud12e\u946b\u97b7\u51b2\u3d64>(\u7006\u8709\u6435\u51b2\ucb79::\u8350\u4f52\u62da\ub19c\ubf56\u12cb, var_3_6C:\u7006\u8709\u6435\u51b2\ucb79), invokestatic:\ud12e\u946b\u97b7\u51b2\u3d64(\ud12e\u946b\u97b7\u51b2\u3d64::\ua6bd\u56bd\u7c6b\u4d85\uae87\u516c, invokevirtual:JsonObject(JsonElement::getAsJsonObject, checkcast:JsonElement(com.google.gson.JsonElement.class, invokeinterface:JsonElement(Iterator<JsonElement>::next, var_7_133:Iterator<JsonElement>)))))
                            }
                        }
                    }
                    
                    Label_0441:
                }
                catch (java.lang.Exception var_4_1C0) {
                    invokeinterface:void(Logger::error, getstatic:Logger(\u7006\u8709\u6435\u51b2\ucb79::\ud7e8\ua562\u0c95\u385b\u4f4a\u47c2), invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u7006\u8709\u6435\u51b2\ucb79::\u97e6\u6198\u8258\u446c\ub7dc\u59ec), and:int(ldc:int(13327), ldc:int(2465)))), invokevirtual:String(Throwable::getMessage, var_4_1C0:Exception[expected:Throwable]))))
                }
                
                looporswitchbreak()
            }
            
            return:\u7006\u8709\u6435\u51b2\ucb79(var_3_6C:\u7006\u8709\u6435\u51b2\ucb79)
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_5F : int
        expr_65 : byte[] [generated]
        stack_95_0 : byte[] [generated]
        stack_97_0 : byte[] [generated]
        stack_C3_0 : byte[] [generated]
        stack_C5_0 : byte[] [generated]
        stack_EE_0 : byte[] [generated]
        stack_1E0_0 : byte[] [generated]
        stack_235_0 : byte[] [generated]
        expr_6B : int [generated]
        var_4_155 : int
        var_3_15A : byte[]
        var_5_15B : int
        var_0_161 : int
        expr_16B : byte [generated]
        stack_1AF_2 : byte [generated]
        stack_18E_0 : byte [generated]
        var_0_7B : int
        var_0_8A : int
        var_2_95 : byte[]
        expr_99 : int [generated]
        var_3_1CF : byte[]
        var_5_1D0 : int
        expr_C5 : int [generated]
        var_3_224 : byte[]
        var_5_225 : int
        expr_23B : byte [generated]
        var_3_FA : String
        stack_148_0 : String[] [generated]
        expr_10C : String[] [generated]
        
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
            var_0_5F = and:int(ldc:int(1749965831), ldc:int(-843125714))
            expr_65 = stack_95_0 = stack_97_0 = stack_C3_0 = stack_C5_0 = stack_EE_0 = stack_1E0_0 = stack_235_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("d/q3aAGA8XCQ59eKKH8w6L8Jye4ZsGcR8BJKAPc+T+8ZeBCFbPR8"))
            expr_6B = arraylength:int(expr_65:byte[])
            
            if (cmpne:boolean(expr_6B:int, ldc:int(0))) {
                var_4_155 = expr_6B:int
                var_3_15A = newarray:byte[](byte.class, expr_6B:int)
                var_5_15B = expr_6B:int
                
                loop {
                    var_0_161 = and:int(var_0_5F:int, ldc:int(-839733794))
                    var_5_15B = add:int(var_5_15B:int, ldc:int(-1))
                    expr_16B = stack_1AF_2 = loadelement(expr_65, var_5_15B)
                    
                    if (cmplt:boolean(add:int(add:int(var_5_15B:int, ldc:int(4)), neg:int(var_4_155:int)), ldc:int(0))) {
                        stack_1AF_2 = stack_18E_0 = add:byte(expr_16B:byte, loadelement:byte(var_3_15A:byte[], add:int(var_5_15B:int, ldc:int(4))))
                        goto(Label_0414)
                    }
                    
                    Label_0376:
                    
                    if (cmpeq:boolean(and:int(var_0_161:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_0_161 = and:int(var_0_161:int, ldc:int(194500287))
                    }
                    else {
                        var_0_161 = and:int(var_0_161:int, ldc:int(-664277082))
                        stack_1AF_2 = stack_18E_0 = add:byte(expr_16B:byte, ldc:byte(4))
                    }
                    
                    Label_0414:
                    
                    if (cmpeq:boolean(and:int(var_0_161:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0376)
                    }
                    
                    var_0_5F = and:int(var_0_161:int, ldc:int(1597701135))
                    storeelement:byte(var_3_15A:byte[], var_5_15B:int, stack_1AF_2:byte)
                    
                    if (cmpne:boolean(var_5_15B:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_97_0 = stack_95_0 = stack_C3_0 = stack_C5_0 = stack_EE_0 = stack_1E0_0 = stack_235_0 = var_3_15A:byte[]
            }
            
            loop {
                if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(8192)), ldc:int(0))) {
                    var_0_7B = and:int(var_0_5F:int, ldc:int(1250212990))
                    goto(Label_0202)
                }
                
                if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(4)), ldc:int(0))) {
                    var_0_8A = and:int(var_0_5F:int, ldc:int(-665101866))
                }
                else {
                    var_0_8A = and:int(var_0_5F:int, ldc:int(-278201226))
                    var_2_95 = stack_95_0:byte[]
                    expr_99 = add:int(arraylength:int(stack_97_0:byte[]), ldc:int(-1))
                    
                    if (cmpne:boolean(expr_99:int, ldc:int(0))) {
                        var_3_1CF = newarray:byte[](byte.class, expr_99:int)
                        var_5_1D0 = expr_99:int
                        
                        loop {
                            var_0_8A = and:int(var_0_8A:int, ldc:int(-654943154))
                            var_5_1D0 = add:int(var_5_1D0:int, ldc:int(-1))
                            storeelement:byte(var_3_1CF:byte[], var_5_1D0:int, add:int(shl:int(loadelement:byte(stack_1E0_0:byte[], var_5_1D0:int), ldc:int(1)), and:int(shr:int(loadelement:byte(var_2_95:byte[], add:int(var_5_1D0:int, xor:int(ldc:int(204), ldc:int(205)))), ldc:int(7)), xor:int(ldc:int(562), ldc:int(563)))))
                            
                            if (cmpne:boolean(var_5_1D0:int, ldc:int(0))) {
                                loopcontinue()
                            }
                            
                            looporswitchbreak()
                        }
                        
                        stack_97_0 = stack_95_0 = stack_C3_0 = stack_C5_0 = stack_EE_0 = stack_1E0_0 = stack_235_0 = var_3_1CF:byte[]
                    }
                }
                
                Label_0158:
                
                if (cmpne:boolean(and:int(var_0_8A:int, ldc:int(128)), ldc:int(0))) {
                    var_0_7B = and:int(var_0_8A:int, ldc:int(434245804))
                }
                else {
                    if (cmpne:boolean(and:int(var_0_8A:int, ldc:int(2097152)), ldc:int(0))) {
                        var_0_5F = and:int(var_0_8A:int, ldc:int(1384935299))
                        loopcontinue()
                    }
                    
                    var_0_7B = and:int(var_0_8A:int, ldc:int(-575197185))
                    expr_C5 = arraylength:int(stack_C5_0:byte[])
                    
                    if (cmpne:boolean(expr_C5:int, ldc:int(0))) {
                        var_3_224 = newarray:byte[](byte.class, expr_C5:int)
                        var_5_225 = expr_C5:int
                        
                        loop {
                            var_0_7B = and:int(var_0_7B:int, ldc:int(1511468542))
                            var_5_225 = add:int(var_5_225:int, ldc:int(-1))
                            expr_23B = xor:byte(add:byte(loadelement:byte(stack_235_0:byte[], var_5_225:int), ldc:byte(77)), ldc:byte(9))
                            storeelement:byte(var_3_224:byte[], var_5_225:int, or:int(and:int(shl:int(expr_23B:byte, and:int(ldc:int(5124), ldc:int(2071))), ldc:int(-16)), and:int(shr:int(expr_23B:byte[expected:int], and:int(ldc:int(8196), ldc:int(3332))), ldc:int(15))))
                            
                            if (cmpne:boolean(var_5_225:int, ldc:int(0))) {
                                loopcontinue()
                            }
                            
                            looporswitchbreak()
                        }
                        
                        stack_97_0 = stack_95_0 = stack_C3_0 = stack_C5_0 = stack_EE_0 = stack_1E0_0 = stack_235_0 = var_3_224:byte[]
                    }
                }
                
                Label_0202:
                
                if (cmpne:boolean(and:int(var_0_7B:int, ldc:int(33554432)), ldc:int(0))) {
                    var_0_8A = and:int(var_0_7B:int, ldc:int(894957318))
                    goto(Label_0158)
                }
                
                if (cmpne:boolean(and:int(var_0_7B:int, ldc:int(131072)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_0_5F = and:int(var_0_7B:int, ldc:int(2097447110))
            }
            
            var_3_FA = initobject:String(String::<init>, stack_EE_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_148_0 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(1030), ldc:int(16402)))
            expr_10C = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(4362), ldc:int(18627)))
            storeelement:String(expr_10C:String[], and:int(ldc:int(129), ldc:int(26369)), invokevirtual:String[expected:String](String::substring, var_3_FA:String, and:int(ldc:int(16574), ldc:int(-24767)), and:int(ldc:int(4255), ldc:int(26687))))
            storeelement:String(expr_10C:String[], and:int(ldc:int(2230), ldc:int(-10423)), invokevirtual:String[expected:String](String::substring, var_3_FA:String, xor:int(ldc:int(566), ldc:int(553)), xor:int(ldc:int(1792), ldc:int(1830))))
            putstatic:String[](\u7006\u8709\u6435\u51b2\ucb79::\u97e6\u6198\u8258\u446c\ub7dc\u59ec, expr_10C:String[])
            putstatic:Logger(\u7006\u8709\u6435\u51b2\ucb79::\ud7e8\ua562\u0c95\u385b\u4f4a\u47c2, invokestatic:Logger(LogManager::getLogger))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u6c52\u983f\u7873\u92ff\ua068\u4c2b(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_6ED : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C3 : double
        var_3_D5 : int
        var_11_E6 : int
        var_14_110 : double
        var_16_114 : int
        var_12_10C : double
        var_17_6F8 : int
        
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
        var_3_6ED = and:int(ldc:int(-474348919), ldc:int(-440416515))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u7006\u8709\u6435\u51b2\ucb79[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_6ED:int, ldc:int(8388608)), ldc:int(0))) {
            var_3_6ED = and:int(var_3_6ED:int, ldc:int(188692667))
        }
        else {
            var_3_6ED = and:int(var_3_6ED:int, ldc:int(-440429357))
            var_5_85 = and:int(ldc:int(26304), ldc:int(-26310))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-10377), ldc:int(10376)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C3 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D5 = and:int(var_3_6ED:int, ldc:int(-373663553))
                    var_9_C3 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E6 = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E6:int, sub:int(var_6_8C:int, xor:int(ldc:int(4608), ldc:int(4609)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E6:int, and:int(ldc:int(16969), ldc:int(1189)))), var_7_9B:double))) {
                        inc:int(var_11_E6, ldc:int(1))
                    }
                    
                    var_3_6ED = and:int(var_3_D5:int, ldc:int(-440725851))
                    var_14_110 = var_7_9B:double
                    var_16_114 = var_11_E6:int
                }
                else {
                    var_11_E6 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), xor:int(ldc:int(1040), ldc:int(1041)))
                    var_12_10C = var_14_110 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_114 = var_11_E6:int, var_6_8C:int)) {
                        var_9_C3 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E6:int)
                        var_16_114 = var_11_E6:int
                        var_14_110 = var_12_10C:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_6ED:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_6ED = and:int(var_3_6ED:int, ldc:int(1497255663))
                        goto(Label_1647)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6ED:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_6ED = and:int(var_3_6ED:int, ldc:int(-1094252986))
                        goto(Label_1496)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6ED:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_6ED = and:int(var_3_6ED:int, ldc:int(-950315452))
                        goto(Label_1356)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6ED:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_6ED = and:int(var_3_6ED:int, ldc:int(-148202014))
                        goto(Label_1200)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6ED:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_6ED = and:int(var_3_6ED:int, ldc:int(2126820472))
                        goto(Label_1036)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6ED:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_6ED = and:int(var_3_6ED:int, ldc:int(-659134287))
                        goto(Label_0890)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6ED:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_6ED = and:int(var_3_6ED:int, ldc:int(-1640317068))
                        goto(Label_0736)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6ED:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0599)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6ED:int, ldc:int(128)), ldc:int(0))) {
                        var_3_6ED = and:int(var_3_6ED:int, ldc:int(1941597845))
                        
                        if (cmplt:boolean(var_16_114:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0599)
                            }
                            
                            goto(Label_0890)
                        }
                    }
                    
                    Label_0429:
                    
                    if (cmpne:boolean(and:int(var_3_6ED:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1647)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6ED:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_6ED = and:int(var_3_6ED:int, ldc:int(1590449002))
                        goto(Label_1496)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6ED:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_6ED = and:int(var_3_6ED:int, ldc:int(646620150))
                        goto(Label_1356)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6ED:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1200)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6ED:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_6ED = and:int(var_3_6ED:int, ldc:int(1778843382))
                        goto(Label_1036)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6ED:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0890)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6ED:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0736)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6ED:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6ED = and:int(var_3_6ED:int, ldc:int(343727223))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6ED:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_6ED = and:int(var_3_6ED:int, ldc:int(-1380060399))
                            loopcontinue()
                        }
                        
                        var_3_6ED = and:int(var_3_6ED:int, ldc:int(-1514172187))
                        var_11_E6 = and:int(ldc:int(-7355), ldc:int(7210))
                        goto(Label_1636)
                    }
                    
                    Label_0599:
                    
                    if (cmpne:boolean(and:int(var_3_6ED:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_6ED = and:int(var_3_6ED:int, ldc:int(-1112261442))
                        goto(Label_1647)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6ED:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_6ED = and:int(var_3_6ED:int, ldc:int(105540700))
                        goto(Label_1496)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6ED:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6ED = and:int(var_3_6ED:int, ldc:int(-329425166))
                        goto(Label_1356)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6ED:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1200)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6ED:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6ED = and:int(var_3_6ED:int, ldc:int(-1214919370))
                        goto(Label_1036)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6ED:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_6ED = and:int(var_3_6ED:int, ldc:int(-2067223344))
                        goto(Label_0890)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6ED:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_6ED:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_6ED = and:int(var_3_6ED:int, ldc:int(-1558889416))
                            goto(Label_0429)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6ED:int, ldc:int(1)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6ED = and:int(var_3_6ED:int, ldc:int(901444841))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_110 = var_9_C3:double
                            goto(Label_0890)
                        }
                    }
                    
                    Label_0736:
                    
                    if (cmpne:boolean(and:int(var_3_6ED:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1647)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6ED:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_6ED = and:int(var_3_6ED:int, ldc:int(163286666))
                        goto(Label_1496)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6ED:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_6ED = and:int(var_3_6ED:int, ldc:int(229244212))
                        goto(Label_1356)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6ED:int, ldc:int(32)), ldc:int(0))) {
                        var_3_6ED = and:int(var_3_6ED:int, ldc:int(-1451113380))
                        goto(Label_1200)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6ED:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1036)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6ED:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_6ED = and:int(var_3_6ED:int, ldc:int(603839446))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6ED:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_6ED = and:int(var_3_6ED:int, ldc:int(1534512523))
                            goto(Label_0599)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6ED:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_6ED = and:int(var_3_6ED:int, ldc:int(-1758673774))
                            goto(Label_0429)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6ED:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_6ED = and:int(var_3_6ED:int, ldc:int(-427776864))
                            loopcontinue()
                        }
                        
                        var_3_6ED = and:int(var_3_6ED:int, ldc:int(-507825529))
                        var_14_110 = mul:double(ldc:double(0.5), add:double(var_9_C3:double, var_14_110:double))
                    }
                    
                    Label_0890:
                    
                    if (cmpeq:boolean(and:int(var_3_6ED:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6ED = and:int(var_3_6ED:int, ldc:int(-169497448))
                        goto(Label_1647)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6ED:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1496)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6ED:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_6ED = and:int(var_3_6ED:int, ldc:int(20508736))
                        goto(Label_1356)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6ED:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_6ED = and:int(var_3_6ED:int, ldc:int(-840811214))
                        goto(Label_1200)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6ED:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_6ED = and:int(var_3_6ED:int, ldc:int(-1220465534))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6ED:int, ldc:int(128)), ldc:int(0))) {
                            var_3_6ED = and:int(var_3_6ED:int, ldc:int(-905880933))
                            goto(Label_0736)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6ED:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_6ED = and:int(var_3_6ED:int, ldc:int(-1275769860))
                            goto(Label_0599)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6ED:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_6ED = and:int(var_3_6ED:int, ldc:int(-1622456494))
                            goto(Label_0429)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6ED:int, ldc:int(131072)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6ED = and:int(var_3_6ED:int, ldc:int(1006255077))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_E6 = and:int(ldc:int(161), ldc:int(17411))
                                goto(Label_1200)
                            }
                        }
                    }
                    
                    Label_1036:
                    
                    if (cmpeq:boolean(and:int(var_3_6ED:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1647)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6ED:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_6ED = and:int(var_3_6ED:int, ldc:int(-1594350790))
                        goto(Label_1496)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6ED:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_6ED = and:int(var_3_6ED:int, ldc:int(1820192088))
                        goto(Label_1356)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6ED:int, ldc:int(2)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_6ED:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0890)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6ED:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_6ED = and:int(var_3_6ED:int, ldc:int(-153178458))
                            goto(Label_0736)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6ED:int, ldc:int(1)), ldc:int(0))) {
                            var_3_6ED = and:int(var_3_6ED:int, ldc:int(-903338821))
                            goto(Label_0599)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6ED:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_6ED = and:int(var_3_6ED:int, ldc:int(-753141585))
                            goto(Label_0429)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6ED:int, ldc:int(524288)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6ED = and:int(var_3_6ED:int, ldc:int(-201355015))
                        var_11_E6 = and:int(ldc:int(733), ldc:int(-734))
                    }
                    
                    Label_1200:
                    
                    if (cmpeq:boolean(and:int(var_3_6ED:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_6ED = and:int(var_3_6ED:int, ldc:int(1321287375))
                        goto(Label_1647)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6ED:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1496)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6ED:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_6ED = and:int(var_3_6ED:int, ldc:int(725790724))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6ED:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_6ED = and:int(var_3_6ED:int, ldc:int(-2090421697))
                            goto(Label_1036)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6ED:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_6ED = and:int(var_3_6ED:int, ldc:int(1086889497))
                            goto(Label_0890)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6ED:int, ldc:int(128)), ldc:int(0))) {
                            var_3_6ED = and:int(var_3_6ED:int, ldc:int(-1512150275))
                            goto(Label_0736)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6ED:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_6ED = and:int(var_3_6ED:int, ldc:int(253998019))
                            goto(Label_0599)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6ED:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_6ED = and:int(var_3_6ED:int, ldc:int(1609867590))
                            goto(Label_0429)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6ED:int, ldc:int(1)), ldc:int(0))) {
                            var_3_6ED = and:int(var_3_6ED:int, ldc:int(-1939798530))
                            loopcontinue()
                        }
                        
                        var_3_6ED = and:int(var_3_6ED:int, ldc:int(-1581335347))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E6:int, ldc:int(0))) {
                                goto(Label_1496)
                            }
                        }
                    }
                    
                    Label_1356:
                    
                    if (cmpne:boolean(and:int(var_3_6ED:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_6ED = and:int(var_3_6ED:int, ldc:int(-659839377))
                        goto(Label_1647)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6ED:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_6ED = and:int(var_3_6ED:int, ldc:int(-442830849))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6ED:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_1200)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6ED:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_1036)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6ED:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_6ED = and:int(var_3_6ED:int, ldc:int(-488533098))
                            goto(Label_0890)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6ED:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_6ED = and:int(var_3_6ED:int, ldc:int(1851334982))
                            goto(Label_0736)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6ED:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_6ED = and:int(var_3_6ED:int, ldc:int(-946977666))
                            goto(Label_0599)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6ED:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0429)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6ED:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_6ED = and:int(var_3_6ED:int, ldc:int(-369111557))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_110:double, var_5_85:int, var_16_114:int)
                            goto(Label_1636)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1496:
                    
                    if (cmpeq:boolean(and:int(var_3_6ED:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1647)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6ED:int, ldc:int(1)), ldc:int(0))) {
                        var_3_6ED = and:int(var_3_6ED:int, ldc:int(-1246235202))
                        goto(Label_1356)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6ED:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1200)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6ED:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_6ED = and:int(var_3_6ED:int, ldc:int(1188091394))
                        goto(Label_1036)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6ED:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0890)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6ED:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_6ED = and:int(var_3_6ED:int, ldc:int(1221334766))
                        goto(Label_0736)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6ED:int, ldc:int(32)), ldc:int(0))) {
                        var_3_6ED = and:int(var_3_6ED:int, ldc:int(-660196530))
                        goto(Label_0599)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6ED:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0429)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6ED:int, ldc:int(128)), ldc:int(0))) {
                        var_3_6ED = and:int(var_3_6ED:int, ldc:int(-1723127521))
                        loopcontinue()
                    }
                    
                    var_3_6ED = and:int(var_3_6ED:int, ldc:int(1908294095))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_110:double, ldc:double(0.0))
                    Label_1636:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_6F8 = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_E6:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1647:
                    
                    if (cmpeq:boolean(and:int(var_3_6ED:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6ED = and:int(var_3_6ED:int, ldc:int(-278289945))
                        goto(Label_1496)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6ED:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1356)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6ED:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_6ED = and:int(var_3_6ED:int, ldc:int(-1863777178))
                        goto(Label_1200)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6ED:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_6ED = and:int(var_3_6ED:int, ldc:int(-1356263991))
                        goto(Label_1036)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6ED:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0890)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6ED:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_6ED = and:int(var_3_6ED:int, ldc:int(-1679357490))
                        goto(Label_0736)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6ED:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0599)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6ED:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_6ED = and:int(var_3_6ED:int, ldc:int(1718072542))
                        goto(Label_0429)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6ED:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_6ED = and:int(var_3_6ED:int, ldc:int(-268515441))
                        var_17_6F8 = add:int(var_16_114:int, and:int(ldc:int(16453), ldc:int(11193)))
                        looporswitchbreak()
                    }
                    
                    var_3_6ED = and:int(var_3_6ED:int, ldc:int(1339900476))
                }
                
                var_3_6ED = and:int(var_3_6ED:int, ldc:int(-1212480111))
                
                if (cmple:boolean(var_5_85 = var_17_6F8:int, sub:int(var_6_8C:int, and:int(ldc:int(12805), ldc:int(1057))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpeq:boolean(and:int(var_3_6ED:int, ldc:int(4096)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
