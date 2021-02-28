public abstract class \u59ec\u8413\u97e6\uc229\u3776.\uc87f\u9af2\u3711\u416d\ub19c<T> {
    public void \uc87f\u9af2\u3711\u416d\ub19c() {
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
            invokespecial:Object(Object::<init>, this:\uc87f\u9af2\u3711\u416d\ub19c<T>)
            putfield:List<\u67d0\u36d3\uae5d\u99f7\u9a18>(\uc87f\u9af2\u3711\u416d\ub19c::\u983f\u6c56\u4f4a\u7049\u4e72\ua562, this:\uc87f\u9af2\u3711\u416d\ub19c<T>, invokestatic:ArrayList[expected:List<\u67d0\u36d3\uae5d\u99f7\u9a18>](Lists::newArrayList))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public T extends \u59ec\u8413\u97e6\uc229\u3776.\uc87f\u9af2\u3711\u416d\ub19c<T> \u7873\u8bb0\u9255\uafe7\u7330\u4daf(\ub113\uc4d2\u183a\u527a\u6435.\u760c\uc2e8\ub70c\u4f4a\ucb79 p0) {
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
            invokeinterface:boolean(List<\u67d0\u36d3\uae5d\u99f7\u9a18>::add, getfield:List<\u67d0\u36d3\uae5d\u99f7\u9a18>(\uc87f\u9af2\u3711\u416d\ub19c::\u983f\u6c56\u4f4a\u7049\u4e72\ua562, this:\uc87f\u9af2\u3711\u416d\ub19c<T>), invokeinterface:\u67d0\u36d3\uae5d\u99f7\u9a18(\u760c\uc2e8\ub70c\u4f4a\ucb79::\u5fe1\ud51e\u4ab3\ucb79\u760c\u40a9, p0:\u760c\uc2e8\ub70c\u4f4a\ucb79))
            return:T extends \uc87f\u9af2\u3711\u416d\ub19c<T>(invokevirtual:T extends \uc87f\u9af2\u3711\u416d\ub19c<T>(\uc87f\u9af2\u3711\u416d\ub19c<T>::\ubded\u4179\uc31c\u6b5f\u7330\ufcaf, this:\uc87f\u9af2\u3711\u416d\ub19c<T>))
        }
        
        goto(Label_0006)
    }
    
    public final T extends \u59ec\u8413\u97e6\uc229\u3776.\uc87f\u9af2\u3711\u416d\ub19c<T> \u69d9\u51b2\u494c\u71ae\u97e6\u3e75() {
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
            return:T extends \uc87f\u9af2\u3711\u416d\ub19c<T>(invokevirtual:T extends \uc87f\u9af2\u3711\u416d\ub19c<T>(\uc87f\u9af2\u3711\u416d\ub19c<T>::\ubded\u4179\uc31c\u6b5f\u7330\ufcaf, this:\uc87f\u9af2\u3711\u416d\ub19c<T>))
        }
        
        goto(Label_0006)
    }
    
    public abstract T extends \u59ec\u8413\u97e6\uc229\u3776.\uc87f\u9af2\u3711\u416d\ub19c<T> \ubded\u4179\uc31c\u6b5f\u7330\ufcaf();
    
    public \u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u67d0\u36d3\uae5d\u99f7\u9a18[] \u7049\u624e\ub7dc\u93a2\uc246\u3776() {
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
            return:\u67d0\u36d3\uae5d\u99f7\u9a18[](checkcast:\u67d0\u36d3\uae5d\u99f7\u9a18[](\u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u67d0\u36d3\uae5d\u99f7\u9a18[].class, invokeinterface:\u67d0\u36d3\uae5d\u99f7\u9a18[](List<\u67d0\u36d3\uae5d\u99f7\u9a18>::toArray, getfield:List<\u67d0\u36d3\uae5d\u99f7\u9a18>(\uc87f\u9af2\u3711\u416d\ub19c::\u983f\u6c56\u4f4a\u7049\u4e72\ua562, this:\uc87f\u9af2\u3711\u416d\ub19c<T>), newarray:\u67d0\u36d3\uae5d\u99f7\u9a18[](\u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u67d0\u36d3\uae5d\u99f7\u9a18.class, and:int(ldc:int(-22468), ldc:int(21187))))))
        }
        
        goto(Label_0006)
    }
    
    public java.lang.Object \u69d9\u51b2\u494c\u71ae\u97e6\u3e75() {
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
            return:Object(invokevirtual:Object(\uc87f\u9af2\u3711\u416d\ub19c<Object>::\u69d9\u51b2\u494c\u71ae\u97e6\u3e75, this:\uc87f\u9af2\u3711\u416d\ub19c<T>))
        }
        
        goto(Label_0006)
    }
    
    public java.lang.Object \u7873\u8bb0\u9255\uafe7\u7330\u4daf(\ub113\uc4d2\u183a\u527a\u6435.\u760c\uc2e8\ub70c\u4f4a\ucb79 p0) {
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
            return:Object(invokevirtual:Object(\uc87f\u9af2\u3711\u416d\ub19c<Object>::\u7873\u8bb0\u9255\uafe7\u7330\u4daf, this:\uc87f\u9af2\u3711\u416d\ub19c<T>, p0:\u760c\uc2e8\ub70c\u4f4a\ucb79))
        }
        
        goto(Label_0006)
    }
    
    public void \u5db4\u92ee\u8753\uc29a\u5d20\ub113(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_5FD : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_608 : int
        
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
        var_3_5FD = and:int(ldc:int(1984856975), ldc:int(1927401292))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\uc87f\u9af2\u3711\u416d\ub19c<T>[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(4096)), ldc:int(0))) {
            var_3_5FD = and:int(var_3_5FD:int, ldc:int(185392625))
        }
        else {
            var_3_5FD = and:int(var_3_5FD:int, ldc:int(-280127860))
            var_5_85 = and:int(ldc:int(8390), ldc:int(-8391))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-4542), ldc:int(4157)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_5FD:int, ldc:int(-564134057))
                    var_9_C1 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_8C:int, xor:int(ldc:int(106), ldc:int(107)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, and:int(ldc:int(8273), ldc:int(21633)))), var_7_9B:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_5FD = and:int(var_3_D2:int, ldc:int(-1015315580))
                    var_14_10D = var_7_9B:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), xor:int(ldc:int(1536), ldc:int(1537)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_8C:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(4)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-1061881931))
                        goto(Label_1426)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1276)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-261775910))
                        goto(Label_1186)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(1653043537))
                        goto(Label_1067)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0913)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0786)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(1598954636))
                        goto(Label_0660)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0549)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(512)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(242180692))
                    }
                    else {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(1980076653))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0549)
                            }
                            
                            goto(Label_0786)
                        }
                    }
                    
                    Label_0397:
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1426)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(1703184234))
                        goto(Label_1276)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-618549234))
                        goto(Label_1186)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(32)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(1319663266))
                        goto(Label_1067)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-1022625391))
                        goto(Label_0913)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0786)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0660)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(8388608)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_5FD = and:int(var_3_5FD:int, ldc:int(-90469817))
                            var_11_E3 = and:int(ldc:int(6665), ldc:int(-6666))
                            goto(Label_1415)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0549:
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(428250237))
                        goto(Label_1426)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1276)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1186)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1067)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0913)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-711808494))
                        goto(Label_0786)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(32)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-1249991396))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_5FD = and:int(var_3_5FD:int, ldc:int(-1544324742))
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(32768)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(1243063844))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0786)
                        }
                    }
                    
                    Label_0660:
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(32)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(1451619201))
                        goto(Label_1426)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(328294394))
                        goto(Label_1276)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1186)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1067)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(503471884))
                        goto(Label_0913)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(2097152)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_5FD = and:int(var_3_5FD:int, ldc:int(-808255927))
                            goto(Label_0549)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_5FD = and:int(var_3_5FD:int, ldc:int(184135156))
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(32)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-547560754))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0786:
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-304896159))
                        goto(Label_1426)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1276)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-1649859215))
                        goto(Label_1186)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-1423801510))
                        goto(Label_1067)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(512)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(206823626))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0660)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0549)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(32)), ldc:int(0))) {
                            var_3_5FD = and:int(var_3_5FD:int, ldc:int(-36705300))
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_5FD = and:int(var_3_5FD:int, ldc:int(53696449))
                            loopcontinue()
                        }
                        
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(1132233686))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_E3 = xor:int(ldc:boolean(0), ldc:boolean(1))
                                goto(Label_1067)
                            }
                        }
                    }
                    
                    Label_0913:
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1426)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1276)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-104437369))
                        goto(Label_1186)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-1252807766))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(512)), ldc:int(0))) {
                            var_3_5FD = and:int(var_3_5FD:int, ldc:int(2126157466))
                            goto(Label_0786)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_5FD = and:int(var_3_5FD:int, ldc:int(1297756853))
                            goto(Label_0660)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0549)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(32)), ldc:int(0))) {
                            var_3_5FD = and:int(var_3_5FD:int, ldc:int(453084740))
                            loopcontinue()
                        }
                        
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(1653989303))
                        var_11_E3 = and:int(ldc:int(-12665), ldc:int(12624))
                    }
                    
                    Label_1067:
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-111752459))
                        goto(Label_1426)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-919867452))
                        goto(Label_1276)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(1032976088))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0913)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0786)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0660)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(32)), ldc:int(0))) {
                            var_3_5FD = and:int(var_3_5FD:int, ldc:int(1016077871))
                            goto(Label_0549)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_5FD = and:int(var_3_5FD:int, ldc:int(2130770925))
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(32768)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-749620481))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1276)
                            }
                        }
                    }
                    
                    Label_1186:
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1426)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(2097152)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_1067)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0913)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0786)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0660)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0549)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(16)), ldc:int(0))) {
                            var_3_5FD = and:int(var_3_5FD:int, ldc:int(1180015351))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_85:int, var_16_111:int)
                            goto(Label_1415)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1276:
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1426)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(16)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(1941496365))
                        goto(Label_1186)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(16)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-854568546))
                        goto(Label_1067)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(4)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-1598613882))
                        goto(Label_0913)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0786)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0660)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(16)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(2102733312))
                        goto(Label_0549)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(2077727945))
                        goto(Label_0397)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(32)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-1297925305))
                        loopcontinue()
                    }
                    
                    var_3_5FD = and:int(var_3_5FD:int, ldc:int(-570180618))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1415:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_608 = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1426:
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1276)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1186)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(589387269))
                        goto(Label_1067)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(4)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-63749245))
                        goto(Label_0913)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0786)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(519916198))
                        goto(Label_0660)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-2016620057))
                        goto(Label_0549)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0397)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(1655613013))
                        var_17_608 = add:int(var_16_111:int, and:int(ldc:int(1417), ldc:int(8709)))
                        looporswitchbreak()
                    }
                    
                    var_3_5FD = and:int(var_3_5FD:int, ldc:int(994591036))
                }
                
                var_3_5FD = and:int(var_3_5FD:int, ldc:int(-634586172))
                
                if (cmple:boolean(var_5_85 = var_17_608:int, sub:int(var_6_8C:int, xor:int(ldc:int(15), ldc:int(14))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(16)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
