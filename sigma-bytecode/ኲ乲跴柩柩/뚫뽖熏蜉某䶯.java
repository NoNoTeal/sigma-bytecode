public class \u12b2\u4e72\u8df4\u67e9\u67e9.\ub6ab\ubf56\u718f\u8709\u67d0\u4daf {
    public void \ub6ab\ubf56\u718f\u8709\u67d0\u4daf(it.unimi.dsi.fastutil.doubles.DoubleList p0) {
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
            invokespecial:Object(Object::<init>, this:\ub6ab\ubf56\u718f\u8709\u67d0\u4daf)
            putfield:DoubleList(\ub6ab\ubf56\u718f\u8709\u67d0\u4daf::\u97e6\u4492\ube23\uc4d2\ucef1\ub83f, this:\ub6ab\ubf56\u718f\u8709\u67d0\u4daf, p0:DoubleList)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public boolean \u71ae\u4179\ub1b9\u1187\ub19c\ud158(\ub113\uc4d2\u183a\u527a\u6435.\uc3e3\u5f50\u5bc4\ud217\u97e6.\uc4d2\u9af2\u6c52\ud523\u6b5f\uc246 p0) {
        var_2_5F : int
        var_4_67 : int
        
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
        var_2_5F = and:int(ldc:int(274432614), ldc:int(1859581478))
        var_4_67 = and:int(ldc:int(17347), ldc:int(-17380))
        
        loop {
            if (cmpeq:boolean(and:int(var_2_5F:int, ldc:int(536870912)), ldc:int(0))) {
                var_2_5F = and:int(var_2_5F:int, ldc:int(402306996))
                
                if (cmple:boolean(var_4_67:int, invokeinterface:int(DoubleList::size, getfield:DoubleList(\ub6ab\ubf56\u718f\u8709\u67d0\u4daf::\u97e6\u4492\ube23\uc4d2\ucef1\ub83f, this:\ub6ab\ubf56\u718f\u8709\u67d0\u4daf)))) {
                    if (invokeinterface:boolean(\uc4d2\u9af2\u6c52\ud523\u6b5f\uc246::\u7ce1\u5140\u9033\u718f\u67d0\u3e2a, p0:\uc4d2\u9af2\u6c52\ud523\u6b5f\uc246, var_4_67:int, var_4_67:int, var_4_67:int)) {
                        var_2_5F = and:int(var_2_5F:int, ldc:int(349416189))
                        inc:int(var_4_67, ldc:int(1))
                        loopcontinue()
                    }
                    
                    return:boolean(and:int[expected:boolean](ldc:int(-23105), ldc:int(23104)))
                }
            }
            
            if (cmpeq:boolean(and:int(var_2_5F:int, ldc:int(8192)), ldc:int(0))) {
                return:boolean(and:int[expected:boolean](ldc:int(23305), ldc:int(1157)))
            }
        }
    }
    
    public it.unimi.dsi.fastutil.doubles.DoubleList \u759a\u873d\u5140\u67e9\u2dcc\u760c() {
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
            return:DoubleList(getfield:DoubleList(\ub6ab\ubf56\u718f\u8709\u67d0\u4daf::\u97e6\u4492\ube23\uc4d2\ucef1\ub83f, this:\ub6ab\ubf56\u718f\u8709\u67d0\u4daf))
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
    
    public void \u4c04\u8389\u7bad\u8258\u2dcc\u7043(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_5E5 : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_5F0 : int
        
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
        var_3_5E5 = and:int(ldc:int(2080086414), ldc:int(-1406617090))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\ub6ab\ubf56\u718f\u8709\u67d0\u4daf[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(256)), ldc:int(0))) {
            var_3_5E5 = and:int(var_3_5E5:int, ldc:int(687643119))
            var_5_7D = and:int(ldc:int(8832), ldc:int(-8833))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-18342), ldc:int(18340)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_5E5:int, ldc:int(-1368481969))
                    var_9_C1 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_84:int, xor:int(ldc:int(8208), ldc:int(8209)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, and:int(ldc:int(17025), ldc:int(1387)))), var_7_93:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_5E5 = and:int(var_3_D2:int, ldc:int(1936310159))
                    var_14_10D = var_7_93:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), xor:int(ldc:int(2067), ldc:int(2066)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_84:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(858930655))
                        goto(Label_1410)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(1917887856))
                        goto(Label_1276)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-1354504795))
                        goto(Label_1146)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(1261529399))
                        goto(Label_1043)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(64)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(479079586))
                        goto(Label_0897)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0794)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0668)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0541)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(64)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-1310130194))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0541)
                            }
                            
                            goto(Label_0794)
                        }
                    }
                    
                    Label_0397:
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1410)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1276)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(512)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(645013533))
                        goto(Label_1146)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-51948836))
                        goto(Label_1043)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0897)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(575193402))
                        goto(Label_0794)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0668)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(512)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-315696769))
                            var_11_E3 = and:int(ldc:int(10857), ldc:int(-27498))
                            goto(Label_1399)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0541:
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1410)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(1)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-475068602))
                        goto(Label_1276)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(137119208))
                        goto(Label_1146)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1043)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(2036499376))
                        goto(Label_0897)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0794)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-1412446224))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(64)), ldc:int(0))) {
                            var_3_5E5 = and:int(var_3_5E5:int, ldc:int(645954731))
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(256)), ldc:int(0))) {
                            var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-990407685))
                            loopcontinue()
                        }
                        
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-311699010))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0794)
                        }
                    }
                    
                    Label_0668:
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(1681746801))
                        goto(Label_1410)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1276)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1146)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(512)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(1831671346))
                        goto(Label_1043)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(8)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-1533679235))
                        goto(Label_0897)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(4096)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_5E5 = and:int(var_3_5E5:int, ldc:int(1926578413))
                            goto(Label_0541)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-1771799380))
                            loopcontinue()
                        }
                        
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-1568759874))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0794:
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1410)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-495842343))
                        goto(Label_1276)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(512)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-216076029))
                        goto(Label_1146)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1043)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(2048)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0668)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0541)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-335136334))
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(64)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(855169838))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_E3 = and:int(ldc:int(265), ldc:int(27713))
                                goto(Label_1043)
                            }
                        }
                    }
                    
                    Label_0897:
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(512)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-1820978176))
                        goto(Label_1410)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1276)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(2)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-1431875499))
                        goto(Label_1146)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(1)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(1)), ldc:int(0))) {
                            var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-1430952854))
                            goto(Label_0794)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(64)), ldc:int(0))) {
                            var_3_5E5 = and:int(var_3_5E5:int, ldc:int(1216258644))
                            goto(Label_0668)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0541)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(2048)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-1220953618))
                        var_11_E3 = and:int(ldc:int(-14976), ldc:int(14419))
                    }
                    
                    Label_1043:
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1410)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1276)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(524288)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0897)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_5E5 = and:int(var_3_5E5:int, ldc:int(1913925378))
                            goto(Label_0794)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0668)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(256)), ldc:int(0))) {
                            var_3_5E5 = and:int(var_3_5E5:int, ldc:int(1493872449))
                            goto(Label_0541)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_5E5 = and:int(var_3_5E5:int, ldc:int(2090165936))
                            loopcontinue()
                        }
                        
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-142697186))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1276)
                            }
                        }
                    }
                    
                    Label_1146:
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(4)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-555114130))
                        goto(Label_1410)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(32768)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_5E5 = and:int(var_3_5E5:int, ldc:int(2089430260))
                            goto(Label_1043)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_5E5 = and:int(var_3_5E5:int, ldc:int(1120203451))
                            goto(Label_0897)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-2074198561))
                            goto(Label_0794)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0668)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0541)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_5E5 = and:int(var_3_5E5:int, ldc:int(1072405758))
                            loopcontinue()
                        }
                        
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(2122169774))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_7D:int, var_16_111:int)
                        goto(Label_1399)
                    }
                    
                    Label_1276:
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(256)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-332017034))
                        goto(Label_1410)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(2)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(2100890010))
                        goto(Label_1146)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1043)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(4)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(711759636))
                        goto(Label_0897)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0794)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0668)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0541)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0397)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-1607600442))
                        loopcontinue()
                    }
                    
                    var_3_5E5 = and:int(var_3_5E5:int, ldc:int(2037365054))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1399:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_5F0 = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1410:
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(1)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(431716226))
                        goto(Label_1276)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1146)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(1899324454))
                        goto(Label_1043)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0897)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0794)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0668)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0541)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(1570399089))
                        goto(Label_0397)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(627874574))
                        var_17_5F0 = add:int(var_16_111:int, and:int(ldc:int(20041), ldc:int(4241)))
                        looporswitchbreak()
                    }
                    
                    var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-18939170))
                }
                
                var_3_5E5 = and:int(var_3_5E5:int, ldc:int(556595710))
                
                if (cmple:boolean(var_5_7D = var_17_5F0:int, sub:int(var_6_84:int, and:int(ldc:int(33), ldc:int(16961))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(1)), ldc:int(0))) {
            var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-1482403604))
            goto(Label_0106)
        }
    }
}
