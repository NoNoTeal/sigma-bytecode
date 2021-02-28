public class \ua562\ucb79\uc87f\u3dd3\ubcb0.\u9033\uc87f\u8df4\u836c\u8709\u92ee {
    public void \u9033\uc87f\u8df4\u836c\u8709\u92ee() {
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
            invokespecial:\u1833\ud171\u8350\ubded\u34df\uc9f6(\u1833\ud171\u8350\ubded\u34df\uc9f6::<init>, this:\u9033\uc87f\u8df4\u836c\u8709\u92ee, ldc:Class<\u7330\ub1b9\u7330\ud7e8\u4cd9\uc29a>(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u7330\ub1b9\u7330\ud7e8\u4cd9\uc29a.class))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u7330\ub1b9\u7330\ud7e8\u4cd9\uc29a \u4d85\uff55\uc3e3\ud4fe\u9937\uc229(io.netty.buffer.ByteBuf p0) {
        var_4_64 : long
        
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
            var_4_64 = invokevirtual:long(ByteBuf::readLong, p0:ByteBuf)
            return:\u7330\ub1b9\u7330\ud7e8\u4cd9\uc29a(initobject:\u7330\ub1b9\u7330\ud7e8\u4cd9\uc29a(\u7330\ub1b9\u7330\ud7e8\u4cd9\uc29a::<init>, l2i:int(shr:long(var_4_64:long, ldc:int(38))), i2s:short(l2i:int(and:long(shr:long(var_4_64:long, ldc:int(26)), ldc:long(4095L)))), l2i:int(shr:long(shl:long(var_4_64:long, ldc:int(38)), ldc:int(38)))))
        }
        
        goto(Label_0006)
    }
    
    public void \ud171\uc229\ufe34\u36d3\u5f50\uc2e8(io.netty.buffer.ByteBuf p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u7330\ub1b9\u7330\ud7e8\u4cd9\uc29a p1) {
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
            invokevirtual:ByteBuf(ByteBuf::writeLong, p0:ByteBuf, or:long(or:long(shl:long(and:long(i2l:long(invokevirtual:int(\u7330\ub1b9\u7330\ud7e8\u4cd9\uc29a::\u7043\u56bd\u12cb\u5654\u40a9\u3d64, p1:\u7330\ub1b9\u7330\ud7e8\u4cd9\uc29a)), ldc:long(67108863L)), ldc:int(38)), shl:long(and:long(i2l:long(invokevirtual:short[expected:int](\u7330\ub1b9\u7330\ud7e8\u4cd9\uc29a::\u7330\u97b7\u983f\u494c\u5f50\u8709, p1:\u7330\ub1b9\u7330\ud7e8\u4cd9\uc29a)), ldc:long(4095L)), ldc:int(26))), i2l:long(and:int(invokevirtual:int(\u7330\ub1b9\u7330\ud7e8\u4cd9\uc29a::\u9033\u9937\u516c\ub102\u1833\u7330, p1:\u7330\ub1b9\u7330\ud7e8\u4cd9\uc29a), ldc:int(67108863)))))
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
            return:Object(invokevirtual:\u7330\ub1b9\u7330\ud7e8\u4cd9\uc29a[expected:Object](\u9033\uc87f\u8df4\u836c\u8709\u92ee::\u4d85\uff55\uc3e3\ud4fe\u9937\uc229, this:\u9033\uc87f\u8df4\u836c\u8709\u92ee, p0:ByteBuf))
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
            invokevirtual:void(\u9033\uc87f\u8df4\u836c\u8709\u92ee::\ud171\uc229\ufe34\u36d3\u5f50\uc2e8, this:\u9033\uc87f\u8df4\u836c\u8709\u92ee, p0:ByteBuf, checkcast:\u7330\ub1b9\u7330\ud7e8\u4cd9\uc29a(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u7330\ub1b9\u7330\ud7e8\u4cd9\uc29a.class, p1:Object[expected:\u7330\ub1b9\u7330\ud7e8\u4cd9\uc29a]))
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
        var_3_62D = and:int(ldc:int(-182650112), ldc:int(-440612108))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u9033\uc87f\u8df4\u836c\u8709\u92ee[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(262144)), ldc:int(0))) {
            var_3_62D = and:int(var_3_62D:int, ldc:int(-1745488383))
        }
        else {
            var_3_62D = and:int(var_3_62D:int, ldc:int(-42116530))
            var_5_85 = and:int(ldc:int(-1256), ldc:int(1191))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-1033), ldc:int(1032)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_62D:int, ldc:int(-283648002))
                    var_9_C1 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_8C:int, xor:int(ldc:int(291), ldc:int(290)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, and:int(ldc:int(5121), ldc:int(24581)))), var_7_9B:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_62D = and:int(var_3_D2:int, ldc:int(-168335870))
                    var_14_10D = var_7_9B:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), xor:int(ldc:int(24576), ldc:int(24577)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_8C:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1482)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1324)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1186)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1075)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(2090285206))
                        goto(Label_0921)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(377228528))
                        goto(Label_0802)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(1444335244))
                        goto(Label_0668)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(-509187152))
                        goto(Label_0549)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(-147337434))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0549)
                            }
                            
                            goto(Label_0802)
                        }
                    }
                    
                    Label_0389:
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(512)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(1232487440))
                        goto(Label_1482)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1324)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1186)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(1726454804))
                        goto(Label_1075)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(-1088518777))
                        goto(Label_0921)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0802)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(-18907736))
                        goto(Label_0668)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(808958971))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_62D = and:int(var_3_62D:int, ldc:int(-147333343))
                            var_11_E3 = and:int(ldc:int(26819), ldc:int(-27076))
                            goto(Label_1471)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0549:
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1482)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(1948098979))
                        goto(Label_1324)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(1757285802))
                        goto(Label_1186)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(230902590))
                        goto(Label_1075)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0921)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(-2024348805))
                        goto(Label_0802)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(682422496))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(32)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_62D = and:int(var_3_62D:int, ldc:int(-279618606))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0802)
                        }
                    }
                    
                    Label_0668:
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(-956420677))
                        goto(Label_1482)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1324)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(1961220105))
                        goto(Label_1186)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(1324215053))
                        goto(Label_1075)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(63397663))
                        goto(Label_0921)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(1809502642))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0549)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(128)), ldc:int(0))) {
                            var_3_62D = and:int(var_3_62D:int, ldc:int(-1543909618))
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(2097152)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_62D = and:int(var_3_62D:int, ldc:int(-149527675))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0802:
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(-2046830670))
                        goto(Label_1482)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1324)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1186)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(-1791519238))
                        goto(Label_1075)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(536870912)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_62D = and:int(var_3_62D:int, ldc:int(2075518596))
                            goto(Label_0668)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_62D = and:int(var_3_62D:int, ldc:int(429146889))
                            goto(Label_0549)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_62D = and:int(var_3_62D:int, ldc:int(1183343499))
                            loopcontinue()
                        }
                        
                        var_3_62D = and:int(var_3_62D:int, ldc:int(-402697268))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_E3 = xor:int(ldc:int(16578), ldc:int(16579))
                                goto(Label_1075)
                            }
                        }
                    }
                    
                    Label_0921:
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1482)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1324)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1186)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(-1936482182))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_62D = and:int(var_3_62D:int, ldc:int(-1938969343))
                            goto(Label_0802)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0668)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(512)), ldc:int(0))) {
                            var_3_62D = and:int(var_3_62D:int, ldc:int(-824256909))
                            goto(Label_0549)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_62D = and:int(var_3_62D:int, ldc:int(1554760721))
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_62D = and:int(var_3_62D:int, ldc:int(1991137596))
                            loopcontinue()
                        }
                        
                        var_3_62D = and:int(var_3_62D:int, ldc:int(-270733773))
                        var_11_E3 = and:int(ldc:int(-3583), ldc:int(1406))
                    }
                    
                    Label_1075:
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(1085195680))
                        goto(Label_1482)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(-2084396539))
                        goto(Label_1324)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(-1279390649))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0921)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_62D = and:int(var_3_62D:int, ldc:int(-383430804))
                            goto(Label_0802)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0668)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0549)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(128)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_62D = and:int(var_3_62D:int, ldc:int(-311038258))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1324)
                            }
                        }
                    }
                    
                    Label_1186:
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1482)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(-93197208))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_1075)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(128)), ldc:int(0))) {
                            var_3_62D = and:int(var_3_62D:int, ldc:int(1496755023))
                            goto(Label_0921)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_62D = and:int(var_3_62D:int, ldc:int(-1262012852))
                            goto(Label_0802)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_62D = and:int(var_3_62D:int, ldc:int(900911390))
                            goto(Label_0668)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_62D = and:int(var_3_62D:int, ldc:int(2018718703))
                            goto(Label_0549)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_62D = and:int(var_3_62D:int, ldc:int(-687029770))
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_62D = and:int(var_3_62D:int, ldc:int(-136423856))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_85:int, var_16_111:int)
                            goto(Label_1471)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1324:
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(-1465827148))
                        goto(Label_1482)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(512)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(216430073))
                        goto(Label_1186)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(-471111214))
                        goto(Label_1075)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0921)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0802)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(128)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(1022699061))
                        goto(Label_0668)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(-784954562))
                        goto(Label_0549)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(1047923870))
                        goto(Label_0389)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(790678375))
                        loopcontinue()
                    }
                    
                    var_3_62D = and:int(var_3_62D:int, ldc:int(-302195833))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1471:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_638 = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1482:
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1324)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(-1814128920))
                        goto(Label_1186)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1075)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0921)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(32)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(-399612750))
                        goto(Label_0802)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0668)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(471834749))
                        goto(Label_0549)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(519232219))
                        goto(Label_0389)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(-273161386))
                        var_17_638 = add:int(var_16_111:int, and:int(ldc:int(389), ldc:int(16987)))
                        looporswitchbreak()
                    }
                }
                
                var_3_62D = and:int(var_3_62D:int, ldc:int(-306786368))
                
                if (cmple:boolean(var_5_85 = var_17_638:int, sub:int(var_6_8C:int, and:int(ldc:int(10409), ldc:int(1557))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(1048576)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
