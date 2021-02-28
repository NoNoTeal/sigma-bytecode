public class \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u7873\u6ec6\ufe34\u64f2\u0a06\u0800 {
    public void \u7873\u6ec6\ufe34\u64f2\u0a06\u0800() {
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
            invokespecial:\u52d3\ucfaf\ub8be\ub83f\u3a62\u71ae(\u52d3\ucfaf\ub8be\ub83f\u3a62\u71ae::<init>, this:\u7873\u6ec6\ufe34\u64f2\u0a06\u0800, ldc:String("FlatItem"))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public \u3bc9\u67e9\uc87f\u47c2\u5f50.\u7d52\u69d9\uae87\ud4fe\uc910\u3e2a \u4d85\uff55\uc3e3\ud4fe\u9937\uc229(io.netty.buffer.ByteBuf p0) {
        var_4_64 : short
        var_5_77 : \u7d52\u69d9\uae87\ud4fe\uc910\u3e2a
        
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
        var_4_64 = invokevirtual:short(ByteBuf::readShort, p0:ByteBuf)
        
        if (cmpge:boolean(var_4_64:short, ldc:short(0))) {
            var_5_77 = initobject:\u7d52\u69d9\uae87\ud4fe\uc910\u3e2a(\u7d52\u69d9\uae87\ud4fe\uc910\u3e2a::<init>)
            invokevirtual:void(\u7d52\u69d9\uae87\ud4fe\uc910\u3e2a::\u7ce1\u8d90\uc2e8\u5fe1\u3d64\ufcaf, var_5_77:\u7d52\u69d9\uae87\ud4fe\uc910\u3e2a, var_4_64:short[expected:int])
            invokevirtual:void(\u7d52\u69d9\uae87\ud4fe\uc910\u3e2a::\u97b7\u8640\u3a62\u7af6\u5d20\uafe7, var_5_77:\u7d52\u69d9\uae87\ud4fe\uc910\u3e2a, invokevirtual:byte(ByteBuf::readByte, p0:ByteBuf))
            invokevirtual:void(\u7d52\u69d9\uae87\ud4fe\uc910\u3e2a::\u5bc4\u647c\u61a4\uc31c\u71ae\u3e2a, var_5_77:\u7d52\u69d9\uae87\ud4fe\uc910\u3e2a, checkcast:\ub83f\u6c52\u12cb\u3c25\u3776(\u51b2\u6fb0\ufcaf\u61a4\u0800.\uc7fe\ua61f\ub18d\u64ab\u4f4a.\ub83f\u6c52\u12cb\u3c25\u3776.class, invokevirtual:\ub83f\u6c52\u12cb\u3c25\u3776(\u8389\u494c\u527a\u8753\ub1b9\u8640<\ub83f\u6c52\u12cb\u3c25\u3776>::\u4d85\uff55\uc3e3\ud4fe\u9937\uc229, getstatic:\u1833\ud171\u8350\ubded\u34df\uc9f6<\ub83f\u6c52\u12cb\u3c25\u3776>[expected:\u8389\u494c\u527a\u8753\ub1b9\u8640<\ub83f\u6c52\u12cb\u3c25\u3776>](\u1833\ud171\u8350\ubded\u34df\uc9f6::\u3bc9\u5fe1\u4ab3\ub70c\u600f\u6fb0), p0:ByteBuf)))
            return:\u7d52\u69d9\uae87\ud4fe\uc910\u3e2a(var_5_77:\u7d52\u69d9\uae87\ud4fe\uc910\u3e2a)
        }
        
        return:\u7d52\u69d9\uae87\ud4fe\uc910\u3e2a(aconstnull:\u7d52\u69d9\uae87\ud4fe\uc910\u3e2a())
    }
    
    public void \ud171\uc229\ufe34\u36d3\u5f50\uc2e8(io.netty.buffer.ByteBuf p0, \u3bc9\u67e9\uc87f\u47c2\u5f50.\u7d52\u69d9\uae87\ud4fe\uc910\u3e2a p1) {
        var_3_5F : int
        
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
            var_3_5F = and:int(ldc:int(-744238781), ldc:int(-276299871))
            
            if (cmpne:boolean(p1:\u7d52\u69d9\uae87\ud4fe\uc910\u3e2a, aconstnull:\u7d52\u69d9\uae87\ud4fe\uc910\u3e2a())) {
                var_3_5F = and:int(var_3_5F:int, ldc:int(1676405929))
                invokevirtual:ByteBuf(ByteBuf::writeShort, p0:ByteBuf, invokevirtual:int(\u7d52\u69d9\uae87\ud4fe\uc910\u3e2a::\u8350\u156b\u6fb0\u3e75\u4cd9\uf94d, p1:\u7d52\u69d9\uae87\ud4fe\uc910\u3e2a))
                invokevirtual:ByteBuf(ByteBuf::writeByte, p0:ByteBuf, invokevirtual:byte[expected:int](\u7d52\u69d9\uae87\ud4fe\uc910\u3e2a::\ubf56\u1187\u6b5f\u6435\u67e9\u3711, p1:\u7d52\u69d9\uae87\ud4fe\uc910\u3e2a))
                invokevirtual:void(\ua3b4\ub1b9\u9af2\u3d64\uf94d\u3dd3<\ub83f\u6c52\u12cb\u3c25\u3776>::\ud171\uc229\ufe34\u36d3\u5f50\uc2e8, getstatic:\u1833\ud171\u8350\ubded\u34df\uc9f6<\ub83f\u6c52\u12cb\u3c25\u3776>[expected:\ua3b4\ub1b9\u9af2\u3d64\uf94d\u3dd3<\ub83f\u6c52\u12cb\u3c25\u3776>](\u1833\ud171\u8350\ubded\u34df\uc9f6::\u3bc9\u5fe1\u4ab3\ub70c\u600f\u6fb0), p0:ByteBuf, invokevirtual:\ub83f\u6c52\u12cb\u3c25\u3776(\u7d52\u69d9\uae87\ud4fe\uc910\u3e2a::\u7006\u3bc9\u7c6b\u416d\u64ab\ubf56, p1:\u7d52\u69d9\uae87\ud4fe\uc910\u3e2a))
            }
            else {
                invokevirtual:ByteBuf(ByteBuf::writeShort, p0:ByteBuf, ldc:int(-1))
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
            return:Object(invokevirtual:\u7d52\u69d9\uae87\ud4fe\uc910\u3e2a[expected:Object](\u7873\u6ec6\ufe34\u64f2\u0a06\u0800::\u4d85\uff55\uc3e3\ud4fe\u9937\uc229, this:\u7873\u6ec6\ufe34\u64f2\u0a06\u0800, p0:ByteBuf))
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
            invokevirtual:void(\u7873\u6ec6\ufe34\u64f2\u0a06\u0800::\ud171\uc229\ufe34\u36d3\u5f50\uc2e8, this:\u7873\u6ec6\ufe34\u64f2\u0a06\u0800, p0:ByteBuf, checkcast:\u7d52\u69d9\uae87\ud4fe\uc910\u3e2a(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u7d52\u69d9\uae87\ud4fe\uc910\u3e2a.class, p1:Object[expected:\u7d52\u69d9\uae87\ud4fe\uc910\u3e2a]))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u8cae\u5f50\u3e75\uceb8\u873d\ua3b4(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_636 : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C9 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_641 : int
        
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
        var_3_636 = and:int(ldc:int(-212176305), ldc:int(-144556337))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u7873\u6ec6\ufe34\u64f2\u0a06\u0800[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(2147483647)), ldc:int(0))) {
            var_3_636 = and:int(var_3_636:int, ldc:int(-907401117))
        }
        else {
            var_3_636 = and:int(var_3_636:int, ldc:int(-1318439313))
            var_5_85 = and:int(ldc:int(5022), ldc:int(-7104))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-17110), ldc:int(17093)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_636:int, ldc:int(-1304201657))
                    var_9_C9 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_8C:int, xor:int(ldc:int(4355), ldc:int(4354)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, and:int(ldc:int(1), ldc:int(67)))), var_7_9B:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_636 = and:int(var_3_DA:int, ldc:int(-51150889))
                    var_14_115 = var_7_9B:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), and:int(ldc:int(4103), ldc:int(529)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_8C:int)) {
                        var_9_C9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_636 = and:int(var_3_636:int, ldc:int(2047150204))
                        goto(Label_1486)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1356)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_636 = and:int(var_3_636:int, ldc:int(-425929486))
                        goto(Label_1218)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(64)), ldc:int(0))) {
                        var_3_636 = and:int(var_3_636:int, ldc:int(-726037942))
                        goto(Label_1107)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(512)), ldc:int(0))) {
                        var_3_636 = and:int(var_3_636:int, ldc:int(90586680))
                        goto(Label_0961)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_636 = and:int(var_3_636:int, ldc:int(-1911313931))
                        goto(Label_0850)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_636 = and:int(var_3_636:int, ldc:int(-254225026))
                        goto(Label_0724)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_636:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_636 = and:int(var_3_636:int, ldc:int(1299049393))
                        goto(Label_0597)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(32)), ldc:int(0))) {
                        var_3_636 = and:int(var_3_636:int, ldc:int(-203983897))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0597)
                            }
                            
                            goto(Label_0850)
                        }
                    }
                    
                    Label_0421:
                    
                    if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(64)), ldc:int(0))) {
                        var_3_636 = and:int(var_3_636:int, ldc:int(-566466575))
                        goto(Label_1486)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_636 = and:int(var_3_636:int, ldc:int(594532139))
                        goto(Label_1356)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_636 = and:int(var_3_636:int, ldc:int(-1527420786))
                        goto(Label_1218)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(1)), ldc:int(0))) {
                        var_3_636 = and:int(var_3_636:int, ldc:int(-1994028805))
                        goto(Label_1107)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_636:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0961)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_636 = and:int(var_3_636:int, ldc:int(97356759))
                        goto(Label_0850)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_636:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_636 = and:int(var_3_636:int, ldc:int(1993847061))
                        goto(Label_0724)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_636:int, ldc:int(1)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_636:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_636 = and:int(var_3_636:int, ldc:int(126496488))
                            loopcontinue()
                        }
                        
                        var_3_636 = and:int(var_3_636:int, ldc:int(-1287047297))
                        var_11_EB = and:int(ldc:int(-32590), ldc:int(30537))
                        goto(Label_1475)
                    }
                    
                    Label_0597:
                    
                    if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(4)), ldc:int(0))) {
                        var_3_636 = and:int(var_3_636:int, ldc:int(-790481297))
                        goto(Label_1486)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_636:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1356)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1218)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_636:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_636 = and:int(var_3_636:int, ldc:int(1750968608))
                        goto(Label_1107)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0961)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_636 = and:int(var_3_636:int, ldc:int(1125493628))
                        goto(Label_0850)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(2)), ldc:int(0))) {
                        var_3_636 = and:int(var_3_636:int, ldc:int(-53649084))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_636:int, ldc:int(32)), ldc:int(0))) {
                            var_3_636 = and:int(var_3_636:int, ldc:int(205423627))
                            goto(Label_0421)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_636 = and:int(var_3_636:int, ldc:int(310442272))
                            loopcontinue()
                        }
                        
                        var_3_636 = and:int(var_3_636:int, ldc:int(-134825233))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C9:double
                            goto(Label_0850)
                        }
                    }
                    
                    Label_0724:
                    
                    if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1486)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1356)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_636 = and:int(var_3_636:int, ldc:int(240983940))
                        goto(Label_1218)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1107)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0961)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_636:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_636 = and:int(var_3_636:int, ldc:int(1931617862))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(2)), ldc:int(0))) {
                            var_3_636 = and:int(var_3_636:int, ldc:int(155998498))
                            goto(Label_0597)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(512)), ldc:int(0))) {
                            var_3_636 = and:int(var_3_636:int, ldc:int(759353019))
                            goto(Label_0421)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_636 = and:int(var_3_636:int, ldc:int(1443298737))
                            loopcontinue()
                        }
                        
                        var_3_636 = and:int(var_3_636:int, ldc:int(-458905))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C9:double, var_14_115:double))
                    }
                    
                    Label_0850:
                    
                    if (cmpne:boolean(and:int(var_3_636:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1486)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1356)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_636:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1218)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_636:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_636 = and:int(var_3_636:int, ldc:int(-440856037))
                        goto(Label_1107)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_636:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_636 = and:int(var_3_636:int, ldc:int(-778267442))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_636:int, ldc:int(32)), ldc:int(0))) {
                            var_3_636 = and:int(var_3_636:int, ldc:int(1708228142))
                            goto(Label_0724)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_636:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_636 = and:int(var_3_636:int, ldc:int(-486694344))
                            goto(Label_0597)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0421)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(4)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_636 = and:int(var_3_636:int, ldc:int(-1134788737))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_EB = xor:int(ldc:int(384), ldc:int(385))
                                goto(Label_1107)
                            }
                        }
                    }
                    
                    Label_0961:
                    
                    if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1486)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_636:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_636 = and:int(var_3_636:int, ldc:int(-1781784120))
                        goto(Label_1356)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1218)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_636:int, ldc:int(256)), ldc:int(0))) {
                        var_3_636 = and:int(var_3_636:int, ldc:int(-1932100109))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_636:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0850)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0724)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_636:int, ldc:int(32)), ldc:int(0))) {
                            var_3_636 = and:int(var_3_636:int, ldc:int(497076670))
                            goto(Label_0597)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(4)), ldc:int(0))) {
                            var_3_636 = and:int(var_3_636:int, ldc:int(-1494610856))
                            goto(Label_0421)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(64)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_636 = and:int(var_3_636:int, ldc:int(-1077300241))
                        var_11_EB = and:int(ldc:int(10966), ldc:int(-16087))
                    }
                    
                    Label_1107:
                    
                    if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1486)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_636:int, ldc:int(256)), ldc:int(0))) {
                        var_3_636 = and:int(var_3_636:int, ldc:int(623225253))
                        goto(Label_1356)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(65536)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0961)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(64)), ldc:int(0))) {
                            var_3_636 = and:int(var_3_636:int, ldc:int(-468952493))
                            goto(Label_0850)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0724)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_636:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0597)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(1)), ldc:int(0))) {
                            var_3_636 = and:int(var_3_636:int, ldc:int(578273003))
                            goto(Label_0421)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_636 = and:int(var_3_636:int, ldc:int(-672176680))
                            loopcontinue()
                        }
                        
                        var_3_636 = and:int(var_3_636:int, ldc:int(-1127317937))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1356)
                            }
                        }
                    }
                    
                    Label_1218:
                    
                    if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_636 = and:int(var_3_636:int, ldc:int(-236404375))
                        goto(Label_1486)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_636:int, ldc:int(4096)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_636:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_636 = and:int(var_3_636:int, ldc:int(-401641453))
                            goto(Label_1107)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(1)), ldc:int(0))) {
                            var_3_636 = and:int(var_3_636:int, ldc:int(-614991719))
                            goto(Label_0961)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_636:int, ldc:int(32)), ldc:int(0))) {
                            var_3_636 = and:int(var_3_636:int, ldc:int(512902620))
                            goto(Label_0850)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0724)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0597)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_636:int, ldc:int(32)), ldc:int(0))) {
                            var_3_636 = and:int(var_3_636:int, ldc:int(-519806030))
                            goto(Label_0421)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(64)), ldc:int(0))) {
                            var_3_636 = and:int(var_3_636:int, ldc:int(-538242615))
                            loopcontinue()
                        }
                        
                        var_3_636 = and:int(var_3_636:int, ldc:int(-1084868017))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_85:int, var_16_119:int)
                        goto(Label_1475)
                    }
                    
                    Label_1356:
                    
                    if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_636 = and:int(var_3_636:int, ldc:int(1864168331))
                        goto(Label_1486)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_636:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1218)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_636:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_636 = and:int(var_3_636:int, ldc:int(2021729845))
                        goto(Label_1107)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_636:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_636 = and:int(var_3_636:int, ldc:int(-542658099))
                        goto(Label_0961)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0850)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0724)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0597)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0421)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(2)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_636 = and:int(var_3_636:int, ldc:int(-210748817))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1475:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_641 = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1486:
                    
                    if (cmpne:boolean(and:int(var_3_636:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1356)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1218)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_636 = and:int(var_3_636:int, ldc:int(-1719048383))
                        goto(Label_1107)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0961)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_636:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0850)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_636:int, ldc:int(32)), ldc:int(0))) {
                        var_3_636 = and:int(var_3_636:int, ldc:int(1069412991))
                        goto(Label_0724)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0597)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_636:int, ldc:int(32)), ldc:int(0))) {
                        var_3_636 = and:int(var_3_636:int, ldc:int(-488012730))
                        goto(Label_0421)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_636:int, ldc:int(4)), ldc:int(0))) {
                        var_3_636 = and:int(var_3_636:int, ldc:int(-1210387865))
                        var_17_641 = add:int(var_16_119:int, and:int(ldc:int(25633), ldc:int(259)))
                        looporswitchbreak()
                    }
                    
                    var_3_636 = and:int(var_3_636:int, ldc:int(-1371889353))
                }
                
                var_3_636 = and:int(var_3_636:int, ldc:int(-1124122897))
                
                if (cmple:boolean(var_5_85 = var_17_641:int, sub:int(var_6_8C:int, and:int(ldc:int(609), ldc:int(9361))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(536870912)), ldc:int(0))) {
            var_3_636 = and:int(var_3_636:int, ldc:int(-1405439933))
            goto(Label_0106)
        }
    }
}
