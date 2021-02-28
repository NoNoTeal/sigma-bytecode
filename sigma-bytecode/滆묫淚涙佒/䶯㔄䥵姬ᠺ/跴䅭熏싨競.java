public abstract class \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u8df4\u416d\u718f\uc2e8\u7af6<T> {
    public void \u8df4\u416d\u718f\uc2e8\u7af6() {
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
            invokespecial:Object(Object::<init>, this:\u8df4\u416d\u718f\uc2e8\u7af6<T>)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u7006\u71ae\u946b\u120d\u5140\u5140(com.google.gson.JsonObject p0, T extends \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\ub6ab\ube23\ub70c\u67d0\u88c5 p1, com.google.gson.JsonSerializationContext p2) {
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
            
            if (logicalnot:boolean(invokestatic:boolean(ArrayUtils::isEmpty, checkcast:\u67d0\u36d3\uae5d\u99f7\u9a18[][expected:Object[]](\u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u67d0\u36d3\uae5d\u99f7\u9a18[].class, getfield:\u67d0\u36d3\uae5d\u99f7\u9a18[][expected:Object[]](\ub6ab\ube23\ub70c\u67d0\u88c5::\ubb2b\u67d0\u4f52\u647c\uff55\u6b0d, p1:T extends \ub6ab\ube23\ub70c\u67d0\u88c5[expected:\ub6ab\ube23\ub70c\u67d0\u88c5]))))) {
                invokevirtual:void(JsonObject::add, p0:JsonObject, ldc:String("conditions"), invokeinterface:JsonElement(JsonSerializationContext::serialize, p2:JsonSerializationContext, getfield:\u67d0\u36d3\uae5d\u99f7\u9a18[][expected:Object](\ub6ab\ube23\ub70c\u67d0\u88c5::\ubb2b\u67d0\u4f52\u647c\uff55\u6b0d, p1:T extends \ub6ab\ube23\ub70c\u67d0\u88c5[expected:\ub6ab\ube23\ub70c\u67d0\u88c5])))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public final T extends \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\ub6ab\ube23\ub70c\u67d0\u88c5 \u8413\u8d98\u2dcc\u16f6\u51fa\ud171(com.google.gson.JsonObject p0, com.google.gson.JsonDeserializationContext p1) {
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
            return:T extends \ub6ab\ube23\ub70c\u67d0\u88c5(invokevirtual:T extends \ub6ab\ube23\ub70c\u67d0\u88c5(\u8df4\u416d\u718f\uc2e8\u7af6<T>::\u5bc4\ua562\ub1b9\u34df\u6d99\ube23, this:\u8df4\u416d\u718f\uc2e8\u7af6<T>, p0:JsonObject, p1:JsonDeserializationContext, checkcast:\u67d0\u36d3\uae5d\u99f7\u9a18[](\u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u67d0\u36d3\uae5d\u99f7\u9a18[].class, invokestatic:\u67d0\u36d3\uae5d\u99f7\u9a18[](\u3504\u67d0\u6c56\u2dcc\u8640\u760c::\ub83f\uae5d\u7330\u7873\u7ce1\u516c, p0:JsonObject, ldc:String("conditions"), newarray:\u67d0\u36d3\uae5d\u99f7\u9a18[](\u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u67d0\u36d3\uae5d\u99f7\u9a18.class, and:int(ldc:int(11392), ldc:int(-11393))), p1:JsonDeserializationContext, ldc:Class<\u67d0\u36d3\uae5d\u99f7\u9a18[]>(\u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u67d0\u36d3\uae5d\u99f7\u9a18[].class)))))
        }
        
        goto(Label_0006)
    }
    
    public abstract T extends \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\ub6ab\ube23\ub70c\u67d0\u88c5 \u5bc4\ua562\ub1b9\u34df\u6d99\ube23(com.google.gson.JsonObject p0, com.google.gson.JsonDeserializationContext p1, \u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u67d0\u36d3\uae5d\u99f7\u9a18[] p2);
    
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
            return:Object(invokevirtual:Object(\u8df4\u416d\u718f\uc2e8\u7af6<Object>::\u8413\u8d98\u2dcc\u16f6\u51fa\ud171, this:\u8df4\u416d\u718f\uc2e8\u7af6<T>, p0:JsonObject, p1:JsonDeserializationContext))
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
            invokevirtual:void(\u8df4\u416d\u718f\uc2e8\u7af6<\ub6ab\ube23\ub70c\u67d0\u88c5>::\u7006\u71ae\u946b\u120d\u5140\u5140, this:\u8df4\u416d\u718f\uc2e8\u7af6<T>, p0:JsonObject, checkcast:\ub6ab\ube23\ub70c\u67d0\u88c5(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\ub6ab\ube23\ub70c\u67d0\u88c5.class, p1:Object[expected:\ub6ab\ube23\ub70c\u67d0\u88c5]), p2:JsonSerializationContext)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u0800\u8753\u7006\ua068\u93a2\u16f6(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_634 : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_63F : int
        
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
        var_3_634 = and:int(ldc:int(-1463438421), ldc:int(-52857105))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u8df4\u416d\u718f\uc2e8\u7af6<T>[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(16384)), ldc:int(0))) {
            var_3_634 = and:int(var_3_634:int, ldc:int(786297839))
            var_5_7D = and:int(ldc:int(-30254), ldc:int(25125))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(27408), ldc:int(-28507)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_634:int, ldc:int(-85065729))
                    var_9_C1 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_84:int, xor:int(ldc:int(14592), ldc:int(14593)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, and:int(ldc:int(20817), ldc:int(9377)))), var_7_93:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_634 = and:int(var_3_D2:int, ldc:int(2094390014))
                    var_14_10D = var_7_93:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), and:int(ldc:int(10633), ldc:int(519)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_84:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(-1510480013))
                        goto(Label_1466)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1332)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(-217303322))
                        goto(Label_1218)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(-468601727))
                        goto(Label_1115)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0945)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(754096942))
                        goto(Label_0826)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0692)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(-1578064479))
                        goto(Label_0565)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(2145090511))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0565)
                            }
                            
                            goto(Label_0826)
                        }
                    }
                    
                    Label_0397:
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(-532687))
                        goto(Label_1466)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(-174862653))
                        goto(Label_1332)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(8)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(-956688710))
                        goto(Label_1218)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(-1644629195))
                        goto(Label_1115)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(2)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(1155077567))
                        goto(Label_0945)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0826)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(16)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(-1877984163))
                        goto(Label_0692)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(512)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_634:int, ldc:int(8)), ldc:int(0))) {
                            var_3_634 = and:int(var_3_634:int, ldc:int(-371099745))
                            var_11_E3 = and:int(ldc:int(-13244), ldc:int(13107))
                            goto(Label_1455)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0565:
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(-1787730878))
                        goto(Label_1466)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(16)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(-115220440))
                        goto(Label_1332)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(2082323114))
                        goto(Label_1218)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(149509038))
                        goto(Label_1115)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0945)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(128)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(-1299783209))
                        goto(Label_0826)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(-1480011898))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(536870912)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_634 = and:int(var_3_634:int, ldc:int(-1126049137))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0826)
                        }
                    }
                    
                    Label_0692:
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1466)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(1579328565))
                        goto(Label_1332)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(1811793887))
                        goto(Label_1218)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1115)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(2)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(1174091809))
                        goto(Label_0945)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(397119617))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_634:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0565)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_634:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_634 = and:int(var_3_634:int, ldc:int(-1186699575))
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_634 = and:int(var_3_634:int, ldc:int(1134215892))
                            loopcontinue()
                        }
                        
                        var_3_634 = and:int(var_3_634:int, ldc:int(-304513302))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0826:
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(-1862809000))
                        goto(Label_1466)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(2)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(810226024))
                        goto(Label_1332)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1218)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(8)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(-1339249328))
                        goto(Label_1115)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(2097152)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_634 = and:int(var_3_634:int, ldc:int(-923492417))
                            goto(Label_0692)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_634:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0565)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_634:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_634 = and:int(var_3_634:int, ldc:int(1607016930))
                            loopcontinue()
                        }
                        
                        var_3_634 = and:int(var_3_634:int, ldc:int(-1395297618))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_E3 = and:int(ldc:int(9765), ldc:int(83))
                                goto(Label_1115)
                            }
                        }
                    }
                    
                    Label_0945:
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(-1077866220))
                        goto(Label_1466)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1332)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1218)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(128)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(256696411))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_634 = and:int(var_3_634:int, ldc:int(1711402485))
                            goto(Label_0826)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_634:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_634 = and:int(var_3_634:int, ldc:int(1660345268))
                            goto(Label_0692)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_634 = and:int(var_3_634:int, ldc:int(-861332120))
                            goto(Label_0565)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_634 = and:int(var_3_634:int, ldc:int(-1777743012))
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_634 = and:int(var_3_634:int, ldc:int(1667855226))
                            loopcontinue()
                        }
                        
                        var_3_634 = and:int(var_3_634:int, ldc:int(-269928485))
                        var_11_E3 = and:int(ldc:int(-1757), ldc:int(732))
                    }
                    
                    Label_1115:
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1466)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1332)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(16)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_634 = and:int(var_3_634:int, ldc:int(1430159852))
                            goto(Label_0945)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0826)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_634:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_634 = and:int(var_3_634:int, ldc:int(-1412540098))
                            goto(Label_0692)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_634:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0565)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_634:int, ldc:int(16)), ldc:int(0))) {
                            var_3_634 = and:int(var_3_634:int, ldc:int(645603669))
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(536870912)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_634 = and:int(var_3_634:int, ldc:int(753399499))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1332)
                            }
                        }
                    }
                    
                    Label_1218:
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1466)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(512)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_634:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_634 = and:int(var_3_634:int, ldc:int(194757579))
                            goto(Label_1115)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_634:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_634 = and:int(var_3_634:int, ldc:int(-1149780667))
                            goto(Label_0945)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(128)), ldc:int(0))) {
                            var_3_634 = and:int(var_3_634:int, ldc:int(-277229244))
                            goto(Label_0826)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0692)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_634:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0565)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_634:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_634 = and:int(var_3_634:int, ldc:int(-289153334))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_7D:int, var_16_111:int)
                            goto(Label_1455)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1332:
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(-1898755153))
                        goto(Label_1466)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1218)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1115)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0945)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0826)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(128)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(1973056007))
                        goto(Label_0692)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0565)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(793360874))
                        goto(Label_0397)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(295559881))
                        loopcontinue()
                    }
                    
                    var_3_634 = and:int(var_3_634:int, ldc:int(-1345331510))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1455:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_63F = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1466:
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(-707400164))
                        goto(Label_1332)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(1953194450))
                        goto(Label_1218)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(8)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(-2027603713))
                        goto(Label_1115)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(-1201669589))
                        goto(Label_0945)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0826)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(-1315898837))
                        goto(Label_0692)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0565)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0397)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(-286296161))
                        var_17_63F = add:int(var_16_111:int, xor:int(ldc:int(16832), ldc:int(16833)))
                        looporswitchbreak()
                    }
                    
                    var_3_634 = and:int(var_3_634:int, ldc:int(-1893310538))
                }
                
                var_3_634 = and:int(var_3_634:int, ldc:int(-1108798737))
                
                if (cmple:boolean(var_5_7D = var_17_63F:int, sub:int(var_6_84:int, and:int(ldc:int(1), ldc:int(51))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(4096)), ldc:int(0))) {
            var_3_634 = and:int(var_3_634:int, ldc:int(1822076811))
            goto(Label_0106)
        }
    }
}
