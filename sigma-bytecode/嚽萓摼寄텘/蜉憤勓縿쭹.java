public class \u56bd\u8413\u647c\u5bc4\ud158.\u8709\u61a4\u52d3\u7e3f\ucb79 {
    public void \u8709\u61a4\u52d3\u7e3f\ucb79() {
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
            invokespecial:\u8308\uc2e8\u67e9\ua6bd\u51b2(\u8308\uc2e8\u67e9\ua6bd\u51b2::<init>, this:\u8709\u61a4\u52d3\u7e3f\ucb79, ldc:Class<\u16f6\u40a9\u8bb0\u759a\u2dcc\u7ce1>(\u56bd\u8413\u647c\u5bc4\ud158.\u16f6\u40a9\u8bb0\u759a\u2dcc\u7ce1.class))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public java.util.Set<\u51b2\u6fb0\ufcaf\u61a4\u0800.\u1187\u6b0d\ud217\u34df\u7043> \u5140\u4c2b\u183a\u7330\u6435(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p0, \u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d p1, \u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u760c\u3d4b\u62da\u3e75\u5bc4 p2) {
        var_6_6A : HashSet<\u1187\u6b0d\ud217\u34df\u7043>
        
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
            var_6_6A = initobject:HashSet<\u1187\u6b0d\ud217\u34df\u7043>(HashSet<E>::<init>)
            invokeinterface:boolean(Set<\u1187\u6b0d\ud217\u34df\u7043>::add, var_6_6A:HashSet<\u1187\u6b0d\ud217\u34df\u7043>[expected:Set<\u1187\u6b0d\ud217\u34df\u7043>], initobject:\u1187\u6b0d\ud217\u34df\u7043(\u1187\u6b0d\ud217\u34df\u7043::<init>, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, checkcast:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d.class, invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>::\u3d64\u4f4a\u8753\ua61f\ua6bd\ua61f, p1:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>], getstatic:\u1187\u62da\u718f\u3c25\u6ec6\u5d20<\u516c\u92ff\u74b1\u97e6\ub171\u3711>[expected:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<\u516c\u92ff\u74b1\u97e6\ub171\u3711>](\u16f6\u40a9\u8bb0\u759a\u2dcc\u7ce1::\ubff1\uf9c5\ufcaf\uc9f6\u8aa5\u6fb0), invokestatic:\u516c\u92ff\u74b1\u97e6\ub171\u3711(\u16f6\u40a9\u8bb0\u759a\u2dcc\u7ce1::\ud4fe\u3d64\u92ff\u2dcc\u183a\u873d, p1:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d, getfield:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255[expected:\u718f\u6435\uc31c\u4ab3\u98a4](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u946b\u98a4\u8709\u7043\ubf56\u5f50, invokestatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u6d69\u71ae\ucfaf\u516c\ube23\u8350)), p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56)))))
            return:Set<\u1187\u6b0d\ud217\u34df\u7043>(var_6_6A:HashSet<\u1187\u6b0d\ud217\u34df\u7043>[expected:Set<\u1187\u6b0d\ud217\u34df\u7043>])
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
    
    public void \u5d20\uceb8\u64f2\u6c56\u4d85(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_62D : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_638 : int
        
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
        var_3_62D = and:int(ldc:int(1594805068), ldc:int(1601895931))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u8709\u61a4\u52d3\u7e3f\ucb79[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(1048576)), ldc:int(0))) {
            var_3_62D = and:int(var_3_62D:int, ldc:int(-14190115))
            var_5_7D = and:int(ldc:int(16699), ldc:int(-16700))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-24663), ldc:int(24662)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_62D:int, ldc:int(-551924379))
                    var_9_C1 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_84:int, and:int(ldc:int(4627), ldc:int(19565)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, and:int(ldc:int(3073), ldc:int(25125)))), var_7_93:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_62D = and:int(var_3_D2:int, ldc:int(-14230713))
                    var_14_10D = var_7_93:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), xor:int(ldc:int(1152), ldc:int(1153)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_84:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(-765492340))
                        goto(Label_1474)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(433308144))
                        goto(Label_1348)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(-163158669))
                        goto(Label_1202)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1083)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(256)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(-2112341015))
                        goto(Label_0921)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0802)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0684)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(988247106))
                        goto(Label_0581)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(-893980784))
                    }
                    else {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(1599818737))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0581)
                            }
                            
                            goto(Label_0802)
                        }
                    }
                    
                    Label_0405:
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1474)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(-2118623320))
                        goto(Label_1348)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1202)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(-547426586))
                        goto(Label_1083)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(38515738))
                        goto(Label_0921)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(85122874))
                        goto(Label_0802)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(605819976))
                        goto(Label_0684)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(-986104724))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_62D = and:int(var_3_62D:int, ldc:int(-208232175))
                            loopcontinue()
                        }
                        
                        var_3_62D = and:int(var_3_62D:int, ldc:int(-543695366))
                        var_11_E3 = and:int(ldc:int(17769), ldc:int(-17786))
                        goto(Label_1463)
                    }
                    
                    Label_0581:
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(1674435177))
                        goto(Label_1474)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(-1531782838))
                        goto(Label_1348)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(-1672744279))
                        goto(Label_1202)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1083)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0921)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0802)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(1024)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0405)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(16384)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_62D = and:int(var_3_62D:int, ldc:int(1601325389))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0802)
                        }
                    }
                    
                    Label_0684:
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(1631542745))
                        goto(Label_1474)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(291241521))
                        goto(Label_1348)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1202)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(1761395316))
                        goto(Label_1083)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0921)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(1048576)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0581)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_62D = and:int(var_3_62D:int, ldc:int(21111473))
                            goto(Label_0405)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(4096)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_62D = and:int(var_3_62D:int, ldc:int(1597701449))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0802:
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(540441217))
                        goto(Label_1474)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(2117454956))
                        goto(Label_1348)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(-88850906))
                        goto(Label_1202)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1083)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0684)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0581)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_62D = and:int(var_3_62D:int, ldc:int(1875082314))
                            goto(Label_0405)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_62D = and:int(var_3_62D:int, ldc:int(187693108))
                            loopcontinue()
                        }
                        
                        var_3_62D = and:int(var_3_62D:int, ldc:int(-7348923))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_E3 = xor:int(ldc:int(-31484), ldc:int(-31483))
                                goto(Label_1083)
                            }
                        }
                    }
                    
                    Label_0921:
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1474)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(498314336))
                        goto(Label_1348)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1202)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(1024)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_62D = and:int(var_3_62D:int, ldc:int(-1187546990))
                            goto(Label_0802)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_62D = and:int(var_3_62D:int, ldc:int(2095660558))
                            goto(Label_0684)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_62D = and:int(var_3_62D:int, ldc:int(335065412))
                            goto(Label_0581)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_62D = and:int(var_3_62D:int, ldc:int(-1552600835))
                            goto(Label_0405)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(64)), ldc:int(0))) {
                            var_3_62D = and:int(var_3_62D:int, ldc:int(-625818872))
                            loopcontinue()
                        }
                        
                        var_3_62D = and:int(var_3_62D:int, ldc:int(2134573033))
                        var_11_E3 = and:int(ldc:int(-15838), ldc:int(14672))
                    }
                    
                    Label_1083:
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(-1021168562))
                        goto(Label_1474)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1348)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(-51985720))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0921)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_62D = and:int(var_3_62D:int, ldc:int(-937051161))
                            goto(Label_0802)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0684)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_62D = and:int(var_3_62D:int, ldc:int(-1890756375))
                            goto(Label_0581)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_62D = and:int(var_3_62D:int, ldc:int(-212623016))
                            goto(Label_0405)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(16384)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_62D = and:int(var_3_62D:int, ldc:int(-538972334))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1348)
                            }
                        }
                    }
                    
                    Label_1202:
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1474)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(-1791219603))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_62D = and:int(var_3_62D:int, ldc:int(1799191395))
                            goto(Label_1083)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(64)), ldc:int(0))) {
                            var_3_62D = and:int(var_3_62D:int, ldc:int(-1897308893))
                            goto(Label_0921)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_62D = and:int(var_3_62D:int, ldc:int(405459084))
                            goto(Label_0802)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_62D = and:int(var_3_62D:int, ldc:int(1010112256))
                            goto(Label_0684)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_62D = and:int(var_3_62D:int, ldc:int(46955891))
                            goto(Label_0581)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_62D = and:int(var_3_62D:int, ldc:int(1858856265))
                            goto(Label_0405)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_62D = and:int(var_3_62D:int, ldc:int(1598226398))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_7D:int, var_16_111:int)
                            goto(Label_1463)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1348:
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1474)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1202)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(608243197))
                        goto(Label_1083)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0921)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(987626957))
                        goto(Label_0802)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0684)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(64)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(-1408873222))
                        goto(Label_0581)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0405)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(131072)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_62D = and:int(var_3_62D:int, ldc:int(2143443310))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1463:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_638 = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1474:
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(-1765195137))
                        goto(Label_1348)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(-1291405230))
                        goto(Label_1202)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1083)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(201768277))
                        goto(Label_0921)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(256)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(1072237745))
                        goto(Label_0802)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0684)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0581)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0405)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(-546387631))
                        var_17_638 = add:int(var_16_111:int, and:int(ldc:int(11553), ldc:int(3)))
                        looporswitchbreak()
                    }
                    
                    var_3_62D = and:int(var_3_62D:int, ldc:int(38747239))
                }
                
                var_3_62D = and:int(var_3_62D:int, ldc:int(-8651790))
                
                if (cmple:boolean(var_5_7D = var_17_638:int, sub:int(var_6_84:int, and:int(ldc:int(26661), ldc:int(273))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(2147483647)), ldc:int(0))) {
            var_3_62D = and:int(var_3_62D:int, ldc:int(760035850))
            goto(Label_0106)
        }
    }
}
