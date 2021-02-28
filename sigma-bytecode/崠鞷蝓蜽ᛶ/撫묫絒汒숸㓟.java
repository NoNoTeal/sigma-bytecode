public class \u5d20\u97b7\u8753\u873d\u16f6.\u64ab\ubb2b\u7d52\u6c52\uc238\u34df {
    public void \u64ab\ubb2b\u7d52\u6c52\uc238\u34df(\ub113\uc4d2\u183a\u527a\u6435.\uc3e3\u5f50\u5bc4\ud217\u97e6.\u47c2\ubded\u12cb\u3dd3\u12cb\u0800 p0) {
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
            invokespecial:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a::<init>, this:\u64ab\ubb2b\u7d52\u6c52\uc238\u34df, p0:\u47c2\ubded\u12cb\u3dd3\u12cb\u0800)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public int \u4ab3\u527a\u6198\u8d98\u0c95\u56bd(java.util.Random p0) {
        var_2_1F9 : int
        stack_297_0 : int [generated]
        
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
        var_2_1F9 = and:int(ldc:int(544346364), ldc:int(-83971360))
        
        if (cmpne:boolean(this:\u64ab\ubb2b\u7d52\u6c52\uc238\u34df[expected:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a], getstatic:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u960f\u7043\uf9c5\u4f52\u4cd9\ubefe::\u527a\u3711\u97e6\u4c04\u4d85\u74b1))) {
            loop {
                if (cmpne:boolean(and:int(var_2_1F9:int, ldc:int(16384)), ldc:int(0))) {
                    goto(Label_0442)
                }
                
                if (cmpne:boolean(and:int(var_2_1F9:int, ldc:int(8192)), ldc:int(0))) {
                    goto(Label_0371)
                }
                
                if (cmpne:boolean(and:int(var_2_1F9:int, ldc:int(256)), ldc:int(0))) {
                    var_2_1F9 = and:int(var_2_1F9:int, ldc:int(-820089840))
                    goto(Label_0300)
                }
                
                if (cmpne:boolean(and:int(var_2_1F9:int, ldc:int(256)), ldc:int(0))) {
                    goto(Label_0229)
                }
                
                if (cmpeq:boolean(and:int(var_2_1F9:int, ldc:int(131072)), ldc:int(0))) {
                    var_2_1F9 = and:int(var_2_1F9:int, ldc:int(41122238))
                }
                else {
                    var_2_1F9 = and:int(var_2_1F9:int, ldc:int(820736097))
                    
                    if (cmpeq:boolean(this:\u64ab\ubb2b\u7d52\u6c52\uc238\u34df[expected:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a], getstatic:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u960f\u7043\uf9c5\u4f52\u4cd9\ubefe::\uc910\u4c2b\uc229\ud12e\u960f\u156b))) {
                        return:int(invokestatic:int(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\u446c\u8aa5\ufcaf\u99f7\u6bb9\ub113, p0:Random, and:int(ldc:int(16643), ldc:int(11783)), ldc:int(7)))
                    }
                }
                
                Label_0166:
                
                if (cmpne:boolean(and:int(var_2_1F9:int, ldc:int(262144)), ldc:int(0))) {
                    goto(Label_0442)
                }
                
                if (cmpne:boolean(and:int(var_2_1F9:int, ldc:int(262144)), ldc:int(0))) {
                    var_2_1F9 = and:int(var_2_1F9:int, ldc:int(-1063896933))
                    goto(Label_0371)
                }
                
                if (cmpne:boolean(and:int(var_2_1F9:int, ldc:int(256)), ldc:int(0))) {
                    goto(Label_0300)
                }
                
                if (cmpeq:boolean(and:int(var_2_1F9:int, ldc:int(256)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_2_1F9:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_2_1F9 = and:int(var_2_1F9:int, ldc:int(456081028))
                        loopcontinue()
                    }
                    
                    var_2_1F9 = and:int(var_2_1F9:int, ldc:int(-227325616))
                    
                    if (cmpeq:boolean(this:\u64ab\ubb2b\u7d52\u6c52\uc238\u34df[expected:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a], getstatic:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u960f\u7043\uf9c5\u4f52\u4cd9\ubefe::\u4d85\u4ab3\u946b\ud36e\u5f50\u7bad))) {
                        return:int(invokestatic:int(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\u446c\u8aa5\ufcaf\u99f7\u6bb9\ub113, p0:Random, xor:int(ldc:int(2123), ldc:int(2120)), ldc:int(7)))
                    }
                }
                
                Label_0229:
                
                if (cmpne:boolean(and:int(var_2_1F9:int, ldc:int(256)), ldc:int(0))) {
                    goto(Label_0442)
                }
                
                if (cmpne:boolean(and:int(var_2_1F9:int, ldc:int(8192)), ldc:int(0))) {
                    var_2_1F9 = and:int(var_2_1F9:int, ldc:int(848906019))
                    goto(Label_0371)
                }
                
                if (cmpeq:boolean(and:int(var_2_1F9:int, ldc:int(262144)), ldc:int(0))) {
                    if (cmpne:boolean(and:int(var_2_1F9:int, ldc:int(8388608)), ldc:int(0))) {
                        var_2_1F9 = and:int(var_2_1F9:int, ldc:int(-1082830781))
                        goto(Label_0166)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_1F9:int, ldc:int(65536)), ldc:int(0))) {
                        var_2_1F9 = and:int(var_2_1F9:int, ldc:int(400206831))
                        loopcontinue()
                    }
                    
                    var_2_1F9 = and:int(var_2_1F9:int, ldc:int(1811873376))
                    
                    if (cmpeq:boolean(this:\u64ab\ubb2b\u7d52\u6c52\uc238\u34df[expected:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a], getstatic:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u960f\u7043\uf9c5\u4f52\u4cd9\ubefe::\u7049\uafe7\ub102\u51b2\u8aa5\u1833))) {
                        return:int(invokestatic:int(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\u446c\u8aa5\ufcaf\u99f7\u6bb9\ub113, p0:Random, and:int(ldc:int(11026), ldc:int(20495)), xor:int(ldc:int(17603), ldc:int(17606))))
                    }
                }
                
                Label_0300:
                
                if (cmpne:boolean(and:int(var_2_1F9:int, ldc:int(8192)), ldc:int(0))) {
                    var_2_1F9 = and:int(var_2_1F9:int, ldc:int(757365750))
                    goto(Label_0442)
                }
                
                if (cmpeq:boolean(and:int(var_2_1F9:int, ldc:int(65536)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_2_1F9:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_2_1F9 = and:int(var_2_1F9:int, ldc:int(-214282579))
                        goto(Label_0229)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_1F9:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0166)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_1F9:int, ldc:int(16384)), ldc:int(0))) {
                        var_2_1F9 = and:int(var_2_1F9:int, ldc:int(246204774))
                        loopcontinue()
                    }
                    
                    var_2_1F9 = and:int(var_2_1F9:int, ldc:int(-1461574462))
                    
                    if (cmpeq:boolean(this:\u64ab\ubb2b\u7d52\u6c52\uc238\u34df[expected:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a], getstatic:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u960f\u7043\uf9c5\u4f52\u4cd9\ubefe::\u72f1\ua562\u8bb0\ua61f\uc31c\u873d))) {
                        return:int(invokestatic:int(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\u446c\u8aa5\ufcaf\u99f7\u6bb9\ub113, p0:Random, xor:int(ldc:int(-30710), ldc:int(-30712)), xor:int(ldc:int(160), ldc:int(165))))
                    }
                }
                
                Label_0371:
                
                if (cmpeq:boolean(and:int(var_2_1F9:int, ldc:int(64)), ldc:int(0))) {
                    var_2_1F9 = and:int(var_2_1F9:int, ldc:int(1672488691))
                }
                else {
                    if (cmpne:boolean(and:int(var_2_1F9:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0300)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_1F9:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_2_1F9 = and:int(var_2_1F9:int, ldc:int(174118027))
                        goto(Label_0229)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_1F9:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0166)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_1F9:int, ldc:int(262144)), ldc:int(0))) {
                        var_2_1F9 = and:int(var_2_1F9:int, ldc:int(1359947765))
                        loopcontinue()
                    }
                    
                    var_2_1F9 = and:int(var_2_1F9:int, ldc:int(-244149562))
                    
                    if (cmpeq:boolean(this:\u64ab\ubb2b\u7d52\u6c52\uc238\u34df[expected:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a], getstatic:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u960f\u7043\uf9c5\u4f52\u4cd9\ubefe::\u6435\u3776\u4cd9\u8308\u8cae\u8c8a))) {
                        stack_297_0 = invokestatic:int(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\u446c\u8aa5\ufcaf\u99f7\u6bb9\ub113, p0:Random, and:int(ldc:int(8451), ldc:int(-8452)), and:int(ldc:int(9297), ldc:int(20609)))
                        looporswitchbreak()
                    }
                }
                
                Label_0442:
                
                if (cmpne:boolean(and:int(var_2_1F9:int, ldc:int(268435456)), ldc:int(0))) {
                    var_2_1F9 = and:int(var_2_1F9:int, ldc:int(1012068460))
                    goto(Label_0371)
                }
                
                if (cmpne:boolean(and:int(var_2_1F9:int, ldc:int(262144)), ldc:int(0))) {
                    goto(Label_0300)
                }
                
                if (cmpne:boolean(and:int(var_2_1F9:int, ldc:int(67108864)), ldc:int(0))) {
                    goto(Label_0229)
                }
                
                if (cmpne:boolean(and:int(var_2_1F9:int, ldc:int(134217728)), ldc:int(0))) {
                    var_2_1F9 = and:int(var_2_1F9:int, ldc:int(544168032))
                    goto(Label_0166)
                }
                
                if (cmpeq:boolean(and:int(var_2_1F9:int, ldc:int(16384)), ldc:int(0))) {
                    var_2_1F9 = and:int(var_2_1F9:int, ldc:int(709517179))
                    stack_297_0 = and:int(ldc:int(-29914), ldc:int(28761))
                    looporswitchbreak()
                }
                
                var_2_1F9 = and:int(var_2_1F9:int, ldc:int(1492799839))
            }
            
            return:int(stack_297_0:int)
        }
        
        return:int(invokestatic:int(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\u446c\u8aa5\ufcaf\u99f7\u6bb9\ub113, p0:Random, and:int(ldc:int(-260), ldc:int(259)), xor:int(ldc:int(-30647), ldc:int(-30645))))
    }
    
    public void \u7d52\u392e\u5d20\u4d85\u99f7\ubb2b(\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\ube23\uc238\u5140\u4cd9\u8aa5 p1, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p2, \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56 p3) {
        var_7_8B : int
        
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
            invokespecial:void(\u071d\u69d9\u69d9\u8cae\ub8be\u600f::\u7d52\u392e\u5d20\u4d85\u99f7\ubb2b, this:\u64ab\ubb2b\u7d52\u6c52\uc238\u34df[expected:\u071d\u69d9\u69d9\u8cae\ub8be\u600f], p0:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d, p1:\ube23\uc238\u5140\u4cd9\u8aa5, p2:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, p3:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56)
            
            if (cmpeq:boolean(invokestatic:int(\u97e6\u647c\u93a2\uc87f\ud523::\uc2e8\ub7dc\u5f50\u120d\uc3e3\u51b2, getstatic:\u965f\u7043\ufcaf\uae87\u839e(\u927d\u983f\u8709\u7006\ufe34::\uff55\u64ab\uc4d2\u4bc8\uff55\u0b8e), p3:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56), ldc:int(0))) {
                var_7_8B = invokevirtual:int(\u64ab\ubb2b\u7d52\u6c52\uc238\u34df::\u4ab3\u527a\u6198\u8d98\u0c95\u56bd, this:\u64ab\ubb2b\u7d52\u6c52\uc238\u34df, getfield:Random(\ube23\uc238\u5140\u4cd9\u8aa5::\u3776\ub113\u8c8a\u8709\ub18d\uc2bd, p1:\ube23\uc238\u5140\u4cd9\u8aa5))
                
                if (cmpgt:boolean(var_7_8B:int, ldc:int(0))) {
                    invokevirtual:void(\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a::\ud36e\u3d64\u9a18\ubff1\u6d99\uc87f, this:\u64ab\ubb2b\u7d52\u6c52\uc238\u34df[expected:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a], p1:\ube23\uc238\u5140\u4cd9\u8aa5, p2:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, var_7_8B:int)
                }
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
    
    public void \u9a18\u61a4\u8c8a\u5245\u1187\u7bad(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_630 : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_B9 : double
        var_3_CA : int
        var_11_DB : int
        var_14_105 : double
        var_16_109 : int
        var_12_101 : double
        var_17_63B : int
        
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
        var_3_630 = and:int(ldc:int(955660570), ldc:int(872156426))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u64ab\ubb2b\u7d52\u6c52\uc238\u34df[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_630:int, ldc:int(512)), ldc:int(0))) {
            var_3_630 = and:int(var_3_630:int, ldc:int(678189859))
            var_5_7D = and:int(ldc:int(-8718), ldc:int(8717))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(9230), ldc:int(-9231)))
            invokestatic:int(m::a)
            
            loop {
                var_9_B9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_CA = and:int(var_3_630:int, ldc:int(2063515399))
                    var_9_B9 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_DB = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_DB:int, sub:int(var_6_84:int, and:int(ldc:int(889), ldc:int(22535)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_DB:int, xor:int(ldc:int(16546), ldc:int(16547)))), var_7_93:double))) {
                        inc:int(var_11_DB, ldc:int(1))
                    }
                    
                    var_3_630 = and:int(var_3_CA:int, ldc:int(1055762870))
                    var_14_105 = var_7_93:double
                    var_16_109 = var_11_DB:int
                }
                else {
                    var_11_DB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), xor:int(ldc:int(4230), ldc:int(4231)))
                    var_12_101 = var_14_105 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_109 = var_11_DB:int, var_6_84:int)) {
                        var_9_B9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_DB:int)
                        var_16_109 = var_11_DB:int
                        var_14_105 = var_12_101:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_630:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_630 = and:int(var_3_630:int, ldc:int(1859324743))
                        goto(Label_1489)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_630:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1350)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_630:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_630 = and:int(var_3_630:int, ldc:int(-1273520193))
                        goto(Label_1223)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_630:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1098)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_630:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0929)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_630:int, ldc:int(2)), ldc:int(0))) {
                        var_3_630 = and:int(var_3_630:int, ldc:int(2138498118))
                        goto(Label_0810)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_630:int, ldc:int(512)), ldc:int(0))) {
                        var_3_630 = and:int(var_3_630:int, ldc:int(-438099388))
                        goto(Label_0676)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_630:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0533)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_630:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_630 = and:int(var_3_630:int, ldc:int(2130077678))
                        
                        if (cmplt:boolean(var_16_109:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0533)
                            }
                            
                            goto(Label_0810)
                        }
                    }
                    
                    Label_0381:
                    
                    if (cmpeq:boolean(and:int(var_3_630:int, ldc:int(256)), ldc:int(0))) {
                        var_3_630 = and:int(var_3_630:int, ldc:int(-1216074444))
                        goto(Label_1489)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_630:int, ldc:int(64)), ldc:int(0))) {
                        var_3_630 = and:int(var_3_630:int, ldc:int(-517250627))
                        goto(Label_1350)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_630:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1223)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_630:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_630 = and:int(var_3_630:int, ldc:int(-642360137))
                        goto(Label_1098)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_630:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0929)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_630:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0810)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_630:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_630 = and:int(var_3_630:int, ldc:int(-637968855))
                        goto(Label_0676)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_630:int, ldc:int(1073741824)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_630:int, ldc:int(2)), ldc:int(0))) {
                            var_3_630 = and:int(var_3_630:int, ldc:int(291711970))
                            var_11_DB = and:int(ldc:int(-22751), ldc:int(22738))
                            goto(Label_1478)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0533:
                    
                    if (cmpeq:boolean(and:int(var_3_630:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_630 = and:int(var_3_630:int, ldc:int(941144241))
                        goto(Label_1489)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_630:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1350)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_630:int, ldc:int(512)), ldc:int(0))) {
                        var_3_630 = and:int(var_3_630:int, ldc:int(-515997657))
                        goto(Label_1223)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_630:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_630 = and:int(var_3_630:int, ldc:int(-1815854136))
                        goto(Label_1098)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_630:int, ldc:int(256)), ldc:int(0))) {
                        var_3_630 = and:int(var_3_630:int, ldc:int(-713010898))
                        goto(Label_0929)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_630:int, ldc:int(2)), ldc:int(0))) {
                        var_3_630 = and:int(var_3_630:int, ldc:int(-2105336126))
                        goto(Label_0810)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_630:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_630 = and:int(var_3_630:int, ldc:int(-1615108777))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_630:int, ldc:int(128)), ldc:int(0))) {
                            var_3_630 = and:int(var_3_630:int, ldc:int(-1991026774))
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_630:int, ldc:int(4)), ldc:int(0))) {
                            var_3_630 = and:int(var_3_630:int, ldc:int(1062125649))
                            loopcontinue()
                        }
                        
                        var_3_630 = and:int(var_3_630:int, ldc:int(1895290702))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_105 = var_9_B9:double
                            goto(Label_0810)
                        }
                    }
                    
                    Label_0676:
                    
                    if (cmpeq:boolean(and:int(var_3_630:int, ldc:int(2)), ldc:int(0))) {
                        var_3_630 = and:int(var_3_630:int, ldc:int(225612643))
                        goto(Label_1489)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_630:int, ldc:int(2)), ldc:int(0))) {
                        var_3_630 = and:int(var_3_630:int, ldc:int(-1937529993))
                        goto(Label_1350)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_630:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1223)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_630:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1098)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_630:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_630 = and:int(var_3_630:int, ldc:int(1060796921))
                        goto(Label_0929)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_630:int, ldc:int(64)), ldc:int(0))) {
                        var_3_630 = and:int(var_3_630:int, ldc:int(-1850188995))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_630:int, ldc:int(128)), ldc:int(0))) {
                            var_3_630 = and:int(var_3_630:int, ldc:int(507111387))
                            goto(Label_0533)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_630:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_630 = and:int(var_3_630:int, ldc:int(-1562254032))
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_630:int, ldc:int(33554432)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_630 = and:int(var_3_630:int, ldc:int(1988086111))
                        var_14_105 = mul:double(ldc:double(0.5), add:double(var_9_B9:double, var_14_105:double))
                    }
                    
                    Label_0810:
                    
                    if (cmpeq:boolean(and:int(var_3_630:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1489)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_630:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_630 = and:int(var_3_630:int, ldc:int(1520681676))
                        goto(Label_1350)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_630:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_630 = and:int(var_3_630:int, ldc:int(-103720827))
                        goto(Label_1223)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_630:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1098)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_630:int, ldc:int(1073741824)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_630:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0676)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_630:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_630 = and:int(var_3_630:int, ldc:int(-266280242))
                            goto(Label_0533)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_630:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_630 = and:int(var_3_630:int, ldc:int(-484265117))
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_630:int, ldc:int(128)), ldc:int(0))) {
                            var_3_630 = and:int(var_3_630:int, ldc:int(-273214207))
                            loopcontinue()
                        }
                        
                        var_3_630 = and:int(var_3_630:int, ldc:int(-1100747849))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_DB = xor:int(ldc:int(45), ldc:int(44))
                                goto(Label_1098)
                            }
                        }
                    }
                    
                    Label_0929:
                    
                    if (cmpne:boolean(and:int(var_3_630:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1489)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_630:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_630 = and:int(var_3_630:int, ldc:int(336621499))
                        goto(Label_1350)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_630:int, ldc:int(512)), ldc:int(0))) {
                        var_3_630 = and:int(var_3_630:int, ldc:int(-497177812))
                        goto(Label_1223)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_630:int, ldc:int(512)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_630:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_630 = and:int(var_3_630:int, ldc:int(-334923900))
                            goto(Label_0810)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_630:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_630 = and:int(var_3_630:int, ldc:int(-1867899882))
                            goto(Label_0676)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_630:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_630 = and:int(var_3_630:int, ldc:int(177823292))
                            goto(Label_0533)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_630:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_630:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_630 = and:int(var_3_630:int, ldc:int(-1352790326))
                            loopcontinue()
                        }
                        
                        var_3_630 = and:int(var_3_630:int, ldc:int(-1519890481))
                        var_11_DB = and:int(ldc:int(-25022), ldc:int(8620))
                    }
                    
                    Label_1098:
                    
                    if (cmpne:boolean(and:int(var_3_630:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1489)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_630:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_630 = and:int(var_3_630:int, ldc:int(1826415117))
                        goto(Label_1350)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_630:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_630 = and:int(var_3_630:int, ldc:int(1546547265))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_630:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0929)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_630:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_630 = and:int(var_3_630:int, ldc:int(243867223))
                            goto(Label_0810)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_630:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_630 = and:int(var_3_630:int, ldc:int(-746795541))
                            goto(Label_0676)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_630:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0533)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_630:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_630:int, ldc:int(128)), ldc:int(0))) {
                            var_3_630 = and:int(var_3_630:int, ldc:int(1250692571))
                            loopcontinue()
                        }
                        
                        var_3_630 = and:int(var_3_630:int, ldc:int(2079786823))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                                goto(Label_1350)
                            }
                        }
                    }
                    
                    Label_1223:
                    
                    if (cmpne:boolean(and:int(var_3_630:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_630 = and:int(var_3_630:int, ldc:int(1671117094))
                        goto(Label_1489)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_630:int, ldc:int(2)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_630:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_1098)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_630:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0929)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_630:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0810)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_630:int, ldc:int(64)), ldc:int(0))) {
                            var_3_630 = and:int(var_3_630:int, ldc:int(-681663782))
                            goto(Label_0676)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_630:int, ldc:int(64)), ldc:int(0))) {
                            var_3_630 = and:int(var_3_630:int, ldc:int(692992180))
                            goto(Label_0533)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_630:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_630:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_630 = and:int(var_3_630:int, ldc:int(-1384697479))
                            loopcontinue()
                        }
                        
                        var_3_630 = and:int(var_3_630:int, ldc:int(402085255))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_105:double, var_5_7D:int, var_16_109:int)
                        goto(Label_1478)
                    }
                    
                    Label_1350:
                    
                    if (cmpeq:boolean(and:int(var_3_630:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1489)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_630:int, ldc:int(512)), ldc:int(0))) {
                        var_3_630 = and:int(var_3_630:int, ldc:int(1967616616))
                        goto(Label_1223)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_630:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_630 = and:int(var_3_630:int, ldc:int(-427049842))
                        goto(Label_1098)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_630:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0929)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_630:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0810)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_630:int, ldc:int(4)), ldc:int(0))) {
                        var_3_630 = and:int(var_3_630:int, ldc:int(1583650092))
                        goto(Label_0676)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_630:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0533)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_630:int, ldc:int(64)), ldc:int(0))) {
                        var_3_630 = and:int(var_3_630:int, ldc:int(780196410))
                        goto(Label_0381)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_630:int, ldc:int(4)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_630 = and:int(var_3_630:int, ldc:int(-882002569))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_105:double, ldc:double(0.0))
                    Label_1478:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_63B = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1489:
                    
                    if (cmpne:boolean(and:int(var_3_630:int, ldc:int(512)), ldc:int(0))) {
                        var_3_630 = and:int(var_3_630:int, ldc:int(1429510369))
                        goto(Label_1350)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_630:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1223)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_630:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1098)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_630:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0929)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_630:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0810)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_630:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0676)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_630:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0533)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_630:int, ldc:int(128)), ldc:int(0))) {
                        var_3_630 = and:int(var_3_630:int, ldc:int(1915482887))
                        goto(Label_0381)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_630:int, ldc:int(64)), ldc:int(0))) {
                        var_3_630 = and:int(var_3_630:int, ldc:int(259110215))
                        var_17_63B = add:int(var_16_109:int, and:int(ldc:int(11), ldc:int(24929)))
                        looporswitchbreak()
                    }
                    
                    var_3_630 = and:int(var_3_630:int, ldc:int(2051815258))
                }
                
                var_3_630 = and:int(var_3_630:int, ldc:int(-1401164013))
                
                if (cmple:boolean(var_5_7D = var_17_63B:int, sub:int(var_6_84:int, and:int(ldc:int(17945), ldc:int(35))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpeq:boolean(and:int(var_3_630:int, ldc:int(4)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
