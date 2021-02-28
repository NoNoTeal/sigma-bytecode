public final class \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u3711\ud12e\ub83f\u12cb\ud36e {
    public void \u3711\ud12e\ub83f\u12cb\ud36e(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u527a\u494c\u88c5\u965f\u759a p0) {
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
            putfield:\u527a\u494c\u88c5\u965f\u759a(\u3711\ud12e\ub83f\u12cb\ud36e::\ua61f\u0800\u3e2a\u71ae\u6d99\ub102, this:\u3711\ud12e\ub83f\u12cb\ud36e, p0:\u527a\u494c\u88c5\u965f\u759a)
            invokespecial:ChannelInitializer(ChannelInitializer::<init>, this:\u3711\ud12e\ub83f\u12cb\ud36e)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void initChannel(io.netty.channel.Channel p0) {
        var_2_5F : int
        
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
            var_2_5F = and:int(ldc:int(499451314), ldc:int(-1622811722))
            
            loop {
                try {
                    while (cmpeq:boolean(and:int(var_2_5F:int, ldc:int(4096)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_2_5F:int, ldc:int(16777216)), ldc:int(0))) {
                            var_2_5F = and:int(var_2_5F:int, ldc:int(2102855586))
                            invokeinterface:boolean(ChannelConfig::setOption, invokeinterface:ChannelConfig(Channel::config, p0:Channel), getstatic:ChannelOption(ChannelOption::TCP_NODELAY), invokestatic:Boolean[expected:Object](Boolean::valueOf, and:int[expected:boolean](ldc:int(1), ldc:int(1151))))
                        }
                        
                        Label_0148:
                        
                        if (cmpeq:boolean(and:int(var_2_5F:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0176)
                        }
                        
                        if (cmpne:boolean(and:int(var_2_5F:int, ldc:int(268435456)), ldc:int(0))) {
                            var_2_5F = and:int(var_2_5F:int, ldc:int(-705307661))
                            goto(Label_0176)
                        }
                    }
                    
                    var_2_5F = and:int(var_2_5F:int, ldc:int(758606433))
                }
                catch (io.netty.channel.ChannelException stack_AE_0) {
                }
                
                Label_0176:
                
                if (cmpeq:boolean(and:int(var_2_5F:int, ldc:int(16777216)), ldc:int(0))) {
                    var_2_5F = and:int(var_2_5F:int, ldc:int(-1305775219))
                    goto(Label_0148)
                }
                
                if (cmpne:boolean(and:int(var_2_5F:int, ldc:int(262144)), ldc:int(0))) {
                    looporswitchbreak()
                }
            }
            
            invokeinterface:ChannelPipeline(ChannelPipeline::addLast, invokeinterface:ChannelPipeline(ChannelPipeline::addLast, invokeinterface:ChannelPipeline(ChannelPipeline::addLast, invokeinterface:ChannelPipeline(ChannelPipeline::addLast, invokeinterface:ChannelPipeline(ChannelPipeline::addLast, invokeinterface:ChannelPipeline(ChannelPipeline::addLast, invokeinterface:ChannelPipeline(Channel::pipeline, p0:Channel), loadelement:String(getstatic:String[](\u3711\ud12e\ub83f\u12cb\ud36e::\u8389\u624e\u61a4\ub113\u76bc\u7006), and:int(ldc:int(18866), ldc:int(-18871))), initobject:ReadTimeoutHandler[expected:ChannelHandler](ReadTimeoutHandler::<init>, ldc:int(30))), loadelement:String(getstatic:String[](\u3711\ud12e\ub83f\u12cb\ud36e::\u8389\u624e\u61a4\ub113\u76bc\u7006), xor:int(ldc:int(17668), ldc:int(17669))), initobject:\u6b5f\u8c8a\u4975\u8709\ud158[expected:ChannelHandler](\u6b5f\u8c8a\u4975\u8709\ud158::<init>)), loadelement:String(getstatic:String[](\u3711\ud12e\ub83f\u12cb\ud36e::\u8389\u624e\u61a4\ub113\u76bc\u7006), xor:int(ldc:int(1280), ldc:int(1282))), initobject:\uc9f6\u9a18\u71f1\ua068\u416d[expected:ChannelHandler](\uc9f6\u9a18\u71f1\ua068\u416d::<init>, getstatic:\uc87f\u92ff\u416d\u1833\uc84e(\uc87f\u92ff\u416d\u1833\uc84e::\u64ab\u873d\u6bb9\u7c6b\u6b0d\ua61f))), loadelement:String(getstatic:String[](\u3711\ud12e\ub83f\u12cb\ud36e::\u8389\u624e\u61a4\ub113\u76bc\u7006), and:int(ldc:int(29319), ldc:int(1339))), initobject:\uc9f6\u3c25\ub19c\ua3b4\u8c8a[expected:ChannelHandler](\uc9f6\u3c25\ub19c\ua3b4\u8c8a::<init>)), loadelement:String(getstatic:String[](\u3711\ud12e\ub83f\u12cb\ud36e::\u8389\u624e\u61a4\ub113\u76bc\u7006), and:int(ldc:int(4108), ldc:int(18550))), initobject:\ub6ab\u56bd\ub18d\uf995\ud7e8[expected:ChannelHandler](\ub6ab\u56bd\ub18d\uf995\ud7e8::<init>, getstatic:\uc87f\u92ff\u416d\u1833\uc84e(\uc87f\u92ff\u416d\u1833\uc84e::\u7d52\u9255\ub102\u3504\u72f1\u2dcc))), loadelement:String(getstatic:String[](\u3711\ud12e\ub83f\u12cb\ud36e::\u8389\u624e\u61a4\ub113\u76bc\u7006), xor:int(ldc:int(4115), ldc:int(4118))), getfield:\u527a\u494c\u88c5\u965f\u759a[expected:ChannelHandler](\u3711\ud12e\ub83f\u12cb\ud36e::\ua61f\u0800\u3e2a\u71ae\u6d99\ub102, this:\u3711\ud12e\ub83f\u12cb\ud36e))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_5F : int
        expr_65 : byte[] [generated]
        stack_95_0 : byte[] [generated]
        stack_97_0 : byte[] [generated]
        stack_B3_0 : byte[] [generated]
        stack_B5_0 : byte[] [generated]
        stack_CE_0 : byte[] [generated]
        stack_21E_0 : byte[] [generated]
        stack_273_0 : byte[] [generated]
        expr_6B : int [generated]
        var_4_19B : int
        var_3_1A0 : byte[]
        var_5_1A1 : int
        var_0_1A7 : int
        expr_1B1 : byte [generated]
        stack_1ED_2 : byte [generated]
        stack_1CC_0 : byte [generated]
        var_2_95 : byte[]
        expr_99 : int [generated]
        var_3_20D : byte[]
        var_5_20E : int
        expr_B5 : int [generated]
        var_3_262 : byte[]
        var_5_263 : int
        expr_276 : byte [generated]
        var_3_DA : String
        stack_194_0 : String[] [generated]
        expr_EC : String[] [generated]
        
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
            var_0_5F = and:int(ldc:int(1015388556), ldc:int(243965834))
            expr_65 = stack_95_0 = stack_97_0 = stack_B3_0 = stack_B5_0 = stack_CE_0 = stack_21E_0 = stack_273_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("AAD9WOgY07wc/WVUGOOzrRG0EOfTcPAxUTlA+POPvPPVdVFc26Tw5CVA86Drq9FdXzMa3rw="))
            expr_6B = arraylength:int(expr_65:byte[])
            
            if (cmpne:boolean(expr_6B:int, ldc:int(0))) {
                var_4_19B = expr_6B:int
                var_3_1A0 = newarray:byte[](byte.class, expr_6B:int)
                var_5_1A1 = expr_6B:int
                
                loop {
                    var_0_1A7 = and:int(var_0_5F:int, ldc:int(-840238114))
                    var_5_1A1 = add:int(var_5_1A1:int, ldc:int(-1))
                    expr_1B1 = stack_1ED_2 = loadelement(expr_65, var_5_1A1)
                    
                    if (cmplt:boolean(add:int(add:int(var_5_1A1:int, ldc:int(4)), neg:int(var_4_19B:int)), ldc:int(0))) {
                        stack_1ED_2 = stack_1CC_0 = add:byte(expr_1B1:byte, loadelement:byte(var_3_1A0:byte[], add:int(var_5_1A1:int, ldc:int(4))))
                        goto(Label_0476)
                    }
                    
                    Label_0446:
                    
                    if (cmpne:boolean(and:int(var_0_1A7:int, ldc:int(67108864)), ldc:int(0))) {
                        var_0_1A7 = and:int(var_0_1A7:int, ldc:int(1853959594))
                        stack_1ED_2 = stack_1CC_0 = add:byte(expr_1B1:byte, ldc:byte(4))
                    }
                    
                    Label_0476:
                    
                    if (cmpeq:boolean(and:int(var_0_1A7:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0446)
                    }
                    
                    var_0_5F = and:int(var_0_1A7:int, ldc:int(526905228))
                    storeelement:byte(var_3_1A0:byte[], var_5_1A1:int, stack_1ED_2:byte)
                    
                    if (cmpne:boolean(var_5_1A1:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_97_0 = stack_95_0 = stack_B3_0 = stack_B5_0 = stack_CE_0 = stack_21E_0 = stack_273_0 = var_3_1A0:byte[]
            }
            
            loop {
                if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(2048)), ldc:int(0))) {
                    var_0_5F = and:int(var_0_5F:int, ldc:int(-385519127))
                    goto(Label_0186)
                }
                
                if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(256)), ldc:int(0))) {
                    var_0_5F = and:int(var_0_5F:int, ldc:int(-742861953))
                }
                else {
                    var_0_5F = and:int(var_0_5F:int, ldc:int(-545538661))
                    var_2_95 = stack_95_0:byte[]
                    expr_99 = add:int(arraylength:int(stack_97_0:byte[]), ldc:int(-1))
                    
                    if (cmpne:boolean(expr_99:int, ldc:int(0))) {
                        var_3_20D = newarray:byte[](byte.class, expr_99:int)
                        var_5_20E = expr_99:int
                        
                        loop {
                            var_0_5F = and:int(var_0_5F:int, ldc:int(1573428683))
                            var_5_20E = add:int(var_5_20E:int, ldc:int(-1))
                            storeelement:byte(var_3_20D:byte[], var_5_20E:int, add:int(shl:int(loadelement:byte(stack_21E_0:byte[], var_5_20E:int), ldc:int(2)), and:int(shr:int(loadelement:byte(var_2_95:byte[], add:int(var_5_20E:int, and:int(ldc:int(16913), ldc:int(12487)))), ldc:int(6)), xor:int(ldc:int(-32703), ldc:int(-32702)))))
                            
                            if (cmpne:boolean(var_5_20E:int, ldc:int(0))) {
                                loopcontinue()
                            }
                            
                            looporswitchbreak()
                        }
                        
                        stack_97_0 = stack_95_0 = stack_B3_0 = stack_B5_0 = stack_CE_0 = stack_21E_0 = stack_273_0 = var_3_20D:byte[]
                    }
                }
                
                Label_0158:
                
                if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(2)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(67108864)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_0_5F = and:int(var_0_5F:int, ldc:int(226515898))
                    expr_B5 = arraylength:int(stack_B5_0:byte[])
                    
                    if (cmpne:boolean(expr_B5:int, ldc:int(0))) {
                        var_3_262 = newarray:byte[](byte.class, expr_B5:int)
                        var_5_263 = expr_B5:int
                        
                        loop {
                            var_0_5F = and:int(var_0_5F:int, ldc:int(495500799))
                            var_5_263 = add:int(var_5_263:int, ldc:int(-1))
                            expr_276 = add:byte(loadelement:byte(stack_273_0:byte[], var_5_263:int), ldc:byte(103))
                            storeelement:byte(var_3_262:byte[], var_5_263:int, xor:int(or:int(and:int(shl:int(expr_276:byte, xor:int(ldc:int(2306), ldc:int(2310))), ldc:int(-16)), and:int(shr:int(expr_276:byte[expected:int], and:int(ldc:int(8197), ldc:int(6228))), ldc:int(15))), ldc:int(91)))
                            
                            if (cmpne:boolean(var_5_263:int, ldc:int(0))) {
                                loopcontinue()
                            }
                            
                            looporswitchbreak()
                        }
                        
                        stack_97_0 = stack_95_0 = stack_B3_0 = stack_B5_0 = stack_CE_0 = stack_21E_0 = stack_273_0 = var_3_262:byte[]
                    }
                }
                
                Label_0186:
                
                if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(128)), ldc:int(0))) {
                    goto(Label_0158)
                }
                
                if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(16)), ldc:int(0))) {
                    looporswitchbreak()
                }
            }
            
            var_3_DA = initobject:String(String::<init>, stack_CE_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_194_0 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(4614), ldc:int(423)))
            expr_EC = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(8366), ldc:int(1287)))
            storeelement:String(expr_EC:String[], xor:int(ldc:int(9346), ldc:int(9344)), invokevirtual:String[expected:String](String::substring, var_3_DA:String, and:int(ldc:int(-3962), ldc:int(3929)), and:int(ldc:int(599), ldc:int(8359))))
            storeelement:String(expr_EC:String[], and:int(ldc:int(36), ldc:int(8204)), invokevirtual:String[expected:String](String::substring, var_3_DA:String, xor:int(ldc:int(2240), ldc:int(2247)), and:int(ldc:int(1038), ldc:int(24878))))
            storeelement:String(expr_EC:String[], and:int(ldc:int(28685), ldc:int(199)), invokevirtual:String[expected:String](String::substring, var_3_DA:String, xor:int(ldc:int(559), ldc:int(545)), xor:int(ldc:int(1083), ldc:int(1063))))
            storeelement:String(expr_EC:String[], and:int(ldc:int(2307), ldc:int(24595)), invokevirtual:String[expected:String](String::substring, var_3_DA:String, xor:int(ldc:int(515), ldc:int(543)), xor:int(ldc:int(6450), ldc:int(6423))))
            storeelement:String(expr_EC:String[], xor:int(ldc:int(-22016), ldc:int(-22015)), invokevirtual:String[expected:String](String::substring, var_3_DA:String, and:int(ldc:int(3621), ldc:int(61)), xor:int(ldc:int(16536), ldc:int(16565))))
            storeelement:String(expr_EC:String[], and:int(ldc:int(3937), ldc:int(-3946)), invokevirtual:String[expected:String](String::substring, var_3_DA:String, xor:int(ldc:int(28678), ldc:int(28715)), xor:int(ldc:int(12384), ldc:int(12372))))
            putstatic:String[](\u3711\ud12e\ub83f\u12cb\ud36e::\u8389\u624e\u61a4\ub113\u76bc\u7006, expr_EC:String[])
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \ub70c\u392e\u6d99\ub83f\ucef1\ubff1(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_65C : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_667 : int
        
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
        var_3_65C = and:int(ldc:int(574680984), ldc:int(-766484583))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u3711\ud12e\ub83f\u12cb\ud36e[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(4)), ldc:int(0))) {
            var_3_65C = and:int(var_3_65C:int, ldc:int(147663552))
        }
        else {
            var_3_65C = and:int(var_3_65C:int, ldc:int(2127642586))
            var_5_85 = and:int(ldc:int(16922), ldc:int(-25179))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-13632), ldc:int(13362)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_65C:int, ldc:int(-229073127))
                    var_9_C1 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_8C:int, xor:int(ldc:int(-24576), ldc:int(-24575)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, and:int(ldc:int(1445), ldc:int(1)))), var_7_9B:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_65C = and:int(var_3_D2:int, ldc:int(-890110115))
                    var_14_10D = var_7_9B:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), and:int(ldc:int(2065), ldc:int(1897)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_8C:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(4)), ldc:int(0))) {
                        var_3_65C = and:int(var_3_65C:int, ldc:int(204445790))
                        goto(Label_1514)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(512)), ldc:int(0))) {
                        var_3_65C = and:int(var_3_65C:int, ldc:int(-1566006377))
                        goto(Label_1365)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1227)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1109)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0928)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0784)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0650)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0533)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(256)), ldc:int(0))) {
                        var_3_65C = and:int(var_3_65C:int, ldc:int(-1960531838))
                    }
                    else {
                        var_3_65C = and:int(var_3_65C:int, ldc:int(-364154980))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0533)
                            }
                            
                            goto(Label_0784)
                        }
                    }
                    
                    Label_0381:
                    
                    if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1514)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_65C = and:int(var_3_65C:int, ldc:int(-749446180))
                        goto(Label_1365)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1227)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(256)), ldc:int(0))) {
                        var_3_65C = and:int(var_3_65C:int, ldc:int(-1732413929))
                        goto(Label_1109)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0928)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0784)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(64)), ldc:int(0))) {
                        var_3_65C = and:int(var_3_65C:int, ldc:int(-1804612620))
                        goto(Label_0650)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(4194304)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(512)), ldc:int(0))) {
                            var_3_65C = and:int(var_3_65C:int, ldc:int(1901419419))
                            loopcontinue()
                        }
                        
                        var_3_65C = and:int(var_3_65C:int, ldc:int(-1099620390))
                        var_11_E3 = and:int(ldc:int(-12927), ldc:int(12412))
                        goto(Label_1503)
                    }
                    
                    Label_0533:
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_65C = and:int(var_3_65C:int, ldc:int(-1796382764))
                        goto(Label_1514)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_65C = and:int(var_3_65C:int, ldc:int(1862614459))
                        goto(Label_1365)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1227)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1109)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(4)), ldc:int(0))) {
                        var_3_65C = and:int(var_3_65C:int, ldc:int(-1000315105))
                        goto(Label_0928)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0784)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(16)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_65C = and:int(var_3_65C:int, ldc:int(1745725179))
                            loopcontinue()
                        }
                        
                        var_3_65C = and:int(var_3_65C:int, ldc:int(115928954))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0784)
                        }
                    }
                    
                    Label_0650:
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(64)), ldc:int(0))) {
                        var_3_65C = and:int(var_3_65C:int, ldc:int(886076803))
                        goto(Label_1514)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1365)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_65C = and:int(var_3_65C:int, ldc:int(-260980753))
                        goto(Label_1227)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(512)), ldc:int(0))) {
                        var_3_65C = and:int(var_3_65C:int, ldc:int(16527482))
                        goto(Label_1109)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0928)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_65C = and:int(var_3_65C:int, ldc:int(2110724987))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0533)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_65C = and:int(var_3_65C:int, ldc:int(11641214))
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(8)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_65C = and:int(var_3_65C:int, ldc:int(-479641698))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0784:
                    
                    if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1514)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(64)), ldc:int(0))) {
                        var_3_65C = and:int(var_3_65C:int, ldc:int(-1933142081))
                        goto(Label_1365)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_65C = and:int(var_3_65C:int, ldc:int(-1191140716))
                        goto(Label_1227)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_65C = and:int(var_3_65C:int, ldc:int(-136660924))
                        goto(Label_1109)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(64)), ldc:int(0))) {
                        var_3_65C = and:int(var_3_65C:int, ldc:int(311624284))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(512)), ldc:int(0))) {
                            var_3_65C = and:int(var_3_65C:int, ldc:int(-1111634350))
                            goto(Label_0650)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0533)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_65C = and:int(var_3_65C:int, ldc:int(333457637))
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_65C = and:int(var_3_65C:int, ldc:int(1756433549))
                            loopcontinue()
                        }
                        
                        var_3_65C = and:int(var_3_65C:int, ldc:int(1583529817))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_E3 = and:int(ldc:int(12305), ldc:int(2089))
                                goto(Label_1109)
                            }
                        }
                    }
                    
                    Label_0928:
                    
                    if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1514)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(4)), ldc:int(0))) {
                        var_3_65C = and:int(var_3_65C:int, ldc:int(-253879087))
                        goto(Label_1365)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_65C = and:int(var_3_65C:int, ldc:int(-1859555173))
                        goto(Label_1227)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_65C = and:int(var_3_65C:int, ldc:int(1364774443))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(4)), ldc:int(0))) {
                            var_3_65C = and:int(var_3_65C:int, ldc:int(-1642608382))
                            goto(Label_0784)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0650)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_65C = and:int(var_3_65C:int, ldc:int(1993663262))
                            goto(Label_0533)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(8)), ldc:int(0))) {
                            var_3_65C = and:int(var_3_65C:int, ldc:int(-839543723))
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(64)), ldc:int(0))) {
                            var_3_65C = and:int(var_3_65C:int, ldc:int(373048339))
                            loopcontinue()
                        }
                        
                        var_3_65C = and:int(var_3_65C:int, ldc:int(2012852088))
                        var_11_E3 = and:int(ldc:int(21528), ldc:int(-32541))
                    }
                    
                    Label_1109:
                    
                    if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1514)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(4)), ldc:int(0))) {
                        var_3_65C = and:int(var_3_65C:int, ldc:int(-1567796196))
                        goto(Label_1365)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(1024)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_65C = and:int(var_3_65C:int, ldc:int(-700159742))
                            goto(Label_0928)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0784)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(64)), ldc:int(0))) {
                            var_3_65C = and:int(var_3_65C:int, ldc:int(-1898405112))
                            goto(Label_0650)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(32)), ldc:int(0))) {
                            var_3_65C = and:int(var_3_65C:int, ldc:int(-2073431736))
                            goto(Label_0533)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(256)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_65C = and:int(var_3_65C:int, ldc:int(-363937956))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1365)
                            }
                        }
                    }
                    
                    Label_1227:
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(2)), ldc:int(0))) {
                        var_3_65C = and:int(var_3_65C:int, ldc:int(-1754216645))
                        goto(Label_1514)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(256)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_65C = and:int(var_3_65C:int, ldc:int(1106740074))
                            goto(Label_1109)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(2)), ldc:int(0))) {
                            var_3_65C = and:int(var_3_65C:int, ldc:int(45055452))
                            goto(Label_0928)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_65C = and:int(var_3_65C:int, ldc:int(-159136383))
                            goto(Label_0784)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0650)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0533)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_65C = and:int(var_3_65C:int, ldc:int(689266581))
                            loopcontinue()
                        }
                        
                        var_3_65C = and:int(var_3_65C:int, ldc:int(1851404091))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_85:int, var_16_111:int)
                        goto(Label_1503)
                    }
                    
                    Label_1365:
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(64)), ldc:int(0))) {
                        var_3_65C = and:int(var_3_65C:int, ldc:int(-1355053485))
                        goto(Label_1514)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1227)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1109)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(256)), ldc:int(0))) {
                        var_3_65C = and:int(var_3_65C:int, ldc:int(1798973395))
                        goto(Label_0928)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(512)), ldc:int(0))) {
                        var_3_65C = and:int(var_3_65C:int, ldc:int(713638617))
                        goto(Label_0784)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_65C = and:int(var_3_65C:int, ldc:int(994775116))
                        goto(Label_0650)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_65C = and:int(var_3_65C:int, ldc:int(299097595))
                        goto(Label_0533)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0381)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(4194304)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_65C = and:int(var_3_65C:int, ldc:int(-1963110501))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1503:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_667 = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1514:
                    
                    if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_65C = and:int(var_3_65C:int, ldc:int(2079647322))
                        goto(Label_1365)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1227)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(4)), ldc:int(0))) {
                        var_3_65C = and:int(var_3_65C:int, ldc:int(-1796439756))
                        goto(Label_1109)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_65C = and:int(var_3_65C:int, ldc:int(-2069535849))
                        goto(Label_0928)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_65C = and:int(var_3_65C:int, ldc:int(2006285151))
                        goto(Label_0784)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_65C = and:int(var_3_65C:int, ldc:int(-356931201))
                        goto(Label_0650)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0533)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0381)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_65C = and:int(var_3_65C:int, ldc:int(-1301610695))
                        var_17_667 = add:int(var_16_111:int, xor:int(ldc:int(20552), ldc:int(20553)))
                        looporswitchbreak()
                    }
                }
                
                var_3_65C = and:int(var_3_65C:int, ldc:int(-1546657926))
                
                if (cmple:boolean(var_5_85 = var_17_667:int, sub:int(var_6_8C:int, and:int(ldc:int(387), ldc:int(513))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(33554432)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
