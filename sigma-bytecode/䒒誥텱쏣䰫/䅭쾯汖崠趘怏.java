public final class \u4492\u8aa5\ud171\uc3e3\u4c2b.\u416d\ucfaf\u6c56\u5d20\u8d98\u600f {
    public void \u416d\ucfaf\u6c56\u5d20\u8d98\u600f() {
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
            invokespecial:Object(Object::<init>, this:\u416d\ucfaf\u6c56\u5d20\u8d98\u600f)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public int compare(java.lang.Object p0, java.lang.Object p1) {
        var_3_DE : int
        var_5_64 : \uc4d2\u3d64\u34df\uf995\u6435\ua562
        var_6_6A : \uc4d2\u3d64\u34df\uf995\u6435\ua562
        stack_12B_0 : int [generated]
        
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
        var_3_DE = and:int(ldc:int(-1237849156), ldc:int(-76566754))
        var_5_64 = checkcast:\uc4d2\u3d64\u34df\uf995\u6435\ua562(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uc4d2\u3d64\u34df\uf995\u6435\ua562.class, p0:Object[expected:\uc4d2\u3d64\u34df\uf995\u6435\ua562])
        var_6_6A = checkcast:\uc4d2\u3d64\u34df\uf995\u6435\ua562(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uc4d2\u3d64\u34df\uf995\u6435\ua562.class, p1:Object[expected:\uc4d2\u3d64\u34df\uf995\u6435\ua562])
        
        if (cmpeq:boolean(getfield:int(\uc4d2\u3d64\u34df\uf995\u6435\ua562::\u51b2\ua068\u4492\u3d64\u4f4a\ub1b9, var_5_64:\uc4d2\u3d64\u34df\uf995\u6435\ua562), getfield:int(\uc4d2\u3d64\u34df\uf995\u6435\ua562::\u51b2\ua068\u4492\u3d64\u4f4a\ub1b9, var_6_6A:\uc4d2\u3d64\u34df\uf995\u6435\ua562))) {
            loop {
                if (cmpeq:boolean(and:int(var_3_DE:int, ldc:int(268435456)), ldc:int(0))) {
                    var_3_DE = and:int(var_3_DE:int, ldc:int(-716350236))
                    goto(Label_0204)
                }
                
                if (cmpeq:boolean(and:int(var_3_DE:int, ldc:int(256)), ldc:int(0))) {
                    var_3_DE = and:int(var_3_DE:int, ldc:int(962289120))
                }
                else {
                    var_3_DE = and:int(var_3_DE:int, ldc:int(-108544195))
                    
                    if (cmpne:boolean(getfield:int(\uc4d2\u3d64\u34df\uf995\u6435\ua562::\u385b\u88c5\uc4d2\u5140\u960f\uc87f, var_5_64:\uc4d2\u3d64\u34df\uf995\u6435\ua562), getfield:int(\uc4d2\u3d64\u34df\uf995\u6435\ua562::\u385b\u88c5\uc4d2\u5140\u960f\uc87f, var_6_6A:\uc4d2\u3d64\u34df\uf995\u6435\ua562))) {
                        return:int(sub:int(getfield:int(\uc4d2\u3d64\u34df\uf995\u6435\ua562::\u385b\u88c5\uc4d2\u5140\u960f\uc87f, var_6_6A:\uc4d2\u3d64\u34df\uf995\u6435\ua562), getfield:int(\uc4d2\u3d64\u34df\uf995\u6435\ua562::\u385b\u88c5\uc4d2\u5140\u960f\uc87f, var_5_64:\uc4d2\u3d64\u34df\uf995\u6435\ua562)))
                    }
                }
                
                Label_0169:
                
                if (cmpne:boolean(and:int(var_3_DE:int, ldc:int(32768)), ldc:int(0))) {
                    if (cmpne:boolean(and:int(var_3_DE:int, ldc:int(134217728)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_DE = and:int(var_3_DE:int, ldc:int(1426053630))
                    
                    if (logicalnot:boolean(invokevirtual:boolean(String::equals, getfield:String(\uc4d2\u3d64\u34df\uf995\u6435\ua562::\ud217\u7006\u6b5f\uc7fe\uc9f6\u34df, var_5_64:\uc4d2\u3d64\u34df\uf995\u6435\ua562), getfield:String(\uc4d2\u3d64\u34df\uf995\u6435\ua562::\ud217\u7006\u6b5f\uc7fe\uc9f6\u34df, var_6_6A:\uc4d2\u3d64\u34df\uf995\u6435\ua562)))) {
                        stack_12B_0 = invokevirtual:int(String::compareTo, getfield:String(\uc4d2\u3d64\u34df\uf995\u6435\ua562::\ud217\u7006\u6b5f\uc7fe\uc9f6\u34df, var_5_64:\uc4d2\u3d64\u34df\uf995\u6435\ua562), getfield:String(\uc4d2\u3d64\u34df\uf995\u6435\ua562::\ud217\u7006\u6b5f\uc7fe\uc9f6\u34df, var_6_6A:\uc4d2\u3d64\u34df\uf995\u6435\ua562))
                        looporswitchbreak()
                    }
                }
                
                Label_0204:
                
                if (cmpeq:boolean(and:int(var_3_DE:int, ldc:int(2147483647)), ldc:int(0))) {
                    goto(Label_0169)
                }
                
                if (cmpne:boolean(and:int(var_3_DE:int, ldc:int(268435456)), ldc:int(0))) {
                    var_3_DE = and:int(var_3_DE:int, ldc:int(1392754132))
                    stack_12B_0 = invokevirtual:int(String::compareTo, getfield:String(\uc4d2\u3d64\u34df\uf995\u6435\ua562::\u3776\u67e9\ud523\ud158\u5bc4\uae5d, var_5_64:\uc4d2\u3d64\u34df\uf995\u6435\ua562), getfield:String(\uc4d2\u3d64\u34df\uf995\u6435\ua562::\u3776\u67e9\ud523\ud158\u5bc4\uae5d, var_6_6A:\uc4d2\u3d64\u34df\uf995\u6435\ua562))
                    looporswitchbreak()
                }
            }
            
            return:int(stack_12B_0:int)
        }
        
        return:int(sub:int(getfield:int(\uc4d2\u3d64\u34df\uf995\u6435\ua562::\u51b2\ua068\u4492\u3d64\u4f4a\ub1b9, var_5_64:\uc4d2\u3d64\u34df\uf995\u6435\ua562), getfield:int(\uc4d2\u3d64\u34df\uf995\u6435\ua562::\u51b2\ua068\u4492\u3d64\u4f4a\ub1b9, var_6_6A:\uc4d2\u3d64\u34df\uf995\u6435\ua562)))
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
    
    public void \u8df4\u3bc9\u6435\u4daf\u7006\ubcb0(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_5A5 : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_5B0 : int
        
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
        var_3_5A5 = and:int(ldc:int(1347279708), ldc:int(1902485277))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u416d\ucfaf\u6c56\u5d20\u8d98\u600f[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_5A5:int, ldc:int(131072)), ldc:int(0))) {
            var_3_5A5 = and:int(var_3_5A5:int, ldc:int(1928126228))
            var_5_7D = and:int(ldc:int(-20416), ldc:int(18103))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(32456), ldc:int(-32746)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_5A5:int, ldc:int(-682188900))
                    var_9_C1 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_84:int, and:int(ldc:int(8265), ldc:int(3109)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, and:int(ldc:int(4481), ldc:int(25105)))), var_7_93:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_5A5 = and:int(var_3_D2:int, ldc:int(1584708981))
                    var_14_10D = var_7_93:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), xor:int(ldc:int(4242), ldc:int(4243)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_84:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_5A5:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_5A5 = and:int(var_3_5A5:int, ldc:int(1906547634))
                        goto(Label_1346)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5A5:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_5A5 = and:int(var_3_5A5:int, ldc:int(-696828737))
                        goto(Label_1212)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5A5:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1098)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5A5:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0987)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5A5:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0841)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5A5:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0738)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5A5:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0620)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5A5:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_5A5 = and:int(var_3_5A5:int, ldc:int(1834472173))
                        goto(Label_0517)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5A5:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5A5 = and:int(var_3_5A5:int, ldc:int(-28852354))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0517)
                            }
                            
                            goto(Label_0738)
                        }
                    }
                    
                    Label_0381:
                    
                    if (cmpeq:boolean(and:int(var_3_5A5:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1346)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5A5:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1212)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5A5:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1098)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5A5:int, ldc:int(16)), ldc:int(0))) {
                        var_3_5A5 = and:int(var_3_5A5:int, ldc:int(-843679158))
                        goto(Label_0987)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5A5:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0841)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5A5:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0738)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5A5:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0620)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5A5:int, ldc:int(16)), ldc:int(0))) {
                        var_3_5A5 = and:int(var_3_5A5:int, ldc:int(1326935982))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5A5:int, ldc:int(256)), ldc:int(0))) {
                            var_3_5A5 = and:int(var_3_5A5:int, ldc:int(-655385773))
                            var_11_E3 = and:int(ldc:int(8885), ldc:int(-9142))
                            goto(Label_1335)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0517:
                    
                    if (cmpeq:boolean(and:int(var_3_5A5:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1346)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5A5:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1212)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5A5:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1098)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5A5:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_5A5 = and:int(var_3_5A5:int, ldc:int(-1934316059))
                        goto(Label_0987)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5A5:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_5A5 = and:int(var_3_5A5:int, ldc:int(349587191))
                        goto(Label_0841)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5A5:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0738)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5A5:int, ldc:int(256)), ldc:int(0))) {
                        var_3_5A5 = and:int(var_3_5A5:int, ldc:int(-1722197151))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5A5:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5A5:int, ldc:int(1073741824)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5A5 = and:int(var_3_5A5:int, ldc:int(-654327842))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0738)
                        }
                    }
                    
                    Label_0620:
                    
                    if (cmpne:boolean(and:int(var_3_5A5:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1346)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5A5:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1212)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5A5:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_5A5 = and:int(var_3_5A5:int, ldc:int(-1206901274))
                        goto(Label_1098)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5A5:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0987)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5A5:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0841)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5A5:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_5A5 = and:int(var_3_5A5:int, ldc:int(522282849))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5A5:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0517)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5A5:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_5A5 = and:int(var_3_5A5:int, ldc:int(530915615))
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5A5:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_5A5 = and:int(var_3_5A5:int, ldc:int(-2121482794))
                            loopcontinue()
                        }
                        
                        var_3_5A5 = and:int(var_3_5A5:int, ldc:int(-263791777))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0738:
                    
                    if (cmpne:boolean(and:int(var_3_5A5:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1346)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5A5:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1212)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5A5:int, ldc:int(256)), ldc:int(0))) {
                        var_3_5A5 = and:int(var_3_5A5:int, ldc:int(1126093906))
                        goto(Label_1098)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5A5:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0987)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5A5:int, ldc:int(131072)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5A5:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0620)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5A5:int, ldc:int(16)), ldc:int(0))) {
                            var_3_5A5 = and:int(var_3_5A5:int, ldc:int(-1867686854))
                            goto(Label_0517)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5A5:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_5A5 = and:int(var_3_5A5:int, ldc:int(-197015555))
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5A5:int, ldc:int(2048)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5A5 = and:int(var_3_5A5:int, ldc:int(2079767862))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_E3 = xor:int(ldc:int(1472), ldc:int(1473))
                                goto(Label_0987)
                            }
                        }
                    }
                    
                    Label_0841:
                    
                    if (cmpeq:boolean(and:int(var_3_5A5:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_5A5 = and:int(var_3_5A5:int, ldc:int(-1565219553))
                        goto(Label_1346)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5A5:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1212)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5A5:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1098)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5A5:int, ldc:int(16)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5A5:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_5A5 = and:int(var_3_5A5:int, ldc:int(-1776245784))
                            goto(Label_0738)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5A5:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_5A5 = and:int(var_3_5A5:int, ldc:int(1240797417))
                            goto(Label_0620)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5A5:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0517)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5A5:int, ldc:int(16)), ldc:int(0))) {
                            var_3_5A5 = and:int(var_3_5A5:int, ldc:int(1952733798))
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5A5:int, ldc:int(262144)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5A5 = and:int(var_3_5A5:int, ldc:int(-188237476))
                        var_11_E3 = and:int(ldc:int(6691), ldc:int(-7980))
                    }
                    
                    Label_0987:
                    
                    if (cmpeq:boolean(and:int(var_3_5A5:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_5A5 = and:int(var_3_5A5:int, ldc:int(-209678094))
                        goto(Label_1346)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5A5:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_5A5 = and:int(var_3_5A5:int, ldc:int(-1497358007))
                        goto(Label_1212)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5A5:int, ldc:int(2048)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5A5:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0841)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5A5:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_5A5 = and:int(var_3_5A5:int, ldc:int(-639006497))
                            goto(Label_0738)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5A5:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0620)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5A5:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0517)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5A5:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5A5:int, ldc:int(256)), ldc:int(0))) {
                            var_3_5A5 = and:int(var_3_5A5:int, ldc:int(-262992758))
                            loopcontinue()
                        }
                        
                        var_3_5A5 = and:int(var_3_5A5:int, ldc:int(-756156141))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1212)
                            }
                        }
                    }
                    
                    Label_1098:
                    
                    if (cmpne:boolean(and:int(var_3_5A5:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1346)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5A5:int, ldc:int(256)), ldc:int(0))) {
                        var_3_5A5 = and:int(var_3_5A5:int, ldc:int(908341486))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5A5:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0987)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5A5:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0841)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5A5:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0738)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5A5:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0620)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5A5:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_5A5 = and:int(var_3_5A5:int, ldc:int(-754446412))
                            goto(Label_0517)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5A5:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5A5:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_5A5 = and:int(var_3_5A5:int, ldc:int(1271067476))
                            loopcontinue()
                        }
                        
                        var_3_5A5 = and:int(var_3_5A5:int, ldc:int(-252732489))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_7D:int, var_16_111:int)
                        goto(Label_1335)
                    }
                    
                    Label_1212:
                    
                    if (cmpeq:boolean(and:int(var_3_5A5:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1346)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5A5:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_5A5 = and:int(var_3_5A5:int, ldc:int(811677203))
                        goto(Label_1098)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5A5:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0987)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5A5:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0841)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5A5:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_5A5 = and:int(var_3_5A5:int, ldc:int(-58471389))
                        goto(Label_0738)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5A5:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_5A5 = and:int(var_3_5A5:int, ldc:int(1332270960))
                        goto(Label_0620)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5A5:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0517)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5A5:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0381)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5A5:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_5A5 = and:int(var_3_5A5:int, ldc:int(128812742))
                        loopcontinue()
                    }
                    
                    var_3_5A5 = and:int(var_3_5A5:int, ldc:int(-236536014))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1335:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_5B0 = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1346:
                    
                    if (cmpeq:boolean(and:int(var_3_5A5:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1212)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5A5:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_5A5 = and:int(var_3_5A5:int, ldc:int(-1528725611))
                        goto(Label_1098)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5A5:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_5A5 = and:int(var_3_5A5:int, ldc:int(-1397976478))
                        goto(Label_0987)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5A5:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0841)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5A5:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_5A5 = and:int(var_3_5A5:int, ldc:int(312875081))
                        goto(Label_0738)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5A5:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0620)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5A5:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0517)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5A5:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_5A5 = and:int(var_3_5A5:int, ldc:int(-308451814))
                        goto(Label_0381)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5A5:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_5A5 = and:int(var_3_5A5:int, ldc:int(1592179120))
                        var_17_5B0 = add:int(var_16_111:int, xor:int(ldc:int(1280), ldc:int(1281)))
                        looporswitchbreak()
                    }
                }
                
                var_3_5A5 = and:int(var_3_5A5:int, ldc:int(1484709372))
                
                if (cmple:boolean(var_5_7D = var_17_5B0:int, sub:int(var_6_84:int, xor:int(ldc:int(19457), ldc:int(19456))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpne:boolean(and:int(var_3_5A5:int, ldc:int(131072)), ldc:int(0))) {
            var_3_5A5 = and:int(var_3_5A5:int, ldc:int(-1354726835))
            goto(Label_0106)
        }
    }
}
