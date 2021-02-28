public abstract class \u3bd6\u6b0d\ubff1\u8aa5\u4f4a.\u946b\u16f6\ubefe\u76bc\uae87<T> {
    public void \u946b\u16f6\ubefe\u76bc\uae87() {
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
            invokespecial:Object(Object::<init>, this:\u946b\u16f6\ubefe\u76bc\uae87<T>)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public final void \u7006\u71ae\u946b\u120d\u5140\u5140(com.google.gson.JsonObject p0, T extends \u6435\ub8be\u718f\u6b0d\u67e9.\uf94d\ub18d\u34df\u59ec\u446c p1, com.google.gson.JsonSerializationContext p2) {
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
            
            if (logicalnot:boolean(invokestatic:boolean(ArrayUtils::isEmpty, checkcast:\u67d0\u36d3\uae5d\u99f7\u9a18[][expected:Object[]](\u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u67d0\u36d3\uae5d\u99f7\u9a18[].class, getfield:\u67d0\u36d3\uae5d\u99f7\u9a18[][expected:Object[]](\uf94d\ub18d\u34df\u59ec\u446c::\u446c\u36d3\ub113\u92ff\u47c2\u47c2, p1:T extends \uf94d\ub18d\u34df\u59ec\u446c[expected:\uf94d\ub18d\u34df\u59ec\u446c]))))) {
                invokevirtual:void(JsonObject::add, p0:JsonObject, ldc:String("conditions"), invokeinterface:JsonElement(JsonSerializationContext::serialize, p2:JsonSerializationContext, getfield:\u67d0\u36d3\uae5d\u99f7\u9a18[][expected:Object](\uf94d\ub18d\u34df\u59ec\u446c::\u446c\u36d3\ub113\u92ff\u47c2\u47c2, p1:T extends \uf94d\ub18d\u34df\u59ec\u446c[expected:\uf94d\ub18d\u34df\u59ec\u446c])))
            }
            
            invokevirtual:void(\u946b\u16f6\ubefe\u76bc\uae87<T>::\u5bc4\u983f\ua3b4\u5fe1\u7d52\u946b, this:\u946b\u16f6\ubefe\u76bc\uae87<T>, p0:JsonObject, p1:T extends \uf94d\ub18d\u34df\u59ec\u446c, p2:JsonSerializationContext)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public final T extends \u6435\ub8be\u718f\u6b0d\u67e9.\uf94d\ub18d\u34df\u59ec\u446c \u8413\u8d98\u2dcc\u16f6\u51fa\ud171(com.google.gson.JsonObject p0, com.google.gson.JsonDeserializationContext p1) {
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
            return:T extends \uf94d\ub18d\u34df\u59ec\u446c(invokevirtual:T extends \uf94d\ub18d\u34df\u59ec\u446c(\u946b\u16f6\ubefe\u76bc\uae87<T>::\uae5d\uc87f\u34df\ud4fe\u8d90\u120d, this:\u946b\u16f6\ubefe\u76bc\uae87<T>, p0:JsonObject, p1:JsonDeserializationContext, checkcast:\u67d0\u36d3\uae5d\u99f7\u9a18[](\u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u67d0\u36d3\uae5d\u99f7\u9a18[].class, invokestatic:\u67d0\u36d3\uae5d\u99f7\u9a18[](\u3504\u67d0\u6c56\u2dcc\u8640\u760c::\ub83f\uae5d\u7330\u7873\u7ce1\u516c, p0:JsonObject, ldc:String("conditions"), newarray:\u67d0\u36d3\uae5d\u99f7\u9a18[](\u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u67d0\u36d3\uae5d\u99f7\u9a18.class, and:int(ldc:int(-13800), ldc:int(9415))), p1:JsonDeserializationContext, ldc:Class<\u67d0\u36d3\uae5d\u99f7\u9a18[]>(\u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u67d0\u36d3\uae5d\u99f7\u9a18[].class)))))
        }
        
        goto(Label_0006)
    }
    
    public abstract void \u5bc4\u983f\ua3b4\u5fe1\u7d52\u946b(com.google.gson.JsonObject p0, T extends \u6435\ub8be\u718f\u6b0d\u67e9.\uf94d\ub18d\u34df\u59ec\u446c p1, com.google.gson.JsonSerializationContext p2);
    
    public abstract T extends \u6435\ub8be\u718f\u6b0d\u67e9.\uf94d\ub18d\u34df\u59ec\u446c \uae5d\uc87f\u34df\ud4fe\u8d90\u120d(com.google.gson.JsonObject p0, com.google.gson.JsonDeserializationContext p1, \u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u67d0\u36d3\uae5d\u99f7\u9a18[] p2);
    
    public java.lang.Object \u8413\u8d98\u2dcc\u16f6\u51fa\ud171(com.google.gson.JsonObject p0, com.google.gson.JsonDeserializationContext p1) {
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
            return:Object(invokevirtual:Object(\u946b\u16f6\ubefe\u76bc\uae87<Object>::\u8413\u8d98\u2dcc\u16f6\u51fa\ud171, this:\u946b\u16f6\ubefe\u76bc\uae87<T>, p0:JsonObject, p1:JsonDeserializationContext))
        }
        
        goto(Label_0006)
    }
    
    public void \u7006\u71ae\u946b\u120d\u5140\u5140(com.google.gson.JsonObject p0, java.lang.Object p1, com.google.gson.JsonSerializationContext p2) {
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
            invokevirtual:void(\u946b\u16f6\ubefe\u76bc\uae87<\uf94d\ub18d\u34df\u59ec\u446c>::\u7006\u71ae\u946b\u120d\u5140\u5140, this:\u946b\u16f6\ubefe\u76bc\uae87<T>, p0:JsonObject, checkcast:\uf94d\ub18d\u34df\u59ec\u446c(\u6435\ub8be\u718f\u6b0d\u67e9.\uf94d\ub18d\u34df\u59ec\u446c.class, p1:Object[expected:\uf94d\ub18d\u34df\u59ec\u446c]), p2:JsonSerializationContext)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u5fe1\u0b8e\u64f2\ud158\uc29a\u385b(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_5DD : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_5E8 : int
        
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
        var_3_5DD = and:int(ldc:int(117990456), ldc:int(-149246419))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u946b\u16f6\ubefe\u76bc\uae87<T>[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(262144)), ldc:int(0))) {
            var_3_5DD = and:int(var_3_5DD:int, ldc:int(-11582065))
        }
        else {
            var_3_5DD = and:int(var_3_5DD:int, ldc:int(930490236))
            var_5_85 = and:int(ldc:int(2548), ldc:int(-2551))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(4705), ldc:int(-4706)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_5DD:int, ldc:int(2145526587))
                    var_9_C1 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_8C:int, and:int(ldc:int(1077), ldc:int(25219)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, xor:int(ldc:int(17417), ldc:int(17416)))), var_7_9B:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_5DD = and:int(var_3_D2:int, ldc:int(-1625218843))
                    var_14_10D = var_7_9B:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), and:int(ldc:int(8321), ldc:int(4107)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_8C:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1386)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1244)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1138)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1035)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(11023341))
                        goto(Label_0881)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0778)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0652)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0533)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(-1747403289))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0533)
                            }
                            
                            goto(Label_0778)
                        }
                    }
                    
                    Label_0365:
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(1)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(-1531412558))
                        goto(Label_1386)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(128)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(-433261135))
                        goto(Label_1244)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1138)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(-8174416))
                        goto(Label_1035)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0881)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(64)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(1844453331))
                        goto(Label_0778)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(124776164))
                        goto(Label_0652)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(4096)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_5DD = and:int(var_3_5DD:int, ldc:int(1627343488))
                            loopcontinue()
                        }
                        
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(938950518))
                        var_11_E3 = and:int(ldc:int(-3900), ldc:int(2859))
                        goto(Label_1375)
                    }
                    
                    Label_0533:
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(509381158))
                        goto(Label_1386)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(-496757043))
                        goto(Label_1244)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(128)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(629379628))
                        goto(Label_1138)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1035)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(818427322))
                        goto(Label_0881)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0778)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(33554432)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0365)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_5DD = and:int(var_3_5DD:int, ldc:int(1157649275))
                            loopcontinue()
                        }
                        
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(1875009897))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0778)
                        }
                    }
                    
                    Label_0652:
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(-24497051))
                        goto(Label_1386)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1244)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(1)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(-759885112))
                        goto(Label_1138)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(2)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(2128321347))
                        goto(Label_1035)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0881)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(134217728)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0533)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_5DD = and:int(var_3_5DD:int, ldc:int(2131269723))
                            goto(Label_0365)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_5DD = and:int(var_3_5DD:int, ldc:int(2032387630))
                            loopcontinue()
                        }
                        
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(-273342147))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0778:
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1386)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1244)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1138)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1035)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(33554432)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_5DD = and:int(var_3_5DD:int, ldc:int(71784175))
                            goto(Label_0652)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_5DD = and:int(var_3_5DD:int, ldc:int(-755562555))
                            goto(Label_0533)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_5DD = and:int(var_3_5DD:int, ldc:int(910879468))
                            goto(Label_0365)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(2)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(-1883496341))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_E3 = and:int(ldc:int(22673), ldc:int(9281))
                                goto(Label_1035)
                            }
                        }
                    }
                    
                    Label_0881:
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(-555626370))
                        goto(Label_1386)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1244)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1138)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(1)), ldc:int(0))) {
                            var_3_5DD = and:int(var_3_5DD:int, ldc:int(-26476817))
                            goto(Label_0778)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0652)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(128)), ldc:int(0))) {
                            var_3_5DD = and:int(var_3_5DD:int, ldc:int(-910540526))
                            goto(Label_0533)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_5DD = and:int(var_3_5DD:int, ldc:int(104007978))
                            goto(Label_0365)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_5DD = and:int(var_3_5DD:int, ldc:int(398534406))
                            loopcontinue()
                        }
                        
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(2012227258))
                        var_11_E3 = and:int(ldc:int(-3829), ldc:int(3812))
                    }
                    
                    Label_1035:
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1386)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(-1399740251))
                        goto(Label_1244)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(4194304)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_5DD = and:int(var_3_5DD:int, ldc:int(1689920990))
                            goto(Label_0881)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0778)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0652)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_5DD = and:int(var_3_5DD:int, ldc:int(1339832487))
                            goto(Label_0533)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0365)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(32)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(-1895781074))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1244)
                            }
                        }
                    }
                    
                    Label_1138:
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1386)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(4096)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_1035)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0881)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0778)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0652)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_5DD = and:int(var_3_5DD:int, ldc:int(-1979764519))
                            goto(Label_0533)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_5DD = and:int(var_3_5DD:int, ldc:int(-273224576))
                            goto(Label_0365)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(1)), ldc:int(0))) {
                            var_3_5DD = and:int(var_3_5DD:int, ldc:int(-414617153))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_85:int, var_16_111:int)
                            goto(Label_1375)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1244:
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1386)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(-595516680))
                        goto(Label_1138)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(64)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(1483580448))
                        goto(Label_1035)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0881)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0778)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(1134630155))
                        goto(Label_0652)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0533)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(-584290709))
                        goto(Label_0365)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(853245152))
                        loopcontinue()
                    }
                    
                    var_3_5DD = and:int(var_3_5DD:int, ldc:int(-1208360848))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1375:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_5E8 = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1386:
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(-632241205))
                        goto(Label_1244)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(133167289))
                        goto(Label_1138)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1035)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0881)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(-1956397941))
                        goto(Label_0778)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(1542698796))
                        goto(Label_0652)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0533)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(-59126371))
                        goto(Label_0365)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(-1619100954))
                        var_17_5E8 = add:int(var_16_111:int, xor:int(ldc:int(136), ldc:int(137)))
                        looporswitchbreak()
                    }
                    
                    var_3_5DD = and:int(var_3_5DD:int, ldc:int(215653952))
                }
                
                var_3_5DD = and:int(var_3_5DD:int, ldc:int(1737571766))
                
                if (cmple:boolean(var_5_85 = var_17_5E8:int, sub:int(var_6_8C:int, and:int(ldc:int(81), ldc:int(4997))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(2)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
