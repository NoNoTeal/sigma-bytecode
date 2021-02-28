public class \u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u836c\u67e9\u5d20\u5fe1\u7e3f.\ub171\u156b\uc2bd\u8350\u7006\uafe7 {
    public void \ub171\u156b\uc2bd\u8350\u7006\uafe7() {
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
            invokespecial:\u4492\uc229\u6cfe\u5fe1\u98a4\u8753(\u4492\uc229\u6cfe\u5fe1\u98a4\u8753::<init>, this:\ub171\u156b\uc2bd\u8350\u7006\uafe7, ldc:String("Item Array"))
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
            var_2_5F = and:int(ldc:int(636318060), ldc:int(-1384815747))
            var_4_67 = invokevirtual:short(\u98a4\u99f7\u6198\u7043\uff55\uc84e::\ua3b4\u5db4\u72f1\u8bb0\u5654\u3bc9, getstatic:\u98a4\u99f7\u6198\u7043\uff55\uc84e(\u1833\ud171\u8350\ubded\u34df\uc9f6::\uae5d\u760c\uc2bd\ucb79\ub18d\u7049), p0:ByteBuf)
            var_5_6E = newarray:\u7d52\u69d9\uae87\ud4fe\uc910\u3e2a[](\u3bc9\u67e9\uc87f\u47c2\u5f50.\u7d52\u69d9\uae87\ud4fe\uc910\u3e2a.class, var_4_67:short[expected:int])
            var_6_77 = and:int(ldc:int(-11914), ldc:int(9353))
            
            loop {
                var_2_5F = and:int(var_2_5F:int, ldc:int(754314620))
                
                if (cmpge:boolean(var_6_77:short, var_4_67:short)) {
                    looporswitchbreak()
                }
                
                storeelement:\u7d52\u69d9\uae87\ud4fe\uc910\u3e2a(var_5_6E:\u7d52\u69d9\uae87\ud4fe\uc910\u3e2a[], var_6_77:short[expected:int], checkcast:\u7d52\u69d9\uae87\ud4fe\uc910\u3e2a(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u7d52\u69d9\uae87\ud4fe\uc910\u3e2a.class, invokevirtual:\u7d52\u69d9\uae87\ud4fe\uc910\u3e2a(\u8389\u494c\u527a\u8753\ub1b9\u8640<\u7d52\u69d9\uae87\ud4fe\uc910\u3e2a>::\u4d85\uff55\uc3e3\ud4fe\u9937\uc229, getstatic:\u1833\ud171\u8350\ubded\u34df\uc9f6<\u7d52\u69d9\uae87\ud4fe\uc910\u3e2a>[expected:\u8389\u494c\u527a\u8753\ub1b9\u8640<\u7d52\u69d9\uae87\ud4fe\uc910\u3e2a>](\u1833\ud171\u8350\ubded\u34df\uc9f6::\u71ae\u5654\u6435\u6b5f\ubff1\uc238), p0:ByteBuf)))
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
            var_3_5F = and:int(ldc:int(1093219045), ldc:int(1466628348))
            invokevirtual:void(\u98a4\u99f7\u6198\u7043\uff55\uc84e::\ubded\ubefe\u8d90\u183a\u72f1\u8389, getstatic:\u98a4\u99f7\u6198\u7043\uff55\uc84e(\u1833\ud171\u8350\ubded\u34df\uc9f6::\uae5d\u760c\uc2bd\ucb79\ub18d\u7049), p0:ByteBuf, i2s:short(arraylength:int(p1:\u7d52\u69d9\uae87\ud4fe\uc910\u3e2a[])))
            var_6_70 = arraylength:int(p1:\u7d52\u69d9\uae87\ud4fe\uc910\u3e2a[])
            var_7_79 = and:int(ldc:int(-6361), ldc:int(6360))
            
            loop {
                var_3_5F = and:int(var_3_5F:int, ldc:int(-663121156))
                
                if (cmpge:boolean(var_7_79:int, var_6_70:int)) {
                    looporswitchbreak()
                }
                
                invokevirtual:void(\ua3b4\ub1b9\u9af2\u3d64\uf94d\u3dd3<\u7d52\u69d9\uae87\ud4fe\uc910\u3e2a>::\ud171\uc229\ufe34\u36d3\u5f50\uc2e8, getstatic:\u1833\ud171\u8350\ubded\u34df\uc9f6<\u7d52\u69d9\uae87\ud4fe\uc910\u3e2a>[expected:\ua3b4\ub1b9\u9af2\u3d64\uf94d\u3dd3<\u7d52\u69d9\uae87\ud4fe\uc910\u3e2a>](\u1833\ud171\u8350\ubded\u34df\uc9f6::\u71ae\u5654\u6435\u6b5f\ubff1\uc238), p0:ByteBuf, loadelement:\u7d52\u69d9\uae87\ud4fe\uc910\u3e2a(p1:\u7d52\u69d9\uae87\ud4fe\uc910\u3e2a[], var_7_79:int))
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
            return:Object(invokevirtual:\u7d52\u69d9\uae87\ud4fe\uc910\u3e2a[][expected:Object](\ub171\u156b\uc2bd\u8350\u7006\uafe7::\u4d85\uff55\uc3e3\ud4fe\u9937\uc229, this:\ub171\u156b\uc2bd\u8350\u7006\uafe7, p0:ByteBuf))
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
            invokevirtual:void(\ub171\u156b\uc2bd\u8350\u7006\uafe7::\ud171\uc229\ufe34\u36d3\u5f50\uc2e8, this:\ub171\u156b\uc2bd\u8350\u7006\uafe7, p0:ByteBuf, checkcast:\u7d52\u69d9\uae87\ud4fe\uc910\u3e2a[](\u3bc9\u67e9\uc87f\u47c2\u5f50.\u7d52\u69d9\uae87\ud4fe\uc910\u3e2a[].class, p1:Object[expected:\u7d52\u69d9\uae87\ud4fe\uc910\u3e2a[]]))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u8cae\u5f50\u3e75\uceb8\u873d\ua3b4(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_60D : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_618 : int
        
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
        var_3_60D = and:int(ldc:int(258348488), ldc:int(-1761184320))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\ub171\u156b\uc2bd\u8350\u7006\uafe7[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(1024)), ldc:int(0))) {
            var_3_60D = and:int(var_3_60D:int, ldc:int(830182685))
        }
        else {
            var_3_60D = and:int(var_3_60D:int, ldc:int(1731182049))
            var_5_85 = and:int(ldc:int(2457), ldc:int(-2458))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-25380), ldc:int(25379)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_60D:int, ldc:int(-416934458))
                    var_9_C1 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_8C:int, xor:int(ldc:int(-30702), ldc:int(-30701)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, xor:int(ldc:int(3360), ldc:int(3361)))), var_7_9B:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_60D = and:int(var_3_D2:int, ldc:int(-2020198413))
                    var_14_10D = var_7_9B:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), and:int(ldc:int(17351), ldc:int(4105)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_8C:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-1383080493))
                        goto(Label_1450)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1316)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(2)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-1154888260))
                        goto(Label_1170)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1067)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-479934065))
                        goto(Label_0905)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0786)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0660)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-577701216))
                        goto(Label_0549)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-545366564))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0549)
                            }
                            
                            goto(Label_0786)
                        }
                    }
                    
                    Label_0389:
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(128)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-910603209))
                        goto(Label_1450)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(893157742))
                        goto(Label_1316)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(128)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-501651797))
                        goto(Label_1170)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1067)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(512)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-98442800))
                        goto(Label_0905)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(1833954450))
                        goto(Label_0786)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0660)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(256)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(1608955886))
                            var_11_E3 = and:int(ldc:int(-15177), ldc:int(15168))
                            goto(Label_1439)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0549:
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1450)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-69803138))
                        goto(Label_1316)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1170)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1067)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0905)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0786)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(512)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-1535778808))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(281870796))
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(1440498349))
                            loopcontinue()
                        }
                        
                        var_3_60D = and:int(var_3_60D:int, ldc:int(1473732574))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0786)
                        }
                    }
                    
                    Label_0660:
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1450)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(2)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(13193942))
                        goto(Label_1316)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1170)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-1978277397))
                        goto(Label_1067)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0905)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-111114942))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(-1269410483))
                            goto(Label_0549)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(128)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(-1516614134))
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(131072)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-951648771))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0786:
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1450)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1316)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1170)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-1350861172))
                        goto(Label_1067)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(128)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-1163884897))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0660)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(-1770364627))
                            goto(Label_0549)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(1180295943))
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(512)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(-641679519))
                            loopcontinue()
                        }
                        
                        var_3_60D = and:int(var_3_60D:int, ldc:int(252131292))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_E3 = xor:int(ldc:int(-26112), ldc:int(-26111))
                                goto(Label_1067)
                            }
                        }
                    }
                    
                    Label_0905:
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1450)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-584135764))
                        goto(Label_1316)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-1079765414))
                        goto(Label_1170)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(128)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(2040030570))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(-1154781013))
                            goto(Label_0786)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0660)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(650843906))
                            goto(Label_0549)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(128)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(-445965913))
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(16777216)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_60D = and:int(var_3_60D:int, ldc:int(118420940))
                        var_11_E3 = and:int(ldc:int(4399), ldc:int(-4400))
                    }
                    
                    Label_1067:
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1450)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(512)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-1666335988))
                        goto(Label_1316)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(512)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(948079129))
                            goto(Label_0905)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0786)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(215392829))
                            goto(Label_0660)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0549)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(128)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_60D = and:int(var_3_60D:int, ldc:int(1870069714))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1316)
                            }
                        }
                    }
                    
                    Label_1170:
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1450)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-981089283))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(-748591881))
                            goto(Label_1067)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(-248309111))
                            goto(Label_0905)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0786)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(-1734721924))
                            goto(Label_0660)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(512)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(1169769639))
                            goto(Label_0549)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(256)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(910512082))
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(-1039278831))
                            loopcontinue()
                        }
                        
                        var_3_60D = and:int(var_3_60D:int, ldc:int(1071595000))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_85:int, var_16_111:int)
                        goto(Label_1439)
                    }
                    
                    Label_1316:
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1450)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1170)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-1279990406))
                        goto(Label_1067)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(407904102))
                        goto(Label_0905)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0786)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0660)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-620105799))
                        goto(Label_0549)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(2060512519))
                        goto(Label_0389)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(33554432)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_60D = and:int(var_3_60D:int, ldc:int(793728972))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1439:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_618 = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1450:
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(338697380))
                        goto(Label_1316)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1170)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1067)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0905)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0786)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-917189292))
                        goto(Label_0660)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0549)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-1002991968))
                        goto(Label_0389)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(256)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-1351122997))
                        var_17_618 = add:int(var_16_111:int, and:int(ldc:int(1033), ldc:int(6737)))
                        looporswitchbreak()
                    }
                    
                    var_3_60D = and:int(var_3_60D:int, ldc:int(-1836424274))
                }
                
                var_3_60D = and:int(var_3_60D:int, ldc:int(-954261517))
                
                if (cmple:boolean(var_5_85 = var_17_618:int, sub:int(var_6_8C:int, xor:int(ldc:int(2176), ldc:int(2177))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(262144)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
