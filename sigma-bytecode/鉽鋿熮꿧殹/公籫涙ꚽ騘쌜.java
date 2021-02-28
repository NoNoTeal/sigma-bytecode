public class \u927d\u92ff\u71ae\uafe7\u6bb9.\u516c\u7c6b\u6d99\ua6bd\u9a18\uc31c {
    public void \u516c\u7c6b\u6d99\ua6bd\u9a18\uc31c(java.lang.String p0) {
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
            invokespecial:\uc31c\u8753\ucfaf\u6d99\ufe34\u624e(\uc31c\u8753\ucfaf\u6d99\ufe34\u624e::<init>, this:\u516c\u7c6b\u6d99\ua6bd\u9a18\uc31c, p0:String)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u34df\u8709\u156b\uae87\ub70c\u6bb9(boolean p0, java.nio.FloatBuffer p1) {
        var_5_6E : int
        
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
            putfield:boolean(\u516c\u7c6b\u6d99\ua6bd\u9a18\uc31c::\uc9f6\ua068\u3bd6\u76bc\u5f50\u4daf, this:\u516c\u7c6b\u6d99\ua6bd\u9a18\uc31c, p0:boolean)
            putfield:FloatBuffer(\u516c\u7c6b\u6d99\ua6bd\u9a18\uc31c::\uc910\ubefe\u965f\u47c2\u759a\ub70c, this:\u516c\u7c6b\u6d99\ua6bd\u9a18\uc31c, p1:FloatBuffer)
            var_5_6E = invokevirtual:int(\uc31c\u8753\ucfaf\u6d99\ufe34\u624e::\u93a2\u71ae\ua068\uc910\u8cae\u416d, this:\u516c\u7c6b\u6d99\ua6bd\u9a18\uc31c[expected:\uc31c\u8753\ucfaf\u6d99\ufe34\u624e])
            
            if (cmpge:boolean(var_5_6E:int, ldc:int(0))) {
                invokestatic:void(\u516c\u7c6b\u6d99\ua6bd\u9a18\uc31c::\ua068\u446c\u071d\u8d98\uc84e\u120d)
                invokestatic:void(ARBShaderObjects::glUniformMatrix4fvARB, var_5_6E:int, p0:boolean, p1:FloatBuffer)
                invokevirtual:void(\uc31c\u8753\ucfaf\u6d99\ufe34\u624e::\u9a18\u0c95\u93a2\uc910\uc7fe\u8bb0, this:\u516c\u7c6b\u6d99\ua6bd\u9a18\uc31c[expected:\uc31c\u8753\ucfaf\u6d99\ufe34\u624e])
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public float \uc7fe\uc7fe\u34df\u4bc8\ubb2b\ubcb0(int p0, int p1) {
        var_3_8D : int
        stack_B9_0 : int [generated]
        
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
        var_3_8D = and:int(ldc:int(960395993), ldc:int(-33817671))
        
        if (cmpne:boolean(getfield:FloatBuffer(\u516c\u7c6b\u6d99\ua6bd\u9a18\uc31c::\uc910\ubefe\u965f\u47c2\u759a\ub70c, this:\u516c\u7c6b\u6d99\ua6bd\u9a18\uc31c), aconstnull:FloatBuffer())) {
            loop {
                if (cmpne:boolean(and:int(var_3_8D:int, ldc:int(16)), ldc:int(0))) {
                    var_3_8D = and:int(var_3_8D:int, ldc:int(-1141353479))
                    
                    if (getfield:boolean(\u516c\u7c6b\u6d99\ua6bd\u9a18\uc31c::\uc9f6\ua068\u3bd6\u76bc\u5f50\u4daf, this:\u516c\u7c6b\u6d99\ua6bd\u9a18\uc31c)) {
                        stack_B9_0 = add:int(mul:int(p1:int, xor:int(ldc:int(4122), ldc:int(4126))), p0:int)
                        looporswitchbreak()
                    }
                }
                
                if (cmpne:boolean(and:int(var_3_8D:int, ldc:int(16)), ldc:int(0))) {
                    var_3_8D = and:int(var_3_8D:int, ldc:int(-143437415))
                    stack_B9_0 = add:int(mul:int(p0:int, xor:int(ldc:int(76), ldc:int(72))), p1:int)
                    looporswitchbreak()
                }
                
                var_3_8D = and:int(var_3_8D:int, ldc:int(347756774))
            }
            
            return:float(invokevirtual:float(FloatBuffer::get, getfield:FloatBuffer(\u516c\u7c6b\u6d99\ua6bd\u9a18\uc31c::\uc910\ubefe\u965f\u47c2\u759a\ub70c, this:\u516c\u7c6b\u6d99\ua6bd\u9a18\uc31c), stack_B9_0:int))
        }
        
        return:float(ldc:float(0.0f))
    }
    
    public void \u9af2\u446c\u6bb9\ua562\u494c\u527a(int p0) {
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
    
    public void \u4c04\u98a4\ud12e\u6c52\u7ce1\u3711() {
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
            putfield:FloatBuffer(\u516c\u7c6b\u6d99\ua6bd\u9a18\uc31c::\uc910\ubefe\u965f\u47c2\u759a\ub70c, this:\u516c\u7c6b\u6d99\ua6bd\u9a18\uc31c, aconstnull:FloatBuffer())
            return:void()
        }
        
        goto(Label_0006)
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
    
    public void \ub7dc\u8308\u7049\u3776\uafe7\u71f1(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_5F5 : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_600 : int
        
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
        var_3_5F5 = and:int(ldc:int(-473776693), ldc:int(-826502805))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u516c\u7c6b\u6d99\ua6bd\u9a18\uc31c[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(32768)), ldc:int(0))) {
            var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-142298917))
            var_5_7D = and:int(ldc:int(-30178), ldc:int(26049))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(1940), ldc:int(-1943)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_5F5:int, ldc:int(-890793249))
                    var_9_C1 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_84:int, and:int(ldc:int(14685), ldc:int(16387)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, and:int(ldc:int(4935), ldc:int(24705)))), var_7_93:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_5F5 = and:int(var_3_D2:int, ldc:int(-273769509))
                    var_14_10D = var_7_93:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), and:int(ldc:int(18437), ldc:int(8977)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_84:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(1098188947))
                        goto(Label_1418)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1300)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(586370483))
                        goto(Label_1154)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1035)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0897)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0778)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0660)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-802133956))
                        goto(Label_0557)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(8)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-269694741))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0557)
                            }
                            
                            goto(Label_0778)
                        }
                    }
                    
                    Label_0381:
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(1815544048))
                        goto(Label_1418)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-585455466))
                        goto(Label_1300)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(8)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(1056765389))
                        goto(Label_1154)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1035)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(16)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-97160133))
                        goto(Label_0897)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0778)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(1292277786))
                        goto(Label_0660)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(620483789))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-702998687))
                            loopcontinue()
                        }
                        
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-209520915))
                        var_11_E3 = and:int(ldc:int(16589), ldc:int(-16622))
                        goto(Label_1407)
                    }
                    
                    Label_0557:
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1418)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1300)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1154)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1035)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(1412197308))
                        goto(Label_0897)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-896192930))
                        goto(Label_0778)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(1)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(8)), ldc:int(0))) {
                            var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-239769471))
                            loopcontinue()
                        }
                        
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-561543685))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0778)
                        }
                    }
                    
                    Label_0660:
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1418)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1300)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1154)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1035)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0897)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-63039064))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-1766894294))
                            goto(Label_0557)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-1265732565))
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-47628389))
                            loopcontinue()
                        }
                        
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-808193537))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0778:
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1418)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1300)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-26933598))
                        goto(Label_1154)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(1888624445))
                        goto(Label_1035)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(1761302457))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0660)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(32)), ldc:int(0))) {
                            var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-463844018))
                            goto(Label_0557)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-1840417720))
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(8)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-610615059))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_E3 = and:int(ldc:int(2673), ldc:int(24577))
                                goto(Label_1035)
                            }
                        }
                    }
                    
                    Label_0897:
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1418)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1300)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1154)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(32)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_5F5 = and:int(var_3_5F5:int, ldc:int(1853797779))
                            goto(Label_0778)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_5F5 = and:int(var_3_5F5:int, ldc:int(669472562))
                            goto(Label_0660)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0557)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_5F5 = and:int(var_3_5F5:int, ldc:int(1578534916))
                            loopcontinue()
                        }
                        
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-608765991))
                        var_11_E3 = and:int(ldc:int(-1363), ldc:int(1362))
                    }
                    
                    Label_1035:
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1418)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1300)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(1048576)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_5F5 = and:int(var_3_5F5:int, ldc:int(1581037175))
                            goto(Label_0897)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0778)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(32)), ldc:int(0))) {
                            var_3_5F5 = and:int(var_3_5F5:int, ldc:int(999573376))
                            goto(Label_0660)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(1)), ldc:int(0))) {
                            var_3_5F5 = and:int(var_3_5F5:int, ldc:int(1580871578))
                            goto(Label_0557)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-2105255635))
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-191615255))
                            loopcontinue()
                        }
                        
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-877270165))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1300)
                            }
                        }
                    }
                    
                    Label_1154:
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-2021566827))
                        goto(Label_1418)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(67108864)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-1891570193))
                            goto(Label_1035)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-1128049632))
                            goto(Label_0897)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(8)), ldc:int(0))) {
                            var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-303372916))
                            goto(Label_0778)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0660)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_5F5 = and:int(var_3_5F5:int, ldc:int(1997166819))
                            goto(Label_0557)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-174764742))
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_5F5 = and:int(var_3_5F5:int, ldc:int(767648043))
                            loopcontinue()
                        }
                        
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-880490161))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_7D:int, var_16_111:int)
                        goto(Label_1407)
                    }
                    
                    Label_1300:
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1418)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(32)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-180852152))
                        goto(Label_1154)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(830895696))
                        goto(Label_1035)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0897)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0778)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0660)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0557)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0381)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(8)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-940864529))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1407:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_600 = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1418:
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(1207632515))
                        goto(Label_1300)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1154)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1035)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(32)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(655099998))
                        goto(Label_0897)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(1)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-1914027887))
                        goto(Label_0778)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0660)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(1)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(826360165))
                        goto(Label_0557)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0381)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-157112981))
                        var_17_600 = add:int(var_16_111:int, xor:int(ldc:int(-28672), ldc:int(-28671)))
                        looporswitchbreak()
                    }
                    
                    var_3_5F5 = and:int(var_3_5F5:int, ldc:int(1577869519))
                }
                
                var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-8069783))
                
                if (cmple:boolean(var_5_7D = var_17_600:int, sub:int(var_6_84:int, and:int(ldc:int(2417), ldc:int(16905))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(65536)), ldc:int(0))) {
            var_3_5F5 = and:int(var_3_5F5:int, ldc:int(611277155))
            goto(Label_0106)
        }
    }
}
