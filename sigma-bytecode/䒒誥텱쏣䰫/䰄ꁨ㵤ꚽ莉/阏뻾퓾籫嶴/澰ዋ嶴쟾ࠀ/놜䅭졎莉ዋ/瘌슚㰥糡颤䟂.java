public class \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ub19c\u416d\uc84e\u8389\u12cb.\u760c\uc29a\u3c25\u7ce1\u98a4\u47c2 {
    public void \u760c\uc29a\u3c25\u7ce1\u98a4\u47c2(\u6435\ub8be\u718f\u6b0d\u67e9.\u8389\ub18d\u6b5f\u67e9\uc229\ua61f p0, \u51fa\u12cb\u7330\u74b1\u6c52.\u8258\ub19c\u0b8e\u98a4\u0800\ud217 p1, \u12b2\u7049\u8df4\uc9f6\uae87.\ub8be\u071d\u527a\u3711\ubff1\u759a p2) {
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
            putfield:\u8389\ub18d\u6b5f\u67e9\uc229\ua61f(\u760c\uc29a\u3c25\u7ce1\u98a4\u47c2::\u7bad\u36d3\ua3b4\u7043\uc238\ubefe, this:\u760c\uc29a\u3c25\u7ce1\u98a4\u47c2, p0:\u8389\ub18d\u6b5f\u67e9\uc229\ua61f)
            putfield:\u8258\ub19c\u0b8e\u98a4\u0800\ud217(\u760c\uc29a\u3c25\u7ce1\u98a4\u47c2::\ub19c\u51fa\u183a\ucfaf\u59ec\u71f1, this:\u760c\uc29a\u3c25\u7ce1\u98a4\u47c2, p1:\u8258\ub19c\u0b8e\u98a4\u0800\ud217)
            putfield:\ub8be\u071d\u527a\u3711\ubff1\u759a(\u760c\uc29a\u3c25\u7ce1\u98a4\u47c2::\u93a2\ucfaf\u873d\u3504\uc229\uc31c, this:\u760c\uc29a\u3c25\u7ce1\u98a4\u47c2, p2:\ub8be\u071d\u527a\u3711\ubff1\u759a)
            invokespecial:ChannelInitializer(ChannelInitializer::<init>, this:\u760c\uc29a\u3c25\u7ce1\u98a4\u47c2)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void initChannel(io.netty.channel.Channel p0) {
        var_2_AE : int
        stack_FC_0 : ChannelPipeline [generated]
        expr_E8 : ChannelHandler[] [generated]
        
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
            var_2_AE = and:int(ldc:int(1327991008), ldc:int(-302125344))
            
            loop {
                try {
                    while (cmpeq:boolean(and:int(var_2_AE:int, ldc:int(4096)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_2_AE:int, ldc:int(4096)), ldc:int(0))) {
                            var_2_AE = and:int(var_2_AE:int, ldc:int(1711426744))
                        }
                        else {
                            var_2_AE = and:int(var_2_AE:int, ldc:int(1822814845))
                            invokeinterface:boolean(ChannelConfig::setOption, invokeinterface:ChannelConfig(Channel::config, p0:Channel), getstatic:ChannelOption(ChannelOption::TCP_NODELAY), invokestatic:Boolean[expected:Object](Boolean::valueOf, and:int[expected:boolean](ldc:int(4129), ldc:int(1109))))
                        }
                        
                        Label_0148:
                        
                        if (cmpeq:boolean(and:int(var_2_AE:int, ldc:int(64)), ldc:int(0))) {
                            looporswitchbreak()
                        }
                        
                        if (cmpne:boolean(and:int(var_2_AE:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0170)
                        }
                        
                        var_2_AE = and:int(var_2_AE:int, ldc:int(2038475396))
                    }
                    
                    goto(Label_0184)
                    Label_0170:
                    var_2_AE = and:int(var_2_AE:int, ldc:int(1759885035))
                }
                catch (io.netty.channel.ChannelException stack_B6_0) {
                }
                
                Label_0184:
                
                if (cmpeq:boolean(and:int(var_2_AE:int, ldc:int(134217728)), ldc:int(0))) {
                    var_2_AE = and:int(var_2_AE:int, ldc:int(-1738131840))
                    goto(Label_0148)
                }
                
                if (cmpeq:boolean(and:int(var_2_AE:int, ldc:int(2)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_2_AE = and:int(var_2_AE:int, ldc:int(-550171791))
            }
            
            stack_FC_0 = invokeinterface:ChannelPipeline(Channel::pipeline, p0:Channel)
            expr_E8 = newarray:ChannelHandler[](io.netty.channel.ChannelHandler.class, xor:int(ldc:int(4928), ldc:int(4929)))
            storeelement:ChannelHandler(expr_E8:ChannelHandler[], and:int(ldc:int(1528), ldc:int(-17913)), initobject:\u1833\ube23\u836c\u8389\u516c\u9033[expected:ChannelHandler](\u1833\ube23\u836c\u8389\u516c\u9033::<init>, this:\u760c\uc29a\u3c25\u7ce1\u98a4\u47c2))
            invokeinterface:ChannelPipeline(ChannelPipeline::addLast, stack_FC_0:ChannelPipeline, expr_E8:ChannelHandler[])
            return:void()
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
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u8709\u3d4b\u5db4\ub83f\u8d98\uc238(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_615 : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
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
        var_3_615 = and:int(ldc:int(-2056309778), ldc:int(-1209377809))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u760c\uc29a\u3c25\u7ce1\u98a4\u47c2[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_615:int, ldc:int(1073741824)), ldc:int(0))) {
            var_3_615 = and:int(var_3_615:int, ldc:int(-2045536669))
        }
        else {
            var_3_615 = and:int(var_3_615:int, ldc:int(-437422193))
            var_5_85 = and:int(ldc:int(-14560), ldc:int(12495))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(27012), ldc:int(-31638)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_615:int, ldc:int(-538471465))
                    var_9_C1 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_8C:int, xor:int(ldc:int(1028), ldc:int(1029)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, xor:int(ldc:int(156), ldc:int(157)))), var_7_9B:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_615 = and:int(var_3_D2:int, ldc:int(1575524335))
                    var_14_10D = var_7_9B:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), and:int(ldc:int(385), ldc:int(19459)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_8C:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(-571723561))
                        goto(Label_1426)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1284)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1154)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1051)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0897)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0762)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0636)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(1131210316))
                        goto(Label_0517)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(224458742))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0517)
                            }
                            
                            goto(Label_0762)
                        }
                    }
                    
                    Label_0373:
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1426)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(-1759457012))
                        goto(Label_1284)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1154)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(1947641236))
                        goto(Label_1051)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0897)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0762)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0636)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(-840436698))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_615:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_615 = and:int(var_3_615:int, ldc:int(-571966482))
                            var_11_E3 = and:int(ldc:int(217), ldc:int(-218))
                            goto(Label_1415)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0517:
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1426)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(-422860368))
                        goto(Label_1284)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(411797715))
                        goto(Label_1154)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1051)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(-318774440))
                        goto(Label_0897)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0762)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(256)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(-254709366))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0373)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_615:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_615 = and:int(var_3_615:int, ldc:int(524967023))
                            loopcontinue()
                        }
                        
                        var_3_615 = and:int(var_3_615:int, ldc:int(1306927095))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0762)
                        }
                    }
                    
                    Label_0636:
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(-1121657007))
                        goto(Label_1426)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(61102089))
                        goto(Label_1284)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(-1742429202))
                        goto(Label_1154)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(-427064288))
                        goto(Label_1051)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0897)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(2048)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0517)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_615:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_615 = and:int(var_3_615:int, ldc:int(-1512829718))
                            goto(Label_0373)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(4194304)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_615 = and:int(var_3_615:int, ldc:int(896170966))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0762:
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(1124285126))
                        goto(Label_1426)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1284)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(-1632397482))
                        goto(Label_1154)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(-733909993))
                        goto(Label_1051)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(918911473))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(256)), ldc:int(0))) {
                            var_3_615 = and:int(var_3_615:int, ldc:int(1735443606))
                            goto(Label_0636)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_615:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0517)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_615 = and:int(var_3_615:int, ldc:int(-916974331))
                            goto(Label_0373)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_615:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_615 = and:int(var_3_615:int, ldc:int(493221247))
                            loopcontinue()
                        }
                        
                        var_3_615 = and:int(var_3_615:int, ldc:int(-2056809521))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_E3 = and:int(ldc:int(18945), ldc:int(4353))
                                goto(Label_1051)
                            }
                        }
                    }
                    
                    Label_0897:
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(885954212))
                        goto(Label_1426)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1284)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(-855079708))
                        goto(Label_1154)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(256)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(-1086872812))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(512)), ldc:int(0))) {
                            var_3_615 = and:int(var_3_615:int, ldc:int(-1430912824))
                            goto(Label_0762)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0636)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0517)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_615 = and:int(var_3_615:int, ldc:int(160632343))
                            goto(Label_0373)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(256)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_615 = and:int(var_3_615:int, ldc:int(-538651730))
                        var_11_E3 = and:int(ldc:int(6184), ldc:int(-6185))
                    }
                    
                    Label_1051:
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1426)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(256)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(561977178))
                        goto(Label_1284)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(256)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(256)), ldc:int(0))) {
                            var_3_615 = and:int(var_3_615:int, ldc:int(-222452068))
                            goto(Label_0897)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_615:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_615 = and:int(var_3_615:int, ldc:int(940024022))
                            goto(Label_0762)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0636)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0517)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_615:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0373)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_615:int, ldc:int(1073741824)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_615 = and:int(var_3_615:int, ldc:int(100078590))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1284)
                            }
                        }
                    }
                    
                    Label_1154:
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1426)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(-1454577982))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_1051)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_615:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_615 = and:int(var_3_615:int, ldc:int(271357071))
                            goto(Label_0897)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_615 = and:int(var_3_615:int, ldc:int(1134274131))
                            goto(Label_0762)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_615:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_615 = and:int(var_3_615:int, ldc:int(-810164043))
                            goto(Label_0636)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_615:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0517)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_615 = and:int(var_3_615:int, ldc:int(87577196))
                            goto(Label_0373)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_615 = and:int(var_3_615:int, ldc:int(1308234631))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_85:int, var_16_111:int)
                            goto(Label_1415)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1284:
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(1296269664))
                        goto(Label_1426)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(352360091))
                        goto(Label_1154)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1051)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(-1489018544))
                        goto(Label_0897)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(769646720))
                        goto(Label_0762)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0636)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0517)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0373)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(-1556251276))
                        loopcontinue()
                    }
                    
                    var_3_615 = and:int(var_3_615:int, ldc:int(-973925393))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1415:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_620 = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1426:
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(-116318522))
                        goto(Label_1284)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1154)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(-476663293))
                        goto(Label_1051)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(1093640709))
                        goto(Label_0897)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(2)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(1078855198))
                        goto(Label_0762)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(1115109164))
                        goto(Label_0636)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0517)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(-1403467185))
                        goto(Label_0373)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(256)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(669587415))
                        var_17_620 = add:int(var_16_111:int, xor:int(ldc:int(513), ldc:int(512)))
                        looporswitchbreak()
                    }
                    
                    var_3_615 = and:int(var_3_615:int, ldc:int(1977080512))
                }
                
                var_3_615 = and:int(var_3_615:int, ldc:int(1568406470))
                
                if (cmple:boolean(var_5_85 = var_17_620:int, sub:int(var_6_8C:int, and:int(ldc:int(4097), ldc:int(1805))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(134217728)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
