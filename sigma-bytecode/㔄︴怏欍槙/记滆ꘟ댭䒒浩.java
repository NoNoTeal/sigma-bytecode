public class \u3504\ufe34\u600f\u6b0d\u69d9.\u8bb0\u6ec6\ua61f\ub32d\u4492\u6d69 {
    public void \u8bb0\u6ec6\ua61f\ub32d\u4492\u6d69() {
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
            invokespecial:\u4492\uc229\u6cfe\u5fe1\u98a4\u8753(\u4492\uc229\u6cfe\u5fe1\u98a4\u8753::<init>, this:\u8bb0\u6ec6\ua61f\ub32d\u4492\u6d69, ldc:String("Flat Item Array"))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public \u3bc9\u67e9\uc87f\u47c2\u5f50.\u7d52\u69d9\uae87\ud4fe\uc910\u3e2a[] \u4d85\uff55\uc3e3\ud4fe\u9937\uc229(io.netty.buffer.ByteBuf p0) {
        var_2_5F : int
        var_4_67 : short
        var_5_6E : \u7d52\u69d9\uae87\ud4fe\uc910\u3e2a[]
        var_6_77 : int
        
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
            var_2_5F = and:int(ldc:int(-843625733), ldc:int(1639046069))
            var_4_67 = invokevirtual:short(\u98a4\u99f7\u6198\u7043\uff55\uc84e::\ua3b4\u5db4\u72f1\u8bb0\u5654\u3bc9, getstatic:\u98a4\u99f7\u6198\u7043\uff55\uc84e(\u1833\ud171\u8350\ubded\u34df\uc9f6::\uae5d\u760c\uc2bd\ucb79\ub18d\u7049), p0:ByteBuf)
            var_5_6E = newarray:\u7d52\u69d9\uae87\ud4fe\uc910\u3e2a[](\u3bc9\u67e9\uc87f\u47c2\u5f50.\u7d52\u69d9\uae87\ud4fe\uc910\u3e2a.class, var_4_67:short[expected:int])
            var_6_77 = and:int(ldc:int(-27343), ldc:int(10766))
            
            loop {
                var_2_5F = and:int(var_2_5F:int, ldc:int(-340291663))
                
                if (cmpge:boolean(var_6_77:short, var_4_67:short)) {
                    looporswitchbreak()
                }
                
                storeelement:\u7d52\u69d9\uae87\ud4fe\uc910\u3e2a(var_5_6E:\u7d52\u69d9\uae87\ud4fe\uc910\u3e2a[], var_6_77:short[expected:int], checkcast:\u7d52\u69d9\uae87\ud4fe\uc910\u3e2a(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u7d52\u69d9\uae87\ud4fe\uc910\u3e2a.class, invokevirtual:\u7d52\u69d9\uae87\ud4fe\uc910\u3e2a(\u8389\u494c\u527a\u8753\ub1b9\u8640<\u7d52\u69d9\uae87\ud4fe\uc910\u3e2a>::\u4d85\uff55\uc3e3\ud4fe\u9937\uc229, getstatic:\u1833\ud171\u8350\ubded\u34df\uc9f6<\u7d52\u69d9\uae87\ud4fe\uc910\u3e2a>[expected:\u8389\u494c\u527a\u8753\ub1b9\u8640<\u7d52\u69d9\uae87\ud4fe\uc910\u3e2a>](\u1833\ud171\u8350\ubded\u34df\uc9f6::\uceb8\ufcaf\uc3e3\u4c04\u392e\u8cae), p0:ByteBuf)))
                inc:short(var_6_77, ldc:short(1))
            }
            
            return:\u7d52\u69d9\uae87\ud4fe\uc910\u3e2a[](var_5_6E:\u7d52\u69d9\uae87\ud4fe\uc910\u3e2a[])
        }
        
        goto(Label_0006)
    }
    
    public void \ud171\uc229\ufe34\u36d3\u5f50\uc2e8(io.netty.buffer.ByteBuf p0, \u3bc9\u67e9\uc87f\u47c2\u5f50.\u7d52\u69d9\uae87\ud4fe\uc910\u3e2a[] p1) {
        var_3_5F : int
        var_6_70 : int
        var_7_79 : int
        
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
            var_3_5F = and:int(ldc:int(1688706981), ldc:int(952475519))
            invokevirtual:void(\u98a4\u99f7\u6198\u7043\uff55\uc84e::\ubded\ubefe\u8d90\u183a\u72f1\u8389, getstatic:\u98a4\u99f7\u6198\u7043\uff55\uc84e(\u1833\ud171\u8350\ubded\u34df\uc9f6::\uae5d\u760c\uc2bd\ucb79\ub18d\u7049), p0:ByteBuf, i2s:short(arraylength:int(p1:\u7d52\u69d9\uae87\ud4fe\uc910\u3e2a[])))
            var_6_70 = arraylength:int(p1:\u7d52\u69d9\uae87\ud4fe\uc910\u3e2a[])
            var_7_79 = and:int(ldc:int(-19724), ldc:int(19723))
            
            loop {
                var_3_5F = and:int(var_3_5F:int, ldc:int(815857021))
                
                if (cmpge:boolean(var_7_79:int, var_6_70:int)) {
                    looporswitchbreak()
                }
                
                invokevirtual:void(\ua3b4\ub1b9\u9af2\u3d64\uf94d\u3dd3<\u7d52\u69d9\uae87\ud4fe\uc910\u3e2a>::\ud171\uc229\ufe34\u36d3\u5f50\uc2e8, getstatic:\u1833\ud171\u8350\ubded\u34df\uc9f6<\u7d52\u69d9\uae87\ud4fe\uc910\u3e2a>[expected:\ua3b4\ub1b9\u9af2\u3d64\uf94d\u3dd3<\u7d52\u69d9\uae87\ud4fe\uc910\u3e2a>](\u1833\ud171\u8350\ubded\u34df\uc9f6::\uceb8\ufcaf\uc3e3\u4c04\u392e\u8cae), p0:ByteBuf, loadelement:\u7d52\u69d9\uae87\ud4fe\uc910\u3e2a(p1:\u7d52\u69d9\uae87\ud4fe\uc910\u3e2a[], var_7_79:int))
                inc:int(var_7_79, ldc:int(1))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public java.lang.Object \u4d85\uff55\uc3e3\ud4fe\u9937\uc229(io.netty.buffer.ByteBuf p0) {
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
            return:Object(invokevirtual:\u7d52\u69d9\uae87\ud4fe\uc910\u3e2a[][expected:Object](\u8bb0\u6ec6\ua61f\ub32d\u4492\u6d69::\u4d85\uff55\uc3e3\ud4fe\u9937\uc229, this:\u8bb0\u6ec6\ua61f\ub32d\u4492\u6d69, p0:ByteBuf))
        }
        
        goto(Label_0006)
    }
    
    public void \ud171\uc229\ufe34\u36d3\u5f50\uc2e8(io.netty.buffer.ByteBuf p0, java.lang.Object p1) {
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
            invokevirtual:void(\u8bb0\u6ec6\ua61f\ub32d\u4492\u6d69::\ud171\uc229\ufe34\u36d3\u5f50\uc2e8, this:\u8bb0\u6ec6\ua61f\ub32d\u4492\u6d69, p0:ByteBuf, checkcast:\u7d52\u69d9\uae87\ud4fe\uc910\u3e2a[](\u3bc9\u67e9\uc87f\u47c2\u5f50.\u7d52\u69d9\uae87\ud4fe\uc910\u3e2a[].class, p1:Object[expected:\u7d52\u69d9\uae87\ud4fe\uc910\u3e2a[]]))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u8cae\u5f50\u3e75\uceb8\u873d\ua3b4(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
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
        var_3_5CD = and:int(ldc:int(-1191812426), ldc:int(-201430250))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u8bb0\u6ec6\ua61f\ub32d\u4492\u6d69[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(64)), ldc:int(0))) {
            var_3_5CD = and:int(var_3_5CD:int, ldc:int(1996487310))
            var_5_7D = and:int(ldc:int(4610), ldc:int(-4611))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-8819), ldc:int(8818)))
            invokestatic:int(m::a)
            
            loop {
                var_9_B9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_CA = and:int(var_3_5CD:int, ldc:int(-1078198394))
                    var_9_B9 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_DB = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_DB:int, sub:int(var_6_84:int, and:int(ldc:int(19279), ldc:int(4241)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_DB:int, xor:int(ldc:int(8290), ldc:int(8291)))), var_7_93:double))) {
                        inc:int(var_11_DB, ldc:int(1))
                    }
                    
                    var_3_5CD = and:int(var_3_CA:int, ldc:int(-1230768289))
                    var_14_105 = var_7_93:double
                    var_16_109 = var_11_DB:int
                }
                else {
                    var_11_DB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), xor:int(ldc:int(8227), ldc:int(8226)))
                    var_12_101 = var_14_105 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_109 = var_11_DB:int, var_6_84:int)) {
                        var_9_B9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_DB:int)
                        var_16_109 = var_11_DB:int
                        var_14_105 = var_12_101:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1378)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1220)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1114)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1011)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0881)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(-672408876))
                        goto(Label_0754)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(831692713))
                        goto(Label_0636)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0525)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(871068367))
                        
                        if (cmplt:boolean(var_16_109:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0525)
                            }
                            
                            goto(Label_0754)
                        }
                    }
                    
                    Label_0365:
                    
                    if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(536345242))
                        goto(Label_1378)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1220)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1114)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(834233566))
                        goto(Label_1011)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(8)), ldc:int(0))) {
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(-1842065578))
                        goto(Label_0881)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(256)), ldc:int(0))) {
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(-482516295))
                        goto(Label_0754)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(-913963006))
                        goto(Label_0636)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(2048)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_5CD = and:int(var_3_5CD:int, ldc:int(-1279592690))
                            var_11_DB = and:int(ldc:int(-29321), ldc:int(28808))
                            goto(Label_1367)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0525:
                    
                    if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1378)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1220)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(64)), ldc:int(0))) {
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(-32191405))
                        goto(Label_1114)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(241244700))
                        goto(Label_1011)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0881)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(1698829295))
                        goto(Label_0754)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(8192)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_5CD = and:int(var_3_5CD:int, ldc:int(-1728544472))
                            goto(Label_0365)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(8)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(1022029391))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_105 = var_9_B9:double
                            goto(Label_0754)
                        }
                    }
                    
                    Label_0636:
                    
                    if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(1)), ldc:int(0))) {
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(97011351))
                        goto(Label_1378)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1220)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(-1720017921))
                        goto(Label_1114)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1011)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0881)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(64)), ldc:int(0))) {
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(1669980726))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0525)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0365)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_5CD = and:int(var_3_5CD:int, ldc:int(-1666003162))
                            loopcontinue()
                        }
                        
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(2108581534))
                        var_14_105 = mul:double(ldc:double(0.5), add:double(var_9_B9:double, var_14_105:double))
                    }
                    
                    Label_0754:
                    
                    if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(-953725236))
                        goto(Label_1378)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(-987019638))
                        goto(Label_1220)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(256)), ldc:int(0))) {
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(358968688))
                        goto(Label_1114)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1011)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(131072)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(1)), ldc:int(0))) {
                            var_3_5CD = and:int(var_3_5CD:int, ldc:int(517183301))
                            goto(Label_0636)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0525)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(512)), ldc:int(0))) {
                            var_3_5CD = and:int(var_3_5CD:int, ldc:int(396355933))
                            goto(Label_0365)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_5CD = and:int(var_3_5CD:int, ldc:int(-114781964))
                            loopcontinue()
                        }
                        
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(-1213302001))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_DB = and:int(ldc:int(1313), ldc:int(581))
                                goto(Label_1011)
                            }
                        }
                    }
                    
                    Label_0881:
                    
                    if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1378)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1220)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1114)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(512)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_5CD = and:int(var_3_5CD:int, ldc:int(-404888888))
                            goto(Label_0754)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_5CD = and:int(var_3_5CD:int, ldc:int(-1150242898))
                            goto(Label_0636)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0525)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0365)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(4096)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(889187215))
                        var_11_DB = and:int(ldc:int(15974), ldc:int(-32359))
                    }
                    
                    Label_1011:
                    
                    if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1378)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1220)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(256)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_5CD = and:int(var_3_5CD:int, ldc:int(-1209105195))
                            goto(Label_0881)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0754)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(2)), ldc:int(0))) {
                            var_3_5CD = and:int(var_3_5CD:int, ldc:int(-1543867279))
                            goto(Label_0636)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0525)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0365)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(1)), ldc:int(0))) {
                            var_3_5CD = and:int(var_3_5CD:int, ldc:int(-1509483766))
                            loopcontinue()
                        }
                        
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(1962337055))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                                goto(Label_1220)
                            }
                        }
                    }
                    
                    Label_1114:
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1378)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(-961038078))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_1011)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0881)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0754)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0636)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0525)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(512)), ldc:int(0))) {
                            var_3_5CD = and:int(var_3_5CD:int, ldc:int(-1686259958))
                            goto(Label_0365)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(2)), ldc:int(0))) {
                            var_3_5CD = and:int(var_3_5CD:int, ldc:int(-1330908578))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_105:double, var_5_7D:int, var_16_109:int)
                            goto(Label_1367)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1220:
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1378)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(-816754209))
                        goto(Label_1114)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(512)), ldc:int(0))) {
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(813490346))
                        goto(Label_1011)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(1790480868))
                        goto(Label_0881)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(2)), ldc:int(0))) {
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(1331042175))
                        goto(Label_0754)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(713046517))
                        goto(Label_0636)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(199952234))
                        goto(Label_0525)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0365)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(1260548255))
                        loopcontinue()
                    }
                    
                    var_3_5CD = and:int(var_3_5CD:int, ldc:int(-1296306490))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_105:double, ldc:double(0.0))
                    Label_1367:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_5D8 = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1378:
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1220)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(-981002436))
                        goto(Label_1114)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1011)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0881)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(238893809))
                        goto(Label_0754)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(272439195))
                        goto(Label_0636)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(512)), ldc:int(0))) {
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(1557959565))
                        goto(Label_0525)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(2)), ldc:int(0))) {
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(1374652858))
                        goto(Label_0365)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(820211358))
                        var_17_5D8 = add:int(var_16_109:int, and:int(ldc:int(26921), ldc:int(5701)))
                        looporswitchbreak()
                    }
                }
                
                var_3_5CD = and:int(var_3_5CD:int, ldc:int(2146592590))
                
                if (cmple:boolean(var_5_7D = var_17_5D8:int, sub:int(var_6_84:int, and:int(ldc:int(12293), ldc:int(3089))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(1)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
