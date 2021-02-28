public class \u59ec\u8413\u97e6\uc229\u3776.\u9255\u0b8e\ud36e\ucef1\ud523 {
    public void \u9255\u0b8e\ud36e\ucef1\ud523(\u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\u88c5\ud171\ub113\u6435\ud51e p0) {
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
            invokespecial:Object(Object::<init>, this:\u9255\u0b8e\ud36e\ucef1\ud523)
            putfield:List<ChannelFuture>(\u9255\u0b8e\ud36e\ucef1\ud523::\uc3e3\u4daf\u3c25\u516c\u3a62\u56bd, this:\u9255\u0b8e\ud36e\ucef1\ud523, invokestatic:List<ChannelFuture>(Collections::synchronizedList, invokestatic:ArrayList[expected:List<ChannelFuture>](Lists::newArrayList)))
            putfield:List<\u527a\u494c\u88c5\u965f\u759a>(\u9255\u0b8e\ud36e\ucef1\ud523::\u5654\u59ec\u5f50\ubff1\u7006\u6435, this:\u9255\u0b8e\ud36e\ucef1\ud523, invokestatic:List<\u527a\u494c\u88c5\u965f\u759a>(Collections::synchronizedList, invokestatic:ArrayList[expected:List<\u527a\u494c\u88c5\u965f\u759a>](Lists::newArrayList)))
            putfield:\u88c5\ud171\ub113\u6435\ud51e(\u9255\u0b8e\ud36e\ucef1\ud523::\uc910\u71ae\u8258\ufcaf\u7d52\u3dd3, this:\u9255\u0b8e\ud36e\ucef1\ud523, p0:\u88c5\ud171\ub113\u6435\ud51e)
            putfield:boolean(\u9255\u0b8e\ud36e\ucef1\ud523::\u8753\ud217\u6ec6\u836c\ucfaf\u62da, this:\u9255\u0b8e\ud36e\ucef1\ud523, xor:int[expected:boolean](ldc:int(2188), ldc:int(2189)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u5654\u5140\u516c\ub7dc\u8753\uff55(java.net.InetAddress p0, int p1) {
        var_3_21E : int
        var_5_6A : List<ChannelFuture>
        var_6_12F : Serializable
        var_7_148 : Object
        stack_262_0 : List<ChannelFuture> [generated]
        stack_24A_0 : ServerBootstrap [generated]
        stack_244_0 : Object [generated]
        stack_262_1 : ChannelFuture [generated]
        
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
            var_3_21E = and:int(and:int(ldc:int(1090112853), ldc:int(402087221)), ldc:int(1224567935))
            monitorenter(var_5_6A = getfield:List<ChannelFuture>(\u9255\u0b8e\ud36e\ucef1\ud523::\uc3e3\u4daf\u3c25\u516c\u3a62\u56bd, this:\u9255\u0b8e\ud36e\ucef1\ud523))
            
            try {
                loop {
                    if (cmpeq:boolean(and:int(var_3_21E:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_21E = and:int(var_3_21E:int, ldc:int(768310295))
                        goto(Label_0251)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_21E:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0201)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_21E:int, ldc:int(1)), ldc:int(0))) {
                        var_3_21E = and:int(var_3_21E:int, ldc:int(-247709236))
                    }
                    else {
                        var_3_21E = and:int(var_3_21E:int, ldc:int(1207887701))
                        
                        if (logicalnot:boolean(invokestatic:boolean(Epoll::isAvailable))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_0157:
                    
                    if (cmpeq:boolean(and:int(var_3_21E:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0251)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_21E:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_21E = and:int(var_3_21E:int, ldc:int(976117347))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_21E:int, ldc:int(2097152)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_21E = and:int(var_3_21E:int, ldc:int(448548477))
                        
                        if (logicalnot:boolean(invokevirtual:boolean(\u88c5\ud171\ub113\u6435\ud51e::\u156b\u446c\ubded\ud158\u7873\u183a, getfield:\u88c5\ud171\ub113\u6435\ud51e(\u9255\u0b8e\ud36e\ucef1\ud523::\uc910\u71ae\u8258\ufcaf\u7d52\u3dd3, this:\u9255\u0b8e\ud36e\ucef1\ud523)))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_0201:
                    
                    if (cmpne:boolean(and:int(var_3_21E:int, ldc:int(128)), ldc:int(0))) {
                        var_3_21E = and:int(var_3_21E:int, ldc:int(-1302361537))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_21E:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_21E = and:int(var_3_21E:int, ldc:int(454521380))
                            goto(Label_0157)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_21E:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_21E = and:int(var_3_21E:int, ldc:int(71993739))
                            loopcontinue()
                        }
                        
                        var_3_21E = and:int(var_3_21E:int, ldc:int(1454404887))
                    }
                    
                    Label_0251:
                    
                    if (cmpeq:boolean(and:int(var_3_21E:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_21E = and:int(var_3_21E:int, ldc:int(2103504397))
                        goto(Label_0201)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_21E:int, ldc:int(4)), ldc:int(0))) {
                        var_3_21E = and:int(var_3_21E:int, ldc:int(-2120597224))
                        goto(Label_0157)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_21E:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_21E = and:int(var_3_21E:int, ldc:int(985873835))
                    }
                    else {
                        var_3_21E = and:int(var_3_21E:int, ldc:int(498951839))
                        var_6_12F = ldc:Class<EpollServerSocketChannel>[expected:Serializable](io.netty.channel.epoll.EpollServerSocketChannel.class)
                        Label_0305:
                        
                        if (cmpeq:boolean(and:int(var_3_21E:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_21E = and:int(var_3_21E:int, ldc:int(-855086287))
                            goto(Label_0409)
                        }
                        
                        var_3_21E = and:int(var_3_21E:int, ldc:int(-189115371))
                        var_7_148 = getstatic:\u62da\u61a4\ub19c\u8cae\u92ff\ubb2b<EpollEventLoopGroup>[expected:Object](\u9255\u0b8e\ud36e\ucef1\ud523::\u34df\u3776\ub70c\u6cfe\u9a18\u416d)
                        Label_0330:
                        
                        if (cmpne:boolean(and:int(var_3_21E:int, ldc:int(128)), ldc:int(0))) {
                            var_3_21E = and:int(var_3_21E:int, ldc:int(-1553619265))
                            goto(Label_0684)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_21E:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0616)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_21E:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0494)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_21E:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_21E = and:int(var_3_21E:int, ldc:int(-1686707414))
                            goto(Label_0426)
                        }
                        
                        var_3_21E = and:int(var_3_21E:int, ldc:int(-860821507))
                        invokeinterface:void(Logger::info, getstatic:Logger(\u9255\u0b8e\ud36e\ucef1\ud523::\u76bc\u0800\uc87f\u61a4\u62da\ubded), loadelement:String(getstatic:String[](\u9255\u0b8e\ud36e\ucef1\ud523::\u8640\u1833\u0c95\ufcaf\u4e72\ucef1), and:int(ldc:int(11634), ldc:int(-11767))))
                        goto(Label_0494)
                    }
                }
                
                var_6_12F = ldc:Class<NioServerSocketChannel>[expected:Serializable](io.netty.channel.socket.nio.NioServerSocketChannel.class)
                Label_0409:
                
                if (cmpne:boolean(and:int(var_3_21E:int, ldc:int(512)), ldc:int(0))) {
                    goto(Label_0305)
                }
                
                var_3_21E = and:int(var_3_21E:int, ldc:int(-2130873227))
                var_7_148 = getstatic:\u62da\u61a4\ub19c\u8cae\u92ff\ubb2b<NioEventLoopGroup>[expected:Object](\u9255\u0b8e\ud36e\ucef1\ud523::\u836c\u6198\u98a4\u8df4\u983f\u3d64)
                Label_0426:
                
                if (cmpeq:boolean(and:int(var_3_21E:int, ldc:int(1)), ldc:int(0))) {
                    var_3_21E = and:int(var_3_21E:int, ldc:int(1127089114))
                    goto(Label_0684)
                }
                
                if (cmpne:boolean(and:int(var_3_21E:int, ldc:int(131072)), ldc:int(0))) {
                    var_3_21E = and:int(var_3_21E:int, ldc:int(-2141256680))
                    goto(Label_0616)
                }
                
                if (cmpne:boolean(and:int(var_3_21E:int, ldc:int(1024)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_3_21E:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0330)
                    }
                    
                    var_3_21E = and:int(var_3_21E:int, ldc:int(167212895))
                    invokeinterface:void(Logger::info, getstatic:Logger(\u9255\u0b8e\ud36e\ucef1\ud523::\u76bc\u0800\uc87f\u61a4\u62da\ubded), loadelement:String(getstatic:String[](\u9255\u0b8e\ud36e\ucef1\ud523::\u8640\u1833\u0c95\ufcaf\u4e72\ucef1), xor:int(ldc:int(16512), ldc:int(16513))))
                }
                
                Label_0494:
                
                if (cmpeq:boolean(and:int(var_3_21E:int, ldc:int(1)), ldc:int(0))) {
                    var_3_21E = and:int(var_3_21E:int, ldc:int(1925455106))
                    goto(Label_0684)
                }
                
                if (cmpeq:boolean(and:int(var_3_21E:int, ldc:int(131072)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_3_21E:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_21E = and:int(var_3_21E:int, ldc:int(305932670))
                        goto(Label_0426)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_21E:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0330)
                    }
                    
                    var_3_21E = and:int(var_3_21E:int, ldc:int(1945292159))
                    stack_262_0 = getfield:List<ChannelFuture>(\u9255\u0b8e\ud36e\ucef1\ud523::\uc3e3\u4daf\u3c25\u516c\u3a62\u56bd, this:\u9255\u0b8e\ud36e\ucef1\ud523)
                    stack_24A_0 = invokevirtual:ServerBootstrap(ServerBootstrap::childHandler, checkcast:ServerBootstrap(io.netty.bootstrap.ServerBootstrap.class, invokevirtual:AbstractBootstrap[expected:ServerBootstrap](ServerBootstrap::channel, initobject:ServerBootstrap(ServerBootstrap::<init>), var_6_12F:Class)), initobject:\uc84e\u3c25\u51b2\u7330\ud7e8[expected:ChannelHandler](\uc84e\u3c25\u51b2\u7330\ud7e8::<init>, this:\u9255\u0b8e\ud36e\ucef1\ud523))
                    stack_244_0 = var_7_148:Object
                    var_3_21E = and:int(var_3_21E:int, ldc:int(-33882763))
                    stack_262_1 = invokeinterface:ChannelFuture(ChannelFuture::syncUninterruptibly, invokevirtual:ChannelFuture(ServerBootstrap::bind, checkcast:ServerBootstrap(io.netty.bootstrap.ServerBootstrap.class, invokevirtual:AbstractBootstrap[expected:ServerBootstrap](ServerBootstrap::localAddress, invokevirtual:ServerBootstrap(ServerBootstrap::group, stack_24A_0:ServerBootstrap, checkcast:EventLoopGroup(io.netty.channel.EventLoopGroup.class, invokevirtual:EventLoopGroup(\u62da\u61a4\ub19c\u8cae\u92ff\ubb2b<EventLoopGroup>::\u5fe1\u6fb0\u3bd6\u3504\u8c8a\u3bc9, stack_244_0:\u62da\u61a4\ub19c\u8cae\u92ff\ubb2b<EventLoopGroup>))), p0:InetAddress, p1:int))))
                    var_3_21E = and:int(var_3_21E:int, ldc:int(1677418039))
                    invokeinterface:boolean(List<ChannelFuture>::add, stack_262_0:List<ChannelFuture>, stack_262_1:ChannelFuture)
                }
                
                Label_0616:
                
                if (cmpeq:boolean(and:int(var_3_21E:int, ldc:int(8388608)), ldc:int(0))) {
                    var_3_21E = and:int(var_3_21E:int, ldc:int(-1774938792))
                }
                else {
                    if (cmpne:boolean(and:int(var_3_21E:int, ldc:int(512)), ldc:int(0))) {
                        var_3_21E = and:int(var_3_21E:int, ldc:int(803644418))
                        goto(Label_0494)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_21E:int, ldc:int(4)), ldc:int(0))) {
                        var_3_21E = and:int(var_3_21E:int, ldc:int(-2023492564))
                        goto(Label_0426)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_21E:int, ldc:int(512)), ldc:int(0))) {
                        var_3_21E = and:int(var_3_21E:int, ldc:int(2083846936))
                        goto(Label_0330)
                    }
                    
                    var_3_21E = and:int(var_3_21E:int, ldc:int(1538476029))
                    monitorexit(var_5_6A:List<ChannelFuture>)
                }
                
                Label_0684:
                
                if (cmpeq:boolean(and:int(var_3_21E:int, ldc:int(16384)), ldc:int(0))) {
                    goto(Label_0616)
                }
                
                if (cmpne:boolean(and:int(var_3_21E:int, ldc:int(8192)), ldc:int(0))) {
                    var_3_21E = and:int(var_3_21E:int, ldc:int(2135026879))
                    goto(Label_0494)
                }
                
                if (cmpne:boolean(and:int(var_3_21E:int, ldc:int(512)), ldc:int(0))) {
                    var_3_21E = and:int(var_3_21E:int, ldc:int(-1374793369))
                    goto(Label_0426)
                }
                
                if (cmpne:boolean(and:int(var_3_21E:int, ldc:int(128)), ldc:int(0))) {
                    goto(Label_0330)
                }
                
                var_3_21E = and:int(var_3_21E:int, ldc:int(1459603037))
            }
            finally {
                monitorexit(var_5_6A:List<ChannelFuture>)
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public java.net.SocketAddress \u3776\uc7fe\u1187\u8bb0\u4ab3\ubb2b() {
        var_1_64 : int
        var_3_6A : List<ChannelFuture>
        stack_99_0 : ServerBootstrap [generated]
        stack_93_0 : \u62da\u61a4\ub19c\u8cae\u92ff\ubb2b<NioEventLoopGroup> [generated]
        var_4_AD : ChannelFuture
        
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
            var_1_64 = and:int(and:int(ldc:int(-939752465), ldc:int(-33974209)), ldc:int(-268910401))
            monitorenter(var_3_6A = getfield:List<ChannelFuture>(\u9255\u0b8e\ud36e\ucef1\ud523::\uc3e3\u4daf\u3c25\u516c\u3a62\u56bd, this:\u9255\u0b8e\ud36e\ucef1\ud523))
            
            try {
                var_1_64 = and:int(var_1_64:int, ldc:int(-839071137))
                stack_99_0 = invokevirtual:ServerBootstrap(ServerBootstrap::childHandler, checkcast:ServerBootstrap(io.netty.bootstrap.ServerBootstrap.class, invokevirtual:AbstractBootstrap[expected:ServerBootstrap](ServerBootstrap::channel, initobject:ServerBootstrap(ServerBootstrap::<init>), ldc:Class<LocalServerChannel>(io.netty.channel.local.LocalServerChannel.class))), initobject:\u946b\u3776\ufcaf\u7330\u1833[expected:ChannelHandler](\u946b\u3776\ufcaf\u7330\u1833::<init>, this:\u9255\u0b8e\ud36e\ucef1\ud523))
                stack_93_0 = getstatic:\u62da\u61a4\ub19c\u8cae\u92ff\ubb2b<NioEventLoopGroup>(\u9255\u0b8e\ud36e\ucef1\ud523::\u836c\u6198\u98a4\u8df4\u983f\u3d64)
                var_1_64 = and:int(var_1_64:int, ldc:int(-402666969))
                var_4_AD = invokeinterface:ChannelFuture(ChannelFuture::syncUninterruptibly, invokevirtual:ChannelFuture(ServerBootstrap::bind, checkcast:ServerBootstrap(io.netty.bootstrap.ServerBootstrap.class, invokevirtual:AbstractBootstrap[expected:ServerBootstrap](ServerBootstrap::localAddress, invokevirtual:ServerBootstrap(ServerBootstrap::group, stack_99_0:ServerBootstrap, checkcast:EventLoopGroup(io.netty.channel.EventLoopGroup.class, invokevirtual:NioEventLoopGroup[expected:EventLoopGroup](\u62da\u61a4\ub19c\u8cae\u92ff\ubb2b<NioEventLoopGroup>::\u5fe1\u6fb0\u3bd6\u3504\u8c8a\u3bc9, stack_93_0:\u62da\u61a4\ub19c\u8cae\u92ff\ubb2b<NioEventLoopGroup>))), getstatic:LocalAddress[expected:SocketAddress](LocalAddress::ANY)))))
                
                loop {
                    if (cmpeq:boolean(and:int(var_1_64:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_1_64 = and:int(var_1_64:int, ldc:int(1157022478))
                        goto(Label_0235)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_64:int, ldc:int(8388608)), ldc:int(0))) {
                        var_1_64 = and:int(var_1_64:int, ldc:int(-268699393))
                        invokeinterface:boolean(List<ChannelFuture>::add, getfield:List<ChannelFuture>(\u9255\u0b8e\ud36e\ucef1\ud523::\uc3e3\u4daf\u3c25\u516c\u3a62\u56bd, this:\u9255\u0b8e\ud36e\ucef1\ud523), var_4_AD:ChannelFuture)
                    }
                    
                    Label_0214:
                    
                    if (cmpne:boolean(and:int(var_1_64:int, ldc:int(8388608)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_1_64:int, ldc:int(32768)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_1_64 = and:int(var_1_64:int, ldc:int(-704668209))
                        monitorexit(var_3_6A:List<ChannelFuture>)
                    }
                    
                    Label_0235:
                    
                    if (cmpeq:boolean(and:int(var_1_64:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0214)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_64:int, ldc:int(2)), ldc:int(0))) {
                        looporswitchbreak()
                    }
                    
                    var_1_64 = and:int(var_1_64:int, ldc:int(-521972990))
                }
                
                var_1_64 = and:int(var_1_64:int, ldc:int(-704913329))
            }
            finally {
                monitorexit(var_3_6A:List<ChannelFuture>)
            }
            
            return:SocketAddress(invokeinterface:SocketAddress(Channel::localAddress, invokeinterface:Channel(ChannelFuture::channel, var_4_AD:ChannelFuture)))
        }
        
        goto(Label_0006)
    }
    
    public void \u873d\uc229\u4d85\u97b7\u93a2\u4c04() {
        var_1_5F : int
        var_1_8E : int
        var_3_98 : Iterator<ChannelFuture>
        var_1_11E : int
        var_4_D0 : ChannelFuture
        
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
            var_1_5F = and:int(ldc:int(387374199), ldc:int(-1755319075))
            
            do {
                if (cmpne:boolean(and:int(var_1_5F:int, ldc:int(524288)), ldc:int(0))) {
                    var_1_5F = and:int(var_1_5F:int, ldc:int(1314559805))
                }
                else {
                    var_1_5F = and:int(var_1_5F:int, ldc:int(1408695767))
                    putfield:boolean(\u9255\u0b8e\ud36e\ucef1\ud523::\u8753\ud217\u6ec6\u836c\ucfaf\u62da, this:\u9255\u0b8e\ud36e\ucef1\ud523, and:int[expected:boolean](ldc:int(9826), ldc:int(-9843)))
                }
            } while (cmpeq:boolean(and:int(var_1_5F:int, ldc:int(16384)), ldc:int(0)))
            
            var_1_8E = and:int(var_1_5F:int, ldc:int(-549980292))
            var_3_98 = invokeinterface:Iterator<ChannelFuture>(List<ChannelFuture>::iterator, getfield:List<ChannelFuture>(\u9255\u0b8e\ud36e\ucef1\ud523::\uc3e3\u4daf\u3c25\u516c\u3a62\u56bd, this:\u9255\u0b8e\ud36e\ucef1\ud523))
            
            loop {
                if (cmpeq:boolean(and:int(var_1_8E:int, ldc:int(33554432)), ldc:int(0))) {
                    var_1_8E = and:int(var_1_8E:int, ldc:int(-60434055))
                }
                else {
                    var_1_8E = and:int(var_1_8E:int, ldc:int(993970395))
                    
                    if (logicalnot:boolean(invokeinterface:boolean(Iterator::hasNext, var_3_98:Iterator<ChannelFuture>))) {
                        looporswitchbreak()
                    }
                }
                
                if (cmpne:boolean(and:int(var_1_8E:int, ldc:int(16777216)), ldc:int(0))) {
                    var_1_11E = and:int(var_1_8E:int, ldc:int(459273972))
                    var_4_D0 = checkcast:ChannelFuture(io.netty.channel.ChannelFuture.class, invokeinterface:ChannelFuture(Iterator<ChannelFuture>::next, var_3_98:Iterator<ChannelFuture>))
                    
                    try {
                        loop {
                            if (cmpeq:boolean(and:int(var_1_11E:int, ldc:int(32768)), ldc:int(0))) {
                                var_1_11E = and:int(var_1_11E:int, ldc:int(-892685892))
                            }
                            else {
                                var_1_11E = and:int(var_1_11E:int, ldc:int(1533011952))
                                invokeinterface:ChannelFuture(ChannelFuture::sync, invokeinterface:ChannelFuture(Channel::close, invokeinterface:Channel(ChannelFuture::channel, var_4_D0:ChannelFuture)))
                            }
                            
                            if (cmpne:boolean(and:int(var_1_11E:int, ldc:int(1048576)), ldc:int(0))) {
                                looporswitchbreak()
                            }
                            
                            var_1_11E = and:int(var_1_11E:int, ldc:int(-651117884))
                        }
                        
                        var_1_11E = and:int(var_1_11E:int, ldc:int(-1623198629))
                    }
                    catch (java.lang.InterruptedException var_5_117) {
                        var_1_11E = and:int(var_1_11E:int, ldc:int(390054014))
                        invokeinterface:void(Logger::error, getstatic:Logger(\u9255\u0b8e\ud36e\ucef1\ud523::\u76bc\u0800\uc87f\u61a4\u62da\ubded), loadelement:String(getstatic:String[](\u9255\u0b8e\ud36e\ucef1\ud523::\u8640\u1833\u0c95\ufcaf\u4e72\ucef1), xor:int(ldc:int(18593), ldc:int(18595))))
                    }
                    
                    var_1_8E = and:int(var_1_11E:int, ldc:int(-610345742))
                }
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u836c\u927d\ubded\u8709\u071d\uc238() {
        var_1_67 : int
        var_3_6D : List<\u527a\u494c\u88c5\u965f\u759a>
        var_4_7E : Iterator<\u527a\u494c\u88c5\u965f\u759a>
        var_5_118 : \u527a\u494c\u88c5\u965f\u759a
        var_6_34F : Exception
        var_7_453 : StringTextComponent
        
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
            var_1_67 = and:int(and:int(ldc:int(-1907094857), ldc:int(-1075347669)), ldc:int(-1116022598))
            monitorenter(var_3_6D = getfield:List<\u527a\u494c\u88c5\u965f\u759a>(\u9255\u0b8e\ud36e\ucef1\ud523::\u5654\u59ec\u5f50\ubff1\u7006\u6435, this:\u9255\u0b8e\ud36e\ucef1\ud523))
            
            try {
                var_1_67 = and:int(var_1_67:int, ldc:int(-45797610))
                var_4_7E = invokeinterface:Iterator<\u527a\u494c\u88c5\u965f\u759a>(List<\u527a\u494c\u88c5\u965f\u759a>::iterator, getfield:List<\u527a\u494c\u88c5\u965f\u759a>(\u9255\u0b8e\ud36e\ucef1\ud523::\u5654\u59ec\u5f50\ubff1\u7006\u6435, this:\u9255\u0b8e\ud36e\ucef1\ud523))
                
                loop {
                    if (cmpeq:boolean(and:int(var_1_67:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1463)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_67:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0214)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_67:int, ldc:int(8)), ldc:int(0))) {
                        var_1_67 = and:int(var_1_67:int, ldc:int(1823609756))
                    }
                    else {
                        var_1_67 = and:int(var_1_67:int, ldc:int(-1091507642))
                        
                        if (logicalnot:boolean(invokeinterface:boolean(Iterator::hasNext, var_4_7E:Iterator<\u527a\u494c\u88c5\u965f\u759a>))) {
                            monitorexit(var_3_6D:List<\u527a\u494c\u88c5\u965f\u759a>)
                            goto(Label_1463)
                        }
                    }
                    
                    Label_0176:
                    
                    if (cmpeq:boolean(and:int(var_1_67:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1463)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_67:int, ldc:int(134217728)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_1_67:int, ldc:int(67108864)), ldc:int(0))) {
                            var_1_67 = and:int(var_1_67:int, ldc:int(-1367087526))
                            loopcontinue()
                        }
                        
                        var_1_67 = and:int(var_1_67:int, ldc:int(-867890486))
                    }
                    
                    Label_0214:
                    
                    if (cmpne:boolean(and:int(var_1_67:int, ldc:int(256)), ldc:int(0))) {
                        var_1_67 = and:int(var_1_67:int, ldc:int(-247181964))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_1_67:int, ldc:int(32768)), ldc:int(0))) {
                            var_1_67 = and:int(var_1_67:int, ldc:int(-919248138))
                            goto(Label_0176)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_67:int, ldc:int(2048)), ldc:int(0))) {
                            var_1_67 = and:int(var_1_67:int, ldc:int(344101064))
                            loopcontinue()
                        }
                        
                        var_1_67 = and:int(var_1_67:int, ldc:int(-322737018))
                        var_5_118 = checkcast:\u527a\u494c\u88c5\u965f\u759a(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u527a\u494c\u88c5\u965f\u759a.class, invokeinterface:\u527a\u494c\u88c5\u965f\u759a(Iterator<\u527a\u494c\u88c5\u965f\u759a>::next, var_4_7E:Iterator<\u527a\u494c\u88c5\u965f\u759a>))
                        
                        loop {
                            if (cmpne:boolean(and:int(var_1_67:int, ldc:int(268435456)), ldc:int(0))) {
                                var_1_67 = and:int(var_1_67:int, ldc:int(45643244))
                                goto(Label_1342)
                            }
                            
                            if (cmpne:boolean(and:int(var_1_67:int, ldc:int(8192)), ldc:int(0))) {
                                var_1_67 = and:int(var_1_67:int, ldc:int(-1665317716))
                                goto(Label_1241)
                            }
                            
                            if (cmpeq:boolean(and:int(var_1_67:int, ldc:int(2147483647)), ldc:int(0))) {
                                goto(Label_0761)
                            }
                            
                            if (cmpne:boolean(and:int(var_1_67:int, ldc:int(1024)), ldc:int(0))) {
                                var_1_67 = and:int(var_1_67:int, ldc:int(-1764007943))
                                goto(Label_0660)
                            }
                            
                            if (cmpne:boolean(and:int(var_1_67:int, ldc:int(1024)), ldc:int(0))) {
                                goto(Label_0566)
                            }
                            
                            if (cmpne:boolean(and:int(var_1_67:int, ldc:int(2097152)), ldc:int(0))) {
                                goto(Label_0460)
                            }
                            
                            if (cmpne:boolean(and:int(var_1_67:int, ldc:int(2)), ldc:int(0))) {
                                var_1_67 = and:int(var_1_67:int, ldc:int(-538088125))
                                
                                if (invokevirtual:boolean(\u527a\u494c\u88c5\u965f\u759a::\ud36e\u516c\u1187\ub18d\u6d69\u718f, var_5_118:\u527a\u494c\u88c5\u965f\u759a)) {
                                    goto(Label_1342)
                                }
                            }
                            
                            Label_0373:
                            
                            if (cmpeq:boolean(and:int(var_1_67:int, ldc:int(4194304)), ldc:int(0))) {
                                goto(Label_1342)
                            }
                            
                            if (cmpeq:boolean(and:int(var_1_67:int, ldc:int(2147483647)), ldc:int(0))) {
                                goto(Label_1241)
                            }
                            
                            if (cmpeq:boolean(and:int(var_1_67:int, ldc:int(4194304)), ldc:int(0))) {
                                var_1_67 = and:int(var_1_67:int, ldc:int(-1890830168))
                                goto(Label_0761)
                            }
                            
                            if (cmpeq:boolean(and:int(var_1_67:int, ldc:int(2048)), ldc:int(0))) {
                                goto(Label_0660)
                            }
                            
                            if (cmpne:boolean(and:int(var_1_67:int, ldc:int(8)), ldc:int(0))) {
                                var_1_67 = and:int(var_1_67:int, ldc:int(1688557431))
                                goto(Label_0566)
                            }
                            
                            if (cmpeq:boolean(and:int(var_1_67:int, ldc:int(32768)), ldc:int(0))) {
                                if (cmpne:boolean(and:int(var_1_67:int, ldc:int(268435456)), ldc:int(0))) {
                                    var_1_67 = and:int(var_1_67:int, ldc:int(-738435736))
                                    loopcontinue()
                                }
                                
                                var_1_67 = and:int(var_1_67:int, ldc:int(-26165661))
                            }
                            
                            Label_0460:
                            
                            if (cmpne:boolean(and:int(var_1_67:int, ldc:int(65536)), ldc:int(0))) {
                                var_1_67 = and:int(var_1_67:int, ldc:int(-390332414))
                                goto(Label_1342)
                            }
                            
                            if (cmpeq:boolean(and:int(var_1_67:int, ldc:int(2048)), ldc:int(0))) {
                                goto(Label_1241)
                            }
                            
                            if (cmpeq:boolean(and:int(var_1_67:int, ldc:int(134217728)), ldc:int(0))) {
                                goto(Label_0761)
                            }
                            
                            if (cmpeq:boolean(and:int(var_1_67:int, ldc:int(4194304)), ldc:int(0))) {
                                var_1_67 = and:int(var_1_67:int, ldc:int(92260909))
                                goto(Label_0660)
                            }
                            
                            if (cmpne:boolean(and:int(var_1_67:int, ldc:int(268435456)), ldc:int(0))) {
                                var_1_67 = and:int(var_1_67:int, ldc:int(-1649697056))
                            }
                            else {
                                if (cmpeq:boolean(and:int(var_1_67:int, ldc:int(4194304)), ldc:int(0))) {
                                    goto(Label_0373)
                                }
                                
                                if (cmpeq:boolean(and:int(var_1_67:int, ldc:int(67108864)), ldc:int(0))) {
                                    var_1_67 = and:int(var_1_67:int, ldc:int(-1661044423))
                                    loopcontinue()
                                }
                                
                                var_1_67 = and:int(var_1_67:int, ldc:int(-1368806738))
                                
                                if (logicalnot:boolean(invokevirtual:boolean(\u527a\u494c\u88c5\u965f\u759a::\u98a4\u960f\u6198\u3d4b\ub83f\ud171, var_5_118:\u527a\u494c\u88c5\u965f\u759a))) {
                                    invokeinterface:void(Iterator<E>::remove, var_4_7E:Iterator<\u527a\u494c\u88c5\u965f\u759a>)
                                    goto(Label_1241)
                                }
                            }
                            
                            Label_0566:
                            
                            if (cmpeq:boolean(and:int(var_1_67:int, ldc:int(2)), ldc:int(0))) {
                                var_1_67 = and:int(var_1_67:int, ldc:int(542501647))
                                goto(Label_1342)
                            }
                            
                            if (cmpne:boolean(and:int(var_1_67:int, ldc:int(1024)), ldc:int(0))) {
                                goto(Label_1241)
                            }
                            
                            if (cmpeq:boolean(and:int(var_1_67:int, ldc:int(2)), ldc:int(0))) {
                                var_1_67 = and:int(var_1_67:int, ldc:int(1993652826))
                                goto(Label_0761)
                            }
                            
                            if (cmpeq:boolean(and:int(var_1_67:int, ldc:int(4194304)), ldc:int(0))) {
                                var_1_67 = and:int(var_1_67:int, ldc:int(-1674111241))
                            }
                            else {
                                if (cmpne:boolean(and:int(var_1_67:int, ldc:int(268435456)), ldc:int(0))) {
                                    goto(Label_0460)
                                }
                                
                                if (cmpeq:boolean(and:int(var_1_67:int, ldc:int(4194304)), ldc:int(0))) {
                                    goto(Label_0373)
                                }
                                
                                if (cmpeq:boolean(and:int(var_1_67:int, ldc:int(2)), ldc:int(0))) {
                                    var_1_67 = and:int(var_1_67:int, ldc:int(935538406))
                                    loopcontinue()
                                }
                                
                                var_1_67 = and:int(var_1_67:int, ldc:int(-1890564022))
                            }
                            
                            try {
                                Label_0660:
                                
                                while (cmpne:boolean(and:int(var_1_67:int, ldc:int(4194304)), ldc:int(0))) {
                                    if (cmpeq:boolean(and:int(var_1_67:int, ldc:int(2)), ldc:int(0))) {
                                        goto(Label_1241)
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_1_67:int, ldc:int(64)), ldc:int(0))) {
                                        if (cmpeq:boolean(and:int(var_1_67:int, ldc:int(2147483647)), ldc:int(0))) {
                                            goto(Block_63)
                                        }
                                        
                                        if (cmpne:boolean(and:int(var_1_67:int, ldc:int(8)), ldc:int(0))) {
                                            goto(Block_64)
                                        }
                                        
                                        if (cmpne:boolean(and:int(var_1_67:int, ldc:int(268435456)), ldc:int(0))) {
                                            goto(Block_65)
                                        }
                                        
                                        if (cmpeq:boolean(and:int(var_1_67:int, ldc:int(2048)), ldc:int(0))) {
                                            goto(Block_66)
                                        }
                                        
                                        var_1_67 = and:int(var_1_67:int, ldc:int(-546185978))
                                        invokevirtual:void(\u527a\u494c\u88c5\u965f\u759a::\u446c\u93a2\u76bc\uc7fe\uf94d\uc246, var_5_118:\u527a\u494c\u88c5\u965f\u759a)
                                    }
                                    
                                    Label_0761:
                                    
                                    if (cmpne:boolean(and:int(var_1_67:int, ldc:int(64)), ldc:int(0))) {
                                        looporswitchbreak()
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_1_67:int, ldc:int(65536)), ldc:int(0))) {
                                        goto(Label_1241)
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_1_67:int, ldc:int(2048)), ldc:int(0))) {
                                        goto(Block_69)
                                    }
                                }
                                
                                goto(Label_1342)
                                Block_63:
                                var_1_67 = and:int(var_1_67:int, ldc:int(-1732872396))
                                goto(Label_0566)
                                Block_64:
                                var_1_67 = and:int(var_1_67:int, ldc:int(-2136995516))
                                goto(Label_0460)
                                Block_65:
                                var_1_67 = and:int(var_1_67:int, ldc:int(412865783))
                                goto(Label_0373)
                                Block_66:
                                var_1_67 = and:int(var_1_67:int, ldc:int(401690125))
                                loopcontinue()
                                Block_69:
                                
                                if (cmpne:boolean(and:int(var_1_67:int, ldc:int(2097152)), ldc:int(0))) {
                                    goto(Label_0566)
                                }
                                
                                if (cmpne:boolean(and:int(var_1_67:int, ldc:int(268435456)), ldc:int(0))) {
                                    var_1_67 = and:int(var_1_67:int, ldc:int(-956093306))
                                    goto(Label_0460)
                                }
                                
                                if (cmpne:boolean(and:int(var_1_67:int, ldc:int(268435456)), ldc:int(0))) {
                                    var_1_67 = and:int(var_1_67:int, ldc:int(1920704813))
                                    goto(Label_0373)
                                }
                                
                                if (cmpne:boolean(and:int(var_1_67:int, ldc:int(268435456)), ldc:int(0))) {
                                    loopcontinue()
                                }
                                
                                var_1_67 = and:int(var_1_67:int, ldc:int(-1647259861))
                            }
                            catch (java.lang.Exception var_6_34F) {
                                loop {
                                    if (cmpeq:boolean(and:int(var_1_67:int, ldc:int(67108864)), ldc:int(0))) {
                                        var_1_67 = and:int(var_1_67:int, ldc:int(-1684592761))
                                        goto(Label_1033)
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_1_67:int, ldc:int(32768)), ldc:int(0))) {
                                        var_1_67 = and:int(var_1_67:int, ldc:int(1028642739))
                                        goto(Label_0942)
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_1_67:int, ldc:int(67108864)), ldc:int(0))) {
                                        var_1_67 = and:int(var_1_67:int, ldc:int(-311199665))
                                        
                                        if (logicalnot:boolean(invokevirtual:boolean(\u527a\u494c\u88c5\u965f\u759a::\u59ec\ua61f\u36d3\u4e72\u7006\u927d, var_5_118:\u527a\u494c\u88c5\u965f\u759a))) {
                                            invokeinterface:void(Logger::warn, getstatic:Logger(\u9255\u0b8e\ud36e\ucef1\ud523::\u76bc\u0800\uc87f\u61a4\u62da\ubded), loadelement:String(getstatic:String[](\u9255\u0b8e\ud36e\ucef1\ud523::\u8640\u1833\u0c95\ufcaf\u4e72\ucef1), xor:int(ldc:int(5135), ldc:int(5131))), invokevirtual:SocketAddress(\u527a\u494c\u88c5\u965f\u759a::\ucb79\u47c2\u960f\u36d3\u6d69\u6c52, var_5_118:\u527a\u494c\u88c5\u965f\u759a), var_6_34F:Exception[expected:Object])
                                            goto(Label_1033)
                                        }
                                    }
                                    
                                    Label_0904:
                                    
                                    if (cmpeq:boolean(and:int(var_1_67:int, ldc:int(67108864)), ldc:int(0))) {
                                        var_1_67 = and:int(var_1_67:int, ldc:int(-1667534621))
                                        goto(Label_1033)
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_1_67:int, ldc:int(268435456)), ldc:int(0))) {
                                        if (cmpeq:boolean(and:int(var_1_67:int, ldc:int(2)), ldc:int(0))) {
                                            loopcontinue()
                                        }
                                        
                                        var_1_67 = and:int(var_1_67:int, ldc:int(-1630754014))
                                    }
                                    
                                    Label_0942:
                                    
                                    if (cmpne:boolean(and:int(var_1_67:int, ldc:int(134217728)), ldc:int(0))) {
                                        if (cmpne:boolean(and:int(var_1_67:int, ldc:int(8192)), ldc:int(0))) {
                                            goto(Label_0904)
                                        }
                                        
                                        if (cmpeq:boolean(and:int(var_1_67:int, ldc:int(2)), ldc:int(0))) {
                                            var_1_67 = and:int(var_1_67:int, ldc:int(-1464386554))
                                            loopcontinue()
                                        }
                                        
                                        var_1_67 = and:int(var_1_67:int, ldc:int(-866493138))
                                        athrow(initobject:\uceb8\u8258\uf9c5\uc229\u7330\ucfaf(\uceb8\u8258\uf9c5\uc229\u7330\ucfaf::<init>, invokestatic:\u1833\u88c5\u0b8e\uc9f6\u960f\u839e(\u1833\u88c5\u0b8e\uc9f6\u960f\u839e::\ubcb0\u59ec\u6d99\u156b\u0800\u946b, var_6_34F:Exception[expected:Throwable], loadelement:String(getstatic:String[](\u9255\u0b8e\ud36e\ucef1\ud523::\u8640\u1833\u0c95\ufcaf\u4e72\ucef1), xor:int(ldc:int(24835), ldc:int(24832))))))
                                    }
                                    
                                    Label_1033:
                                    
                                    if (cmpne:boolean(and:int(var_1_67:int, ldc:int(268435456)), ldc:int(0))) {
                                        var_1_67 = and:int(var_1_67:int, ldc:int(-1449317991))
                                        goto(Label_0942)
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_1_67:int, ldc:int(8192)), ldc:int(0))) {
                                        var_1_67 = and:int(var_1_67:int, ldc:int(146925488))
                                        goto(Label_0904)
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_1_67:int, ldc:int(8)), ldc:int(0))) {
                                        var_1_67 = and:int(var_1_67:int, ldc:int(-270729729))
                                        var_7_453 = initobject:StringTextComponent(StringTextComponent::<init>, loadelement:String(getstatic:String[](\u9255\u0b8e\ud36e\ucef1\ud523::\u8640\u1833\u0c95\ufcaf\u4e72\ucef1), xor:int(ldc:int(105), ldc:int(108))))
                                        
                                        loop {
                                            if (cmpne:boolean(and:int(var_1_67:int, ldc:int(64)), ldc:int(0))) {
                                                var_1_67 = and:int(var_1_67:int, ldc:int(565049832))
                                                goto(Label_1198)
                                            }
                                            
                                            if (cmpne:boolean(and:int(var_1_67:int, ldc:int(67108864)), ldc:int(0))) {
                                                var_1_67 = and:int(var_1_67:int, ldc:int(-578892618))
                                                invokevirtual:void(\u527a\u494c\u88c5\u965f\u759a::\u6fb0\u5d20\u93a2\u92ff\ud158\uc4d2, var_5_118:\u527a\u494c\u88c5\u965f\u759a, initobject:\uae5d\u71f1\u8d98\u071d\u4492(\uae5d\u71f1\u8d98\u071d\u4492::<init>, var_7_453:StringTextComponent[expected:ITextComponent]), invokedynamic:GenericFutureListener(operationComplete:(L\u4492\u8aa5\ud171\uc3e3\u4c2b/\u4c04\ua068\u3d64\ua6bd\u8389/\u960f\ubefe\ud4fe\u7c6b\u5db4/\u527a\u494c\u88c5\u965f\u759a;Lnet/minecraft/util/text/ITextComponent;)Lio/netty/util/concurrent/GenericFutureListener;, var_5_118:\u527a\u494c\u88c5\u965f\u759a, var_7_453:StringTextComponent))
                                            }
                                            
                                            Label_1163:
                                            
                                            if (cmpeq:boolean(and:int(var_1_67:int, ldc:int(2048)), ldc:int(0))) {
                                                var_1_67 = and:int(var_1_67:int, ldc:int(-460156598))
                                            }
                                            else {
                                                if (cmpne:boolean(and:int(var_1_67:int, ldc:int(8192)), ldc:int(0))) {
                                                    loopcontinue()
                                                }
                                                
                                                var_1_67 = and:int(var_1_67:int, ldc:int(-17580090))
                                                invokevirtual:void(\u527a\u494c\u88c5\u965f\u759a::\u965f\uff55\uc84e\u3c25\ub70c\u6fb0, var_5_118:\u527a\u494c\u88c5\u965f\u759a)
                                            }
                                            
                                            Label_1198:
                                            
                                            if (cmpne:boolean(and:int(var_1_67:int, ldc:int(2097152)), ldc:int(0))) {
                                                goto(Label_1163)
                                            }
                                            
                                            if (cmpne:boolean(and:int(var_1_67:int, ldc:int(2147483647)), ldc:int(0))) {
                                                looporswitchbreak()
                                            }
                                            
                                            var_1_67 = and:int(var_1_67:int, ldc:int(1876561388))
                                        }
                                        
                                        var_1_67 = and:int(var_1_67:int, ldc:int(-20018409))
                                        looporswitchbreak()
                                    }
                                    
                                    var_1_67 = and:int(var_1_67:int, ldc:int(719249968))
                                }
                            }
                            
                            goto(Label_1342)
                            Label_1241:
                            
                            if (cmpne:boolean(and:int(var_1_67:int, ldc:int(67108864)), ldc:int(0))) {
                                if (cmpeq:boolean(and:int(var_1_67:int, ldc:int(4194304)), ldc:int(0))) {
                                    goto(Label_0761)
                                }
                                
                                if (cmpeq:boolean(and:int(var_1_67:int, ldc:int(67108864)), ldc:int(0))) {
                                    var_1_67 = and:int(var_1_67:int, ldc:int(-1345740222))
                                    goto(Label_0660)
                                }
                                
                                if (cmpne:boolean(and:int(var_1_67:int, ldc:int(65536)), ldc:int(0))) {
                                    var_1_67 = and:int(var_1_67:int, ldc:int(-1560481700))
                                    goto(Label_0566)
                                }
                                
                                if (cmpeq:boolean(and:int(var_1_67:int, ldc:int(2)), ldc:int(0))) {
                                    var_1_67 = and:int(var_1_67:int, ldc:int(1380238024))
                                    goto(Label_0460)
                                }
                                
                                if (cmpne:boolean(and:int(var_1_67:int, ldc:int(2097152)), ldc:int(0))) {
                                    var_1_67 = and:int(var_1_67:int, ldc:int(-432408000))
                                    goto(Label_0373)
                                }
                                
                                if (cmpne:boolean(and:int(var_1_67:int, ldc:int(64)), ldc:int(0))) {
                                    loopcontinue()
                                }
                                
                                var_1_67 = and:int(var_1_67:int, ldc:int(-26944945))
                                invokevirtual:void(\u527a\u494c\u88c5\u965f\u759a::\ua068\ud51e\u5140\u59ec\u6c52\u92ee, var_5_118:\u527a\u494c\u88c5\u965f\u759a)
                            }
                            
                            Label_1342:
                            
                            if (cmpne:boolean(and:int(var_1_67:int, ldc:int(256)), ldc:int(0))) {
                                goto(Label_1241)
                            }
                            
                            if (cmpeq:boolean(and:int(var_1_67:int, ldc:int(2048)), ldc:int(0))) {
                                var_1_67 = and:int(var_1_67:int, ldc:int(-320825934))
                                goto(Label_0761)
                            }
                            
                            if (cmpeq:boolean(and:int(var_1_67:int, ldc:int(2147483647)), ldc:int(0))) {
                                var_1_67 = and:int(var_1_67:int, ldc:int(-1947903501))
                                goto(Label_0660)
                            }
                            
                            if (cmpne:boolean(and:int(var_1_67:int, ldc:int(1024)), ldc:int(0))) {
                                var_1_67 = and:int(var_1_67:int, ldc:int(-1680114418))
                                goto(Label_0566)
                            }
                            
                            if (cmpne:boolean(and:int(var_1_67:int, ldc:int(32768)), ldc:int(0))) {
                                var_1_67 = and:int(var_1_67:int, ldc:int(-241724739))
                                goto(Label_0460)
                            }
                            
                            if (cmpeq:boolean(and:int(var_1_67:int, ldc:int(134217728)), ldc:int(0))) {
                                var_1_67 = and:int(var_1_67:int, ldc:int(1583006099))
                                goto(Label_0373)
                            }
                            
                            if (cmpeq:boolean(and:int(var_1_67:int, ldc:int(1024)), ldc:int(0))) {
                                looporswitchbreak()
                            }
                            
                            var_1_67 = and:int(var_1_67:int, ldc:int(-572707358))
                        }
                        
                        var_1_67 = and:int(var_1_67:int, ldc:int(-36562393))
                        loopcontinue()
                    }
                    
                    Label_1463:
                    
                    if (cmpeq:boolean(and:int(var_1_67:int, ldc:int(67108864)), ldc:int(0))) {
                        var_1_67 = and:int(var_1_67:int, ldc:int(-137006559))
                        goto(Label_0214)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_67:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0176)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_67:int, ldc:int(8)), ldc:int(0))) {
                        looporswitchbreak()
                    }
                }
                
                var_1_67 = and:int(var_1_67:int, ldc:int(-546063009))
            }
            finally {
                monitorexit(var_3_6D:List<\u527a\u494c\u88c5\u965f\u759a>)
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public \u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\u88c5\ud171\ub113\u6435\ud51e \u64ab\u600f\u120d\u4d85\u3bd6\ua068() {
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
            return:\u88c5\ud171\ub113\u6435\ud51e(getfield:\u88c5\ud171\ub113\u6435\ud51e(\u9255\u0b8e\ud36e\ucef1\ud523::\uc910\u71ae\u8258\ufcaf\u7d52\u3dd3, this:\u9255\u0b8e\ud36e\ucef1\ud523))
        }
        
        goto(Label_0006)
    }
    
    private static void lambda$\u93a2\u3e2a\ufe34\u72f1\ubded\ub7dc$2(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u527a\u494c\u88c5\u965f\u759a p0, net.minecraft.util.text.ITextComponent p1, io.netty.util.concurrent.Future p2) {
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
            invokevirtual:void(\u527a\u494c\u88c5\u965f\u759a::\u98a4\uc31c\u6c52\uf995\u62da\u64f2, p0:\u527a\u494c\u88c5\u965f\u759a, p1:ITextComponent)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static io.netty.channel.epoll.EpollEventLoopGroup lambda$\u69d9\ud158\u5245\ufe34\u67d0\uae5d$1() {
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
            return:EpollEventLoopGroup(initobject:EpollEventLoopGroup(EpollEventLoopGroup::<init>, and:int(ldc:int(14391), ldc:int(-14392)), invokevirtual:ThreadFactory(ThreadFactoryBuilder::build, invokevirtual:ThreadFactoryBuilder(ThreadFactoryBuilder::setDaemon, invokevirtual:ThreadFactoryBuilder(ThreadFactoryBuilder::setNameFormat, initobject:ThreadFactoryBuilder(ThreadFactoryBuilder::<init>), loadelement:String(getstatic:String[](\u9255\u0b8e\ud36e\ucef1\ud523::\u8640\u1833\u0c95\ufcaf\u4e72\ucef1), and:int(ldc:int(30870), ldc:int(1094)))), and:int[expected:boolean](ldc:int(4611), ldc:int(24733))))))
        }
        
        goto(Label_0006)
    }
    
    private static io.netty.channel.nio.NioEventLoopGroup lambda$\u873d\u7ce1\u8709\u120d\u4179\uf94d$0() {
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
            return:NioEventLoopGroup(initobject:NioEventLoopGroup(NioEventLoopGroup::<init>, and:int(ldc:int(-2845), ldc:int(2844)), invokevirtual:ThreadFactory(ThreadFactoryBuilder::build, invokevirtual:ThreadFactoryBuilder(ThreadFactoryBuilder::setDaemon, invokevirtual:ThreadFactoryBuilder(ThreadFactoryBuilder::setNameFormat, initobject:ThreadFactoryBuilder(ThreadFactoryBuilder::<init>), loadelement:String(getstatic:String[](\u9255\u0b8e\ud36e\ucef1\ud523::\u8640\u1833\u0c95\ufcaf\u4e72\ucef1), xor:int(ldc:int(2113), ldc:int(2118)))), xor:int[expected:boolean](ldc:int(18690), ldc:int(18691))))))
        }
        
        goto(Label_0006)
    }
    
    public static \u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\u88c5\ud171\ub113\u6435\ud51e \u624e\u3a62\uc87f\ubcb0\u6c52\ubcb0(\u59ec\u8413\u97e6\uc229\u3776.\u9255\u0b8e\ud36e\ucef1\ud523 p0) {
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
            return:\u88c5\ud171\ub113\u6435\ud51e(getfield:\u88c5\ud171\ub113\u6435\ud51e(\u9255\u0b8e\ud36e\ucef1\ud523::\uc910\u71ae\u8258\ufcaf\u7d52\u3dd3, p0:\u9255\u0b8e\ud36e\ucef1\ud523))
        }
        
        goto(Label_0006)
    }
    
    public static java.util.List \u92ff\ub102\uc238\u59ec\u9033\u47c2(\u59ec\u8413\u97e6\uc229\u3776.\u9255\u0b8e\ud36e\ucef1\ud523 p0) {
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
            return:List(getfield:List<\u527a\u494c\u88c5\u965f\u759a>(\u9255\u0b8e\ud36e\ucef1\ud523::\u5654\u59ec\u5f50\ubff1\u7006\u6435, p0:\u9255\u0b8e\ud36e\ucef1\ud523))
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
    
    public void \u4f4a\u69d9\u965f\u385b\uae87\u9a18(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_622 : int
        var_5_8A : int
        var_6_91 : int
        var_7_A0 : double
        var_9_C7 : double
        var_3_D9 : int
        var_11_EA : int
        var_14_114 : double
        var_16_118 : int
        var_12_110 : double
        var_17_62D : int
        
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
        var_3_622 = and:int(ldc:int(-908417763), ldc:int(1341304111))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u9255\u0b8e\ud36e\ucef1\ud523[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0180)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_622:int, ldc:int(8)), ldc:int(0))) {
            var_3_622 = and:int(var_3_622:int, ldc:int(1731593367))
        }
        else {
            var_3_622 = and:int(var_3_622:int, ldc:int(-873289459))
            var_5_8A = and:int(ldc:int(6312), ldc:int(-14505))
            var_6_91 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_A0 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(22699), ldc:int(-22700)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C7 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D9 = and:int(var_3_622:int, ldc:int(-2750769))
                    var_9_C7 = sub:double(var_7_A0:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EA = var_5_8A:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EA:int, sub:int(var_6_91:int, and:int(ldc:int(25617), ldc:int(385)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EA:int, xor:int(ldc:int(10249), ldc:int(10248)))), var_7_A0:double))) {
                        inc:int(var_11_EA, ldc:int(1))
                    }
                    
                    var_3_622 = and:int(var_3_D9:int, ldc:int(-271449457))
                    var_14_114 = var_7_A0:double
                    var_16_118 = var_11_EA:int
                }
                else {
                    var_11_EA = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_8A:int), xor:int(ldc:int(8451), ldc:int(8450)))
                    var_12_110 = var_14_114 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A)
                    
                    if (cmplt:boolean(var_16_118 = var_11_EA:int, var_6_91:int)) {
                        var_9_C7 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EA:int)
                        var_16_118 = var_11_EA:int
                        var_14_114 = var_12_110:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_622:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1477)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_622:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_622 = and:int(var_3_622:int, ldc:int(-1010949502))
                        goto(Label_1326)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_622:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1195)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_622:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1071)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_622:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_622 = and:int(var_3_622:int, ldc:int(-1990062161))
                        goto(Label_0925)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_622:int, ldc:int(4)), ldc:int(0))) {
                        var_3_622 = and:int(var_3_622:int, ldc:int(2139407289))
                        goto(Label_0822)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_622:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0695)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_622:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_622 = and:int(var_3_622:int, ldc:int(1213156751))
                        goto(Label_0583)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_622:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_622 = and:int(var_3_622:int, ldc:int(2113593853))
                        
                        if (cmplt:boolean(var_16_118:int, var_6_91:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0583)
                            }
                            
                            goto(Label_0822)
                        }
                    }
                    
                    Label_0405:
                    
                    if (cmpne:boolean(and:int(var_3_622:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_622 = and:int(var_3_622:int, ldc:int(-1501115138))
                        goto(Label_1477)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_622:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_622 = and:int(var_3_622:int, ldc:int(-805426637))
                        goto(Label_1326)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_622:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1195)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_622:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1071)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_622:int, ldc:int(1)), ldc:int(0))) {
                        var_3_622 = and:int(var_3_622:int, ldc:int(-1020433622))
                        goto(Label_0925)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_622:int, ldc:int(512)), ldc:int(0))) {
                        var_3_622 = and:int(var_3_622:int, ldc:int(-98384658))
                        goto(Label_0822)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_622:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_622 = and:int(var_3_622:int, ldc:int(-2033598435))
                        goto(Label_0695)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_622:int, ldc:int(2)), ldc:int(0))) {
                        var_3_622 = and:int(var_3_622:int, ldc:int(1452891141))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_622:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_622 = and:int(var_3_622:int, ldc:int(1341271181))
                            var_11_EA = and:int(ldc:int(17846), ldc:int(-17847))
                            goto(Label_1466)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0583:
                    
                    if (cmpeq:boolean(and:int(var_3_622:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1477)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_622:int, ldc:int(512)), ldc:int(0))) {
                        var_3_622 = and:int(var_3_622:int, ldc:int(-433691777))
                        goto(Label_1326)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_622:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1195)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_622:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_622 = and:int(var_3_622:int, ldc:int(997641049))
                        goto(Label_1071)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_622:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0925)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_622:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0822)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_622:int, ldc:int(4096)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_622:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0405)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_622:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_622 = and:int(var_3_622:int, ldc:int(2089015220))
                            loopcontinue()
                        }
                        
                        var_3_622 = and:int(var_3_622:int, ldc:int(2044441853))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_114 = var_9_C7:double
                            goto(Label_0822)
                        }
                    }
                    
                    Label_0695:
                    
                    if (cmpeq:boolean(and:int(var_3_622:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1477)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_622:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1326)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_622:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_622 = and:int(var_3_622:int, ldc:int(1536493450))
                        goto(Label_1195)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_622:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_622 = and:int(var_3_622:int, ldc:int(-1610899328))
                        goto(Label_1071)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_622:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0925)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_622:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_622 = and:int(var_3_622:int, ldc:int(1547941618))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_622:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0583)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_622:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0405)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_622:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_622 = and:int(var_3_622:int, ldc:int(2059199170))
                            loopcontinue()
                        }
                        
                        var_3_622 = and:int(var_3_622:int, ldc:int(1843376399))
                        var_14_114 = mul:double(ldc:double(0.5), add:double(var_9_C7:double, var_14_114:double))
                    }
                    
                    Label_0822:
                    
                    if (cmpne:boolean(and:int(var_3_622:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_622 = and:int(var_3_622:int, ldc:int(-1081717324))
                        goto(Label_1477)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_622:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1326)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_622:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1195)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_622:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1071)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_622:int, ldc:int(536870912)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_622:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_622 = and:int(var_3_622:int, ldc:int(434875937))
                            goto(Label_0695)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_622:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0583)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_622:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0405)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_622:int, ldc:int(1)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_622 = and:int(var_3_622:int, ldc:int(-640257939))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A:int), var_7_A0:double)) {
                                var_11_EA = and:int(ldc:int(21123), ldc:int(2049))
                                goto(Label_1071)
                            }
                        }
                    }
                    
                    Label_0925:
                    
                    if (cmpeq:boolean(and:int(var_3_622:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_622 = and:int(var_3_622:int, ldc:int(1395091807))
                        goto(Label_1477)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_622:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1326)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_622:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_622 = and:int(var_3_622:int, ldc:int(523983003))
                        goto(Label_1195)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_622:int, ldc:int(1048576)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_622:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0822)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_622:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0695)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_622:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_622 = and:int(var_3_622:int, ldc:int(-2055561492))
                            goto(Label_0583)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_622:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0405)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_622:int, ldc:int(4096)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_622 = and:int(var_3_622:int, ldc:int(-637842993))
                        var_11_EA = and:int(ldc:int(-30643), ldc:int(21682))
                    }
                    
                    Label_1071:
                    
                    if (cmpne:boolean(and:int(var_3_622:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1477)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_622:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_622 = and:int(var_3_622:int, ldc:int(-1139295342))
                        goto(Label_1326)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_622:int, ldc:int(8)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_622:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0925)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_622:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0822)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_622:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_622 = and:int(var_3_622:int, ldc:int(577498473))
                            goto(Label_0695)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_622:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0583)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_622:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_622 = and:int(var_3_622:int, ldc:int(1219155500))
                            goto(Label_0405)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_622:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_622 = and:int(var_3_622:int, ldc:int(-616474023))
                            loopcontinue()
                        }
                        
                        var_3_622 = and:int(var_3_622:int, ldc:int(-570778067))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EA:int, ldc:int(0))) {
                                goto(Label_1326)
                            }
                        }
                    }
                    
                    Label_1195:
                    
                    if (cmpeq:boolean(and:int(var_3_622:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1477)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_622:int, ldc:int(8)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_622:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_622 = and:int(var_3_622:int, ldc:int(1140074603))
                            goto(Label_1071)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_622:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0925)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_622:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_622 = and:int(var_3_622:int, ldc:int(952250747))
                            goto(Label_0822)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_622:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0695)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_622:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_622 = and:int(var_3_622:int, ldc:int(-325778101))
                            goto(Label_0583)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_622:int, ldc:int(4)), ldc:int(0))) {
                            var_3_622 = and:int(var_3_622:int, ldc:int(815933074))
                            goto(Label_0405)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_622:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_622 = and:int(var_3_622:int, ldc:int(-338487827))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_114:double, var_5_8A:int, var_16_118:int)
                            goto(Label_1466)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1326:
                    
                    if (cmpne:boolean(and:int(var_3_622:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1477)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_622:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1195)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_622:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_622 = and:int(var_3_622:int, ldc:int(-2146312394))
                        goto(Label_1071)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_622:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0925)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_622:int, ldc:int(512)), ldc:int(0))) {
                        var_3_622 = and:int(var_3_622:int, ldc:int(-830322935))
                        goto(Label_0822)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_622:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0695)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_622:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_622 = and:int(var_3_622:int, ldc:int(-888545577))
                        goto(Label_0583)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_622:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_622 = and:int(var_3_622:int, ldc:int(1042613120))
                        goto(Label_0405)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_622:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_622 = and:int(var_3_622:int, ldc:int(1647694735))
                        loopcontinue()
                    }
                    
                    var_3_622 = and:int(var_3_622:int, ldc:int(2044649517))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_114:double, ldc:double(0.0))
                    Label_1466:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_62D = var_5_8A:int
                        
                        if (cmpeq:boolean(var_11_EA:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1477:
                    
                    if (cmpeq:boolean(and:int(var_3_622:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1326)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_622:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1195)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_622:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_622 = and:int(var_3_622:int, ldc:int(-1277878041))
                        goto(Label_1071)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_622:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0925)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_622:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0822)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_622:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0695)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_622:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0583)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_622:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0405)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_622:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_622 = and:int(var_3_622:int, ldc:int(-369387459))
                        var_17_62D = add:int(var_16_118:int, xor:int(ldc:int(17154), ldc:int(17155)))
                        looporswitchbreak()
                    }
                    
                    var_3_622 = and:int(var_3_622:int, ldc:int(42944782))
                }
                
                var_3_622 = and:int(var_3_622:int, ldc:int(1876043005))
                
                if (cmple:boolean(var_5_8A = var_17_62D:int, sub:int(var_6_91:int, and:int(ldc:int(4097), ldc:int(8331))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0180:
        
        if (cmpeq:boolean(and:int(var_3_622:int, ldc:int(2)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
