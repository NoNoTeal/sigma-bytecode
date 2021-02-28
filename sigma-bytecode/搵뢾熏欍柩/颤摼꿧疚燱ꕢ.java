public class \u6435\ub8be\u718f\u6b0d\u67e9.\u98a4\u647c\uafe7\u759a\u71f1\ua562 {
    public void \u98a4\u647c\uafe7\u759a\u71f1\ua562() {
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
            invokespecial:\u1833\ud171\u8350\ubded\u34df\uc9f6(\u1833\ud171\u8350\ubded\u34df\uc9f6::<init>, this:\u98a4\u647c\uafe7\u759a\u71f1\ua562, ldc:Class<\u7330\ub1b9\u7330\ud7e8\u4cd9\uc29a>(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u7330\ub1b9\u7330\ud7e8\u4cd9\uc29a.class))
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
            return:\u7330\ub1b9\u7330\ud7e8\u4cd9\uc29a(checkcast:\u7330\ub1b9\u7330\ud7e8\u4cd9\uc29a(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u7330\ub1b9\u7330\ud7e8\u4cd9\uc29a.class, invokevirtual:\u7330\ub1b9\u7330\ud7e8\u4cd9\uc29a(\u8389\u494c\u527a\u8753\ub1b9\u8640<\u7330\ub1b9\u7330\ud7e8\u4cd9\uc29a>::\u4d85\uff55\uc3e3\ud4fe\u9937\uc229, getstatic:\u1833\ud171\u8350\ubded\u34df\uc9f6<\u7330\ub1b9\u7330\ud7e8\u4cd9\uc29a>[expected:\u8389\u494c\u527a\u8753\ub1b9\u8640<\u7330\ub1b9\u7330\ud7e8\u4cd9\uc29a>](\u1833\ud171\u8350\ubded\u34df\uc9f6::\u3d64\u16f6\u8413\u7bad\u7330\uae5d), p0:ByteBuf)))
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
            var_3_5F = and:int(ldc:int(24607422), ldc:int(190280318))
            
            if (cmpeq:boolean(p1:\u7330\ub1b9\u7330\ud7e8\u4cd9\uc29a, aconstnull:\u7330\ub1b9\u7330\ud7e8\u4cd9\uc29a())) {
                var_3_5F = and:int(var_3_5F:int, ldc:int(1035466493))
                stack_84_1 = and:int[expected:boolean](ldc:int(9007), ldc:int(-25408))
            }
            else {
                stack_84_1 = xor:int[expected:boolean](ldc:int(-31744), ldc:int(-31743))
            }
            
            invokevirtual:ByteBuf(ByteBuf::writeBoolean, p0:ByteBuf, stack_84_1:boolean)
            
            if (cmpne:boolean(p1:\u7330\ub1b9\u7330\ud7e8\u4cd9\uc29a, aconstnull:\u7330\ub1b9\u7330\ud7e8\u4cd9\uc29a())) {
                invokevirtual:void(\ua3b4\ub1b9\u9af2\u3d64\uf94d\u3dd3<\u7330\ub1b9\u7330\ud7e8\u4cd9\uc29a>::\ud171\uc229\ufe34\u36d3\u5f50\uc2e8, getstatic:\u1833\ud171\u8350\ubded\u34df\uc9f6<\u7330\ub1b9\u7330\ud7e8\u4cd9\uc29a>[expected:\ua3b4\ub1b9\u9af2\u3d64\uf94d\u3dd3<\u7330\ub1b9\u7330\ud7e8\u4cd9\uc29a>](\u1833\ud171\u8350\ubded\u34df\uc9f6::\u3d64\u16f6\u8413\u7bad\u7330\uae5d), p0:ByteBuf, p1:\u7330\ub1b9\u7330\ud7e8\u4cd9\uc29a)
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
            return:Object(invokevirtual:\u7330\ub1b9\u7330\ud7e8\u4cd9\uc29a[expected:Object](\u98a4\u647c\uafe7\u759a\u71f1\ua562::\u4d85\uff55\uc3e3\ud4fe\u9937\uc229, this:\u98a4\u647c\uafe7\u759a\u71f1\ua562, p0:ByteBuf))
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
            invokevirtual:void(\u98a4\u647c\uafe7\u759a\u71f1\ua562::\ud171\uc229\ufe34\u36d3\u5f50\uc2e8, this:\u98a4\u647c\uafe7\u759a\u71f1\ua562, p0:ByteBuf, checkcast:\u7330\ub1b9\u7330\ud7e8\u4cd9\uc29a(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u7330\ub1b9\u7330\ud7e8\u4cd9\uc29a.class, p1:Object[expected:\u7330\ub1b9\u7330\ud7e8\u4cd9\uc29a]))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u8cae\u5f50\u3e75\uceb8\u873d\ua3b4(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_615 : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C9 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_620 : int
        
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
        var_3_615 = and:int(ldc:int(1427447283), ldc:int(1292156915))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u98a4\u647c\uafe7\u759a\u71f1\ua562[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_615:int, ldc:int(512)), ldc:int(0))) {
            var_3_615 = and:int(var_3_615:int, ldc:int(1694746017))
        }
        else {
            var_3_615 = and:int(var_3_615:int, ldc:int(-519234585))
            var_5_85 = and:int(ldc:int(4853), ldc:int(-4854))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(8496), ldc:int(-8497)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_615:int, ldc:int(2036718581))
                    var_9_C9 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_8C:int, and:int(ldc:int(8261), ldc:int(4371)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, and:int(ldc:int(835), ldc:int(6153)))), var_7_9B:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_615 = and:int(var_3_DA:int, ldc:int(1595383288))
                    var_14_115 = var_7_9B:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), and:int(ldc:int(1025), ldc:int(12617)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_8C:int)) {
                        var_9_C9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1450)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1308)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(871861441))
                        goto(Label_1186)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(32)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(1048392759))
                        goto(Label_1067)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0905)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(1841506137))
                        goto(Label_0794)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(664615176))
                        goto(Label_0684)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0557)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(1439005676))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0557)
                            }
                            
                            goto(Label_0794)
                        }
                    }
                    
                    Label_0397:
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(64)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(223545284))
                        goto(Label_1450)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(64)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(2135926418))
                        goto(Label_1308)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1186)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(-1834051674))
                        goto(Label_1067)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(64)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(-1018769147))
                        goto(Label_0905)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0794)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0684)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(32)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(1427715541))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_615 = and:int(var_3_615:int, ldc:int(1501855076))
                            var_11_EB = and:int(ldc:int(-17940), ldc:int(17939))
                            goto(Label_1439)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0557:
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(1266065812))
                        goto(Label_1450)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1308)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1186)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(865306643))
                        goto(Label_1067)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(880654597))
                        goto(Label_0905)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(-677701316))
                        goto(Label_0794)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(1903281512))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(256)), ldc:int(0))) {
                            var_3_615 = and:int(var_3_615:int, ldc:int(2036986910))
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(32)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_615 = and:int(var_3_615:int, ldc:int(2110692344))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C9:double
                            goto(Label_0794)
                        }
                    }
                    
                    Label_0684:
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1450)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1308)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1186)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(854987454))
                        goto(Label_1067)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0905)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(32)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(1062437950))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_615:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0557)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_615:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_615 = and:int(var_3_615:int, ldc:int(-325814151))
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(2147483647)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_615 = and:int(var_3_615:int, ldc:int(1232469881))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C9:double, var_14_115:double))
                    }
                    
                    Label_0794:
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1450)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(805215349))
                        goto(Label_1308)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1186)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(-428941706))
                        goto(Label_1067)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(64)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_615:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_615 = and:int(var_3_615:int, ldc:int(-2105314099))
                            goto(Label_0684)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0557)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_615:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_615 = and:int(var_3_615:int, ldc:int(-770553526))
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_615:int, ldc:int(16384)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_615 = and:int(var_3_615:int, ldc:int(1643011041))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_EB = xor:int(ldc:int(3329), ldc:int(3328))
                                goto(Label_1067)
                            }
                        }
                    }
                    
                    Label_0905:
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(512)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(592398512))
                        goto(Label_1450)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1308)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(346086366))
                        goto(Label_1186)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(1069805567))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_615:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_615 = and:int(var_3_615:int, ldc:int(172170232))
                            goto(Label_0794)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0684)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_615:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0557)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_615 = and:int(var_3_615:int, ldc:int(1210131876))
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(256)), ldc:int(0))) {
                            var_3_615 = and:int(var_3_615:int, ldc:int(-2046590367))
                            loopcontinue()
                        }
                        
                        var_3_615 = and:int(var_3_615:int, ldc:int(1606842848))
                        var_11_EB = and:int(ldc:int(6736), ldc:int(-23130))
                    }
                    
                    Label_1067:
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(512)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(160934699))
                        goto(Label_1450)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(-1543473548))
                        goto(Label_1308)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(8192)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0905)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_615 = and:int(var_3_615:int, ldc:int(1492079478))
                            goto(Label_0794)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_615:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_615 = and:int(var_3_615:int, ldc:int(-771076913))
                            goto(Label_0684)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_615 = and:int(var_3_615:int, ldc:int(1821206356))
                            goto(Label_0557)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_615:int, ldc:int(131072)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_615 = and:int(var_3_615:int, ldc:int(1401190901))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1308)
                            }
                        }
                    }
                    
                    Label_1186:
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1450)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(256)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_615:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_615 = and:int(var_3_615:int, ldc:int(-11691190))
                            goto(Label_1067)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(256)), ldc:int(0))) {
                            var_3_615 = and:int(var_3_615:int, ldc:int(-452653836))
                            goto(Label_0905)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_615:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_615 = and:int(var_3_615:int, ldc:int(1939046055))
                            goto(Label_0794)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0684)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_615:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_615 = and:int(var_3_615:int, ldc:int(494064588))
                            goto(Label_0557)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_615:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_615:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_615 = and:int(var_3_615:int, ldc:int(-705414290))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_85:int, var_16_119:int)
                            goto(Label_1439)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1308:
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1450)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(256)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(-1358969876))
                        goto(Label_1186)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1067)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(32)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(-989014475))
                        goto(Label_0905)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0794)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(64)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(-653707850))
                        goto(Label_0684)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(1080898222))
                        goto(Label_0557)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0397)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(509533659))
                        loopcontinue()
                    }
                    
                    var_3_615 = and:int(var_3_615:int, ldc:int(-482419202))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1439:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_620 = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1450:
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(101681095))
                        goto(Label_1308)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(64)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(-241241027))
                        goto(Label_1186)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1067)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0905)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(1078897939))
                        goto(Label_0794)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(-1968122614))
                        goto(Label_0684)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(-49743260))
                        goto(Label_0557)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0397)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(2098199933))
                        var_17_620 = add:int(var_16_119:int, xor:int(ldc:int(2117), ldc:int(2116)))
                        looporswitchbreak()
                    }
                }
                
                var_3_615 = and:int(var_3_615:int, ldc:int(1133412192))
                
                if (cmple:boolean(var_5_85 = var_17_620:int, sub:int(var_6_8C:int, and:int(ldc:int(16641), ldc:int(587))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(16777216)), ldc:int(0))) {
            var_3_615 = and:int(var_3_615:int, ldc:int(-1490592518))
            goto(Label_0106)
        }
    }
}
