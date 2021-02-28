public class \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u5d20\uc2e8\u7d52\ubff1\u72f1\u6b5f {
    public void \u5d20\uc2e8\u7d52\ubff1\u72f1\u6b5f() {
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
            invokespecial:Object(Object::<init>, this:\u5d20\uc2e8\u7d52\ubff1\u72f1\u6b5f)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public int compare(java.lang.Object p0, java.lang.Object p1) {
        var_3_A0 : int
        var_5_64 : \uc4d2\u3d64\u34df\uf995\u6435\ua562
        var_6_6A : \uc4d2\u3d64\u34df\uf995\u6435\ua562
        stack_DA_0 : int [generated]
        
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
        var_3_A0 = and:int(ldc:int(550793880), ldc:int(1898200767))
        var_5_64 = checkcast:\uc4d2\u3d64\u34df\uf995\u6435\ua562(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uc4d2\u3d64\u34df\uf995\u6435\ua562.class, p0:Object[expected:\uc4d2\u3d64\u34df\uf995\u6435\ua562])
        var_6_6A = checkcast:\uc4d2\u3d64\u34df\uf995\u6435\ua562(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uc4d2\u3d64\u34df\uf995\u6435\ua562.class, p1:Object[expected:\uc4d2\u3d64\u34df\uf995\u6435\ua562])
        
        if (cmpeq:boolean(getfield:int(\uc4d2\u3d64\u34df\uf995\u6435\ua562::\u385b\u88c5\uc4d2\u5140\u960f\uc87f, var_5_64:\uc4d2\u3d64\u34df\uf995\u6435\ua562), getfield:int(\uc4d2\u3d64\u34df\uf995\u6435\ua562::\u385b\u88c5\uc4d2\u5140\u960f\uc87f, var_6_6A:\uc4d2\u3d64\u34df\uf995\u6435\ua562))) {
            do {
                if (cmpne:boolean(and:int(var_3_A0:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_3_A0 = and:int(var_3_A0:int, ldc:int(817790076))
                    
                    if (invokestatic:boolean(\u8308\u51fa\u6c56\u5db4\ub18d\u34df::equals, getfield:String[expected:Object](\uc4d2\u3d64\u34df\uf995\u6435\ua562::\ud217\u7006\u6b5f\uc7fe\uc9f6\u34df, var_5_64:\uc4d2\u3d64\u34df\uf995\u6435\ua562), getfield:String(\uc4d2\u3d64\u34df\uf995\u6435\ua562::\ud217\u7006\u6b5f\uc7fe\uc9f6\u34df, var_6_6A:\uc4d2\u3d64\u34df\uf995\u6435\ua562))) {
                        loopcontinue()
                    }
                    
                    stack_DA_0 = invokevirtual:int(String::compareTo, getfield:String(\uc4d2\u3d64\u34df\uf995\u6435\ua562::\ud217\u7006\u6b5f\uc7fe\uc9f6\u34df, var_5_64:\uc4d2\u3d64\u34df\uf995\u6435\ua562), getfield:String(\uc4d2\u3d64\u34df\uf995\u6435\ua562::\ud217\u7006\u6b5f\uc7fe\uc9f6\u34df, var_6_6A:\uc4d2\u3d64\u34df\uf995\u6435\ua562))
                    return:int(stack_DA_0:int)
                }
            } while (cmpeq:boolean(and:int(var_3_A0:int, ldc:int(536870912)), ldc:int(0)))
            
            var_3_A0 = and:int(var_3_A0:int, ldc:int(1810758333))
            stack_DA_0 = invokevirtual:int(String::compareTo, getfield:String(\uc4d2\u3d64\u34df\uf995\u6435\ua562::\u3776\u67e9\ud523\ud158\u5bc4\uae5d, var_5_64:\uc4d2\u3d64\u34df\uf995\u6435\ua562), getfield:String(\uc4d2\u3d64\u34df\uf995\u6435\ua562::\u3776\u67e9\ud523\ud158\u5bc4\uae5d, var_6_6A:\uc4d2\u3d64\u34df\uf995\u6435\ua562))
            return:int(stack_DA_0:int)
        }
        
        return:int(sub:int(getfield:int(\uc4d2\u3d64\u34df\uf995\u6435\ua562::\u385b\u88c5\uc4d2\u5140\u960f\uc87f, var_6_6A:\uc4d2\u3d64\u34df\uf995\u6435\ua562), getfield:int(\uc4d2\u3d64\u34df\uf995\u6435\ua562::\u385b\u88c5\uc4d2\u5140\u960f\uc87f, var_5_64:\uc4d2\u3d64\u34df\uf995\u6435\ua562)))
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
    
    public void \uc238\u7873\u647c\ub8be\u6d99\u7d52(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_5CD : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_B9 : double
        var_3_CA : int
        var_11_DB : int
        var_14_105 : double
        var_16_109 : int
        var_12_101 : double
        var_17_5D8 : int
        
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
        var_3_5CD = and:int(ldc:int(-1845945540), ldc:int(-910345345))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u5d20\uc2e8\u7d52\ubff1\u72f1\u6b5f[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(32768)), ldc:int(0))) {
            var_3_5CD = and:int(var_3_5CD:int, ldc:int(649935167))
            var_5_7D = and:int(ldc:int(-7033), ldc:int(4984))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-25172), ldc:int(25171)))
            invokestatic:int(m::a)
            
            loop {
                var_9_B9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_CA = and:int(var_3_5CD:int, ldc:int(1655963068))
                    var_9_B9 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_DB = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_DB:int, sub:int(var_6_84:int, and:int(ldc:int(7429), ldc:int(145)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_DB:int, and:int(ldc:int(11289), ldc:int(129)))), var_7_93:double))) {
                        inc:int(var_11_DB, ldc:int(1))
                    }
                    
                    var_3_5CD = and:int(var_3_CA:int, ldc:int(801069500))
                    var_14_105 = var_7_93:double
                    var_16_109 = var_11_DB:int
                }
                else {
                    var_11_DB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), and:int(ldc:int(513), ldc:int(18433)))
                    var_12_101 = var_14_105 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_109 = var_11_DB:int, var_6_84:int)) {
                        var_9_B9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_DB:int)
                        var_16_109 = var_11_DB:int
                        var_14_105 = var_12_101:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(-241097761))
                        goto(Label_1410)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(128)), ldc:int(0))) {
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(952995573))
                        goto(Label_1292)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1146)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1027)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0881)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(759739988))
                        goto(Label_0770)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0652)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0525)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(-1140990082))
                        
                        if (cmplt:boolean(var_16_109:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0525)
                            }
                            
                            goto(Label_0770)
                        }
                    }
                    
                    Label_0373:
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1410)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(-1093425281))
                        goto(Label_1292)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(1024011845))
                        goto(Label_1146)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1027)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0881)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0770)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(-735144740))
                        goto(Label_0652)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(8388608)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_5CD = and:int(var_3_5CD:int, ldc:int(1171425575))
                            loopcontinue()
                        }
                        
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(-1325794562))
                        var_11_DB = and:int(ldc:int(-18888), ldc:int(18884))
                        goto(Label_1399)
                    }
                    
                    Label_0525:
                    
                    if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(536523841))
                        goto(Label_1410)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(8)), ldc:int(0))) {
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(-904308019))
                        goto(Label_1292)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1146)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(851454540))
                        goto(Label_1027)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0881)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0770)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(85004188))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_5CD = and:int(var_3_5CD:int, ldc:int(1573870307))
                            goto(Label_0373)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_5CD = and:int(var_3_5CD:int, ldc:int(1164691209))
                            loopcontinue()
                        }
                        
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(335527615))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_105 = var_9_B9:double
                            goto(Label_0770)
                        }
                    }
                    
                    Label_0652:
                    
                    if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(128)), ldc:int(0))) {
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(477890709))
                        goto(Label_1410)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1292)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1146)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(-1600197239))
                        goto(Label_1027)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(1)), ldc:int(0))) {
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(-617355665))
                        goto(Label_0881)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(4096)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0525)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_5CD = and:int(var_3_5CD:int, ldc:int(1495888444))
                            goto(Label_0373)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(16)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(1978736125))
                        var_14_105 = mul:double(ldc:double(0.5), add:double(var_9_B9:double, var_14_105:double))
                    }
                    
                    Label_0770:
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(-432152667))
                        goto(Label_1410)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(181089098))
                        goto(Label_1292)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(-1438223025))
                        goto(Label_1146)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(16)), ldc:int(0))) {
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(-1690597103))
                        goto(Label_1027)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(134217728)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0652)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0525)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0373)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(8388608)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(-658563396))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_DB = xor:int(ldc:int(80), ldc:int(81))
                                goto(Label_1027)
                            }
                        }
                    }
                    
                    Label_0881:
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1410)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1292)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1146)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(4)), ldc:int(0))) {
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(373930288))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0770)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(128)), ldc:int(0))) {
                            var_3_5CD = and:int(var_3_5CD:int, ldc:int(-1511259697))
                            goto(Label_0652)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_5CD = and:int(var_3_5CD:int, ldc:int(1308428153))
                            goto(Label_0525)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_5CD = and:int(var_3_5CD:int, ldc:int(-1952153201))
                            goto(Label_0373)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(8)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(-1712203012))
                        var_11_DB = and:int(ldc:int(-8232), ldc:int(8231))
                    }
                    
                    Label_1027:
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(-688802664))
                        goto(Label_1410)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1292)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(32)), ldc:int(0))) {
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(-1124521180))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_5CD = and:int(var_3_5CD:int, ldc:int(1641370056))
                            goto(Label_0881)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_5CD = and:int(var_3_5CD:int, ldc:int(-1767019138))
                            goto(Label_0770)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0652)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0525)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0373)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(16)), ldc:int(0))) {
                            var_3_5CD = and:int(var_3_5CD:int, ldc:int(1444690006))
                            loopcontinue()
                        }
                        
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(1706687548))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                                goto(Label_1292)
                            }
                        }
                    }
                    
                    Label_1146:
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(1604971605))
                        goto(Label_1410)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(64)), ldc:int(0))) {
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(-706967236))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_5CD = and:int(var_3_5CD:int, ldc:int(1615534188))
                            goto(Label_1027)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(16)), ldc:int(0))) {
                            var_3_5CD = and:int(var_3_5CD:int, ldc:int(1562067614))
                            goto(Label_0881)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_5CD = and:int(var_3_5CD:int, ldc:int(1478777331))
                            goto(Label_0770)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_5CD = and:int(var_3_5CD:int, ldc:int(-121988521))
                            goto(Label_0652)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_5CD = and:int(var_3_5CD:int, ldc:int(2054454793))
                            goto(Label_0525)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0373)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_5CD = and:int(var_3_5CD:int, ldc:int(519552894))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_105:double, var_5_7D:int, var_16_109:int)
                            goto(Label_1399)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1292:
                    
                    if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(1)), ldc:int(0))) {
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(-1953478785))
                        goto(Label_1410)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1146)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1027)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(1453682950))
                        goto(Label_0881)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0770)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0652)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0525)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0373)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(2147483647)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_5CD = and:int(var_3_5CD:int, ldc:int(620093181))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_105:double, ldc:double(0.0))
                    Label_1399:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_5D8 = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1410:
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1292)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1146)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1027)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0881)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(16)), ldc:int(0))) {
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(-320540821))
                        goto(Label_0770)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0652)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0525)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0373)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(32)), ldc:int(0))) {
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(-1762551300))
                        var_17_5D8 = add:int(var_16_109:int, xor:int(ldc:int(912), ldc:int(913)))
                        looporswitchbreak()
                    }
                }
                
                var_3_5CD = and:int(var_3_5CD:int, ldc:int(-2017887809))
                
                if (cmple:boolean(var_5_7D = var_17_5D8:int, sub:int(var_6_84:int, and:int(ldc:int(2057), ldc:int(1617))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(33554432)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
