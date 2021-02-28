public class \u6cfe\u16f6\u4c04\u61a4\u8bb0.\u3c25\ub70c\u5bc4\u8640\ubefe {
    public void \u3c25\ub70c\u5bc4\u8640\ubefe(\u59ec\u8413\u97e6\uc229\u3776.\u9255\u0b8e\ud36e\ucef1\ud523 p0) {
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
            invokespecial:ChannelInboundHandlerAdapter(ChannelInboundHandlerAdapter::<init>, this:\u3c25\ub70c\u5bc4\u8640\ubefe)
            putfield:\u9255\u0b8e\ud36e\ucef1\ud523(\u3c25\ub70c\u5bc4\u8640\ubefe::\u7873\u99f7\u3c25\uff55\u446c\ubefe, this:\u3c25\ub70c\u5bc4\u8640\ubefe, p0:\u9255\u0b8e\ud36e\ucef1\ud523)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void channelRead(io.netty.channel.ChannelHandlerContext p0, java.lang.Object p1) {
        var_3_64 : int
        var_5_69 : ByteBuf
        var_3_2170 : int
        var_6_98 : int
        var_7_1A4 : InetSocketAddress
        var_8_1B2 : \u88c5\ud171\ub113\u6435\ud51e
        var_9_1BE : int
        stack_BF9_0 : int [generated]
        stack_38D_0 : String [generated]
        expr_35A : Object[] [generated]
        var_10_390 : String
        stack_ABE_0 : String [generated]
        expr_A6F : Object[] [generated]
        var_11_AC1 : String
        var_12_DBA : boolean
        stack_C4A_0 : boolean [generated]
        stack_C4A_1 : int [generated]
        var_13_CAC : int
        stack_EDF_0 : boolean [generated]
        stack_DB9_0 : boolean [generated]
        stack_FDC_0 : boolean [generated]
        stack_10D6_0 : boolean [generated]
        stack_EDF_1 : boolean [generated]
        stack_DB9_1 : int [generated]
        stack_FDC_1 : int [generated]
        stack_10D6_1 : int [generated]
        stack_169A_0 : String [generated]
        expr_164B : Object[] [generated]
        var_14_169D : String
        var_15_16AB : ByteBuf
        
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
            var_3_64 = and:int(and:int(ldc:int(-1309899571), ldc:int(-839977137)), ldc:int(-598765))
            var_5_69 = checkcast:ByteBuf(io.netty.buffer.ByteBuf.class, p1:Object[expected:ByteBuf])
            
            do {
                if (cmpeq:boolean(and:int(var_3_64:int, ldc:int(32768)), ldc:int(0))) {
                    var_3_64 = and:int(var_3_64:int, ldc:int(1367917448))
                }
                else {
                    var_3_64 = and:int(var_3_64:int, ldc:int(-940200579))
                    invokevirtual:ByteBuf(ByteBuf::markReaderIndex, var_5_69:ByteBuf)
                }
            } while (cmpeq:boolean(and:int(var_3_64:int, ldc:int(1024)), ldc:int(0)))
            
            var_3_2170 = and:int(var_3_64:int, ldc:int(1911868753))
            var_6_98 = xor:int(ldc:int(-30192), ldc:int(-30191))
            
            try {
                loop {
                    if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_2170 = and:int(var_3_2170:int, ldc:int(577727000))
                        goto(Label_7735)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_2170 = and:int(var_3_2170:int, ldc:int(-661108346))
                        goto(Label_7641)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_7569)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_2170 = and:int(var_3_2170:int, ldc:int(84886774))
                        goto(Label_7485)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_2170 = and:int(var_3_2170:int, ldc:int(-921717656))
                        goto(Label_0335)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_2170 = and:int(var_3_2170:int, ldc:int(1782358251))
                    }
                    else {
                        var_3_2170 = and:int(var_3_2170:int, ldc:int(-1442867835))
                        
                        if (cmpne:boolean(invokevirtual:short(ByteBuf::readUnsignedByte, var_5_69:ByteBuf), xor:int(ldc:int(82), ldc:int(172)))) {
                            if (cmpne:boolean(var_6_98:int, ldc:int(0))) {
                                goto(Label_7485)
                            }
                            
                            return:void()
                        }
                    }
                    
                    Label_0256:
                    
                    if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_7735)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(256)), ldc:int(0))) {
                        var_3_2170 = and:int(var_3_2170:int, ldc:int(531060676))
                        goto(Label_7641)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_2170 = and:int(var_3_2170:int, ldc:int(1233375227))
                        goto(Label_7569)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_2170 = and:int(var_3_2170:int, ldc:int(1005932296))
                        goto(Label_7485)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(512)), ldc:int(0))) {
                        var_3_2170 = and:int(var_3_2170:int, ldc:int(714167872))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(32)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_2170 = and:int(var_3_2170:int, ldc:int(-572072003))
                    }
                    
                    Label_0335:
                    
                    if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_2170 = and:int(var_3_2170:int, ldc:int(164252218))
                        goto(Label_7735)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_7641)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_2170 = and:int(var_3_2170:int, ldc:int(93548800))
                        goto(Label_7569)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(262144)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_2170 = and:int(var_3_2170:int, ldc:int(1287205017))
                            goto(Label_0256)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(2147483647)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_2170 = and:int(var_3_2170:int, ldc:int(-1543586255))
                        var_7_1A4 = checkcast:InetSocketAddress(java.net.InetSocketAddress.class, invokeinterface:SocketAddress[expected:InetSocketAddress](Channel::remoteAddress, invokeinterface:Channel(ChannelHandlerContext::channel, p0:ChannelHandlerContext)))
                        var_3_2170 = and:int(var_3_2170:int, ldc:int(-1545173209))
                        var_8_1B2 = invokevirtual:\u88c5\ud171\ub113\u6435\ud51e(\u9255\u0b8e\ud36e\ucef1\ud523::\u64ab\u600f\u120d\u4d85\u3bd6\ua068, getfield:\u9255\u0b8e\ud36e\ucef1\ud523(\u3c25\ub70c\u5bc4\u8640\ubefe::\u7873\u99f7\u3c25\uff55\u446c\ubefe, this:\u3c25\ub70c\u5bc4\u8640\ubefe))
                        var_3_2170 = and:int(var_3_2170:int, ldc:int(2080347561))
                        var_9_1BE = invokevirtual:int(ByteBuf::readableBytes, var_5_69:ByteBuf)
                        
                        loop {
                            if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(33554432)), ldc:int(0))) {
                                goto(Label_7251)
                            }
                            
                            if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(262144)), ldc:int(0))) {
                                var_3_2170 = and:int(var_3_2170:int, ldc:int(-847640023))
                                goto(Label_7019)
                            }
                            
                            if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(8388608)), ldc:int(0))) {
                                var_3_2170 = and:int(var_3_2170:int, ldc:int(-1922571580))
                                goto(Label_6803)
                            }
                            
                            if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(256)), ldc:int(0))) {
                                var_3_2170 = and:int(var_3_2170:int, ldc:int(-2052357969))
                                goto(Label_6591)
                            }
                            
                            if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(33554432)), ldc:int(0))) {
                                goto(Label_6376)
                            }
                            
                            if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(67108864)), ldc:int(0))) {
                                goto(Label_6174)
                            }
                            
                            if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(16777216)), ldc:int(0))) {
                                goto(Label_5968)
                            }
                            
                            if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(256)), ldc:int(0))) {
                                var_3_2170 = and:int(var_3_2170:int, ldc:int(-1573470615))
                                goto(Label_2823)
                            }
                            
                            if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(8388608)), ldc:int(0))) {
                                goto(Label_2438)
                            }
                            
                            if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(262144)), ldc:int(0))) {
                                var_3_2170 = and:int(var_3_2170:int, ldc:int(-1808348923))
                                goto(Label_2186)
                            }
                            
                            if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(4194304)), ldc:int(0))) {
                                goto(Label_1966)
                            }
                            
                            if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(33554432)), ldc:int(0))) {
                                goto(Label_1726)
                            }
                            
                            if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(256)), ldc:int(0))) {
                                goto(Label_1540)
                            }
                            
                            if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(32)), ldc:int(0))) {
                                goto(Label_1376)
                            }
                            
                            if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(262144)), ldc:int(0))) {
                                goto(Label_1167)
                            }
                            
                            if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(512)), ldc:int(0))) {
                                goto(Label_0987)
                            }
                            
                            if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(16777216)), ldc:int(0))) {
                                var_3_2170 = and:int(var_3_2170:int, ldc:int(-1886806970))
                            }
                            else {
                                var_3_2170 = and:int(var_3_2170:int, ldc:int(635929693))
                                
                                switch (var_9_1BE:int) {
                                    case 0:
                                        invokeinterface:void(Logger::debug, getstatic:Logger(\u3c25\ub70c\u5bc4\u8640\ubefe::\ub8be\ub70c\u8308\u8350\u3bc9\ua61f), loadelement:String(getstatic:String[](\u3c25\ub70c\u5bc4\u8640\ubefe::\u0c95\u0b8e\uff55\u3e2a\uceb8\uc229), and:int(ldc:int(27684), ldc:int(-27687))), invokevirtual:InetAddress(InetSocketAddress::getAddress, var_7_1A4:InetSocketAddress), invokestatic:Integer(Integer::valueOf, invokevirtual:int(InetSocketAddress::getPort, var_7_1A4:InetSocketAddress)))
                                        looporswitchbreak()
                                    
                                    case 1:
                                        if (cmpne:boolean(invokevirtual:short(ByteBuf::readUnsignedByte, var_5_69:ByteBuf), xor:int(ldc:int(75), ldc:int(74)))) {
                                            goto(Label_0987)
                                        }
                                        
                                        invokeinterface:void(Logger::debug, getstatic:Logger(\u3c25\ub70c\u5bc4\u8640\ubefe::\ub8be\ub70c\u8308\u8350\u3bc9\ua61f), loadelement:String(getstatic:String[](\u3c25\ub70c\u5bc4\u8640\ubefe::\u0c95\u0b8e\uff55\u3e2a\uceb8\uc229), xor:int(ldc:int(9728), ldc:int(9731))), invokevirtual:InetAddress(InetSocketAddress::getAddress, var_7_1A4:InetSocketAddress), invokestatic:Integer(Integer::valueOf, invokevirtual:int(InetSocketAddress::getPort, var_7_1A4:InetSocketAddress)))
                                        goto(Label_2438)
                                    
                                    default:
                                        if (cmpeq:boolean(invokevirtual:short(ByteBuf::readUnsignedByte, var_5_69:ByteBuf), xor:int(ldc:int(-32064), ldc:int(-32063)))) {
                                            goto(Label_2823)
                                        }
                                        
                                        stack_BF9_0 = and:int(ldc:int(-5067), ldc:int(5066))
                                        goto(Label_3059)
                                }
                            }
                            
                            Label_0684:
                            
                            if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(67108864)), ldc:int(0))) {
                                goto(Label_7251)
                            }
                            
                            if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(256)), ldc:int(0))) {
                                goto(Label_7019)
                            }
                            
                            if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(512)), ldc:int(0))) {
                                goto(Label_6803)
                            }
                            
                            if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(32768)), ldc:int(0))) {
                                goto(Label_6591)
                            }
                            
                            if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(4194304)), ldc:int(0))) {
                                goto(Label_6376)
                            }
                            
                            if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(67108864)), ldc:int(0))) {
                                var_3_2170 = and:int(var_3_2170:int, ldc:int(685616599))
                                goto(Label_6174)
                            }
                            
                            if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(262144)), ldc:int(0))) {
                                goto(Label_5968)
                            }
                            
                            if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(1)), ldc:int(0))) {
                                var_3_2170 = and:int(var_3_2170:int, ldc:int(-1864044577))
                                goto(Label_2823)
                            }
                            
                            if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(1024)), ldc:int(0))) {
                                goto(Label_2438)
                            }
                            
                            if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(16777216)), ldc:int(0))) {
                                var_3_2170 = and:int(var_3_2170:int, ldc:int(-171190486))
                                goto(Label_2186)
                            }
                            
                            if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(262144)), ldc:int(0))) {
                                goto(Label_1966)
                            }
                            
                            if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(1)), ldc:int(0))) {
                                goto(Label_1726)
                            }
                            
                            if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(2097152)), ldc:int(0))) {
                                var_3_2170 = and:int(var_3_2170:int, ldc:int(-2072785775))
                                goto(Label_1540)
                            }
                            
                            if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(32)), ldc:int(0))) {
                                goto(Label_1376)
                            }
                            
                            if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(8388608)), ldc:int(0))) {
                                goto(Label_1167)
                            }
                            
                            if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(2147483647)), ldc:int(0))) {
                                if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(4194304)), ldc:int(0))) {
                                    var_3_2170 = and:int(var_3_2170:int, ldc:int(-1847140743))
                                    stack_38D_0 = loadelement:String(getstatic:String[](\u3c25\ub70c\u5bc4\u8640\ubefe::\u0c95\u0b8e\uff55\u3e2a\uceb8\uc229), and:int(ldc:int(1073), ldc:int(16713)))
                                    expr_35A = newarray:Object[](java.lang.Object.class, and:int(ldc:int(27779), ldc:int(51)))
                                    storeelement:Object(expr_35A:Object[], and:int(ldc:int(25244), ldc:int(-25278)), invokevirtual:String[expected:Object](\u88c5\ud171\ub113\u6435\ud51e::\ub70c\u67d0\u92ee\uc87f\u3bd6\u7d52, var_8_1B2:\u88c5\ud171\ub113\u6435\ud51e))
                                    storeelement:Object(expr_35A:Object[], xor:int(ldc:int(-32447), ldc:int(-32448)), invokestatic:Integer[expected:Object](Integer::valueOf, invokevirtual:int(\u88c5\ud171\ub113\u6435\ud51e::\u7873\ud171\uc246\u40a9\ud12e\u3d4b, var_8_1B2:\u88c5\ud171\ub113\u6435\ud51e)))
                                    storeelement:Object(expr_35A:Object[], and:int(ldc:int(17154), ldc:int(8194)), invokestatic:Integer[expected:Object](Integer::valueOf, invokevirtual:int(\u88c5\ud171\ub113\u6435\ud51e::\u71ae\u40a9\ub8be\uc31c\u3d4b\u5d20, var_8_1B2:\u88c5\ud171\ub113\u6435\ud51e)))
                                    var_10_390 = invokestatic:String(String::format, stack_38D_0:String, expr_35A:Object[])
                                    
                                    loop {
                                        if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(1)), ldc:int(0))) {
                                            var_3_2170 = and:int(var_3_2170:int, ldc:int(-2020672796))
                                        }
                                        else {
                                            var_3_2170 = and:int(var_3_2170:int, ldc:int(-1175009751))
                                            invokespecial:void(\u3c25\ub70c\u5bc4\u8640\ubefe::\u6c52\ud171\uc3e3\u946b\ud4fe\u7e3f, this:\u3c25\ub70c\u5bc4\u8640\ubefe, p0:ChannelHandlerContext, invokespecial:ByteBuf(\u3c25\ub70c\u5bc4\u8640\ubefe::\ub102\u98a4\u5fe1\ud51e\uc2bd\u1187, this:\u3c25\ub70c\u5bc4\u8640\ubefe, var_10_390:String))
                                        }
                                        
                                        if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(32)), ldc:int(0))) {
                                            looporswitchbreak()
                                        }
                                        
                                        var_3_2170 = and:int(var_3_2170:int, ldc:int(-1644466158))
                                    }
                                    
                                    var_3_2170 = and:int(var_3_2170:int, ldc:int(1306914485))
                                    goto(Label_5962)
                                }
                                
                                loopcontinue()
                            }
                            
                            Label_0987:
                            
                            if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(67108864)), ldc:int(0))) {
                                goto(Label_7251)
                            }
                            
                            if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(65536)), ldc:int(0))) {
                                goto(Label_7019)
                            }
                            
                            if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(1)), ldc:int(0))) {
                                var_3_2170 = and:int(var_3_2170:int, ldc:int(2031641456))
                                goto(Label_6803)
                            }
                            
                            if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(1)), ldc:int(0))) {
                                goto(Label_6591)
                            }
                            
                            if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(33554432)), ldc:int(0))) {
                                var_3_2170 = and:int(var_3_2170:int, ldc:int(-1214566499))
                                goto(Label_6376)
                            }
                            
                            if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(16777216)), ldc:int(0))) {
                                goto(Label_6174)
                            }
                            
                            if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(1024)), ldc:int(0))) {
                                var_3_2170 = and:int(var_3_2170:int, ldc:int(1519568163))
                                goto(Label_5968)
                            }
                            
                            if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(4194304)), ldc:int(0))) {
                                goto(Label_2823)
                            }
                            
                            if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(8388608)), ldc:int(0))) {
                                goto(Label_2438)
                            }
                            
                            if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(262144)), ldc:int(0))) {
                                var_3_2170 = and:int(var_3_2170:int, ldc:int(-1362391579))
                                goto(Label_2186)
                            }
                            
                            if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(512)), ldc:int(0))) {
                                goto(Label_1966)
                            }
                            
                            if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(32)), ldc:int(0))) {
                                goto(Label_1726)
                            }
                            
                            if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(32768)), ldc:int(0))) {
                                var_3_2170 = and:int(var_3_2170:int, ldc:int(-502263178))
                                goto(Label_1540)
                            }
                            
                            if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(2147483647)), ldc:int(0))) {
                                var_3_2170 = and:int(var_3_2170:int, ldc:int(27014947))
                                goto(Label_1376)
                            }
                            
                            if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(32)), ldc:int(0))) {
                                if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(2097152)), ldc:int(0))) {
                                    var_3_2170 = and:int(var_3_2170:int, ldc:int(-1182820433))
                                    goto(Label_0684)
                                }
                                
                                if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(1)), ldc:int(0))) {
                                    loopcontinue()
                                }
                                
                                var_3_2170 = and:int(var_3_2170:int, ldc:int(-1813661969))
                            }
                            
                            Label_1167:
                            
                            if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(512)), ldc:int(0))) {
                                goto(Label_7251)
                            }
                            
                            if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(1024)), ldc:int(0))) {
                                goto(Label_7019)
                            }
                            
                            if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(4194304)), ldc:int(0))) {
                                goto(Label_6803)
                            }
                            
                            if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(262144)), ldc:int(0))) {
                                var_3_2170 = and:int(var_3_2170:int, ldc:int(1125378105))
                                goto(Label_6591)
                            }
                            
                            if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(8388608)), ldc:int(0))) {
                                var_3_2170 = and:int(var_3_2170:int, ldc:int(-822067366))
                                goto(Label_6376)
                            }
                            
                            if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(32)), ldc:int(0))) {
                                var_3_2170 = and:int(var_3_2170:int, ldc:int(-1027264004))
                                goto(Label_6174)
                            }
                            
                            if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(65536)), ldc:int(0))) {
                                goto(Label_5968)
                            }
                            
                            if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(2097152)), ldc:int(0))) {
                                goto(Label_2823)
                            }
                            
                            if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(4194304)), ldc:int(0))) {
                                goto(Label_2438)
                            }
                            
                            if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(512)), ldc:int(0))) {
                                var_3_2170 = and:int(var_3_2170:int, ldc:int(-898017510))
                                goto(Label_2186)
                            }
                            
                            if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(256)), ldc:int(0))) {
                                var_3_2170 = and:int(var_3_2170:int, ldc:int(1831328360))
                                goto(Label_1966)
                            }
                            
                            if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(262144)), ldc:int(0))) {
                                var_3_2170 = and:int(var_3_2170:int, ldc:int(1440572493))
                                goto(Label_1726)
                            }
                            
                            if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(512)), ldc:int(0))) {
                                var_3_2170 = and:int(var_3_2170:int, ldc:int(482392458))
                                goto(Label_1540)
                            }
                            
                            if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(8388608)), ldc:int(0))) {
                                var_3_2170 = and:int(var_3_2170:int, ldc:int(1890878192))
                            }
                            else {
                                if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(67108864)), ldc:int(0))) {
                                    var_3_2170 = and:int(var_3_2170:int, ldc:int(-2013360581))
                                    goto(Label_0987)
                                }
                                
                                if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(2097152)), ldc:int(0))) {
                                    goto(Label_0684)
                                }
                                
                                if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(1)), ldc:int(0))) {
                                    var_3_2170 = and:int(var_3_2170:int, ldc:int(-247431857))
                                    loopcontinue()
                                }
                                
                                var_3_2170 = and:int(var_3_2170:int, ldc:int(-2115524673))
                                
                                if (cmpeq:boolean(var_6_98:int, ldc:int(0))) {
                                    goto(Label_2186)
                                }
                            }
                            
                            Label_1376:
                            
                            if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(262144)), ldc:int(0))) {
                                var_3_2170 = and:int(var_3_2170:int, ldc:int(-2023338878))
                                goto(Label_7251)
                            }
                            
                            if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(65536)), ldc:int(0))) {
                                goto(Label_7019)
                            }
                            
                            if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(16777216)), ldc:int(0))) {
                                goto(Label_6803)
                            }
                            
                            if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(8388608)), ldc:int(0))) {
                                goto(Label_6591)
                            }
                            
                            if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(67108864)), ldc:int(0))) {
                                goto(Label_6376)
                            }
                            
                            if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(256)), ldc:int(0))) {
                                goto(Label_6174)
                            }
                            
                            if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(262144)), ldc:int(0))) {
                                goto(Label_5968)
                            }
                            
                            if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(67108864)), ldc:int(0))) {
                                goto(Label_2823)
                            }
                            
                            if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(1)), ldc:int(0))) {
                                var_3_2170 = and:int(var_3_2170:int, ldc:int(-1248104425))
                                goto(Label_2438)
                            }
                            
                            if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(33554432)), ldc:int(0))) {
                                goto(Label_2186)
                            }
                            
                            if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(8388608)), ldc:int(0))) {
                                var_3_2170 = and:int(var_3_2170:int, ldc:int(-1883284609))
                                goto(Label_1966)
                            }
                            
                            if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(262144)), ldc:int(0))) {
                                goto(Label_1726)
                            }
                            
                            if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(67108864)), ldc:int(0))) {
                                if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(16777216)), ldc:int(0))) {
                                    var_3_2170 = and:int(var_3_2170:int, ldc:int(1746290538))
                                    goto(Label_1167)
                                }
                                
                                if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(1)), ldc:int(0))) {
                                    var_3_2170 = and:int(var_3_2170:int, ldc:int(-645785200))
                                    goto(Label_0987)
                                }
                                
                                if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(8388608)), ldc:int(0))) {
                                    goto(Label_0684)
                                }
                                
                                if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(1024)), ldc:int(0))) {
                                    loopcontinue()
                                }
                                
                                var_3_2170 = and:int(var_3_2170:int, ldc:int(2045627525))
                            }
                            
                            Label_1540:
                            
                            if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(16777216)), ldc:int(0))) {
                                var_3_2170 = and:int(var_3_2170:int, ldc:int(1457995507))
                                goto(Label_7251)
                            }
                            
                            if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(8388608)), ldc:int(0))) {
                                goto(Label_7019)
                            }
                            
                            if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(32768)), ldc:int(0))) {
                                goto(Label_6803)
                            }
                            
                            if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(4194304)), ldc:int(0))) {
                                var_3_2170 = and:int(var_3_2170:int, ldc:int(1655957065))
                                goto(Label_6591)
                            }
                            
                            if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(33554432)), ldc:int(0))) {
                                goto(Label_6376)
                            }
                            
                            if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(512)), ldc:int(0))) {
                                goto(Label_6174)
                            }
                            
                            if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(16777216)), ldc:int(0))) {
                                var_3_2170 = and:int(var_3_2170:int, ldc:int(1587596803))
                                goto(Label_5968)
                            }
                            
                            if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(8388608)), ldc:int(0))) {
                                goto(Label_2823)
                            }
                            
                            if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(65536)), ldc:int(0))) {
                                goto(Label_2438)
                            }
                            
                            if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(1)), ldc:int(0))) {
                                goto(Label_2186)
                            }
                            
                            if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(16777216)), ldc:int(0))) {
                                var_3_2170 = and:int(var_3_2170:int, ldc:int(1394850591))
                                goto(Label_1966)
                            }
                            
                            if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(1024)), ldc:int(0))) {
                                if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(262144)), ldc:int(0))) {
                                    goto(Label_1376)
                                }
                                
                                if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(2097152)), ldc:int(0))) {
                                    var_3_2170 = and:int(var_3_2170:int, ldc:int(-384495454))
                                    goto(Label_1167)
                                }
                                
                                if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(1)), ldc:int(0))) {
                                    var_3_2170 = and:int(var_3_2170:int, ldc:int(1367501474))
                                    goto(Label_0987)
                                }
                                
                                if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(67108864)), ldc:int(0))) {
                                    goto(Label_0684)
                                }
                                
                                if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(32768)), ldc:int(0))) {
                                    var_3_2170 = and:int(var_3_2170:int, ldc:int(1316209726))
                                    loopcontinue()
                                }
                                
                                var_3_2170 = and:int(var_3_2170:int, ldc:int(1508345677))
                                invokevirtual:ByteBuf(ByteBuf::resetReaderIndex, var_5_69:ByteBuf)
                            }
                            
                            Label_1726:
                            
                            if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(2097152)), ldc:int(0))) {
                                var_3_2170 = and:int(var_3_2170:int, ldc:int(1563795058))
                                goto(Label_7251)
                            }
                            
                            if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(1024)), ldc:int(0))) {
                                goto(Label_7019)
                            }
                            
                            if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(8388608)), ldc:int(0))) {
                                var_3_2170 = and:int(var_3_2170:int, ldc:int(48993702))
                                goto(Label_6803)
                            }
                            
                            if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(4194304)), ldc:int(0))) {
                                goto(Label_6591)
                            }
                            
                            if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(8388608)), ldc:int(0))) {
                                var_3_2170 = and:int(var_3_2170:int, ldc:int(1556288861))
                                goto(Label_6376)
                            }
                            
                            if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(67108864)), ldc:int(0))) {
                                var_3_2170 = and:int(var_3_2170:int, ldc:int(-1733848457))
                                goto(Label_6174)
                            }
                            
                            if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(67108864)), ldc:int(0))) {
                                var_3_2170 = and:int(var_3_2170:int, ldc:int(384466823))
                                goto(Label_5968)
                            }
                            
                            if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(1024)), ldc:int(0))) {
                                goto(Label_2823)
                            }
                            
                            if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(65536)), ldc:int(0))) {
                                var_3_2170 = and:int(var_3_2170:int, ldc:int(-853878488))
                                goto(Label_2438)
                            }
                            
                            if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(16777216)), ldc:int(0))) {
                                goto(Label_2186)
                            }
                            
                            if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(512)), ldc:int(0))) {
                                var_3_2170 = and:int(var_3_2170:int, ldc:int(-1408494975))
                            }
                            else {
                                if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(262144)), ldc:int(0))) {
                                    goto(Label_1540)
                                }
                                
                                if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(67108864)), ldc:int(0))) {
                                    var_3_2170 = and:int(var_3_2170:int, ldc:int(-331906595))
                                    goto(Label_1376)
                                }
                                
                                if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(262144)), ldc:int(0))) {
                                    var_3_2170 = and:int(var_3_2170:int, ldc:int(1580255412))
                                    goto(Label_1167)
                                }
                                
                                if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(256)), ldc:int(0))) {
                                    goto(Label_0987)
                                }
                                
                                if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(8388608)), ldc:int(0))) {
                                    var_3_2170 = and:int(var_3_2170:int, ldc:int(-465018549))
                                    goto(Label_0684)
                                }
                                
                                if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(256)), ldc:int(0))) {
                                    var_3_2170 = and:int(var_3_2170:int, ldc:int(-558768351))
                                    loopcontinue()
                                }
                                
                                var_3_2170 = and:int(var_3_2170:int, ldc:int(-1209219347))
                                invokeinterface:ChannelHandler(ChannelPipeline::remove, invokeinterface:ChannelPipeline(Channel::pipeline, invokeinterface:Channel(ChannelHandlerContext::channel, p0:ChannelHandlerContext)), loadelement:String(getstatic:String[](\u3c25\ub70c\u5bc4\u8640\ubefe::\u0c95\u0b8e\uff55\u3e2a\uceb8\uc229), and:int(ldc:int(8418), ldc:int(1026))))
                            }
                            
                            Label_1966:
                            
                            if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(8388608)), ldc:int(0))) {
                                goto(Label_7251)
                            }
                            
                            if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(4194304)), ldc:int(0))) {
                                goto(Label_7019)
                            }
                            
                            if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(32768)), ldc:int(0))) {
                                var_3_2170 = and:int(var_3_2170:int, ldc:int(-393946463))
                                goto(Label_6803)
                            }
                            
                            if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(33554432)), ldc:int(0))) {
                                var_3_2170 = and:int(var_3_2170:int, ldc:int(-981772983))
                                goto(Label_6591)
                            }
                            
                            if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(32768)), ldc:int(0))) {
                                var_3_2170 = and:int(var_3_2170:int, ldc:int(-2064520378))
                                goto(Label_6376)
                            }
                            
                            if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(1024)), ldc:int(0))) {
                                var_3_2170 = and:int(var_3_2170:int, ldc:int(-2004577420))
                                goto(Label_6174)
                            }
                            
                            if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(512)), ldc:int(0))) {
                                goto(Label_5968)
                            }
                            
                            if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(2147483647)), ldc:int(0))) {
                                var_3_2170 = and:int(var_3_2170:int, ldc:int(-997372690))
                                goto(Label_2823)
                            }
                            
                            if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(2097152)), ldc:int(0))) {
                                goto(Label_2438)
                            }
                            
                            if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(262144)), ldc:int(0))) {
                                var_3_2170 = and:int(var_3_2170:int, ldc:int(-1878202113))
                            }
                            else {
                                if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(4194304)), ldc:int(0))) {
                                    var_3_2170 = and:int(var_3_2170:int, ldc:int(52596503))
                                    goto(Label_1726)
                                }
                                
                                if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(16777216)), ldc:int(0))) {
                                    var_3_2170 = and:int(var_3_2170:int, ldc:int(-797183215))
                                    goto(Label_1540)
                                }
                                
                                if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(256)), ldc:int(0))) {
                                    var_3_2170 = and:int(var_3_2170:int, ldc:int(-231725768))
                                    goto(Label_1376)
                                }
                                
                                if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(67108864)), ldc:int(0))) {
                                    goto(Label_1167)
                                }
                                
                                if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(33554432)), ldc:int(0))) {
                                    goto(Label_0987)
                                }
                                
                                if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(16777216)), ldc:int(0))) {
                                    var_3_2170 = and:int(var_3_2170:int, ldc:int(-453753668))
                                    goto(Label_0684)
                                }
                                
                                if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(67108864)), ldc:int(0))) {
                                    loopcontinue()
                                }
                                
                                var_3_2170 = and:int(var_3_2170:int, ldc:int(669955567))
                                invokeinterface:ChannelHandlerContext(ChannelHandlerContext::fireChannelRead, p0:ChannelHandlerContext, p1:Object)
                            }
                            
                            Label_2186:
                            
                            if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(32)), ldc:int(0))) {
                                var_3_2170 = and:int(var_3_2170:int, ldc:int(947164059))
                                goto(Label_7251)
                            }
                            
                            if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(65536)), ldc:int(0))) {
                                goto(Label_7019)
                            }
                            
                            if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(4194304)), ldc:int(0))) {
                                var_3_2170 = and:int(var_3_2170:int, ldc:int(-1725759632))
                                goto(Label_6803)
                            }
                            
                            if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(512)), ldc:int(0))) {
                                var_3_2170 = and:int(var_3_2170:int, ldc:int(1309612271))
                                goto(Label_6591)
                            }
                            
                            if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(4194304)), ldc:int(0))) {
                                var_3_2170 = and:int(var_3_2170:int, ldc:int(-896832201))
                                goto(Label_6376)
                            }
                            
                            if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(65536)), ldc:int(0))) {
                                goto(Label_6174)
                            }
                            
                            if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(1024)), ldc:int(0))) {
                                var_3_2170 = and:int(var_3_2170:int, ldc:int(1249840072))
                                goto(Label_5968)
                            }
                            
                            if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(2147483647)), ldc:int(0))) {
                                goto(Label_2823)
                            }
                            
                            if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(1)), ldc:int(0))) {
                                var_3_2170 = and:int(var_3_2170:int, ldc:int(370383938))
                            }
                            else {
                                if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(256)), ldc:int(0))) {
                                    goto(Label_1966)
                                }
                                
                                if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(512)), ldc:int(0))) {
                                    goto(Label_1726)
                                }
                                
                                if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(512)), ldc:int(0))) {
                                    goto(Label_1540)
                                }
                                
                                if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(2097152)), ldc:int(0))) {
                                    goto(Label_1376)
                                }
                                
                                if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(2097152)), ldc:int(0))) {
                                    var_3_2170 = and:int(var_3_2170:int, ldc:int(-1713064244))
                                    goto(Label_1167)
                                }
                                
                                if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(512)), ldc:int(0))) {
                                    var_3_2170 = and:int(var_3_2170:int, ldc:int(513893744))
                                    goto(Label_0987)
                                }
                                
                                if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(4194304)), ldc:int(0))) {
                                    var_3_2170 = and:int(var_3_2170:int, ldc:int(-1510556087))
                                    goto(Label_0684)
                                }
                                
                                if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(8388608)), ldc:int(0))) {
                                    var_3_2170 = and:int(var_3_2170:int, ldc:int(1965818576))
                                    loopcontinue()
                                }
                                
                                var_3_2170 = and:int(var_3_2170:int, ldc:int(1308093925))
                                return:void()
                            }
                            
                            Label_2438:
                            
                            if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(65536)), ldc:int(0))) {
                                goto(Label_7251)
                            }
                            
                            if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(4194304)), ldc:int(0))) {
                                goto(Label_7019)
                            }
                            
                            if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(32)), ldc:int(0))) {
                                goto(Label_6803)
                            }
                            
                            if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(2097152)), ldc:int(0))) {
                                var_3_2170 = and:int(var_3_2170:int, ldc:int(1365301584))
                                goto(Label_6591)
                            }
                            
                            if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(67108864)), ldc:int(0))) {
                                var_3_2170 = and:int(var_3_2170:int, ldc:int(1950043872))
                                goto(Label_6376)
                            }
                            
                            if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(256)), ldc:int(0))) {
                                goto(Label_6174)
                            }
                            
                            if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(8388608)), ldc:int(0))) {
                                goto(Label_5968)
                            }
                            
                            if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(256)), ldc:int(0))) {
                                var_3_2170 = and:int(var_3_2170:int, ldc:int(1389412316))
                            }
                            else {
                                if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(512)), ldc:int(0))) {
                                    var_3_2170 = and:int(var_3_2170:int, ldc:int(-274078125))
                                    goto(Label_2186)
                                }
                                
                                if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(67108864)), ldc:int(0))) {
                                    var_3_2170 = and:int(var_3_2170:int, ldc:int(-651337349))
                                    goto(Label_1966)
                                }
                                
                                if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(4194304)), ldc:int(0))) {
                                    goto(Label_1726)
                                }
                                
                                if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(33554432)), ldc:int(0))) {
                                    var_3_2170 = and:int(var_3_2170:int, ldc:int(-1661255606))
                                    goto(Label_1540)
                                }
                                
                                if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(33554432)), ldc:int(0))) {
                                    var_3_2170 = and:int(var_3_2170:int, ldc:int(521112690))
                                    goto(Label_1376)
                                }
                                
                                if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(32)), ldc:int(0))) {
                                    var_3_2170 = and:int(var_3_2170:int, ldc:int(-371638848))
                                    goto(Label_1167)
                                }
                                
                                if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(4194304)), ldc:int(0))) {
                                    var_3_2170 = and:int(var_3_2170:int, ldc:int(-626541567))
                                    goto(Label_0987)
                                }
                                
                                if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(67108864)), ldc:int(0))) {
                                    goto(Label_0684)
                                }
                                
                                if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(1)), ldc:int(0))) {
                                    var_3_2170 = and:int(var_3_2170:int, ldc:int(-2080184523))
                                    loopcontinue()
                                }
                                
                                var_3_2170 = and:int(var_3_2170:int, ldc:int(-201339269))
                                stack_ABE_0 = loadelement:String(getstatic:String[](\u3c25\ub70c\u5bc4\u8640\ubefe::\u0c95\u0b8e\uff55\u3e2a\uceb8\uc229), xor:int(ldc:int(12299), ldc:int(12303)))
                                expr_A6F = newarray:Object[](java.lang.Object.class, and:int(ldc:int(6813), ldc:int(5)))
                                storeelement:Object(expr_A6F:Object[], and:int(ldc:int(21067), ldc:int(-30284)), invokestatic:Integer[expected:Object](Integer::valueOf, ldc:int(127)))
                                storeelement:Object(expr_A6F:Object[], xor:int(ldc:int(1297), ldc:int(1296)), invokevirtual:String[expected:Object](\u88c5\ud171\ub113\u6435\ud51e::\u67e9\uc246\u7bad\u61a4\u51b2\uae87, var_8_1B2:\u88c5\ud171\ub113\u6435\ud51e))
                                storeelement:Object(expr_A6F:Object[], xor:int(ldc:int(167), ldc:int(165)), invokevirtual:String[expected:Object](\u88c5\ud171\ub113\u6435\ud51e::\ub70c\u67d0\u92ee\uc87f\u3bd6\u7d52, var_8_1B2:\u88c5\ud171\ub113\u6435\ud51e))
                                storeelement:Object(expr_A6F:Object[], and:int(ldc:int(1555), ldc:int(8387)), invokestatic:Integer[expected:Object](Integer::valueOf, invokevirtual:int(\u88c5\ud171\ub113\u6435\ud51e::\u7873\ud171\uc246\u40a9\ud12e\u3d4b, var_8_1B2:\u88c5\ud171\ub113\u6435\ud51e)))
                                storeelement:Object(expr_A6F:Object[], and:int(ldc:int(28685), ldc:int(22)), invokestatic:Integer[expected:Object](Integer::valueOf, invokevirtual:int(\u88c5\ud171\ub113\u6435\ud51e::\u71ae\u40a9\ub8be\uc31c\u3d4b\u5d20, var_8_1B2:\u88c5\ud171\ub113\u6435\ud51e)))
                                var_11_AC1 = invokestatic:String(String::format, stack_ABE_0:String, expr_A6F:Object[])
                                
                                loop {
                                    if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(67108864)), ldc:int(0))) {
                                        var_3_2170 = and:int(var_3_2170:int, ldc:int(335001417))
                                        invokespecial:void(\u3c25\ub70c\u5bc4\u8640\ubefe::\u6c52\ud171\uc3e3\u946b\ud4fe\u7e3f, this:\u3c25\ub70c\u5bc4\u8640\ubefe, p0:ChannelHandlerContext, invokespecial:ByteBuf(\u3c25\ub70c\u5bc4\u8640\ubefe::\ub102\u98a4\u5fe1\ud51e\uc2bd\u1187, this:\u3c25\ub70c\u5bc4\u8640\ubefe, var_11_AC1:String))
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(4194304)), ldc:int(0))) {
                                        looporswitchbreak()
                                    }
                                    
                                    var_3_2170 = and:int(var_3_2170:int, ldc:int(391096499))
                                }
                                
                                var_3_2170 = and:int(var_3_2170:int, ldc:int(837211293))
                                goto(Label_5962)
                            }
                            
                            Label_2823:
                            
                            if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(2147483647)), ldc:int(0))) {
                                goto(Label_7251)
                            }
                            
                            if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(33554432)), ldc:int(0))) {
                                goto(Label_7019)
                            }
                            
                            if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(16777216)), ldc:int(0))) {
                                var_3_2170 = and:int(var_3_2170:int, ldc:int(-1595413082))
                                goto(Label_6803)
                            }
                            
                            if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(2147483647)), ldc:int(0))) {
                                goto(Label_6591)
                            }
                            
                            if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(8388608)), ldc:int(0))) {
                                goto(Label_6376)
                            }
                            
                            if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(256)), ldc:int(0))) {
                                goto(Label_6174)
                            }
                            
                            if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(67108864)), ldc:int(0))) {
                                var_3_2170 = and:int(var_3_2170:int, ldc:int(1112676408))
                                goto(Label_5968)
                            }
                            
                            if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(4194304)), ldc:int(0))) {
                                var_3_2170 = and:int(var_3_2170:int, ldc:int(783288406))
                                goto(Label_2438)
                            }
                            
                            if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(262144)), ldc:int(0))) {
                                goto(Label_2186)
                            }
                            
                            if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(33554432)), ldc:int(0))) {
                                var_3_2170 = and:int(var_3_2170:int, ldc:int(-614632029))
                                goto(Label_1966)
                            }
                            
                            if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(33554432)), ldc:int(0))) {
                                var_3_2170 = and:int(var_3_2170:int, ldc:int(83617954))
                                goto(Label_1726)
                            }
                            
                            if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(65536)), ldc:int(0))) {
                                var_3_2170 = and:int(var_3_2170:int, ldc:int(515182614))
                                goto(Label_1540)
                            }
                            
                            if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(256)), ldc:int(0))) {
                                var_3_2170 = and:int(var_3_2170:int, ldc:int(-96860669))
                                goto(Label_1376)
                            }
                            
                            if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(2097152)), ldc:int(0))) {
                                var_3_2170 = and:int(var_3_2170:int, ldc:int(608677210))
                                goto(Label_1167)
                            }
                            
                            if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(512)), ldc:int(0))) {
                                var_3_2170 = and:int(var_3_2170:int, ldc:int(-16078507))
                                goto(Label_0987)
                            }
                            
                            if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(1)), ldc:int(0))) {
                                var_3_2170 = and:int(var_3_2170:int, ldc:int(-1128180861))
                                goto(Label_0684)
                            }
                            
                            if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(2097152)), ldc:int(0))) {
                                loopcontinue()
                            }
                            
                            var_3_2170 = and:int(var_3_2170:int, ldc:int(-336730797))
                            stack_BF9_0 = and:int(ldc:int(10281), ldc:int(5781))
                            Label_3059:
                            var_3_2170 = and:int(var_3_2170:int, ldc:int(-1914384425))
                            var_12_DBA = stack_BF9_0:boolean
                            
                            loop {
                                if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(32768)), ldc:int(0))) {
                                    goto(Label_3219)
                                }
                                
                                if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(33554432)), ldc:int(0))) {
                                    var_3_2170 = and:int(var_3_2170:int, ldc:int(-1395008070))
                                }
                                else {
                                    var_3_2170 = and:int(var_3_2170:int, ldc:int(1542249801))
                                    stack_C4A_0 = var_12_DBA:boolean
                                    
                                    if (cmpeq:boolean(invokevirtual:short(ByteBuf::readUnsignedByte, var_5_69:ByteBuf), and:int(ldc:int(15614), ldc:int(250)))) {
                                        var_3_2170 = and:int(var_3_2170:int, ldc:int(1240843617))
                                        stack_C4A_1 = and:int(ldc:int(23633), ldc:int(8609))
                                    }
                                    else {
                                        stack_C4A_1 = and:int(ldc:int(-19182), ldc:int(17069))
                                    }
                                    
                                    var_3_2170 = and:int(var_3_2170:int, ldc:int(333890743))
                                    var_12_DBA = and:boolean(stack_C4A_0:boolean, stack_C4A_1:boolean)
                                }
                                
                                Label_3149:
                                
                                if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(262144)), ldc:int(0))) {
                                    if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(33554432)), ldc:int(0))) {
                                        loopcontinue()
                                    }
                                    
                                    var_3_2170 = and:int(var_3_2170:int, ldc:int(-2113933775))
                                    var_12_DBA = and:boolean(var_12_DBA:boolean, invokevirtual:boolean(String::equals, loadelement:String(getstatic:String[](\u3c25\ub70c\u5bc4\u8640\ubefe::\u0c95\u0b8e\uff55\u3e2a\uceb8\uc229), and:int(ldc:int(293), ldc:int(3781))), initobject:String[expected:Object](String::<init>, invokevirtual:byte[](ByteBuf::array, invokevirtual:ByteBuf(ByteBuf::readBytes, var_5_69:ByteBuf, mul:int(invokevirtual:short[expected:int](ByteBuf::readShort, var_5_69:ByteBuf), and:int(ldc:int(1122), ldc:int(519))))), getstatic:Charset(StandardCharsets::UTF_16BE))))
                                }
                                
                                Label_3219:
                                
                                if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(32768)), ldc:int(0))) {
                                    goto(Label_3149)
                                }
                                
                                if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(33554432)), ldc:int(0))) {
                                    looporswitchbreak()
                                }
                            }
                            
                            var_3_2170 = and:int(var_3_2170:int, ldc:int(401589957))
                            var_13_CAC = invokevirtual:int(ByteBuf::readUnsignedShort, var_5_69:ByteBuf)
                            
                            loop {
                                if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(65536)), ldc:int(0))) {
                                    goto(Label_5545)
                                }
                                
                                if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(32)), ldc:int(0))) {
                                    var_3_2170 = and:int(var_3_2170:int, ldc:int(305690806))
                                    goto(Label_5373)
                                }
                                
                                if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(2097152)), ldc:int(0))) {
                                    var_3_2170 = and:int(var_3_2170:int, ldc:int(-2129121655))
                                    goto(Label_5230)
                                }
                                
                                if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(33554432)), ldc:int(0))) {
                                    var_3_2170 = and:int(var_3_2170:int, ldc:int(-873511692))
                                    goto(Label_5049)
                                }
                                
                                if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(65536)), ldc:int(0))) {
                                    goto(Label_4917)
                                }
                                
                                if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(8388608)), ldc:int(0))) {
                                    var_3_2170 = and:int(var_3_2170:int, ldc:int(1463473928))
                                    goto(Label_4755)
                                }
                                
                                if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(16777216)), ldc:int(0))) {
                                    goto(Label_4606)
                                }
                                
                                if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(16777216)), ldc:int(0))) {
                                    goto(Label_4462)
                                }
                                
                                if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(512)), ldc:int(0))) {
                                    goto(Label_4313)
                                }
                                
                                if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(67108864)), ldc:int(0))) {
                                    var_3_2170 = and:int(var_3_2170:int, ldc:int(-1653631819))
                                    goto(Label_4063)
                                }
                                
                                if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(4194304)), ldc:int(0))) {
                                    var_3_2170 = and:int(var_3_2170:int, ldc:int(-729529057))
                                    goto(Label_3810)
                                }
                                
                                if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(256)), ldc:int(0))) {
                                    var_3_2170 = and:int(var_3_2170:int, ldc:int(2011569515))
                                    goto(Label_3516)
                                }
                                
                                var_3_2170 = and:int(var_3_2170:int, ldc:int(703921711))
                                stack_EDF_0 = stack_DB9_0 = stack_FDC_0 = stack_10D6_0 = var_12_DBA
                                
                                if (cmplt:boolean(invokevirtual:short(ByteBuf::readUnsignedByte, var_5_69:ByteBuf), ldc:short(73))) {
                                    stack_EDF_1 = stack_DB9_1 = stack_FDC_1 = stack_10D6_1 = and(ldc(17670), ldc(-17671))
                                    goto(Label_3477)
                                }
                                
                                Label_3411:
                                
                                if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(2147483647)), ldc:int(0))) {
                                    var_3_2170 = and:int(var_3_2170:int, ldc:int(1917021658))
                                    goto(Label_4208)
                                }
                                
                                if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(16777216)), ldc:int(0))) {
                                    var_3_2170 = and:int(var_3_2170:int, ldc:int(-350622533))
                                    goto(Label_3958)
                                }
                                
                                if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(67108864)), ldc:int(0))) {
                                    goto(Label_3705)
                                }
                                
                                var_3_2170 = and:int(var_3_2170:int, ldc:int(367900131))
                                stack_EDF_1 = stack_DB9_1 = stack_FDC_1 = stack_10D6_1 = xor(ldc(18624), ldc(18625))
                                Label_3477:
                                
                                if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(67108864)), ldc:int(0))) {
                                    var_3_2170 = and:int(var_3_2170:int, ldc:int(1538703930))
                                    goto(Label_4274)
                                }
                                
                                if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(32768)), ldc:int(0))) {
                                    goto(Label_4015)
                                }
                                
                                if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(512)), ldc:int(0))) {
                                    goto(Label_3762)
                                }
                                
                                var_3_2170 = and:int(var_3_2170:int, ldc:int(166639575))
                                var_12_DBA = and:boolean(stack_DB9_0:boolean, stack_DB9_1:boolean)
                                Label_3516:
                                
                                if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(1024)), ldc:int(0))) {
                                    goto(Label_5545)
                                }
                                
                                if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(32768)), ldc:int(0))) {
                                    goto(Label_5373)
                                }
                                
                                if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(16777216)), ldc:int(0))) {
                                    var_3_2170 = and:int(var_3_2170:int, ldc:int(1065355138))
                                    goto(Label_5230)
                                }
                                
                                if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(32)), ldc:int(0))) {
                                    goto(Label_5049)
                                }
                                
                                if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(32768)), ldc:int(0))) {
                                    var_3_2170 = and:int(var_3_2170:int, ldc:int(-699032785))
                                    goto(Label_4917)
                                }
                                
                                if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(262144)), ldc:int(0))) {
                                    var_3_2170 = and:int(var_3_2170:int, ldc:int(-477177211))
                                    goto(Label_4755)
                                }
                                
                                if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(4194304)), ldc:int(0))) {
                                    var_3_2170 = and:int(var_3_2170:int, ldc:int(-2124070821))
                                    goto(Label_4606)
                                }
                                
                                if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(67108864)), ldc:int(0))) {
                                    goto(Label_4462)
                                }
                                
                                if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(33554432)), ldc:int(0))) {
                                    var_3_2170 = and:int(var_3_2170:int, ldc:int(-2024965688))
                                    goto(Label_4313)
                                }
                                
                                if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(2097152)), ldc:int(0))) {
                                    var_3_2170 = and:int(var_3_2170:int, ldc:int(2091603435))
                                    goto(Label_4063)
                                }
                                
                                if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(2097152)), ldc:int(0))) {
                                    goto(Label_3810)
                                }
                                
                                if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(1024)), ldc:int(0))) {
                                    loopcontinue()
                                }
                                
                                var_3_2170 = and:int(var_3_2170:int, ldc:int(-1041848417))
                                stack_EDF_0 = stack_DB9_0 = stack_FDC_0 = stack_10D6_0 = var_12_DBA
                                
                                if (cmpne:boolean(add:int(add:int(xor:int(ldc:int(81), ldc:int(82)), arraylength:int(invokevirtual:byte[](ByteBuf::array, invokevirtual:ByteBuf(ByteBuf::readBytes, var_5_69:ByteBuf, mul:int(invokevirtual:short[expected:int](ByteBuf::readShort, var_5_69:ByteBuf), xor:int(ldc:int(2580), ldc:int(2582))))))), xor:int(ldc:int(9250), ldc:int(9254))), var_13_CAC:int)) {
                                    stack_EDF_1 = stack_DB9_1 = stack_FDC_1 = stack_10D6_1 = and(ldc(25230), ldc(-27551))
                                    goto(Label_3762)
                                }
                                
                                Label_3705:
                                
                                if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(32)), ldc:int(0))) {
                                    goto(Label_4208)
                                }
                                
                                if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(32)), ldc:int(0))) {
                                    goto(Label_3958)
                                }
                                
                                if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(67108864)), ldc:int(0))) {
                                    var_3_2170 = and:int(var_3_2170:int, ldc:int(-958214421))
                                    goto(Label_3411)
                                }
                                
                                var_3_2170 = and:int(var_3_2170:int, ldc:int(-1510029339))
                                stack_EDF_1 = stack_DB9_1 = stack_FDC_1 = stack_10D6_1 = and(ldc(10037), ldc(6273))
                                Label_3762:
                                
                                if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(2097152)), ldc:int(0))) {
                                    var_3_2170 = and:int(var_3_2170:int, ldc:int(1449955215))
                                    goto(Label_4274)
                                }
                                
                                if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(32768)), ldc:int(0))) {
                                    var_3_2170 = and:int(var_3_2170:int, ldc:int(1544374213))
                                    goto(Label_4015)
                                }
                                
                                if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(262144)), ldc:int(0))) {
                                    goto(Label_3477)
                                }
                                
                                var_3_2170 = and:int(var_3_2170:int, ldc:int(-303641183))
                                var_12_DBA = and:boolean(stack_EDF_0:boolean, stack_EDF_1:boolean)
                                Label_3810:
                                
                                if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(256)), ldc:int(0))) {
                                    var_3_2170 = and:int(var_3_2170:int, ldc:int(-381027221))
                                    goto(Label_5545)
                                }
                                
                                if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(32)), ldc:int(0))) {
                                    goto(Label_5373)
                                }
                                
                                if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(65536)), ldc:int(0))) {
                                    goto(Label_5230)
                                }
                                
                                if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(262144)), ldc:int(0))) {
                                    goto(Label_5049)
                                }
                                
                                if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(8388608)), ldc:int(0))) {
                                    var_3_2170 = and:int(var_3_2170:int, ldc:int(1895988426))
                                    goto(Label_4917)
                                }
                                
                                if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(1)), ldc:int(0))) {
                                    goto(Label_4755)
                                }
                                
                                if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(1)), ldc:int(0))) {
                                    goto(Label_4606)
                                }
                                
                                if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(67108864)), ldc:int(0))) {
                                    var_3_2170 = and:int(var_3_2170:int, ldc:int(-1994778435))
                                    goto(Label_4462)
                                }
                                
                                if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(16777216)), ldc:int(0))) {
                                    goto(Label_4313)
                                }
                                
                                if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(33554432)), ldc:int(0))) {
                                    var_3_2170 = and:int(var_3_2170:int, ldc:int(1581992422))
                                    goto(Label_4063)
                                }
                                
                                if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(4194304)), ldc:int(0))) {
                                    goto(Label_3516)
                                }
                                
                                if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(16777216)), ldc:int(0))) {
                                    var_3_2170 = and:int(var_3_2170:int, ldc:int(1083029671))
                                    loopcontinue()
                                }
                                
                                var_3_2170 = and:int(var_3_2170:int, ldc:int(704621919))
                                stack_EDF_0 = stack_DB9_0 = stack_FDC_0 = stack_10D6_0 = var_12_DBA
                                
                                if (cmpgt:boolean(invokevirtual:int(ByteBuf::readInt, var_5_69:ByteBuf), ldc:int(65535))) {
                                    stack_EDF_1 = stack_DB9_1 = stack_FDC_1 = stack_10D6_1 = and(ldc(4622), ldc(-4623))
                                    goto(Label_4015)
                                }
                                
                                Label_3958:
                                
                                if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(65536)), ldc:int(0))) {
                                    goto(Label_4208)
                                }
                                
                                if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(33554432)), ldc:int(0))) {
                                    goto(Label_3705)
                                }
                                
                                if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(32768)), ldc:int(0))) {
                                    var_3_2170 = and:int(var_3_2170:int, ldc:int(12845165))
                                    goto(Label_3411)
                                }
                                
                                var_3_2170 = and:int(var_3_2170:int, ldc:int(-738869659))
                                stack_EDF_1 = stack_DB9_1 = stack_FDC_1 = stack_10D6_1 = xor(ldc(20), ldc(21))
                                Label_4015:
                                
                                if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(1024)), ldc:int(0))) {
                                    var_3_2170 = and:int(var_3_2170:int, ldc:int(1208336612))
                                    goto(Label_4274)
                                }
                                
                                if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(1)), ldc:int(0))) {
                                    var_3_2170 = and:int(var_3_2170:int, ldc:int(2004619413))
                                    goto(Label_3762)
                                }
                                
                                if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(1)), ldc:int(0))) {
                                    goto(Label_3477)
                                }
                                
                                var_3_2170 = and:int(var_3_2170:int, ldc:int(938386637))
                                var_12_DBA = and:boolean(stack_FDC_0:boolean, stack_FDC_1:boolean)
                                Label_4063:
                                
                                if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(262144)), ldc:int(0))) {
                                    goto(Label_5545)
                                }
                                
                                if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(65536)), ldc:int(0))) {
                                    var_3_2170 = and:int(var_3_2170:int, ldc:int(796492538))
                                    goto(Label_5373)
                                }
                                
                                if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(1024)), ldc:int(0))) {
                                    var_3_2170 = and:int(var_3_2170:int, ldc:int(-1965316793))
                                    goto(Label_5230)
                                }
                                
                                if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(32768)), ldc:int(0))) {
                                    goto(Label_5049)
                                }
                                
                                if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(8388608)), ldc:int(0))) {
                                    var_3_2170 = and:int(var_3_2170:int, ldc:int(334336535))
                                    goto(Label_4917)
                                }
                                
                                if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(65536)), ldc:int(0))) {
                                    var_3_2170 = and:int(var_3_2170:int, ldc:int(1219646131))
                                    goto(Label_4755)
                                }
                                
                                if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(256)), ldc:int(0))) {
                                    var_3_2170 = and:int(var_3_2170:int, ldc:int(-884194735))
                                    goto(Label_4606)
                                }
                                
                                if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(32)), ldc:int(0))) {
                                    goto(Label_4462)
                                }
                                
                                if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(67108864)), ldc:int(0))) {
                                    goto(Label_4313)
                                }
                                
                                if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(65536)), ldc:int(0))) {
                                    goto(Label_3810)
                                }
                                
                                if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(16777216)), ldc:int(0))) {
                                    goto(Label_3516)
                                }
                                
                                if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(67108864)), ldc:int(0))) {
                                    loopcontinue()
                                }
                                
                                var_3_2170 = and:int(var_3_2170:int, ldc:int(1911401979))
                                stack_EDF_0 = stack_DB9_0 = stack_FDC_0 = stack_10D6_0 = var_12_DBA
                                
                                if (cmpne:boolean(invokevirtual:int(ByteBuf::readableBytes, var_5_69:ByteBuf), ldc:int(0))) {
                                    stack_EDF_1 = stack_DB9_1 = stack_FDC_1 = stack_10D6_1 = and(ldc(32661), ldc(-32662))
                                    goto(Label_4274)
                                }
                                
                                Label_4208:
                                
                                if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(262144)), ldc:int(0))) {
                                    goto(Label_3958)
                                }
                                
                                if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(65536)), ldc:int(0))) {
                                    var_3_2170 = and:int(var_3_2170:int, ldc:int(1351108455))
                                    goto(Label_3705)
                                }
                                
                                if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(512)), ldc:int(0))) {
                                    var_3_2170 = and:int(var_3_2170:int, ldc:int(-23908580))
                                    goto(Label_3411)
                                }
                                
                                var_3_2170 = and:int(var_3_2170:int, ldc:int(-135467277))
                                stack_EDF_1 = stack_DB9_1 = stack_FDC_1 = stack_10D6_1 = and(ldc(5313), ldc(16935))
                                Label_4274:
                                
                                if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(33554432)), ldc:int(0))) {
                                    var_3_2170 = and:int(var_3_2170:int, ldc:int(843388423))
                                    goto(Label_4015)
                                }
                                
                                if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(8388608)), ldc:int(0))) {
                                    goto(Label_3762)
                                }
                                
                                if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(67108864)), ldc:int(0))) {
                                    goto(Label_3477)
                                }
                                
                                var_3_2170 = and:int(var_3_2170:int, ldc:int(1912595929))
                                var_12_DBA = and:boolean(stack_10D6_0:boolean, stack_10D6_1:boolean)
                                Label_4313:
                                
                                if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(4194304)), ldc:int(0))) {
                                    goto(Label_5545)
                                }
                                
                                if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(16777216)), ldc:int(0))) {
                                    goto(Label_5373)
                                }
                                
                                if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(4194304)), ldc:int(0))) {
                                    var_3_2170 = and:int(var_3_2170:int, ldc:int(800287600))
                                    goto(Label_5230)
                                }
                                
                                if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(2097152)), ldc:int(0))) {
                                    var_3_2170 = and:int(var_3_2170:int, ldc:int(1076609040))
                                    goto(Label_5049)
                                }
                                
                                if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(67108864)), ldc:int(0))) {
                                    goto(Label_4917)
                                }
                                
                                if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(32)), ldc:int(0))) {
                                    var_3_2170 = and:int(var_3_2170:int, ldc:int(-1039690585))
                                    goto(Label_4755)
                                }
                                
                                if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(512)), ldc:int(0))) {
                                    var_3_2170 = and:int(var_3_2170:int, ldc:int(1548674851))
                                    goto(Label_4606)
                                }
                                
                                if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(1024)), ldc:int(0))) {
                                    if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(262144)), ldc:int(0))) {
                                        goto(Label_4063)
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(33554432)), ldc:int(0))) {
                                        goto(Label_3810)
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(65536)), ldc:int(0))) {
                                        var_3_2170 = and:int(var_3_2170:int, ldc:int(387194))
                                        goto(Label_3516)
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(1024)), ldc:int(0))) {
                                        var_3_2170 = and:int(var_3_2170:int, ldc:int(-1317288445))
                                        loopcontinue()
                                    }
                                    
                                    var_3_2170 = and:int(var_3_2170:int, ldc:int(-369245093))
                                    
                                    if (cmpne:boolean(var_12_DBA:boolean, ldc:boolean(0))) {
                                        invokeinterface:void(Logger::debug, getstatic:Logger(\u3c25\ub70c\u5bc4\u8640\ubefe::\ub8be\ub70c\u8308\u8350\u3bc9\ua61f), loadelement:String(getstatic:String[](\u3c25\ub70c\u5bc4\u8640\ubefe::\u0c95\u0b8e\uff55\u3e2a\uceb8\uc229), xor:int(ldc:int(-31704), ldc:int(-31698))), invokevirtual:InetAddress(InetSocketAddress::getAddress, var_7_1A4:InetSocketAddress), invokestatic:Integer(Integer::valueOf, invokevirtual:int(InetSocketAddress::getPort, var_7_1A4:InetSocketAddress)))
                                        goto(Label_5545)
                                    }
                                }
                                
                                Label_4462:
                                
                                if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(262144)), ldc:int(0))) {
                                    goto(Label_5545)
                                }
                                
                                if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(67108864)), ldc:int(0))) {
                                    goto(Label_5373)
                                }
                                
                                if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(8388608)), ldc:int(0))) {
                                    var_3_2170 = and:int(var_3_2170:int, ldc:int(1816904903))
                                    goto(Label_5230)
                                }
                                
                                if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(262144)), ldc:int(0))) {
                                    goto(Label_5049)
                                }
                                
                                if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(2097152)), ldc:int(0))) {
                                    goto(Label_4917)
                                }
                                
                                if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(67108864)), ldc:int(0))) {
                                    var_3_2170 = and:int(var_3_2170:int, ldc:int(667475841))
                                    goto(Label_4755)
                                }
                                
                                if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(1)), ldc:int(0))) {
                                    var_3_2170 = and:int(var_3_2170:int, ldc:int(-1608914761))
                                }
                                else {
                                    if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(1)), ldc:int(0))) {
                                        var_3_2170 = and:int(var_3_2170:int, ldc:int(1759675958))
                                        goto(Label_4313)
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(1)), ldc:int(0))) {
                                        var_3_2170 = and:int(var_3_2170:int, ldc:int(-266381487))
                                        goto(Label_4063)
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(2097152)), ldc:int(0))) {
                                        var_3_2170 = and:int(var_3_2170:int, ldc:int(1347872694))
                                        goto(Label_3810)
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(2097152)), ldc:int(0))) {
                                        goto(Label_3516)
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(2097152)), ldc:int(0))) {
                                        loopcontinue()
                                    }
                                    
                                    var_3_2170 = and:int(var_3_2170:int, ldc:int(-101712367))
                                }
                                
                                Label_4606:
                                
                                if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(67108864)), ldc:int(0))) {
                                    goto(Label_5545)
                                }
                                
                                if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(32768)), ldc:int(0))) {
                                    var_3_2170 = and:int(var_3_2170:int, ldc:int(-1860944541))
                                    goto(Label_5373)
                                }
                                
                                if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(1)), ldc:int(0))) {
                                    goto(Label_5230)
                                }
                                
                                if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(256)), ldc:int(0))) {
                                    goto(Label_5049)
                                }
                                
                                if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(2147483647)), ldc:int(0))) {
                                    var_3_2170 = and:int(var_3_2170:int, ldc:int(142462882))
                                    goto(Label_4917)
                                }
                                
                                if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(65536)), ldc:int(0))) {
                                    var_3_2170 = and:int(var_3_2170:int, ldc:int(893910378))
                                }
                                else {
                                    if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(33554432)), ldc:int(0))) {
                                        var_3_2170 = and:int(var_3_2170:int, ldc:int(106018268))
                                        goto(Label_4462)
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(32768)), ldc:int(0))) {
                                        var_3_2170 = and:int(var_3_2170:int, ldc:int(-1763844495))
                                        goto(Label_4313)
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(32768)), ldc:int(0))) {
                                        goto(Label_4063)
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(33554432)), ldc:int(0))) {
                                        var_3_2170 = and:int(var_3_2170:int, ldc:int(632625572))
                                        goto(Label_3810)
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(1024)), ldc:int(0))) {
                                        goto(Label_3516)
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(1024)), ldc:int(0))) {
                                        loopcontinue()
                                    }
                                    
                                    var_3_2170 = and:int(var_3_2170:int, ldc:int(-1174630803))
                                    
                                    if (cmpeq:boolean(var_6_98:int, ldc:int(0))) {
                                        goto(Label_5373)
                                    }
                                }
                                
                                Label_4755:
                                
                                if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(16777216)), ldc:int(0))) {
                                    goto(Label_5545)
                                }
                                
                                if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(32768)), ldc:int(0))) {
                                    var_3_2170 = and:int(var_3_2170:int, ldc:int(382483540))
                                    goto(Label_5373)
                                }
                                
                                if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(1024)), ldc:int(0))) {
                                    var_3_2170 = and:int(var_3_2170:int, ldc:int(-1456620052))
                                    goto(Label_5230)
                                }
                                
                                if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(256)), ldc:int(0))) {
                                    var_3_2170 = and:int(var_3_2170:int, ldc:int(-714932594))
                                    goto(Label_5049)
                                }
                                
                                if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(512)), ldc:int(0))) {
                                    var_3_2170 = and:int(var_3_2170:int, ldc:int(-63035863))
                                }
                                else {
                                    if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(512)), ldc:int(0))) {
                                        goto(Label_4606)
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(2097152)), ldc:int(0))) {
                                        var_3_2170 = and:int(var_3_2170:int, ldc:int(-676592959))
                                        goto(Label_4462)
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(16777216)), ldc:int(0))) {
                                        var_3_2170 = and:int(var_3_2170:int, ldc:int(1759579729))
                                        goto(Label_4313)
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(16777216)), ldc:int(0))) {
                                        goto(Label_4063)
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(32768)), ldc:int(0))) {
                                        var_3_2170 = and:int(var_3_2170:int, ldc:int(-1959173129))
                                        goto(Label_3810)
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(2147483647)), ldc:int(0))) {
                                        goto(Label_3516)
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(32)), ldc:int(0))) {
                                        var_3_2170 = and:int(var_3_2170:int, ldc:int(1345052607))
                                        loopcontinue()
                                    }
                                    
                                    var_3_2170 = and:int(var_3_2170:int, ldc:int(937856337))
                                }
                                
                                Label_4917:
                                
                                if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(33554432)), ldc:int(0))) {
                                    goto(Label_5545)
                                }
                                
                                if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(262144)), ldc:int(0))) {
                                    var_3_2170 = and:int(var_3_2170:int, ldc:int(-53662809))
                                    goto(Label_5373)
                                }
                                
                                if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(16777216)), ldc:int(0))) {
                                    goto(Label_5230)
                                }
                                
                                if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(262144)), ldc:int(0))) {
                                    if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(1)), ldc:int(0))) {
                                        var_3_2170 = and:int(var_3_2170:int, ldc:int(754194458))
                                        goto(Label_4755)
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(1)), ldc:int(0))) {
                                        goto(Label_4606)
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(4194304)), ldc:int(0))) {
                                        goto(Label_4462)
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(4194304)), ldc:int(0))) {
                                        goto(Label_4313)
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(32768)), ldc:int(0))) {
                                        var_3_2170 = and:int(var_3_2170:int, ldc:int(1713037530))
                                        goto(Label_4063)
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(67108864)), ldc:int(0))) {
                                        var_3_2170 = and:int(var_3_2170:int, ldc:int(1564959845))
                                        goto(Label_3810)
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(4194304)), ldc:int(0))) {
                                        goto(Label_3516)
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(32768)), ldc:int(0))) {
                                        loopcontinue()
                                    }
                                    
                                    var_3_2170 = and:int(var_3_2170:int, ldc:int(603758069))
                                    invokevirtual:ByteBuf(ByteBuf::resetReaderIndex, var_5_69:ByteBuf)
                                }
                                
                                Label_5049:
                                
                                if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(8388608)), ldc:int(0))) {
                                    goto(Label_5545)
                                }
                                
                                if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(256)), ldc:int(0))) {
                                    goto(Label_5373)
                                }
                                
                                if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(32)), ldc:int(0))) {
                                    if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(4194304)), ldc:int(0))) {
                                        var_3_2170 = and:int(var_3_2170:int, ldc:int(-770433686))
                                        goto(Label_4917)
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(33554432)), ldc:int(0))) {
                                        var_3_2170 = and:int(var_3_2170:int, ldc:int(-860851299))
                                        goto(Label_4755)
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(16777216)), ldc:int(0))) {
                                        var_3_2170 = and:int(var_3_2170:int, ldc:int(-1544393395))
                                        goto(Label_4606)
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(4194304)), ldc:int(0))) {
                                        var_3_2170 = and:int(var_3_2170:int, ldc:int(-892150053))
                                        goto(Label_4462)
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(4194304)), ldc:int(0))) {
                                        var_3_2170 = and:int(var_3_2170:int, ldc:int(1007216032))
                                        goto(Label_4313)
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(262144)), ldc:int(0))) {
                                        var_3_2170 = and:int(var_3_2170:int, ldc:int(-223469224))
                                        goto(Label_4063)
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(1024)), ldc:int(0))) {
                                        goto(Label_3810)
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(32768)), ldc:int(0))) {
                                        goto(Label_3516)
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(2097152)), ldc:int(0))) {
                                        var_3_2170 = and:int(var_3_2170:int, ldc:int(-2014259998))
                                        loopcontinue()
                                    }
                                    
                                    var_3_2170 = and:int(var_3_2170:int, ldc:int(-706427877))
                                    invokeinterface:ChannelHandler(ChannelPipeline::remove, invokeinterface:ChannelPipeline(Channel::pipeline, invokeinterface:Channel(ChannelHandlerContext::channel, p0:ChannelHandlerContext)), loadelement:String(getstatic:String[](\u3c25\ub70c\u5bc4\u8640\ubefe::\u0c95\u0b8e\uff55\u3e2a\uceb8\uc229), xor:int(ldc:int(3089), ldc:int(3091))))
                                }
                                
                                Label_5230:
                                
                                if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(65536)), ldc:int(0))) {
                                    var_3_2170 = and:int(var_3_2170:int, ldc:int(-683433908))
                                    goto(Label_5545)
                                }
                                
                                if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(2097152)), ldc:int(0))) {
                                    if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(262144)), ldc:int(0))) {
                                        var_3_2170 = and:int(var_3_2170:int, ldc:int(706284981))
                                        goto(Label_5049)
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(32768)), ldc:int(0))) {
                                        var_3_2170 = and:int(var_3_2170:int, ldc:int(-696858179))
                                        goto(Label_4917)
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(8388608)), ldc:int(0))) {
                                        goto(Label_4755)
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(1)), ldc:int(0))) {
                                        var_3_2170 = and:int(var_3_2170:int, ldc:int(622949977))
                                        goto(Label_4606)
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(32768)), ldc:int(0))) {
                                        goto(Label_4462)
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(33554432)), ldc:int(0))) {
                                        var_3_2170 = and:int(var_3_2170:int, ldc:int(-2147132444))
                                        goto(Label_4313)
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(33554432)), ldc:int(0))) {
                                        goto(Label_4063)
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(65536)), ldc:int(0))) {
                                        goto(Label_3810)
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(4194304)), ldc:int(0))) {
                                        goto(Label_3516)
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(512)), ldc:int(0))) {
                                        loopcontinue()
                                    }
                                    
                                    var_3_2170 = and:int(var_3_2170:int, ldc:int(-2082099565))
                                    invokeinterface:ChannelHandlerContext(ChannelHandlerContext::fireChannelRead, p0:ChannelHandlerContext, p1:Object)
                                }
                                
                                Label_5373:
                                
                                if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(1)), ldc:int(0))) {
                                    if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(67108864)), ldc:int(0))) {
                                        var_3_2170 = and:int(var_3_2170:int, ldc:int(1036281648))
                                        goto(Label_5230)
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(2147483647)), ldc:int(0))) {
                                        var_3_2170 = and:int(var_3_2170:int, ldc:int(-1544179306))
                                        goto(Label_5049)
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(2097152)), ldc:int(0))) {
                                        var_3_2170 = and:int(var_3_2170:int, ldc:int(1573321274))
                                        goto(Label_4917)
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(262144)), ldc:int(0))) {
                                        var_3_2170 = and:int(var_3_2170:int, ldc:int(1881717825))
                                        goto(Label_4755)
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(512)), ldc:int(0))) {
                                        goto(Label_4606)
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(1024)), ldc:int(0))) {
                                        goto(Label_4462)
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(262144)), ldc:int(0))) {
                                        goto(Label_4313)
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(67108864)), ldc:int(0))) {
                                        goto(Label_4063)
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(32)), ldc:int(0))) {
                                        goto(Label_3810)
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(32)), ldc:int(0))) {
                                        goto(Label_3516)
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(2097152)), ldc:int(0))) {
                                        var_3_2170 = and:int(var_3_2170:int, ldc:int(804673542))
                                        loopcontinue()
                                    }
                                    
                                    var_3_2170 = and:int(var_3_2170:int, ldc:int(838790903))
                                    return:void()
                                }
                                
                                Label_5545:
                                
                                if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(256)), ldc:int(0))) {
                                    var_3_2170 = and:int(var_3_2170:int, ldc:int(978910713))
                                    goto(Label_5373)
                                }
                                
                                if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(32)), ldc:int(0))) {
                                    var_3_2170 = and:int(var_3_2170:int, ldc:int(1665231165))
                                    goto(Label_5230)
                                }
                                
                                if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(1024)), ldc:int(0))) {
                                    var_3_2170 = and:int(var_3_2170:int, ldc:int(661039722))
                                    goto(Label_5049)
                                }
                                
                                if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(4194304)), ldc:int(0))) {
                                    goto(Label_4917)
                                }
                                
                                if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(1)), ldc:int(0))) {
                                    goto(Label_4755)
                                }
                                
                                if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(32)), ldc:int(0))) {
                                    goto(Label_4606)
                                }
                                
                                if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(256)), ldc:int(0))) {
                                    var_3_2170 = and:int(var_3_2170:int, ldc:int(-1479044434))
                                    goto(Label_4462)
                                }
                                
                                if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(65536)), ldc:int(0))) {
                                    var_3_2170 = and:int(var_3_2170:int, ldc:int(1564770699))
                                    goto(Label_4313)
                                }
                                
                                if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(1024)), ldc:int(0))) {
                                    goto(Label_4063)
                                }
                                
                                if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(67108864)), ldc:int(0))) {
                                    var_3_2170 = and:int(var_3_2170:int, ldc:int(-155111327))
                                    goto(Label_3810)
                                }
                                
                                if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(4194304)), ldc:int(0))) {
                                    goto(Label_3516)
                                }
                                
                                if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(67108864)), ldc:int(0))) {
                                    var_3_2170 = and:int(var_3_2170:int, ldc:int(-1510684941))
                                    stack_169A_0 = loadelement:String(getstatic:String[](\u3c25\ub70c\u5bc4\u8640\ubefe::\u0c95\u0b8e\uff55\u3e2a\uceb8\uc229), and:int(ldc:int(20620), ldc:int(3860)))
                                    expr_164B = newarray:Object[](java.lang.Object.class, xor:int(ldc:int(8336), ldc:int(8341)))
                                    storeelement:Object(expr_164B:Object[], and:int(ldc:int(-11009), ldc:int(11008)), invokestatic:Integer[expected:Object](Integer::valueOf, ldc:int(127)))
                                    storeelement:Object(expr_164B:Object[], and:int(ldc:int(1), ldc:int(5525)), invokevirtual:String[expected:Object](\u88c5\ud171\ub113\u6435\ud51e::\u67e9\uc246\u7bad\u61a4\u51b2\uae87, var_8_1B2:\u88c5\ud171\ub113\u6435\ud51e))
                                    storeelement:Object(expr_164B:Object[], xor:int(ldc:int(560), ldc:int(562)), invokevirtual:String[expected:Object](\u88c5\ud171\ub113\u6435\ud51e::\ub70c\u67d0\u92ee\uc87f\u3bd6\u7d52, var_8_1B2:\u88c5\ud171\ub113\u6435\ud51e))
                                    storeelement:Object(expr_164B:Object[], xor:int(ldc:int(33), ldc:int(34)), invokestatic:Integer[expected:Object](Integer::valueOf, invokevirtual:int(\u88c5\ud171\ub113\u6435\ud51e::\u7873\ud171\uc246\u40a9\ud12e\u3d4b, var_8_1B2:\u88c5\ud171\ub113\u6435\ud51e)))
                                    storeelement:Object(expr_164B:Object[], xor:int(ldc:int(-32512), ldc:int(-32508)), invokestatic:Integer[expected:Object](Integer::valueOf, invokevirtual:int(\u88c5\ud171\ub113\u6435\ud51e::\u71ae\u40a9\ub8be\uc31c\u3d4b\u5d20, var_8_1B2:\u88c5\ud171\ub113\u6435\ud51e)))
                                    var_14_169D = invokestatic:String(String::format, stack_169A_0:String, expr_164B:Object[])
                                    var_3_2170 = and:int(var_3_2170:int, ldc:int(602314109))
                                    var_15_16AB = invokespecial:ByteBuf(\u3c25\ub70c\u5bc4\u8640\ubefe::\ub102\u98a4\u5fe1\ud51e\uc2bd\u1187, this:\u3c25\ub70c\u5bc4\u8640\ubefe, var_14_169D:String)
                                    
                                    try {
                                        loop {
                                            if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(2097152)), ldc:int(0))) {
                                                goto(Label_5867)
                                            }
                                            
                                            if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(2097152)), ldc:int(0))) {
                                                var_3_2170 = and:int(var_3_2170:int, ldc:int(-1661854867))
                                            }
                                            else {
                                                var_3_2170 = and:int(var_3_2170:int, ldc:int(771612287))
                                                invokespecial:void(\u3c25\ub70c\u5bc4\u8640\ubefe::\u6c52\ud171\uc3e3\u946b\ud4fe\u7e3f, this:\u3c25\ub70c\u5bc4\u8640\ubefe, p0:ChannelHandlerContext, var_15_16AB:ByteBuf)
                                            }
                                            
                                            Label_5841:
                                            
                                            if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(4194304)), ldc:int(0))) {
                                                if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(512)), ldc:int(0))) {
                                                    loopcontinue()
                                                }
                                                
                                                var_3_2170 = and:int(var_3_2170:int, ldc:int(2079634945))
                                                invokevirtual:boolean(ByteBuf::release, var_15_16AB:ByteBuf)
                                            }
                                            
                                            Label_5867:
                                            
                                            if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(4194304)), ldc:int(0))) {
                                                goto(Label_5841)
                                            }
                                            
                                            if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(32768)), ldc:int(0))) {
                                                looporswitchbreak()
                                            }
                                            
                                            var_3_2170 = and:int(var_3_2170:int, ldc:int(-1637957321))
                                        }
                                        
                                        var_3_2170 = and:int(var_3_2170:int, ldc:int(1039060415))
                                    }
                                    finally {
                                        loop {
                                            if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(8388608)), ldc:int(0))) {
                                                var_3_2170 = and:int(var_3_2170:int, ldc:int(2053185920))
                                            }
                                            else {
                                                var_3_2170 = and:int(var_3_2170:int, ldc:int(-101415319))
                                                invokevirtual:boolean(ByteBuf::release, var_15_16AB:ByteBuf)
                                            }
                                            
                                            if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(65536)), ldc:int(0))) {
                                                looporswitchbreak()
                                            }
                                            
                                            var_3_2170 = and:int(var_3_2170:int, ldc:int(546352614))
                                        }
                                        
                                        var_3_2170 = and:int(var_3_2170:int, ldc:int(-772432587))
                                    }
                                    
                                    looporswitchbreak()
                                }
                            }
                            
                            Label_5962:
                            invokevirtual:boolean(ByteBuf::release, var_5_69:ByteBuf)
                            Label_5968:
                            
                            if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(256)), ldc:int(0))) {
                                var_3_2170 = and:int(var_3_2170:int, ldc:int(-1631879188))
                                goto(Label_7251)
                            }
                            
                            if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(32)), ldc:int(0))) {
                                var_3_2170 = and:int(var_3_2170:int, ldc:int(-290685060))
                                goto(Label_7019)
                            }
                            
                            if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(4194304)), ldc:int(0))) {
                                var_3_2170 = and:int(var_3_2170:int, ldc:int(-493193719))
                                goto(Label_6803)
                            }
                            
                            if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(32)), ldc:int(0))) {
                                goto(Label_6591)
                            }
                            
                            if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(2147483647)), ldc:int(0))) {
                                var_3_2170 = and:int(var_3_2170:int, ldc:int(-103743045))
                                goto(Label_6376)
                            }
                            
                            if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(512)), ldc:int(0))) {
                                var_3_2170 = and:int(var_3_2170:int, ldc:int(1759877700))
                            }
                            else {
                                if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(4194304)), ldc:int(0))) {
                                    goto(Label_2823)
                                }
                                
                                if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(16777216)), ldc:int(0))) {
                                    goto(Label_2438)
                                }
                                
                                if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(256)), ldc:int(0))) {
                                    goto(Label_2186)
                                }
                                
                                if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(262144)), ldc:int(0))) {
                                    var_3_2170 = and:int(var_3_2170:int, ldc:int(-49686230))
                                    goto(Label_1966)
                                }
                                
                                if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(2097152)), ldc:int(0))) {
                                    var_3_2170 = and:int(var_3_2170:int, ldc:int(1503807129))
                                    goto(Label_1726)
                                }
                                
                                if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(2147483647)), ldc:int(0))) {
                                    goto(Label_1540)
                                }
                                
                                if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(16777216)), ldc:int(0))) {
                                    goto(Label_1376)
                                }
                                
                                if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(32768)), ldc:int(0))) {
                                    goto(Label_1167)
                                }
                                
                                if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(4194304)), ldc:int(0))) {
                                    goto(Label_0987)
                                }
                                
                                if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(512)), ldc:int(0))) {
                                    goto(Label_0684)
                                }
                                
                                if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(32)), ldc:int(0))) {
                                    var_3_2170 = and:int(var_3_2170:int, ldc:int(-856555685))
                                    loopcontinue()
                                }
                                
                                var_3_2170 = and:int(var_3_2170:int, ldc:int(771145625))
                                var_6_98 = and:int(ldc:int(34), ldc:int(-35))
                            }
                            
                            Label_6174:
                            
                            if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(32)), ldc:int(0))) {
                                var_3_2170 = and:int(var_3_2170:int, ldc:int(-1675320141))
                                goto(Label_7251)
                            }
                            
                            if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(2147483647)), ldc:int(0))) {
                                var_3_2170 = and:int(var_3_2170:int, ldc:int(-1547464505))
                                goto(Label_7019)
                            }
                            
                            if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(1024)), ldc:int(0))) {
                                var_3_2170 = and:int(var_3_2170:int, ldc:int(-1679564522))
                                goto(Label_6803)
                            }
                            
                            if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(512)), ldc:int(0))) {
                                goto(Label_6591)
                            }
                            
                            if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(256)), ldc:int(0))) {
                                if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(32768)), ldc:int(0))) {
                                    var_3_2170 = and:int(var_3_2170:int, ldc:int(-358976683))
                                    goto(Label_5968)
                                }
                                
                                if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(16777216)), ldc:int(0))) {
                                    goto(Label_2823)
                                }
                                
                                if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(2147483647)), ldc:int(0))) {
                                    goto(Label_2438)
                                }
                                
                                if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(1)), ldc:int(0))) {
                                    goto(Label_2186)
                                }
                                
                                if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(16777216)), ldc:int(0))) {
                                    goto(Label_1966)
                                }
                                
                                if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(33554432)), ldc:int(0))) {
                                    var_3_2170 = and:int(var_3_2170:int, ldc:int(606027211))
                                    goto(Label_1726)
                                }
                                
                                if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(4194304)), ldc:int(0))) {
                                    var_3_2170 = and:int(var_3_2170:int, ldc:int(-551992888))
                                    goto(Label_1540)
                                }
                                
                                if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(1024)), ldc:int(0))) {
                                    goto(Label_1376)
                                }
                                
                                if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(16777216)), ldc:int(0))) {
                                    var_3_2170 = and:int(var_3_2170:int, ldc:int(1750757727))
                                    goto(Label_1167)
                                }
                                
                                if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(512)), ldc:int(0))) {
                                    goto(Label_0987)
                                }
                                
                                if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(8388608)), ldc:int(0))) {
                                    var_3_2170 = and:int(var_3_2170:int, ldc:int(-808503841))
                                    goto(Label_0684)
                                }
                                
                                if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(65536)), ldc:int(0))) {
                                    loopcontinue()
                                }
                                
                                var_3_2170 = and:int(var_3_2170:int, ldc:int(2079819673))
                                
                                if (cmpeq:boolean(var_6_98:int, ldc:int(0))) {
                                    goto(Label_7251)
                                }
                            }
                            
                            Label_6376:
                            
                            if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(65536)), ldc:int(0))) {
                                goto(Label_7251)
                            }
                            
                            if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(256)), ldc:int(0))) {
                                var_3_2170 = and:int(var_3_2170:int, ldc:int(-1242613751))
                                goto(Label_7019)
                            }
                            
                            if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(4194304)), ldc:int(0))) {
                                var_3_2170 = and:int(var_3_2170:int, ldc:int(-190889615))
                                goto(Label_6803)
                            }
                            
                            if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(8388608)), ldc:int(0))) {
                                var_3_2170 = and:int(var_3_2170:int, ldc:int(-955739140))
                            }
                            else {
                                if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(8388608)), ldc:int(0))) {
                                    var_3_2170 = and:int(var_3_2170:int, ldc:int(-387584841))
                                    goto(Label_6174)
                                }
                                
                                if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(67108864)), ldc:int(0))) {
                                    var_3_2170 = and:int(var_3_2170:int, ldc:int(1445915359))
                                    goto(Label_5968)
                                }
                                
                                if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(65536)), ldc:int(0))) {
                                    var_3_2170 = and:int(var_3_2170:int, ldc:int(-88498167))
                                    goto(Label_2823)
                                }
                                
                                if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(1024)), ldc:int(0))) {
                                    goto(Label_2438)
                                }
                                
                                if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(4194304)), ldc:int(0))) {
                                    goto(Label_2186)
                                }
                                
                                if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(512)), ldc:int(0))) {
                                    goto(Label_1966)
                                }
                                
                                if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(16777216)), ldc:int(0))) {
                                    var_3_2170 = and:int(var_3_2170:int, ldc:int(1511792947))
                                    goto(Label_1726)
                                }
                                
                                if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(32768)), ldc:int(0))) {
                                    goto(Label_1540)
                                }
                                
                                if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(67108864)), ldc:int(0))) {
                                    goto(Label_1376)
                                }
                                
                                if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(1024)), ldc:int(0))) {
                                    goto(Label_1167)
                                }
                                
                                if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(262144)), ldc:int(0))) {
                                    var_3_2170 = and:int(var_3_2170:int, ldc:int(1999614719))
                                    goto(Label_0987)
                                }
                                
                                if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(2147483647)), ldc:int(0))) {
                                    var_3_2170 = and:int(var_3_2170:int, ldc:int(1989557965))
                                    goto(Label_0684)
                                }
                                
                                if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(33554432)), ldc:int(0))) {
                                    var_3_2170 = and:int(var_3_2170:int, ldc:int(-1446318832))
                                    loopcontinue()
                                }
                                
                                var_3_2170 = and:int(var_3_2170:int, ldc:int(1442755987))
                            }
                            
                            Label_6591:
                            
                            if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(8388608)), ldc:int(0))) {
                                var_3_2170 = and:int(var_3_2170:int, ldc:int(681561901))
                                goto(Label_7251)
                            }
                            
                            if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(32)), ldc:int(0))) {
                                var_3_2170 = and:int(var_3_2170:int, ldc:int(-111649892))
                                goto(Label_7019)
                            }
                            
                            if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(67108864)), ldc:int(0))) {
                                if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(1024)), ldc:int(0))) {
                                    var_3_2170 = and:int(var_3_2170:int, ldc:int(1443935705))
                                    goto(Label_6376)
                                }
                                
                                if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(1024)), ldc:int(0))) {
                                    goto(Label_6174)
                                }
                                
                                if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(16777216)), ldc:int(0))) {
                                    goto(Label_5968)
                                }
                                
                                if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(32)), ldc:int(0))) {
                                    var_3_2170 = and:int(var_3_2170:int, ldc:int(-333943293))
                                    goto(Label_2823)
                                }
                                
                                if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(1024)), ldc:int(0))) {
                                    goto(Label_2438)
                                }
                                
                                if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(32768)), ldc:int(0))) {
                                    var_3_2170 = and:int(var_3_2170:int, ldc:int(-1621123316))
                                    goto(Label_2186)
                                }
                                
                                if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(512)), ldc:int(0))) {
                                    goto(Label_1966)
                                }
                                
                                if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(1)), ldc:int(0))) {
                                    goto(Label_1726)
                                }
                                
                                if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(32)), ldc:int(0))) {
                                    var_3_2170 = and:int(var_3_2170:int, ldc:int(2064357293))
                                    goto(Label_1540)
                                }
                                
                                if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(2097152)), ldc:int(0))) {
                                    var_3_2170 = and:int(var_3_2170:int, ldc:int(-1005746012))
                                    goto(Label_1376)
                                }
                                
                                if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(1024)), ldc:int(0))) {
                                    goto(Label_1167)
                                }
                                
                                if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(67108864)), ldc:int(0))) {
                                    goto(Label_0987)
                                }
                                
                                if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(65536)), ldc:int(0))) {
                                    var_3_2170 = and:int(var_3_2170:int, ldc:int(2138664253))
                                    goto(Label_0684)
                                }
                                
                                if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(4194304)), ldc:int(0))) {
                                    var_3_2170 = and:int(var_3_2170:int, ldc:int(-601001937))
                                    loopcontinue()
                                }
                                
                                var_3_2170 = and:int(var_3_2170:int, ldc:int(1811936743))
                                invokevirtual:ByteBuf(ByteBuf::resetReaderIndex, var_5_69:ByteBuf)
                            }
                            
                            Label_6803:
                            
                            if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(32)), ldc:int(0))) {
                                goto(Label_7251)
                            }
                            
                            if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(8388608)), ldc:int(0))) {
                                if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(2147483647)), ldc:int(0))) {
                                    goto(Label_6591)
                                }
                                
                                if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(67108864)), ldc:int(0))) {
                                    var_3_2170 = and:int(var_3_2170:int, ldc:int(-935294636))
                                    goto(Label_6376)
                                }
                                
                                if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(16777216)), ldc:int(0))) {
                                    var_3_2170 = and:int(var_3_2170:int, ldc:int(1105198332))
                                    goto(Label_6174)
                                }
                                
                                if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(67108864)), ldc:int(0))) {
                                    goto(Label_5968)
                                }
                                
                                if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(32768)), ldc:int(0))) {
                                    goto(Label_2823)
                                }
                                
                                if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(65536)), ldc:int(0))) {
                                    goto(Label_2438)
                                }
                                
                                if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(2147483647)), ldc:int(0))) {
                                    goto(Label_2186)
                                }
                                
                                if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(2147483647)), ldc:int(0))) {
                                    goto(Label_1966)
                                }
                                
                                if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(33554432)), ldc:int(0))) {
                                    var_3_2170 = and:int(var_3_2170:int, ldc:int(425116948))
                                    goto(Label_1726)
                                }
                                
                                if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(2147483647)), ldc:int(0))) {
                                    var_3_2170 = and:int(var_3_2170:int, ldc:int(442119086))
                                    goto(Label_1540)
                                }
                                
                                if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(16777216)), ldc:int(0))) {
                                    var_3_2170 = and:int(var_3_2170:int, ldc:int(-305405977))
                                    goto(Label_1376)
                                }
                                
                                if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(33554432)), ldc:int(0))) {
                                    goto(Label_1167)
                                }
                                
                                if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(8388608)), ldc:int(0))) {
                                    var_3_2170 = and:int(var_3_2170:int, ldc:int(-259130318))
                                    goto(Label_0987)
                                }
                                
                                if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(1024)), ldc:int(0))) {
                                    goto(Label_0684)
                                }
                                
                                if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(4194304)), ldc:int(0))) {
                                    var_3_2170 = and:int(var_3_2170:int, ldc:int(1031174393))
                                    loopcontinue()
                                }
                                
                                var_3_2170 = and:int(var_3_2170:int, ldc:int(937940317))
                                invokeinterface:ChannelHandler(ChannelPipeline::remove, invokeinterface:ChannelPipeline(Channel::pipeline, invokeinterface:Channel(ChannelHandlerContext::channel, p0:ChannelHandlerContext)), loadelement:String(getstatic:String[](\u3c25\ub70c\u5bc4\u8640\ubefe::\u0c95\u0b8e\uff55\u3e2a\uceb8\uc229), and:int(ldc:int(16899), ldc:int(2246))))
                            }
                            
                            Label_7019:
                            
                            if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(2147483647)), ldc:int(0))) {
                                var_3_2170 = and:int(var_3_2170:int, ldc:int(1805969522))
                            }
                            else {
                                if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(8388608)), ldc:int(0))) {
                                    var_3_2170 = and:int(var_3_2170:int, ldc:int(-1636126181))
                                    goto(Label_6803)
                                }
                                
                                if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(2097152)), ldc:int(0))) {
                                    goto(Label_6591)
                                }
                                
                                if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(16777216)), ldc:int(0))) {
                                    goto(Label_6376)
                                }
                                
                                if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(512)), ldc:int(0))) {
                                    var_3_2170 = and:int(var_3_2170:int, ldc:int(1292525758))
                                    goto(Label_6174)
                                }
                                
                                if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(65536)), ldc:int(0))) {
                                    goto(Label_5968)
                                }
                                
                                if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(32768)), ldc:int(0))) {
                                    var_3_2170 = and:int(var_3_2170:int, ldc:int(-1510086968))
                                    goto(Label_2823)
                                }
                                
                                if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(2097152)), ldc:int(0))) {
                                    goto(Label_2438)
                                }
                                
                                if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(1024)), ldc:int(0))) {
                                    goto(Label_2186)
                                }
                                
                                if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(8388608)), ldc:int(0))) {
                                    var_3_2170 = and:int(var_3_2170:int, ldc:int(-603230598))
                                    goto(Label_1966)
                                }
                                
                                if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(32768)), ldc:int(0))) {
                                    var_3_2170 = and:int(var_3_2170:int, ldc:int(-1102902021))
                                    goto(Label_1726)
                                }
                                
                                if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(4194304)), ldc:int(0))) {
                                    var_3_2170 = and:int(var_3_2170:int, ldc:int(929914549))
                                    goto(Label_1540)
                                }
                                
                                if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(32)), ldc:int(0))) {
                                    var_3_2170 = and:int(var_3_2170:int, ldc:int(-190318269))
                                    goto(Label_1376)
                                }
                                
                                if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(33554432)), ldc:int(0))) {
                                    var_3_2170 = and:int(var_3_2170:int, ldc:int(320710768))
                                    goto(Label_1167)
                                }
                                
                                if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(256)), ldc:int(0))) {
                                    var_3_2170 = and:int(var_3_2170:int, ldc:int(-1073971694))
                                    goto(Label_0987)
                                }
                                
                                if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(1024)), ldc:int(0))) {
                                    var_3_2170 = and:int(var_3_2170:int, ldc:int(1686954996))
                                    goto(Label_0684)
                                }
                                
                                if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(67108864)), ldc:int(0))) {
                                    loopcontinue()
                                }
                                
                                var_3_2170 = and:int(var_3_2170:int, ldc:int(872261439))
                                invokeinterface:ChannelHandlerContext(ChannelHandlerContext::fireChannelRead, p0:ChannelHandlerContext, p1:Object)
                            }
                            
                            Label_7251:
                            
                            if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(33554432)), ldc:int(0))) {
                                var_3_2170 = and:int(var_3_2170:int, ldc:int(-231894927))
                                goto(Label_7019)
                            }
                            
                            if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(1)), ldc:int(0))) {
                                goto(Label_6803)
                            }
                            
                            if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(512)), ldc:int(0))) {
                                var_3_2170 = and:int(var_3_2170:int, ldc:int(352898148))
                                goto(Label_6591)
                            }
                            
                            if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(65536)), ldc:int(0))) {
                                goto(Label_6376)
                            }
                            
                            if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(32768)), ldc:int(0))) {
                                goto(Label_6174)
                            }
                            
                            if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(4194304)), ldc:int(0))) {
                                var_3_2170 = and:int(var_3_2170:int, ldc:int(-331504093))
                                goto(Label_5968)
                            }
                            
                            if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(2097152)), ldc:int(0))) {
                                var_3_2170 = and:int(var_3_2170:int, ldc:int(-1661784837))
                                goto(Label_2823)
                            }
                            
                            if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(16777216)), ldc:int(0))) {
                                var_3_2170 = and:int(var_3_2170:int, ldc:int(1804064924))
                                goto(Label_2438)
                            }
                            
                            if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(32768)), ldc:int(0))) {
                                goto(Label_2186)
                            }
                            
                            if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(256)), ldc:int(0))) {
                                var_3_2170 = and:int(var_3_2170:int, ldc:int(1009379935))
                                goto(Label_1966)
                            }
                            
                            if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(32)), ldc:int(0))) {
                                goto(Label_1726)
                            }
                            
                            if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(512)), ldc:int(0))) {
                                goto(Label_1540)
                            }
                            
                            if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(1024)), ldc:int(0))) {
                                var_3_2170 = and:int(var_3_2170:int, ldc:int(114193451))
                                goto(Label_1376)
                            }
                            
                            if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(67108864)), ldc:int(0))) {
                                var_3_2170 = and:int(var_3_2170:int, ldc:int(-282223776))
                                goto(Label_1167)
                            }
                            
                            if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(1)), ldc:int(0))) {
                                var_3_2170 = and:int(var_3_2170:int, ldc:int(-1420000150))
                                goto(Label_0987)
                            }
                            
                            if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(2147483647)), ldc:int(0))) {
                                var_3_2170 = and:int(var_3_2170:int, ldc:int(1503651660))
                                goto(Label_0684)
                            }
                            
                            if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(16777216)), ldc:int(0))) {
                                var_3_2170 = and:int(var_3_2170:int, ldc:int(-1075329435))
                                return:void()
                            }
                            
                            var_3_2170 = and:int(var_3_2170:int, ldc:int(-1805553077))
                        }
                    }
                    
                    Label_7485:
                    
                    if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_2170 = and:int(var_3_2170:int, ldc:int(827371071))
                        goto(Label_7735)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_2170 = and:int(var_3_2170:int, ldc:int(-1363573240))
                        goto(Label_7641)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_2170 = and:int(var_3_2170:int, ldc:int(1797301919))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0335)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_2170 = and:int(var_3_2170:int, ldc:int(-644271048))
                            goto(Label_0256)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(1)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_2170 = and:int(var_3_2170:int, ldc:int(-1209561265))
                    }
                    
                    Label_7569:
                    
                    if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_7735)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_2170 = and:int(var_3_2170:int, ldc:int(671117731))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_7485)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(1)), ldc:int(0))) {
                            var_3_2170 = and:int(var_3_2170:int, ldc:int(-856089196))
                            goto(Label_0335)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0256)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(67108864)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_2170 = and:int(var_3_2170:int, ldc:int(-302140325))
                        invokevirtual:ByteBuf(ByteBuf::resetReaderIndex, var_5_69:ByteBuf)
                    }
                    
                    Label_7641:
                    
                    if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(32)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_2170 = and:int(var_3_2170:int, ldc:int(957828503))
                            goto(Label_7569)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_2170 = and:int(var_3_2170:int, ldc:int(1030027532))
                            goto(Label_7485)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0335)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0256)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(2147483647)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_2170 = and:int(var_3_2170:int, ldc:int(-570973135))
                        invokeinterface:ChannelHandler(ChannelPipeline::remove, invokeinterface:ChannelPipeline(Channel::pipeline, invokeinterface:Channel(ChannelHandlerContext::channel, p0:ChannelHandlerContext)), loadelement:String(getstatic:String[](\u3c25\ub70c\u5bc4\u8640\ubefe::\u0c95\u0b8e\uff55\u3e2a\uceb8\uc229), xor:int(ldc:int(12289), ldc:int(12291))))
                    }
                    
                    Label_7735:
                    
                    if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_2170 = and:int(var_3_2170:int, ldc:int(740587265))
                        goto(Label_7641)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_2170 = and:int(var_3_2170:int, ldc:int(51683482))
                        goto(Label_7569)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(32)), ldc:int(0))) {
                        var_3_2170 = and:int(var_3_2170:int, ldc:int(819151360))
                        goto(Label_7485)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0335)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0256)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_2170 = and:int(var_3_2170:int, ldc:int(1274916651))
                        invokeinterface:ChannelHandlerContext(ChannelHandlerContext::fireChannelRead, p0:ChannelHandlerContext, p1:Object)
                        return:void()
                    }
                    
                    var_3_2170 = and:int(var_3_2170:int, ldc:int(1345673535))
                }
            }
            catch (java.lang.RuntimeException var_7_1E9A) {
                loop {
                    if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_8178)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_2170 = and:int(var_3_2170:int, ldc:int(-603101838))
                        goto(Label_8102)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_8015)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_7959)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_2170 = and:int(var_3_2170:int, ldc:int(-1428123660))
                    }
                    else {
                        var_3_2170 = and:int(var_3_2170:int, ldc:int(1944956253))
                        
                        if (cmpeq:boolean(var_6_98:int, ldc:int(0))) {
                            goto(Label_8178)
                        }
                    }
                    
                    Label_7900:
                    
                    if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_8178)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_2170 = and:int(var_3_2170:int, ldc:int(517955985))
                        goto(Label_8102)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_8015)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_2170 = and:int(var_3_2170:int, ldc:int(623490880))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(65536)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_2170 = and:int(var_3_2170:int, ldc:int(134138991))
                    }
                    
                    Label_7959:
                    
                    if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_8178)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_2170 = and:int(var_3_2170:int, ldc:int(1698178071))
                        goto(Label_8102)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(33554432)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_7900)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(32)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_2170 = and:int(var_3_2170:int, ldc:int(-739275481))
                        invokevirtual:ByteBuf(ByteBuf::resetReaderIndex, var_5_69:ByteBuf)
                    }
                    
                    Label_8015:
                    
                    if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_8178)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_2170 = and:int(var_3_2170:int, ldc:int(135890721))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_7959)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_7900)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_2170 = and:int(var_3_2170:int, ldc:int(1956371497))
                            loopcontinue()
                        }
                        
                        var_3_2170 = and:int(var_3_2170:int, ldc:int(-1376323791))
                        invokeinterface:ChannelHandler(ChannelPipeline::remove, invokeinterface:ChannelPipeline(Channel::pipeline, invokeinterface:Channel(ChannelHandlerContext::channel, p0:ChannelHandlerContext)), loadelement:String(getstatic:String[](\u3c25\ub70c\u5bc4\u8640\ubefe::\u0c95\u0b8e\uff55\u3e2a\uceb8\uc229), and:int(ldc:int(386), ldc:int(4214))))
                    }
                    
                    Label_8102:
                    
                    if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_2170 = and:int(var_3_2170:int, ldc:int(-437850963))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_2170 = and:int(var_3_2170:int, ldc:int(157566614))
                            goto(Label_8015)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_2170 = and:int(var_3_2170:int, ldc:int(-1903269078))
                            goto(Label_7959)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_7900)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(16777216)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_2170 = and:int(var_3_2170:int, ldc:int(268355503))
                        invokeinterface:ChannelHandlerContext(ChannelHandlerContext::fireChannelRead, p0:ChannelHandlerContext, p1:Object)
                    }
                    
                    Label_8178:
                    
                    if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_8102)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(1)), ldc:int(0))) {
                        var_3_2170 = and:int(var_3_2170:int, ldc:int(109475771))
                        goto(Label_8015)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_2170 = and:int(var_3_2170:int, ldc:int(2108074929))
                        goto(Label_7959)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_7900)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(2147483647)), ldc:int(0))) {
                        looporswitchbreak()
                    }
                    
                    var_3_2170 = and:int(var_3_2170:int, ldc:int(1154025715))
                }
                
                var_3_2170 = and:int(var_3_2170:int, ldc:int(-571619691))
            }
            finally {
                loop {
                    if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_8509)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_8438)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_2170 = and:int(var_3_2170:int, ldc:int(-449440409))
                        goto(Label_8371)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_2170 = and:int(var_3_2170:int, ldc:int(-726726726))
                    }
                    else {
                        var_3_2170 = and:int(var_3_2170:int, ldc:int(1006022313))
                        
                        if (cmpeq:boolean(var_6_98:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_8310:
                    
                    if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_8509)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_2170 = and:int(var_3_2170:int, ldc:int(-901960442))
                        goto(Label_8438)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_2170 = and:int(var_3_2170:int, ldc:int(1548097914))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_2170 = and:int(var_3_2170:int, ldc:int(-1665588815))
                            loopcontinue()
                        }
                        
                        var_3_2170 = and:int(var_3_2170:int, ldc:int(1878302687))
                    }
                    
                    Label_8371:
                    
                    if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_8509)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_2170 = and:int(var_3_2170:int, ldc:int(1319527067))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_2170 = and:int(var_3_2170:int, ldc:int(1606407563))
                            goto(Label_8310)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_2170 = and:int(var_3_2170:int, ldc:int(1385239294))
                            loopcontinue()
                        }
                        
                        var_3_2170 = and:int(var_3_2170:int, ldc:int(268285905))
                        invokevirtual:ByteBuf(ByteBuf::resetReaderIndex, var_5_69:ByteBuf)
                    }
                    
                    Label_8438:
                    
                    if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_2170 = and:int(var_3_2170:int, ldc:int(-376775593))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_8371)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_8310)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(1)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_2170 = and:int(var_3_2170:int, ldc:int(-201863923))
                        invokeinterface:ChannelHandler(ChannelPipeline::remove, invokeinterface:ChannelPipeline(Channel::pipeline, invokeinterface:Channel(ChannelHandlerContext::channel, p0:ChannelHandlerContext)), loadelement:String(getstatic:String[](\u3c25\ub70c\u5bc4\u8640\ubefe::\u0c95\u0b8e\uff55\u3e2a\uceb8\uc229), and:int(ldc:int(1410), ldc:int(20490))))
                    }
                    
                    Label_8509:
                    
                    if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_8438)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_2170 = and:int(var_3_2170:int, ldc:int(268790553))
                        goto(Label_8371)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_2170:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_2170 = and:int(var_3_2170:int, ldc:int(-829567405))
                        goto(Label_8310)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_2170:int, ldc:int(1)), ldc:int(0))) {
                        var_3_2170 = and:int(var_3_2170:int, ldc:int(-906035683))
                        invokeinterface:ChannelHandlerContext(ChannelHandlerContext::fireChannelRead, p0:ChannelHandlerContext, p1:Object)
                        looporswitchbreak()
                    }
                }
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \u6c52\ud171\uc3e3\u946b\ud4fe\u7e3f(io.netty.channel.ChannelHandlerContext p0, io.netty.buffer.ByteBuf p1) {
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
            invokeinterface:ChannelFuture(ChannelFuture::addListener, invokeinterface:ChannelFuture(ChannelHandlerContext::writeAndFlush, invokeinterface:ChannelHandlerContext(ChannelPipeline::firstContext, invokeinterface:ChannelPipeline(ChannelHandlerContext::pipeline, p0:ChannelHandlerContext)), p1:ByteBuf[expected:Object]), getstatic:ChannelFutureListener[expected:GenericFutureListener](ChannelFutureListener::CLOSE))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private io.netty.buffer.ByteBuf \ub102\u98a4\u5fe1\ud51e\uc2bd\u1187(java.lang.String p0) {
        var_2_61 : int
        var_4_65 : ByteBuf
        var_5_78 : char[]
        var_6_85 : char[]
        var_7_8A : int
        var_8_93 : int
        
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
            var_2_61 = and:int(ldc:int(-1123294773), ldc:int(-649201285))
            var_4_65 = invokestatic:ByteBuf(Unpooled::buffer)
            invokevirtual:ByteBuf(ByteBuf::writeByte, var_4_65:ByteBuf, xor:int(ldc:int(4499), ldc:int(4460)))
            var_5_78 = invokevirtual:char[](String::toCharArray, p0:String)
            invokevirtual:ByteBuf(ByteBuf::writeShort, var_4_65:ByteBuf, arraylength:int(var_5_78:char[]))
            var_6_85 = var_5_78:char[]
            var_7_8A = arraylength:int(var_6_85:char[])
            var_8_93 = and:int(ldc:int(1490), ldc:int(-2011))
            
            loop {
                var_2_61 = and:int(var_2_61:int, ldc:int(-1648628017))
                
                if (cmpge:boolean(var_8_93:int, var_7_8A:int)) {
                    looporswitchbreak()
                }
                
                invokevirtual:ByteBuf(ByteBuf::writeChar, var_4_65:ByteBuf, loadelement:char(var_6_85:char[], var_8_93:int))
                inc:int(var_8_93, ldc:int(1))
            }
            
            return:ByteBuf(var_4_65:ByteBuf)
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_248 : int
        expr_6E : int [generated]
        stack_94_0 : byte[] [generated]
        stack_96_0 : byte[] [generated]
        stack_BB_0 : byte[] [generated]
        stack_BD_0 : byte[] [generated]
        stack_E3_0 : byte[] [generated]
        stack_1F0_0 : byte[] [generated]
        stack_25B_0 : byte[] [generated]
        stack_2CB_0 : byte[] [generated]
        var_4_1D1 : int
        var_3_1D6 : byte[]
        var_5_1D7 : int
        expr_1F3 : byte [generated]
        var_0_251 : int
        expr_25B : byte [generated]
        stack_299_2 : byte [generated]
        stack_277_0 : byte [generated]
        expr_96 : int [generated]
        var_2_BB : byte[]
        expr_BF : int [generated]
        var_3_2B9 : byte[]
        var_5_2BA : int
        var_3_EF : String
        stack_1C4_0 : String[] [generated]
        expr_101 : String[] [generated]
        
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
        var_0_248 = and:int(ldc:int(1653890027), ldc:int(-577471665))
        expr_6E = arraylength:int(stack_94_0 = stack_96_0 = stack_BB_0 = stack_BD_0 = stack_E3_0 = stack_1F0_0 = stack_25B_0 = stack_2CB_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("L9cvJycnlAzijwCBn+93R7hvFwffn+UdlsfARy8nJ19pH4/pF3GCHWe4thpfxrnPn5flHZbH8Cev6QFxgh1nuLYaX8a5z5+X5R32/7iQ32Efv+kXcYIdZ7i2Gl+nmY9G98jnoNCHwG+yWTVjUj2uSLoEQLq0SCm8SCkMZ0ZMZw==")))
        
        if (cmpeq:boolean(expr_6E:int, ldc:int(0))) {
            goto(Label_0115)
        }
        
        var_4_1D1 = expr_6E:int
        var_3_1D6 = newarray:byte[](byte.class, expr_6E:int)
        var_5_1D7 = expr_6E:int
        Label_0473:
        
        while (cmpne:boolean(and:int(var_0_248:int, ldc:int(8)), ldc:int(0))) {
            var_0_248 = and:int(var_0_248:int, ldc:int(-65720326))
            var_5_1D7 = add:int(var_5_1D7:int, ldc:int(-1))
            expr_1F3 = xor:byte(loadelement:byte(stack_1F0_0:byte[], var_5_1D7:int), ldc:byte(107))
            storeelement:byte(var_3_1D6:byte[], var_5_1D7:int, add:int(or:int(and:int(shl:int(expr_1F3:byte, xor:int(ldc:int(2315), ldc:int(2319))), ldc:int(-16)), and:int(shr:int(expr_1F3:byte[expected:int], and:int(ldc:int(23621), ldc:int(60))), ldc:int(15))), ldc:int(60)))
            
            if (cmpne:boolean(var_5_1D7:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_96_0 = stack_94_0 = stack_BB_0 = stack_BD_0 = stack_E3_0 = stack_1F0_0 = stack_25B_0 = stack_2CB_0 = var_3_1D6:byte[]
            goto(Label_0115)
        }
        
        Label_0571:
        
        while (cmpeq:boolean(and:int(var_0_248:int, ldc:int(268435456)), ldc:int(0))) {
            var_0_251 = and:int(var_0_248:int, ldc:int(-115905573))
            var_5_1D7 = add:int(var_5_1D7:int, ldc:int(-1))
            expr_25B = stack_299_2 = loadelement(stack_25B_0, var_5_1D7)
            
            if (cmplt:boolean(add:int(add:int(var_5_1D7:int, ldc:int(4)), neg:int(var_4_1D1:int)), ldc:int(0))) {
                stack_299_2 = stack_277_0 = add:byte(expr_25B:byte, loadelement:byte(var_3_1D6:byte[], add:int(var_5_1D7:int, ldc:int(4))))
                goto(Label_0647)
            }
            
            Label_0616:
            
            if (cmpeq:boolean(and:int(var_0_251:int, ldc:int(32768)), ldc:int(0))) {
                var_0_251 = and:int(var_0_251:int, ldc:int(1509731323))
                stack_299_2 = stack_277_0 = add:byte(expr_25B:byte, ldc:byte(4))
            }
            
            Label_0647:
            
            if (cmpeq:boolean(and:int(var_0_251:int, ldc:int(512)), ldc:int(0))) {
                goto(Label_0616)
            }
            
            var_0_248 = and:int(var_0_251:int, ldc:int(1232350059))
            storeelement:byte(var_3_1D6:byte[], var_5_1D7:int, stack_299_2:byte)
            
            if (cmpne:boolean(var_5_1D7:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_96_0 = stack_94_0 = stack_BB_0 = stack_BD_0 = stack_E3_0 = stack_1F0_0 = stack_25B_0 = stack_2CB_0 = var_3_1D6:byte[]
            goto(Label_0155)
        }
        
        var_0_248 = and:int(var_0_248:int, ldc:int(-1708160465))
        goto(Label_0473)
        Label_0115:
        
        if (cmpeq:boolean(and:int(var_0_248:int, ldc:int(2048)), ldc:int(0))) {
            goto(Label_0196)
        }
        
        if (cmpeq:boolean(and:int(var_0_248:int, ldc:int(8)), ldc:int(0))) {
            var_0_248 = and:int(var_0_248:int, ldc:int(-1661905772))
        }
        else {
            var_0_248 = and:int(var_0_248:int, ldc:int(-490778773))
            expr_96 = arraylength:int(stack_96_0:byte[])
            
            if (cmpne:boolean(expr_96:int, ldc:int(0))) {
                var_4_1D1 = expr_96:int
                var_3_1D6 = newarray:byte[](byte.class, expr_96:int)
                var_5_1D7 = expr_96:int
                goto(Label_0571)
            }
        }
        
        Label_0155:
        
        if (cmpne:boolean(and:int(var_0_248:int, ldc:int(256)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_248:int, ldc:int(1048576)), ldc:int(0))) {
                var_0_248 = and:int(var_0_248:int, ldc:int(1609941820))
                goto(Label_0115)
            }
            
            var_0_248 = and:int(var_0_248:int, ldc:int(1648213995))
            var_2_BB = stack_BB_0:byte[]
            expr_BF = add:int(arraylength:int(stack_BD_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_BF:int, ldc:int(0))) {
                var_3_2B9 = newarray:byte[](byte.class, expr_BF:int)
                var_5_2BA = expr_BF:int
                
                loop {
                    var_0_248 = and:int(var_0_248:int, ldc:int(1241324511))
                    var_5_2BA = add:int(var_5_2BA:int, ldc:int(-1))
                    storeelement:byte(var_3_2B9:byte[], var_5_2BA:int, add:int(shl:int(loadelement:byte(stack_2CB_0:byte[], var_5_2BA:int), ldc:int(1)), and:int(shr:int(loadelement:byte(var_2_BB:byte[], add:int(var_5_2BA:int, xor:int(ldc:int(202), ldc:int(203)))), ldc:int(7)), xor:int(ldc:int(1040), ldc:int(1041)))))
                    
                    if (cmpne:boolean(var_5_2BA:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_96_0 = stack_94_0 = stack_BB_0 = stack_BD_0 = stack_E3_0 = stack_1F0_0 = stack_25B_0 = stack_2CB_0 = var_3_2B9:byte[]
            }
        }
        
        Label_0196:
        
        if (cmpeq:boolean(and:int(var_0_248:int, ldc:int(512)), ldc:int(0))) {
            var_0_248 = and:int(var_0_248:int, ldc:int(1577007148))
            goto(Label_0155)
        }
        
        if (cmpeq:boolean(and:int(var_0_248:int, ldc:int(268435456)), ldc:int(0))) {
            var_3_EF = initobject:String(String::<init>, stack_E3_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_1C4_0 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(17030), ldc:int(17025)))
            expr_101 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(143), ldc:int(17447)))
            storeelement:String(expr_101:String[], xor:int(ldc:int(-24552), ldc:int(-24551)), invokevirtual:String[expected:String](String::substring, var_3_EF:String, and:int(ldc:int(-3182), ldc:int(1133)), and:int(ldc:int(5230), ldc:int(792))))
            storeelement:String(expr_101:String[], and:int(ldc:int(773), ldc:int(5223)), invokevirtual:String[expected:String](String::substring, var_3_EF:String, xor:int(ldc:int(1025), ldc:int(1033)), xor:int(ldc:int(16589), ldc:int(16606))))
            storeelement:String(expr_101:String[], xor:int(ldc:int(9472), ldc:int(9475)), invokevirtual:String[expected:String](String::substring, var_3_EF:String, xor:int(ldc:int(4141), ldc:int(4158)), xor:int(ldc:int(-24432), ldc:int(-24385))))
            storeelement:String(expr_101:String[], xor:int(ldc:int(1058), ldc:int(1060)), invokevirtual:String[expected:String](String::substring, var_3_EF:String, xor:int(ldc:int(1814), ldc:int(1849)), xor:int(ldc:int(-31458), ldc:int(-31397))))
            storeelement:String(expr_101:String[], and:int(ldc:int(-5581), ldc:int(5324)), invokevirtual:String[expected:String](String::substring, var_3_EF:String, and:int(ldc:int(6367), ldc:int(17477)), and:int(ldc:int(8798), ldc:int(2143))))
            storeelement:String(expr_101:String[], xor:int(ldc:int(2133), ldc:int(2135)), invokevirtual:String[expected:String](String::substring, var_3_EF:String, xor:int(ldc:int(4273), ldc:int(4335)), xor:int(ldc:int(8197), ldc:int(8303))))
            storeelement:String(expr_101:String[], xor:int(ldc:int(-30651), ldc:int(-30655)), invokevirtual:String[expected:String](String::substring, var_3_EF:String, xor:int(ldc:int(20546), ldc:int(20520)), and:int(ldc:int(2171), ldc:int(17535))))
            putstatic:String[](\u3c25\ub70c\u5bc4\u8640\ubefe::\u0c95\u0b8e\uff55\u3e2a\uceb8\uc229, expr_101:String[])
            putstatic:Logger(\u3c25\ub70c\u5bc4\u8640\ubefe::\ub8be\ub70c\u8308\u8350\u3bc9\ua61f, invokestatic:Logger(LogManager::getLogger))
            return:void()
        }
        
        goto(Label_0115)
    }
    
    public void \u7d52\u64f2\u9255\ufe34\u516c\u67d0(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_6A5 : int
        var_5_89 : int
        var_6_90 : int
        var_7_9F : double
        var_9_D0 : double
        var_3_E2 : int
        var_11_F3 : int
        var_14_11D : double
        var_16_121 : int
        var_12_119 : double
        var_17_6B0 : int
        
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
        var_3_6A5 = and:int(ldc:int(-411977143), ldc:int(-135267331))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u3c25\ub70c\u5bc4\u8640\ubefe[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0179)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_6A5:int, ldc:int(262144)), ldc:int(0))) {
            var_3_6A5 = and:int(var_3_6A5:int, ldc:int(1180590801))
        }
        else {
            var_3_6A5 = and:int(var_3_6A5:int, ldc:int(-268632240))
            var_5_89 = and:int(ldc:int(-11272), ldc:int(11271))
            var_6_90 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9F = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-24309), ldc:int(23188)))
            invokestatic:int(m::a)
            
            loop {
                var_9_D0 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_E2 = and:int(var_3_6A5:int, ldc:int(-4657600))
                    var_9_D0 = sub:double(var_7_9F:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_F3 = var_5_89:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_F3:int, sub:int(var_6_90:int, xor:int(ldc:int(39), ldc:int(38)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_F3:int, and:int(ldc:int(2049), ldc:int(4239)))), var_7_9F:double))) {
                        inc:int(var_11_F3, ldc:int(1))
                    }
                    
                    var_3_6A5 = and:int(var_3_E2:int, ldc:int(-270438822))
                    var_14_11D = var_7_9F:double
                    var_16_121 = var_11_F3:int
                }
                else {
                    var_11_F3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_89:int), and:int(ldc:int(4801), ldc:int(13)))
                    var_12_119 = var_14_11D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_89)
                    
                    if (cmplt:boolean(var_16_121 = var_11_F3:int, var_6_90:int)) {
                        var_9_D0 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_F3:int)
                        var_16_121 = var_11_F3:int
                        var_14_11D = var_12_119:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_6A5:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_6A5 = and:int(var_3_6A5:int, ldc:int(1215196793))
                        goto(Label_1578)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A5:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1426)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A5:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1305)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A5:int, ldc:int(256)), ldc:int(0))) {
                        var_3_6A5 = and:int(var_3_6A5:int, ldc:int(-411387049))
                        goto(Label_1166)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A5:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_6A5 = and:int(var_3_6A5:int, ldc:int(-1718170973))
                        goto(Label_0975)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A5:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0865)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A5:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6A5 = and:int(var_3_6A5:int, ldc:int(222767121))
                        goto(Label_0719)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A5:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0599)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A5:int, ldc:int(512)), ldc:int(0))) {
                        var_3_6A5 = and:int(var_3_6A5:int, ldc:int(936930548))
                    }
                    else {
                        var_3_6A5 = and:int(var_3_6A5:int, ldc:int(-281564243))
                        
                        if (cmplt:boolean(var_16_121:int, var_6_90:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0599)
                            }
                            
                            goto(Label_0865)
                        }
                    }
                    
                    Label_0421:
                    
                    if (cmpne:boolean(and:int(var_3_6A5:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1578)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A5:int, ldc:int(16)), ldc:int(0))) {
                        var_3_6A5 = and:int(var_3_6A5:int, ldc:int(692723230))
                        goto(Label_1426)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A5:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_6A5 = and:int(var_3_6A5:int, ldc:int(1045417953))
                        goto(Label_1305)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A5:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6A5 = and:int(var_3_6A5:int, ldc:int(1681707168))
                        goto(Label_1166)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A5:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0975)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A5:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_6A5 = and:int(var_3_6A5:int, ldc:int(1448597758))
                        goto(Label_0865)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A5:int, ldc:int(16)), ldc:int(0))) {
                        var_3_6A5 = and:int(var_3_6A5:int, ldc:int(2112075204))
                        goto(Label_0719)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A5:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_6A5 = and:int(var_3_6A5:int, ldc:int(650243190))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6A5:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_6A5 = and:int(var_3_6A5:int, ldc:int(-134332693))
                            var_11_F3 = and:int(ldc:int(-30516), ldc:int(26417))
                            goto(Label_1567)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0599:
                    
                    if (cmpne:boolean(and:int(var_3_6A5:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1578)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A5:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1426)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A5:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_6A5 = and:int(var_3_6A5:int, ldc:int(761588907))
                        goto(Label_1305)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A5:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_6A5 = and:int(var_3_6A5:int, ldc:int(-271639506))
                        goto(Label_1166)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A5:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0975)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A5:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0865)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A5:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_6A5 = and:int(var_3_6A5:int, ldc:int(864235362))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6A5:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0421)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A5:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_6A5 = and:int(var_3_6A5:int, ldc:int(-392632839))
                            loopcontinue()
                        }
                        
                        var_3_6A5 = and:int(var_3_6A5:int, ldc:int(-277348534))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_11D = var_9_D0:double
                            goto(Label_0865)
                        }
                    }
                    
                    Label_0719:
                    
                    if (cmpeq:boolean(and:int(var_3_6A5:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_6A5 = and:int(var_3_6A5:int, ldc:int(-635468552))
                        goto(Label_1578)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A5:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1426)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A5:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_6A5 = and:int(var_3_6A5:int, ldc:int(-1171289117))
                        goto(Label_1305)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A5:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1166)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A5:int, ldc:int(2)), ldc:int(0))) {
                        var_3_6A5 = and:int(var_3_6A5:int, ldc:int(1858672877))
                        goto(Label_0975)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A5:int, ldc:int(16)), ldc:int(0))) {
                        var_3_6A5 = and:int(var_3_6A5:int, ldc:int(-295665705))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6A5:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0599)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A5:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_6A5 = and:int(var_3_6A5:int, ldc:int(-2123794001))
                            goto(Label_0421)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A5:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_6A5 = and:int(var_3_6A5:int, ldc:int(-261585145))
                            loopcontinue()
                        }
                        
                        var_3_6A5 = and:int(var_3_6A5:int, ldc:int(-131123))
                        var_14_11D = mul:double(ldc:double(0.5), add:double(var_9_D0:double, var_14_11D:double))
                    }
                    
                    Label_0865:
                    
                    if (cmpeq:boolean(and:int(var_3_6A5:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1578)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A5:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_6A5 = and:int(var_3_6A5:int, ldc:int(2124405361))
                        goto(Label_1426)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A5:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_6A5 = and:int(var_3_6A5:int, ldc:int(-1505964567))
                        goto(Label_1305)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A5:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1166)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A5:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_6A5 = and:int(var_3_6A5:int, ldc:int(1797676951))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6A5:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0719)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A5:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0599)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A5:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0421)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A5:int, ldc:int(262144)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6A5 = and:int(var_3_6A5:int, ldc:int(-281941028))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_89:int), var_7_9F:double)) {
                                var_11_F3 = and:int(ldc:int(1), ldc:int(16577))
                                goto(Label_1166)
                            }
                        }
                    }
                    
                    Label_0975:
                    
                    if (cmpne:boolean(and:int(var_3_6A5:int, ldc:int(16)), ldc:int(0))) {
                        var_3_6A5 = and:int(var_3_6A5:int, ldc:int(-84680803))
                        goto(Label_1578)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A5:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_6A5 = and:int(var_3_6A5:int, ldc:int(1641790431))
                        goto(Label_1426)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A5:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1305)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A5:int, ldc:int(16)), ldc:int(0))) {
                        var_3_6A5 = and:int(var_3_6A5:int, ldc:int(-410585933))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6A5:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_6A5 = and:int(var_3_6A5:int, ldc:int(-1212822134))
                            goto(Label_0865)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A5:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_6A5 = and:int(var_3_6A5:int, ldc:int(-1781305540))
                            goto(Label_0719)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A5:int, ldc:int(256)), ldc:int(0))) {
                            var_3_6A5 = and:int(var_3_6A5:int, ldc:int(77820492))
                            goto(Label_0599)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A5:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_6A5 = and:int(var_3_6A5:int, ldc:int(722855081))
                            goto(Label_0421)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A5:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_6A5 = and:int(var_3_6A5:int, ldc:int(-288059103))
                            loopcontinue()
                        }
                        
                        var_3_6A5 = and:int(var_3_6A5:int, ldc:int(-82328))
                        var_11_F3 = and:int(ldc:int(-26753), ldc:int(26752))
                    }
                    
                    Label_1166:
                    
                    if (cmpne:boolean(and:int(var_3_6A5:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1578)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A5:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_6A5 = and:int(var_3_6A5:int, ldc:int(-2128712190))
                        goto(Label_1426)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A5:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_6A5 = and:int(var_3_6A5:int, ldc:int(1677392187))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6A5:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0975)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A5:int, ldc:int(2)), ldc:int(0))) {
                            var_3_6A5 = and:int(var_3_6A5:int, ldc:int(-13772215))
                            goto(Label_0865)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A5:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_6A5 = and:int(var_3_6A5:int, ldc:int(-1542631365))
                            goto(Label_0719)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A5:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_6A5 = and:int(var_3_6A5:int, ldc:int(-1922383494))
                            goto(Label_0599)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A5:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_6A5 = and:int(var_3_6A5:int, ldc:int(-2146585601))
                            goto(Label_0421)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A5:int, ldc:int(2)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6A5 = and:int(var_3_6A5:int, ldc:int(-139591886))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_F3:int, ldc:int(0))) {
                                goto(Label_1426)
                            }
                        }
                    }
                    
                    Label_1305:
                    
                    if (cmpeq:boolean(and:int(var_3_6A5:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1578)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A5:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_6A5 = and:int(var_3_6A5:int, ldc:int(1216821077))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6A5:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_6A5 = and:int(var_3_6A5:int, ldc:int(1423246292))
                            goto(Label_1166)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A5:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0975)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A5:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0865)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A5:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_6A5 = and:int(var_3_6A5:int, ldc:int(-353751564))
                            goto(Label_0719)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A5:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0599)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A5:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0421)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A5:int, ldc:int(256)), ldc:int(0))) {
                            var_3_6A5 = and:int(var_3_6A5:int, ldc:int(-407945572))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_11D:double, var_5_89:int, var_16_121:int)
                            goto(Label_1567)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1426:
                    
                    if (cmpne:boolean(and:int(var_3_6A5:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1578)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A5:int, ldc:int(16)), ldc:int(0))) {
                        var_3_6A5 = and:int(var_3_6A5:int, ldc:int(1155821086))
                        goto(Label_1305)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A5:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6A5 = and:int(var_3_6A5:int, ldc:int(-1754481806))
                        goto(Label_1166)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A5:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0975)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A5:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0865)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A5:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_6A5 = and:int(var_3_6A5:int, ldc:int(-263569395))
                        goto(Label_0719)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A5:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_6A5 = and:int(var_3_6A5:int, ldc:int(-815725750))
                        goto(Label_0599)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A5:int, ldc:int(256)), ldc:int(0))) {
                        var_3_6A5 = and:int(var_3_6A5:int, ldc:int(-1598053716))
                        goto(Label_0421)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A5:int, ldc:int(2048)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_6A5 = and:int(var_3_6A5:int, ldc:int(-135333243))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_11D:double, ldc:double(0.0))
                    Label_1567:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_6B0 = var_5_89:int
                        
                        if (cmpeq:boolean(var_11_F3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1578:
                    
                    if (cmpne:boolean(and:int(var_3_6A5:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_6A5 = and:int(var_3_6A5:int, ldc:int(-350401506))
                        goto(Label_1426)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A5:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1305)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A5:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_6A5 = and:int(var_3_6A5:int, ldc:int(1219904334))
                        goto(Label_1166)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A5:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0975)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A5:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0865)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A5:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_6A5 = and:int(var_3_6A5:int, ldc:int(-975936633))
                        goto(Label_0719)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A5:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_6A5 = and:int(var_3_6A5:int, ldc:int(1583580008))
                        goto(Label_0599)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A5:int, ldc:int(512)), ldc:int(0))) {
                        var_3_6A5 = and:int(var_3_6A5:int, ldc:int(1606262704))
                        goto(Label_0421)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A5:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_6A5 = and:int(var_3_6A5:int, ldc:int(-6145498))
                        var_17_6B0 = add:int(var_16_121:int, xor:int(ldc:int(20546), ldc:int(20547)))
                        looporswitchbreak()
                    }
                    
                    var_3_6A5 = and:int(var_3_6A5:int, ldc:int(1096245420))
                }
                
                var_3_6A5 = and:int(var_3_6A5:int, ldc:int(-135496944))
                
                if (cmple:boolean(var_5_89 = var_17_6B0:int, sub:int(var_6_90:int, and:int(ldc:int(513), ldc:int(8467))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0179:
        
        if (cmpeq:boolean(and:int(var_3_6A5:int, ldc:int(8192)), ldc:int(0))) {
            var_3_6A5 = and:int(var_3_6A5:int, ldc:int(1714275661))
            goto(Label_0108)
        }
    }
}
