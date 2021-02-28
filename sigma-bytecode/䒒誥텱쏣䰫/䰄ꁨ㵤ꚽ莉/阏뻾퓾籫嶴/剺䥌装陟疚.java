public class \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u527a\u494c\u88c5\u965f\u759a {
    public void \u527a\u494c\u88c5\u965f\u759a(\u56bd\u8413\u647c\u5bc4\ud158.\uc87f\u92ff\u416d\u1833\uc84e p0) {
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
            invokespecial:SimpleChannelInboundHandler(SimpleChannelInboundHandler::<init>, this:\u527a\u494c\u88c5\u965f\u759a)
            putfield:Queue<\u62da\ubf56\u52d3\u718f\u446c>(\u527a\u494c\u88c5\u965f\u759a::\u61a4\u600f\u7873\uc910\u1833\ub102, this:\u527a\u494c\u88c5\u965f\u759a, invokestatic:ConcurrentLinkedQueue[expected:Queue<\u62da\ubf56\u52d3\u718f\u446c>](Queues::newConcurrentLinkedQueue))
            putfield:\uc87f\u92ff\u416d\u1833\uc84e(\u527a\u494c\u88c5\u965f\u759a::\u7bad\ud4fe\u839e\u4f4a\ubb2b\u8640, this:\u527a\u494c\u88c5\u965f\u759a, p0:\uc87f\u92ff\u416d\u1833\uc84e)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void channelActive(io.netty.channel.ChannelHandlerContext p0) {
        var_2_23F : int
        var_4_239 : Throwable
        
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
            var_2_23F = and:int(ldc:int(-601365926), ldc:int(-1623321217))
            
            loop {
                Label_0096:
                
                if (cmpeq:boolean(and:int(var_2_23F:int, ldc:int(2147483647)), ldc:int(0))) {
                    goto(Label_0498)
                }
                
                if (cmpne:boolean(and:int(var_2_23F:int, ldc:int(128)), ldc:int(0))) {
                    goto(Label_0403)
                }
                
                if (cmpeq:boolean(and:int(var_2_23F:int, ldc:int(2097152)), ldc:int(0))) {
                    var_2_23F = and:int(var_2_23F:int, ldc:int(-1199185126))
                    goto(Label_0324)
                }
                
                if (cmpeq:boolean(and:int(var_2_23F:int, ldc:int(134217728)), ldc:int(0))) {
                    var_2_23F = and:int(var_2_23F:int, ldc:int(1636226704))
                    goto(Label_0239)
                }
                
                if (cmpeq:boolean(and:int(var_2_23F:int, ldc:int(1)), ldc:int(0))) {
                    var_2_23F = and:int(var_2_23F:int, ldc:int(2091455450))
                    invokespecial:void(SimpleChannelInboundHandler::channelActive, this:\u527a\u494c\u88c5\u965f\u759a[expected:SimpleChannelInboundHandler], p0:ChannelHandlerContext)
                }
                
                Label_0157:
                
                if (cmpeq:boolean(and:int(var_2_23F:int, ldc:int(268435456)), ldc:int(0))) {
                    goto(Label_0498)
                }
                
                if (cmpeq:boolean(and:int(var_2_23F:int, ldc:int(2)), ldc:int(0))) {
                    var_2_23F = and:int(var_2_23F:int, ldc:int(-606265675))
                    goto(Label_0403)
                }
                
                if (cmpeq:boolean(and:int(var_2_23F:int, ldc:int(64)), ldc:int(0))) {
                    var_2_23F = and:int(var_2_23F:int, ldc:int(-1389467157))
                    goto(Label_0324)
                }
                
                if (cmpne:boolean(and:int(var_2_23F:int, ldc:int(1)), ldc:int(0))) {
                    var_2_23F = and:int(var_2_23F:int, ldc:int(89972570))
                }
                else {
                    if (cmpne:boolean(and:int(var_2_23F:int, ldc:int(33554432)), ldc:int(0))) {
                        var_2_23F = and:int(var_2_23F:int, ldc:int(53346231))
                        loopcontinue()
                    }
                    
                    var_2_23F = and:int(var_2_23F:int, ldc:int(-1074193569))
                    putfield:Channel(\u527a\u494c\u88c5\u965f\u759a::\uc9f6\u120d\u8bb0\u9255\u4cd9\u120d, this:\u527a\u494c\u88c5\u965f\u759a, invokeinterface:Channel(ChannelHandlerContext::channel, p0:ChannelHandlerContext))
                }
                
                Label_0239:
                
                if (cmpeq:boolean(and:int(var_2_23F:int, ldc:int(134217728)), ldc:int(0))) {
                    var_2_23F = and:int(var_2_23F:int, ldc:int(-110294276))
                    goto(Label_0498)
                }
                
                if (cmpne:boolean(and:int(var_2_23F:int, ldc:int(256)), ldc:int(0))) {
                    goto(Label_0403)
                }
                
                if (cmpeq:boolean(and:int(var_2_23F:int, ldc:int(64)), ldc:int(0))) {
                    var_2_23F = and:int(var_2_23F:int, ldc:int(-1235490402))
                    goto(Label_0324)
                }
                
                if (cmpne:boolean(and:int(var_2_23F:int, ldc:int(4096)), ldc:int(0))) {
                    var_2_23F = and:int(var_2_23F:int, ldc:int(-1817523134))
                    goto(Label_0157)
                }
                
                if (cmpne:boolean(and:int(var_2_23F:int, ldc:int(4096)), ldc:int(0))) {
                    var_2_23F = and:int(var_2_23F:int, ldc:int(-1915990163))
                    loopcontinue()
                }
                
                var_2_23F = and:int(var_2_23F:int, ldc:int(-1129741313))
                putfield:SocketAddress(\u527a\u494c\u88c5\u965f\u759a::\ub8be\u8350\u8c8a\uae5d\ud12e\u4179, this:\u527a\u494c\u88c5\u965f\u759a, invokeinterface:SocketAddress(Channel::remoteAddress, getfield:Channel(\u527a\u494c\u88c5\u965f\u759a::\uc9f6\u120d\u8bb0\u9255\u4cd9\u120d, this:\u527a\u494c\u88c5\u965f\u759a)))
                
                try {
                    loop {
                        Label_0324:
                        
                        if (cmpeq:boolean(and:int(var_2_23F:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0498)
                        }
                        
                        if (cmpeq:boolean(and:int(var_2_23F:int, ldc:int(134217728)), ldc:int(0))) {
                            var_2_23F = and:int(var_2_23F:int, ldc:int(-768121909))
                        }
                        else {
                            if (cmpne:boolean(and:int(var_2_23F:int, ldc:int(1)), ldc:int(0))) {
                                var_2_23F = and:int(var_2_23F:int, ldc:int(774875195))
                                goto(Label_0239)
                            }
                            
                            if (cmpne:boolean(and:int(var_2_23F:int, ldc:int(33554432)), ldc:int(0))) {
                                var_2_23F = and:int(var_2_23F:int, ldc:int(-1547466496))
                                goto(Label_0157)
                            }
                            
                            if (cmpne:boolean(and:int(var_2_23F:int, ldc:int(536870912)), ldc:int(0))) {
                                var_2_23F = and:int(var_2_23F:int, ldc:int(-1663471683))
                                loopcontinue(Label_0096)
                            }
                            
                            var_2_23F = and:int(var_2_23F:int, ldc:int(-559077165))
                            invokevirtual:void(\u527a\u494c\u88c5\u965f\u759a::\u40a9\u718f\u99f7\u4e72\u93a2\u6d69, this:\u527a\u494c\u88c5\u965f\u759a, getstatic:\u392e\uc31c\u3504\u3dd3\u93a2(\u392e\uc31c\u3504\u3dd3\u93a2::\u0a06\uf9c5\u3c25\ub6ab\u5f50\ubff1))
                        }
                        
                        Label_0403:
                        
                        if (cmpne:boolean(and:int(var_2_23F:int, ldc:int(536870912)), ldc:int(0))) {
                            var_2_23F = and:int(var_2_23F:int, ldc:int(1878906903))
                        }
                        else {
                            if (cmpeq:boolean(and:int(var_2_23F:int, ldc:int(16)), ldc:int(0))) {
                                var_2_23F = and:int(var_2_23F:int, ldc:int(-3267309))
                                loopcontinue()
                            }
                            
                            if (cmpeq:boolean(and:int(var_2_23F:int, ldc:int(268435456)), ldc:int(0))) {
                                var_2_23F = and:int(var_2_23F:int, ldc:int(351723643))
                                goto(Label_0239)
                            }
                            
                            if (cmpeq:boolean(and:int(var_2_23F:int, ldc:int(16)), ldc:int(0))) {
                                var_2_23F = and:int(var_2_23F:int, ldc:int(-526827015))
                                goto(Label_0157)
                            }
                            
                            if (cmpeq:boolean(and:int(var_2_23F:int, ldc:int(16)), ldc:int(0))) {
                                var_2_23F = and:int(var_2_23F:int, ldc:int(108720998))
                                loopcontinue(Label_0096)
                            }
                            
                            var_2_23F = and:int(var_2_23F:int, ldc:int(1584087902))
                            putfield:\uff55\u7006\u8cae\u51fa\u7330\u873d(\u527a\u494c\u88c5\u965f\u759a::\ua068\uf995\u4492\u6cfe\ua562\u6435, this:\u527a\u494c\u88c5\u965f\u759a, initobject:\uff55\u7006\u8cae\u51fa\u7330\u873d(\uff55\u7006\u8cae\u51fa\u7330\u873d::<init>, getfield:Channel(\u527a\u494c\u88c5\u965f\u759a::\uc9f6\u120d\u8bb0\u9255\u4cd9\u120d, this:\u527a\u494c\u88c5\u965f\u759a)))
                        }
                        
                        Label_0498:
                        
                        if (cmpne:boolean(and:int(var_2_23F:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0403)
                        }
                        
                        if (cmpne:boolean(and:int(var_2_23F:int, ldc:int(33554432)), ldc:int(0))) {
                            var_2_23F = and:int(var_2_23F:int, ldc:int(-1205560038))
                        }
                        else {
                            if (cmpeq:boolean(and:int(var_2_23F:int, ldc:int(268435456)), ldc:int(0))) {
                                var_2_23F = and:int(var_2_23F:int, ldc:int(1648309357))
                                goto(Label_0239)
                            }
                            
                            if (cmpne:boolean(and:int(var_2_23F:int, ldc:int(256)), ldc:int(0))) {
                                goto(Label_0157)
                            }
                            
                            if (cmpne:boolean(and:int(var_2_23F:int, ldc:int(1)), ldc:int(0))) {
                                var_2_23F = and:int(var_2_23F:int, ldc:int(1616285735))
                                loopcontinue(Label_0096)
                            }
                            
                            var_2_23F = and:int(var_2_23F:int, ldc:int(1064944507))
                            looporswitchbreak()
                        }
                    }
                }
                catch (java.lang.Throwable var_4_239) {
                    var_2_23F = and:int(var_2_23F:int, ldc:int(2105346523))
                    invokeinterface:void(Logger::fatal, getstatic:Logger(\u527a\u494c\u88c5\u965f\u759a::\ub102\uf94d\u34df\u624e\uc31c\uae87), var_4_239:Throwable[expected:Object])
                }
                
                looporswitchbreak()
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u40a9\u718f\u99f7\u4e72\u93a2\u6d69(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u392e\uc31c\u3504\u3dd3\u93a2 p0) {
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
            invokeinterface:void(Attribute::set, invokeinterface:Attribute(Channel::attr, getfield:Channel(\u527a\u494c\u88c5\u965f\u759a::\uc9f6\u120d\u8bb0\u9255\u4cd9\u120d, this:\u527a\u494c\u88c5\u965f\u759a), getstatic:AttributeKey<\u392e\uc31c\u3504\u3dd3\u93a2>(\u527a\u494c\u88c5\u965f\u759a::\u9af2\u416d\ufe34\uc910\ud217\u4f4a)), p0:\u392e\uc31c\u3504\u3dd3\u93a2[expected:Object])
            invokeinterface:ChannelConfig(ChannelConfig::setAutoRead, invokeinterface:ChannelConfig(Channel::config, getfield:Channel(\u527a\u494c\u88c5\u965f\u759a::\uc9f6\u120d\u8bb0\u9255\u4cd9\u120d, this:\u527a\u494c\u88c5\u965f\u759a)), xor:int[expected:boolean](ldc:int(3092), ldc:int(3093)))
            invokeinterface:void(Logger::debug, getstatic:Logger(\u527a\u494c\u88c5\u965f\u759a::\ub102\uf94d\u34df\u624e\uc31c\uae87), loadelement:String(getstatic:String[](\u527a\u494c\u88c5\u965f\u759a::\u12cb\u760c\ud12e\u8df4\u59ec\u76bc), and:int(ldc:int(2104), ldc:int(-2105))))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void channelInactive(io.netty.channel.ChannelHandlerContext p0) {
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
            invokevirtual:void(\u527a\u494c\u88c5\u965f\u759a::\u98a4\uc31c\u6c52\uf995\u62da\u64f2, this:\u527a\u494c\u88c5\u965f\u759a, initobject:TranslationTextComponent[expected:ITextComponent](TranslationTextComponent::<init>, loadelement:String(getstatic:String[](\u527a\u494c\u88c5\u965f\u759a::\u12cb\u760c\ud12e\u8df4\u59ec\u76bc), and:int(ldc:int(18953), ldc:int(13507)))))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void exceptionCaught(io.netty.channel.ChannelHandlerContext p0, java.lang.Throwable p1) {
        var_3_A3 : int
        stack_DC_0 : int [generated]
        var_5_DC : int
        stack_160_1 : String [generated]
        expr_138 : Object[] [generated]
        var_6_163 : TranslationTextComponent
        
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
        var_3_A3 = and:int(ldc:int(1200040189), ldc:int(-541409547))
        
        if (instanceof:boolean(\u4f52\u6cfe\u9a18\uc29a\u3bd6.\u385b\u8640\u5245\ub70c\u67e9.class, p1:Throwable)) {
            invokeinterface:void(Logger::debug, getstatic:Logger(\u527a\u494c\u88c5\u965f\u759a::\ub102\uf94d\u34df\u624e\uc31c\uae87), loadelement:String(getstatic:String[](\u527a\u494c\u88c5\u965f\u759a::\u12cb\u760c\ud12e\u8df4\u59ec\u76bc), xor:int(ldc:int(10277), ldc:int(10279))), invokevirtual:Throwable(Throwable::getCause, p1:Throwable))
            goto(Label_0245)
        }
        
        Label_0103:
        
        if (cmpne:boolean(and:int(var_3_A3:int, ldc:int(524288)), ldc:int(0))) {
            var_3_A3 = and:int(var_3_A3:int, ldc:int(-2048702677))
            goto(Label_0245)
        }
        
        if (cmpeq:boolean(and:int(var_3_A3:int, ldc:int(131072)), ldc:int(0))) {
            var_3_A3 = and:int(var_3_A3:int, ldc:int(1360615357))
        }
        else {
            var_3_A3 = and:int(var_3_A3:int, ldc:int(399407454))
            
            if (logicalnot:boolean(getfield:boolean(\u527a\u494c\u88c5\u965f\u759a::\ua3b4\u12cb\u8753\u4975\uc2bd\u494c, this:\u527a\u494c\u88c5\u965f\u759a))) {
                stack_DC_0 = and:int(ldc:int(16533), ldc:int(5185))
                goto(Label_0215)
            }
        }
        
        Label_0145:
        
        if (cmpne:boolean(and:int(var_3_A3:int, ldc:int(256)), ldc:int(0))) {
            goto(Label_0245)
        }
        
        if (cmpeq:boolean(and:int(var_3_A3:int, ldc:int(2147483647)), ldc:int(0))) {
            goto(Label_0103)
        }
        
        var_3_A3 = and:int(var_3_A3:int, ldc:int(-963688235))
        stack_DC_0 = and:int(ldc:int(9929), ldc:int(-9930))
        Label_0215:
        var_3_A3 = and:int(var_3_A3:int, ldc:int(1476276053))
        var_5_DC = stack_DC_0:int
        putfield:boolean(\u527a\u494c\u88c5\u965f\u759a::\ua3b4\u12cb\u8753\u4975\uc2bd\u494c, this:\u527a\u494c\u88c5\u965f\u759a, and:int[expected:boolean](ldc:int(17673), ldc:int(69)))
        
        if (invokeinterface:boolean(Channel::isOpen, getfield:Channel(\u527a\u494c\u88c5\u965f\u759a::\uc9f6\u120d\u8bb0\u9255\u4cd9\u120d, this:\u527a\u494c\u88c5\u965f\u759a))) {
            if (logicalnot:boolean(instanceof:boolean(io.netty.handler.timeout.TimeoutException.class, p1:Throwable))) {
                var_3_A3 = and:int(var_3_A3:int, ldc:int(-1482782346))
                stack_160_1 = loadelement:String(getstatic:String[](\u527a\u494c\u88c5\u965f\u759a::\u12cb\u760c\ud12e\u8df4\u59ec\u76bc), and:int(ldc:int(18565), ldc:int(1061)))
                expr_138 = newarray:Object[](java.lang.Object.class, and:int(ldc:int(17681), ldc:int(2049)))
                storeelement:Object(expr_138:Object[], and:int(ldc:int(-4799), ldc:int(4762)), invokevirtual:String[expected:Object](StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u527a\u494c\u88c5\u965f\u759a::\u12cb\u760c\ud12e\u8df4\u59ec\u76bc), and:int(ldc:int(654), ldc:int(24871)))), p1:Throwable[expected:Object])))
                var_6_163 = initobject:TranslationTextComponent(TranslationTextComponent::<init>, stack_160_1:String, expr_138:Object[])
                
                if (cmpeq:boolean(var_5_DC:int, ldc:int(0))) {
                    var_3_A3 = and:int(var_3_A3:int, ldc:int(-2015401513))
                    invokeinterface:void(Logger::debug, getstatic:Logger(\u527a\u494c\u88c5\u965f\u759a::\ub102\uf94d\u34df\u624e\uc31c\uae87), loadelement:String(getstatic:String[](\u527a\u494c\u88c5\u965f\u759a::\u12cb\u760c\ud12e\u8df4\u59ec\u76bc), xor:int(ldc:int(-31735), ldc:int(-31743))), p1:Throwable)
                    invokevirtual:void(\u527a\u494c\u88c5\u965f\u759a::\u98a4\uc31c\u6c52\uf995\u62da\u64f2, this:\u527a\u494c\u88c5\u965f\u759a, var_6_163:TranslationTextComponent[expected:ITextComponent])
                }
                else {
                    invokeinterface:void(Logger::debug, getstatic:Logger(\u527a\u494c\u88c5\u965f\u759a::\ub102\uf94d\u34df\u624e\uc31c\uae87), loadelement:String(getstatic:String[](\u527a\u494c\u88c5\u965f\u759a::\u12cb\u760c\ud12e\u8df4\u59ec\u76bc), and:int(ldc:int(16455), ldc:int(14111))), p1:Throwable)
                    invokevirtual:void(\u527a\u494c\u88c5\u965f\u759a::\u6fb0\u5d20\u93a2\u92ff\ud158\uc4d2, this:\u527a\u494c\u88c5\u965f\u759a, initobject:\uae5d\u71f1\u8d98\u071d\u4492(\uae5d\u71f1\u8d98\u071d\u4492::<init>, var_6_163:TranslationTextComponent[expected:ITextComponent]), invokedynamic:GenericFutureListener(operationComplete:(L\u4492\u8aa5\ud171\uc3e3\u4c2b/\u4c04\ua068\u3d64\ua6bd\u8389/\u960f\ubefe\ud4fe\u7c6b\u5db4/\u527a\u494c\u88c5\u965f\u759a;Lnet/minecraft/util/text/ITextComponent;)Lio/netty/util/concurrent/GenericFutureListener;, this:\u527a\u494c\u88c5\u965f\u759a, var_6_163:TranslationTextComponent))
                    invokevirtual:void(\u527a\u494c\u88c5\u965f\u759a::\u965f\uff55\uc84e\u3c25\ub70c\u6fb0, this:\u527a\u494c\u88c5\u965f\u759a)
                }
            }
            else {
                invokeinterface:void(Logger::debug, getstatic:Logger(\u527a\u494c\u88c5\u965f\u759a::\ub102\uf94d\u34df\u624e\uc31c\uae87), loadelement:String(getstatic:String[](\u527a\u494c\u88c5\u965f\u759a::\u12cb\u760c\ud12e\u8df4\u59ec\u76bc), xor:int(ldc:int(24595), ldc:int(24592))), p1:Throwable)
                invokevirtual:void(\u527a\u494c\u88c5\u965f\u759a::\u98a4\uc31c\u6c52\uf995\u62da\u64f2, this:\u527a\u494c\u88c5\u965f\u759a, initobject:TranslationTextComponent[expected:ITextComponent](TranslationTextComponent::<init>, loadelement:String(getstatic:String[](\u527a\u494c\u88c5\u965f\u759a::\u12cb\u760c\ud12e\u8df4\u59ec\u76bc), and:int(ldc:int(326), ldc:int(4236)))))
            }
        }
        
        Label_0245:
        
        if (cmpne:boolean(and:int(var_3_A3:int, ldc:int(268435456)), ldc:int(0))) {
            goto(Label_0145)
        }
        
        if (cmpne:boolean(and:int(var_3_A3:int, ldc:int(524288)), ldc:int(0))) {
            var_3_A3 = and:int(var_3_A3:int, ldc:int(-1177087158))
            goto(Label_0103)
        }
    }
    
    public void channelRead0(io.netty.channel.ChannelHandlerContext p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\u946b\u6d99\u8df4\u12cb\u5d20<?> p1) {
        var_3_213 : int
        var_3_C0 : int
        var_5_C9 : \u4cd9\ubff1\ub18d\u99f7\u97e6
        
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
            var_3_213 = and:int(ldc:int(574961403), ldc:int(1815572476))
            
            loop {
                if (cmpeq:boolean(and:int(var_3_213:int, ldc:int(8)), ldc:int(0))) {
                    var_3_213 = and:int(var_3_213:int, ldc:int(510358242))
                    goto(Label_0172)
                }
                
                if (cmpne:boolean(and:int(var_3_213:int, ldc:int(16777216)), ldc:int(0))) {
                    var_3_213 = and:int(var_3_213:int, ldc:int(1910656281))
                }
                else {
                    var_3_213 = and:int(var_3_213:int, ldc:int(2098019835))
                    
                    if (logicalnot:boolean(invokeinterface:boolean(Channel::isOpen, getfield:Channel(\u527a\u494c\u88c5\u965f\u759a::\uc9f6\u120d\u8bb0\u9255\u4cd9\u120d, this:\u527a\u494c\u88c5\u965f\u759a)))) {
                        looporswitchbreak()
                    }
                }
                
                Label_0150:
                
                if (cmpeq:boolean(and:int(var_3_213:int, ldc:int(4)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_3_213:int, ldc:int(8)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_213 = and:int(var_3_213:int, ldc:int(570816505))
                }
                
                Label_0172:
                
                if (cmpne:boolean(and:int(var_3_213:int, ldc:int(67108864)), ldc:int(0))) {
                    goto(Label_0150)
                }
                
                if (cmpeq:boolean(and:int(var_3_213:int, ldc:int(536870912)), ldc:int(0))) {
                    loopcontinue()
                }
                
                var_3_C0 = and:int(var_3_213:int, ldc:int(1755162622))
                var_5_C9 = initobject:\u4cd9\ubff1\ub18d\u99f7\u97e6(\u4cd9\ubff1\ub18d\u99f7\u97e6::<init>, p1:\u946b\u6d99\u8df4\u12cb\u5d20<?>)
                
                loop {
                    if (cmpne:boolean(and:int(var_3_C0:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_C0 = and:int(var_3_C0:int, ldc:int(1784800389))
                        goto(Label_0485)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_C0:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_C0 = and:int(var_3_C0:int, ldc:int(-1071654170))
                        goto(Label_0423)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_C0:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_C0 = and:int(var_3_C0:int, ldc:int(1880834717))
                        goto(Label_0341)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_C0:int, ldc:int(8)), ldc:int(0))) {
                        var_3_C0 = and:int(var_3_C0:int, ldc:int(1413682782))
                    }
                    else {
                        var_3_C0 = and:int(var_3_C0:int, ldc:int(-220207618))
                        invokevirtual:void(\uc910\u3e75\u527a\u446c\u3c25::\u34df\u8308\u74b1\u9af2\u9937, invokevirtual:\uc910\u3e75\u527a\u446c\u3c25(\u6b0d\ua068\uc4d2\u5245\u4d85::\u4e72\u4c2b\u5d20\u8350\u6b0d, invokestatic:\u6b0d\ua068\uc4d2\u5245\u4d85(\u6b0d\ua068\uc4d2\u5245\u4d85::\u9255\u6ec6\u12b2\ud51e\uc31c)), var_5_C9:\u4cd9\ubff1\ub18d\u99f7\u97e6[expected:\u6435\u385b\uae5d\u7049\u8bb0])
                    }
                    
                    Label_0288:
                    
                    if (cmpne:boolean(and:int(var_3_C0:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_C0 = and:int(var_3_C0:int, ldc:int(1061106907))
                        goto(Label_0485)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_C0:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0423)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_C0:int, ldc:int(268435456)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_C0:int, ldc:int(16384)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_C0 = and:int(var_3_C0:int, ldc:int(938813179))
                        
                        if (logicalnot:boolean(invokevirtual:boolean(\u6ec6\uc7fe\u927d\u6cfe\ub32d::\u0b8e\u3d64\u7330\ucfaf\u946b, var_5_C9:\u4cd9\ubff1\ub18d\u99f7\u97e6[expected:\u6ec6\uc7fe\u927d\u6cfe\ub32d]))) {
                            goto(Label_0411)
                        }
                    }
                    
                    Label_0341:
                    
                    if (cmpne:boolean(and:int(var_3_C0:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_C0 = and:int(var_3_C0:int, ldc:int(-254431468))
                        goto(Label_0485)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_C0:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_C0 = and:int(var_3_C0:int, ldc:int(-1506808254))
                        goto(Label_0423)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_C0:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0288)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_C0:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_C0 = and:int(var_3_C0:int, ldc:int(1741318114))
                        loopcontinue()
                    }
                    
                    return:void()
                    
                    try {
                        Label_0411:
                        invokestatic:void(\u527a\u494c\u88c5\u965f\u759a::\u8350\u3e75\uc2bd\ub70c\ud12e\uae87, invokevirtual:\u946b\u6d99\u8df4\u12cb\u5d20(\u4cd9\ubff1\ub18d\u99f7\u97e6::\u4cd9\ubff1\ub18d\u99f7\u97e6, var_5_C9:\u4cd9\ubff1\ub18d\u99f7\u97e6), getfield:\u446c\u7c6b\u8bb0\u4975\u76bc(\u527a\u494c\u88c5\u965f\u759a::\uc910\uc910\u52d3\u527a\u40a9\uc3e3, this:\u527a\u494c\u88c5\u965f\u759a))
                        Label_0423:
                        
                        if (cmpeq:boolean(and:int(var_3_C0:int, ldc:int(1048576)), ldc:int(0))) {
                            if (cmpne:boolean(and:int(var_3_C0:int, ldc:int(256)), ldc:int(0))) {
                                goto(Label_0341)
                            }
                            
                            if (cmpeq:boolean(and:int(var_3_C0:int, ldc:int(536870912)), ldc:int(0))) {
                                var_3_C0 = and:int(var_3_C0:int, ldc:int(364167585))
                                goto(Label_0288)
                            }
                            
                            if (cmpne:boolean(and:int(var_3_C0:int, ldc:int(268435456)), ldc:int(0))) {
                                var_3_C0 = and:int(var_3_C0:int, ldc:int(-1753490892))
                                loopcontinue()
                            }
                            
                            var_3_C0 = and:int(var_3_C0:int, ldc:int(1949117689))
                        }
                    }
                    catch (\u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u9af2\ufcaf\u7330\u9255\ub171 stack_1E3_0) {
                    }
                    
                    Label_0485:
                    
                    if (cmpeq:boolean(and:int(var_3_C0:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0423)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_C0:int, ldc:int(32)), ldc:int(0))) {
                        var_3_C0 = and:int(var_3_C0:int, ldc:int(-543840390))
                        goto(Label_0341)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_C0:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0288)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_C0:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_213 = and:int(var_3_C0:int, ldc:int(1847583994))
                        putfield:int(\u527a\u494c\u88c5\u965f\u759a::\u3c25\u8258\u9033\uc84e\u6bb9\u3711, this:\u527a\u494c\u88c5\u965f\u759a, add:int(getfield:int(\u527a\u494c\u88c5\u965f\u759a::\u3c25\u8258\u9033\uc84e\u6bb9\u3711, this:\u527a\u494c\u88c5\u965f\u759a), xor:int(ldc:int(25604), ldc:int(25605))))
                        looporswitchbreak(Label_0548)
                    }
                }
            }
            
            Label_0548:
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static void \u8350\u3e75\uc2bd\ub70c\ud12e\uae87(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\u946b\u6d99\u8df4\u12cb\u5d20<T> p0, \u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u446c\u7c6b\u8bb0\u4975\u76bc p1) {
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
            invokeinterface:void(\u946b\u6d99\u8df4\u12cb\u5d20<T>::\u3dd3\u759a\u8cae\u59ec\u446c\u71f1, p0:\u946b\u6d99\u8df4\u12cb\u5d20<T>, p1:\u446c\u7c6b\u8bb0\u4975\u76bc[expected:T extends \u446c\u7c6b\u8bb0\u4975\u76bc])
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u946b\u3e75\u59ec\ua562\u516c\ubb2b(\u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u446c\u7c6b\u8bb0\u4975\u76bc p0) {
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
            invokestatic:Object(Validate::notNull, p0:\u446c\u7c6b\u8bb0\u4975\u76bc[expected:Object], loadelement:String(getstatic:String[](\u527a\u494c\u88c5\u965f\u759a::\u12cb\u760c\ud12e\u8df4\u59ec\u76bc), xor:int(ldc:int(4167), ldc:int(4174))), newarray:Object[](java.lang.Object.class, and:int(ldc:int(-9593), ldc:int(9592))))
            putfield:\u446c\u7c6b\u8bb0\u4975\u76bc(\u527a\u494c\u88c5\u965f\u759a::\uc910\uc910\u52d3\u527a\u40a9\uc3e3, this:\u527a\u494c\u88c5\u965f\u759a, p0:\u446c\u7c6b\u8bb0\u4975\u76bc)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u6fb0\u5d20\u93a2\u92ff\ud158\uc4d2(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\u946b\u6d99\u8df4\u12cb\u5d20<?> p0) {
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
            invokevirtual:void(\u527a\u494c\u88c5\u965f\u759a::\u6fb0\u5d20\u93a2\u92ff\ud158\uc4d2, this:\u527a\u494c\u88c5\u965f\u759a, p0:\u946b\u6d99\u8df4\u12cb\u5d20<?>, checkcast:GenericFutureListener(io.netty.util.concurrent.GenericFutureListener.class, aconstnull:GenericFutureListener()))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u6fb0\u5d20\u93a2\u92ff\ud158\uc4d2(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\u946b\u6d99\u8df4\u12cb\u5d20<?> p0, io.netty.util.concurrent.GenericFutureListener<? extends io.netty.util.concurrent.Future<? super java.lang.Void>> p1) {
        var_3_AE : int
        var_5_6A : \u8389\u5654\u4179\ud523\u67e9
        var_1_7C : \u946b\u6d99\u8df4\u12cb\u5d20
        
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
        var_3_AE = and:int(ldc:int(1687873447), ldc:int(-1407518812))
        var_5_6A = initobject:\u8389\u5654\u4179\ud523\u67e9(\u8389\u5654\u4179\ud523\u67e9::<init>, p0:\u946b\u6d99\u8df4\u12cb\u5d20<?>)
        invokevirtual:void(\uc910\u3e75\u527a\u446c\u3c25::\u34df\u8308\u74b1\u9af2\u9937, invokevirtual:\uc910\u3e75\u527a\u446c\u3c25(\u6b0d\ua068\uc4d2\u5245\u4d85::\u4e72\u4c2b\u5d20\u8350\u6b0d, invokestatic:\u6b0d\ua068\uc4d2\u5245\u4d85(\u6b0d\ua068\uc4d2\u5245\u4d85::\u9255\u6ec6\u12b2\ud51e\uc31c)), var_5_6A:\u8389\u5654\u4179\ud523\u67e9[expected:\u6435\u385b\uae5d\u7049\u8bb0])
        var_1_7C = invokevirtual:\u946b\u6d99\u8df4\u12cb\u5d20(\u8389\u5654\u4179\ud523\u67e9::\uc2bd\u93a2\u6cfe\u0800\u760c, var_5_6A:\u8389\u5654\u4179\ud523\u67e9)
        
        if (logicalnot:boolean(invokevirtual:boolean(\u6ec6\uc7fe\u927d\u6cfe\ub32d::\u0b8e\u3d64\u7330\ucfaf\u946b, var_5_6A:\u8389\u5654\u4179\ud523\u67e9[expected:\u6ec6\uc7fe\u927d\u6cfe\ub32d]))) {
            do {
                if (cmpne:boolean(and:int(var_3_AE:int, ldc:int(268435456)), ldc:int(0))) {
                    var_3_AE = and:int(var_3_AE:int, ldc:int(-957748779))
                }
                else {
                    var_3_AE = and:int(var_3_AE:int, ldc:int(-278928130))
                    
                    if (logicalnot:boolean(invokevirtual:boolean(\u527a\u494c\u88c5\u965f\u759a::\u98a4\u960f\u6198\u3d4b\ub83f\ud171, this:\u527a\u494c\u88c5\u965f\u759a))) {
                        loopcontinue()
                    }
                    
                    invokespecial:void(\u527a\u494c\u88c5\u965f\u759a::\u64f2\u76bc\u52d3\u9033\u0b8e\u527a, this:\u527a\u494c\u88c5\u965f\u759a)
                    invokespecial:void(\u527a\u494c\u88c5\u965f\u759a::\ub171\u51fa\u983f\u0b8e\uc238\uc238, this:\u527a\u494c\u88c5\u965f\u759a, var_1_7C:\u946b\u6d99\u8df4\u12cb\u5d20<?>, p1:GenericFutureListener<? extends Future<? super Void>>)
                    return:void()
                }
            } while (cmpne:boolean(and:int(var_3_AE:int, ldc:int(16)), ldc:int(0)))
            
            var_3_AE = and:int(var_3_AE:int, ldc:int(807134893))
            invokeinterface:boolean(Queue<\u62da\ubf56\u52d3\u718f\u446c>::add, getfield:Queue<\u62da\ubf56\u52d3\u718f\u446c>(\u527a\u494c\u88c5\u965f\u759a::\u61a4\u600f\u7873\uc910\u1833\ub102, this:\u527a\u494c\u88c5\u965f\u759a), initobject:\u62da\ubf56\u52d3\u718f\u446c(\u62da\ubf56\u52d3\u718f\u446c::<init>, var_1_7C:\u946b\u6d99\u8df4\u12cb\u5d20<?>, p1:GenericFutureListener<? extends Future<? super Void>>))
        }
    }
    
    public void \u8413\ub7dc\u873d\u8308\ub18d\uc238(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\u946b\u6d99\u8df4\u12cb\u5d20<?> p0) {
        var_2_61 : int
        var_4_66 : GenericFutureListener
        
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
            var_2_61 = and:int(ldc:int(617897942), ldc:int(1821865084))
            var_4_66 = checkcast:GenericFutureListener(io.netty.util.concurrent.GenericFutureListener.class, aconstnull:GenericFutureListener())
            
            if (logicalnot:boolean(invokevirtual:boolean(\u527a\u494c\u88c5\u965f\u759a::\u98a4\u960f\u6198\u3d4b\ub83f\ud171, this:\u527a\u494c\u88c5\u965f\u759a))) {
                var_2_61 = and:int(var_2_61:int, ldc:int(-1384377743))
                invokeinterface:boolean(Queue<\u62da\ubf56\u52d3\u718f\u446c>::add, getfield:Queue<\u62da\ubf56\u52d3\u718f\u446c>(\u527a\u494c\u88c5\u965f\u759a::\u61a4\u600f\u7873\uc910\u1833\ub102, this:\u527a\u494c\u88c5\u965f\u759a), initobject:\u62da\ubf56\u52d3\u718f\u446c(\u62da\ubf56\u52d3\u718f\u446c::<init>, p0:\u946b\u6d99\u8df4\u12cb\u5d20<?>, var_4_66:GenericFutureListener<? extends Future<? super Void>>))
            }
            else {
                invokespecial:void(\u527a\u494c\u88c5\u965f\u759a::\u64f2\u76bc\u52d3\u9033\u0b8e\u527a, this:\u527a\u494c\u88c5\u965f\u759a)
                invokespecial:void(\u527a\u494c\u88c5\u965f\u759a::\ub171\u51fa\u983f\u0b8e\uc238\uc238, this:\u527a\u494c\u88c5\u965f\u759a, p0:\u946b\u6d99\u8df4\u12cb\u5d20<?>, var_4_66:GenericFutureListener<? extends Future<? super Void>>)
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \ub171\u51fa\u983f\u0b8e\uc238\uc238(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\u946b\u6d99\u8df4\u12cb\u5d20<?> p0, io.netty.util.concurrent.GenericFutureListener<? extends io.netty.util.concurrent.Future<? super java.lang.Void>> p1) {
        // java.lang.IllegalStateException: Unsupported node type: com.strobel.decompiler.ast.Lambda
        //     at com.strobel.decompiler.ast.Error.unsupportedNode(Error.java:32)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:612)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:586)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:590)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:586)
        //     at com.strobel.decompiler.ast.GotoRemoval.transformLeaveStatements(GotoRemoval.java:625)
        //     at com.strobel.decompiler.ast.GotoRemoval.removeGotosCore(GotoRemoval.java:57)
        //     at com.strobel.decompiler.ast.GotoRemoval.removeGotos(GotoRemoval.java:53)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:276)
        //     at com.strobel.decompiler.languages.BytecodeAstLanguage.decompileMethod(BytecodeAstLanguage.java:139)
        //     at com.strobel.decompiler.languages.BytecodeAstLanguage.decompileType(BytecodeAstLanguage.java:90)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:336)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:257)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:141)
    }
    
    private void \u64f2\u76bc\u52d3\u9033\u0b8e\u527a() {
        var_1_61 : int
        var_1_1BF : int
        var_3_133 : Queue<\u62da\ubf56\u52d3\u718f\u446c>
        var_4_148 : \u62da\ubf56\u52d3\u718f\u446c
        
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
            var_1_61 = and:int(ldc:int(-59545457), ldc:int(-423900771))
            
            loop {
                if (cmpeq:boolean(and:int(var_1_61:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_1_61 = and:int(var_1_61:int, ldc:int(-873345528))
                    goto(Label_0257)
                }
                
                if (cmpeq:boolean(and:int(var_1_61:int, ldc:int(8)), ldc:int(0))) {
                    goto(Label_0211)
                }
                
                if (cmpeq:boolean(and:int(var_1_61:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_1_61 = and:int(var_1_61:int, ldc:int(-1490696546))
                }
                else {
                    var_1_61 = and:int(var_1_61:int, ldc:int(-11276436))
                    
                    if (cmpeq:boolean(getfield:Channel(\u527a\u494c\u88c5\u965f\u759a::\uc9f6\u120d\u8bb0\u9255\u4cd9\u120d, this:\u527a\u494c\u88c5\u965f\u759a), aconstnull:Channel())) {
                        looporswitchbreak()
                    }
                }
                
                Label_0151:
                
                if (cmpeq:boolean(and:int(var_1_61:int, ldc:int(2048)), ldc:int(0))) {
                    goto(Label_0257)
                }
                
                if (cmpeq:boolean(and:int(var_1_61:int, ldc:int(4)), ldc:int(0))) {
                    var_1_61 = and:int(var_1_61:int, ldc:int(-783326409))
                }
                else {
                    if (cmpeq:boolean(and:int(var_1_61:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_1_61 = and:int(var_1_61:int, ldc:int(1263739741))
                        loopcontinue()
                    }
                    
                    var_1_61 = and:int(var_1_61:int, ldc:int(-74258401))
                    
                    if (logicalnot:boolean(invokeinterface:boolean(Channel::isOpen, getfield:Channel(\u527a\u494c\u88c5\u965f\u759a::\uc9f6\u120d\u8bb0\u9255\u4cd9\u120d, this:\u527a\u494c\u88c5\u965f\u759a)))) {
                        looporswitchbreak()
                    }
                }
                
                Label_0211:
                
                if (cmpeq:boolean(and:int(var_1_61:int, ldc:int(536870912)), ldc:int(0))) {
                    var_1_61 = and:int(var_1_61:int, ldc:int(-2008318787))
                }
                else {
                    if (cmpne:boolean(and:int(var_1_61:int, ldc:int(256)), ldc:int(0))) {
                        var_1_61 = and:int(var_1_61:int, ldc:int(-1533980723))
                        goto(Label_0151)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_61:int, ldc:int(8)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_1_61 = and:int(var_1_61:int, ldc:int(-113815745))
                }
                
                Label_0257:
                
                if (cmpne:boolean(and:int(var_1_61:int, ldc:int(16)), ldc:int(0))) {
                    goto(Label_0211)
                }
                
                if (cmpeq:boolean(and:int(var_1_61:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_1_61 = and:int(var_1_61:int, ldc:int(-689674646))
                    goto(Label_0151)
                }
                
                if (cmpeq:boolean(and:int(var_1_61:int, ldc:int(16)), ldc:int(0))) {
                    var_1_1BF = and:int(var_1_61:int, ldc:int(-302859618))
                    monitorenter(var_3_133 = getfield:Queue<\u62da\ubf56\u52d3\u718f\u446c>(\u527a\u494c\u88c5\u965f\u759a::\u61a4\u600f\u7873\uc910\u1833\ub102, this:\u527a\u494c\u88c5\u965f\u759a))
                    
                    try {
                        loop {
                            var_1_1BF = and:int(var_1_1BF:int, ldc:int(-184886084))
                            
                            if (cmpeq:boolean(var_4_148 = checkcast:\u62da\ubf56\u52d3\u718f\u446c(\ub113\uc4d2\u183a\u527a\u6435.\uc3e3\u5f50\u5bc4\ud217\u97e6.\u62da\ubf56\u52d3\u718f\u446c.class, invokeinterface:\u62da\ubf56\u52d3\u718f\u446c(Queue<\u62da\ubf56\u52d3\u718f\u446c>::poll, getfield:Queue<\u62da\ubf56\u52d3\u718f\u446c>(\u527a\u494c\u88c5\u965f\u759a::\u61a4\u600f\u7873\uc910\u1833\ub102, this:\u527a\u494c\u88c5\u965f\u759a))), aconstnull:\u62da\ubf56\u52d3\u718f\u446c())) {
                                monitorexit(var_3_133:Queue<\u62da\ubf56\u52d3\u718f\u446c>)
                                goto(Label_0417)
                            }
                            
                            Label_0333:
                            
                            if (cmpne:boolean(and:int(var_1_1BF:int, ldc:int(32)), ldc:int(0))) {
                                var_1_1BF = and:int(var_1_1BF:int, ldc:int(-2139110204))
                                goto(Label_0417)
                            }
                            
                            if (cmpeq:boolean(and:int(var_1_1BF:int, ldc:int(256)), ldc:int(0))) {
                                var_1_1BF = and:int(var_1_1BF:int, ldc:int(-451688276))
                            }
                            
                            Label_0363:
                            
                            if (cmpeq:boolean(and:int(var_1_1BF:int, ldc:int(1073741824)), ldc:int(0))) {
                                var_1_1BF = and:int(var_1_1BF:int, ldc:int(-1541734916))
                            }
                            else {
                                if (cmpeq:boolean(and:int(var_1_1BF:int, ldc:int(32)), ldc:int(0))) {
                                    var_1_1BF = and:int(var_1_1BF:int, ldc:int(-346564036))
                                    invokespecial:void(\u527a\u494c\u88c5\u965f\u759a::\ub171\u51fa\u983f\u0b8e\uc238\uc238, this:\u527a\u494c\u88c5\u965f\u759a, invokestatic:\u946b\u6d99\u8df4\u12cb\u5d20(\u62da\ubf56\u52d3\u718f\u446c::\u5245\ub8be\u8413\u6b0d\u4f52\uceb8, var_4_148:\u62da\ubf56\u52d3\u718f\u446c), invokestatic:GenericFutureListener(\u62da\ubf56\u52d3\u718f\u446c::\uc3e3\u52d3\u3d64\u12cb\u1833\ua562, var_4_148:\u62da\ubf56\u52d3\u718f\u446c))
                                    loopcontinue()
                                }
                                
                                goto(Label_0333)
                            }
                            
                            Label_0417:
                            
                            if (cmpne:boolean(and:int(var_1_1BF:int, ldc:int(32)), ldc:int(0))) {
                                var_1_1BF = and:int(var_1_1BF:int, ldc:int(1188305743))
                                goto(Label_0363)
                            }
                            
                            if (cmpne:boolean(and:int(var_1_1BF:int, ldc:int(4)), ldc:int(0))) {
                                looporswitchbreak()
                            }
                            
                            goto(Label_0333)
                        }
                        
                        var_1_1BF = and:int(var_1_1BF:int, ldc:int(-358683266))
                    }
                    finally {
                        monitorexit(var_3_133:Queue<\u62da\ubf56\u52d3\u718f\u446c>)
                    }
                    
                    looporswitchbreak()
                }
                
                var_1_61 = and:int(var_1_61:int, ldc:int(-95955936))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u446c\u93a2\u76bc\uc7fe\uf94d\uc246() {
        var_1_61 : int
        expr_DC : int [generated]
        
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
            var_1_61 = and:int(ldc:int(651544469), ldc:int(-1229157918))
            invokespecial:void(\u527a\u494c\u88c5\u965f\u759a::\u64f2\u76bc\u52d3\u9033\u0b8e\u527a, this:\u527a\u494c\u88c5\u965f\u759a)
            
            if (instanceof:boolean(\u56bd\u8413\u647c\u5bc4\ud158.\u51b2\uf995\u3e2a\ub83f\u6d69.class, getfield:\u446c\u7c6b\u8bb0\u4975\u76bc(\u527a\u494c\u88c5\u965f\u759a::\uc910\uc910\u52d3\u527a\u40a9\uc3e3, this:\u527a\u494c\u88c5\u965f\u759a))) {
                invokevirtual:void(\u51b2\uf995\u3e2a\ub83f\u6d69::\u61a4\uf94d\u74b1\uae87\uff55\ua068, checkcast:\u51b2\uf995\u3e2a\ub83f\u6d69(\u56bd\u8413\u647c\u5bc4\ud158.\u51b2\uf995\u3e2a\ub83f\u6d69.class, getfield:\u446c\u7c6b\u8bb0\u4975\u76bc[expected:\u51b2\uf995\u3e2a\ub83f\u6d69](\u527a\u494c\u88c5\u965f\u759a::\uc910\uc910\u52d3\u527a\u40a9\uc3e3, this:\u527a\u494c\u88c5\u965f\u759a)))
            }
            
            loop {
                if (cmpeq:boolean(and:int(var_1_61:int, ldc:int(2147483647)), ldc:int(0))) {
                    goto(Label_0188)
                }
                
                if (cmpne:boolean(and:int(var_1_61:int, ldc:int(8)), ldc:int(0))) {
                    var_1_61 = and:int(var_1_61:int, ldc:int(-1919181534))
                }
                else {
                    var_1_61 = and:int(var_1_61:int, ldc:int(603447913))
                    
                    if (instanceof:boolean(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u0a06\ub83f\u34df\u7873\u5bc4.class, getfield:\u446c\u7c6b\u8bb0\u4975\u76bc(\u527a\u494c\u88c5\u965f\u759a::\uc910\uc910\u52d3\u527a\u40a9\uc3e3, this:\u527a\u494c\u88c5\u965f\u759a))) {
                        invokevirtual:void(\u0a06\ub83f\u34df\u7873\u5bc4::\u4c2b\u76bc\u92ee\ud36e\u62da\ub171, checkcast:\u0a06\ub83f\u34df\u7873\u5bc4(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u0a06\ub83f\u34df\u7873\u5bc4.class, getfield:\u446c\u7c6b\u8bb0\u4975\u76bc[expected:\u0a06\ub83f\u34df\u7873\u5bc4](\u527a\u494c\u88c5\u965f\u759a::\uc910\uc910\u52d3\u527a\u40a9\uc3e3, this:\u527a\u494c\u88c5\u965f\u759a)))
                    }
                }
                
                Label_0152:
                
                if (cmpne:boolean(and:int(var_1_61:int, ldc:int(2097152)), ldc:int(0))) {
                    var_1_61 = and:int(var_1_61:int, ldc:int(2135620292))
                }
                else {
                    if (cmpne:boolean(and:int(var_1_61:int, ldc:int(2097152)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_1_61 = and:int(var_1_61:int, ldc:int(-1477148734))
                    
                    if (cmpne:boolean(getfield:Channel(\u527a\u494c\u88c5\u965f\u759a::\uc9f6\u120d\u8bb0\u9255\u4cd9\u120d, this:\u527a\u494c\u88c5\u965f\u759a), aconstnull:Channel())) {
                        invokeinterface:Channel(Channel::flush, getfield:Channel(\u527a\u494c\u88c5\u965f\u759a::\uc9f6\u120d\u8bb0\u9255\u4cd9\u120d, this:\u527a\u494c\u88c5\u965f\u759a))
                    }
                }
                
                Label_0188:
                
                if (cmpeq:boolean(and:int(var_1_61:int, ldc:int(33554432)), ldc:int(0))) {
                    goto(Label_0152)
                }
                
                if (cmpeq:boolean(and:int(var_1_61:int, ldc:int(2048)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_1_61 = and:int(var_1_61:int, ldc:int(-1999466212))
            }
            
            expr_DC = getfield:int(\u527a\u494c\u88c5\u965f\u759a::\uf94d\u647c\u92ee\u97b7\u6c52\u51fa, this:\u527a\u494c\u88c5\u965f\u759a)
            putfield:int(\u527a\u494c\u88c5\u965f\u759a::\uf94d\u647c\u92ee\u97b7\u6c52\u51fa, this:\u527a\u494c\u88c5\u965f\u759a, add:int(expr_DC:int, xor:int(ldc:int(4233), ldc:int(4232))))
            
            if (cmpeq:boolean(rem:int(expr_DC:int, ldc:int(20)), ldc:int(0))) {
                invokevirtual:void(\u527a\u494c\u88c5\u965f\u759a::\u64f2\uafe7\u8cae\u927d\u3d64\uafe7, this:\u527a\u494c\u88c5\u965f\u759a)
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u64f2\uafe7\u8cae\u927d\u3d64\uafe7() {
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
            putfield:float(\u527a\u494c\u88c5\u965f\u759a::\ud158\u4bc8\u6c56\ud4fe\u4d85\u6d99, this:\u527a\u494c\u88c5\u965f\u759a, invokestatic:float(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\u494c\ub6ab\u8bb0\u8bb0\uc31c\uc31c, ldc:float(0.75f), i2f:float(getfield:int(\u527a\u494c\u88c5\u965f\u759a::\u7043\u4492\ud7e8\u6198\u9033\u7bad, this:\u527a\u494c\u88c5\u965f\u759a)), getfield:float(\u527a\u494c\u88c5\u965f\u759a::\ud158\u4bc8\u6c56\ud4fe\u4d85\u6d99, this:\u527a\u494c\u88c5\u965f\u759a)))
            putfield:float(\u527a\u494c\u88c5\u965f\u759a::\u8413\u64ab\u7ce1\u9a18\uc229\uff55, this:\u527a\u494c\u88c5\u965f\u759a, invokestatic:float(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\u494c\ub6ab\u8bb0\u8bb0\uc31c\uc31c, ldc:float(0.75f), i2f:float(getfield:int(\u527a\u494c\u88c5\u965f\u759a::\u3c25\u8258\u9033\uc84e\u6bb9\u3711, this:\u527a\u494c\u88c5\u965f\u759a)), getfield:float(\u527a\u494c\u88c5\u965f\u759a::\u8413\u64ab\u7ce1\u9a18\uc229\uff55, this:\u527a\u494c\u88c5\u965f\u759a)))
            putfield:int(\u527a\u494c\u88c5\u965f\u759a::\u7043\u4492\ud7e8\u6198\u9033\u7bad, this:\u527a\u494c\u88c5\u965f\u759a, and:int(ldc:int(-31243), ldc:int(31234)))
            putfield:int(\u527a\u494c\u88c5\u965f\u759a::\u3c25\u8258\u9033\uc84e\u6bb9\u3711, this:\u527a\u494c\u88c5\u965f\u759a, and:int(ldc:int(-19257), ldc:int(18744)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public java.net.SocketAddress \ucb79\u47c2\u960f\u36d3\u6d69\u6c52() {
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
            return:SocketAddress(getfield:SocketAddress(\u527a\u494c\u88c5\u965f\u759a::\ub8be\u8350\u8c8a\uae5d\ud12e\u4179, this:\u527a\u494c\u88c5\u965f\u759a))
        }
        
        goto(Label_0006)
    }
    
    public void \u98a4\uc31c\u6c52\uf995\u62da\u64f2(net.minecraft.util.text.ITextComponent p0) {
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
            
            if (invokeinterface:boolean(Channel::isOpen, getfield:Channel(\u527a\u494c\u88c5\u965f\u759a::\uc9f6\u120d\u8bb0\u9255\u4cd9\u120d, this:\u527a\u494c\u88c5\u965f\u759a))) {
                invokeinterface:ChannelFuture(ChannelFuture::awaitUninterruptibly, invokeinterface:ChannelFuture(Channel::close, getfield:Channel(\u527a\u494c\u88c5\u965f\u759a::\uc9f6\u120d\u8bb0\u9255\u4cd9\u120d, this:\u527a\u494c\u88c5\u965f\u759a)))
                putfield:ITextComponent(\u527a\u494c\u88c5\u965f\u759a::\u99f7\u516c\uae5d\u8389\u6d69\uc87f, this:\u527a\u494c\u88c5\u965f\u759a, p0:ITextComponent)
            }
            
            if (cmpne:boolean(getfield:\uff55\u7006\u8cae\u51fa\u7330\u873d(\u527a\u494c\u88c5\u965f\u759a::\ua068\uf995\u4492\u6cfe\ua562\u6435, this:\u527a\u494c\u88c5\u965f\u759a), aconstnull:\uff55\u7006\u8cae\u51fa\u7330\u873d())) {
                invokevirtual:void(\uff55\u7006\u8cae\u51fa\u7330\u873d::\u3d64\uc9f6\ucfaf\ub171\ufcaf\u527a, getfield:\uff55\u7006\u8cae\u51fa\u7330\u873d(\u527a\u494c\u88c5\u965f\u759a::\ua068\uf995\u4492\u6cfe\ua562\u6435, this:\u527a\u494c\u88c5\u965f\u759a))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public boolean \u59ec\ua61f\u36d3\u4e72\u7006\u927d() {
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
            return:boolean(ternaryop:int[expected:boolean](logicalor:boolean(instanceof:boolean(io.netty.channel.local.LocalChannel.class, getfield:Channel(\u527a\u494c\u88c5\u965f\u759a::\uc9f6\u120d\u8bb0\u9255\u4cd9\u120d, this:\u527a\u494c\u88c5\u965f\u759a)), instanceof:boolean(io.netty.channel.local.LocalServerChannel.class, getfield:Channel(\u527a\u494c\u88c5\u965f\u759a::\uc9f6\u120d\u8bb0\u9255\u4cd9\u120d, this:\u527a\u494c\u88c5\u965f\u759a))), and:int(ldc:int(3201), ldc:int(16645)), and:int(ldc:int(-10246), ldc:int(10245))))
        }
        
        goto(Label_0006)
    }
    
    public static \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u527a\u494c\u88c5\u965f\u759a \ubcb0\u34df\ub6ab\ua562\ubff1\u71f1(java.net.InetAddress p0, int p1, boolean p2) {
        var_3_61 : int
        var_5_6C : \u527a\u494c\u88c5\u965f\u759a
        var_6_7D : Serializable
        var_7_82 : Object
        
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
            var_3_61 = and:int(ldc:int(1995536543), ldc:int(1870098502))
            var_5_6C = initobject:\u527a\u494c\u88c5\u965f\u759a(\u527a\u494c\u88c5\u965f\u759a::<init>, getstatic:\uc87f\u92ff\u416d\u1833\uc84e(\uc87f\u92ff\u416d\u1833\uc84e::\u64ab\u873d\u6bb9\u7c6b\u6b0d\ua61f))
            
            if (logicaland:boolean(invokestatic:boolean(Epoll::isAvailable), p2:boolean)) {
                var_6_7D = ldc:Class<EpollSocketChannel>(io.netty.channel.epoll.EpollSocketChannel.class)
                var_7_82 = getstatic:\u62da\u61a4\ub19c\u8cae\u92ff\ubb2b<EpollEventLoopGroup>[expected:Object](\u527a\u494c\u88c5\u965f\u759a::\u4c04\ucfaf\uf94d\u6435\uc2bd\ubff1)
            }
            else {
                var_3_61 = and:int(var_3_61:int, ldc:int(1745561446))
                var_6_7D = ldc:Class<NioSocketChannel>(io.netty.channel.socket.nio.NioSocketChannel.class)
                var_7_82 = getstatic:\u62da\u61a4\ub19c\u8cae\u92ff\ubb2b<NioEventLoopGroup>[expected:Object](\u527a\u494c\u88c5\u965f\u759a::\u647c\u527a\u760c\u69d9\u7049\u5bc4)
            }
            
            invokeinterface:ChannelFuture(ChannelFuture::syncUninterruptibly, invokevirtual:ChannelFuture(Bootstrap::connect, checkcast:Bootstrap(io.netty.bootstrap.Bootstrap.class, invokevirtual:AbstractBootstrap(Bootstrap::channel, checkcast:Bootstrap(io.netty.bootstrap.Bootstrap.class, invokevirtual:AbstractBootstrap(Bootstrap::handler, checkcast:Bootstrap(io.netty.bootstrap.Bootstrap.class, invokevirtual:AbstractBootstrap(Bootstrap::group, initobject:Bootstrap(Bootstrap::<init>), checkcast:EventLoopGroup(io.netty.channel.EventLoopGroup.class, invokevirtual:EventLoopGroup(\u62da\u61a4\ub19c\u8cae\u92ff\ubb2b<EventLoopGroup>::\u5fe1\u6fb0\u3bd6\u3504\u8c8a\u3bc9, var_7_82:\u62da\u61a4\ub19c\u8cae\u92ff\ubb2b<EventLoopGroup>[expected:Object])))), initobject:\u3711\ud12e\ub83f\u12cb\ud36e[expected:ChannelHandler](\u3711\ud12e\ub83f\u12cb\ud36e::<init>, var_5_6C:\u527a\u494c\u88c5\u965f\u759a))), var_6_7D:Class)), p0:InetAddress, p1:int))
            return:\u527a\u494c\u88c5\u965f\u759a(var_5_6C:\u527a\u494c\u88c5\u965f\u759a)
        }
        
        goto(Label_0006)
    }
    
    public static \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u527a\u494c\u88c5\u965f\u759a \u647c\u983f\u88c5\uc84e\u3c25\u4cd9(java.net.SocketAddress p0) {
        var_3_6C : \u527a\u494c\u88c5\u965f\u759a
        
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
            var_3_6C = initobject:\u527a\u494c\u88c5\u965f\u759a(\u527a\u494c\u88c5\u965f\u759a::<init>, getstatic:\uc87f\u92ff\u416d\u1833\uc84e(\uc87f\u92ff\u416d\u1833\uc84e::\u64ab\u873d\u6bb9\u7c6b\u6b0d\ua61f))
            invokeinterface:ChannelFuture(ChannelFuture::syncUninterruptibly, invokevirtual:ChannelFuture(Bootstrap::connect, checkcast:Bootstrap(io.netty.bootstrap.Bootstrap.class, invokevirtual:AbstractBootstrap(Bootstrap::channel, checkcast:Bootstrap(io.netty.bootstrap.Bootstrap.class, invokevirtual:AbstractBootstrap(Bootstrap::handler, checkcast:Bootstrap(io.netty.bootstrap.Bootstrap.class, invokevirtual:AbstractBootstrap[expected:Bootstrap](Bootstrap::group, initobject:Bootstrap(Bootstrap::<init>), checkcast:EventLoopGroup(io.netty.channel.EventLoopGroup.class, invokevirtual:DefaultEventLoopGroup[expected:EventLoopGroup](\u62da\u61a4\ub19c\u8cae\u92ff\ubb2b<DefaultEventLoopGroup>::\u5fe1\u6fb0\u3bd6\u3504\u8c8a\u3bc9, getstatic:\u62da\u61a4\ub19c\u8cae\u92ff\ubb2b<DefaultEventLoopGroup>(\u527a\u494c\u88c5\u965f\u759a::\u12cb\u8640\u4179\u40a9\u3711\u7006))))), initobject:\u5140\u88c5\uf9c5\u40a9\u7873(\u5140\u88c5\uf9c5\u40a9\u7873::<init>, var_3_6C:\u527a\u494c\u88c5\u965f\u759a))), ldc:Class<LocalChannel>(io.netty.channel.local.LocalChannel.class))), p0:SocketAddress))
            return:\u527a\u494c\u88c5\u965f\u759a(var_3_6C:\u527a\u494c\u88c5\u965f\u759a)
        }
        
        goto(Label_0006)
    }
    
    public void \ub70c\ud158\uc238\ud158\u4975\ub171(javax.crypto.Cipher p0, javax.crypto.Cipher p1) {
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
            putfield:boolean(\u527a\u494c\u88c5\u965f\u759a::\ub171\u7006\u759a\u7873\u6b5f\uc246, this:\u527a\u494c\u88c5\u965f\u759a, and:int[expected:boolean](ldc:int(22801), ldc:int(545)))
            invokeinterface:ChannelPipeline(ChannelPipeline::addBefore, invokeinterface:ChannelPipeline(Channel::pipeline, getfield:Channel(\u527a\u494c\u88c5\u965f\u759a::\uc9f6\u120d\u8bb0\u9255\u4cd9\u120d, this:\u527a\u494c\u88c5\u965f\u759a)), loadelement:String(getstatic:String[](\u527a\u494c\u88c5\u965f\u759a::\u12cb\u760c\ud12e\u8df4\u59ec\u76bc), xor:int(ldc:int(1121), ldc:int(1130))), loadelement:String(getstatic:String[](\u527a\u494c\u88c5\u965f\u759a::\u12cb\u760c\ud12e\u8df4\u59ec\u76bc), and:int(ldc:int(654), ldc:int(3084))), initobject:\uae87\u6198\u759a\u3dd3\u836c[expected:ChannelHandler](\uae87\u6198\u759a\u3dd3\u836c::<init>, p0:Cipher))
            invokeinterface:ChannelPipeline(ChannelPipeline::addBefore, invokeinterface:ChannelPipeline(Channel::pipeline, getfield:Channel(\u527a\u494c\u88c5\u965f\u759a::\uc9f6\u120d\u8bb0\u9255\u4cd9\u120d, this:\u527a\u494c\u88c5\u965f\u759a)), loadelement:String(getstatic:String[](\u527a\u494c\u88c5\u965f\u759a::\u12cb\u760c\ud12e\u8df4\u59ec\u76bc), and:int(ldc:int(93), ldc:int(15629))), loadelement:String(getstatic:String[](\u527a\u494c\u88c5\u965f\u759a::\u12cb\u760c\ud12e\u8df4\u59ec\u76bc), and:int(ldc:int(8206), ldc:int(16654))), initobject:\ub6ab\u7ce1\ub6ab\u8258\u3a62[expected:ChannelHandler](\ub6ab\u7ce1\ub6ab\u8258\u3a62::<init>, p1:Cipher))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public boolean \u183a\u3e75\ud12e\ucb79\u873d\u12b2() {
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
            return:boolean(getfield:boolean(\u527a\u494c\u88c5\u965f\u759a::\ub171\u7006\u759a\u7873\u6b5f\uc246, this:\u527a\u494c\u88c5\u965f\u759a))
        }
        
        goto(Label_0006)
    }
    
    public boolean \u98a4\u960f\u6198\u3d4b\ub83f\ud171() {
        var_1_61 : int
        stack_9D_0 : int [generated]
        
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
            var_1_61 = and:int(ldc:int(1683001670), ldc:int(-839927941))
            
            if (logicaland:boolean(cmpne:boolean(getfield:Channel(\u527a\u494c\u88c5\u965f\u759a::\uc9f6\u120d\u8bb0\u9255\u4cd9\u120d, this:\u527a\u494c\u88c5\u965f\u759a), aconstnull:Channel()), invokeinterface:boolean(Channel::isOpen, getfield:Channel(\u527a\u494c\u88c5\u965f\u759a::\uc9f6\u120d\u8bb0\u9255\u4cd9\u120d, this:\u527a\u494c\u88c5\u965f\u759a)))) {
                stack_9D_0 = and:int(ldc:int(8449), ldc:int(16551))
            }
            else {
                var_1_61 = and:int(var_1_61:int, ldc:int(1878882115))
                stack_9D_0 = and:int(ldc:int(628), ldc:int(-757))
            }
            
            return:boolean(stack_9D_0:int)
        }
        
        goto(Label_0006)
    }
    
    public boolean \ud36e\u516c\u1187\ub18d\u6d69\u718f() {
        var_1_61 : int
        stack_8A_0 : int [generated]
        
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
            var_1_61 = and:int(ldc:int(590310178), ldc:int(-29896911))
            
            if (cmpne:boolean(getfield:Channel(\u527a\u494c\u88c5\u965f\u759a::\uc9f6\u120d\u8bb0\u9255\u4cd9\u120d, this:\u527a\u494c\u88c5\u965f\u759a), aconstnull:Channel())) {
                var_1_61 = and:int(var_1_61:int, ldc:int(799432686))
                stack_8A_0 = and:int(ldc:int(-26734), ldc:int(26733))
            }
            else {
                stack_8A_0 = xor:int(ldc:int(-15328), ldc:int(-15327))
            }
            
            return:boolean(stack_8A_0:int)
        }
        
        goto(Label_0006)
    }
    
    public \u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u446c\u7c6b\u8bb0\u4975\u76bc \u4d85\u4f52\uc2e8\ubb2b\uc2bd\u36d3() {
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
            return:\u446c\u7c6b\u8bb0\u4975\u76bc(getfield:\u446c\u7c6b\u8bb0\u4975\u76bc(\u527a\u494c\u88c5\u965f\u759a::\uc910\uc910\u52d3\u527a\u40a9\uc3e3, this:\u527a\u494c\u88c5\u965f\u759a))
        }
        
        goto(Label_0006)
    }
    
    public net.minecraft.util.text.ITextComponent \uc9f6\u6c56\u120d\u873d\uc7fe\u9af2() {
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
            return:ITextComponent(getfield:ITextComponent(\u527a\u494c\u88c5\u965f\u759a::\u99f7\u516c\uae5d\u8389\u6d69\uc87f, this:\u527a\u494c\u88c5\u965f\u759a))
        }
        
        goto(Label_0006)
    }
    
    public void \u965f\uff55\uc84e\u3c25\ub70c\u6fb0() {
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
            invokeinterface:ChannelConfig(ChannelConfig::setAutoRead, invokeinterface:ChannelConfig(Channel::config, getfield:Channel(\u527a\u494c\u88c5\u965f\u759a::\uc9f6\u120d\u8bb0\u9255\u4cd9\u120d, this:\u527a\u494c\u88c5\u965f\u759a)), and:int[expected:boolean](ldc:int(-29247), ldc:int(25150)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \uc7fe\u69d9\ub70c\u8d90\u6d69\uc2e8(int p0) {
        var_2_E7 : int
        
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
        var_2_E7 = and:int(ldc:int(-2122054971), ldc:int(-1349303412))
        
        if (cmpge:boolean(p0:int, ldc:int(0))) {
            if (logicalnot:boolean(instanceof:boolean(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4f52\ufe34\u6ec6\ub32d\uafe7.class, invokeinterface:ChannelHandler(ChannelPipeline::get, invokeinterface:ChannelPipeline(Channel::pipeline, getfield:Channel(\u527a\u494c\u88c5\u965f\u759a::\uc9f6\u120d\u8bb0\u9255\u4cd9\u120d, this:\u527a\u494c\u88c5\u965f\u759a)), loadelement:String(getstatic:String[](\u527a\u494c\u88c5\u965f\u759a::\u12cb\u760c\ud12e\u8df4\u59ec\u76bc), and:int(ldc:int(687), ldc:int(8207))))))) {
                goto(Label_0386)
            }
            
            invokevirtual:void(\u4f52\ufe34\u6ec6\ub32d\uafe7::\u0b8e\u7330\u3e75\u4d85\u7330\ub32d, checkcast:\u4f52\ufe34\u6ec6\ub32d\uafe7(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4f52\ufe34\u6ec6\ub32d\uafe7.class, invokeinterface:ChannelHandler[expected:\u4f52\ufe34\u6ec6\ub32d\uafe7](ChannelPipeline::get, invokeinterface:ChannelPipeline(Channel::pipeline, getfield:Channel(\u527a\u494c\u88c5\u965f\u759a::\uc9f6\u120d\u8bb0\u9255\u4cd9\u120d, this:\u527a\u494c\u88c5\u965f\u759a)), loadelement:String(getstatic:String[](\u527a\u494c\u88c5\u965f\u759a::\u12cb\u760c\ud12e\u8df4\u59ec\u76bc), and:int(ldc:int(19231), ldc:int(8271))))), p0:int)
            goto(Label_0535)
        }
        
        Label_0102:
        
        if (cmpeq:boolean(and:int(var_2_E7:int, ldc:int(16777216)), ldc:int(0))) {
            var_2_E7 = and:int(var_2_E7:int, ldc:int(-748347679))
            goto(Label_0535)
        }
        
        if (cmpne:boolean(and:int(var_2_E7:int, ldc:int(268435456)), ldc:int(0))) {
            goto(Label_0386)
        }
        
        if (cmpne:boolean(and:int(var_2_E7:int, ldc:int(16384)), ldc:int(0))) {
            goto(Label_0263)
        }
        
        if (cmpne:boolean(and:int(var_2_E7:int, ldc:int(268435456)), ldc:int(0))) {
            var_2_E7 = and:int(var_2_E7:int, ldc:int(1491013256))
        }
        else {
            var_2_E7 = and:int(var_2_E7:int, ldc:int(-1746995822))
            
            if (instanceof:boolean(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4f52\ufe34\u6ec6\ub32d\uafe7.class, invokeinterface:ChannelHandler(ChannelPipeline::get, invokeinterface:ChannelPipeline(Channel::pipeline, getfield:Channel(\u527a\u494c\u88c5\u965f\u759a::\uc9f6\u120d\u8bb0\u9255\u4cd9\u120d, this:\u527a\u494c\u88c5\u965f\u759a)), loadelement:String(getstatic:String[](\u527a\u494c\u88c5\u965f\u759a::\u12cb\u760c\ud12e\u8df4\u59ec\u76bc), xor:int(ldc:int(5131), ldc:int(5124)))))) {
                invokeinterface:ChannelHandler(ChannelPipeline::remove, invokeinterface:ChannelPipeline(Channel::pipeline, getfield:Channel(\u527a\u494c\u88c5\u965f\u759a::\uc9f6\u120d\u8bb0\u9255\u4cd9\u120d, this:\u527a\u494c\u88c5\u965f\u759a)), loadelement:String(getstatic:String[](\u527a\u494c\u88c5\u965f\u759a::\u12cb\u760c\ud12e\u8df4\u59ec\u76bc), xor:int(ldc:int(33), ldc:int(46))))
            }
        }
        
        Label_0187:
        
        if (cmpne:boolean(and:int(var_2_E7:int, ldc:int(16384)), ldc:int(0))) {
            goto(Label_0535)
        }
        
        if (cmpne:boolean(and:int(var_2_E7:int, ldc:int(32)), ldc:int(0))) {
            goto(Label_0386)
        }
        
        if (cmpeq:boolean(and:int(var_2_E7:int, ldc:int(536870912)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_2_E7:int, ldc:int(268435456)), ldc:int(0))) {
                var_2_E7 = and:int(var_2_E7:int, ldc:int(-1662232240))
                goto(Label_0102)
            }
            
            var_2_E7 = and:int(var_2_E7:int, ldc:int(-1681665062))
            
            if (instanceof:boolean(\u56bd\u8413\u647c\u5bc4\ud158.\u8413\u7ce1\u120d\u8df4\ubb2b.class, invokeinterface:ChannelHandler(ChannelPipeline::get, invokeinterface:ChannelPipeline(Channel::pipeline, getfield:Channel(\u527a\u494c\u88c5\u965f\u759a::\uc9f6\u120d\u8bb0\u9255\u4cd9\u120d, this:\u527a\u494c\u88c5\u965f\u759a)), loadelement:String(getstatic:String[](\u527a\u494c\u88c5\u965f\u759a::\u12cb\u760c\ud12e\u8df4\u59ec\u76bc), and:int(ldc:int(13629), ldc:int(593)))))) {
                invokeinterface:ChannelHandler(ChannelPipeline::remove, invokeinterface:ChannelPipeline(Channel::pipeline, getfield:Channel(\u527a\u494c\u88c5\u965f\u759a::\uc9f6\u120d\u8bb0\u9255\u4cd9\u120d, this:\u527a\u494c\u88c5\u965f\u759a)), loadelement:String(getstatic:String[](\u527a\u494c\u88c5\u965f\u759a::\u12cb\u760c\ud12e\u8df4\u59ec\u76bc), and:int(ldc:int(283), ldc:int(13841))))
            }
        }
        
        Label_0263:
        
        if (cmpne:boolean(and:int(var_2_E7:int, ldc:int(2048)), ldc:int(0))) {
            var_2_E7 = and:int(var_2_E7:int, ldc:int(597939131))
            goto(Label_0535)
        }
        
        if (cmpne:boolean(and:int(var_2_E7:int, ldc:int(268435456)), ldc:int(0))) {
            var_2_E7 = and:int(var_2_E7:int, ldc:int(-883528498))
        }
        else {
            if (cmpne:boolean(and:int(var_2_E7:int, ldc:int(1073741824)), ldc:int(0))) {
                var_2_E7 = and:int(var_2_E7:int, ldc:int(76183908))
                goto(Label_0187)
            }
            
            if (cmpne:boolean(and:int(var_2_E7:int, ldc:int(8192)), ldc:int(0))) {
                var_2_E7 = and:int(var_2_E7:int, ldc:int(-1936344561))
                goto(Label_0102)
            }
            
            invokevirtual:void(\u8df4\u92ff\ubff1\u2dcc\u67d0\ubf56::\ucb79\u8413\u8258\u5654\u64f2\ub1b9, invokevirtual:\u8df4\u92ff\ubff1\u2dcc\u67d0\ubf56(\uff55\u7006\u8cae\u51fa\u7330\u873d::\u8258\uae87\u67d0\u72f1\uc31c\u56bd, getfield:\uff55\u7006\u8cae\u51fa\u7330\u873d(\u527a\u494c\u88c5\u965f\u759a::\ua068\uf995\u4492\u6cfe\ua562\u6435, this:\u527a\u494c\u88c5\u965f\u759a)), getfield:Channel(\u527a\u494c\u88c5\u965f\u759a::\uc9f6\u120d\u8bb0\u9255\u4cd9\u120d, this:\u527a\u494c\u88c5\u965f\u759a))
            return:void()
        }
        
        Label_0386:
        
        if (cmpne:boolean(and:int(var_2_E7:int, ldc:int(2048)), ldc:int(0))) {
            var_2_E7 = and:int(var_2_E7:int, ldc:int(1002124402))
        }
        else {
            if (cmpne:boolean(and:int(var_2_E7:int, ldc:int(1048576)), ldc:int(0))) {
                var_2_E7 = and:int(var_2_E7:int, ldc:int(-49667961))
                goto(Label_0263)
            }
            
            if (cmpne:boolean(and:int(var_2_E7:int, ldc:int(32)), ldc:int(0))) {
                var_2_E7 = and:int(var_2_E7:int, ldc:int(638834219))
                goto(Label_0187)
            }
            
            if (cmpne:boolean(and:int(var_2_E7:int, ldc:int(1048576)), ldc:int(0))) {
                goto(Label_0102)
            }
            
            var_2_E7 = and:int(var_2_E7:int, ldc:int(-1584933891))
            invokeinterface:ChannelPipeline(ChannelPipeline::addBefore, invokeinterface:ChannelPipeline(Channel::pipeline, getfield:Channel(\u527a\u494c\u88c5\u965f\u759a::\uc9f6\u120d\u8bb0\u9255\u4cd9\u120d, this:\u527a\u494c\u88c5\u965f\u759a)), loadelement:String(getstatic:String[](\u527a\u494c\u88c5\u965f\u759a::\u12cb\u760c\ud12e\u8df4\u59ec\u76bc), and:int(ldc:int(10070), ldc:int(6160))), loadelement:String(getstatic:String[](\u527a\u494c\u88c5\u965f\u759a::\u12cb\u760c\ud12e\u8df4\u59ec\u76bc), and:int(ldc:int(591), ldc:int(28959))), initobject:\u4f52\ufe34\u6ec6\ub32d\uafe7[expected:ChannelHandler](\u4f52\ufe34\u6ec6\ub32d\uafe7::<init>, p0:int))
        }
        
        Label_0535:
        
        if (cmpne:boolean(and:int(var_2_E7:int, ldc:int(4194304)), ldc:int(0))) {
            var_2_E7 = and:int(var_2_E7:int, ldc:int(226106131))
            goto(Label_0386)
        }
        
        if (cmpne:boolean(and:int(var_2_E7:int, ldc:int(1048576)), ldc:int(0))) {
            goto(Label_0263)
        }
        
        if (cmpne:boolean(and:int(var_2_E7:int, ldc:int(65536)), ldc:int(0))) {
            goto(Label_0187)
        }
        
        if (cmpne:boolean(and:int(var_2_E7:int, ldc:int(134217728)), ldc:int(0))) {
            var_2_E7 = and:int(var_2_E7:int, ldc:int(1853581476))
            goto(Label_0102)
        }
        
        var_2_E7 = and:int(var_2_E7:int, ldc:int(-637948432))
        
        if (logicalnot:boolean(instanceof:boolean(\u56bd\u8413\u647c\u5bc4\ud158.\u8413\u7ce1\u120d\u8df4\ubb2b.class, invokeinterface:ChannelHandler(ChannelPipeline::get, invokeinterface:ChannelPipeline(Channel::pipeline, getfield:Channel(\u527a\u494c\u88c5\u965f\u759a::\uc9f6\u120d\u8bb0\u9255\u4cd9\u120d, this:\u527a\u494c\u88c5\u965f\u759a)), loadelement:String(getstatic:String[](\u527a\u494c\u88c5\u965f\u759a::\u12cb\u760c\ud12e\u8df4\u59ec\u76bc), xor:int(ldc:int(-24414), ldc:int(-24397))))))) {
            var_2_E7 = and:int(var_2_E7:int, ldc:int(-7172198))
            invokeinterface:ChannelPipeline(ChannelPipeline::addBefore, invokeinterface:ChannelPipeline(Channel::pipeline, getfield:Channel(\u527a\u494c\u88c5\u965f\u759a::\uc9f6\u120d\u8bb0\u9255\u4cd9\u120d, this:\u527a\u494c\u88c5\u965f\u759a)), loadelement:String(getstatic:String[](\u527a\u494c\u88c5\u965f\u759a::\u12cb\u760c\ud12e\u8df4\u59ec\u76bc), and:int(ldc:int(5170), ldc:int(8722))), loadelement:String(getstatic:String[](\u527a\u494c\u88c5\u965f\u759a::\u12cb\u760c\ud12e\u8df4\u59ec\u76bc), and:int(ldc:int(18707), ldc:int(4177))), initobject:\u8413\u7ce1\u120d\u8df4\ubb2b[expected:ChannelHandler](\u8413\u7ce1\u120d\u8df4\ubb2b::<init>, p0:int))
            goto(Label_0263)
        }
        
        invokevirtual:void(\u8413\u7ce1\u120d\u8df4\ubb2b::\u97e6\u392e\ufcaf\uc246\u69d9\u3bd6, checkcast:\u8413\u7ce1\u120d\u8df4\ubb2b(\u56bd\u8413\u647c\u5bc4\ud158.\u8413\u7ce1\u120d\u8df4\ubb2b.class, invokeinterface:ChannelHandler[expected:\u8413\u7ce1\u120d\u8df4\ubb2b](ChannelPipeline::get, invokeinterface:ChannelPipeline(Channel::pipeline, getfield:Channel(\u527a\u494c\u88c5\u965f\u759a::\uc9f6\u120d\u8bb0\u9255\u4cd9\u120d, this:\u527a\u494c\u88c5\u965f\u759a)), loadelement:String(getstatic:String[](\u527a\u494c\u88c5\u965f\u759a::\u12cb\u760c\ud12e\u8df4\u59ec\u76bc), and:int(ldc:int(12597), ldc:int(2203))))), p0:int)
        goto(Label_0263)
    }
    
    public void \ua068\ud51e\u5140\u59ec\u6c52\u92ee() {
        var_1_61 : int
        
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
        var_1_61 = and:int(ldc:int(154162964), ldc:int(2121856861))
        
        if (cmpne:boolean(getfield:Channel(\u527a\u494c\u88c5\u965f\u759a::\uc9f6\u120d\u8bb0\u9255\u4cd9\u120d, this:\u527a\u494c\u88c5\u965f\u759a), aconstnull:Channel())) {
            if (logicalnot:boolean(invokeinterface:boolean(Channel::isOpen, getfield:Channel(\u527a\u494c\u88c5\u965f\u759a::\uc9f6\u120d\u8bb0\u9255\u4cd9\u120d, this:\u527a\u494c\u88c5\u965f\u759a)))) {
                if (logicalnot:boolean(getfield:boolean(\u527a\u494c\u88c5\u965f\u759a::\ucb79\uc246\u3776\u72f1\u67d0\ub102, this:\u527a\u494c\u88c5\u965f\u759a))) {
                    goto(Label_0150)
                }
                
                invokeinterface:void(Logger::warn, getstatic:Logger(\u527a\u494c\u88c5\u965f\u759a::\ub102\uf94d\u34df\u624e\uc31c\uae87), loadelement:String(getstatic:String[](\u527a\u494c\u88c5\u965f\u759a::\u12cb\u760c\ud12e\u8df4\u59ec\u76bc), xor:int(ldc:int(-32611), ldc:int(-32626))))
            }
        }
        
        Label_0105:
        
        if (cmpeq:boolean(and:int(var_1_61:int, ldc:int(2048)), ldc:int(0))) {
            return:void()
        }
        
        Label_0150:
        
        if (cmpne:boolean(and:int(var_1_61:int, ldc:int(32768)), ldc:int(0))) {
            var_1_61 = and:int(var_1_61:int, ldc:int(503111843))
            goto(Label_0105)
        }
        
        var_1_61 = and:int(var_1_61:int, ldc:int(1236367221))
        putfield:boolean(\u527a\u494c\u88c5\u965f\u759a::\ucb79\uc246\u3776\u72f1\u67d0\ub102, this:\u527a\u494c\u88c5\u965f\u759a, xor:int[expected:boolean](ldc:int(-12284), ldc:int(-12283)))
        
        if (cmpne:boolean(invokevirtual:ITextComponent(\u527a\u494c\u88c5\u965f\u759a::\uc9f6\u6c56\u120d\u873d\uc7fe\u9af2, this:\u527a\u494c\u88c5\u965f\u759a), aconstnull:ITextComponent())) {
            invokeinterface:void(\u446c\u7c6b\u8bb0\u4975\u76bc::\u9033\uc4d2\u3bc9\u7043\u392e\ua61f, invokevirtual:\u446c\u7c6b\u8bb0\u4975\u76bc(\u527a\u494c\u88c5\u965f\u759a::\u4d85\u4f52\uc2e8\ubb2b\uc2bd\u36d3, this:\u527a\u494c\u88c5\u965f\u759a), invokevirtual:ITextComponent(\u527a\u494c\u88c5\u965f\u759a::\uc9f6\u6c56\u120d\u873d\uc7fe\u9af2, this:\u527a\u494c\u88c5\u965f\u759a))
            goto(Label_0105)
        }
        
        var_1_61 = and:int(var_1_61:int, ldc:int(-578818106))
        
        if (cmpeq:boolean(invokevirtual:\u446c\u7c6b\u8bb0\u4975\u76bc(\u527a\u494c\u88c5\u965f\u759a::\u4d85\u4f52\uc2e8\ubb2b\uc2bd\u36d3, this:\u527a\u494c\u88c5\u965f\u759a), aconstnull:\u446c\u7c6b\u8bb0\u4975\u76bc())) {
            goto(Label_0105)
        }
        
        invokeinterface:void(\u446c\u7c6b\u8bb0\u4975\u76bc::\u9033\uc4d2\u3bc9\u7043\u392e\ua61f, invokevirtual:\u446c\u7c6b\u8bb0\u4975\u76bc(\u527a\u494c\u88c5\u965f\u759a::\u4d85\u4f52\uc2e8\ubb2b\uc2bd\u36d3, this:\u527a\u494c\u88c5\u965f\u759a), initobject:TranslationTextComponent[expected:ITextComponent](TranslationTextComponent::<init>, loadelement:String(getstatic:String[](\u527a\u494c\u88c5\u965f\u759a::\u12cb\u760c\ud12e\u8df4\u59ec\u76bc), and:int(ldc:int(20), ldc:int(28727)))))
        goto(Label_0105)
    }
    
    public float \u6ec6\u7d52\uc29a\u61a4\u6ec6\u93a2() {
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
            return:float(getfield:float(\u527a\u494c\u88c5\u965f\u759a::\u8413\u64ab\u7ce1\u9a18\uc229\uff55, this:\u527a\u494c\u88c5\u965f\u759a))
        }
        
        goto(Label_0006)
    }
    
    public float \ubb2b\u7873\u40a9\u3e75\u8df4\u6c52() {
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
            return:float(getfield:float(\u527a\u494c\u88c5\u965f\u759a::\ud158\u4bc8\u6c56\ud4fe\u4d85\u6d99, this:\u527a\u494c\u88c5\u965f\u759a))
        }
        
        goto(Label_0006)
    }
    
    public void channelRead0(io.netty.channel.ChannelHandlerContext p0, java.lang.Object p1) {
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
            invokevirtual:void(\u527a\u494c\u88c5\u965f\u759a::channelRead0, this:\u527a\u494c\u88c5\u965f\u759a, p0:ChannelHandlerContext, checkcast:\u946b\u6d99\u8df4\u12cb\u5d20(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\u946b\u6d99\u8df4\u12cb\u5d20.class, p1:Object[expected:\u946b\u6d99\u8df4\u12cb\u5d20<?>]))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\u97b7\u600f\u64f2\u9937\u67e9\uc84e$4(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u392e\uc31c\u3504\u3dd3\u93a2 p0, \u3bc9\u67e9\uc87f\u47c2\u5f50.\u392e\uc31c\u3504\u3dd3\u93a2 p1, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\u946b\u6d99\u8df4\u12cb\u5d20 p2, io.netty.util.concurrent.GenericFutureListener p3) {
        var_7_7C : ChannelFuture
        
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
            
            if (cmpne:boolean(p0:\u392e\uc31c\u3504\u3dd3\u93a2, p1:\u392e\uc31c\u3504\u3dd3\u93a2)) {
                invokevirtual:void(\u527a\u494c\u88c5\u965f\u759a::\u40a9\u718f\u99f7\u4e72\u93a2\u6d69, this:\u527a\u494c\u88c5\u965f\u759a, p0:\u392e\uc31c\u3504\u3dd3\u93a2)
            }
            
            var_7_7C = invokeinterface:ChannelFuture(Channel::writeAndFlush, getfield:Channel(\u527a\u494c\u88c5\u965f\u759a::\uc9f6\u120d\u8bb0\u9255\u4cd9\u120d, this:\u527a\u494c\u88c5\u965f\u759a), p2:\u946b\u6d99\u8df4\u12cb\u5d20[expected:Object])
            
            if (cmpne:boolean(p3:GenericFutureListener, aconstnull:GenericFutureListener())) {
                invokeinterface:ChannelFuture(ChannelFuture::addListener, var_7_7C:ChannelFuture, p3:GenericFutureListener)
            }
            
            invokeinterface:ChannelFuture(ChannelFuture::addListener, var_7_7C:ChannelFuture, getstatic:ChannelFutureListener[expected:GenericFutureListener](ChannelFutureListener::FIRE_EXCEPTION_ON_FAILURE))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\u67e9\u494c\uc3e3\u3d64\u8bb0\u6435$3(net.minecraft.util.text.ITextComponent p0, io.netty.util.concurrent.Future p1) {
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
            invokevirtual:void(\u527a\u494c\u88c5\u965f\u759a::\u98a4\uc31c\u6c52\uf995\u62da\u64f2, this:\u527a\u494c\u88c5\u965f\u759a, p0:ITextComponent)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static io.netty.channel.DefaultEventLoopGroup lambda$\u6fb0\u51b2\u873d\u8c8a\uceb8\ub70c$2() {
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
            return:DefaultEventLoopGroup(initobject:DefaultEventLoopGroup(DefaultEventLoopGroup::<init>, and:int(ldc:int(30979), ldc:int(-32068)), invokevirtual:ThreadFactory(ThreadFactoryBuilder::build, invokevirtual:ThreadFactoryBuilder(ThreadFactoryBuilder::setDaemon, invokevirtual:ThreadFactoryBuilder(ThreadFactoryBuilder::setNameFormat, initobject:ThreadFactoryBuilder(ThreadFactoryBuilder::<init>), loadelement:String(getstatic:String[](\u527a\u494c\u88c5\u965f\u759a::\u12cb\u760c\ud12e\u8df4\u59ec\u76bc), xor:int(ldc:int(3086), ldc:int(3099)))), and:int[expected:boolean](ldc:int(14535), ldc:int(41))))))
        }
        
        goto(Label_0006)
    }
    
    private static io.netty.channel.epoll.EpollEventLoopGroup lambda$\uc87f\ud158\u156b\u965f\u5d20\u7043$1() {
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
            return:EpollEventLoopGroup(initobject:EpollEventLoopGroup(EpollEventLoopGroup::<init>, and:int(ldc:int(11680), ldc:int(-11681)), invokevirtual:ThreadFactory(ThreadFactoryBuilder::build, invokevirtual:ThreadFactoryBuilder(ThreadFactoryBuilder::setDaemon, invokevirtual:ThreadFactoryBuilder(ThreadFactoryBuilder::setNameFormat, initobject:ThreadFactoryBuilder(ThreadFactoryBuilder::<init>), loadelement:String(getstatic:String[](\u527a\u494c\u88c5\u965f\u759a::\u12cb\u760c\ud12e\u8df4\u59ec\u76bc), xor:int(ldc:int(4745), ldc:int(4767)))), xor:int[expected:boolean](ldc:int(8200), ldc:int(8201))))))
        }
        
        goto(Label_0006)
    }
    
    private static io.netty.channel.nio.NioEventLoopGroup lambda$\u7330\u3a62\u8308\u600f\u52d3\u36d3$0() {
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
            return:NioEventLoopGroup(initobject:NioEventLoopGroup(NioEventLoopGroup::<init>, and:int(ldc:int(-1826), ldc:int(1825)), invokevirtual:ThreadFactory(ThreadFactoryBuilder::build, invokevirtual:ThreadFactoryBuilder(ThreadFactoryBuilder::setDaemon, invokevirtual:ThreadFactoryBuilder(ThreadFactoryBuilder::setNameFormat, initobject:ThreadFactoryBuilder(ThreadFactoryBuilder::<init>), loadelement:String(getstatic:String[](\u527a\u494c\u88c5\u965f\u759a::\u12cb\u760c\ud12e\u8df4\u59ec\u76bc), and:int(ldc:int(18455), ldc:int(1047)))), xor:int[expected:boolean](ldc:int(20800), ldc:int(20801))))))
        }
        
        goto(Label_0006)
    }
    
    static {
        // java.lang.IllegalStateException: Unsupported node type: com.strobel.decompiler.ast.Lambda
        //     at com.strobel.decompiler.ast.Error.unsupportedNode(Error.java:32)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:612)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:586)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:590)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:586)
        //     at com.strobel.decompiler.ast.GotoRemoval.transformLeaveStatements(GotoRemoval.java:625)
        //     at com.strobel.decompiler.ast.GotoRemoval.removeGotosCore(GotoRemoval.java:57)
        //     at com.strobel.decompiler.ast.GotoRemoval.removeGotos(GotoRemoval.java:53)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:276)
        //     at com.strobel.decompiler.languages.BytecodeAstLanguage.decompileMethod(BytecodeAstLanguage.java:139)
        //     at com.strobel.decompiler.languages.BytecodeAstLanguage.decompileType(BytecodeAstLanguage.java:90)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:336)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:257)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:141)
    }
    
    public void \u0c95\uc2e8\u5245\u156b\u5d20\u4d85(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_687 : int
        var_5_80 : int
        var_6_87 : int
        var_7_96 : double
        var_9_BE : double
        var_3_D0 : int
        var_11_E1 : int
        var_14_10B : double
        var_16_10F : int
        var_12_107 : double
        var_17_692 : int
        
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
        var_3_687 = and:int(ldc:int(-2106318729), ldc:int(-471927425))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u527a\u494c\u88c5\u965f\u759a[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0170)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_687:int, ldc:int(1)), ldc:int(0))) {
            var_3_687 = and:int(var_3_687:int, ldc:int(-900412419))
            var_5_80 = and:int(ldc:int(21874), ldc:int(-21880))
            var_6_87 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_96 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-6192), ldc:int(6187)))
            invokestatic:int(m::a)
            
            loop {
                var_9_BE = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D0 = and:int(var_3_687:int, ldc:int(-1845931289))
                    var_9_BE = sub:double(var_7_96:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E1 = var_5_80:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E1:int, sub:int(var_6_87:int, xor:int(ldc:int(736), ldc:int(737)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E1:int, xor:int(ldc:int(2181), ldc:int(2180)))), var_7_96:double))) {
                        inc:int(var_11_E1, ldc:int(1))
                    }
                    
                    var_3_687 = and:int(var_3_D0:int, ldc:int(-1924107547))
                    var_14_10B = var_7_96:double
                    var_16_10F = var_11_E1:int
                }
                else {
                    var_11_E1 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_80:int), xor:int(ldc:int(288), ldc:int(289)))
                    var_12_107 = var_14_10B = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_80)
                    
                    if (cmplt:boolean(var_16_10F = var_11_E1:int, var_6_87:int)) {
                        var_9_BE = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E1:int)
                        var_16_10F = var_11_E1:int
                        var_14_10B = var_12_107:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_687:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1560)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_687:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_687 = and:int(var_3_687:int, ldc:int(-543646057))
                        goto(Label_1420)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_687:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_687 = and:int(var_3_687:int, ldc:int(247551737))
                        goto(Label_1270)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_687:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_687 = and:int(var_3_687:int, ldc:int(1427804053))
                        goto(Label_1111)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_687:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_687 = and:int(var_3_687:int, ldc:int(-1767990447))
                        goto(Label_0946)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_687:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0852)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_687:int, ldc:int(1)), ldc:int(0))) {
                        var_3_687 = and:int(var_3_687:int, ldc:int(-19014656))
                        goto(Label_0696)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_687:int, ldc:int(128)), ldc:int(0))) {
                        var_3_687 = and:int(var_3_687:int, ldc:int(-2022792905))
                        goto(Label_0566)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_687:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_687 = and:int(var_3_687:int, ldc:int(-571415443))
                        
                        if (cmplt:boolean(var_16_10F:int, var_6_87:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0566)
                            }
                            
                            goto(Label_0852)
                        }
                    }
                    
                    Label_0413:
                    
                    if (cmpne:boolean(and:int(var_3_687:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1560)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_687:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1420)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_687:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_687 = and:int(var_3_687:int, ldc:int(-1630968624))
                        goto(Label_1270)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_687:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1111)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_687:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0946)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_687:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0852)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_687:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_687 = and:int(var_3_687:int, ldc:int(884616193))
                        goto(Label_0696)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_687:int, ldc:int(32)), ldc:int(0))) {
                        var_3_687 = and:int(var_3_687:int, ldc:int(-1096460515))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_687:int, ldc:int(64)), ldc:int(0))) {
                            var_3_687 = and:int(var_3_687:int, ldc:int(-872548747))
                            var_11_E1 = and:int(ldc:int(-16893), ldc:int(16876))
                            goto(Label_1549)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0566:
                    
                    if (cmpne:boolean(and:int(var_3_687:int, ldc:int(128)), ldc:int(0))) {
                        var_3_687 = and:int(var_3_687:int, ldc:int(-360466206))
                        goto(Label_1560)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_687:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_687 = and:int(var_3_687:int, ldc:int(464808397))
                        goto(Label_1420)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_687:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_687 = and:int(var_3_687:int, ldc:int(-49392271))
                        goto(Label_1270)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_687:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1111)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_687:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_687 = and:int(var_3_687:int, ldc:int(-1317399345))
                        goto(Label_0946)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_687:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0852)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_687:int, ldc:int(524288)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_687:int, ldc:int(32)), ldc:int(0))) {
                            var_3_687 = and:int(var_3_687:int, ldc:int(56480940))
                            goto(Label_0413)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_687:int, ldc:int(4)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_687 = and:int(var_3_687:int, ldc:int(-1309590171))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10B = var_9_BE:double
                            goto(Label_0852)
                        }
                    }
                    
                    Label_0696:
                    
                    if (cmpeq:boolean(and:int(var_3_687:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_687 = and:int(var_3_687:int, ldc:int(-711690506))
                        goto(Label_1560)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_687:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_687 = and:int(var_3_687:int, ldc:int(68917915))
                        goto(Label_1420)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_687:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_687 = and:int(var_3_687:int, ldc:int(960041891))
                        goto(Label_1270)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_687:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1111)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_687:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_687 = and:int(var_3_687:int, ldc:int(-693080374))
                        goto(Label_0946)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_687:int, ldc:int(64)), ldc:int(0))) {
                        var_3_687 = and:int(var_3_687:int, ldc:int(1967671405))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_687:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0566)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_687:int, ldc:int(32)), ldc:int(0))) {
                            var_3_687 = and:int(var_3_687:int, ldc:int(-282380378))
                            goto(Label_0413)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_687:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_687 = and:int(var_3_687:int, ldc:int(-180472615))
                            loopcontinue()
                        }
                        
                        var_3_687 = and:int(var_3_687:int, ldc:int(-511742083))
                        var_14_10B = mul:double(ldc:double(0.5), add:double(var_9_BE:double, var_14_10B:double))
                    }
                    
                    Label_0852:
                    
                    if (cmpne:boolean(and:int(var_3_687:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1560)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_687:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1420)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_687:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1270)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_687:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1111)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_687:int, ldc:int(4194304)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_687:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0696)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_687:int, ldc:int(1)), ldc:int(0))) {
                            var_3_687 = and:int(var_3_687:int, ldc:int(325398523))
                            goto(Label_0566)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_687:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0413)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_687:int, ldc:int(32768)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_687 = and:int(var_3_687:int, ldc:int(-1688480283))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_80:int), var_7_96:double)) {
                                var_11_E1 = xor:int(ldc:int(24712), ldc:int(24713))
                                goto(Label_1111)
                            }
                        }
                    }
                    
                    Label_0946:
                    
                    if (cmpeq:boolean(and:int(var_3_687:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_687 = and:int(var_3_687:int, ldc:int(-1767229618))
                        goto(Label_1560)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_687:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1420)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_687:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_687 = and:int(var_3_687:int, ldc:int(651524914))
                        goto(Label_1270)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_687:int, ldc:int(4)), ldc:int(0))) {
                        var_3_687 = and:int(var_3_687:int, ldc:int(-708918451))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_687:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0852)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_687:int, ldc:int(4)), ldc:int(0))) {
                            var_3_687 = and:int(var_3_687:int, ldc:int(-1360296056))
                            goto(Label_0696)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_687:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0566)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_687:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0413)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_687:int, ldc:int(512)), ldc:int(0))) {
                            var_3_687 = and:int(var_3_687:int, ldc:int(1152387516))
                            loopcontinue()
                        }
                        
                        var_3_687 = and:int(var_3_687:int, ldc:int(-706926601))
                        var_11_E1 = and:int(ldc:int(-15672), ldc:int(10295))
                    }
                    
                    Label_1111:
                    
                    if (cmpeq:boolean(and:int(var_3_687:int, ldc:int(32)), ldc:int(0))) {
                        var_3_687 = and:int(var_3_687:int, ldc:int(-1733341407))
                        goto(Label_1560)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_687:int, ldc:int(1)), ldc:int(0))) {
                        var_3_687 = and:int(var_3_687:int, ldc:int(-1662262557))
                        goto(Label_1420)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_687:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_687 = and:int(var_3_687:int, ldc:int(853920277))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_687:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_687 = and:int(var_3_687:int, ldc:int(1718933393))
                            goto(Label_0946)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_687:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0852)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_687:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_687 = and:int(var_3_687:int, ldc:int(-81387790))
                            goto(Label_0696)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_687:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_687 = and:int(var_3_687:int, ldc:int(-399853706))
                            goto(Label_0566)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_687:int, ldc:int(512)), ldc:int(0))) {
                            var_3_687 = and:int(var_3_687:int, ldc:int(1014233594))
                            goto(Label_0413)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_687:int, ldc:int(4)), ldc:int(0))) {
                            var_3_687 = and:int(var_3_687:int, ldc:int(2057146128))
                            loopcontinue()
                        }
                        
                        var_3_687 = and:int(var_3_687:int, ldc:int(-1763767187))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E1:int, ldc:int(0))) {
                                goto(Label_1420)
                            }
                        }
                    }
                    
                    Label_1270:
                    
                    if (cmpne:boolean(and:int(var_3_687:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_687 = and:int(var_3_687:int, ldc:int(-1606950707))
                        goto(Label_1560)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_687:int, ldc:int(131072)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_687:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_687 = and:int(var_3_687:int, ldc:int(90543212))
                            goto(Label_1111)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_687:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0946)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_687:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_687 = and:int(var_3_687:int, ldc:int(-1255841695))
                            goto(Label_0852)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_687:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0696)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_687:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_687 = and:int(var_3_687:int, ldc:int(969740847))
                            goto(Label_0566)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_687:int, ldc:int(64)), ldc:int(0))) {
                            var_3_687 = and:int(var_3_687:int, ldc:int(863150761))
                            goto(Label_0413)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_687:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_687 = and:int(var_3_687:int, ldc:int(1019399738))
                            loopcontinue()
                        }
                        
                        var_3_687 = and:int(var_3_687:int, ldc:int(-378306321))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10B:double, var_5_80:int, var_16_10F:int)
                        goto(Label_1549)
                    }
                    
                    Label_1420:
                    
                    if (cmpne:boolean(and:int(var_3_687:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_687 = and:int(var_3_687:int, ldc:int(2046409689))
                        goto(Label_1560)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_687:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1270)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_687:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_687 = and:int(var_3_687:int, ldc:int(-1787089996))
                        goto(Label_1111)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_687:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0946)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_687:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0852)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_687:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_687 = and:int(var_3_687:int, ldc:int(-985900642))
                        goto(Label_0696)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_687:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0566)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_687:int, ldc:int(128)), ldc:int(0))) {
                        var_3_687 = and:int(var_3_687:int, ldc:int(1677025053))
                        goto(Label_0413)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_687:int, ldc:int(32768)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_687 = and:int(var_3_687:int, ldc:int(-1250903067))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10B:double, ldc:double(0.0))
                    Label_1549:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_692 = var_5_80:int
                        
                        if (cmpeq:boolean(var_11_E1:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1560:
                    
                    if (cmpeq:boolean(and:int(var_3_687:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1420)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_687:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1270)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_687:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1111)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_687:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_687 = and:int(var_3_687:int, ldc:int(1625492866))
                        goto(Label_0946)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_687:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_687 = and:int(var_3_687:int, ldc:int(-357921114))
                        goto(Label_0852)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_687:int, ldc:int(512)), ldc:int(0))) {
                        var_3_687 = and:int(var_3_687:int, ldc:int(-1245976795))
                        goto(Label_0696)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_687:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0566)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_687:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_687 = and:int(var_3_687:int, ldc:int(558279512))
                        goto(Label_0413)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_687:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_687 = and:int(var_3_687:int, ldc:int(-461748481))
                        var_17_692 = add:int(var_16_10F:int, xor:int(ldc:int(24833), ldc:int(24832)))
                        looporswitchbreak()
                    }
                }
                
                var_3_687 = and:int(var_3_687:int, ldc:int(-1294279427))
                
                if (cmple:boolean(var_5_80 = var_17_692:int, sub:int(var_6_87:int, and:int(ldc:int(129), ldc:int(26149))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0170:
        
        if (cmpeq:boolean(and:int(var_3_687:int, ldc:int(65536)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
