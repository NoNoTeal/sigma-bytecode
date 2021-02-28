public class \u7c6b\u7c6b\ubefe\u385b\u3c25.\u600f\ud51e\u1833\u6bb9\u5f50 {
    public void \u600f\ud51e\u1833\u6bb9\u5f50() {
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
            invokespecial:\u9937\ubb2b\u600f\u6b0d\u74b1(\u9937\ubb2b\u600f\u6b0d\u74b1::<init>, this:\u600f\ud51e\u1833\u6bb9\u5f50)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static \u7c6b\u7c6b\ubefe\u385b\u3c25.\u600f\ud51e\u1833\u6bb9\u5f50 \u8350\u4d85\uc29a\u392e\u4ab3\ud217(com.google.gson.JsonObject p0) {
        var_1_21E : int
        var_3_6C : \u600f\ud51e\u1833\u6bb9\u5f50
        var_4_B6 : String
        var_5_13B : JsonElement
        var_4_226 : Exception
        
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
            var_1_21E = and:int(and:int(ldc:int(751739411), ldc:int(-1974536323)), ldc:int(1557114537))
            var_3_6C = initobject:\u600f\ud51e\u1833\u6bb9\u5f50(\u600f\ud51e\u1833\u6bb9\u5f50::<init>)
            
            try {
                loop {
                    if (cmpeq:boolean(and:int(var_1_21E:int, ldc:int(256)), ldc:int(0))) {
                        var_1_21E = and:int(var_1_21E:int, ldc:int(-251762137))
                        putfield:long(\u600f\ud51e\u1833\u6bb9\u5f50::\u8640\u59ec\u960f\u9033\u8cae\ud4fe, var_3_6C:\u600f\ud51e\u1833\u6bb9\u5f50, invokestatic:long(\u183a\u600f\uf9c5\u4bc8\u647c::\u6d69\u4bc8\u8350\ubb2b\u7d52\u7049, loadelement:String(getstatic:String[](\u600f\ud51e\u1833\u6bb9\u5f50::\u1187\u6bb9\u759a\ud7e8\u97e6\u120d), and:int(ldc:int(22807), ldc:int(-23392))), p0:JsonObject, ldc:long(-1L)))
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_21E:int, ldc:int(32)), ldc:int(0))) {
                        looporswitchbreak()
                    }
                    
                    var_1_21E = and:int(var_1_21E:int, ldc:int(623023642))
                }
                
                var_1_21E = and:int(var_1_21E:int, ldc:int(-1252082057))
                var_4_B6 = invokestatic:String(\u183a\u600f\uf9c5\u4bc8\u647c::\u600f\u071d\u5d20\u8413\u8308\u4daf, loadelement:String(getstatic:String[](\u600f\ud51e\u1833\u6bb9\u5f50::\u1187\u6bb9\u759a\ud7e8\u97e6\u120d), and:int(ldc:int(16385), ldc:int(11591))), p0:JsonObject, checkcast:String(java.lang.String.class, aconstnull:String()))
                
                loop {
                    if (cmpeq:boolean(and:int(var_1_21E:int, ldc:int(262144)), ldc:int(0))) {
                        var_1_21E = and:int(var_1_21E:int, ldc:int(-1930098393))
                        goto(Label_0509)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_21E:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_1_21E = and:int(var_1_21E:int, ldc:int(-730716192))
                        goto(Label_0265)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_21E:int, ldc:int(2097152)), ldc:int(0))) {
                        var_1_21E = and:int(var_1_21E:int, ldc:int(1574844177))
                        
                        if (cmpeq:boolean(var_4_B6:String, aconstnull:String())) {
                            putfield:List<String>(\u600f\ud51e\u1833\u6bb9\u5f50::\u4e72\uc87f\u7af6\ub7dc\uc84e\u97e6, var_3_6C:\u600f\ud51e\u1833\u6bb9\u5f50, invokestatic:ArrayList[expected:List<String>](Lists::newArrayList))
                            goto(Label_0509)
                        }
                    }
                    
                    Label_0231:
                    
                    if (cmpeq:boolean(and:int(var_1_21E:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0509)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_21E:int, ldc:int(2097152)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_1_21E:int, ldc:int(4194304)), ldc:int(0))) {
                            var_1_21E = and:int(var_1_21E:int, ldc:int(-1352444929))
                            loopcontinue()
                        }
                        
                        var_1_21E = and:int(var_1_21E:int, ldc:int(-689036719))
                    }
                    
                    Label_0265:
                    
                    if (cmpne:boolean(and:int(var_1_21E:int, ldc:int(4)), ldc:int(0))) {
                        var_1_21E = and:int(var_1_21E:int, ldc:int(-434413668))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_1_21E:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0231)
                        }
                        
                        if (cmpne:boolean(and:int(var_1_21E:int, ldc:int(256)), ldc:int(0))) {
                            var_1_21E = and:int(var_1_21E:int, ldc:int(1462058426))
                            loopcontinue()
                        }
                        
                        var_1_21E = and:int(var_1_21E:int, ldc:int(963526447))
                        var_5_13B = invokevirtual:JsonElement(JsonParser::parse, getstatic:JsonParser(\u600f\ud51e\u1833\u6bb9\u5f50::\u9255\u5f50\u74b1\u6b5f\u0800\u4975), var_4_B6:String)
                        
                        loop {
                            if (cmpne:boolean(and:int(var_1_21E:int, ldc:int(268435456)), ldc:int(0))) {
                                goto(Label_0461)
                            }
                            
                            if (cmpne:boolean(and:int(var_1_21E:int, ldc:int(1073741824)), ldc:int(0))) {
                                var_1_21E = and:int(var_1_21E:int, ldc:int(-13089243))
                                goto(Label_0401)
                            }
                            
                            if (cmpeq:boolean(and:int(var_1_21E:int, ldc:int(4194304)), ldc:int(0))) {
                                var_1_21E = and:int(var_1_21E:int, ldc:int(-2018692100))
                            }
                            else {
                                var_1_21E = and:int(var_1_21E:int, ldc:int(-1680874513))
                                
                                if (logicalnot:boolean(invokevirtual:boolean(JsonElement::isJsonArray, var_5_13B:JsonElement))) {
                                    putfield:List<String>(\u600f\ud51e\u1833\u6bb9\u5f50::\u4e72\uc87f\u7af6\ub7dc\uc84e\u97e6, var_3_6C:\u600f\ud51e\u1833\u6bb9\u5f50, invokestatic:ArrayList[expected:List<String>](Lists::newArrayList))
                                    goto(Label_0461)
                                }
                            }
                            
                            Label_0367:
                            
                            if (cmpne:boolean(and:int(var_1_21E:int, ldc:int(16384)), ldc:int(0))) {
                                goto(Label_0461)
                            }
                            
                            if (cmpeq:boolean(and:int(var_1_21E:int, ldc:int(64)), ldc:int(0))) {
                                if (cmpne:boolean(and:int(var_1_21E:int, ldc:int(268435456)), ldc:int(0))) {
                                    var_1_21E = and:int(var_1_21E:int, ldc:int(523848718))
                                    loopcontinue()
                                }
                                
                                var_1_21E = and:int(var_1_21E:int, ldc:int(-52531205))
                            }
                            
                            Label_0401:
                            
                            if (cmpne:boolean(and:int(var_1_21E:int, ldc:int(262144)), ldc:int(0))) {
                                if (cmpeq:boolean(and:int(var_1_21E:int, ldc:int(2147483647)), ldc:int(0))) {
                                    var_1_21E = and:int(var_1_21E:int, ldc:int(-1779007422))
                                    goto(Label_0367)
                                }
                                
                                if (cmpeq:boolean(and:int(var_1_21E:int, ldc:int(262144)), ldc:int(0))) {
                                    loopcontinue()
                                }
                                
                                var_1_21E = and:int(var_1_21E:int, ldc:int(1467904705))
                                putfield:List<String>(\u600f\ud51e\u1833\u6bb9\u5f50::\u4e72\uc87f\u7af6\ub7dc\uc84e\u97e6, var_3_6C:\u600f\ud51e\u1833\u6bb9\u5f50, invokestatic:List<String>(\u600f\ud51e\u1833\u6bb9\u5f50::\ufe34\ubded\u4f52\u8350\u983f\u56bd, invokevirtual:JsonArray(JsonElement::getAsJsonArray, var_5_13B:JsonElement)))
                            }
                            
                            Label_0461:
                            
                            if (cmpne:boolean(and:int(var_1_21E:int, ldc:int(1073741824)), ldc:int(0))) {
                                goto(Label_0401)
                            }
                            
                            if (cmpne:boolean(and:int(var_1_21E:int, ldc:int(2097152)), ldc:int(0))) {
                                var_1_21E = and:int(var_1_21E:int, ldc:int(-1927468132))
                                goto(Label_0367)
                            }
                            
                            if (cmpeq:boolean(and:int(var_1_21E:int, ldc:int(2097152)), ldc:int(0))) {
                                looporswitchbreak()
                            }
                        }
                        
                        var_1_21E = and:int(var_1_21E:int, ldc:int(243187385))
                    }
                    
                    Label_0509:
                    
                    if (cmpne:boolean(and:int(var_1_21E:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0265)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_21E:int, ldc:int(16384)), ldc:int(0))) {
                        var_1_21E = and:int(var_1_21E:int, ldc:int(3132015))
                        goto(Label_0231)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_21E:int, ldc:int(268435456)), ldc:int(0))) {
                        looporswitchbreak()
                    }
                }
                
                var_1_21E = and:int(var_1_21E:int, ldc:int(533669787))
            }
            catch (java.lang.Exception var_4_226) {
                invokeinterface:void(Logger::error, getstatic:Logger(\u600f\ud51e\u1833\u6bb9\u5f50::\u760c\u6d99\uc910\u1833\u760c\ub6ab), invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u600f\ud51e\u1833\u6bb9\u5f50::\u1187\u6bb9\u759a\ud7e8\u97e6\u120d), and:int(ldc:int(1159), ldc:int(6402)))), invokevirtual:String(Throwable::getMessage, var_4_226:Exception[expected:Throwable]))))
            }
            
            return:\u600f\ud51e\u1833\u6bb9\u5f50(var_3_6C:\u600f\ud51e\u1833\u6bb9\u5f50)
        }
        
        goto(Label_0006)
    }
    
    private static java.util.List<java.lang.String> \ufe34\ubded\u4f52\u8350\u983f\u56bd(com.google.gson.JsonArray p0) {
        var_1_64 : int
        var_3_68 : ArrayList
        var_1_6D : int
        var_4_72 : Iterator
        var_1_CD : int
        var_5_A8 : JsonElement
        
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
            var_1_64 = and:int(and:int(ldc:int(1824227313), ldc:int(1274736119)), ldc:int(949977087))
            var_3_68 = invokestatic:ArrayList(Lists::newArrayList)
            var_1_6D = and:int(var_1_64:int, ldc:int(1556000240))
            var_4_72 = invokevirtual:Iterator(JsonArray::iterator, p0:JsonArray)
            
            loop {
                if (cmpeq:boolean(and:int(var_1_6D:int, ldc:int(8388608)), ldc:int(0))) {
                    var_1_6D = and:int(var_1_6D:int, ldc:int(-544361676))
                }
                else {
                    var_1_6D = and:int(var_1_6D:int, ldc:int(383778807))
                    
                    if (logicalnot:boolean(invokeinterface:boolean(Iterator::hasNext, var_4_72:Iterator))) {
                        looporswitchbreak()
                    }
                }
                
                if (cmpeq:boolean(and:int(var_1_6D:int, ldc:int(268435456)), ldc:int(0))) {
                    var_1_CD = and:int(var_1_6D:int, ldc:int(1992027636))
                    var_5_A8 = checkcast:JsonElement(com.google.gson.JsonElement.class, invokeinterface:JsonElement(Iterator<JsonElement>::next, var_4_72:Iterator<JsonElement>))
                    
                    try {
                        do {
                            if (cmpne:boolean(and:int(var_1_CD:int, ldc:int(64)), ldc:int(0))) {
                                var_1_CD = and:int(var_1_CD:int, ldc:int(-1462009867))
                                invokeinterface:boolean(List<String>::add, var_3_68:ArrayList<String>[expected:List<String>], invokevirtual:String(JsonElement::getAsString, var_5_A8:JsonElement))
                            }
                        } while (cmpeq:boolean(and:int(var_1_CD:int, ldc:int(524288)), ldc:int(0)))
                        
                        var_1_CD = and:int(var_1_CD:int, ldc:int(-509727240))
                    }
                    catch (java.lang.Exception stack_D5_0) {
                    }
                    
                    var_1_6D = and:int(var_1_CD:int, ldc:int(-824529416))
                }
            }
            
            return:List<String>(var_3_68:ArrayList<String>)
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_221 : int
        expr_65 : byte[] [generated]
        var_2_69 : byte[]
        stack_96_0 : byte[] [generated]
        stack_98_0 : byte[] [generated]
        stack_C9_0 : byte[] [generated]
        stack_CB_0 : byte[] [generated]
        stack_104_0 : byte[] [generated]
        stack_106_0 : byte[] [generated]
        stack_12E_0 : byte[] [generated]
        stack_234_0 : byte[] [generated]
        stack_29B_0 : byte[] [generated]
        stack_317_0 : byte[] [generated]
        expr_6D : int [generated]
        var_3_1BC : byte[]
        var_4_1BD : int
        expr_98 : int [generated]
        var_5_20D : int
        var_3_212 : byte[]
        var_4_213 : int
        expr_237 : byte [generated]
        var_0_2B4 : int
        expr_29B : byte [generated]
        stack_2E2_2 : byte [generated]
        stack_2B7_0 : byte [generated]
        expr_CB : int [generated]
        expr_106 : int [generated]
        var_3_305 : byte[]
        var_4_306 : int
        var_3_13A : String
        stack_1A3_0 : String[] [generated]
        expr_14C : String[] [generated]
        
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
            var_0_221 = and:int(ldc:int(1690808424), ldc:int(1668262905))
            expr_65 = var_2_69 = stack_96_0 = stack_98_0 = stack_C9_0 = stack_CB_0 = stack_104_0 = stack_106_0 = stack_12E_0 = stack_234_0 = stack_29B_0 = stack_317_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("Cz1cOJNABmmQXhtKXD2NigAkQUdmizwpXDBfgz4haUFTaDhPY4CHEQ5BaUFTaDhPbF5MSVwwWGsyr8A="))
            expr_6D = add:int(arraylength:int(expr_65:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_6D:int, ldc:int(0))) {
                var_3_1BC = newarray:byte[](byte.class, expr_6D:int)
                var_4_1BD = expr_6D:int
                
                loop {
                    var_0_221 = and:int(var_0_221:int, ldc:int(538932843))
                    var_4_1BD = add:int(var_4_1BD:int, ldc:int(-1))
                    storeelement:byte(var_3_1BC:byte[], var_4_1BD:int, add:int(shl:int(loadelement:byte(expr_65:byte[], var_4_1BD:int), ldc:int(4)), and:int(shr:int(loadelement:byte(var_2_69:byte[], add:int(var_4_1BD:int, xor:int(ldc:int(-31704), ldc:int(-31703)))), ldc:int(4)), and:int(ldc:int(9311), ldc:int(783)))))
                    
                    if (cmpne:boolean(var_4_1BD:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_98_0 = stack_96_0 = stack_C9_0 = stack_CB_0 = stack_104_0 = stack_106_0 = stack_12E_0 = stack_234_0 = stack_29B_0 = stack_317_0 = var_3_1BC:byte[]
            }
            
            loop {
                if (cmpne:boolean(and:int(var_0_221:int, ldc:int(134217728)), ldc:int(0))) {
                    goto(Label_0267)
                }
                
                if (cmpne:boolean(and:int(var_0_221:int, ldc:int(268435456)), ldc:int(0))) {
                    goto(Label_0208)
                }
                
                if (cmpne:boolean(and:int(var_0_221:int, ldc:int(1024)), ldc:int(0))) {
                    var_0_221 = and:int(var_0_221:int, ldc:int(1053977624))
                    goto(Label_0157)
                }
                
                var_0_221 = and:int(var_0_221:int, ldc:int(-1137740418))
                expr_98 = arraylength:int(stack_98_0:byte[])
                
                if (cmpeq:boolean(expr_98:int, ldc:int(0))) {
                    goto(Label_0157)
                }
                
                var_5_20D = expr_98:int
                var_3_212 = newarray:byte[](byte.class, expr_98:int)
                var_4_213 = expr_98:int
                Label_0533:
                
                while (cmpne:boolean(and:int(var_0_221:int, ldc:int(536870912)), ldc:int(0))) {
                    var_0_221 = and:int(var_0_221:int, ldc:int(-427344407))
                    var_4_213 = add:int(var_4_213:int, ldc:int(-1))
                    expr_237 = add:byte(loadelement:byte(stack_234_0:byte[], var_4_213:int), ldc:byte(59))
                    storeelement:byte(var_3_212:byte[], var_4_213:int, or:int(and:int(shl:int(expr_237:byte, and:int(ldc:int(12054), ldc:int(4164))), ldc:int(-16)), and:int(shr:int(expr_237:byte[expected:int], and:int(ldc:int(24580), ldc:int(4788))), ldc:int(15))))
                    
                    if (cmpne:boolean(var_4_213:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    stack_98_0 = stack_96_0 = stack_C9_0 = stack_CB_0 = stack_104_0 = stack_106_0 = stack_12E_0 = stack_234_0 = stack_29B_0 = stack_317_0 = var_3_212:byte[]
                    goto(Label_0157)
                }
                
                var_0_221 = and:int(var_0_221:int, ldc:int(1647027370))
                Label_0636:
                
                while (cmpne:boolean(and:int(var_0_221:int, ldc:int(262144)), ldc:int(0))) {
                    var_0_2B4 = and:int(var_0_221:int, ldc:int(557808245))
                    var_4_213 = add:int(var_4_213:int, ldc:int(-1))
                    expr_29B = stack_2E2_2 = loadelement(stack_29B_0, var_4_213)
                    
                    if (cmplt:boolean(add:int(add:int(var_4_213:int, ldc:int(2)), neg:int(var_5_20D:int)), ldc:int(0))) {
                        stack_2E2_2 = stack_2B7_0 = add:byte(expr_29B:byte, loadelement:byte(var_3_212:byte[], add:int(var_4_213:int, ldc:int(2))))
                        goto(Label_0711)
                    }
                    
                    Label_0680:
                    
                    if (cmpeq:boolean(and:int(var_0_2B4:int, ldc:int(512)), ldc:int(0))) {
                        var_0_2B4 = and:int(var_0_2B4:int, ldc:int(-1079025049))
                        stack_2E2_2 = stack_2B7_0 = add:byte(expr_29B:byte, ldc:byte(2))
                    }
                    
                    Label_0711:
                    
                    if (cmpeq:boolean(and:int(var_0_2B4:int, ldc:int(262144)), ldc:int(0))) {
                        var_0_2B4 = and:int(var_0_2B4:int, ldc:int(-89114894))
                        goto(Label_0680)
                    }
                    
                    var_0_221 = and:int(var_0_2B4:int, ldc:int(691353828))
                    storeelement:byte(var_3_212:byte[], var_4_213:int, stack_2E2_2:byte)
                    
                    if (cmpne:boolean(var_4_213:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    stack_98_0 = stack_96_0 = stack_C9_0 = stack_CB_0 = stack_104_0 = stack_106_0 = stack_12E_0 = stack_234_0 = stack_29B_0 = stack_317_0 = var_3_212:byte[]
                    goto(Label_0208)
                }
                
                var_0_221 = and:int(var_0_221:int, ldc:int(199904876))
                goto(Label_0533)
                Label_0157:
                
                if (cmpne:boolean(and:int(var_0_221:int, ldc:int(512)), ldc:int(0))) {
                    var_0_221 = and:int(var_0_221:int, ldc:int(-2024070619))
                    goto(Label_0267)
                }
                
                if (cmpeq:boolean(and:int(var_0_221:int, ldc:int(536870912)), ldc:int(0))) {
                    var_0_221 = and:int(var_0_221:int, ldc:int(-1904025124))
                }
                else {
                    if (cmpne:boolean(and:int(var_0_221:int, ldc:int(2048)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_0_221 = and:int(var_0_221:int, ldc:int(826635512))
                    expr_CB = arraylength:int(stack_CB_0:byte[])
                    
                    if (cmpne:boolean(expr_CB:int, ldc:int(0))) {
                        var_5_20D = expr_CB:int
                        var_3_212 = newarray:byte[](byte.class, expr_CB:int)
                        var_4_213 = expr_CB:int
                        goto(Label_0636)
                    }
                }
                
                Label_0208:
                
                if (cmpne:boolean(and:int(var_0_221:int, ldc:int(512)), ldc:int(0))) {
                    var_0_221 = and:int(var_0_221:int, ldc:int(-1937641141))
                }
                else {
                    if (cmpne:boolean(and:int(var_0_221:int, ldc:int(2048)), ldc:int(0))) {
                        var_0_221 = and:int(var_0_221:int, ldc:int(-1001799935))
                        goto(Label_0157)
                    }
                    
                    if (cmpeq:boolean(and:int(var_0_221:int, ldc:int(8192)), ldc:int(0))) {
                        var_0_221 = and:int(var_0_221:int, ldc:int(-481140480))
                        loopcontinue()
                    }
                    
                    var_0_221 = and:int(var_0_221:int, ldc:int(-1412602627))
                    expr_106 = arraylength:int(stack_106_0:byte[])
                    
                    if (cmpne:boolean(expr_106:int, ldc:int(0))) {
                        var_3_305 = newarray:byte[](byte.class, expr_106:int)
                        var_4_306 = expr_106:int
                        
                        loop {
                            var_0_221 = and:int(var_0_221:int, ldc:int(591211245))
                            var_4_306 = add:int(var_4_306:int, ldc:int(-1))
                            storeelement:byte(var_3_305:byte[], var_4_306:int, xor:byte(loadelement:byte(stack_317_0:byte[], var_4_306:int), ldc:byte(17)))
                            
                            if (cmpne:boolean(var_4_306:int, ldc:int(0))) {
                                loopcontinue()
                            }
                            
                            looporswitchbreak()
                        }
                        
                        stack_98_0 = stack_96_0 = stack_C9_0 = stack_CB_0 = stack_104_0 = stack_106_0 = stack_12E_0 = stack_234_0 = stack_29B_0 = stack_317_0 = var_3_305:byte[]
                    }
                }
                
                Label_0267:
                
                if (cmpne:boolean(and:int(var_0_221:int, ldc:int(134217728)), ldc:int(0))) {
                    goto(Label_0208)
                }
                
                if (cmpeq:boolean(and:int(var_0_221:int, ldc:int(2147483647)), ldc:int(0))) {
                    goto(Label_0157)
                }
                
                if (cmpeq:boolean(and:int(var_0_221:int, ldc:int(16384)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_0_221 = and:int(var_0_221:int, ldc:int(1432064625))
            }
            
            var_3_13A = initobject:String(String::<init>, stack_12E_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_1A3_0 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(10498), ldc:int(10497)))
            expr_14C = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(-16383), ldc:int(-16382)))
            storeelement:String(expr_14C:String[], xor:int(ldc:int(6400), ldc:int(6402)), invokevirtual:String[expected:String](String::substring, var_3_13A:String, and:int(ldc:int(11286), ldc:int(-11543)), and:int(ldc:int(61), ldc:int(11690))))
            storeelement:String(expr_14C:String[], and:int(ldc:int(12289), ldc:int(16459)), invokevirtual:String[expected:String](String::substring, var_3_13A:String, and:int(ldc:int(168), ldc:int(25643)), xor:int(ldc:int(550), ldc:int(532))))
            storeelement:String(expr_14C:String[], and:int(ldc:int(-18762), ldc:int(18761)), invokevirtual:String[expected:String](String::substring, var_3_13A:String, xor:int(ldc:int(16385), ldc:int(16435)), and:int(ldc:int(8634), ldc:int(22654))))
            putstatic:String[](\u600f\ud51e\u1833\u6bb9\u5f50::\u1187\u6bb9\u759a\ud7e8\u97e6\u120d, expr_14C:String[])
            putstatic:Logger(\u600f\ud51e\u1833\u6bb9\u5f50::\u760c\u6d99\uc910\u1833\u760c\ub6ab, invokestatic:Logger(LogManager::getLogger))
            putstatic:JsonParser(\u600f\ud51e\u1833\u6bb9\u5f50::\u9255\u5f50\u74b1\u6b5f\u0800\u4975, initobject:JsonParser(JsonParser::<init>))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u6c52\u983f\u7873\u92ff\ua068\u4c2b(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_61F : int
        var_5_89 : int
        var_6_90 : int
        var_7_9F : double
        var_9_C7 : double
        var_3_D9 : int
        var_11_EA : int
        var_14_114 : double
        var_16_118 : int
        var_12_110 : double
        var_17_62A : int
        
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
        var_3_61F = and:int(ldc:int(2101589855), ldc:int(1024458700))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u600f\ud51e\u1833\u6bb9\u5f50[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0179)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_61F:int, ldc:int(2097152)), ldc:int(0))) {
            var_3_61F = and:int(var_3_61F:int, ldc:int(-483013694))
        }
        else {
            var_3_61F = and:int(var_3_61F:int, ldc:int(1039119759))
            var_5_89 = and:int(ldc:int(-17817), ldc:int(1432))
            var_6_90 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9F = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-23312), ldc:int(6925)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C7 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D9 = and:int(var_3_61F:int, ldc:int(-1656750324))
                    var_9_C7 = sub:double(var_7_9F:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EA = var_5_89:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EA:int, sub:int(var_6_90:int, xor:int(ldc:int(68), ldc:int(69)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EA:int, xor:int(ldc:int(8224), ldc:int(8225)))), var_7_9F:double))) {
                        inc:int(var_11_EA, ldc:int(1))
                    }
                    
                    var_3_61F = and:int(var_3_D9:int, ldc:int(1542193036))
                    var_14_114 = var_7_9F:double
                    var_16_118 = var_11_EA:int
                }
                else {
                    var_11_EA = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_89:int), xor:int(ldc:int(2193), ldc:int(2192)))
                    var_12_110 = var_14_114 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_89)
                    
                    if (cmplt:boolean(var_16_118 = var_11_EA:int, var_6_90:int)) {
                        var_9_C7 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EA:int)
                        var_16_118 = var_11_EA:int
                        var_14_114 = var_12_110:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_61F:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_61F = and:int(var_3_61F:int, ldc:int(1458505888))
                        goto(Label_1477)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61F:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_61F = and:int(var_3_61F:int, ldc:int(-1171318159))
                        goto(Label_1351)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_61F = and:int(var_3_61F:int, ldc:int(1884684738))
                        goto(Label_1229)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_61F = and:int(var_3_61F:int, ldc:int(1927496914))
                        goto(Label_1101)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0939)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0794)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61F:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0671)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_61F = and:int(var_3_61F:int, ldc:int(570029299))
                        goto(Label_0553)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61F:int, ldc:int(8)), ldc:int(0))) {
                        var_3_61F = and:int(var_3_61F:int, ldc:int(465551247))
                        
                        if (cmplt:boolean(var_16_118:int, var_6_90:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0553)
                            }
                            
                            goto(Label_0794)
                        }
                    }
                    
                    Label_0413:
                    
                    if (cmpne:boolean(and:int(var_3_61F:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1477)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61F:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1351)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_61F = and:int(var_3_61F:int, ldc:int(-833952029))
                        goto(Label_1229)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1101)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0939)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0794)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61F:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0671)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61F:int, ldc:int(134217728)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_61F:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_61F = and:int(var_3_61F:int, ldc:int(1534359401))
                            loopcontinue()
                        }
                        
                        var_3_61F = and:int(var_3_61F:int, ldc:int(1037549518))
                        var_11_EA = and:int(ldc:int(-2913), ldc:int(2912))
                        goto(Label_1466)
                    }
                    
                    Label_0553:
                    
                    if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1477)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61F:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_61F = and:int(var_3_61F:int, ldc:int(-1216670344))
                        goto(Label_1351)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_61F = and:int(var_3_61F:int, ldc:int(678665438))
                        goto(Label_1229)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1101)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0939)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_61F = and:int(var_3_61F:int, ldc:int(-169092541))
                        goto(Label_0794)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(4)), ldc:int(0))) {
                        var_3_61F = and:int(var_3_61F:int, ldc:int(-169410660))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0413)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61F:int, ldc:int(262144)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_61F = and:int(var_3_61F:int, ldc:int(-1690321012))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_114 = var_9_C7:double
                            goto(Label_0794)
                        }
                    }
                    
                    Label_0671:
                    
                    if (cmpne:boolean(and:int(var_3_61F:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1477)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(256)), ldc:int(0))) {
                        var_3_61F = and:int(var_3_61F:int, ldc:int(-1475494329))
                        goto(Label_1351)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1229)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1101)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61F:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_61F = and:int(var_3_61F:int, ldc:int(-1626034493))
                        goto(Label_0939)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61F:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_61F = and:int(var_3_61F:int, ldc:int(1531029907))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_61F = and:int(var_3_61F:int, ldc:int(-156496032))
                            goto(Label_0553)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0413)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(8192)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_61F = and:int(var_3_61F:int, ldc:int(2097411852))
                        var_14_114 = mul:double(ldc:double(0.5), add:double(var_9_C7:double, var_14_114:double))
                    }
                    
                    Label_0794:
                    
                    if (cmpne:boolean(and:int(var_3_61F:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1477)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_61F = and:int(var_3_61F:int, ldc:int(100933354))
                        goto(Label_1351)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61F:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_61F = and:int(var_3_61F:int, ldc:int(398852583))
                        goto(Label_1229)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61F:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_61F = and:int(var_3_61F:int, ldc:int(-63196122))
                        goto(Label_1101)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61F:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_61F = and:int(var_3_61F:int, ldc:int(-1834318485))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_61F = and:int(var_3_61F:int, ldc:int(1464005913))
                            goto(Label_0671)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(4)), ldc:int(0))) {
                            var_3_61F = and:int(var_3_61F:int, ldc:int(370635787))
                            goto(Label_0553)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61F:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0413)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_61F = and:int(var_3_61F:int, ldc:int(-1712937270))
                            loopcontinue()
                        }
                        
                        var_3_61F = and:int(var_3_61F:int, ldc:int(-1116228099))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_89:int), var_7_9F:double)) {
                                var_11_EA = xor:int(ldc:int(-27136), ldc:int(-27135))
                                goto(Label_1101)
                            }
                        }
                    }
                    
                    Label_0939:
                    
                    if (cmpne:boolean(and:int(var_3_61F:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_61F = and:int(var_3_61F:int, ldc:int(863771535))
                        goto(Label_1477)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_61F = and:int(var_3_61F:int, ldc:int(-2033062328))
                        goto(Label_1351)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_61F = and:int(var_3_61F:int, ldc:int(-702679947))
                        goto(Label_1229)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61F:int, ldc:int(4)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_61F:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0794)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61F:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_61F = and:int(var_3_61F:int, ldc:int(-1675289607))
                            goto(Label_0671)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0553)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_61F = and:int(var_3_61F:int, ldc:int(12908431))
                            goto(Label_0413)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(8192)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_61F = and:int(var_3_61F:int, ldc:int(520879454))
                        var_11_EA = and:int(ldc:int(-10459), ldc:int(8402))
                    }
                    
                    Label_1101:
                    
                    if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1477)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1351)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61F:int, ldc:int(4096)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_61F:int, ldc:int(128)), ldc:int(0))) {
                            var_3_61F = and:int(var_3_61F:int, ldc:int(-292136319))
                            goto(Label_0939)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0794)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(4)), ldc:int(0))) {
                            var_3_61F = and:int(var_3_61F:int, ldc:int(141100135))
                            goto(Label_0671)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61F:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_61F = and:int(var_3_61F:int, ldc:int(1100354677))
                            goto(Label_0553)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61F:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_61F = and:int(var_3_61F:int, ldc:int(156668876))
                            goto(Label_0413)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_61F = and:int(var_3_61F:int, ldc:int(368610464))
                            loopcontinue()
                        }
                        
                        var_3_61F = and:int(var_3_61F:int, ldc:int(488895966))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EA:int, ldc:int(0))) {
                                goto(Label_1351)
                            }
                        }
                    }
                    
                    Label_1229:
                    
                    if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1477)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(128)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_61F = and:int(var_3_61F:int, ldc:int(2136854639))
                            goto(Label_1101)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0939)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0794)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0671)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_61F = and:int(var_3_61F:int, ldc:int(-1376991154))
                            goto(Label_0553)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0413)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61F:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_61F = and:int(var_3_61F:int, ldc:int(-1514934953))
                            loopcontinue()
                        }
                        
                        var_3_61F = and:int(var_3_61F:int, ldc:int(1570766813))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_114:double, var_5_89:int, var_16_118:int)
                        goto(Label_1466)
                    }
                    
                    Label_1351:
                    
                    if (cmpne:boolean(and:int(var_3_61F:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1477)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1229)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_61F = and:int(var_3_61F:int, ldc:int(1327044377))
                        goto(Label_1101)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0939)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0794)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0671)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0553)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0413)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(8)), ldc:int(0))) {
                        var_3_61F = and:int(var_3_61F:int, ldc:int(146962800))
                        loopcontinue()
                    }
                    
                    var_3_61F = and:int(var_3_61F:int, ldc:int(528203055))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_114:double, ldc:double(0.0))
                    Label_1466:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_62A = var_5_89:int
                        
                        if (cmpeq:boolean(var_11_EA:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1477:
                    
                    if (cmpne:boolean(and:int(var_3_61F:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1351)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1229)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_61F = and:int(var_3_61F:int, ldc:int(-292223920))
                        goto(Label_1101)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0939)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_61F = and:int(var_3_61F:int, ldc:int(-2023060439))
                        goto(Label_0794)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61F:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0671)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0553)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0413)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61F:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_61F = and:int(var_3_61F:int, ldc:int(2038431678))
                        var_17_62A = add:int(var_16_118:int, xor:int(ldc:int(1098), ldc:int(1099)))
                        looporswitchbreak()
                    }
                }
                
                var_3_61F = and:int(var_3_61F:int, ldc:int(1502345196))
                
                if (cmple:boolean(var_5_89 = var_17_62A:int, sub:int(var_6_90:int, xor:int(ldc:int(4233), ldc:int(4232))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0179:
        
        if (cmpne:boolean(and:int(var_3_61F:int, ldc:int(8)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
