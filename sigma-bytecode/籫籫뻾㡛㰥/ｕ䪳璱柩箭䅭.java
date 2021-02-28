public class \u7c6b\u7c6b\ubefe\u385b\u3c25.\uff55\u4ab3\u74b1\u67e9\u7bad\u416d {
    public void \uff55\u4ab3\u74b1\u67e9\u7bad\u416d(\u3d64\u7af6\uae87\uc238\u7d52.\ubded\u4bc8\u92ff\u4daf\u5d20\u6cfe p0, java.util.Map p1) {
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
            putfield:\ubded\u4bc8\u92ff\u4daf\u5d20\u6cfe(\uff55\u4ab3\u74b1\u67e9\u7bad\u416d::\u3e2a\u3711\u8bb0\u8cae\u36d3\u446c, this:\uff55\u4ab3\u74b1\u67e9\u7bad\u416d, p0:\ubded\u4bc8\u92ff\u4daf\u5d20\u6cfe)
            putfield:Map(\uff55\u4ab3\u74b1\u67e9\u7bad\u416d::\uff55\u71ae\u3bc9\uc229\ub8be\ud171, this:\uff55\u4ab3\u74b1\u67e9\u7bad\u416d, p1:Map)
            invokespecial:TypeAdapter(TypeAdapter::<init>, this:\uff55\u4ab3\u74b1\u67e9\u7bad\u416d)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void write(com.google.gson.stream.JsonWriter p0, java.lang.Object p1) {
        var_3_5F : int
        
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
            var_3_5F = and:int(ldc:int(1895160275), ldc:int(1370840415))
            
            if (cmpne:boolean(p1:Object, aconstnull:Object())) {
                var_3_5F = and:int(var_3_5F:int, ldc:int(1366907847))
                invokevirtual:JsonWriter(JsonWriter::value, p0:JsonWriter, invokestatic:String(\ubded\u4bc8\u92ff\u4daf\u5d20\u6cfe::\u4ab3\u8753\u67e9\u88c5\u6b5f\u8df4, getfield:\ubded\u4bc8\u92ff\u4daf\u5d20\u6cfe(\uff55\u4ab3\u74b1\u67e9\u7bad\u416d::\u3e2a\u3711\u8bb0\u8cae\u36d3\u446c, this:\uff55\u4ab3\u74b1\u67e9\u7bad\u416d), p1:Object))
            }
            else {
                invokevirtual:JsonWriter(JsonWriter::nullValue, p0:JsonWriter)
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public java.lang.Object read(com.google.gson.stream.JsonReader p0) {
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
        
        if (cmpne:boolean(invokevirtual:JsonToken(JsonReader::peek, p0:JsonReader), getstatic:JsonToken(JsonToken::NULL))) {
            return:Object(invokeinterface:Object(Map<K, Object>::get, getfield:Map(\uff55\u4ab3\u74b1\u67e9\u7bad\u416d::\uff55\u71ae\u3bc9\uc229\ub8be\ud171, this:\uff55\u4ab3\u74b1\u67e9\u7bad\u416d), invokevirtual:String[expected:Object](JsonReader::nextString, p0:JsonReader)))
        }
        
        invokevirtual:void(JsonReader::nextNull, p0:JsonReader)
        return:Object(aconstnull:Object())
    }
    
    static {
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
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \uc87f\u7006\u4f52\u9033\ua562\u965f(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_612 : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C9 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_61D : int
        
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
        var_3_612 = and:int(ldc:int(-2056951589), ldc:int(-1110589528))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\uff55\u4ab3\u74b1\u67e9\u7bad\u416d[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_612:int, ldc:int(512)), ldc:int(0))) {
            var_3_612 = and:int(var_3_612:int, ldc:int(1383132028))
        }
        else {
            var_3_612 = and:int(var_3_612:int, ldc:int(-1610858068))
            var_5_85 = and:int(ldc:int(-22561), ldc:int(22560))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(26884), ldc:int(-26885)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_612:int, ldc:int(-975277687))
                    var_9_C9 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_8C:int, and:int(ldc:int(16393), ldc:int(9219)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, and:int(ldc:int(14403), ldc:int(16769)))), var_7_9B:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_612 = and:int(var_3_DA:int, ldc:int(-161164658))
                    var_14_115 = var_7_9B:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), xor:int(ldc:int(3232), ldc:int(3233)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_8C:int)) {
                        var_9_C9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_612:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1450)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_612:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1316)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_612:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1178)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_612:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_612 = and:int(var_3_612:int, ldc:int(-59921976))
                        goto(Label_1067)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_612:int, ldc:int(256)), ldc:int(0))) {
                        var_3_612 = and:int(var_3_612:int, ldc:int(-1105882660))
                        goto(Label_0921)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_612:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0802)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_612:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_612 = and:int(var_3_612:int, ldc:int(-1187665895))
                        goto(Label_0676)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_612:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0557)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_612:int, ldc:int(512)), ldc:int(0))) {
                        var_3_612 = and:int(var_3_612:int, ldc:int(-2055852049))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0557)
                            }
                            
                            goto(Label_0802)
                        }
                    }
                    
                    Label_0389:
                    
                    if (cmpeq:boolean(and:int(var_3_612:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1450)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_612:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1316)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_612:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1178)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_612:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_612 = and:int(var_3_612:int, ldc:int(436403422))
                        goto(Label_1067)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_612:int, ldc:int(128)), ldc:int(0))) {
                        var_3_612 = and:int(var_3_612:int, ldc:int(-1943308166))
                        goto(Label_0921)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_612:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_612 = and:int(var_3_612:int, ldc:int(1187941215))
                        goto(Label_0802)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_612:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_612 = and:int(var_3_612:int, ldc:int(2099850008))
                        goto(Label_0676)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_612:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_612 = and:int(var_3_612:int, ldc:int(1744182387))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_612:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_612 = and:int(var_3_612:int, ldc:int(539008839))
                            loopcontinue()
                        }
                        
                        var_3_612 = and:int(var_3_612:int, ldc:int(-1284675))
                        var_11_EB = and:int(ldc:int(9797), ldc:int(-9798))
                        goto(Label_1439)
                    }
                    
                    Label_0557:
                    
                    if (cmpeq:boolean(and:int(var_3_612:int, ldc:int(8)), ldc:int(0))) {
                        var_3_612 = and:int(var_3_612:int, ldc:int(-1725264605))
                        goto(Label_1450)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_612:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_612 = and:int(var_3_612:int, ldc:int(-790665701))
                        goto(Label_1316)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_612:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_612 = and:int(var_3_612:int, ldc:int(-1837514056))
                        goto(Label_1178)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_612:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_612 = and:int(var_3_612:int, ldc:int(1262644892))
                        goto(Label_1067)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_612:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0921)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_612:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0802)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_612:int, ldc:int(1024)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_612:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_612:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_612 = and:int(var_3_612:int, ldc:int(-320768048))
                            loopcontinue()
                        }
                        
                        var_3_612 = and:int(var_3_612:int, ldc:int(-297466438))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C9:double
                            goto(Label_0802)
                        }
                    }
                    
                    Label_0676:
                    
                    if (cmpne:boolean(and:int(var_3_612:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1450)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_612:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1316)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_612:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_612 = and:int(var_3_612:int, ldc:int(-401906792))
                        goto(Label_1178)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_612:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_612 = and:int(var_3_612:int, ldc:int(1741292852))
                        goto(Label_1067)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_612:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_612 = and:int(var_3_612:int, ldc:int(1622785722))
                        goto(Label_0921)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_612:int, ldc:int(128)), ldc:int(0))) {
                        var_3_612 = and:int(var_3_612:int, ldc:int(950024076))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_612:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0557)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_612:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_612:int, ldc:int(256)), ldc:int(0))) {
                            var_3_612 = and:int(var_3_612:int, ldc:int(112176063))
                            loopcontinue()
                        }
                        
                        var_3_612 = and:int(var_3_612:int, ldc:int(-178928392))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C9:double, var_14_115:double))
                    }
                    
                    Label_0802:
                    
                    if (cmpeq:boolean(and:int(var_3_612:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1450)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_612:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1316)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_612:int, ldc:int(4)), ldc:int(0))) {
                        var_3_612 = and:int(var_3_612:int, ldc:int(-597448076))
                        goto(Label_1178)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_612:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_612 = and:int(var_3_612:int, ldc:int(-1779551927))
                        goto(Label_1067)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_612:int, ldc:int(128)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_612:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_612 = and:int(var_3_612:int, ldc:int(2005690810))
                            goto(Label_0676)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_612:int, ldc:int(512)), ldc:int(0))) {
                            var_3_612 = and:int(var_3_612:int, ldc:int(-1998314943))
                            goto(Label_0557)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_612:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_612 = and:int(var_3_612:int, ldc:int(-1877230659))
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_612:int, ldc:int(512)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_612 = and:int(var_3_612:int, ldc:int(-159430915))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_EB = xor:int(ldc:int(20), ldc:int(21))
                                goto(Label_1067)
                            }
                        }
                    }
                    
                    Label_0921:
                    
                    if (cmpne:boolean(and:int(var_3_612:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1450)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_612:int, ldc:int(128)), ldc:int(0))) {
                        var_3_612 = and:int(var_3_612:int, ldc:int(-1255086677))
                        goto(Label_1316)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_612:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1178)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_612:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_612 = and:int(var_3_612:int, ldc:int(-1268055557))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_612:int, ldc:int(4)), ldc:int(0))) {
                            var_3_612 = and:int(var_3_612:int, ldc:int(1948246518))
                            goto(Label_0802)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_612:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0676)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_612:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0557)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_612:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_612:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_612 = and:int(var_3_612:int, ldc:int(1644190994))
                            loopcontinue()
                        }
                        
                        var_3_612 = and:int(var_3_612:int, ldc:int(-1244219234))
                        var_11_EB = and:int(ldc:int(-15292), ldc:int(14906))
                    }
                    
                    Label_1067:
                    
                    if (cmpeq:boolean(and:int(var_3_612:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1450)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_612:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1316)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_612:int, ldc:int(256)), ldc:int(0))) {
                        var_3_612 = and:int(var_3_612:int, ldc:int(-1727259850))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_612:int, ldc:int(4)), ldc:int(0))) {
                            var_3_612 = and:int(var_3_612:int, ldc:int(-1813023783))
                            goto(Label_0921)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_612:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_612 = and:int(var_3_612:int, ldc:int(1118850582))
                            goto(Label_0802)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_612:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0676)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_612:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_612 = and:int(var_3_612:int, ldc:int(-1488015069))
                            goto(Label_0557)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_612:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_612:int, ldc:int(67108864)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_612 = and:int(var_3_612:int, ldc:int(-144421185))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1316)
                            }
                        }
                    }
                    
                    Label_1178:
                    
                    if (cmpne:boolean(and:int(var_3_612:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1450)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_612:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_612 = and:int(var_3_612:int, ldc:int(-1409041872))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_612:int, ldc:int(8)), ldc:int(0))) {
                            var_3_612 = and:int(var_3_612:int, ldc:int(1232159867))
                            goto(Label_1067)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_612:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_612 = and:int(var_3_612:int, ldc:int(173828465))
                            goto(Label_0921)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_612:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0802)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_612:int, ldc:int(256)), ldc:int(0))) {
                            var_3_612 = and:int(var_3_612:int, ldc:int(1779670678))
                            goto(Label_0676)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_612:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_612 = and:int(var_3_612:int, ldc:int(-656598215))
                            goto(Label_0557)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_612:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_612:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_612 = and:int(var_3_612:int, ldc:int(-100427371))
                            loopcontinue()
                        }
                        
                        var_3_612 = and:int(var_3_612:int, ldc:int(-2066798915))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_85:int, var_16_119:int)
                        goto(Label_1439)
                    }
                    
                    Label_1316:
                    
                    if (cmpeq:boolean(and:int(var_3_612:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1450)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_612:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_612 = and:int(var_3_612:int, ldc:int(633909674))
                        goto(Label_1178)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_612:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1067)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_612:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0921)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_612:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_612 = and:int(var_3_612:int, ldc:int(-105618232))
                        goto(Label_0802)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_612:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0676)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_612:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_612 = and:int(var_3_612:int, ldc:int(-453180914))
                        goto(Label_0557)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_612:int, ldc:int(4)), ldc:int(0))) {
                        var_3_612 = and:int(var_3_612:int, ldc:int(-1791201383))
                        goto(Label_0389)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_612:int, ldc:int(1073741824)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_612 = and:int(var_3_612:int, ldc:int(-2066953474))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1439:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_61D = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1450:
                    
                    if (cmpne:boolean(and:int(var_3_612:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1316)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_612:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1178)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_612:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1067)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_612:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_612 = and:int(var_3_612:int, ldc:int(873562361))
                        goto(Label_0921)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_612:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_612 = and:int(var_3_612:int, ldc:int(-734578140))
                        goto(Label_0802)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_612:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0676)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_612:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_612 = and:int(var_3_612:int, ldc:int(1533917858))
                        goto(Label_0557)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_612:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0389)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_612:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_612 = and:int(var_3_612:int, ldc:int(-724222054))
                        var_17_61D = add:int(var_16_119:int, xor:int(ldc:int(16472), ldc:int(16473)))
                        looporswitchbreak()
                    }
                    
                    var_3_612 = and:int(var_3_612:int, ldc:int(1883532547))
                }
                
                var_3_612 = and:int(var_3_612:int, ldc:int(-571090744))
                
                if (cmple:boolean(var_5_85 = var_17_61D:int, sub:int(var_6_8C:int, and:int(ldc:int(2265), ldc:int(289))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpeq:boolean(and:int(var_3_612:int, ldc:int(2147483647)), ldc:int(0))) {
            var_3_612 = and:int(var_3_612:int, ldc:int(-1678293023))
            goto(Label_0106)
        }
    }
}
