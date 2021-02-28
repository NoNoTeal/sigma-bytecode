public class \u6435\ub8be\u718f\u6b0d\u67e9.\u8cae\u67e9\u392e\u67d0\u5245\u76bc {
    public void \u8cae\u67e9\u392e\u67d0\u5245\u76bc(\u71f1\uc910\u3bc9\u516c\u93a2.\u5db4\u8753\u1833\u92ee\ud158\u4c2b p0) {
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
            putfield:\u5db4\u8753\u1833\u92ee\ud158\u4c2b(\u8cae\u67e9\u392e\u67d0\u5245\u76bc::\ucfaf\u4f4a\ud36e\ua61f\uc3e3\u98a4, this:\u8cae\u67e9\u392e\u67d0\u5245\u76bc, p0:\u5db4\u8753\u1833\u92ee\ud158\u4c2b)
            invokespecial:Object(Object::<init>, this:\u8cae\u67e9\u392e\u67d0\u5245\u76bc)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void run() {
        var_1_A5 : int
        var_3_A0 : IOException
        
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
            var_1_A5 = and:int(ldc:int(421177289), ldc:int(2144446435))
            
            try {
                loop {
                    if (cmpne:boolean(and:int(var_1_A5:int, ldc:int(16)), ldc:int(0))) {
                        var_1_A5 = and:int(var_1_A5:int, ldc:int(100380467))
                    }
                    else {
                        var_1_A5 = and:int(var_1_A5:int, ldc:int(991701979))
                        
                        if (logicalnot:boolean(invokevirtual:boolean(\u5db4\u8753\u1833\u92ee\ud158\u4c2b::\u7873\u4ab3\uc29a\ud523\u6c52\u97b7, getfield:\u5db4\u8753\u1833\u92ee\ud158\u4c2b(\u8cae\u67e9\u392e\u67d0\u5245\u76bc::\ucfaf\u4f4a\ud36e\ua61f\uc3e3\u98a4, this:\u8cae\u67e9\u392e\u67d0\u5245\u76bc)))) {
                            looporswitchbreak()
                        }
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_A5:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_1_A5 = and:int(var_1_A5:int, ldc:int(-1224894461))
                    }
                    else {
                        var_1_A5 = and:int(var_1_A5:int, ldc:int(-1714144283))
                    }
                }
            }
            catch (java.io.IOException var_3_A0) {
                var_1_A5 = and:int(var_1_A5:int, ldc:int(1484537829))
                invokevirtual:void(\u5db4\u8753\u1833\u92ee\ud158\u4c2b::\u98a4\u7d52\uae87\u9033\ub19c\u6c52, getfield:\u5db4\u8753\u1833\u92ee\ud158\u4c2b(\u8cae\u67e9\u392e\u67d0\u5245\u76bc::\ucfaf\u4f4a\ud36e\ua61f\uc3e3\u98a4, this:\u8cae\u67e9\u392e\u67d0\u5245\u76bc), var_3_A0:IOException[expected:Exception], aconstnull:\u6fb0\u69d9\u7c6b\uc2bd\u4c2b\ud12e())
            }
            
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
    
    public void \uc246\u7043\ubcb0\u61a4\ucef1\u6fb0(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_635 : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_640 : int
        
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
        var_3_635 = and:int(ldc:int(-1595030377), ldc:int(-1980310413))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u8cae\u67e9\u392e\u67d0\u5245\u76bc[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(1048576)), ldc:int(0))) {
            var_3_635 = and:int(var_3_635:int, ldc:int(-1781867593))
            var_5_7D = and:int(ldc:int(29251), ldc:int(-29252))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(4456), ldc:int(-4457)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_635:int, ldc:int(-632308141))
                    var_9_C1 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_84:int, xor:int(ldc:int(18), ldc:int(19)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, and:int(ldc:int(3), ldc:int(25609)))), var_7_93:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_635 = and:int(var_3_D2:int, ldc:int(-1228225962))
                    var_14_10D = var_7_93:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), and:int(ldc:int(321), ldc:int(2089)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_84:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(-1121430232))
                        goto(Label_1482)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1356)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1218)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(-910919567))
                        goto(Label_1107)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(1500108390))
                        goto(Label_0953)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(64)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(561067231))
                        goto(Label_0818)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0684)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0565)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(256)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(-1477852906))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0565)
                            }
                            
                            goto(Label_0818)
                        }
                    }
                    
                    Label_0389:
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(1115658657))
                        goto(Label_1482)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(812893567))
                        goto(Label_1356)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(256348796))
                        goto(Label_1218)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(-787178726))
                        goto(Label_1107)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0953)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(46867887))
                        goto(Label_0818)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(256)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(370321756))
                        goto(Label_0684)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(738995008))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_635 = and:int(var_3_635:int, ldc:int(-1981965826))
                            var_11_E3 = and:int(ldc:int(986), ldc:int(-3035))
                            goto(Label_1471)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0565:
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1482)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1356)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1218)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1107)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(119716296))
                        goto(Label_0953)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(64)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(-770315151))
                        goto(Label_0818)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(8)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(-1794748643))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_635:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_635 = and:int(var_3_635:int, ldc:int(-2146907967))
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_635 = and:int(var_3_635:int, ldc:int(-1198387308))
                            loopcontinue()
                        }
                        
                        var_3_635 = and:int(var_3_635:int, ldc:int(-1847337773))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0818)
                        }
                    }
                    
                    Label_0684:
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1482)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1356)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(8)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(1998315127))
                        goto(Label_1218)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(64)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(649104724))
                        goto(Label_1107)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(8)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(1890148199))
                        goto(Label_0953)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(67108864)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_635:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_635 = and:int(var_3_635:int, ldc:int(-850385644))
                            goto(Label_0565)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_635:int, ldc:int(256)), ldc:int(0))) {
                            var_3_635 = and:int(var_3_635:int, ldc:int(1947129214))
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_635:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_635 = and:int(var_3_635:int, ldc:int(-1791499289))
                            loopcontinue()
                        }
                        
                        var_3_635 = and:int(var_3_635:int, ldc:int(-221731134))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0818:
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(2)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(1719833556))
                        goto(Label_1482)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(1223551128))
                        goto(Label_1356)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(-1671847709))
                        goto(Label_1218)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(-1471471733))
                        goto(Label_1107)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(8192)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_635 = and:int(var_3_635:int, ldc:int(-926377655))
                            goto(Label_0684)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_635:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0565)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_635:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_635 = and:int(var_3_635:int, ldc:int(718737470))
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_635:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_635 = and:int(var_3_635:int, ldc:int(-1185158444))
                            loopcontinue()
                        }
                        
                        var_3_635 = and:int(var_3_635:int, ldc:int(-1729191750))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_E3 = and:int(ldc:int(6211), ldc:int(24717))
                                goto(Label_1107)
                            }
                        }
                    }
                    
                    Label_0953:
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(515791512))
                        goto(Label_1482)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(471992871))
                        goto(Label_1356)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1218)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(2048)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_635:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_635 = and:int(var_3_635:int, ldc:int(290733892))
                            goto(Label_0818)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_635 = and:int(var_3_635:int, ldc:int(994016111))
                            goto(Label_0684)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_635:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_635 = and:int(var_3_635:int, ldc:int(1552659024))
                            goto(Label_0565)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_635:int, ldc:int(131072)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_635 = and:int(var_3_635:int, ldc:int(-1152654713))
                        var_11_E3 = and:int(ldc:int(-17081), ldc:int(17080))
                    }
                    
                    Label_1107:
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1482)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1356)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(8)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(1227612245))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_635:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_635 = and:int(var_3_635:int, ldc:int(246889266))
                            goto(Label_0953)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_635:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_635 = and:int(var_3_635:int, ldc:int(1919158472))
                            goto(Label_0818)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_635:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0684)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_635:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0565)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_635:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_635 = and:int(var_3_635:int, ldc:int(990730079))
                            loopcontinue()
                        }
                        
                        var_3_635 = and:int(var_3_635:int, ldc:int(-143613733))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1356)
                            }
                        }
                    }
                    
                    Label_1218:
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1482)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(-810993999))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_635:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_635 = and:int(var_3_635:int, ldc:int(1948443376))
                            goto(Label_1107)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_635:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_635 = and:int(var_3_635:int, ldc:int(-313288860))
                            goto(Label_0953)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_635:int, ldc:int(64)), ldc:int(0))) {
                            var_3_635 = and:int(var_3_635:int, ldc:int(1162700637))
                            goto(Label_0818)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_635:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_635 = and:int(var_3_635:int, ldc:int(-530248876))
                            goto(Label_0684)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_635:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0565)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_635:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_635:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_635 = and:int(var_3_635:int, ldc:int(128894118))
                            loopcontinue()
                        }
                        
                        var_3_635 = and:int(var_3_635:int, ldc:int(-1997744034))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_7D:int, var_16_111:int)
                        goto(Label_1471)
                    }
                    
                    Label_1356:
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(8)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(1972100639))
                        goto(Label_1482)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1218)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(-478155446))
                        goto(Label_1107)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0953)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0818)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(1224062191))
                        goto(Label_0684)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0565)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0389)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(2)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_635 = and:int(var_3_635:int, ldc:int(-1335459593))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1471:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_640 = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1482:
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(373672084))
                        goto(Label_1356)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1218)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1107)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(8)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(-694444006))
                        goto(Label_0953)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0818)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(1105443360))
                        goto(Label_0684)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(8)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(1866648636))
                        goto(Label_0565)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0389)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(64)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(-447952862))
                        var_17_640 = add:int(var_16_111:int, xor:int(ldc:int(24896), ldc:int(24897)))
                        looporswitchbreak()
                    }
                    
                    var_3_635 = and:int(var_3_635:int, ldc:int(-1331158847))
                }
                
                var_3_635 = and:int(var_3_635:int, ldc:int(-765935445))
                
                if (cmple:boolean(var_5_7D = var_17_640:int, sub:int(var_6_84:int, and:int(ldc:int(4385), ldc:int(2077))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpne:boolean(and:int(var_3_635:int, ldc:int(131072)), ldc:int(0))) {
            var_3_635 = and:int(var_3_635:int, ldc:int(-718698874))
            goto(Label_0106)
        }
    }
}
