public class \u3504\ufe34\u600f\u6b0d\u69d9.\u3c25\u3a62\u8d98\u839e\ufcaf\ucfaf {
    public void \u3c25\u3a62\u8d98\u839e\ufcaf\ucfaf() {
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
            invokespecial:\u4492\uc229\u6cfe\u5fe1\u98a4\u8753(\u4492\uc229\u6cfe\u5fe1\u98a4\u8753::<init>, this:\u3c25\u3a62\u8d98\u839e\ufcaf\ucfaf, ldc:String("Flat Item Array"))
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
            var_2_5F = and:int(ldc:int(-1416027234), ldc:int(1035562998))
            var_4_67 = invokevirtual:short(\u98a4\u99f7\u6198\u7043\uff55\uc84e::\ua3b4\u5db4\u72f1\u8bb0\u5654\u3bc9, getstatic:\u98a4\u99f7\u6198\u7043\uff55\uc84e(\u1833\ud171\u8350\ubded\u34df\uc9f6::\uae5d\u760c\uc2bd\ucb79\ub18d\u7049), p0:ByteBuf)
            var_5_6E = newarray:\u7d52\u69d9\uae87\ud4fe\uc910\u3e2a[](\u3bc9\u67e9\uc87f\u47c2\u5f50.\u7d52\u69d9\uae87\ud4fe\uc910\u3e2a.class, var_4_67:short[expected:int])
            var_6_77 = and:int(ldc:int(18837), ldc:int(-27550))
            
            loop {
                var_2_5F = and:int(var_2_5F:int, ldc:int(-1390699554))
                
                if (cmpge:boolean(var_6_77:short, var_4_67:short)) {
                    looporswitchbreak()
                }
                
                storeelement:\u7d52\u69d9\uae87\ud4fe\uc910\u3e2a(var_5_6E:\u7d52\u69d9\uae87\ud4fe\uc910\u3e2a[], var_6_77:short[expected:int], checkcast:\u7d52\u69d9\uae87\ud4fe\uc910\u3e2a(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u7d52\u69d9\uae87\ud4fe\uc910\u3e2a.class, invokevirtual:\u7d52\u69d9\uae87\ud4fe\uc910\u3e2a(\u8389\u494c\u527a\u8753\ub1b9\u8640<\u7d52\u69d9\uae87\ud4fe\uc910\u3e2a>::\u4d85\uff55\uc3e3\ud4fe\u9937\uc229, getstatic:\u1833\ud171\u8350\ubded\u34df\uc9f6<\u7d52\u69d9\uae87\ud4fe\uc910\u3e2a>[expected:\u8389\u494c\u527a\u8753\ub1b9\u8640<\u7d52\u69d9\uae87\ud4fe\uc910\u3e2a>](\u1833\ud171\u8350\ubded\u34df\uc9f6::\u4492\ubb2b\uf9c5\u759a\u69d9\u9937), p0:ByteBuf)))
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
            var_3_5F = and:int(ldc:int(1016126929), ldc:int(-808263783))
            invokevirtual:void(\u98a4\u99f7\u6198\u7043\uff55\uc84e::\ubded\ubefe\u8d90\u183a\u72f1\u8389, getstatic:\u98a4\u99f7\u6198\u7043\uff55\uc84e(\u1833\ud171\u8350\ubded\u34df\uc9f6::\uae5d\u760c\uc2bd\ucb79\ub18d\u7049), p0:ByteBuf, i2s:short(arraylength:int(p1:\u7d52\u69d9\uae87\ud4fe\uc910\u3e2a[])))
            var_6_70 = arraylength:int(p1:\u7d52\u69d9\uae87\ud4fe\uc910\u3e2a[])
            var_7_79 = and:int(ldc:int(-6775), ldc:int(6742))
            
            loop {
                var_3_5F = and:int(var_3_5F:int, ldc:int(-662708253))
                
                if (cmpge:boolean(var_7_79:int, var_6_70:int)) {
                    looporswitchbreak()
                }
                
                invokevirtual:void(\ua3b4\ub1b9\u9af2\u3d64\uf94d\u3dd3<\u7d52\u69d9\uae87\ud4fe\uc910\u3e2a>::\ud171\uc229\ufe34\u36d3\u5f50\uc2e8, getstatic:\u1833\ud171\u8350\ubded\u34df\uc9f6<\u7d52\u69d9\uae87\ud4fe\uc910\u3e2a>[expected:\ua3b4\ub1b9\u9af2\u3d64\uf94d\u3dd3<\u7d52\u69d9\uae87\ud4fe\uc910\u3e2a>](\u1833\ud171\u8350\ubded\u34df\uc9f6::\u4492\ubb2b\uf9c5\u759a\u69d9\u9937), p0:ByteBuf, loadelement:\u7d52\u69d9\uae87\ud4fe\uc910\u3e2a(p1:\u7d52\u69d9\uae87\ud4fe\uc910\u3e2a[], var_7_79:int))
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
            return:Object(invokevirtual:\u7d52\u69d9\uae87\ud4fe\uc910\u3e2a[][expected:Object](\u3c25\u3a62\u8d98\u839e\ufcaf\ucfaf::\u4d85\uff55\uc3e3\ud4fe\u9937\uc229, this:\u3c25\u3a62\u8d98\u839e\ufcaf\ucfaf, p0:ByteBuf))
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
            invokevirtual:void(\u3c25\u3a62\u8d98\u839e\ufcaf\ucfaf::\ud171\uc229\ufe34\u36d3\u5f50\uc2e8, this:\u3c25\u3a62\u8d98\u839e\ufcaf\ucfaf, p0:ByteBuf, checkcast:\u7d52\u69d9\uae87\ud4fe\uc910\u3e2a[](\u3bc9\u67e9\uc87f\u47c2\u5f50.\u7d52\u69d9\uae87\ud4fe\uc910\u3e2a[].class, p1:Object[expected:\u7d52\u69d9\uae87\ud4fe\uc910\u3e2a[]]))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u8cae\u5f50\u3e75\uceb8\u873d\ua3b4(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_5FD : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C9 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
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
        var_3_5FD = and:int(ldc:int(1485282989), ldc:int(-75067474))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u3c25\u3a62\u8d98\u839e\ufcaf\ucfaf[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(262144)), ldc:int(0))) {
            var_3_5FD = and:int(var_3_5FD:int, ldc:int(-57476723))
        }
        else {
            var_3_5FD = and:int(var_3_5FD:int, ldc:int(-607195219))
            var_5_85 = and:int(ldc:int(-3942), ldc:int(3941))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-31888), ldc:int(31875)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_5FD:int, ldc:int(-1640063248))
                    var_9_C9 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_8C:int, and:int(ldc:int(10249), ldc:int(21825)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, and:int(ldc:int(25347), ldc:int(9)))), var_7_9B:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_5FD = and:int(var_3_DA:int, ldc:int(-545865747))
                    var_14_115 = var_7_9B:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), xor:int(ldc:int(3216), ldc:int(3217)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_8C:int)) {
                        var_9_C9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(296941919))
                        goto(Label_1426)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-1997282507))
                        goto(Label_1292)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1162)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1043)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(512)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(967547521))
                        goto(Label_0913)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(1070462810))
                        goto(Label_0786)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0652)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-1981256218))
                        goto(Label_0549)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(407359229))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0549)
                            }
                            
                            goto(Label_0786)
                        }
                    }
                    
                    Label_0405:
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1426)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-562715486))
                        goto(Label_1292)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1162)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1043)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0913)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-115077695))
                        goto(Label_0786)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0652)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(64)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-1648911143))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_5FD = and:int(var_3_5FD:int, ldc:int(488107686))
                            var_11_EB = and:int(ldc:int(-21995), ldc:int(1386))
                            goto(Label_1415)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0549:
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-1560713733))
                        goto(Label_1426)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1292)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1162)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-34166412))
                        goto(Label_1043)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0913)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0786)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(2048)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0405)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_5FD = and:int(var_3_5FD:int, ldc:int(-96145593))
                            loopcontinue()
                        }
                        
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-11546967))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C9:double
                            goto(Label_0786)
                        }
                    }
                    
                    Label_0652:
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1426)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-1915153324))
                        goto(Label_1292)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-54043941))
                        goto(Label_1162)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(2119085311))
                        goto(Label_1043)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0913)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(1587504515))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_5FD = and:int(var_3_5FD:int, ldc:int(1974966666))
                            goto(Label_0549)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0405)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_5FD = and:int(var_3_5FD:int, ldc:int(-1667221099))
                            loopcontinue()
                        }
                        
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-1635263580))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C9:double, var_14_115:double))
                    }
                    
                    Label_0786:
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(2139476239))
                        goto(Label_1426)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(32)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-733390830))
                        goto(Label_1292)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(1827329641))
                        goto(Label_1162)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1043)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(2120196247))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_5FD = and:int(var_3_5FD:int, ldc:int(1515027333))
                            goto(Label_0652)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0549)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0405)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(128)), ldc:int(0))) {
                            var_3_5FD = and:int(var_3_5FD:int, ldc:int(-2126785480))
                            loopcontinue()
                        }
                        
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(528469692))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_EB = and:int(ldc:int(517), ldc:int(49))
                                goto(Label_1043)
                            }
                        }
                    }
                    
                    Label_0913:
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1426)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1292)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1162)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(268435456)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_5FD = and:int(var_3_5FD:int, ldc:int(-1762057228))
                            goto(Label_0786)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(64)), ldc:int(0))) {
                            var_3_5FD = and:int(var_3_5FD:int, ldc:int(-1535192687))
                            goto(Label_0652)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0549)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0405)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(2147483647)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(473427694))
                        var_11_EB = and:int(ldc:int(-27714), ldc:int(19521))
                    }
                    
                    Label_1043:
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(512)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(1619917731))
                        goto(Label_1426)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-498336996))
                        goto(Label_1292)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(32)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-1759269731))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_5FD = and:int(var_3_5FD:int, ldc:int(1879604899))
                            goto(Label_0913)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0786)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0652)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0549)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0405)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(512)), ldc:int(0))) {
                            var_3_5FD = and:int(var_3_5FD:int, ldc:int(-1505178330))
                            loopcontinue()
                        }
                        
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(521662381))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1292)
                            }
                        }
                    }
                    
                    Label_1162:
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1426)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(990525990))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_5FD = and:int(var_3_5FD:int, ldc:int(1950433017))
                            goto(Label_1043)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_5FD = and:int(var_3_5FD:int, ldc:int(-2013771484))
                            goto(Label_0913)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0786)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0652)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_5FD = and:int(var_3_5FD:int, ldc:int(1037633589))
                            goto(Label_0549)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0405)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_5FD = and:int(var_3_5FD:int, ldc:int(-2147023713))
                            loopcontinue()
                        }
                        
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(2069360366))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_85:int, var_16_119:int)
                        goto(Label_1415)
                    }
                    
                    Label_1292:
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1426)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1162)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(32)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(642145748))
                        goto(Label_1043)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0913)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0786)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-479088839))
                        goto(Label_0652)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0549)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(1033641880))
                        goto(Label_0405)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-1147907669))
                        loopcontinue()
                    }
                    
                    var_3_5FD = and:int(var_3_5FD:int, ldc:int(2054594469))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1415:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_608 = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1426:
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(1015294805))
                        goto(Label_1292)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1162)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(128)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(821433969))
                        goto(Label_1043)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(1849888490))
                        goto(Label_0913)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0786)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0652)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(61516176))
                        goto(Label_0549)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0405)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-1688752397))
                        var_17_608 = add:int(var_16_119:int, and:int(ldc:int(8481), ldc:int(16587)))
                        looporswitchbreak()
                    }
                    
                    var_3_5FD = and:int(var_3_5FD:int, ldc:int(107154955))
                }
                
                var_3_5FD = and:int(var_3_5FD:int, ldc:int(1586998193))
                
                if (cmple:boolean(var_5_85 = var_17_608:int, sub:int(var_6_8C:int, xor:int(ldc:int(516), ldc:int(517))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(4194304)), ldc:int(0))) {
            var_3_5FD = and:int(var_3_5FD:int, ldc:int(-1654024975))
            goto(Label_0106)
        }
    }
}
