public class \u12b2\u9a18\uc7fe\u4c2b\u6c52.\uc87f\u5db4\u718f\ubefe\u6bb9\u3bd6 {
    public void \uc87f\u5db4\u718f\ubefe\u6bb9\u3bd6(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4492\ua6bd\u071d\uc238\u52d3\u69d9 p0, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p1, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p2, int p3) {
        var_7_78 : int
        var_8_89 : int
        var_9_9A : int
        var_10_AB : int
        var_11_BC : int
        var_12_CD : int
        
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
            invokespecial:Object(Object::<init>, this:\uc87f\u5db4\u718f\ubefe\u6bb9\u3bd6)
            putfield:\u4492\ua6bd\u071d\uc238\u52d3\u69d9(\uc87f\u5db4\u718f\ubefe\u6bb9\u3bd6::\u64ab\ubcb0\u9a18\u4c04\ubff1\u416d, this:\uc87f\u5db4\u718f\ubefe\u6bb9\u3bd6, p0:\u4492\ua6bd\u071d\uc238\u52d3\u69d9)
            var_7_78 = shr:int(sub:int(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u8aa5\u97b7\u4daf\u72f1\u600f\u8cae, p1:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]), p3:int), and:int(ldc:int(2188), ldc:int(8197)))
            var_8_89 = shr:int(sub:int(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u9af2\u8350\u8350\u93a2\u494c\u624e, p1:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]), p3:int), xor:int(ldc:int(10258), ldc:int(10262)))
            var_9_9A = shr:int(sub:int(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u3e75\uc29a\u071d\u4d85\ubded\ub70c, p1:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]), p3:int), and:int(ldc:int(2084), ldc:int(4885)))
            var_10_AB = shr:int(add:int(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u8aa5\u97b7\u4daf\u72f1\u600f\u8cae, p2:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]), p3:int), xor:int(ldc:int(4232), ldc:int(4236)))
            var_11_BC = shr:int(add:int(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u9af2\u8350\u8350\u93a2\u494c\u624e, p2:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]), p3:int), and:int(ldc:int(2116), ldc:int(62)))
            var_12_CD = shr:int(add:int(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u3e75\uc29a\u071d\u4d85\ubded\ub70c, p2:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]), p3:int), xor:int(ldc:int(643), ldc:int(647)))
            putfield:int(\uc87f\u5db4\u718f\ubefe\u6bb9\u3bd6::\uc31c\ubded\u6b0d\u92ff\u7873\u12cb, this:\uc87f\u5db4\u718f\ubefe\u6bb9\u3bd6, shl:int(add:int(sub:int(var_10_AB:int, var_7_78:int), and:int(ldc:int(9293), ldc:int(2225))), and:int(ldc:int(25158), ldc:int(148))))
            putfield:int(\uc87f\u5db4\u718f\ubefe\u6bb9\u3bd6::\u156b\u8709\u6bb9\u7006\u3a62\u4daf, this:\uc87f\u5db4\u718f\ubefe\u6bb9\u3bd6, shl:int(add:int(sub:int(var_11_BC:int, var_8_89:int), and:int(ldc:int(1), ldc:int(11559))), and:int(ldc:int(2085), ldc:int(412))))
            putfield:int(\uc87f\u5db4\u718f\ubefe\u6bb9\u3bd6::\u873d\u97e6\u64f2\u4d85\ud36e\uc910, this:\uc87f\u5db4\u718f\ubefe\u6bb9\u3bd6, shl:int(add:int(sub:int(var_12_CD:int, var_9_9A:int), xor:int(ldc:int(36), ldc:int(37))), xor:int(ldc:int(-24064), ldc:int(-24060))))
            putfield:int(\uc87f\u5db4\u718f\ubefe\u6bb9\u3bd6::\u8d90\u92ee\u183a\u416d\ube23\u3c25, this:\uc87f\u5db4\u718f\ubefe\u6bb9\u3bd6, mul:int(getfield:int(\uc87f\u5db4\u718f\ubefe\u6bb9\u3bd6::\uc31c\ubded\u6b0d\u92ff\u7873\u12cb, this:\uc87f\u5db4\u718f\ubefe\u6bb9\u3bd6), getfield:int(\uc87f\u5db4\u718f\ubefe\u6bb9\u3bd6::\u873d\u97e6\u64f2\u4d85\ud36e\uc910, this:\uc87f\u5db4\u718f\ubefe\u6bb9\u3bd6)))
            putfield:int(\uc87f\u5db4\u718f\ubefe\u6bb9\u3bd6::\u93a2\ubcb0\u647c\ubefe\u2dcc\u5245, this:\uc87f\u5db4\u718f\ubefe\u6bb9\u3bd6, mul:int(mul:int(getfield:int(\uc87f\u5db4\u718f\ubefe\u6bb9\u3bd6::\uc31c\ubded\u6b0d\u92ff\u7873\u12cb, this:\uc87f\u5db4\u718f\ubefe\u6bb9\u3bd6), getfield:int(\uc87f\u5db4\u718f\ubefe\u6bb9\u3bd6::\u156b\u8709\u6bb9\u7006\u3a62\u4daf, this:\uc87f\u5db4\u718f\ubefe\u6bb9\u3bd6)), getfield:int(\uc87f\u5db4\u718f\ubefe\u6bb9\u3bd6::\u873d\u97e6\u64f2\u4d85\ud36e\uc910, this:\uc87f\u5db4\u718f\ubefe\u6bb9\u3bd6)))
            putfield:int(\uc87f\u5db4\u718f\ubefe\u6bb9\u3bd6::\u8d98\u3dd3\ucef1\u5d20\u62da\uafe7, this:\uc87f\u5db4\u718f\ubefe\u6bb9\u3bd6, shl:int(var_7_78:int, and:int(ldc:int(452), ldc:int(8228))))
            putfield:int(\uc87f\u5db4\u718f\ubefe\u6bb9\u3bd6::\u7c6b\u8413\u965f\u1187\ub83f\u0b8e, this:\uc87f\u5db4\u718f\ubefe\u6bb9\u3bd6, shl:int(var_8_89:int, xor:int(ldc:int(2061), ldc:int(2057))))
            putfield:int(\uc87f\u5db4\u718f\ubefe\u6bb9\u3bd6::\u836c\ub18d\u92ee\u47c2\u183a\ucef1, this:\uc87f\u5db4\u718f\ubefe\u6bb9\u3bd6, shl:int(var_9_9A:int, and:int(ldc:int(23572), ldc:int(4))))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public int \uc84e\u4daf\ua068\ud523\ub1b9\u385b(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p0) {
        var_2_5F : int
        var_4_69 : int
        var_5_94 : int
        var_6_BF : int
        stack_FA_0 : int [generated]
        
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
        var_2_5F = and:int(ldc:int(-1366871196), ldc:int(-1905533074))
        var_4_69 = sub:int(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u8aa5\u97b7\u4daf\u72f1\u600f\u8cae, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]), getfield:int(\uc87f\u5db4\u718f\ubefe\u6bb9\u3bd6::\u8d98\u3dd3\ucef1\u5d20\u62da\uafe7, this:\uc87f\u5db4\u718f\ubefe\u6bb9\u3bd6))
        
        if (logicalor:boolean(cmplt:boolean(var_4_69:int, ldc:int(0)), cmpge:boolean(var_4_69:int, getfield:int(\uc87f\u5db4\u718f\ubefe\u6bb9\u3bd6::\uc31c\ubded\u6b0d\u92ff\u7873\u12cb, this:\uc87f\u5db4\u718f\ubefe\u6bb9\u3bd6)))) {
            return:int(ldc:int(-1))
        }
        
        var_5_94 = sub:int(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u9af2\u8350\u8350\u93a2\u494c\u624e, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]), getfield:int(\uc87f\u5db4\u718f\ubefe\u6bb9\u3bd6::\u7c6b\u8413\u965f\u1187\ub83f\u0b8e, this:\uc87f\u5db4\u718f\ubefe\u6bb9\u3bd6))
        
        if (logicaland:boolean(cmpge:boolean(var_5_94:int, ldc:int(0)), cmplt:boolean(var_5_94:int, getfield:int(\uc87f\u5db4\u718f\ubefe\u6bb9\u3bd6::\u156b\u8709\u6bb9\u7006\u3a62\u4daf, this:\uc87f\u5db4\u718f\ubefe\u6bb9\u3bd6)))) {
            var_6_BF = sub:int(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u3e75\uc29a\u071d\u4d85\ubded\ub70c, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]), getfield:int(\uc87f\u5db4\u718f\ubefe\u6bb9\u3bd6::\u836c\ub18d\u92ee\u47c2\u183a\ucef1, this:\uc87f\u5db4\u718f\ubefe\u6bb9\u3bd6))
            
            if (logicaland:boolean(cmpge:boolean(var_6_BF:int, ldc:int(0)), cmplt:boolean(var_6_BF:int, getfield:int(\uc87f\u5db4\u718f\ubefe\u6bb9\u3bd6::\u873d\u97e6\u64f2\u4d85\ud36e\uc910, this:\uc87f\u5db4\u718f\ubefe\u6bb9\u3bd6)))) {
                stack_FA_0 = add:int(add:int(mul:int(var_5_94:int, getfield:int(\uc87f\u5db4\u718f\ubefe\u6bb9\u3bd6::\u8d90\u92ee\u183a\u416d\ube23\u3c25, this:\uc87f\u5db4\u718f\ubefe\u6bb9\u3bd6)), mul:int(var_6_BF:int, getfield:int(\uc87f\u5db4\u718f\ubefe\u6bb9\u3bd6::\uc31c\ubded\u6b0d\u92ff\u7873\u12cb, this:\uc87f\u5db4\u718f\ubefe\u6bb9\u3bd6))), var_4_69:int)
            }
            else {
                var_2_5F = and:int(var_2_5F:int, ldc:int(-1076424226))
                stack_FA_0 = ldc:int(-1)
            }
            
            return:int(stack_FA_0:int)
        }
        
        return:int(ldc:int(-1))
    }
    
    public int \ub19c\ub171\u7ce1\u99f7\ud51e\ub18d(\u4f52\u6cfe\u9a18\uc29a\u3bd6.\u3a62\u7330\uafe7\u5db4\u12cb p0, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p1) {
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
            return:int(invokevirtual:int(\u8bb0\u759a\u3bc9\u527a\ube23\u5140::\ub19c\ub171\u7ce1\u99f7\ud51e\ub18d, getfield:\u4492\ua6bd\u071d\uc238\u52d3\u69d9[expected:\u8bb0\u759a\u3bc9\u527a\ube23\u5140](\uc87f\u5db4\u718f\ubefe\u6bb9\u3bd6::\u64ab\ubcb0\u9a18\u4c04\ubff1\u416d, this:\uc87f\u5db4\u718f\ubefe\u6bb9\u3bd6), p0:\u3a62\u7330\uafe7\u5db4\u12cb, p1:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56))
        }
        
        goto(Label_0006)
    }
    
    public \u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d \uc238\uc31c\ua61f\u92ee\u51b2\u527a(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p0) {
        var_4_65 : int
        var_5_A3 : \u8413\u7e3f\uc910\uf94d\u5654\u6b0d
        
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
            var_4_65 = invokevirtual:int(\uc87f\u5db4\u718f\ubefe\u6bb9\u3bd6::\uc84e\u4daf\ua068\ud523\ub1b9\u385b, this:\uc87f\u5db4\u718f\ubefe\u6bb9\u3bd6, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56)
            
            if (cmpge:boolean(var_4_65:int, ldc:int(0))) {
                if (cmplt:boolean(var_4_65:int, getfield:int(\uc87f\u5db4\u718f\ubefe\u6bb9\u3bd6::\u93a2\ubcb0\u647c\ubefe\u2dcc\u5245, this:\uc87f\u5db4\u718f\ubefe\u6bb9\u3bd6))) {
                    if (cmpne:boolean(getfield:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[](\uc87f\u5db4\u718f\ubefe\u6bb9\u3bd6::\u5db4\ua562\ua562\ubb2b\u9033\u624e, this:\uc87f\u5db4\u718f\ubefe\u6bb9\u3bd6), aconstnull:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[]())) {
                        var_5_A3 = loadelement:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(getfield:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[](\uc87f\u5db4\u718f\ubefe\u6bb9\u3bd6::\u5db4\ua562\ua562\ubb2b\u9033\u624e, this:\uc87f\u5db4\u718f\ubefe\u6bb9\u3bd6), var_4_65:int)
                        
                        if (cmpeq:boolean(var_5_A3:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d, aconstnull:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d())) {
                            var_5_A3 = invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u4492\ua6bd\u071d\uc238\u52d3\u69d9::\uc238\uc31c\ua61f\u92ee\u51b2\u527a, getfield:\u4492\ua6bd\u071d\uc238\u52d3\u69d9(\uc87f\u5db4\u718f\ubefe\u6bb9\u3bd6::\u64ab\ubcb0\u9a18\u4c04\ubff1\u416d, this:\uc87f\u5db4\u718f\ubefe\u6bb9\u3bd6), p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56)
                            storeelement:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(getfield:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[](\uc87f\u5db4\u718f\ubefe\u6bb9\u3bd6::\u5db4\ua562\ua562\ubb2b\u9033\u624e, this:\uc87f\u5db4\u718f\ubefe\u6bb9\u3bd6), var_4_65:int, var_5_A3:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d)
                        }
                        
                        return:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(var_5_A3:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d)
                    }
                }
            }
            
            return:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u4492\ua6bd\u071d\uc238\u52d3\u69d9::\uc238\uc31c\ua61f\u92ee\u51b2\u527a, getfield:\u4492\ua6bd\u071d\uc238\u52d3\u69d9(\uc87f\u5db4\u718f\ubefe\u6bb9\u3bd6::\u64ab\ubcb0\u9a18\u4c04\ubff1\u416d, this:\uc87f\u5db4\u718f\ubefe\u6bb9\u3bd6), p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56))
        }
        
        goto(Label_0006)
    }
    
    public void \u120d\ubded\ube23\uff55\u6c56\u416d() {
        var_1_5F : int
        
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
            var_1_5F = and:int(ldc:int(1516937126), ldc:int(-667240619))
            
            if (cmpeq:boolean(getfield:int[](\uc87f\u5db4\u718f\ubefe\u6bb9\u3bd6::\ub113\u9033\ua3b4\u36d3\u6fb0\u8bb0, this:\uc87f\u5db4\u718f\ubefe\u6bb9\u3bd6), aconstnull:int[]())) {
                putfield:int[](\uc87f\u5db4\u718f\ubefe\u6bb9\u3bd6::\ub113\u9033\ua3b4\u36d3\u6fb0\u8bb0, this:\uc87f\u5db4\u718f\ubefe\u6bb9\u3bd6, checkcast:int[](int[].class, checkcast:int[](int[].class, invokevirtual:Object[expected:int[]](\u9255\u4c2b\ud171\u3e2a\u7c6b\u4daf::\u6b5f\u40a9\u62da\u600f\u0a06\ub1b9, getstatic:\u9255\u4c2b\ud171\u3e2a\u7c6b\u4daf(\uc87f\u5db4\u718f\ubefe\u6bb9\u3bd6::\ubff1\u6fb0\u2dcc\uc2bd\ub70c\u5db4), getfield:int(\uc87f\u5db4\u718f\ubefe\u6bb9\u3bd6::\u93a2\ubcb0\u647c\ubefe\u2dcc\u5245, this:\uc87f\u5db4\u718f\ubefe\u6bb9\u3bd6)))))
            }
            
            loop {
                if (cmpeq:boolean(and:int(var_1_5F:int, ldc:int(131072)), ldc:int(0))) {
                    var_1_5F = and:int(var_1_5F:int, ldc:int(1836273107))
                }
                else {
                    var_1_5F = and:int(var_1_5F:int, ldc:int(1594243027))
                    
                    if (cmpeq:boolean(getfield:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[](\uc87f\u5db4\u718f\ubefe\u6bb9\u3bd6::\u5db4\ua562\ua562\ubb2b\u9033\u624e, this:\uc87f\u5db4\u718f\ubefe\u6bb9\u3bd6), aconstnull:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[]())) {
                        putfield:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[](\uc87f\u5db4\u718f\ubefe\u6bb9\u3bd6::\u5db4\ua562\ua562\ubb2b\u9033\u624e, this:\uc87f\u5db4\u718f\ubefe\u6bb9\u3bd6, checkcast:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[](\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[].class, checkcast:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[](\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[].class, invokevirtual:Object[expected:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[]](\u9255\u4c2b\ud171\u3e2a\u7c6b\u4daf::\u6b5f\u40a9\u62da\u600f\u0a06\ub1b9, getstatic:\u9255\u4c2b\ud171\u3e2a\u7c6b\u4daf(\uc87f\u5db4\u718f\ubefe\u6bb9\u3bd6::\ub83f\u4d85\u6ec6\u385b\uc7fe\u3d4b), getfield:int(\uc87f\u5db4\u718f\ubefe\u6bb9\u3bd6::\u93a2\ubcb0\u647c\ubefe\u2dcc\u5245, this:\uc87f\u5db4\u718f\ubefe\u6bb9\u3bd6)))))
                    }
                }
                
                if (cmpne:boolean(and:int(var_1_5F:int, ldc:int(131072)), ldc:int(0))) {
                    looporswitchbreak()
                }
            }
            
            if (cmpeq:boolean(getfield:\uc2e8\u9255\u647c\ud171\ubf56[](\uc87f\u5db4\u718f\ubefe\u6bb9\u3bd6::\u516c\u7e3f\u97b7\ud4fe\u6fb0\u718f, this:\uc87f\u5db4\u718f\ubefe\u6bb9\u3bd6), aconstnull:\uc2e8\u9255\u647c\ud171\ubf56[]())) {
                putfield:\uc2e8\u9255\u647c\ud171\ubf56[](\uc87f\u5db4\u718f\ubefe\u6bb9\u3bd6::\u516c\u7e3f\u97b7\ud4fe\u6fb0\u718f, this:\uc87f\u5db4\u718f\ubefe\u6bb9\u3bd6, checkcast:\uc2e8\u9255\u647c\ud171\ubf56[](\u51fa\u12cb\u7330\u74b1\u6c52.\uc2e8\u9255\u647c\ud171\ubf56[].class, checkcast:\uc2e8\u9255\u647c\ud171\ubf56[](\u51fa\u12cb\u7330\u74b1\u6c52.\uc2e8\u9255\u647c\ud171\ubf56[].class, invokevirtual:Object[expected:\uc2e8\u9255\u647c\ud171\ubf56[]](\u9255\u4c2b\ud171\u3e2a\u7c6b\u4daf::\u6b5f\u40a9\u62da\u600f\u0a06\ub1b9, getstatic:\u9255\u4c2b\ud171\u3e2a\u7c6b\u4daf(\uc87f\u5db4\u718f\ubefe\u6bb9\u3bd6::\u3d4b\u3bd6\ub8be\u6d69\uc3e3\u6ec6), getfield:int(\uc87f\u5db4\u718f\ubefe\u6bb9\u3bd6::\u93a2\ubcb0\u647c\ubefe\u2dcc\u5245, this:\uc87f\u5db4\u718f\ubefe\u6bb9\u3bd6)))))
            }
            
            invokestatic:void(Arrays::fill, getfield:int[](\uc87f\u5db4\u718f\ubefe\u6bb9\u3bd6::\ub113\u9033\ua3b4\u36d3\u6fb0\u8bb0, this:\uc87f\u5db4\u718f\ubefe\u6bb9\u3bd6), ldc:int(-1))
            invokestatic:void(Arrays::fill, getfield:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[][expected:Object[]](\uc87f\u5db4\u718f\ubefe\u6bb9\u3bd6::\u5db4\ua562\ua562\ubb2b\u9033\u624e, this:\uc87f\u5db4\u718f\ubefe\u6bb9\u3bd6), aconstnull:Object())
            invokestatic:void(Arrays::fill, getfield:\uc2e8\u9255\u647c\ud171\ubf56[][expected:Object[]](\uc87f\u5db4\u718f\ubefe\u6bb9\u3bd6::\u516c\u7e3f\u97b7\ud4fe\u6fb0\u718f, this:\uc87f\u5db4\u718f\ubefe\u6bb9\u3bd6), aconstnull:Object())
            invokespecial:void(\uc87f\u5db4\u718f\ubefe\u6bb9\u3bd6::\u40a9\u8aa5\u0c95\u6ec6\u62da\u927d, this:\uc87f\u5db4\u718f\ubefe\u6bb9\u3bd6)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \u40a9\u8aa5\u0c95\u6ec6\u62da\u927d() {
        var_1_118 : int
        var_3_A8 : \ud523\u92ff\ubb2b\u759a\ud36e
        var_4_B0 : \u67e9\u92ee\u72f1\u392e\u3c25\ucef1
        var_5_B4 : int
        var_6_D0 : int
        var_7_D4 : int
        var_8_10E : int
        var_9_112 : int
        
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
            var_1_118 = and:int(ldc:int(-1247216649), ldc:int(-710263373))
            
            if (cmpeq:boolean(getfield:int(\uc87f\u5db4\u718f\ubefe\u6bb9\u3bd6::\uc31c\ubded\u6b0d\u92ff\u7873\u12cb, this:\uc87f\u5db4\u718f\ubefe\u6bb9\u3bd6), ldc:int(48))) {
                if (cmpeq:boolean(getfield:int(\uc87f\u5db4\u718f\ubefe\u6bb9\u3bd6::\u156b\u8709\u6bb9\u7006\u3a62\u4daf, this:\uc87f\u5db4\u718f\ubefe\u6bb9\u3bd6), ldc:int(48))) {
                    if (cmpeq:boolean(getfield:int(\uc87f\u5db4\u718f\ubefe\u6bb9\u3bd6::\u873d\u97e6\u64f2\u4d85\ud36e\uc910, this:\uc87f\u5db4\u718f\ubefe\u6bb9\u3bd6), ldc:int(48))) {
                        var_3_A8 = invokevirtual:\ud523\u92ff\ubb2b\u759a\ud36e(\u4492\ua6bd\u071d\uc238\u52d3\u69d9::\u3e2a\uc2e8\ubded\u40a9\u7330\uff55, getfield:\u4492\ua6bd\u071d\uc238\u52d3\u69d9(\uc87f\u5db4\u718f\ubefe\u6bb9\u3bd6::\u64ab\ubcb0\u9a18\u4c04\ubff1\u416d, this:\uc87f\u5db4\u718f\ubefe\u6bb9\u3bd6), xor:int(ldc:int(2070), ldc:int(2071)), and:int(ldc:int(6273), ldc:int(1573)))
                        var_4_B0 = initobject:\u67e9\u92ee\u72f1\u392e\u3c25\ucef1(\u67e9\u92ee\u72f1\u392e\u3c25\ucef1::<init>)
                        var_5_B4 = ldc:int(16)
                        
                        loop {
                            var_1_118 = and:int(var_1_118:int, ldc:int(-1249101317))
                            
                            if (cmpge:boolean(var_5_B4:int, ldc:int(32))) {
                                looporswitchbreak()
                            }
                            
                            var_6_D0 = mul:int(var_5_B4:int, getfield:int(\uc87f\u5db4\u718f\ubefe\u6bb9\u3bd6::\u8d90\u92ee\u183a\u416d\ube23\u3c25, this:\uc87f\u5db4\u718f\ubefe\u6bb9\u3bd6))
                            var_7_D4 = ldc:int(16)
                            
                            loop {
                                if (cmpeq:boolean(and:int(var_1_118:int, ldc:int(32)), ldc:int(0))) {
                                    var_1_118 = and:int(var_1_118:int, ldc:int(-1537523225))
                                }
                                else {
                                    var_1_118 = and:int(var_1_118:int, ldc:int(-1648632321))
                                    
                                    if (cmplt:boolean(var_7_D4:int, ldc:int(32))) {
                                        var_8_10E = mul:int(var_7_D4:int, getfield:int(\uc87f\u5db4\u718f\ubefe\u6bb9\u3bd6::\uc31c\ubded\u6b0d\u92ff\u7873\u12cb, this:\uc87f\u5db4\u718f\ubefe\u6bb9\u3bd6))
                                        var_9_112 = ldc:int(16)
                                        
                                        loop {
                                            var_1_118 = and:int(var_1_118:int, ldc:int(-1750429769))
                                            
                                            if (cmpge:boolean(var_9_112:int, ldc:int(32))) {
                                                looporswitchbreak()
                                            }
                                            
                                            invokevirtual:void(\u67e9\u92ee\u72f1\u392e\u3c25\ucef1::\u4975\u392e\u836c\u7ce1\ub113\u0b8e, var_4_B0:\u67e9\u92ee\u72f1\u392e\u3c25\ucef1, add:int(getfield:int(\uc87f\u5db4\u718f\ubefe\u6bb9\u3bd6::\u8d98\u3dd3\ucef1\u5d20\u62da\uafe7, this:\uc87f\u5db4\u718f\ubefe\u6bb9\u3bd6), var_9_112:int), add:int(getfield:int(\uc87f\u5db4\u718f\ubefe\u6bb9\u3bd6::\u7c6b\u8413\u965f\u1187\ub83f\u0b8e, this:\uc87f\u5db4\u718f\ubefe\u6bb9\u3bd6), var_5_B4:int), add:int(getfield:int(\uc87f\u5db4\u718f\ubefe\u6bb9\u3bd6::\u836c\ub18d\u92ee\u47c2\u183a\ucef1, this:\uc87f\u5db4\u718f\ubefe\u6bb9\u3bd6), var_7_D4:int))
                                            storeelement:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(getfield:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[](\uc87f\u5db4\u718f\ubefe\u6bb9\u3bd6::\u5db4\ua562\ua562\ubb2b\u9033\u624e, this:\uc87f\u5db4\u718f\ubefe\u6bb9\u3bd6), add:int(add:int(var_6_D0:int, var_8_10E:int), var_9_112:int), invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\ud523\u92ff\ubb2b\u759a\ud36e::\uc238\uc31c\ua61f\u92ee\u51b2\u527a, var_3_A8:\ud523\u92ff\ubb2b\u759a\ud36e, var_4_B0:\u67e9\u92ee\u72f1\u392e\u3c25\ucef1[expected:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56]))
                                            inc:int(var_9_112, ldc:int(1))
                                        }
                                        
                                        var_1_118 = and:int(var_1_118:int, ldc:int(-1647599949))
                                        inc:int(var_7_D4, ldc:int(1))
                                        loopcontinue()
                                    }
                                }
                                
                                if (cmpne:boolean(and:int(var_1_118:int, ldc:int(67108864)), ldc:int(0))) {
                                    looporswitchbreak()
                                }
                            }
                            
                            var_1_118 = and:int(var_1_118:int, ldc:int(-1221980417))
                            inc:int(var_5_B4, ldc:int(1))
                        }
                    }
                }
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u718f\uc31c\u6198\ub1b9\u74b1\ud523() {
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
            invokevirtual:void(\u9255\u4c2b\ud171\u3e2a\u7c6b\u4daf::\ub1b9\ubff1\u873d\ucb79\u3504\u4ab3, getstatic:\u9255\u4c2b\ud171\u3e2a\u7c6b\u4daf(\uc87f\u5db4\u718f\ubefe\u6bb9\u3bd6::\ubff1\u6fb0\u2dcc\uc2bd\ub70c\u5db4), getfield:int[][expected:Object](\uc87f\u5db4\u718f\ubefe\u6bb9\u3bd6::\ub113\u9033\ua3b4\u36d3\u6fb0\u8bb0, this:\uc87f\u5db4\u718f\ubefe\u6bb9\u3bd6))
            putfield:int[](\uc87f\u5db4\u718f\ubefe\u6bb9\u3bd6::\ub113\u9033\ua3b4\u36d3\u6fb0\u8bb0, this:\uc87f\u5db4\u718f\ubefe\u6bb9\u3bd6, aconstnull:int[]())
            invokevirtual:void(\u9255\u4c2b\ud171\u3e2a\u7c6b\u4daf::\ub1b9\ubff1\u873d\ucb79\u3504\u4ab3, getstatic:\u9255\u4c2b\ud171\u3e2a\u7c6b\u4daf(\uc87f\u5db4\u718f\ubefe\u6bb9\u3bd6::\ub83f\u4d85\u6ec6\u385b\uc7fe\u3d4b), getfield:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[][expected:Object](\uc87f\u5db4\u718f\ubefe\u6bb9\u3bd6::\u5db4\ua562\ua562\ubb2b\u9033\u624e, this:\uc87f\u5db4\u718f\ubefe\u6bb9\u3bd6))
            putfield:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[](\uc87f\u5db4\u718f\ubefe\u6bb9\u3bd6::\u5db4\ua562\ua562\ubb2b\u9033\u624e, this:\uc87f\u5db4\u718f\ubefe\u6bb9\u3bd6, aconstnull:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[]())
            invokevirtual:void(\u9255\u4c2b\ud171\u3e2a\u7c6b\u4daf::\ub1b9\ubff1\u873d\ucb79\u3504\u4ab3, getstatic:\u9255\u4c2b\ud171\u3e2a\u7c6b\u4daf(\uc87f\u5db4\u718f\ubefe\u6bb9\u3bd6::\u3d4b\u3bd6\ub8be\u6d69\uc3e3\u6ec6), getfield:\uc2e8\u9255\u647c\ud171\ubf56[][expected:Object](\uc87f\u5db4\u718f\ubefe\u6bb9\u3bd6::\u516c\u7e3f\u97b7\ud4fe\u6fb0\u718f, this:\uc87f\u5db4\u718f\ubefe\u6bb9\u3bd6))
            putfield:\uc2e8\u9255\u647c\ud171\ubf56[](\uc87f\u5db4\u718f\ubefe\u6bb9\u3bd6::\u516c\u7e3f\u97b7\ud4fe\u6fb0\u718f, this:\uc87f\u5db4\u718f\ubefe\u6bb9\u3bd6, aconstnull:\uc2e8\u9255\u647c\ud171\ubf56[]())
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public int[] \u92ff\ub83f\u4cd9\ud4fe\u3776\u6198() {
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
            return:int[](getfield:int[](\uc87f\u5db4\u718f\ubefe\u6bb9\u3bd6::\ub113\u9033\ua3b4\u36d3\u6fb0\u8bb0, this:\uc87f\u5db4\u718f\ubefe\u6bb9\u3bd6))
        }
        
        goto(Label_0006)
    }
    
    public \u51fa\u12cb\u7330\u74b1\u6c52.\uc2e8\u9255\u647c\ud171\ubf56 \u759a\u4975\u494c\u3a62\ua61f\ubf56(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p0) {
        var_4_65 : int
        var_5_A3 : \uc2e8\u9255\u647c\ud171\ubf56
        
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
            var_4_65 = invokevirtual:int(\uc87f\u5db4\u718f\ubefe\u6bb9\u3bd6::\uc84e\u4daf\ua068\ud523\ub1b9\u385b, this:\uc87f\u5db4\u718f\ubefe\u6bb9\u3bd6, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56)
            
            if (cmpge:boolean(var_4_65:int, ldc:int(0))) {
                if (cmplt:boolean(var_4_65:int, getfield:int(\uc87f\u5db4\u718f\ubefe\u6bb9\u3bd6::\u93a2\ubcb0\u647c\ubefe\u2dcc\u5245, this:\uc87f\u5db4\u718f\ubefe\u6bb9\u3bd6))) {
                    if (cmpne:boolean(getfield:\uc2e8\u9255\u647c\ud171\ubf56[](\uc87f\u5db4\u718f\ubefe\u6bb9\u3bd6::\u516c\u7e3f\u97b7\ud4fe\u6fb0\u718f, this:\uc87f\u5db4\u718f\ubefe\u6bb9\u3bd6), aconstnull:\uc2e8\u9255\u647c\ud171\ubf56[]())) {
                        var_5_A3 = loadelement:\uc2e8\u9255\u647c\ud171\ubf56(getfield:\uc2e8\u9255\u647c\ud171\ubf56[](\uc87f\u5db4\u718f\ubefe\u6bb9\u3bd6::\u516c\u7e3f\u97b7\ud4fe\u6fb0\u718f, this:\uc87f\u5db4\u718f\ubefe\u6bb9\u3bd6), var_4_65:int)
                        
                        if (cmpeq:boolean(var_5_A3:\uc2e8\u9255\u647c\ud171\ubf56, aconstnull:\uc2e8\u9255\u647c\ud171\ubf56())) {
                            var_5_A3 = invokevirtual:\uc2e8\u9255\u647c\ud171\ubf56(\u4492\ua6bd\u071d\uc238\u52d3\u69d9::\uc4d2\u4daf\u392e\ub6ab\u8aa5\uc31c, getfield:\u4492\ua6bd\u071d\uc238\u52d3\u69d9(\uc87f\u5db4\u718f\ubefe\u6bb9\u3bd6::\u64ab\ubcb0\u9a18\u4c04\ubff1\u416d, this:\uc87f\u5db4\u718f\ubefe\u6bb9\u3bd6), p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56)
                            storeelement:\uc2e8\u9255\u647c\ud171\ubf56(getfield:\uc2e8\u9255\u647c\ud171\ubf56[](\uc87f\u5db4\u718f\ubefe\u6bb9\u3bd6::\u516c\u7e3f\u97b7\ud4fe\u6fb0\u718f, this:\uc87f\u5db4\u718f\ubefe\u6bb9\u3bd6), var_4_65:int, var_5_A3:\uc2e8\u9255\u647c\ud171\ubf56)
                        }
                        
                        return:\uc2e8\u9255\u647c\ud171\ubf56(var_5_A3:\uc2e8\u9255\u647c\ud171\ubf56)
                    }
                }
            }
            
            return:\uc2e8\u9255\u647c\ud171\ubf56(invokevirtual:\uc2e8\u9255\u647c\ud171\ubf56(\u4492\ua6bd\u071d\uc238\u52d3\u69d9::\uc4d2\u4daf\u392e\ub6ab\u8aa5\uc31c, getfield:\u4492\ua6bd\u071d\uc238\u52d3\u69d9(\uc87f\u5db4\u718f\ubefe\u6bb9\u3bd6::\u64ab\ubcb0\u9a18\u4c04\ubff1\u416d, this:\uc87f\u5db4\u718f\ubefe\u6bb9\u3bd6), p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56))
        }
        
        goto(Label_0006)
    }
    
    public \u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u836c\u67e9\u5d20\u5fe1\u7e3f.\ub83f\uc9f6\u47c2\u67d0\u7ce1 \uc2e8\u5db4\u3e2a\uc3e3\u5f50\ud158(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p0) {
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
            return:\ub83f\uc9f6\u47c2\u67d0\u7ce1(invokevirtual:\ub83f\uc9f6\u47c2\u67d0\u7ce1(\u4492\ua6bd\u071d\uc238\u52d3\u69d9::\uc2e8\u5db4\u3e2a\uc3e3\u5f50\ud158, getfield:\u4492\ua6bd\u071d\uc238\u52d3\u69d9(\uc87f\u5db4\u718f\ubefe\u6bb9\u3bd6::\u64ab\ubcb0\u9a18\u4c04\ubff1\u416d, this:\uc87f\u5db4\u718f\ubefe\u6bb9\u3bd6), p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, getstatic:\ube23\u3504\u759a\ub83f\u8753(\ube23\u3504\u759a\ub83f\u8753::\u4492\uc246\ucfaf\u64ab\uceb8\u3e75)))
        }
        
        goto(Label_0006)
    }
    
    public \u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u836c\u67e9\u5d20\u5fe1\u7e3f.\ub83f\uc9f6\u47c2\u67d0\u7ce1 \uc2e8\u5db4\u3e2a\uc3e3\u5f50\ud158(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p0, \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\ube23\u3504\u759a\ub83f\u8753 p1) {
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
            return:\ub83f\uc9f6\u47c2\u67d0\u7ce1(invokevirtual:\ub83f\uc9f6\u47c2\u67d0\u7ce1(\u4492\ua6bd\u071d\uc238\u52d3\u69d9::\uc2e8\u5db4\u3e2a\uc3e3\u5f50\ud158, getfield:\u4492\ua6bd\u071d\uc238\u52d3\u69d9(\uc87f\u5db4\u718f\ubefe\u6bb9\u3bd6::\u64ab\ubcb0\u9a18\u4c04\ubff1\u416d, this:\uc87f\u5db4\u718f\ubefe\u6bb9\u3bd6), p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, p1:\ube23\u3504\u759a\ub83f\u8753))
        }
        
        goto(Label_0006)
    }
    
    public boolean \u8df4\u71f1\u12b2\u9af2\u1833\ub1b9(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p0) {
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
            return:boolean(invokevirtual:boolean(\u8bb0\u759a\u3bc9\u527a\ube23\u5140::\u8df4\u71f1\u12b2\u9af2\u1833\ub1b9, getfield:\u4492\ua6bd\u071d\uc238\u52d3\u69d9[expected:\u8bb0\u759a\u3bc9\u527a\ube23\u5140](\uc87f\u5db4\u718f\ubefe\u6bb9\u3bd6::\u64ab\ubcb0\u9a18\u4c04\ubff1\u416d, this:\uc87f\u5db4\u718f\ubefe\u6bb9\u3bd6), p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56))
        }
        
        goto(Label_0006)
    }
    
    public \u5d20\u7043\u88c5\u5db4\uf94d.\uf995\u8709\ua61f\ub32d\ubff1\u99f7 \u9033\u3711\u494c\u88c5\u69d9\u97b7(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p0) {
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
            return:\uf995\u8709\ua61f\ub32d\ubff1\u99f7(invokevirtual:\uf995\u8709\ua61f\ub32d\ubff1\u99f7(\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\ub171\u3bc9\u67d0\u516c\u9937\ub102, invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e](\uc87f\u5db4\u718f\ubefe\u6bb9\u3bd6::\uc238\uc31c\ua61f\u92ee\u51b2\u527a, this:\uc87f\u5db4\u718f\ubefe\u6bb9\u3bd6, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56)))
        }
        
        goto(Label_0006)
    }
    
    public int \u4f52\u3d4b\ub83f\u120d\u7d52\u64ab(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p0, \u6b0d\u12cb\u156b\u4179\u8bb0.\u760c\u5bc4\u6d69\u3bd6\u4d85\ub171 p1) {
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
            return:int(invokevirtual:int(\u4492\ua6bd\u071d\uc238\u52d3\u69d9::\u4f52\u3d4b\ub83f\u120d\u7d52\u64ab, getfield:\u4492\ua6bd\u071d\uc238\u52d3\u69d9(\uc87f\u5db4\u718f\ubefe\u6bb9\u3bd6::\u64ab\ubcb0\u9a18\u4c04\ubff1\u416d, this:\uc87f\u5db4\u718f\ubefe\u6bb9\u3bd6), p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, p1:\u760c\u5bc4\u6d69\u3bd6\u4d85\ub171))
        }
        
        goto(Label_0006)
    }
    
    public \u56bd\u8413\u647c\u5bc4\ud158.\ube23\u51b2\u92ee\u6435\u8308\u1833 \u8c8a\ua6bd\u61a4\u72f1\ub32d\u64f2() {
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
            return:\ube23\u51b2\u92ee\u6435\u8308\u1833(invokevirtual:\ube23\u51b2\u92ee\u6435\u8308\u1833(\u4492\ua6bd\u071d\uc238\u52d3\u69d9::\u8c8a\ua6bd\u61a4\u72f1\ub32d\u64f2, getfield:\u4492\ua6bd\u071d\uc238\u52d3\u69d9(\uc87f\u5db4\u718f\ubefe\u6bb9\u3bd6::\u64ab\ubcb0\u9a18\u4c04\ubff1\u416d, this:\uc87f\u5db4\u718f\ubefe\u6bb9\u3bd6)))
        }
        
        goto(Label_0006)
    }
    
    public \u516c\u3d64\u718f\ub171\u6b5f.\u47c2\u74b1\u647c\u446c\u4d85\ub32d \uc910\u67e9\u6435\u4c2b\ub19c\uae5d() {
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
            return:\u47c2\u74b1\u647c\u446c\u4d85\ub32d(getfield:\u47c2\u74b1\u647c\u446c\u4d85\ub32d(\uc87f\u5db4\u718f\ubefe\u6bb9\u3bd6::\uc29a\ua562\u92ff\u446c\u8308\u5db4, this:\uc87f\u5db4\u718f\ubefe\u6bb9\u3bd6))
        }
        
        goto(Label_0006)
    }
    
    public void \u3e2a\u1833\u5f50\ud158\ucef1\u8df4(\u516c\u3d64\u718f\ub171\u6b5f.\u47c2\u74b1\u647c\u446c\u4d85\ub32d p0) {
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
            putfield:\u47c2\u74b1\u647c\u446c\u4d85\ub32d(\uc87f\u5db4\u718f\ubefe\u6bb9\u3bd6::\uc29a\ua562\u92ff\u446c\u8308\u5db4, this:\uc87f\u5db4\u718f\ubefe\u6bb9\u3bd6, p0:\u47c2\u74b1\u647c\u446c\u4d85\ub32d)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public float \u72f1\u8d90\ud36e\uc9f6\ubff1\ubff1(\u927d\u92ff\u71ae\uafe7\u6bb9.\u760c\u4975\u4179\uc246\u8640\u64f2 p0, boolean p1) {
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
            return:float(invokevirtual:float(\u4492\ua6bd\u071d\uc238\u52d3\u69d9::\u72f1\u8d90\ud36e\uc9f6\ubff1\ubff1, getfield:\u4492\ua6bd\u071d\uc238\u52d3\u69d9(\uc87f\u5db4\u718f\ubefe\u6bb9\u3bd6::\u64ab\ubcb0\u9a18\u4c04\ubff1\u416d, this:\uc87f\u5db4\u718f\ubefe\u6bb9\u3bd6), p0:\u760c\u4975\u4179\uc246\u8640\u64f2, p1:boolean))
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
            putstatic:\u9255\u4c2b\ud171\u3e2a\u7c6b\u4daf(\uc87f\u5db4\u718f\ubefe\u6bb9\u3bd6::\ubff1\u6fb0\u2dcc\uc2bd\ub70c\u5db4, initobject:\u9255\u4c2b\ud171\u3e2a\u7c6b\u4daf(\u9255\u4c2b\ud171\u3e2a\u7c6b\u4daf::<init>, getstatic:Class<Integer>(Integer::TYPE), ldc:int(16)))
            putstatic:\u9255\u4c2b\ud171\u3e2a\u7c6b\u4daf(\uc87f\u5db4\u718f\ubefe\u6bb9\u3bd6::\ub83f\u4d85\u6ec6\u385b\uc7fe\u3d4b, initobject:\u9255\u4c2b\ud171\u3e2a\u7c6b\u4daf(\u9255\u4c2b\ud171\u3e2a\u7c6b\u4daf::<init>, ldc:Class<\u8413\u7e3f\uc910\uf94d\u5654\u6b0d>(\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d.class), ldc:int(16)))
            putstatic:\u9255\u4c2b\ud171\u3e2a\u7c6b\u4daf(\uc87f\u5db4\u718f\ubefe\u6bb9\u3bd6::\u3d4b\u3bd6\ub8be\u6d69\uc3e3\u6ec6, initobject:\u9255\u4c2b\ud171\u3e2a\u7c6b\u4daf(\u9255\u4c2b\ud171\u3e2a\u7c6b\u4daf::<init>, ldc:Class<\uc2e8\u9255\u647c\ud171\ubf56>(\u51fa\u12cb\u7330\u74b1\u6c52.\uc2e8\u9255\u647c\ud171\ubf56.class), ldc:int(16)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u3504\u7049\uafe7\u5f50\u5fe1\u3e75(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_6D7 : int
        var_5_81 : int
        var_6_88 : int
        var_7_97 : double
        var_9_BF : double
        var_3_D1 : int
        var_11_E2 : int
        var_14_10C : double
        var_16_110 : int
        var_12_108 : double
        var_17_6E2 : int
        
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
        var_3_6D7 = and:int(ldc:int(-271415930), ldc:int(-1514954761))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\uc87f\u5db4\u718f\ubefe\u6bb9\u3bd6[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0171)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_6D7:int, ldc:int(256)), ldc:int(0))) {
            var_3_6D7 = and:int(var_3_6D7:int, ldc:int(-237052450))
            var_5_81 = and:int(ldc:int(19716), ldc:int(-19717))
            var_6_88 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_97 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(1696), ldc:int(-1697)))
            invokestatic:int(m::a)
            
            loop {
                var_9_BF = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D1 = and:int(var_3_6D7:int, ldc:int(-1214603811))
                    var_9_BF = sub:double(var_7_97:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E2 = var_5_81:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E2:int, sub:int(var_6_88:int, xor:int(ldc:int(456), ldc:int(457)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E2:int, and:int(ldc:int(2051), ldc:int(5)))), var_7_97:double))) {
                        inc:int(var_11_E2, ldc:int(1))
                    }
                    
                    var_3_6D7 = and:int(var_3_D1:int, ldc:int(-403247177))
                    var_14_10C = var_7_97:double
                    var_16_110 = var_11_E2:int
                }
                else {
                    var_11_E2 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_81:int), and:int(ldc:int(16385), ldc:int(17)))
                    var_12_108 = var_14_10C = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81)
                    
                    if (cmplt:boolean(var_16_110 = var_11_E2:int, var_6_88:int)) {
                        var_9_BF = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E2:int)
                        var_16_110 = var_11_E2:int
                        var_14_10C = var_12_108:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_6D7:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_6D7 = and:int(var_3_6D7:int, ldc:int(729826996))
                        goto(Label_1630)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6D7:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_6D7 = and:int(var_3_6D7:int, ldc:int(899485240))
                        goto(Label_1483)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6D7:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1339)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6D7:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_6D7 = and:int(var_3_6D7:int, ldc:int(-615209719))
                        goto(Label_1205)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6D7:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_6D7 = and:int(var_3_6D7:int, ldc:int(262284959))
                        goto(Label_1027)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6D7:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_6D7 = and:int(var_3_6D7:int, ldc:int(1190051581))
                        goto(Label_0911)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6D7:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_6D7 = and:int(var_3_6D7:int, ldc:int(322747653))
                        goto(Label_0761)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6D7:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0610)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6D7:int, ldc:int(128)), ldc:int(0))) {
                        var_3_6D7 = and:int(var_3_6D7:int, ldc:int(-6672167))
                    }
                    else {
                        var_3_6D7 = and:int(var_3_6D7:int, ldc:int(-241762898))
                        
                        if (cmplt:boolean(var_16_110:int, var_6_88:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0610)
                            }
                            
                            goto(Label_0911)
                        }
                    }
                    
                    Label_0428:
                    
                    if (cmpeq:boolean(and:int(var_3_6D7:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_6D7 = and:int(var_3_6D7:int, ldc:int(1878317056))
                        goto(Label_1630)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6D7:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_6D7 = and:int(var_3_6D7:int, ldc:int(65127439))
                        goto(Label_1483)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6D7:int, ldc:int(256)), ldc:int(0))) {
                        var_3_6D7 = and:int(var_3_6D7:int, ldc:int(1720046946))
                        goto(Label_1339)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6D7:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1205)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6D7:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_6D7 = and:int(var_3_6D7:int, ldc:int(191059587))
                        goto(Label_1027)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6D7:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0911)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6D7:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_6D7 = and:int(var_3_6D7:int, ldc:int(-1817224242))
                        goto(Label_0761)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6D7:int, ldc:int(262144)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_6D7:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_6D7 = and:int(var_3_6D7:int, ldc:int(-565627246))
                            loopcontinue()
                        }
                        
                        var_3_6D7 = and:int(var_3_6D7:int, ldc:int(-1443457100))
                        var_11_E2 = and:int(ldc:int(-26648), ldc:int(26643))
                        goto(Label_1619)
                    }
                    
                    Label_0610:
                    
                    if (cmpne:boolean(and:int(var_3_6D7:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_6D7 = and:int(var_3_6D7:int, ldc:int(-560343347))
                        goto(Label_1630)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6D7:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_6D7 = and:int(var_3_6D7:int, ldc:int(-1262093576))
                        goto(Label_1483)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6D7:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_6D7 = and:int(var_3_6D7:int, ldc:int(1132457975))
                        goto(Label_1339)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6D7:int, ldc:int(4)), ldc:int(0))) {
                        var_3_6D7 = and:int(var_3_6D7:int, ldc:int(-853588989))
                        goto(Label_1205)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6D7:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_6D7 = and:int(var_3_6D7:int, ldc:int(1221227896))
                        goto(Label_1027)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6D7:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0911)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6D7:int, ldc:int(64)), ldc:int(0))) {
                        var_3_6D7 = and:int(var_3_6D7:int, ldc:int(-1610343225))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6D7:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0428)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6D7:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_6D7 = and:int(var_3_6D7:int, ldc:int(1734242174))
                            loopcontinue()
                        }
                        
                        var_3_6D7 = and:int(var_3_6D7:int, ldc:int(-1110204505))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10C = var_9_BF:double
                            goto(Label_0911)
                        }
                    }
                    
                    Label_0761:
                    
                    if (cmpne:boolean(and:int(var_3_6D7:int, ldc:int(64)), ldc:int(0))) {
                        var_3_6D7 = and:int(var_3_6D7:int, ldc:int(-1155312897))
                        goto(Label_1630)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6D7:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_6D7 = and:int(var_3_6D7:int, ldc:int(1019401504))
                        goto(Label_1483)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6D7:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_6D7 = and:int(var_3_6D7:int, ldc:int(1503184219))
                        goto(Label_1339)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6D7:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_6D7 = and:int(var_3_6D7:int, ldc:int(-1291502738))
                        goto(Label_1205)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6D7:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1027)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6D7:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_6D7 = and:int(var_3_6D7:int, ldc:int(-1745018559))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6D7:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0610)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6D7:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0428)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6D7:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_6D7 = and:int(var_3_6D7:int, ldc:int(1193039257))
                            loopcontinue()
                        }
                        
                        var_3_6D7 = and:int(var_3_6D7:int, ldc:int(-1111558147))
                        var_14_10C = mul:double(ldc:double(0.5), add:double(var_9_BF:double, var_14_10C:double))
                    }
                    
                    Label_0911:
                    
                    if (cmpne:boolean(and:int(var_3_6D7:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1630)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6D7:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_6D7 = and:int(var_3_6D7:int, ldc:int(1030436608))
                        goto(Label_1483)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6D7:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1339)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6D7:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_6D7 = and:int(var_3_6D7:int, ldc:int(-990118454))
                        goto(Label_1205)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6D7:int, ldc:int(4)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_6D7:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0761)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6D7:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_6D7 = and:int(var_3_6D7:int, ldc:int(1656357965))
                            goto(Label_0610)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6D7:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0428)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6D7:int, ldc:int(8388608)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6D7 = and:int(var_3_6D7:int, ldc:int(-476148233))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81:int), var_7_97:double)) {
                                var_11_E2 = and:int(ldc:int(6785), ldc:int(8257))
                                goto(Label_1205)
                            }
                        }
                    }
                    
                    Label_1027:
                    
                    if (cmpeq:boolean(and:int(var_3_6D7:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_6D7 = and:int(var_3_6D7:int, ldc:int(2038539964))
                        goto(Label_1630)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6D7:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1483)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6D7:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_6D7 = and:int(var_3_6D7:int, ldc:int(-898051050))
                        goto(Label_1339)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6D7:int, ldc:int(128)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_6D7:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0911)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6D7:int, ldc:int(256)), ldc:int(0))) {
                            var_3_6D7 = and:int(var_3_6D7:int, ldc:int(1258709829))
                            goto(Label_0761)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6D7:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_6D7 = and:int(var_3_6D7:int, ldc:int(824243979))
                            goto(Label_0610)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6D7:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_6D7 = and:int(var_3_6D7:int, ldc:int(-1398516364))
                            goto(Label_0428)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6D7:int, ldc:int(4)), ldc:int(0))) {
                            var_3_6D7 = and:int(var_3_6D7:int, ldc:int(2037092154))
                            loopcontinue()
                        }
                        
                        var_3_6D7 = and:int(var_3_6D7:int, ldc:int(-1445746801))
                        var_11_E2 = and:int(ldc:int(-6556), ldc:int(6547))
                    }
                    
                    Label_1205:
                    
                    if (cmpeq:boolean(and:int(var_3_6D7:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_6D7 = and:int(var_3_6D7:int, ldc:int(557913910))
                        goto(Label_1630)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6D7:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_6D7 = and:int(var_3_6D7:int, ldc:int(145903587))
                        goto(Label_1483)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6D7:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6D7 = and:int(var_3_6D7:int, ldc:int(-2086986424))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6D7:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_1027)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6D7:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0911)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6D7:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0761)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6D7:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0610)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6D7:int, ldc:int(64)), ldc:int(0))) {
                            var_3_6D7 = and:int(var_3_6D7:int, ldc:int(1743090967))
                            goto(Label_0428)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6D7:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_6D7 = and:int(var_3_6D7:int, ldc:int(958358781))
                            loopcontinue()
                        }
                        
                        var_3_6D7 = and:int(var_3_6D7:int, ldc:int(-1443192932))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E2:int, ldc:int(0))) {
                                goto(Label_1483)
                            }
                        }
                    }
                    
                    Label_1339:
                    
                    if (cmpne:boolean(and:int(var_3_6D7:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1630)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6D7:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_6D7 = and:int(var_3_6D7:int, ldc:int(-1801965117))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6D7:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_6D7 = and:int(var_3_6D7:int, ldc:int(-1498795689))
                            goto(Label_1205)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6D7:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_6D7 = and:int(var_3_6D7:int, ldc:int(-448836179))
                            goto(Label_1027)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6D7:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0911)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6D7:int, ldc:int(128)), ldc:int(0))) {
                            var_3_6D7 = and:int(var_3_6D7:int, ldc:int(890100055))
                            goto(Label_0761)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6D7:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0610)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6D7:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0428)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6D7:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_6D7 = and:int(var_3_6D7:int, ldc:int(616896257))
                            loopcontinue()
                        }
                        
                        var_3_6D7 = and:int(var_3_6D7:int, ldc:int(-136315419))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10C:double, var_5_81:int, var_16_110:int)
                        goto(Label_1619)
                    }
                    
                    Label_1483:
                    
                    if (cmpeq:boolean(and:int(var_3_6D7:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1630)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6D7:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1339)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6D7:int, ldc:int(64)), ldc:int(0))) {
                        var_3_6D7 = and:int(var_3_6D7:int, ldc:int(179976596))
                        goto(Label_1205)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6D7:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1027)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6D7:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0911)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6D7:int, ldc:int(128)), ldc:int(0))) {
                        var_3_6D7 = and:int(var_3_6D7:int, ldc:int(-357098183))
                        goto(Label_0761)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6D7:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0610)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6D7:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_6D7 = and:int(var_3_6D7:int, ldc:int(257721484))
                        goto(Label_0428)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6D7:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_6D7 = and:int(var_3_6D7:int, ldc:int(260636399))
                        loopcontinue()
                    }
                    
                    var_3_6D7 = and:int(var_3_6D7:int, ldc:int(-1074096218))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10C:double, ldc:double(0.0))
                    Label_1619:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_6E2 = var_5_81:int
                        
                        if (cmpeq:boolean(var_11_E2:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1630:
                    
                    if (cmpeq:boolean(and:int(var_3_6D7:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_6D7 = and:int(var_3_6D7:int, ldc:int(721365080))
                        goto(Label_1483)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6D7:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1339)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6D7:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1205)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6D7:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_6D7 = and:int(var_3_6D7:int, ldc:int(1646753895))
                        goto(Label_1027)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6D7:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0911)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6D7:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0761)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6D7:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_6D7 = and:int(var_3_6D7:int, ldc:int(-183953417))
                        goto(Label_0610)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6D7:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_6D7 = and:int(var_3_6D7:int, ldc:int(-626578033))
                        goto(Label_0428)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6D7:int, ldc:int(256)), ldc:int(0))) {
                        var_3_6D7 = and:int(var_3_6D7:int, ldc:int(-375683690))
                        var_17_6E2 = add:int(var_16_110:int, xor:int(ldc:int(-32447), ldc:int(-32448)))
                        looporswitchbreak()
                    }
                    
                    var_3_6D7 = and:int(var_3_6D7:int, ldc:int(187915640))
                }
                
                var_3_6D7 = and:int(var_3_6D7:int, ldc:int(-1344289377))
                
                if (cmple:boolean(var_5_81 = var_17_6E2:int, sub:int(var_6_88:int, and:int(ldc:int(1049), ldc:int(293))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0171:
        
        if (cmpne:boolean(and:int(var_3_6D7:int, ldc:int(4)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
