public class \ub113\uc4d2\u183a\u527a\u6435.\uc3e3\u5f50\u5bc4\ud217\u97e6.\uff55\u983f\u3e75\uc3e3\uf94d\u7330 {
    public void \uff55\u983f\u3e75\uc3e3\uf94d\u7330() {
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
            invokespecial:\u52d3\ucfaf\ub8be\ub83f\u3a62\u71ae(\u52d3\ucfaf\ub8be\ub83f\u3a62\u71ae::<init>, this:\uff55\u983f\u3e75\uc3e3\uf94d\u7330, ldc:String("Item"))
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
            invokevirtual:void(\u7d52\u69d9\uae87\ud4fe\uc910\u3e2a::\ub6ab\ub102\u0800\u965f\u12b2\u8413, var_5_77:\u7d52\u69d9\uae87\ud4fe\uc910\u3e2a, invokevirtual:short(ByteBuf::readShort, p0:ByteBuf))
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
            var_3_5F = and:int(ldc:int(1545711738), ldc:int(1579137661))
            
            if (cmpne:boolean(p1:\u7d52\u69d9\uae87\ud4fe\uc910\u3e2a, aconstnull:\u7d52\u69d9\uae87\ud4fe\uc910\u3e2a())) {
                var_3_5F = and:int(var_3_5F:int, ldc:int(1471765721))
                invokevirtual:ByteBuf(ByteBuf::writeShort, p0:ByteBuf, invokevirtual:int(\u7d52\u69d9\uae87\ud4fe\uc910\u3e2a::\u8350\u156b\u6fb0\u3e75\u4cd9\uf94d, p1:\u7d52\u69d9\uae87\ud4fe\uc910\u3e2a))
                invokevirtual:ByteBuf(ByteBuf::writeByte, p0:ByteBuf, invokevirtual:byte[expected:int](\u7d52\u69d9\uae87\ud4fe\uc910\u3e2a::\ubf56\u1187\u6b5f\u6435\u67e9\u3711, p1:\u7d52\u69d9\uae87\ud4fe\uc910\u3e2a))
                invokevirtual:ByteBuf(ByteBuf::writeShort, p0:ByteBuf, invokevirtual:short[expected:int](\u7d52\u69d9\uae87\ud4fe\uc910\u3e2a::\ub32d\ub18d\ub18d\ufcaf\u76bc\u9af2, p1:\u7d52\u69d9\uae87\ud4fe\uc910\u3e2a))
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
            return:Object(invokevirtual:\u7d52\u69d9\uae87\ud4fe\uc910\u3e2a[expected:Object](\uff55\u983f\u3e75\uc3e3\uf94d\u7330::\u4d85\uff55\uc3e3\ud4fe\u9937\uc229, this:\uff55\u983f\u3e75\uc3e3\uf94d\u7330, p0:ByteBuf))
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
            invokevirtual:void(\uff55\u983f\u3e75\uc3e3\uf94d\u7330::\ud171\uc229\ufe34\u36d3\u5f50\uc2e8, this:\uff55\u983f\u3e75\uc3e3\uf94d\u7330, p0:ByteBuf, checkcast:\u7d52\u69d9\uae87\ud4fe\uc910\u3e2a(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u7d52\u69d9\uae87\ud4fe\uc910\u3e2a.class, p1:Object[expected:\u7d52\u69d9\uae87\ud4fe\uc910\u3e2a]))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u8cae\u5f50\u3e75\uceb8\u873d\ua3b4(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_5D3 : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_5DE : int
        
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
        var_3_5D3 = and:int(ldc:int(1369253013), ldc:int(-203804847))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\uff55\u983f\u3e75\uc3e3\uf94d\u7330[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_5D3:int, ldc:int(268435456)), ldc:int(0))) {
            var_3_5D3 = and:int(var_3_5D3:int, ldc:int(1396382779))
        }
        else {
            var_3_5D3 = and:int(var_3_5D3:int, ldc:int(1035398819))
            var_5_85 = and:int(ldc:int(-2137), ldc:int(2136))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(21510), ldc:int(-21511)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_5D3:int, ldc:int(-1315655871))
                    var_9_C1 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_8C:int, and:int(ldc:int(18817), ldc:int(8291)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, xor:int(ldc:int(1059), ldc:int(1058)))), var_7_9B:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_5D3 = and:int(var_3_D2:int, ldc:int(-1208732419))
                    var_14_10D = var_7_9B:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), and:int(ldc:int(2895), ldc:int(5249)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_8C:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_5D3:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1378)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D3:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_5D3 = and:int(var_3_5D3:int, ldc:int(612380844))
                        goto(Label_1244)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D3:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_5D3 = and:int(var_3_5D3:int, ldc:int(-532906028))
                        goto(Label_1106)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D3:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1003)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D3:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0873)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D3:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0770)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D3:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_5D3 = and:int(var_3_5D3:int, ldc:int(-151492294))
                        goto(Label_0660)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D3:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_5D3 = and:int(var_3_5D3:int, ldc:int(-2030489528))
                        goto(Label_0533)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D3:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_5D3 = and:int(var_3_5D3:int, ldc:int(-508390117))
                    }
                    else {
                        var_3_5D3 = and:int(var_3_5D3:int, ldc:int(2011152143))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0533)
                            }
                            
                            goto(Label_0770)
                        }
                    }
                    
                    Label_0397:
                    
                    if (cmpeq:boolean(and:int(var_3_5D3:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1378)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D3:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1244)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D3:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1106)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D3:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1003)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D3:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0873)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D3:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_5D3 = and:int(var_3_5D3:int, ldc:int(-742007603))
                        goto(Label_0770)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D3:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0660)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D3:int, ldc:int(64)), ldc:int(0))) {
                        var_3_5D3 = and:int(var_3_5D3:int, ldc:int(-738536913))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5D3:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_5D3 = and:int(var_3_5D3:int, ldc:int(-1846499735))
                            var_11_E3 = and:int(ldc:int(-22474), ldc:int(21961))
                            goto(Label_1367)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0533:
                    
                    if (cmpeq:boolean(and:int(var_3_5D3:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1378)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D3:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1244)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D3:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_5D3 = and:int(var_3_5D3:int, ldc:int(-2084423654))
                        goto(Label_1106)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D3:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_5D3 = and:int(var_3_5D3:int, ldc:int(73280578))
                        goto(Label_1003)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D3:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5D3 = and:int(var_3_5D3:int, ldc:int(772642321))
                        goto(Label_0873)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D3:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0770)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D3:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_5D3 = and:int(var_3_5D3:int, ldc:int(615656674))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5D3:int, ldc:int(256)), ldc:int(0))) {
                            var_3_5D3 = and:int(var_3_5D3:int, ldc:int(2088510471))
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5D3:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_5D3 = and:int(var_3_5D3:int, ldc:int(440575239))
                            loopcontinue()
                        }
                        
                        var_3_5D3 = and:int(var_3_5D3:int, ldc:int(-1108169125))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0770)
                        }
                    }
                    
                    Label_0660:
                    
                    if (cmpne:boolean(and:int(var_3_5D3:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1378)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D3:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_5D3 = and:int(var_3_5D3:int, ldc:int(1231962340))
                        goto(Label_1244)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D3:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1106)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D3:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1003)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D3:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0873)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D3:int, ldc:int(1048576)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5D3:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_5D3 = and:int(var_3_5D3:int, ldc:int(586958493))
                            goto(Label_0533)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5D3:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_5D3 = and:int(var_3_5D3:int, ldc:int(1402875759))
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5D3:int, ldc:int(256)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5D3 = and:int(var_3_5D3:int, ldc:int(-1107984525))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0770:
                    
                    if (cmpne:boolean(and:int(var_3_5D3:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1378)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D3:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1244)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D3:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1106)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D3:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_5D3 = and:int(var_3_5D3:int, ldc:int(-644932146))
                        goto(Label_1003)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D3:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_5D3 = and:int(var_3_5D3:int, ldc:int(-683815333))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5D3:int, ldc:int(1)), ldc:int(0))) {
                            var_3_5D3 = and:int(var_3_5D3:int, ldc:int(143656137))
                            goto(Label_0660)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5D3:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0533)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5D3:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5D3:int, ldc:int(2048)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5D3 = and:int(var_3_5D3:int, ldc:int(-208034629))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_E3 = and:int(ldc:int(4413), ldc:int(9219))
                                goto(Label_1003)
                            }
                        }
                    }
                    
                    Label_0873:
                    
                    if (cmpne:boolean(and:int(var_3_5D3:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1378)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D3:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1244)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D3:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1106)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D3:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5D3:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0770)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5D3:int, ldc:int(64)), ldc:int(0))) {
                            var_3_5D3 = and:int(var_3_5D3:int, ldc:int(2005970192))
                            goto(Label_0660)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5D3:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0533)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5D3:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_5D3 = and:int(var_3_5D3:int, ldc:int(1700096632))
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5D3:int, ldc:int(16777216)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5D3 = and:int(var_3_5D3:int, ldc:int(364849017))
                        var_11_E3 = and:int(ldc:int(6676), ldc:int(-6677))
                    }
                    
                    Label_1003:
                    
                    if (cmpeq:boolean(and:int(var_3_5D3:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1378)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D3:int, ldc:int(256)), ldc:int(0))) {
                        var_3_5D3 = and:int(var_3_5D3:int, ldc:int(-1407457080))
                        goto(Label_1244)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D3:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_5D3 = and:int(var_3_5D3:int, ldc:int(-889263485))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5D3:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0873)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5D3:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0770)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5D3:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0660)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5D3:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_5D3 = and:int(var_3_5D3:int, ldc:int(-650712859))
                            goto(Label_0533)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5D3:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5D3:int, ldc:int(131072)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5D3 = and:int(var_3_5D3:int, ldc:int(1406186507))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1244)
                            }
                        }
                    }
                    
                    Label_1106:
                    
                    if (cmpne:boolean(and:int(var_3_5D3:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_5D3 = and:int(var_3_5D3:int, ldc:int(1541241787))
                        goto(Label_1378)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D3:int, ldc:int(8388608)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5D3:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_1003)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5D3:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0873)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5D3:int, ldc:int(64)), ldc:int(0))) {
                            var_3_5D3 = and:int(var_3_5D3:int, ldc:int(152221545))
                            goto(Label_0770)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5D3:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_5D3 = and:int(var_3_5D3:int, ldc:int(495869363))
                            goto(Label_0660)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5D3:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_5D3 = and:int(var_3_5D3:int, ldc:int(-896356521))
                            goto(Label_0533)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5D3:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_5D3 = and:int(var_3_5D3:int, ldc:int(1822893221))
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5D3:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_5D3 = and:int(var_3_5D3:int, ldc:int(1339568765))
                            loopcontinue()
                        }
                        
                        var_3_5D3 = and:int(var_3_5D3:int, ldc:int(2109619225))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_85:int, var_16_111:int)
                        goto(Label_1367)
                    }
                    
                    Label_1244:
                    
                    if (cmpne:boolean(and:int(var_3_5D3:int, ldc:int(64)), ldc:int(0))) {
                        var_3_5D3 = and:int(var_3_5D3:int, ldc:int(1006278239))
                        goto(Label_1378)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D3:int, ldc:int(256)), ldc:int(0))) {
                        var_3_5D3 = and:int(var_3_5D3:int, ldc:int(903908847))
                        goto(Label_1106)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D3:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_5D3 = and:int(var_3_5D3:int, ldc:int(1944351775))
                        goto(Label_1003)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D3:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0873)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D3:int, ldc:int(256)), ldc:int(0))) {
                        var_3_5D3 = and:int(var_3_5D3:int, ldc:int(1519053692))
                        goto(Label_0770)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D3:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0660)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D3:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0533)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D3:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0397)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D3:int, ldc:int(1)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_5D3 = and:int(var_3_5D3:int, ldc:int(396049473))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1367:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_5DE = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1378:
                    
                    if (cmpne:boolean(and:int(var_3_5D3:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1244)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D3:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5D3 = and:int(var_3_5D3:int, ldc:int(-1150313151))
                        goto(Label_1106)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D3:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_5D3 = and:int(var_3_5D3:int, ldc:int(-564042221))
                        goto(Label_1003)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D3:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_5D3 = and:int(var_3_5D3:int, ldc:int(-498827434))
                        goto(Label_0873)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D3:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_5D3 = and:int(var_3_5D3:int, ldc:int(-999764582))
                        goto(Label_0770)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D3:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5D3 = and:int(var_3_5D3:int, ldc:int(743404762))
                        goto(Label_0660)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D3:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0533)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D3:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0397)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D3:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_5D3 = and:int(var_3_5D3:int, ldc:int(1442053393))
                        var_17_5DE = add:int(var_16_111:int, and:int(ldc:int(5221), ldc:int(2049)))
                        looporswitchbreak()
                    }
                }
                
                var_3_5D3 = and:int(var_3_5D3:int, ldc:int(-709870281))
                
                if (cmple:boolean(var_5_85 = var_17_5DE:int, sub:int(var_6_8C:int, xor:int(ldc:int(1224), ldc:int(1225))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpne:boolean(and:int(var_3_5D3:int, ldc:int(1)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
