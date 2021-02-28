public class \u12b2\u4e72\u8df4\u67e9\u67e9.\uae5d\ua3b4\uc2e8\u416d\u839e\u56bd {
    public void encode(io.netty.channel.ChannelHandlerContext p0, io.netty.buffer.ByteBuf p1, java.util.List<java.lang.Object> p2) {
        var_4_1EF : int
        stack_209_0 : \u7d52\uc238\u12b2\u6198\u527a\ubefe [generated]
        var_4_3AA : int
        var_6_3B6 : int
        var_7_3C8 : ByteBuf
        var_8_3DF : \u59ec\uc29a\uc84e\u12b2\u5db4\u98a4
        var_9_3F4 : \uf94d\u4c04\u120d\uae5d\u8aa5\u416d
        var_8_5E7 : Throwable
        
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
            var_4_1EF = and:int(ldc:int(-117684061), ldc:int(1030744957))
            
            loop {
                if (cmpeq:boolean(and:int(var_4_1EF:int, ldc:int(134217728)), ldc:int(0))) {
                    goto(Label_0847)
                }
                
                if (cmpeq:boolean(and:int(var_4_1EF:int, ldc:int(2097152)), ldc:int(0))) {
                    goto(Label_0734)
                }
                
                if (cmpeq:boolean(and:int(var_4_1EF:int, ldc:int(134217728)), ldc:int(0))) {
                    goto(Label_0641)
                }
                
                if (cmpne:boolean(and:int(var_4_1EF:int, ldc:int(256)), ldc:int(0))) {
                    var_4_1EF = and:int(var_4_1EF:int, ldc:int(-300051338))
                    goto(Label_0531)
                }
                
                if (cmpne:boolean(and:int(var_4_1EF:int, ldc:int(256)), ldc:int(0))) {
                    var_4_1EF = and:int(var_4_1EF:int, ldc:int(38191363))
                    goto(Label_0394)
                }
                
                if (cmpne:boolean(and:int(var_4_1EF:int, ldc:int(16)), ldc:int(0))) {
                    goto(Label_0292)
                }
                
                if (cmpne:boolean(and:int(var_4_1EF:int, ldc:int(134217728)), ldc:int(0))) {
                    var_4_1EF = and:int(var_4_1EF:int, ldc:int(-76261218))
                    
                    if (cmpne:boolean(invokevirtual:int(ByteBuf::readableBytes, p1:ByteBuf), ldc:int(0))) {
                        invokevirtual:ByteBuf(ByteBuf::retain, p1:ByteBuf)
                        goto(Label_0531)
                    }
                }
                
                Label_0189:
                
                if (cmpeq:boolean(and:int(var_4_1EF:int, ldc:int(268435456)), ldc:int(0))) {
                    goto(Label_0847)
                }
                
                if (cmpeq:boolean(and:int(var_4_1EF:int, ldc:int(2048)), ldc:int(0))) {
                    var_4_1EF = and:int(var_4_1EF:int, ldc:int(1821831155))
                    goto(Label_0734)
                }
                
                if (cmpne:boolean(and:int(var_4_1EF:int, ldc:int(8192)), ldc:int(0))) {
                    var_4_1EF = and:int(var_4_1EF:int, ldc:int(1606774691))
                    goto(Label_0641)
                }
                
                if (cmpne:boolean(and:int(var_4_1EF:int, ldc:int(8192)), ldc:int(0))) {
                    goto(Label_0531)
                }
                
                if (cmpne:boolean(and:int(var_4_1EF:int, ldc:int(256)), ldc:int(0))) {
                    var_4_1EF = and:int(var_4_1EF:int, ldc:int(2054630035))
                    goto(Label_0394)
                }
                
                if (cmpeq:boolean(and:int(var_4_1EF:int, ldc:int(134217728)), ldc:int(0))) {
                    var_4_1EF = and:int(var_4_1EF:int, ldc:int(-723922642))
                }
                else {
                    if (cmpeq:boolean(and:int(var_4_1EF:int, ldc:int(134217728)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_4_1EF = and:int(var_4_1EF:int, ldc:int(-127627308))
                }
                
                Label_0292:
                
                if (cmpne:boolean(and:int(var_4_1EF:int, ldc:int(16)), ldc:int(0))) {
                    goto(Label_0847)
                }
                
                if (cmpne:boolean(and:int(var_4_1EF:int, ldc:int(32768)), ldc:int(0))) {
                    goto(Label_0734)
                }
                
                if (cmpne:boolean(and:int(var_4_1EF:int, ldc:int(32768)), ldc:int(0))) {
                    var_4_1EF = and:int(var_4_1EF:int, ldc:int(-557280225))
                    goto(Label_0641)
                }
                
                if (cmpeq:boolean(and:int(var_4_1EF:int, ldc:int(2048)), ldc:int(0))) {
                    goto(Label_0531)
                }
                
                if (cmpne:boolean(and:int(var_4_1EF:int, ldc:int(2048)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_4_1EF:int, ldc:int(268435456)), ldc:int(0))) {
                        var_4_1EF = and:int(var_4_1EF:int, ldc:int(1292371150))
                        goto(Label_0189)
                    }
                    
                    if (cmpne:boolean(and:int(var_4_1EF:int, ldc:int(16)), ldc:int(0))) {
                        var_4_1EF = and:int(var_4_1EF:int, ldc:int(-1177476540))
                        loopcontinue()
                    }
                    
                    var_4_1EF = and:int(var_4_1EF:int, ldc:int(410335511))
                    
                    if (logicalnot:boolean(invokevirtual:boolean(\uc29a\u7043\u3d4b\u93a2\uceb8\u7d52::\uc229\u3e2a\u76bc\ubb2b\ud523\u6435, invokestatic:\uc29a\u7043\u3d4b\u93a2\uceb8\u7d52(\u183a\u71ae\ubf56\u6d69\u4e72\u3d4b::\u3776\uf9c5\u3d4b\u72f1\u647c\ubf56)))) {
                        stack_209_0 = getstatic:\u7d52\uc238\u12b2\u6198\u527a\ubefe(\u7d52\uc238\u12b2\u6198\u527a\ubefe::\u7c6b\ube23\ub70c\u4ab3\u6435\u8df4)
                        athrow(stack_209_0:\u7d52\uc238\u12b2\u6198\u527a\ubefe)
                    }
                }
                
                Label_0394:
                
                if (cmpne:boolean(and:int(var_4_1EF:int, ldc:int(256)), ldc:int(0))) {
                    goto(Label_0847)
                }
                
                if (cmpne:boolean(and:int(var_4_1EF:int, ldc:int(8)), ldc:int(0))) {
                    var_4_1EF = and:int(var_4_1EF:int, ldc:int(-1890965224))
                    goto(Label_0734)
                }
                
                if (cmpne:boolean(and:int(var_4_1EF:int, ldc:int(32768)), ldc:int(0))) {
                    goto(Label_0641)
                }
                
                if (cmpeq:boolean(and:int(var_4_1EF:int, ldc:int(134217728)), ldc:int(0))) {
                    var_4_1EF = and:int(var_4_1EF:int, ldc:int(-39929663))
                }
                else {
                    if (cmpeq:boolean(and:int(var_4_1EF:int, ldc:int(4194304)), ldc:int(0))) {
                        var_4_1EF = and:int(var_4_1EF:int, ldc:int(-320032998))
                        goto(Label_0292)
                    }
                    
                    if (cmpne:boolean(and:int(var_4_1EF:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0189)
                    }
                    
                    if (cmpne:boolean(and:int(var_4_1EF:int, ldc:int(8)), ldc:int(0))) {
                        var_4_1EF = and:int(var_4_1EF:int, ldc:int(2000165748))
                        loopcontinue()
                    }
                    
                    var_4_1EF = and:int(var_4_1EF:int, ldc:int(1031752176))
                    stack_209_0 = initobject:\u7d52\uc238\u12b2\u6198\u527a\ubefe(\u7d52\uc238\u12b2\u6198\u527a\ubefe::<init>)
                    athrow(stack_209_0:\u7d52\uc238\u12b2\u6198\u527a\ubefe)
                }
                
                Label_0531:
                
                if (cmpeq:boolean(and:int(var_4_1EF:int, ldc:int(4194304)), ldc:int(0))) {
                    var_4_1EF = and:int(var_4_1EF:int, ldc:int(-1906693008))
                    goto(Label_0847)
                }
                
                if (cmpne:boolean(and:int(var_4_1EF:int, ldc:int(8192)), ldc:int(0))) {
                    goto(Label_0734)
                }
                
                if (cmpeq:boolean(and:int(var_4_1EF:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_4_1EF = and:int(var_4_1EF:int, ldc:int(-1313089907))
                }
                else {
                    if (cmpeq:boolean(and:int(var_4_1EF:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0394)
                    }
                    
                    if (cmpne:boolean(and:int(var_4_1EF:int, ldc:int(8)), ldc:int(0))) {
                        var_4_1EF = and:int(var_4_1EF:int, ldc:int(1370852978))
                        goto(Label_0292)
                    }
                    
                    if (cmpne:boolean(and:int(var_4_1EF:int, ldc:int(4096)), ldc:int(0))) {
                        var_4_1EF = and:int(var_4_1EF:int, ldc:int(1300422046))
                        goto(Label_0189)
                    }
                    
                    if (cmpeq:boolean(and:int(var_4_1EF:int, ldc:int(2147483647)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_4_1EF = and:int(var_4_1EF:int, ldc:int(-1736533769))
                    invokevirtual:void(\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709::\ud523\u7c6b\u4d85\u446c\u0800\u8640, getfield:\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709(\uae5d\ua3b4\uc2e8\u416d\u839e\u56bd::\u5245\u4179\u88c5\uf94d\ucb79\u59ec, this:\uae5d\ua3b4\uc2e8\u416d\u839e\u56bd))
                }
                
                Label_0641:
                
                if (cmpne:boolean(and:int(var_4_1EF:int, ldc:int(32768)), ldc:int(0))) {
                    goto(Label_0847)
                }
                
                if (cmpeq:boolean(and:int(var_4_1EF:int, ldc:int(4096)), ldc:int(0))) {
                    if (cmpne:boolean(and:int(var_4_1EF:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0531)
                    }
                    
                    if (cmpne:boolean(and:int(var_4_1EF:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0394)
                    }
                    
                    if (cmpne:boolean(and:int(var_4_1EF:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0292)
                    }
                    
                    if (cmpeq:boolean(and:int(var_4_1EF:int, ldc:int(2097152)), ldc:int(0))) {
                        var_4_1EF = and:int(var_4_1EF:int, ldc:int(-846991788))
                        goto(Label_0189)
                    }
                    
                    if (cmpeq:boolean(and:int(var_4_1EF:int, ldc:int(134217728)), ldc:int(0))) {
                        var_4_1EF = and:int(var_4_1EF:int, ldc:int(966595608))
                        loopcontinue()
                    }
                    
                    var_4_1EF = and:int(var_4_1EF:int, ldc:int(2054113609))
                    
                    if (logicalnot:boolean(invokevirtual:boolean(\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709::\u494c\ud12e\u7ce1\u2dcc\u9255\u4f52, getfield:\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709(\uae5d\ua3b4\uc2e8\u416d\u839e\u56bd::\u5245\u4179\u88c5\uf94d\ucb79\u59ec, this:\uae5d\ua3b4\uc2e8\u416d\u839e\u56bd)))) {
                        looporswitchbreak()
                    }
                }
                
                Label_0734:
                
                if (cmpeq:boolean(and:int(var_4_1EF:int, ldc:int(2048)), ldc:int(0))) {
                    var_4_1EF = and:int(var_4_1EF:int, ldc:int(-576589670))
                }
                else {
                    if (cmpne:boolean(and:int(var_4_1EF:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0641)
                    }
                    
                    if (cmpeq:boolean(and:int(var_4_1EF:int, ldc:int(4194304)), ldc:int(0))) {
                        var_4_1EF = and:int(var_4_1EF:int, ldc:int(-753481883))
                        goto(Label_0531)
                    }
                    
                    if (cmpne:boolean(and:int(var_4_1EF:int, ldc:int(4096)), ldc:int(0))) {
                        var_4_1EF = and:int(var_4_1EF:int, ldc:int(936384895))
                        goto(Label_0394)
                    }
                    
                    if (cmpeq:boolean(and:int(var_4_1EF:int, ldc:int(268435456)), ldc:int(0))) {
                        var_4_1EF = and:int(var_4_1EF:int, ldc:int(107505283))
                        goto(Label_0292)
                    }
                    
                    if (cmpeq:boolean(and:int(var_4_1EF:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0189)
                    }
                    
                    if (cmpne:boolean(and:int(var_4_1EF:int, ldc:int(16)), ldc:int(0))) {
                        var_4_1EF = and:int(var_4_1EF:int, ldc:int(638470028))
                        loopcontinue()
                    }
                    
                    var_4_1EF = and:int(var_4_1EF:int, ldc:int(1593710771))
                }
                
                Label_0847:
                
                if (cmpeq:boolean(and:int(var_4_1EF:int, ldc:int(262144)), ldc:int(0))) {
                    goto(Label_0734)
                }
                
                if (cmpeq:boolean(and:int(var_4_1EF:int, ldc:int(268435456)), ldc:int(0))) {
                    var_4_1EF = and:int(var_4_1EF:int, ldc:int(-1238754010))
                    goto(Label_0641)
                }
                
                if (cmpne:boolean(and:int(var_4_1EF:int, ldc:int(8192)), ldc:int(0))) {
                    goto(Label_0531)
                }
                
                if (cmpeq:boolean(and:int(var_4_1EF:int, ldc:int(268435456)), ldc:int(0))) {
                    var_4_1EF = and:int(var_4_1EF:int, ldc:int(1409277049))
                    goto(Label_0394)
                }
                
                if (cmpne:boolean(and:int(var_4_1EF:int, ldc:int(16)), ldc:int(0))) {
                    var_4_1EF = and:int(var_4_1EF:int, ldc:int(638534749))
                    goto(Label_0292)
                }
                
                if (cmpeq:boolean(and:int(var_4_1EF:int, ldc:int(2097152)), ldc:int(0))) {
                    goto(Label_0189)
                }
                
                if (cmpeq:boolean(and:int(var_4_1EF:int, ldc:int(8192)), ldc:int(0))) {
                    var_4_3AA = and:int(var_4_1EF:int, ldc:int(-545473347))
                    var_6_3B6 = invokevirtual:int(Integer::intValue, invokevirtual:Integer(\uceb8\u4c2b\ub8be\u7049\u8308\u3a62::\u4d85\uff55\uc3e3\ud4fe\u9937\uc229, getstatic:\uceb8\u4c2b\ub8be\u7049\u8308\u3a62(\u1833\ud171\u8350\ubded\u34df\uc9f6::\ud523\u62da\u6c52\u7043\ud217\u72f1), p1:ByteBuf))
                    var_4_1EF = and:int(var_4_3AA:int, ldc:int(-1157633600))
                    var_7_3C8 = invokeinterface:ByteBuf(ByteBufAllocator::buffer, invokevirtual:ByteBufAllocator(ByteBuf::alloc, p1:ByteBuf))
                    
                    try {
                        var_4_1EF = and:int(var_4_1EF:int, ldc:int(-1694716694))
                        var_8_3DF = initobject:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::<init>, var_6_3B6:int, p1:ByteBuf, getfield:\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709(\uae5d\ua3b4\uc2e8\u416d\u839e\u56bd::\u5245\u4179\u88c5\uf94d\ucb79\u59ec, this:\uae5d\ua3b4\uc2e8\u416d\u839e\u56bd))
                        var_4_1EF = and:int(var_4_1EF:int, ldc:int(427678811))
                        var_9_3F4 = checkcast:\uf94d\u4c04\u120d\uae5d\u8aa5\u416d(\u3bd6\u6b0d\ubff1\u8aa5\u4f4a.\uf94d\u4c04\u120d\uae5d\u8aa5\u416d.class, invokevirtual:\uf94d\u4c04\u120d\uae5d\u8aa5\u416d(\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709::\u4d85\u71f1\u6435\u1833\u1187\u6435, getfield:\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709(\uae5d\ua3b4\uc2e8\u416d\u839e\u56bd::\u5245\u4179\u88c5\uf94d\ucb79\u59ec, this:\uae5d\ua3b4\uc2e8\u416d\u839e\u56bd), ldc:Class<\uf94d\u4c04\u120d\uae5d\u8aa5\u416d>(\u3bd6\u6b0d\ubff1\u8aa5\u4f4a.\uf94d\u4c04\u120d\uae5d\u8aa5\u416d.class)))
                        
                        loop {
                            if (cmpne:boolean(and:int(var_4_1EF:int, ldc:int(32768)), ldc:int(0))) {
                                var_4_1EF = and:int(var_4_1EF:int, ldc:int(-1089307897))
                                goto(Label_1437)
                            }
                            
                            if (cmpeq:boolean(and:int(var_4_1EF:int, ldc:int(134217728)), ldc:int(0))) {
                                var_4_1EF = and:int(var_4_1EF:int, ldc:int(36980270))
                                goto(Label_1347)
                            }
                            
                            if (cmpne:boolean(and:int(var_4_1EF:int, ldc:int(32768)), ldc:int(0))) {
                                goto(Label_1255)
                            }
                            
                            if (cmpne:boolean(and:int(var_4_1EF:int, ldc:int(8)), ldc:int(0))) {
                                goto(Label_1193)
                            }
                            
                            if (cmpne:boolean(and:int(var_4_1EF:int, ldc:int(4096)), ldc:int(0))) {
                                var_4_1EF = and:int(var_4_1EF:int, ldc:int(1719994497))
                            }
                            else {
                                var_4_1EF = and:int(var_4_1EF:int, ldc:int(-117622090))
                                invokevirtual:void(\u6b5f\uc84e\u7bad\u8258\u8cae\u3bd6::\ud217\uff55\ud523\u59ec\u965f\ua61f, invokevirtual:\u6b5f\uc84e\u7bad\u8258\u8cae\u3bd6(\uf94d\u4c04\u120d\uae5d\u8aa5\u416d::\u34df\u8d90\ub19c\ua6bd\u7e3f\u6cfe, var_9_3F4:\uf94d\u4c04\u120d\uae5d\u8aa5\u416d), getstatic:\u7006\u6d69\uc910\u7ce1\u4975\u718f(\u7006\u6d69\uc910\u7ce1\u4975\u718f::\ua6bd\u6d99\uc246\u7043\u5fe1\u7d52), invokevirtual:\u92ff\u9937\uc7fe\u927d\ua61f\ua3b4(\uf94d\u4c04\u120d\uae5d\u8aa5\u416d::\u836c\u759a\ub6ab\u3d64\u2dcc\ua3b4, var_9_3F4:\uf94d\u4c04\u120d\uae5d\u8aa5\u416d), var_8_3DF:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4)
                            }
                            
                            Label_1109:
                            
                            if (cmpeq:boolean(and:int(var_4_1EF:int, ldc:int(268435456)), ldc:int(0))) {
                                var_4_1EF = and:int(var_4_1EF:int, ldc:int(-171859178))
                                goto(Label_1437)
                            }
                            
                            if (cmpne:boolean(and:int(var_4_1EF:int, ldc:int(8192)), ldc:int(0))) {
                                var_4_1EF = and:int(var_4_1EF:int, ldc:int(-1250816880))
                                goto(Label_1347)
                            }
                            
                            if (cmpeq:boolean(and:int(var_4_1EF:int, ldc:int(134217728)), ldc:int(0))) {
                                goto(Label_1255)
                            }
                            
                            if (cmpne:boolean(and:int(var_4_1EF:int, ldc:int(2147483647)), ldc:int(0))) {
                                if (cmpne:boolean(and:int(var_4_1EF:int, ldc:int(4096)), ldc:int(0))) {
                                    var_4_1EF = and:int(var_4_1EF:int, ldc:int(-1165753192))
                                    loopcontinue()
                                }
                                
                                var_4_1EF = and:int(var_4_1EF:int, ldc:int(-1686204583))
                                invokevirtual:void(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u6fb0\u7bad\u0a06\u8640\u61a4\ub7dc, var_8_3DF:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4, var_7_3C8:ByteBuf)
                            }
                            
                            Label_1193:
                            
                            if (cmpeq:boolean(and:int(var_4_1EF:int, ldc:int(262144)), ldc:int(0))) {
                                goto(Label_1437)
                            }
                            
                            if (cmpeq:boolean(and:int(var_4_1EF:int, ldc:int(2048)), ldc:int(0))) {
                                goto(Label_1347)
                            }
                            
                            if (cmpeq:boolean(and:int(var_4_1EF:int, ldc:int(268435456)), ldc:int(0))) {
                                var_4_1EF = and:int(var_4_1EF:int, ldc:int(12775038))
                            }
                            else {
                                if (cmpeq:boolean(and:int(var_4_1EF:int, ldc:int(2147483647)), ldc:int(0))) {
                                    goto(Label_1109)
                                }
                                
                                if (cmpne:boolean(and:int(var_4_1EF:int, ldc:int(8)), ldc:int(0))) {
                                    loopcontinue()
                                }
                                
                                var_4_1EF = and:int(var_4_1EF:int, ldc:int(-1099674321))
                                invokevirtual:ByteBuf(ByteBuf::clear, p1:ByteBuf)
                            }
                            
                            Label_1255:
                            
                            if (cmpne:boolean(and:int(var_4_1EF:int, ldc:int(16)), ldc:int(0))) {
                                goto(Label_1437)
                            }
                            
                            if (cmpeq:boolean(and:int(var_4_1EF:int, ldc:int(262144)), ldc:int(0))) {
                                var_4_1EF = and:int(var_4_1EF:int, ldc:int(-1157947647))
                            }
                            else {
                                if (cmpeq:boolean(and:int(var_4_1EF:int, ldc:int(2147483647)), ldc:int(0))) {
                                    var_4_1EF = and:int(var_4_1EF:int, ldc:int(30763064))
                                    goto(Label_1193)
                                }
                                
                                if (cmpeq:boolean(and:int(var_4_1EF:int, ldc:int(2097152)), ldc:int(0))) {
                                    var_4_1EF = and:int(var_4_1EF:int, ldc:int(1848991156))
                                    goto(Label_1109)
                                }
                                
                                if (cmpeq:boolean(and:int(var_4_1EF:int, ldc:int(262144)), ldc:int(0))) {
                                    var_4_1EF = and:int(var_4_1EF:int, ldc:int(-1192528577))
                                    loopcontinue()
                                }
                                
                                var_4_1EF = and:int(var_4_1EF:int, ldc:int(442883078))
                                invokevirtual:boolean(ByteBuf::release, p1:ByteBuf)
                            }
                            
                            Label_1347:
                            
                            if (cmpeq:boolean(and:int(var_4_1EF:int, ldc:int(134217728)), ldc:int(0))) {
                                var_4_1EF = and:int(var_4_1EF:int, ldc:int(286722798))
                            }
                            else {
                                if (cmpeq:boolean(and:int(var_4_1EF:int, ldc:int(2147483647)), ldc:int(0))) {
                                    var_4_1EF = and:int(var_4_1EF:int, ldc:int(1981615534))
                                    goto(Label_1255)
                                }
                                
                                if (cmpne:boolean(and:int(var_4_1EF:int, ldc:int(4096)), ldc:int(0))) {
                                    var_4_1EF = and:int(var_4_1EF:int, ldc:int(-169020808))
                                    goto(Label_1193)
                                }
                                
                                if (cmpne:boolean(and:int(var_4_1EF:int, ldc:int(256)), ldc:int(0))) {
                                    var_4_1EF = and:int(var_4_1EF:int, ldc:int(200032959))
                                    goto(Label_1109)
                                }
                                
                                if (cmpeq:boolean(and:int(var_4_1EF:int, ldc:int(4194304)), ldc:int(0))) {
                                    loopcontinue()
                                }
                                
                                var_4_1EF = and:int(var_4_1EF:int, ldc:int(-1150502085))
                                p1 = var_7_3C8:ByteBuf
                            }
                            
                            Label_1437:
                            
                            if (cmpne:boolean(and:int(var_4_1EF:int, ldc:int(8192)), ldc:int(0))) {
                                goto(Label_1347)
                            }
                            
                            if (cmpeq:boolean(and:int(var_4_1EF:int, ldc:int(2097152)), ldc:int(0))) {
                                goto(Label_1255)
                            }
                            
                            if (cmpne:boolean(and:int(var_4_1EF:int, ldc:int(8192)), ldc:int(0))) {
                                var_4_1EF = and:int(var_4_1EF:int, ldc:int(-433452272))
                                goto(Label_1193)
                            }
                            
                            if (cmpeq:boolean(and:int(var_4_1EF:int, ldc:int(134217728)), ldc:int(0))) {
                                var_4_1EF = and:int(var_4_1EF:int, ldc:int(-588974026))
                                goto(Label_1109)
                            }
                            
                            if (cmpeq:boolean(and:int(var_4_1EF:int, ldc:int(32768)), ldc:int(0))) {
                                looporswitchbreak()
                            }
                        }
                        
                        var_4_1EF = and:int(var_4_1EF:int, ldc:int(-1729779699))
                    }
                    catch (java.lang.Throwable var_8_5E7) {
                        loop {
                            if (cmpeq:boolean(and:int(var_4_1EF:int, ldc:int(4194304)), ldc:int(0))) {
                                var_4_1EF = and:int(var_4_1EF:int, ldc:int(648826427))
                                goto(Label_1672)
                            }
                            
                            if (cmpeq:boolean(and:int(var_4_1EF:int, ldc:int(134217728)), ldc:int(0))) {
                                var_4_1EF = and:int(var_4_1EF:int, ldc:int(1171076896))
                                goto(Label_1635)
                            }
                            
                            if (cmpeq:boolean(and:int(var_4_1EF:int, ldc:int(4194304)), ldc:int(0))) {
                                var_4_1EF = and:int(var_4_1EF:int, ldc:int(1291197417))
                            }
                            else {
                                var_4_1EF = and:int(var_4_1EF:int, ldc:int(-571483967))
                                invokevirtual:ByteBuf(ByteBuf::clear, p1:ByteBuf)
                            }
                            
                            Label_1579:
                            
                            if (cmpne:boolean(and:int(var_4_1EF:int, ldc:int(8192)), ldc:int(0))) {
                                var_4_1EF = and:int(var_4_1EF:int, ldc:int(-1810367095))
                                goto(Label_1672)
                            }
                            
                            if (cmpeq:boolean(and:int(var_4_1EF:int, ldc:int(134217728)), ldc:int(0))) {
                                var_4_1EF = and:int(var_4_1EF:int, ldc:int(649175522))
                            }
                            else {
                                if (cmpne:boolean(and:int(var_4_1EF:int, ldc:int(4096)), ldc:int(0))) {
                                    loopcontinue()
                                }
                                
                                var_4_1EF = and:int(var_4_1EF:int, ldc:int(-119034059))
                                invokevirtual:boolean(ByteBuf::release, p1:ByteBuf)
                            }
                            
                            Label_1635:
                            
                            if (cmpne:boolean(and:int(var_4_1EF:int, ldc:int(2147483647)), ldc:int(0))) {
                                if (cmpne:boolean(and:int(var_4_1EF:int, ldc:int(8)), ldc:int(0))) {
                                    goto(Label_1579)
                                }
                                
                                if (cmpne:boolean(and:int(var_4_1EF:int, ldc:int(8)), ldc:int(0))) {
                                    loopcontinue()
                                }
                                
                                var_4_1EF = and:int(var_4_1EF:int, ldc:int(2030033147))
                                invokevirtual:boolean(ByteBuf::release, var_7_3C8:ByteBuf)
                            }
                            
                            Label_1672:
                            
                            if (cmpeq:boolean(and:int(var_4_1EF:int, ldc:int(268435456)), ldc:int(0))) {
                                var_4_1EF = and:int(var_4_1EF:int, ldc:int(568656478))
                                goto(Label_1635)
                            }
                            
                            if (cmpeq:boolean(and:int(var_4_1EF:int, ldc:int(2097152)), ldc:int(0))) {
                                var_4_1EF = and:int(var_4_1EF:int, ldc:int(-322342813))
                                goto(Label_1579)
                            }
                            
                            if (cmpeq:boolean(and:int(var_4_1EF:int, ldc:int(8)), ldc:int(0))) {
                                looporswitchbreak()
                            }
                            
                            var_4_1EF = and:int(var_4_1EF:int, ldc:int(1844744737))
                        }
                        
                        athrow(var_8_5E7:Throwable)
                    }
                    
                    looporswitchbreak()
                }
            }
            
            invokeinterface:boolean(List<ByteBuf>::add, p2:List<ByteBuf>, p1:ByteBuf)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void exceptionCaught(io.netty.channel.ChannelHandlerContext p0, java.lang.Throwable p1) {
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
        
        if (logicalnot:boolean(invokestatic:boolean(\u983f\u40a9\u6d69\uceb8\u1187\ub8be::\uff55\u7ce1\u9033\u4975\uc246\u9af2, p1:Throwable, ldc:Class<\u7d52\uc238\u12b2\u6198\u527a\ubefe>(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u7d52\uc238\u12b2\u6198\u527a\ubefe.class)))) {
            invokespecial:void(MessageToMessageEncoder::exceptionCaught, this:\uae5d\ua3b4\uc2e8\u416d\u839e\u56bd[expected:MessageToMessageEncoder], p0:ChannelHandlerContext, p1:Throwable)
        }
    }
    
    public void \uae5d\ua3b4\uc2e8\u416d\u839e\u56bd(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u836c\u67e9\u5d20\u5fe1\u7e3f.\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709 p0) {
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
        invokespecial:MessageToMessageEncoder(MessageToMessageEncoder::<init>, this:\uae5d\ua3b4\uc2e8\u416d\u839e\u56bd)
        putfield:boolean(\uae5d\ua3b4\uc2e8\u416d\u839e\u56bd::\u9033\u12b2\u4d85\uf94d\u16f6\u7d52, this:\uae5d\ua3b4\uc2e8\u416d\u839e\u56bd, and:int[expected:boolean](ldc:int(-4007), ldc:int(2726)))
        
        if (cmpne:boolean(p0:\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709, aconstnull:\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709())) {
            putfield:\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709(\uae5d\ua3b4\uc2e8\u416d\u839e\u56bd::\u5245\u4179\u88c5\uf94d\ucb79\u59ec, this:\uae5d\ua3b4\uc2e8\u416d\u839e\u56bd, p0:\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709)
            return:void()
        }
        
        athrow(initobject:NullPointerException(NullPointerException::<init>, loadelement:String(getstatic:String[](\uae5d\ua3b4\uc2e8\u416d\u839e\u56bd::\u9937\u6bb9\u97e6\u4179\u9af2\u16f6), and:int(ldc:int(-27157), ldc:int(18964)))))
    }
    
    public void encode(io.netty.channel.ChannelHandlerContext p0, java.lang.Object p1, java.util.List p2) {
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
            invokevirtual:void(\uae5d\ua3b4\uc2e8\u416d\u839e\u56bd::encode, this:\uae5d\ua3b4\uc2e8\u416d\u839e\u56bd, p0:ChannelHandlerContext, checkcast:ByteBuf(io.netty.buffer.ByteBuf.class, p1:Object[expected:ByteBuf]), p2:List<Object>)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_192 : int
        expr_6E : int [generated]
        stack_A3_0 : byte[] [generated]
        stack_A5_0 : byte[] [generated]
        stack_DB_0 : byte[] [generated]
        stack_DD_0 : byte[] [generated]
        stack_108_0 : byte[] [generated]
        stack_10A_0 : byte[] [generated]
        stack_137_0 : byte[] [generated]
        stack_1AC_0 : byte[] [generated]
        stack_20A_0 : byte[] [generated]
        stack_2B1_0 : byte[] [generated]
        stack_305_0 : byte[] [generated]
        var_4_17D : int
        var_3_182 : byte[]
        var_5_183 : int
        var_0_223 : int
        expr_20A : byte [generated]
        stack_25A_2 : byte [generated]
        stack_22F_0 : byte [generated]
        expr_2B4 : byte [generated]
        expr_A5 : int [generated]
        expr_DD : int [generated]
        var_2_108 : byte[]
        expr_10C : int [generated]
        var_3_2F3 : byte[]
        var_5_2F4 : int
        var_3_143 : String
        stack_176_0 : String[] [generated]
        expr_155 : String[] [generated]
        
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
        var_0_192 = and:int(ldc:int(-856592626), ldc:int(2020085751))
        expr_6E = arraylength:int(stack_A3_0 = stack_A5_0 = stack_DB_0 = stack_DD_0 = stack_108_0 = stack_10A_0 = stack_137_0 = stack_1AC_0 = stack_20A_0 = stack_2B1_0 = stack_305_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("aA8TafPj6/MKkm2WiujPYhW185FptBJ2gxWXdO66WfD/ev6u")))
        
        if (cmpeq:boolean(expr_6E:int, ldc:int(0))) {
            goto(Label_0115)
        }
        
        var_4_17D = expr_6E:int
        var_3_182 = newarray:byte[](byte.class, expr_6E:int)
        var_5_183 = expr_6E:int
        Label_0389:
        
        while (cmpne:boolean(and:int(var_0_192:int, ldc:int(1073741824)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_192:int, ldc:int(2048)), ldc:int(0))) {
                goto(Label_0475)
            }
            
            var_0_192 = and:int(var_0_192:int, ldc:int(1625447218))
            var_5_183 = add:int(var_5_183:int, ldc:int(-1))
            storeelement:byte(var_3_182:byte[], var_5_183:int, xor:byte(loadelement:byte(stack_1AC_0:byte[], var_5_183:int), ldc:byte(20)))
            
            if (cmpne:boolean(var_5_183:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A5_0 = stack_A3_0 = stack_DB_0 = stack_DD_0 = stack_108_0 = stack_10A_0 = stack_137_0 = stack_1AC_0 = stack_20A_0 = stack_2B1_0 = stack_305_0 = var_3_182:byte[]
            goto(Label_0115)
        }
        
        var_0_192 = and:int(var_0_192:int, ldc:int(568683911))
        goto(Label_0640)
        Label_0475:
        
        while (cmpne:boolean(and:int(var_0_192:int, ldc:int(2097152)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_192:int, ldc:int(256)), ldc:int(0))) {
                var_0_192 = and:int(var_0_192:int, ldc:int(1723070698))
                goto(Label_0389)
            }
            
            var_0_223 = and:int(var_0_192:int, ldc:int(1861590506))
            var_5_183 = add:int(var_5_183:int, ldc:int(-1))
            expr_20A = stack_25A_2 = loadelement(stack_20A_0, var_5_183)
            
            if (cmplt:boolean(add:int(add:int(var_5_183:int, ldc:int(6)), neg:int(var_4_17D:int)), ldc:int(0))) {
                stack_25A_2 = stack_22F_0 = add:byte(expr_20A:byte, loadelement:byte(var_3_182:byte[], add:int(var_5_183:int, ldc:int(6))))
                goto(Label_0575)
            }
            
            Label_0535:
            
            if (cmpeq:boolean(and:int(var_0_223:int, ldc:int(256)), ldc:int(0))) {
                var_0_223 = and:int(var_0_223:int, ldc:int(1908678356))
            }
            else {
                var_0_223 = and:int(var_0_223:int, ldc:int(-941389401))
                stack_25A_2 = stack_22F_0 = add:byte(expr_20A:byte, ldc:byte(6))
            }
            
            Label_0575:
            
            if (cmpne:boolean(and:int(var_0_223:int, ldc:int(16)), ldc:int(0))) {
                var_0_223 = and:int(var_0_223:int, ldc:int(1056250761))
                goto(Label_0535)
            }
            
            var_0_192 = and:int(var_0_223:int, ldc:int(1451153854))
            storeelement:byte(var_3_182:byte[], var_5_183:int, stack_25A_2:byte)
            
            if (cmpne:boolean(var_5_183:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A5_0 = stack_A3_0 = stack_DB_0 = stack_DD_0 = stack_108_0 = stack_10A_0 = stack_137_0 = stack_1AC_0 = stack_20A_0 = stack_2B1_0 = stack_305_0 = var_3_182:byte[]
            goto(Label_0170)
        }
        
        var_0_192 = and:int(var_0_192:int, ldc:int(-1169557448))
        Label_0640:
        
        while (cmpne:boolean(and:int(var_0_192:int, ldc:int(1073741824)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_192:int, ldc:int(128)), ldc:int(0))) {
                var_0_192 = and:int(var_0_192:int, ldc:int(-1176701030))
                goto(Label_0389)
            }
            
            var_0_192 = and:int(var_0_192:int, ldc:int(1911425927))
            var_5_183 = add:int(var_5_183:int, ldc:int(-1))
            expr_2B4 = add:byte(loadelement:byte(stack_2B1_0:byte[], var_5_183:int), ldc:byte(70))
            storeelement:byte(var_3_182:byte[], var_5_183:int, or:int(and:int(shl:int(expr_2B4:byte, and:int(ldc:int(18615), ldc:int(5444))), ldc:int(-16)), and:int(shr:int(expr_2B4:byte[expected:int], and:int(ldc:int(10894), ldc:int(5188))), ldc:int(15))))
            
            if (cmpne:boolean(var_5_183:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A5_0 = stack_A3_0 = stack_DB_0 = stack_DD_0 = stack_108_0 = stack_10A_0 = stack_137_0 = stack_1AC_0 = stack_20A_0 = stack_2B1_0 = stack_305_0 = var_3_182:byte[]
            goto(Label_0226)
        }
        
        var_0_192 = and:int(var_0_192:int, ldc:int(579709952))
        goto(Label_0475)
        Label_0115:
        
        if (cmpne:boolean(and:int(var_0_192:int, ldc:int(524288)), ldc:int(0))) {
            var_0_192 = and:int(var_0_192:int, ldc:int(1741649111))
            goto(Label_0273)
        }
        
        if (cmpeq:boolean(and:int(var_0_192:int, ldc:int(2147483647)), ldc:int(0))) {
            var_0_192 = and:int(var_0_192:int, ldc:int(1034995820))
            goto(Label_0226)
        }
        
        if (cmpne:boolean(and:int(var_0_192:int, ldc:int(256)), ldc:int(0))) {
            var_0_192 = and:int(var_0_192:int, ldc:int(1081806286))
            expr_A5 = arraylength:int(stack_A5_0:byte[])
            
            if (cmpne:boolean(expr_A5:int, ldc:int(0))) {
                var_4_17D = expr_A5:int
                var_3_182 = newarray:byte[](byte.class, expr_A5:int)
                var_5_183 = expr_A5:int
                goto(Label_0475)
            }
        }
        
        Label_0170:
        
        if (cmpne:boolean(and:int(var_0_192:int, ldc:int(128)), ldc:int(0))) {
            var_0_192 = and:int(var_0_192:int, ldc:int(-1877669678))
            goto(Label_0273)
        }
        
        if (cmpeq:boolean(and:int(var_0_192:int, ldc:int(128)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_192:int, ldc:int(2048)), ldc:int(0))) {
                var_0_192 = and:int(var_0_192:int, ldc:int(-823025811))
                goto(Label_0115)
            }
            
            var_0_192 = and:int(var_0_192:int, ldc:int(1106288054))
            expr_DD = arraylength:int(stack_DD_0:byte[])
            
            if (cmpne:boolean(expr_DD:int, ldc:int(0))) {
                var_4_17D = expr_DD:int
                var_3_182 = newarray:byte[](byte.class, expr_DD:int)
                var_5_183 = expr_DD:int
                goto(Label_0640)
            }
        }
        
        Label_0226:
        
        if (cmpne:boolean(and:int(var_0_192:int, ldc:int(2147483647)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_192:int, ldc:int(4096)), ldc:int(0))) {
                var_0_192 = and:int(var_0_192:int, ldc:int(2108624466))
                goto(Label_0170)
            }
            
            if (cmpeq:boolean(and:int(var_0_192:int, ldc:int(2147483647)), ldc:int(0))) {
                goto(Label_0115)
            }
            
            var_0_192 = and:int(var_0_192:int, ldc:int(1492855767))
            var_2_108 = stack_108_0:byte[]
            expr_10C = add:int(arraylength:int(stack_10A_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_10C:int, ldc:int(0))) {
                var_3_2F3 = newarray:byte[](byte.class, expr_10C:int)
                var_5_2F4 = expr_10C:int
                
                loop {
                    var_0_192 = and:int(var_0_192:int, ldc:int(1231486274))
                    var_5_2F4 = add:int(var_5_2F4:int, ldc:int(-1))
                    storeelement:byte(var_3_2F3:byte[], var_5_2F4:int, add:int(shl:int(loadelement:byte(stack_305_0:byte[], var_5_2F4:int), ldc:int(5)), and:int(shr:int(loadelement:byte(var_2_108:byte[], add:int(var_5_2F4:int, and:int(ldc:int(12361), ldc:int(2305)))), ldc:int(3)), xor:int(ldc:int(531), ldc:int(524)))))
                    
                    if (cmpne:boolean(var_5_2F4:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_A5_0 = stack_A3_0 = stack_DB_0 = stack_DD_0 = stack_108_0 = stack_10A_0 = stack_137_0 = stack_1AC_0 = stack_20A_0 = stack_2B1_0 = stack_305_0 = var_3_2F3:byte[]
            }
        }
        
        Label_0273:
        
        if (cmpne:boolean(and:int(var_0_192:int, ldc:int(524288)), ldc:int(0))) {
            var_0_192 = and:int(var_0_192:int, ldc:int(1618470808))
            goto(Label_0226)
        }
        
        if (cmpne:boolean(and:int(var_0_192:int, ldc:int(4096)), ldc:int(0))) {
            goto(Label_0170)
        }
        
        if (cmpne:boolean(and:int(var_0_192:int, ldc:int(2048)), ldc:int(0))) {
            var_3_143 = initobject:String(String::<init>, stack_137_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_176_0 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(652), ldc:int(653)))
            expr_155 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(2052), ldc:int(2053)))
            storeelement:String(expr_155:String[], and:int(ldc:int(-11349), ldc:int(11332)), invokevirtual:String[expected:String](String::substring, var_3_143:String, and:int(ldc:int(-19675), ldc:int(17624)), and:int(ldc:int(16675), ldc:int(2163))))
            putstatic:String[](\uae5d\ua3b4\uc2e8\u416d\u839e\u56bd::\u9937\u6bb9\u97e6\u4179\u9af2\u16f6, expr_155:String[])
            return:void()
        }
        
        goto(Label_0115)
    }
    
    public void \ud36e\u5bc4\u74b1\ub19c\u3504\ua3b4(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_66B : int
        var_5_80 : int
        var_6_87 : int
        var_7_96 : double
        var_9_C6 : double
        var_3_D8 : int
        var_11_E9 : int
        var_14_113 : double
        var_16_117 : int
        var_12_10F : double
        var_17_676 : int
        
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
        var_3_66B = and:int(ldc:int(1061181343), ldc:int(993615806))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\uae5d\ua3b4\uc2e8\u416d\u839e\u56bd[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0170)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(268435456)), ldc:int(0))) {
            var_3_66B = and:int(var_3_66B:int, ldc:int(-70451241))
            var_5_80 = and:int(ldc:int(-9128), ldc:int(9125))
            var_6_87 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_96 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(16987), ldc:int(-30556)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C6 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D8 = and:int(var_3_66B:int, ldc:int(975498678))
                    var_9_C6 = sub:double(var_7_96:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E9 = var_5_80:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E9:int, sub:int(var_6_87:int, and:int(ldc:int(18713), ldc:int(1571)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E9:int, and:int(ldc:int(311), ldc:int(6273)))), var_7_96:double))) {
                        inc:int(var_11_E9, ldc:int(1))
                    }
                    
                    var_3_66B = and:int(var_3_D8:int, ldc:int(1058438422))
                    var_14_113 = var_7_96:double
                    var_16_117 = var_11_E9:int
                }
                else {
                    var_11_E9 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_80:int), and:int(ldc:int(515), ldc:int(5)))
                    var_12_10F = var_14_113 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_80)
                    
                    if (cmplt:boolean(var_16_117 = var_11_E9:int, var_6_87:int)) {
                        var_9_C6 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E9:int)
                        var_16_117 = var_11_E9:int
                        var_14_113 = var_12_10F:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1524)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1372)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(641304383))
                        goto(Label_1231)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-1227048416))
                        goto(Label_1129)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0956)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0835)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0706)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(4)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(1182707372))
                        goto(Label_0583)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(1047877526))
                        
                        if (cmplt:boolean(var_16_117:int, var_6_87:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0583)
                            }
                            
                            goto(Label_0835)
                        }
                    }
                    
                    Label_0394:
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1524)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(4)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-1043357993))
                        goto(Label_1372)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-1650885843))
                        goto(Label_1231)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(203793800))
                        goto(Label_1129)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-299713505))
                        goto(Label_0956)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-251930695))
                        goto(Label_0835)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(2)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-1020976515))
                        goto(Label_0706)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-607332490))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(4)), ldc:int(0))) {
                            var_3_66B = and:int(var_3_66B:int, ldc:int(1053577023))
                            var_11_E9 = and:int(ldc:int(19066), ldc:int(-24443))
                            goto(Label_1513)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0583:
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-2051447030))
                        goto(Label_1524)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1372)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1231)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(2)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(1235552258))
                        goto(Label_1129)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0956)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0835)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(64)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_66B = and:int(var_3_66B:int, ldc:int(933611474))
                            goto(Label_0394)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_66B = and:int(var_3_66B:int, ldc:int(1846997703))
                            loopcontinue()
                        }
                        
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-1149243586))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_113 = var_9_C6:double
                            goto(Label_0835)
                        }
                    }
                    
                    Label_0706:
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(2)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(1928923716))
                        goto(Label_1524)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(1716326038))
                        goto(Label_1372)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(4)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-313010786))
                        goto(Label_1231)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(4)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-1022076408))
                        goto(Label_1129)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0956)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(256)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0583)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0394)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(268435456)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_66B = and:int(var_3_66B:int, ldc:int(984733494))
                        var_14_113 = mul:double(ldc:double(0.5), add:double(var_9_C6:double, var_14_113:double))
                    }
                    
                    Label_0835:
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1524)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(32)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(6258030))
                        goto(Label_1372)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-1085059676))
                        goto(Label_1231)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-755228885))
                        goto(Label_1129)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(8192)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_66B = and:int(var_3_66B:int, ldc:int(57875151))
                            goto(Label_0706)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0583)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0394)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(131072)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-1174175745))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_80:int), var_7_96:double)) {
                                var_11_E9 = and:int(ldc:int(18457), ldc:int(5473))
                                goto(Label_1129)
                            }
                        }
                    }
                    
                    Label_0956:
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1524)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(2)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(737390677))
                        goto(Label_1372)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-2140090756))
                        goto(Label_1231)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(64)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(32)), ldc:int(0))) {
                            var_3_66B = and:int(var_3_66B:int, ldc:int(127700506))
                            goto(Label_0835)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_66B = and:int(var_3_66B:int, ldc:int(556679104))
                            goto(Label_0706)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(256)), ldc:int(0))) {
                            var_3_66B = and:int(var_3_66B:int, ldc:int(1500552735))
                            goto(Label_0583)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(256)), ldc:int(0))) {
                            var_3_66B = and:int(var_3_66B:int, ldc:int(866180171))
                            goto(Label_0394)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(2147483647)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-1099870401))
                        var_11_E9 = and:int(ldc:int(-14400), ldc:int(6191))
                    }
                    
                    Label_1129:
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1524)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-499740535))
                        goto(Label_1372)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(1048576)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0956)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0835)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0706)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_66B = and:int(var_3_66B:int, ldc:int(20627617))
                            goto(Label_0583)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0394)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(268435456)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-31097058))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E9:int, ldc:int(0))) {
                                goto(Label_1372)
                            }
                        }
                    }
                    
                    Label_1231:
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1524)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-638905309))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(64)), ldc:int(0))) {
                            var_3_66B = and:int(var_3_66B:int, ldc:int(-2083750135))
                            goto(Label_1129)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(32)), ldc:int(0))) {
                            var_3_66B = and:int(var_3_66B:int, ldc:int(-1549033555))
                            goto(Label_0956)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0835)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_66B = and:int(var_3_66B:int, ldc:int(310487503))
                            goto(Label_0706)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0583)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_66B = and:int(var_3_66B:int, ldc:int(-1441457788))
                            goto(Label_0394)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(32)), ldc:int(0))) {
                            var_3_66B = and:int(var_3_66B:int, ldc:int(986729823))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_113:double, var_5_80:int, var_16_117:int)
                            goto(Label_1513)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1372:
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-862213097))
                        goto(Label_1524)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-1110936857))
                        goto(Label_1231)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1129)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(32)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-384779801))
                        goto(Label_0956)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0835)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(4)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(115066218))
                        goto(Label_0706)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(650479074))
                        goto(Label_0583)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0394)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(2097152)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_66B = and:int(var_3_66B:int, ldc:int(1004433335))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_113:double, ldc:double(0.0))
                    Label_1513:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_676 = var_5_80:int
                        
                        if (cmpeq:boolean(var_11_E9:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1524:
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1372)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(1218854214))
                        goto(Label_1231)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1129)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(2)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-1406439217))
                        goto(Label_0956)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(735067769))
                        goto(Label_0835)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0706)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(1862981163))
                        goto(Label_0583)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-106073685))
                        goto(Label_0394)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(2147213143))
                        var_17_676 = add:int(var_16_117:int, xor:int(ldc:int(-28540), ldc:int(-28539)))
                        looporswitchbreak()
                    }
                }
                
                var_3_66B = and:int(var_3_66B:int, ldc:int(1059966807))
                
                if (cmple:boolean(var_5_80 = var_17_676:int, sub:int(var_6_87:int, and:int(ldc:int(25369), ldc:int(2147))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0170:
        
        if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(134217728)), ldc:int(0))) {
            var_3_66B = and:int(var_3_66B:int, ldc:int(383887530))
            goto(Label_0108)
        }
    }
}
