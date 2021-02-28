public class \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4f52\u1187\uc238\u5fe1\u6bb9 {
    public void \u4f52\u1187\uc238\u5fe1\u6bb9(com.mojang.brigadier.ParseResults<\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937> p0) {
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
            invokespecial:Object(Object::<init>, this:\u4f52\u1187\uc238\u5fe1\u6bb9)
            putfield:ParseResults<\u8413\u5140\u64f2\uc9f6\u9937>(\u4f52\u1187\uc238\u5fe1\u6bb9::\u446c\u3a62\u7af6\u3d64\ud36e\ua6bd, this:\u4f52\u1187\uc238\u5fe1\u6bb9, p0:ParseResults<\u8413\u5140\u64f2\uc9f6\u9937>)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \uae87\ube23\u3dd3\u8d98\u9033\u760c(\u8cae\u8bb0\ucef1\u8c8a\u3a62.\ua3b4\u4179\uae5d\ub102\u9a18\u624e p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937 p1, java.util.ArrayDeque<\u494c\u4975\ua068\u0c95\uc84e.\u4daf\u93a2\uc4d2\ud7e8\u7ce1\u7ce1> p2, int p3) {
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
            invokevirtual:int(CommandDispatcher::execute, invokevirtual:CommandDispatcher<\u8413\u5140\u64f2\uc9f6\u9937>(\ua3b4\u4179\uae5d\ub102\u9a18\u624e::\u97b7\ubb2b\u6b5f\u5bc4\ub102\u4c04, p0:\ua3b4\u4179\uae5d\ub102\u9a18\u624e), initobject:ParseResults(ParseResults::<init>, invokevirtual:CommandContextBuilder(CommandContextBuilder::withSource, invokevirtual:CommandContextBuilder(ParseResults::getContext, getfield:ParseResults<\u8413\u5140\u64f2\uc9f6\u9937>(\u4f52\u1187\uc238\u5fe1\u6bb9::\u446c\u3a62\u7af6\u3d64\ud36e\ua6bd, this:\u4f52\u1187\uc238\u5fe1\u6bb9)), p1:\u8413\u5140\u64f2\uc9f6\u9937[expected:Object]), invokevirtual:ImmutableStringReader(ParseResults::getReader, getfield:ParseResults<\u8413\u5140\u64f2\uc9f6\u9937>(\u4f52\u1187\uc238\u5fe1\u6bb9::\u446c\u3a62\u7af6\u3d64\ud36e\ua6bd, this:\u4f52\u1187\uc238\u5fe1\u6bb9)), invokevirtual:Map(ParseResults::getExceptions, getfield:ParseResults<\u8413\u5140\u64f2\uc9f6\u9937>(\u4f52\u1187\uc238\u5fe1\u6bb9::\u446c\u3a62\u7af6\u3d64\ud36e\ua6bd, this:\u4f52\u1187\uc238\u5fe1\u6bb9))))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public java.lang.String toString() {
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
            return:String(invokeinterface:String(ImmutableStringReader::getString, invokevirtual:ImmutableStringReader(ParseResults::getReader, getfield:ParseResults<\u8413\u5140\u64f2\uc9f6\u9937>(\u4f52\u1187\uc238\u5fe1\u6bb9::\u446c\u3a62\u7af6\u3d64\ud36e\ua6bd, this:\u4f52\u1187\uc238\u5fe1\u6bb9))))
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
    
    public void \u3504\u4492\ud51e\u3c25\u52d3\u74b1(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_5CD : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
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
        var_3_5CD = and:int(ldc:int(-1226784839), ldc:int(-1076564821))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u4f52\u1187\uc238\u5fe1\u6bb9[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(1073741824)), ldc:int(0))) {
            var_3_5CD = and:int(var_3_5CD:int, ldc:int(-1261961747))
            var_5_7D = and:int(ldc:int(8284), ldc:int(-8285))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-19787), ldc:int(17482)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_5CD:int, ldc:int(-1235030935))
                    var_9_C1 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_84:int, and:int(ldc:int(26113), ldc:int(2249)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, and:int(ldc:int(101), ldc:int(17665)))), var_7_93:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_5CD = and:int(var_3_D2:int, ldc:int(-1082200707))
                    var_14_10D = var_7_93:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), and:int(ldc:int(785), ldc:int(2083)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_84:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1386)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(64)), ldc:int(0))) {
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(-1746365580))
                        goto(Label_1268)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(1675190274))
                        goto(Label_1138)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1035)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0889)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(-348610685))
                        goto(Label_0778)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(1468508375))
                        goto(Label_0660)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0541)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(-1208832707))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0541)
                            }
                            
                            goto(Label_0778)
                        }
                    }
                    
                    Label_0389:
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(8)), ldc:int(0))) {
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(1182498875))
                        goto(Label_1386)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1268)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1138)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1035)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(-380363324))
                        goto(Label_0889)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(64)), ldc:int(0))) {
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(-956311759))
                        goto(Label_0778)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(-125580468))
                        goto(Label_0660)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(67108864)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(1)), ldc:int(0))) {
                            var_3_5CD = and:int(var_3_5CD:int, ldc:int(-9769667))
                            var_11_E3 = and:int(ldc:int(20006), ldc:int(-28199))
                            goto(Label_1375)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0541:
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(-136770373))
                        goto(Label_1386)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1268)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1138)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(-1255665322))
                        goto(Label_1035)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(-318586910))
                        goto(Label_0889)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(479525804))
                        goto(Label_0778)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(2048)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_5CD = and:int(var_3_5CD:int, ldc:int(1573291115))
                            loopcontinue()
                        }
                        
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(-60048131))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0778)
                        }
                    }
                    
                    Label_0660:
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(1919597931))
                        goto(Label_1386)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1268)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(4)), ldc:int(0))) {
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(322658580))
                        goto(Label_1138)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1035)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0889)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(2085849400))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0541)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_5CD = and:int(var_3_5CD:int, ldc:int(-1610377062))
                            loopcontinue()
                        }
                        
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(-1218314499))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0778:
                    
                    if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1386)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1268)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1138)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1035)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(64)), ldc:int(0))) {
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(-881412499))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_5CD = and:int(var_3_5CD:int, ldc:int(-1006209369))
                            goto(Label_0660)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(32)), ldc:int(0))) {
                            var_3_5CD = and:int(var_3_5CD:int, ldc:int(1913330353))
                            goto(Label_0541)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(64)), ldc:int(0))) {
                            var_3_5CD = and:int(var_3_5CD:int, ldc:int(-1511576507))
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(67108864)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(-193986755))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_E3 = and:int(ldc:int(293), ldc:int(2113))
                                goto(Label_1035)
                            }
                        }
                    }
                    
                    Label_0889:
                    
                    if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(4)), ldc:int(0))) {
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(-980922002))
                        goto(Label_1386)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1268)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(1)), ldc:int(0))) {
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(-1150994174))
                        goto(Label_1138)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(131072)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0778)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_5CD = and:int(var_3_5CD:int, ldc:int(-1556827869))
                            goto(Label_0660)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0541)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_5CD = and:int(var_3_5CD:int, ldc:int(1894081381))
                            loopcontinue()
                        }
                        
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(-1217151447))
                        var_11_E3 = and:int(ldc:int(-27931), ldc:int(27930))
                    }
                    
                    Label_1035:
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1386)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1268)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(-1624744133))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0889)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0778)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_5CD = and:int(var_3_5CD:int, ldc:int(-150082502))
                            goto(Label_0660)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0541)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(1)), ldc:int(0))) {
                            var_3_5CD = and:int(var_3_5CD:int, ldc:int(535842855))
                            loopcontinue()
                        }
                        
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(-1074008789))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1268)
                            }
                        }
                    }
                    
                    Label_1138:
                    
                    if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(-1906409202))
                        goto(Label_1386)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_1035)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_5CD = and:int(var_3_5CD:int, ldc:int(1732117503))
                            goto(Label_0889)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0778)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0660)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_5CD = and:int(var_3_5CD:int, ldc:int(-1188576851))
                            goto(Label_0541)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_5CD = and:int(var_3_5CD:int, ldc:int(193640499))
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_5CD = and:int(var_3_5CD:int, ldc:int(-794975385))
                            loopcontinue()
                        }
                        
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(-1109852675))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_7D:int, var_16_111:int)
                        goto(Label_1375)
                    }
                    
                    Label_1268:
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1386)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(-355641453))
                        goto(Label_1138)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1035)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0889)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0778)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(32)), ldc:int(0))) {
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(1856784834))
                        goto(Label_0660)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0541)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0389)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(2048)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_5CD = and:int(var_3_5CD:int, ldc:int(-1268859025))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1375:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_5D8 = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1386:
                    
                    if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1268)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1138)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(64)), ldc:int(0))) {
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(-1002327105))
                        goto(Label_1035)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(32)), ldc:int(0))) {
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(-496986440))
                        goto(Label_0889)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(-2069786201))
                        goto(Label_0778)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(8)), ldc:int(0))) {
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(-1983599132))
                        goto(Label_0660)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0541)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0389)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(-1134694481))
                        var_17_5D8 = add:int(var_16_111:int, xor:int(ldc:int(1050), ldc:int(1051)))
                        looporswitchbreak()
                    }
                }
                
                var_3_5CD = and:int(var_3_5CD:int, ldc:int(-1116278919))
                
                if (cmple:boolean(var_5_7D = var_17_5D8:int, sub:int(var_6_84:int, xor:int(ldc:int(9488), ldc:int(9489))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(4194304)), ldc:int(0))) {
            var_3_5CD = and:int(var_3_5CD:int, ldc:int(-731918629))
            goto(Label_0106)
        }
    }
}
