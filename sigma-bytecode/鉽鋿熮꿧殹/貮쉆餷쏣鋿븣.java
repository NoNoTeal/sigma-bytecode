public final class \u927d\u92ff\u71ae\uafe7\u6bb9.\u8cae\uc246\u9937\uc3e3\u92ff\ube23 {
    public void \u8cae\uc246\u9937\uc3e3\u92ff\ube23(int p0, int p1, java.util.Random p2, int p3, int p4, int p5, int p6, int p7) {
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
            putfield:int(\u8cae\uc246\u9937\uc3e3\u92ff\ube23::\u4c2b\u416d\u36d3\u4c04\u3a62\uc910, this:\u8cae\uc246\u9937\uc3e3\u92ff\ube23, p0:int)
            putfield:int(\u8cae\uc246\u9937\uc3e3\u92ff\ube23::\u836c\uff55\u59ec\u67e9\u2dcc\u7043, this:\u8cae\uc246\u9937\uc3e3\u92ff\ube23, p1:int)
            putfield:Random(\u8cae\uc246\u9937\uc3e3\u92ff\ube23::\u516c\u873d\u7873\u4c2b\u527a\ud7e8, this:\u8cae\uc246\u9937\uc3e3\u92ff\ube23, p2:Random)
            putfield:int(\u8cae\uc246\u9937\uc3e3\u92ff\ube23::\ub83f\u5140\u494c\u446c\ucfaf\u34df, this:\u8cae\uc246\u9937\uc3e3\u92ff\ube23, p3:int)
            putfield:int(\u8cae\uc246\u9937\uc3e3\u92ff\ube23::\u92ee\uae87\u4f4a\u99f7\uc31c\u624e, this:\u8cae\uc246\u9937\uc3e3\u92ff\ube23, p4:int)
            putfield:int(\u8cae\uc246\u9937\uc3e3\u92ff\ube23::\u759a\u3711\u93a2\u7330\u600f\u5140, this:\u8cae\uc246\u9937\uc3e3\u92ff\ube23, p5:int)
            putfield:int(\u8cae\uc246\u9937\uc3e3\u92ff\ube23::\uae5d\u624e\u9af2\u9af2\u5140\u873d, this:\u8cae\uc246\u9937\uc3e3\u92ff\ube23, p6:int)
            putfield:int(\u8cae\uc246\u9937\uc3e3\u92ff\ube23::\ud158\u5140\u8709\u983f\u71f1\u72f1, this:\u8cae\uc246\u9937\uc3e3\u92ff\ube23, p7:int)
            invokespecial:AbstractIterator(AbstractIterator::<init>, this:\u8cae\uc246\u9937\uc3e3\u92ff\ube23)
            putfield:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a(\u8cae\uc246\u9937\uc3e3\u92ff\ube23::\u183a\u8413\u8cae\u1187\u5140\ufe34, this:\u8cae\uc246\u9937\uc3e3\u92ff\ube23, initobject:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a(\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a::<init>))
            putfield:int(\u8cae\uc246\u9937\uc3e3\u92ff\ube23::\uff55\uc7fe\u8d90\u3d64\u0c95\uc4d2, this:\u8cae\uc246\u9937\uc3e3\u92ff\ube23, getfield:int(\u8cae\uc246\u9937\uc3e3\u92ff\ube23::\u4c2b\u416d\u36d3\u4c04\u3a62\uc910, this:\u8cae\uc246\u9937\uc3e3\u92ff\ube23))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 computeNext() {
        var_3_A3 : \u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a
        
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
        
        if (cmpgt:boolean(getfield:int(\u8cae\uc246\u9937\uc3e3\u92ff\ube23::\uff55\uc7fe\u8d90\u3d64\u0c95\uc4d2, this:\u8cae\uc246\u9937\uc3e3\u92ff\ube23), ldc:int(0))) {
            var_3_A3 = invokevirtual:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a(\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a::\ucb79\u3bc9\u494c\u6d99\uc2e8\uae87, getfield:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a(\u8cae\uc246\u9937\uc3e3\u92ff\ube23::\u183a\u8413\u8cae\u1187\u5140\ufe34, this:\u8cae\uc246\u9937\uc3e3\u92ff\ube23), add:int(getfield:int(\u8cae\uc246\u9937\uc3e3\u92ff\ube23::\u836c\uff55\u59ec\u67e9\u2dcc\u7043, this:\u8cae\uc246\u9937\uc3e3\u92ff\ube23), invokevirtual:int(Random::nextInt, getfield:Random(\u8cae\uc246\u9937\uc3e3\u92ff\ube23::\u516c\u873d\u7873\u4c2b\u527a\ud7e8, this:\u8cae\uc246\u9937\uc3e3\u92ff\ube23), getfield:int(\u8cae\uc246\u9937\uc3e3\u92ff\ube23::\ub83f\u5140\u494c\u446c\ucfaf\u34df, this:\u8cae\uc246\u9937\uc3e3\u92ff\ube23))), add:int(getfield:int(\u8cae\uc246\u9937\uc3e3\u92ff\ube23::\u92ee\uae87\u4f4a\u99f7\uc31c\u624e, this:\u8cae\uc246\u9937\uc3e3\u92ff\ube23), invokevirtual:int(Random::nextInt, getfield:Random(\u8cae\uc246\u9937\uc3e3\u92ff\ube23::\u516c\u873d\u7873\u4c2b\u527a\ud7e8, this:\u8cae\uc246\u9937\uc3e3\u92ff\ube23), getfield:int(\u8cae\uc246\u9937\uc3e3\u92ff\ube23::\u759a\u3711\u93a2\u7330\u600f\u5140, this:\u8cae\uc246\u9937\uc3e3\u92ff\ube23))), add:int(getfield:int(\u8cae\uc246\u9937\uc3e3\u92ff\ube23::\uae5d\u624e\u9af2\u9af2\u5140\u873d, this:\u8cae\uc246\u9937\uc3e3\u92ff\ube23), invokevirtual:int(Random::nextInt, getfield:Random(\u8cae\uc246\u9937\uc3e3\u92ff\ube23::\u516c\u873d\u7873\u4c2b\u527a\ud7e8, this:\u8cae\uc246\u9937\uc3e3\u92ff\ube23), getfield:int(\u8cae\uc246\u9937\uc3e3\u92ff\ube23::\ud158\u5140\u8709\u983f\u71f1\u72f1, this:\u8cae\uc246\u9937\uc3e3\u92ff\ube23))))
            putfield:int(\u8cae\uc246\u9937\uc3e3\u92ff\ube23::\uff55\uc7fe\u8d90\u3d64\u0c95\uc4d2, this:\u8cae\uc246\u9937\uc3e3\u92ff\ube23, sub:int(getfield:int(\u8cae\uc246\u9937\uc3e3\u92ff\ube23::\uff55\uc7fe\u8d90\u3d64\u0c95\uc4d2, this:\u8cae\uc246\u9937\uc3e3\u92ff\ube23), and:int(ldc:int(2049), ldc:int(147))))
            return:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(var_3_A3:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a[expected:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56])
        }
        
        return:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(checkcast:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56.class, invokevirtual:Object[expected:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56](\u8cae\uc246\u9937\uc3e3\u92ff\ube23::endOfData, this:\u8cae\uc246\u9937\uc3e3\u92ff\ube23)))
    }
    
    public java.lang.Object computeNext() {
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
            return:Object(invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:Object](\u8cae\uc246\u9937\uc3e3\u92ff\ube23::computeNext, this:\u8cae\uc246\u9937\uc3e3\u92ff\ube23))
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
    
    public void \u4d85\uc3e3\u97b7\u8389\ubff1\u99f7(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
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
        var_3_634 = and:int(ldc:int(-2036234677), ldc:int(31567347))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u8cae\uc246\u9937\uc3e3\u92ff\ube23[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(128)), ldc:int(0))) {
            var_3_634 = and:int(var_3_634:int, ldc:int(-574758973))
            var_5_7D = and:int(ldc:int(-5726), ldc:int(4189))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(18691), ldc:int(-26884)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_634:int, ldc:int(-2013927453))
                    var_9_C1 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_84:int, xor:int(ldc:int(6161), ldc:int(6160)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, xor:int(ldc:int(-32764), ldc:int(-32763)))), var_7_93:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_634 = and:int(var_3_D2:int, ldc:int(-926966177))
                    var_14_10D = var_7_93:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), xor:int(ldc:int(26632), ldc:int(26633)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_84:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1466)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(256)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(-693984395))
                        goto(Label_1332)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(-98203166))
                        goto(Label_1218)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1091)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(-1636134479))
                        goto(Label_0937)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(2)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(23818048))
                        goto(Label_0810)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(256)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(2022151434))
                        goto(Label_0676)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(64)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(-262730206))
                        goto(Label_0573)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(1236504143))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0573)
                            }
                            
                            goto(Label_0810)
                        }
                    }
                    
                    Label_0405:
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(935227060))
                        goto(Label_1466)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1332)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(256)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(714243557))
                        goto(Label_1218)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(811778784))
                        goto(Label_1091)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0937)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0810)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(414878488))
                        goto(Label_0676)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(64)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(981697545))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_634 = and:int(var_3_634:int, ldc:int(1724183615))
                            loopcontinue()
                        }
                        
                        var_3_634 = and:int(var_3_634:int, ldc:int(-1061163037))
                        var_11_E3 = and:int(ldc:int(22677), ldc:int(-22678))
                        goto(Label_1455)
                    }
                    
                    Label_0573:
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1466)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1332)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1218)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1091)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0937)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0810)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(1)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(-1435320806))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_634 = and:int(var_3_634:int, ldc:int(2059641174))
                            goto(Label_0405)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_634:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_634 = and:int(var_3_634:int, ldc:int(-1429349851))
                            loopcontinue()
                        }
                        
                        var_3_634 = and:int(var_3_634:int, ldc:int(-218106801))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0810)
                        }
                    }
                    
                    Label_0676:
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(1431501466))
                        goto(Label_1466)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(140968211))
                        goto(Label_1332)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(754673855))
                        goto(Label_1218)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1091)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0937)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(-1964464277))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_634:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_634 = and:int(var_3_634:int, ldc:int(-1737058864))
                            goto(Label_0573)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_634 = and:int(var_3_634:int, ldc:int(-1869332725))
                            goto(Label_0405)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_634:int, ldc:int(4096)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_634 = and:int(var_3_634:int, ldc:int(-743201461))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0810:
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1466)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(-1255253535))
                        goto(Label_1332)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1218)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(1747013290))
                        goto(Label_1091)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(2)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(767754380))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_634:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_634 = and:int(var_3_634:int, ldc:int(-269955504))
                            goto(Label_0676)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_634:int, ldc:int(128)), ldc:int(0))) {
                            var_3_634 = and:int(var_3_634:int, ldc:int(316210989))
                            goto(Label_0573)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_634:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0405)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(2)), ldc:int(0))) {
                            var_3_634 = and:int(var_3_634:int, ldc:int(-461045175))
                            loopcontinue()
                        }
                        
                        var_3_634 = and:int(var_3_634:int, ldc:int(384156887))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_E3 = xor:int(ldc:int(-19968), ldc:int(-19967))
                                goto(Label_1091)
                            }
                        }
                    }
                    
                    Label_0937:
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(1724190679))
                        goto(Label_1466)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1332)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(2)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(-2900188))
                        goto(Label_1218)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(-914385657))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_634:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0810)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_634:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0676)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0573)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(64)), ldc:int(0))) {
                            var_3_634 = and:int(var_3_634:int, ldc:int(433916821))
                            goto(Label_0405)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_634:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_634 = and:int(var_3_634:int, ldc:int(158187410))
                            loopcontinue()
                        }
                        
                        var_3_634 = and:int(var_3_634:int, ldc:int(-1312846253))
                        var_11_E3 = and:int(ldc:int(26132), ldc:int(-26293))
                    }
                    
                    Label_1091:
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1466)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(1033287868))
                        goto(Label_1332)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(2)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(-1461716308))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0937)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_634 = and:int(var_3_634:int, ldc:int(-403713812))
                            goto(Label_0810)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(1)), ldc:int(0))) {
                            var_3_634 = and:int(var_3_634:int, ldc:int(357420063))
                            goto(Label_0676)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0573)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(64)), ldc:int(0))) {
                            var_3_634 = and:int(var_3_634:int, ldc:int(-29771794))
                            goto(Label_0405)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_634 = and:int(var_3_634:int, ldc:int(411337689))
                            loopcontinue()
                        }
                        
                        var_3_634 = and:int(var_3_634:int, ldc:int(1572439499))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1332)
                            }
                        }
                    }
                    
                    Label_1218:
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1466)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(32768)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_634:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_634 = and:int(var_3_634:int, ldc:int(-806108247))
                            goto(Label_1091)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_634:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_634 = and:int(var_3_634:int, ldc:int(-1556185081))
                            goto(Label_0937)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_634:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0810)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0676)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0573)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_634:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0405)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_634 = and:int(var_3_634:int, ldc:int(-1316646730))
                            loopcontinue()
                        }
                        
                        var_3_634 = and:int(var_3_634:int, ldc:int(-390099337))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_7D:int, var_16_111:int)
                        goto(Label_1455)
                    }
                    
                    Label_1332:
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(1561469695))
                        goto(Label_1466)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1218)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(-552740335))
                        goto(Label_1091)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(1288684690))
                        goto(Label_0937)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0810)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0676)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0573)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(2107217166))
                        goto(Label_0405)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(2048)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_634 = and:int(var_3_634:int, ldc:int(-1075452313))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1455:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_63F = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1466:
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(152633825))
                        goto(Label_1332)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(256)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(1663027480))
                        goto(Label_1218)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(1285476394))
                        goto(Label_1091)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0937)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0810)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0676)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(1)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(-1207037071))
                        goto(Label_0573)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(-1180700921))
                        goto(Label_0405)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(128)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(247039987))
                        var_17_63F = add:int(var_16_111:int, xor:int(ldc:int(2570), ldc:int(2571)))
                        looporswitchbreak()
                    }
                    
                    var_3_634 = and:int(var_3_634:int, ldc:int(-1407693455))
                }
                
                var_3_634 = and:int(var_3_634:int, ldc:int(-1326056217))
                
                if (cmple:boolean(var_5_7D = var_17_63F:int, sub:int(var_6_84:int, xor:int(ldc:int(8472), ldc:int(8473))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(1)), ldc:int(0))) {
            var_3_634 = and:int(var_3_634:int, ldc:int(-82018134))
            goto(Label_0106)
        }
    }
}
