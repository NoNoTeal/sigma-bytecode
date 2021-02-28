public class \u12b2\u9a18\uc7fe\u4c2b\u6c52.\ufcaf\uae5d\u6bb9\u071d\u67e9\u76bc {
    public void \ufcaf\uae5d\u6bb9\u071d\u67e9\u76bc() {
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
            invokespecial:\u1833\ud171\u8350\ubded\u34df\uc9f6(\u1833\ud171\u8350\ubded\u34df\uc9f6::<init>, this:\ufcaf\uae5d\u6bb9\u071d\u67e9\u76bc, ldc:Class<\u7330\ub1b9\u7330\ud7e8\u4cd9\uc29a>(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u7330\ub1b9\u7330\ud7e8\u4cd9\uc29a.class))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u7330\ub1b9\u7330\ud7e8\u4cd9\uc29a \u4d85\uff55\uc3e3\ud4fe\u9937\uc229(io.netty.buffer.ByteBuf p0) {
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
        
        if (invokevirtual:boolean(ByteBuf::readBoolean, p0:ByteBuf)) {
            return:\u7330\ub1b9\u7330\ud7e8\u4cd9\uc29a(checkcast:\u7330\ub1b9\u7330\ud7e8\u4cd9\uc29a(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u7330\ub1b9\u7330\ud7e8\u4cd9\uc29a.class, invokevirtual:\u7330\ub1b9\u7330\ud7e8\u4cd9\uc29a(\u8389\u494c\u527a\u8753\ub1b9\u8640<\u7330\ub1b9\u7330\ud7e8\u4cd9\uc29a>::\u4d85\uff55\uc3e3\ud4fe\u9937\uc229, getstatic:\u1833\ud171\u8350\ubded\u34df\uc9f6<\u7330\ub1b9\u7330\ud7e8\u4cd9\uc29a>[expected:\u8389\u494c\u527a\u8753\ub1b9\u8640<\u7330\ub1b9\u7330\ud7e8\u4cd9\uc29a>](\u1833\ud171\u8350\ubded\u34df\uc9f6::\u624e\uceb8\u392e\ucfaf\uc2e8\u98a4), p0:ByteBuf)))
        }
        
        return:\u7330\ub1b9\u7330\ud7e8\u4cd9\uc29a(aconstnull:\u7330\ub1b9\u7330\ud7e8\u4cd9\uc29a())
    }
    
    public void \ud171\uc229\ufe34\u36d3\u5f50\uc2e8(io.netty.buffer.ByteBuf p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u7330\ub1b9\u7330\ud7e8\u4cd9\uc29a p1) {
        var_3_5F : int
        stack_84_1 : int [generated]
        
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
            var_3_5F = and:int(ldc:int(-872514286), ldc:int(-1612459526))
            
            if (cmpeq:boolean(p1:\u7330\ub1b9\u7330\ud7e8\u4cd9\uc29a, aconstnull:\u7330\ub1b9\u7330\ud7e8\u4cd9\uc29a())) {
                var_3_5F = and:int(var_3_5F:int, ldc:int(-605920354))
                stack_84_1 = and:int[expected:boolean](ldc:int(-1274), ldc:int(217))
            }
            else {
                stack_84_1 = xor:int[expected:boolean](ldc:int(160), ldc:int(161))
            }
            
            invokevirtual:ByteBuf(ByteBuf::writeBoolean, p0:ByteBuf, stack_84_1:boolean)
            
            if (cmpne:boolean(p1:\u7330\ub1b9\u7330\ud7e8\u4cd9\uc29a, aconstnull:\u7330\ub1b9\u7330\ud7e8\u4cd9\uc29a())) {
                invokevirtual:void(\ua3b4\ub1b9\u9af2\u3d64\uf94d\u3dd3<\u7330\ub1b9\u7330\ud7e8\u4cd9\uc29a>::\ud171\uc229\ufe34\u36d3\u5f50\uc2e8, getstatic:\u1833\ud171\u8350\ubded\u34df\uc9f6<\u7330\ub1b9\u7330\ud7e8\u4cd9\uc29a>[expected:\ua3b4\ub1b9\u9af2\u3d64\uf94d\u3dd3<\u7330\ub1b9\u7330\ud7e8\u4cd9\uc29a>](\u1833\ud171\u8350\ubded\u34df\uc9f6::\u624e\uceb8\u392e\ucfaf\uc2e8\u98a4), p0:ByteBuf, p1:\u7330\ub1b9\u7330\ud7e8\u4cd9\uc29a)
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
            return:Object(invokevirtual:\u7330\ub1b9\u7330\ud7e8\u4cd9\uc29a[expected:Object](\ufcaf\uae5d\u6bb9\u071d\u67e9\u76bc::\u4d85\uff55\uc3e3\ud4fe\u9937\uc229, this:\ufcaf\uae5d\u6bb9\u071d\u67e9\u76bc, p0:ByteBuf))
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
            invokevirtual:void(\ufcaf\uae5d\u6bb9\u071d\u67e9\u76bc::\ud171\uc229\ufe34\u36d3\u5f50\uc2e8, this:\ufcaf\uae5d\u6bb9\u071d\u67e9\u76bc, p0:ByteBuf, checkcast:\u7330\ub1b9\u7330\ud7e8\u4cd9\uc29a(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u7330\ub1b9\u7330\ud7e8\u4cd9\uc29a.class, p1:Object[expected:\u7330\ub1b9\u7330\ud7e8\u4cd9\uc29a]))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u8cae\u5f50\u3e75\uceb8\u873d\ua3b4(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_62D : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
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
        var_3_62D = and:int(ldc:int(840246603), ldc:int(-726702001))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\ufcaf\uae5d\u6bb9\u071d\u67e9\u76bc[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(16)), ldc:int(0))) {
            var_3_62D = and:int(var_3_62D:int, ldc:int(469521198))
        }
        else {
            var_3_62D = and:int(var_3_62D:int, ldc:int(1291812091))
            var_5_85 = and:int(ldc:int(-1706), ldc:int(1705))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(21059), ldc:int(-21316)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_62D:int, ldc:int(-88114593))
                    var_9_C1 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_8C:int, and:int(ldc:int(4097), ldc:int(2913)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, xor:int(ldc:int(12298), ldc:int(12299)))), var_7_9B:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_62D = and:int(var_3_D2:int, ldc:int(-2025511729))
                    var_14_10D = var_7_9B:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), and:int(ldc:int(4609), ldc:int(1301)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_8C:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(161086369))
                        goto(Label_1490)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(2066342236))
                        goto(Label_1348)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1210)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1091)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(1)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(-2128164579))
                        goto(Label_0921)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0802)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(-757891813))
                        goto(Label_0676)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0541)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(1726804047))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0541)
                            }
                            
                            goto(Label_0802)
                        }
                    }
                    
                    Label_0389:
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(2)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(-2087176594))
                        goto(Label_1490)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1348)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1210)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1091)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0921)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(1372417883))
                        goto(Label_0802)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(1304679238))
                        goto(Label_0676)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(16)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(1961488341))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(64)), ldc:int(0))) {
                            var_3_62D = and:int(var_3_62D:int, ldc:int(75937535))
                            var_11_E3 = and:int(ldc:int(-9488), ldc:int(9487))
                            goto(Label_1479)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0541:
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(-1787508874))
                        goto(Label_1490)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(2068065432))
                        goto(Label_1348)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(1928617742))
                        goto(Label_1210)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1091)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(-1862937284))
                        goto(Label_0921)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0802)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(-573589635))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(1)), ldc:int(0))) {
                            var_3_62D = and:int(var_3_62D:int, ldc:int(-990241685))
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_62D = and:int(var_3_62D:int, ldc:int(706870505))
                            loopcontinue()
                        }
                        
                        var_3_62D = and:int(var_3_62D:int, ldc:int(-1761681153))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0802)
                        }
                    }
                    
                    Label_0676:
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1490)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1348)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(1580649676))
                        goto(Label_1210)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(16)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(-1667079814))
                        goto(Label_1091)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0921)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(286055109))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_62D = and:int(var_3_62D:int, ldc:int(1858388270))
                            goto(Label_0541)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_62D = and:int(var_3_62D:int, ldc:int(1637307841))
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(64)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_62D = and:int(var_3_62D:int, ldc:int(1254586991))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0802:
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(-1097717536))
                        goto(Label_1490)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1348)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(2)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(-1824362652))
                        goto(Label_1210)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1091)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(8)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(1)), ldc:int(0))) {
                            var_3_62D = and:int(var_3_62D:int, ldc:int(-1451148427))
                            goto(Label_0676)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_62D = and:int(var_3_62D:int, ldc:int(1205818920))
                            goto(Label_0541)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(64)), ldc:int(0))) {
                            var_3_62D = and:int(var_3_62D:int, ldc:int(1934543749))
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(2147483647)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_62D = and:int(var_3_62D:int, ldc:int(1816046043))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_E3 = xor:int(ldc:int(58), ldc:int(59))
                                goto(Label_1091)
                            }
                        }
                    }
                    
                    Label_0921:
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1490)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1348)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(8)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(-1928531019))
                        goto(Label_1210)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(1)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(-274932040))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_62D = and:int(var_3_62D:int, ldc:int(357898047))
                            goto(Label_0802)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(1)), ldc:int(0))) {
                            var_3_62D = and:int(var_3_62D:int, ldc:int(851994167))
                            goto(Label_0676)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(8)), ldc:int(0))) {
                            var_3_62D = and:int(var_3_62D:int, ldc:int(1858386773))
                            goto(Label_0541)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_62D = and:int(var_3_62D:int, ldc:int(2119146946))
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_62D = and:int(var_3_62D:int, ldc:int(-1537885790))
                            loopcontinue()
                        }
                        
                        var_3_62D = and:int(var_3_62D:int, ldc:int(306116939))
                        var_11_E3 = and:int(ldc:int(22088), ldc:int(-24265))
                    }
                    
                    Label_1091:
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1490)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(1959125785))
                        goto(Label_1348)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(1277800676))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0921)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(2)), ldc:int(0))) {
                            var_3_62D = and:int(var_3_62D:int, ldc:int(1064821969))
                            goto(Label_0802)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0676)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0541)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_62D = and:int(var_3_62D:int, ldc:int(1648874655))
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_62D = and:int(var_3_62D:int, ldc:int(1199664858))
                            loopcontinue()
                        }
                        
                        var_3_62D = and:int(var_3_62D:int, ldc:int(-478270481))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1348)
                            }
                        }
                    }
                    
                    Label_1210:
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(1963194991))
                        goto(Label_1490)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(2)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(-1733337142))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_1091)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_62D = and:int(var_3_62D:int, ldc:int(357774173))
                            goto(Label_0921)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(64)), ldc:int(0))) {
                            var_3_62D = and:int(var_3_62D:int, ldc:int(-2052984465))
                            goto(Label_0802)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_62D = and:int(var_3_62D:int, ldc:int(1057459238))
                            goto(Label_0676)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0541)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_62D = and:int(var_3_62D:int, ldc:int(-482833018))
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_62D = and:int(var_3_62D:int, ldc:int(1289600751))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_85:int, var_16_111:int)
                            goto(Label_1479)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1348:
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(460768897))
                        goto(Label_1490)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(8)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(-393024034))
                        goto(Label_1210)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(16)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(1220467016))
                        goto(Label_1091)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(-180026748))
                        goto(Label_0921)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(-1598248683))
                        goto(Label_0802)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0676)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0541)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0389)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(524288)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_62D = and:int(var_3_62D:int, ldc:int(653553483))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1479:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_638 = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1490:
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1348)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(2)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(-1532871498))
                        goto(Label_1210)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1091)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(-404132160))
                        goto(Label_0921)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0802)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(-134763544))
                        goto(Label_0676)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0541)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0389)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(173385931))
                        var_17_638 = add:int(var_16_111:int, and:int(ldc:int(16897), ldc:int(9337)))
                        looporswitchbreak()
                    }
                }
                
                var_3_62D = and:int(var_3_62D:int, ldc:int(-693847813))
                
                if (cmple:boolean(var_5_85 = var_17_638:int, sub:int(var_6_8C:int, xor:int(ldc:int(4242), ldc:int(4243))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(134217728)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
