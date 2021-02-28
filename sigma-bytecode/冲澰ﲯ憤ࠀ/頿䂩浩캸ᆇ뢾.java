public class \u51b2\u6fb0\ufcaf\u61a4\u0800.\u983f\u40a9\u6d69\uceb8\u1187\ub8be {
    public void \u983f\u40a9\u6d69\uceb8\u1187\ub8be() {
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
            invokespecial:Object(Object::<init>, this:\u983f\u40a9\u6d69\uceb8\u1187\ub8be)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static java.util.List<java.lang.Object> \u67e9\u7bad\u3504\ud217\u4d85\u9255(io.netty.handler.codec.ByteToMessageDecoder p0, io.netty.channel.ChannelHandlerContext p1, java.lang.Object p2) {
        var_3_CC : int
        var_5_6C : ArrayList<Object>
        stack_AF_0 : Method [generated]
        expr_8D : Object[] [generated]
        var_6_C6 : IllegalAccessException
        
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
            var_3_CC = and:int(and:int(ldc:int(1712667186), ldc:int(1914518399)), ldc:int(-429951169))
            var_5_6C = initobject:ArrayList<Object>(ArrayList<E>::<init>)
            
            try {
                do {
                    if (cmpne:boolean(and:int(var_3_CC:int, ldc:int(128)), ldc:int(0))) {
                        var_3_CC = and:int(var_3_CC:int, ldc:int(781955527))
                    }
                    else {
                        var_3_CC = and:int(var_3_CC:int, ldc:int(-116048130))
                        stack_AF_0 = getstatic:Method(\u983f\u40a9\u6d69\uceb8\u1187\ub8be::\u51b2\u97e6\u8753\u516c\uff55\uc3e3)
                        expr_8D = newarray:Object[](java.lang.Object.class, xor:int(ldc:int(84), ldc:int(87)))
                        storeelement:Object(expr_8D:Object[], and:int(ldc:int(-4472), ldc:int(4471)), p1:ChannelHandlerContext[expected:Object])
                        storeelement:Object(expr_8D:Object[], xor:int(ldc:int(18), ldc:int(19)), p2:Object)
                        storeelement:Object(expr_8D:Object[], and:int(ldc:int(16450), ldc:int(2314)), var_5_6C:ArrayList<Object>[expected:Object])
                        invokevirtual:Object(Method::invoke, stack_AF_0:Method, p0:ByteToMessageDecoder[expected:Object], expr_8D:Object[])
                    }
                } while (cmpeq:boolean(and:int(var_3_CC:int, ldc:int(512)), ldc:int(0)))
                
                var_3_CC = and:int(var_3_CC:int, ldc:int(1845475126))
            }
            catch (java.lang.IllegalAccessException var_6_C6) {
                var_3_CC = and:int(var_3_CC:int, ldc:int(-14715969))
                invokevirtual:void(Throwable::printStackTrace, var_6_C6:IllegalAccessException[expected:Throwable])
            }
            
            return:List<Object>(var_5_6C:ArrayList<Object>[expected:List<Object>])
        }
        
        goto(Label_0006)
    }
    
    public static void \ud36e\u6b0d\uc4d2\u74b1\u34df\u071d(io.netty.handler.codec.MessageToByteEncoder p0, io.netty.channel.ChannelHandlerContext p1, java.lang.Object p2, io.netty.buffer.ByteBuf p3) {
        var_4_D3 : int
        stack_A8_0 : Method [generated]
        expr_87 : Object[] [generated]
        var_6_CC : IllegalAccessException
        
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
            var_4_D3 = and:int(ldc:int(-2099373756), ldc:int(-957548308))
            
            try {
                loop {
                    if (cmpeq:boolean(and:int(var_4_D3:int, ldc:int(8388608)), ldc:int(0))) {
                        var_4_D3 = and:int(var_4_D3:int, ldc:int(-1322301755))
                    }
                    else {
                        var_4_D3 = and:int(var_4_D3:int, ldc:int(-1210287513))
                        stack_A8_0 = getstatic:Method(\u983f\u40a9\u6d69\uceb8\u1187\ub8be::\ud36e\u7af6\u92ee\ub102\ua562\u2dcc)
                        expr_87 = newarray:Object[](java.lang.Object.class, and:int(ldc:int(4435), ldc:int(17411)))
                        storeelement:Object(expr_87:Object[], and:int(ldc:int(10438), ldc:int(-14535)), p1:ChannelHandlerContext[expected:Object])
                        storeelement:Object(expr_87:Object[], xor:int(ldc:int(5250), ldc:int(5251)), p2:Object)
                        storeelement:Object(expr_87:Object[], and:int(ldc:int(16522), ldc:int(515)), p3:ByteBuf[expected:Object])
                        invokevirtual:Object(Method::invoke, stack_A8_0:Method, p0:MessageToByteEncoder[expected:Object], expr_87:Object[])
                    }
                    
                    if (cmpne:boolean(and:int(var_4_D3:int, ldc:int(4096)), ldc:int(0))) {
                        looporswitchbreak()
                    }
                    
                    var_4_D3 = and:int(var_4_D3:int, ldc:int(-621213644))
                }
                
                var_4_D3 = and:int(var_4_D3:int, ldc:int(-2098324003))
            }
            catch (java.lang.IllegalAccessException var_6_CC) {
                var_4_D3 = and:int(var_4_D3:int, ldc:int(-1426153762))
                invokevirtual:void(Throwable::printStackTrace, var_6_CC:IllegalAccessException[expected:Throwable])
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static java.util.List<java.lang.Object> \u67e9\u7bad\u3504\ud217\u4d85\u9255(io.netty.handler.codec.MessageToMessageDecoder p0, io.netty.channel.ChannelHandlerContext p1, java.lang.Object p2) {
        var_3_D4 : int
        var_5_6C : ArrayList<Object>
        stack_AF_0 : Method [generated]
        expr_8D : Object[] [generated]
        var_6_CE : IllegalAccessException
        
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
            var_3_D4 = and:int(and:int(ldc:int(-1321533151), ldc:int(-1318359005)), ldc:int(-1111760891))
            var_5_6C = initobject:ArrayList<Object>(ArrayList<E>::<init>)
            
            try {
                loop {
                    if (cmpne:boolean(and:int(var_3_D4:int, ldc:int(4)), ldc:int(0))) {
                        var_3_D4 = and:int(var_3_D4:int, ldc:int(-1908442677))
                    }
                    else {
                        var_3_D4 = and:int(var_3_D4:int, ldc:int(-1086614762))
                        stack_AF_0 = getstatic:Method(\u983f\u40a9\u6d69\uceb8\u1187\ub8be::\u9033\uc2e8\u47c2\ub171\u3e75\u624e)
                        expr_8D = newarray:Object[](java.lang.Object.class, and:int(ldc:int(20579), ldc:int(1411)))
                        storeelement:Object(expr_8D:Object[], and:int(ldc:int(-14785), ldc:int(14784)), p1:ChannelHandlerContext[expected:Object])
                        storeelement:Object(expr_8D:Object[], and:int(ldc:int(8761), ldc:int(4099)), p2:Object)
                        storeelement:Object(expr_8D:Object[], and:int(ldc:int(5170), ldc:int(2954)), var_5_6C:ArrayList<Object>[expected:Object])
                        invokevirtual:Object(Method::invoke, stack_AF_0:Method, p0:MessageToMessageDecoder[expected:Object], expr_8D:Object[])
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_D4:int, ldc:int(2)), ldc:int(0))) {
                        looporswitchbreak()
                    }
                    
                    var_3_D4 = and:int(var_3_D4:int, ldc:int(-839162785))
                }
                
                var_3_D4 = and:int(var_3_D4:int, ldc:int(-214989239))
            }
            catch (java.lang.IllegalAccessException var_6_CE) {
                var_3_D4 = and:int(var_3_D4:int, ldc:int(-205567346))
                invokevirtual:void(Throwable::printStackTrace, var_6_CE:IllegalAccessException[expected:Throwable])
            }
            
            return:List<Object>(var_5_6C:ArrayList<Object>[expected:List<Object>])
        }
        
        goto(Label_0006)
    }
    
    public static boolean \uff55\u7ce1\u9033\u4975\uc246\u9af2(java.lang.Throwable p0, java.lang.Class<?> p1) {
        var_2_6B : int
        
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
        var_2_6B = and:int(ldc:int(-1880604823), ldc:int(-127009))
        
        loop {
            if (cmpeq:boolean(and:int(var_2_6B:int, ldc:int(16)), ldc:int(0))) {
                var_2_6B = and:int(var_2_6B:int, ldc:int(-536893616))
                
                if (cmpne:boolean(p0:Throwable, aconstnull:Throwable())) {
                    if (logicalnot:boolean(invokevirtual:boolean(Class::isAssignableFrom, p1:Class, invokevirtual:Class<? extends Throwable>(Throwable::getClass, p0:Throwable)))) {
                        var_2_6B = and:int(var_2_6B:int, ldc:int(-2085068985))
                        p0 = invokevirtual:Throwable(Throwable::getCause, p0:Throwable)
                        loopcontinue()
                    }
                    
                    return:boolean(and:int[expected:boolean](ldc:int(545), ldc:int(147)))
                }
            }
            
            if (cmpne:boolean(and:int(var_2_6B:int, ldc:int(2147483647)), ldc:int(0))) {
                return:boolean(and:int[expected:boolean](ldc:int(-5457), ldc:int(5456)))
            }
            
            var_2_6B = and:int(var_2_6B:int, ldc:int(1668691670))
        }
    }
    
    public static io.netty.channel.ChannelHandlerContext \u71f1\uceb8\ua562\ub19c\u6d69\ua6bd(java.lang.String p0, io.netty.channel.ChannelPipeline p1) {
        var_2_5F : int
        var_4_67 : int
        var_5_74 : Iterator<String>
        var_2_81 : int
        var_6_B8 : String
        var_2_C3 : int
        
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
        var_2_5F = and:int(ldc:int(-556583164), ldc:int(-1429264657))
        var_4_67 = and:int(ldc:int(31360), ldc:int(-31361))
        var_5_74 = invokeinterface:Iterator(List::iterator, invokeinterface:List(ChannelPipeline::names, p1:ChannelPipeline))
        
        loop {
            if (cmpne:boolean(and:int(var_2_5F:int, ldc:int(16384)), ldc:int(0))) {
                var_2_81 = and:int(var_2_5F:int, ldc:int(-234751615))
            }
            else {
                var_2_81 = and:int(var_2_5F:int, ldc:int(-202430922))
                
                if (invokeinterface:boolean(Iterator::hasNext, var_5_74:Iterator)) {
                    var_6_B8 = checkcast:String(java.lang.String.class, invokeinterface:String(Iterator<String>::next, var_5_74:Iterator<String>))
                    
                    if (cmpeq:boolean(var_4_67:int, ldc:int(0))) {
                        var_2_C3 = and:int(var_2_81:int, ldc:int(-1730462179))
                        
                        if (invokevirtual:boolean(String::equalsIgnoreCase, var_6_B8:String, p0:String)) {
                            var_4_67 = and:int(ldc:int(29761), ldc:int(2059))
                        }
                        
                        var_2_5F = and:int(var_2_C3:int, ldc:int(-1529139500))
                        loopcontinue()
                    }
                    
                    return:ChannelHandlerContext(invokeinterface:ChannelHandlerContext(ChannelPipeline::context, p1:ChannelPipeline, invokeinterface:ChannelHandler(ChannelPipeline::get, p1:ChannelPipeline, var_6_B8:String)))
                }
            }
            
            if (cmpne:boolean(and:int(var_2_81:int, ldc:int(512)), ldc:int(0))) {
                return:ChannelHandlerContext(aconstnull:ChannelHandlerContext())
            }
            
            var_2_5F = and:int(var_2_81:int, ldc:int(-1310045553))
        }
    }
    
    public static io.netty.channel.ChannelHandlerContext \u8d90\u8389\u836c\u5db4\u71f1\ub70c(java.lang.String p0, io.netty.channel.ChannelPipeline p1) {
        var_4_61 : String
        var_5_73 : Iterator<String>
        var_6_8F : String
        
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
            var_4_61 = aconstnull:String()
            var_5_73 = invokeinterface:Iterator<String>(Set<String>::iterator, invokeinterface:Set<String>(Map<String, V>::keySet, invokeinterface:Map(ChannelPipeline::toMap, p1:ChannelPipeline)))
            
            while (invokeinterface:boolean(Iterator<E>::hasNext, var_5_73:Iterator<String>)) {
                var_6_8F = checkcast:String(java.lang.String.class, invokeinterface:String(Iterator<String>::next, var_5_73:Iterator<String>))
                
                if (invokevirtual:boolean(String::equals, var_6_8F:String, p0:String[expected:Object])) {
                    return:ChannelHandlerContext(invokeinterface:ChannelHandlerContext(ChannelPipeline::context, p1:ChannelPipeline, var_4_61:String))
                }
                
                var_4_61 = var_6_8F:String
            }
            
            return:ChannelHandlerContext(aconstnull:ChannelHandlerContext())
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_5F : int
        stack_B1_0 : int [generated]
        stack_B4_0 : int [generated]
        stack_1AD_0 : int [generated]
        stack_1B0_0 : int [generated]
        stack_1B3_0 : int [generated]
        stack_310_0 : int [generated]
        stack_313_0 : int [generated]
        stack_316_0 : int [generated]
        stack_489_0 : int [generated]
        stack_48C_0 : int [generated]
        stack_48F_0 : int [generated]
        var_2_69 : byte[]
        stack_CB_0 : byte[] [generated]
        stack_157_0 : byte[] [generated]
        stack_159_0 : byte[] [generated]
        stack_1F0_0 : byte[] [generated]
        stack_2C8_0 : byte[] [generated]
        stack_2CA_0 : byte[] [generated]
        stack_365_0 : byte[] [generated]
        stack_441_0 : byte[] [generated]
        stack_443_0 : byte[] [generated]
        stack_4DE_0 : byte[] [generated]
        stack_599_0 : byte[] [generated]
        var_0_1AB : int
        var_4_1B3 : int
        expr_1F0 : byte [generated]
        var_3_1B2 : byte[]
        var_0_35B : int
        expr_365 : byte [generated]
        stack_3A3_2 : byte [generated]
        var_5_1AD : int
        stack_386_0 : byte [generated]
        var_0_AF : int
        var_3_B3 : byte[]
        var_4_B4 : int
        var_0_AE4 : int
        var_3_5A5 : String
        expr_5AD : String[] [generated]
        expr_5B7 : String[] [generated]
        var_3_5F7 : String[]
        stack_699_0 : Class<ByteToMessageDecoder> [generated]
        stack_699_1 : String [generated]
        expr_675 : Class[] [generated]
        var_6 : Throwable
        stack_83C_0 : Class<MessageToByteEncoder> [generated]
        stack_83C_1 : String [generated]
        expr_818 : Class[] [generated]
        stack_9F1_0 : Class<MessageToMessageDecoder> [generated]
        stack_9F1_1 : String [generated]
        expr_9CD : Class[] [generated]
        
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
        var_0_5F = and:int(ldc:int(2115086723), ldc:int(2099817543))
        
        if (cmpne:boolean(stack_B1_0 = stack_B4_0 = stack_1AD_0 = stack_1B0_0 = stack_1B3_0 = stack_310_0 = stack_313_0 = stack_316_0 = stack_489_0 = stack_48C_0 = stack_48F_0 = add:int(arraylength:int(var_2_69 = stack_CB_0 = stack_157_0 = stack_159_0 = stack_1F0_0 = stack_2C8_0 = stack_2CA_0 = stack_365_0 = stack_441_0 = stack_443_0 = stack_4DE_0 = stack_599_0 = invokevirtual:byte[](Decoder::decode, invokestatic:Decoder(Base64::getDecoder), ldc:String("AhX58gIAC+oZ8gIaAA=="))), ldc:int(-1)), ldc:int(0))) {
            goto(Label_0114)
        }
        
        goto(Label_0271)
        Label_0437:
        
        while (cmpeq:boolean(and:int(var_0_1AB:int, ldc:int(524288)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_1AB:int, ldc:int(536870912)), ldc:int(0))) {
                goto(Label_1169)
            }
            
            if (cmpeq:boolean(and:int(var_0_1AB:int, ldc:int(2147483647)), ldc:int(0))) {
                var_0_1AB = and:int(var_0_1AB:int, ldc:int(-1171010233))
                goto(Label_0937)
            }
            
            if (cmpeq:boolean(and:int(var_0_1AB:int, ldc:int(134217728)), ldc:int(0))) {
                goto(Label_0792)
            }
            
            if (cmpne:boolean(and:int(var_0_1AB:int, ldc:int(2097152)), ldc:int(0))) {
                goto(Label_0533)
            }
            
            var_0_1AB = and:int(var_0_1AB:int, ldc:int(1847501511))
            var_4_1B3 = add:int(var_4_1B3:int, ldc:int(-1))
            expr_1F0 = loadelement:byte(stack_1F0_0:byte[], var_4_1B3:int)
            storeelement:byte(var_3_1B2:byte[], var_4_1B3:int, or:int[expected:byte](and:int(shl:int(expr_1F0:byte[expected:int], and:int(ldc:int(8469), ldc:int(23212))), ldc:int(-16)), and:int(shr:int(expr_1F0:byte[expected:int], and:int(ldc:int(17284), ldc:int(12350))), ldc:int(15))))
            
            if (cmpeq:boolean(var_4_1B3:int, ldc:int(0))) {
                goto(Label_0533)
            }
        }
        
        goto(Label_1264)
        Label_0792:
        
        while (cmpne:boolean(and:int(var_0_1AB:int, ldc:int(2147483647)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_1AB:int, ldc:int(134217728)), ldc:int(0))) {
                goto(Label_1169)
            }
            
            if (cmpeq:boolean(and:int(var_0_1AB:int, ldc:int(32768)), ldc:int(0))) {
                var_0_1AB = and:int(var_0_1AB:int, ldc:int(-608115370))
                goto(Label_0937)
            }
            
            if (cmpeq:boolean(and:int(var_0_1AB:int, ldc:int(2147483647)), ldc:int(0))) {
                var_0_1AB = and:int(var_0_1AB:int, ldc:int(1089099157))
                goto(Label_0533)
            }
            
            if (cmpeq:boolean(and:int(var_0_1AB:int, ldc:int(32768)), ldc:int(0))) {
                var_0_1AB = and:int(var_0_1AB:int, ldc:int(-1231401032))
                goto(Label_0437)
            }
            
            var_0_35B = and:int(var_0_1AB:int, ldc:int(2125254595))
            var_4_1B3 = add:int(var_4_1B3:int, ldc:int(-1))
            expr_365 = stack_3A3_2 = loadelement(stack_365_0, var_4_1B3)
            
            if (cmpge:boolean(add:int(add:int(var_4_1B3:int, ldc:int(1)), neg:int(var_5_1AD:int)), ldc:int(0))) {
                stack_3A3_2 = stack_386_0 = add:byte(expr_365:byte, ldc:byte(1))
                goto(Label_0913)
            }
            
            Label_0882:
            
            if (cmpeq:boolean(and:int(var_0_35B:int, ldc:int(32)), ldc:int(0))) {
                var_0_35B = and:int(var_0_35B:int, ldc:int(-289814241))
                stack_3A3_2 = stack_386_0 = add:byte(expr_365:byte, loadelement:byte(var_3_1B2:byte[], add:int(var_4_1B3:int, ldc:int(1))))
            }
            
            Label_0913:
            
            if (cmpeq:boolean(and:int(var_0_35B:int, ldc:int(67108864)), ldc:int(0))) {
                goto(Label_0882)
            }
            
            var_0_1AB = and:int(var_0_35B:int, ldc:int(-38609513))
            storeelement:byte(var_3_1B2:byte[], var_4_1B3:int, stack_3A3_2:byte)
            
            if (cmpeq:boolean(var_4_1B3:int, ldc:int(0))) {
                goto(Label_0937)
            }
        }
        
        goto(Label_1264)
        Label_1169:
        
        while (cmpne:boolean(and:int(var_0_1AB:int, ldc:int(1)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_1AB:int, ldc:int(32768)), ldc:int(0))) {
                goto(Label_0937)
            }
            
            if (cmpne:boolean(and:int(var_0_1AB:int, ldc:int(524288)), ldc:int(0))) {
                var_0_1AB = and:int(var_0_1AB:int, ldc:int(1720664902))
                goto(Label_0792)
            }
            
            if (cmpne:boolean(and:int(var_0_1AB:int, ldc:int(2097152)), ldc:int(0))) {
                var_0_1AB = and:int(var_0_1AB:int, ldc:int(-668636929))
                goto(Label_0533)
            }
            
            if (cmpne:boolean(and:int(var_0_1AB:int, ldc:int(32)), ldc:int(0))) {
                goto(Label_0437)
            }
            
            var_0_1AB = and:int(var_0_1AB:int, ldc:int(1818135115))
            var_4_1B3 = add:int(var_4_1B3:int, ldc:int(-1))
            storeelement:byte(var_3_1B2:byte[], var_4_1B3:int, xor:byte(add:byte(loadelement:byte(stack_4DE_0:byte[], var_4_1B3:int), ldc:byte(82)), ldc:byte(5)))
            
            if (cmpeq:boolean(var_4_1B3:int, ldc:int(0))) {
                goto(Label_1264)
            }
        }
        
        var_0_1AB = and:int(var_0_1AB:int, ldc:int(12840919))
        goto(Label_1264)
        Label_0114:
        
        if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(1)), ldc:int(0))) {
            goto(Label_1341)
        }
        
        if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(32)), ldc:int(0))) {
            goto(Label_1096)
        }
        
        if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(16777216)), ldc:int(0))) {
            goto(Label_0996)
        }
        
        if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(16777216)), ldc:int(0))) {
            goto(Label_0719)
        }
        
        if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(8)), ldc:int(0))) {
            goto(Label_0601)
        }
        
        if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(134217728)), ldc:int(0))) {
            var_0_5F = and:int(var_0_5F:int, ldc:int(-1139820485))
            goto(Label_0350)
        }
        
        if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(16384)), ldc:int(0))) {
            var_0_AF = and:int(var_0_5F:int, ldc:int(1818010855))
            var_3_B3 = newarray:byte[](byte.class, stack_B1_0:int)
            var_4_B4 = stack_B4_0:int
            
            loop {
                if (cmpeq:boolean(and:int(var_0_AF:int, ldc:int(16384)), ldc:int(0))) {
                    var_0_AF = and:int(var_0_AF:int, ldc:int(-281940645))
                    var_4_B4 = add:int(var_4_B4:int, ldc:int(-1))
                    storeelement:byte(var_3_B3:byte[], var_4_B4:int, add:int(shl:int(loadelement:byte(stack_CB_0:byte[], var_4_B4:int), ldc:int(3)), and:int(shr:int(loadelement:byte(var_2_69:byte[], add:int(var_4_B4:int, and:int(ldc:int(7105), ldc:int(3)))), ldc:int(5)), and:int(ldc:int(18439), ldc:int(1551)))))
                    
                    if (cmpne:boolean(var_4_B4:int, ldc:int(0))) {
                        loopcontinue()
                    }
                }
                
                if (cmpne:boolean(and:int(var_0_AF:int, ldc:int(2147483647)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_0_AF = and:int(var_0_AF:int, ldc:int(-614360656))
            }
            
            var_0_5F = and:int(var_0_AF:int, ldc:int(-287922785))
            stack_157_0 = stack_CB_0 = stack_159_0 = stack_1F0_0 = stack_2C8_0 = stack_2CA_0 = stack_365_0 = stack_441_0 = stack_443_0 = stack_4DE_0 = stack_599_0 = var_3_B3:byte[]
            stack_B4_0 = stack_B1_0 = stack_1AD_0 = stack_1B0_0 = stack_1B3_0 = stack_310_0 = stack_313_0 = stack_316_0 = stack_489_0 = stack_48C_0 = stack_48F_0 = and:int(ldc:int(13485), ldc:int(-29936))
        }
        
        Label_0271:
        
        if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(16)), ldc:int(0))) {
            goto(Label_1341)
        }
        
        if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(1073741824)), ldc:int(0))) {
            var_0_5F = and:int(var_0_5F:int, ldc:int(83572317))
            goto(Label_1096)
        }
        
        if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(1073741824)), ldc:int(0))) {
            goto(Label_0996)
        }
        
        if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(1)), ldc:int(0))) {
            var_0_5F = and:int(var_0_5F:int, ldc:int(-619892955))
            goto(Label_0719)
        }
        
        if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(2097152)), ldc:int(0))) {
            goto(Label_0601)
        }
        
        if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(32768)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(2)), ldc:int(0))) {
                goto(Label_0114)
            }
            
            var_0_5F = and:int(var_0_5F:int, ldc:int(2124589519))
            var_2_69 = stack_157_0:byte[]
            
            if (cmpeq:boolean(stack_B1_0 = stack_B4_0 = stack_1AD_0 = stack_1B0_0 = stack_1B3_0 = stack_310_0 = stack_313_0 = stack_316_0 = stack_489_0 = stack_48C_0 = stack_48F_0 = arraylength:int(stack_159_0:byte[]), ldc:int(0))) {
                goto(Label_0601)
            }
        }
        
        Label_0350:
        
        if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(2147483647)), ldc:int(0))) {
            var_0_5F = and:int(var_0_5F:int, ldc:int(766457793))
            goto(Label_1341)
        }
        
        if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(134217728)), ldc:int(0))) {
            goto(Label_1096)
        }
        
        if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(67108864)), ldc:int(0))) {
            goto(Label_0996)
        }
        
        if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(134217728)), ldc:int(0))) {
            goto(Label_0719)
        }
        
        if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(8)), ldc:int(0))) {
            var_0_5F = and:int(var_0_5F:int, ldc:int(-1194003906))
            goto(Label_0601)
        }
        
        if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(8)), ldc:int(0))) {
            var_0_5F = and:int(var_0_5F:int, ldc:int(-1771599308))
            goto(Label_0271)
        }
        
        if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(16777216)), ldc:int(0))) {
            var_0_1AB = and:int(var_0_5F:int, ldc:int(-305605253))
            var_5_1AD = stack_1AD_0:int
            var_3_1B2 = newarray:byte[](byte.class, stack_1B0_0:int)
            var_4_1B3 = stack_1B3_0:int
            goto(Label_0437)
        }
        
        goto(Label_0114)
        Label_0533:
        
        if (cmpeq:boolean(and:int(var_0_1AB:int, ldc:int(1073741824)), ldc:int(0))) {
            var_0_1AB = and:int(var_0_1AB:int, ldc:int(-311067156))
            goto(Label_1264)
        }
        
        if (cmpne:boolean(and:int(var_0_1AB:int, ldc:int(32)), ldc:int(0))) {
            goto(Label_1169)
        }
        
        if (cmpne:boolean(and:int(var_0_1AB:int, ldc:int(8)), ldc:int(0))) {
            goto(Label_0937)
        }
        
        if (cmpne:boolean(and:int(var_0_1AB:int, ldc:int(16777216)), ldc:int(0))) {
            goto(Label_0792)
        }
        
        if (cmpne:boolean(and:int(var_0_1AB:int, ldc:int(524288)), ldc:int(0))) {
            var_0_1AB = and:int(var_0_1AB:int, ldc:int(1627537040))
            goto(Label_0437)
        }
        
        var_0_5F = and:int(var_0_1AB:int, ldc:int(2110162171))
        stack_157_0 = stack_CB_0 = stack_159_0 = stack_1F0_0 = stack_2C8_0 = stack_2CA_0 = stack_365_0 = stack_441_0 = stack_443_0 = stack_4DE_0 = stack_599_0 = var_3_1B2:byte[]
        stack_B4_0 = stack_B1_0 = stack_1AD_0 = stack_1B0_0 = stack_1B3_0 = stack_310_0 = stack_313_0 = stack_316_0 = stack_489_0 = stack_48C_0 = stack_48F_0 = and:int(ldc:int(-17682), ldc:int(17681))
        Label_0601:
        
        if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(16)), ldc:int(0))) {
            var_0_5F = and:int(var_0_5F:int, ldc:int(1536589980))
            goto(Label_1341)
        }
        
        if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(536870912)), ldc:int(0))) {
            var_0_5F = and:int(var_0_5F:int, ldc:int(453167235))
            goto(Label_1096)
        }
        
        if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(524288)), ldc:int(0))) {
            var_0_5F = and:int(var_0_5F:int, ldc:int(1970376397))
            goto(Label_0996)
        }
        
        if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(67108864)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(16384)), ldc:int(0))) {
                var_0_5F = and:int(var_0_5F:int, ldc:int(2005906521))
                goto(Label_0350)
            }
            
            if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(1073741824)), ldc:int(0))) {
                var_0_5F = and:int(var_0_5F:int, ldc:int(-834402267))
                goto(Label_0271)
            }
            
            if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(524288)), ldc:int(0))) {
                var_0_5F = and:int(var_0_5F:int, ldc:int(-594795039))
                goto(Label_0114)
            }
            
            var_0_5F = and:int(var_0_5F:int, ldc:int(-270619433))
            var_2_69 = stack_2C8_0:byte[]
            
            if (cmpeq:boolean(stack_B1_0 = stack_B4_0 = stack_1AD_0 = stack_1B0_0 = stack_1B3_0 = stack_310_0 = stack_313_0 = stack_316_0 = stack_489_0 = stack_48C_0 = stack_48F_0 = arraylength:int(stack_2CA_0:byte[]), ldc:int(0))) {
                goto(Label_0996)
            }
        }
        
        Label_0719:
        
        if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(1073741824)), ldc:int(0))) {
            var_0_5F = and:int(var_0_5F:int, ldc:int(1116850809))
            goto(Label_1341)
        }
        
        if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(8)), ldc:int(0))) {
            goto(Label_1096)
        }
        
        if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(32768)), ldc:int(0))) {
            goto(Label_0996)
        }
        
        if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(2097152)), ldc:int(0))) {
            goto(Label_0601)
        }
        
        if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(8)), ldc:int(0))) {
            goto(Label_0350)
        }
        
        if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(2097152)), ldc:int(0))) {
            goto(Label_0271)
        }
        
        if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(8)), ldc:int(0))) {
            var_0_1AB = and:int(var_0_5F:int, ldc:int(-290678577))
            var_5_1AD = stack_310_0:int
            var_3_1B2 = newarray:byte[](byte.class, stack_313_0:int)
            var_4_1B3 = stack_316_0:int
            goto(Label_0792)
        }
        
        goto(Label_0114)
        Label_0937:
        
        if (cmpeq:boolean(and:int(var_0_1AB:int, ldc:int(2147483647)), ldc:int(0))) {
            goto(Label_1264)
        }
        
        if (cmpne:boolean(and:int(var_0_1AB:int, ldc:int(16777216)), ldc:int(0))) {
            goto(Label_1169)
        }
        
        if (cmpeq:boolean(and:int(var_0_1AB:int, ldc:int(1)), ldc:int(0))) {
            goto(Label_0792)
        }
        
        if (cmpeq:boolean(and:int(var_0_1AB:int, ldc:int(1)), ldc:int(0))) {
            var_0_1AB = and:int(var_0_1AB:int, ldc:int(1169776981))
            goto(Label_0533)
        }
        
        if (cmpne:boolean(and:int(var_0_1AB:int, ldc:int(16777216)), ldc:int(0))) {
            goto(Label_0437)
        }
        
        var_0_5F = and:int(var_0_1AB:int, ldc:int(-59782445))
        stack_157_0 = stack_CB_0 = stack_159_0 = stack_1F0_0 = stack_2C8_0 = stack_2CA_0 = stack_365_0 = stack_441_0 = stack_443_0 = stack_4DE_0 = stack_599_0 = var_3_1B2:byte[]
        stack_B4_0 = stack_B1_0 = stack_1AD_0 = stack_1B0_0 = stack_1B3_0 = stack_310_0 = stack_313_0 = stack_316_0 = stack_489_0 = stack_48C_0 = stack_48F_0 = and:int(ldc:int(-15591), ldc:int(6310))
        Label_0996:
        
        if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(32)), ldc:int(0))) {
            var_0_5F = and:int(var_0_5F:int, ldc:int(-876032691))
            goto(Label_1341)
        }
        
        if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(16777216)), ldc:int(0))) {
            var_0_5F = and:int(var_0_5F:int, ldc:int(-525678307))
        }
        else {
            if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(32)), ldc:int(0))) {
                goto(Label_0719)
            }
            
            if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(16384)), ldc:int(0))) {
                var_0_5F = and:int(var_0_5F:int, ldc:int(-490374036))
                goto(Label_0601)
            }
            
            if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(8)), ldc:int(0))) {
                var_0_5F = and:int(var_0_5F:int, ldc:int(1935169328))
                goto(Label_0350)
            }
            
            if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(1073741824)), ldc:int(0))) {
                goto(Label_0271)
            }
            
            if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(16384)), ldc:int(0))) {
                goto(Label_0114)
            }
            
            var_0_5F = and:int(var_0_5F:int, ldc:int(1866043895))
            var_2_69 = stack_441_0:byte[]
            
            if (cmpeq:boolean(stack_B1_0 = stack_B4_0 = stack_1AD_0 = stack_1B0_0 = stack_1B3_0 = stack_310_0 = stack_313_0 = stack_316_0 = stack_489_0 = stack_48C_0 = stack_48F_0 = arraylength:int(stack_443_0:byte[]), ldc:int(0))) {
                goto(Label_1341)
            }
        }
        
        Label_1096:
        
        if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(2097152)), ldc:int(0))) {
            var_0_5F = and:int(var_0_5F:int, ldc:int(-1254192018))
            goto(Label_1341)
        }
        
        if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(2147483647)), ldc:int(0))) {
            goto(Label_0996)
        }
        
        if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(32768)), ldc:int(0))) {
            goto(Label_0719)
        }
        
        if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(1073741824)), ldc:int(0))) {
            goto(Label_0601)
        }
        
        if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(1)), ldc:int(0))) {
            goto(Label_0350)
        }
        
        if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(2147483647)), ldc:int(0))) {
            goto(Label_0271)
        }
        
        if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(32)), ldc:int(0))) {
            var_0_1AB = and:int(var_0_5F:int, ldc:int(-285436993))
            var_5_1AD = stack_489_0:int
            var_3_1B2 = newarray:byte[](byte.class, stack_48C_0:int)
            var_4_1B3 = stack_48F_0:int
            goto(Label_1169)
        }
        
        goto(Label_0114)
        Label_1264:
        
        if (cmpne:boolean(and:int(var_0_1AB:int, ldc:int(524288)), ldc:int(0))) {
            var_0_1AB = and:int(var_0_1AB:int, ldc:int(1727306832))
            goto(Label_1169)
        }
        
        if (cmpne:boolean(and:int(var_0_1AB:int, ldc:int(524288)), ldc:int(0))) {
            var_0_1AB = and:int(var_0_1AB:int, ldc:int(709094044))
            goto(Label_0937)
        }
        
        if (cmpeq:boolean(and:int(var_0_1AB:int, ldc:int(67108864)), ldc:int(0))) {
            goto(Label_0792)
        }
        
        if (cmpne:boolean(and:int(var_0_1AB:int, ldc:int(2097152)), ldc:int(0))) {
            var_0_1AB = and:int(var_0_1AB:int, ldc:int(-1657314845))
            goto(Label_0533)
        }
        
        if (cmpne:boolean(and:int(var_0_1AB:int, ldc:int(524288)), ldc:int(0))) {
            goto(Label_0437)
        }
        
        var_0_5F = and:int(var_0_1AB:int, ldc:int(-27288873))
        stack_157_0 = stack_CB_0 = stack_159_0 = stack_1F0_0 = stack_2C8_0 = stack_2CA_0 = stack_365_0 = stack_441_0 = stack_443_0 = stack_4DE_0 = stack_599_0 = var_3_1B2:byte[]
        stack_B4_0 = stack_B1_0 = stack_1AD_0 = stack_1B0_0 = stack_1B3_0 = stack_310_0 = stack_313_0 = stack_316_0 = stack_489_0 = stack_48C_0 = stack_48F_0 = and:int(ldc:int(-5664), ldc:int(1567))
        Label_1341:
        
        if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(67108864)), ldc:int(0))) {
            var_0_5F = and:int(var_0_5F:int, ldc:int(1493685507))
            goto(Label_1096)
        }
        
        if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(16384)), ldc:int(0))) {
            goto(Label_0996)
        }
        
        if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(16777216)), ldc:int(0))) {
            var_0_5F = and:int(var_0_5F:int, ldc:int(-28147300))
            goto(Label_0719)
        }
        
        if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(2)), ldc:int(0))) {
            var_0_5F = and:int(var_0_5F:int, ldc:int(-496312660))
            goto(Label_0601)
        }
        
        if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(134217728)), ldc:int(0))) {
            goto(Label_0350)
        }
        
        if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(2147483647)), ldc:int(0))) {
            var_0_5F = and:int(var_0_5F:int, ldc:int(889211256))
            goto(Label_0271)
        }
        
        if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(16384)), ldc:int(0))) {
            var_0_AE4 = and:int(var_0_5F:int, ldc:int(2106259843))
            var_3_5A5 = initobject:String(String::<init>, stack_599_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            expr_5AD = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(9217), ldc:int(9219)))
            expr_5B7 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(5441), ldc:int(5443)))
            storeelement:String(expr_5AD:String[], and:int(ldc:int(-30129), ldc:int(29104)), invokevirtual:String[expected:String](String::substring, var_3_5A5:String, and:int(ldc:int(-16838), ldc:int(16837)), xor:int(ldc:int(-24539), ldc:int(-24541))))
            storeelement:String(expr_5AD:String[], and:int(ldc:int(12329), ldc:int(1)), invokevirtual:String[expected:String](String::substring, var_3_5A5:String, and:int(ldc:int(1286), ldc:int(2726)), xor:int(ldc:int(18), ldc:int(30))))
            putstatic:String[](\u983f\u40a9\u6d69\uceb8\u1187\ub8be::\u0800\ufcaf\u3776\u5140\u3e75\ube23, expr_5B7:String[])
            var_3_5F7 = expr_5AD:String[]
            
            loop {
                try {
                    Label_1528:
                    
                    while (cmpeq:boolean(and:int(var_0_AE4:int, ldc:int(32)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_0_AE4:int, ldc:int(134217728)), ldc:int(0))) {
                            var_0_AE4 = and:int(var_0_AE4:int, ldc:int(-1617088239))
                            goto(Label_2551)
                        }
                        
                        if (cmpeq:boolean(and:int(var_0_AE4:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_2375)
                        }
                        
                        if (cmpeq:boolean(and:int(var_0_AE4:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_0_AE4 = and:int(var_0_AE4:int, ldc:int(-1892992954))
                            goto(Label_2225)
                        }
                        
                        if (cmpne:boolean(and:int(var_0_AE4:int, ldc:int(16384)), ldc:int(0))) {
                            var_0_AE4 = and:int(var_0_AE4:int, ldc:int(-1782120321))
                            goto(Label_2114)
                        }
                        
                        if (cmpne:boolean(and:int(var_0_AE4:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_1956)
                        }
                        
                        if (cmpeq:boolean(and:int(var_0_AE4:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_1815)
                        }
                        
                        if (cmpne:boolean(and:int(var_0_AE4:int, ldc:int(16777216)), ldc:int(0))) {
                            var_0_AE4 = and:int(var_0_AE4:int, ldc:int(-1807986487))
                        }
                        else {
                            var_0_AE4 = and:int(var_0_AE4:int, ldc:int(-319974141))
                            stack_699_0 = ldc:Class<ByteToMessageDecoder>(io.netty.handler.codec.ByteToMessageDecoder.class)
                            stack_699_1 = loadelement:String(var_3_5F7:String[], and:int(ldc:int(-2163), ldc:int(2162)))
                            expr_675 = newarray:Class[](java.lang.Class.class, and:int(ldc:int(4099), ldc:int(9979)))
                            storeelement:Class(expr_675:Class[], and:int(ldc:int(-15958), ldc:int(5713)), ldc:Class<ChannelHandlerContext>(io.netty.channel.ChannelHandlerContext.class))
                            storeelement:Class(expr_675:Class[], xor:int(ldc:int(-24542), ldc:int(-24541)), ldc:Class<ByteBuf>(io.netty.buffer.ByteBuf.class))
                            storeelement:Class(expr_675:Class[], and:int(ldc:int(4618), ldc:int(8226)), ldc:Class<List>(java.util.List.class))
                            putstatic:Method(\u983f\u40a9\u6d69\uceb8\u1187\ub8be::\u51b2\u97e6\u8753\u516c\uff55\uc3e3, invokevirtual:Method(Class::getDeclaredMethod, stack_699_0:Class, stack_699_1:String, expr_675:Class[]))
                        }
                        
                        Label_1695:
                        
                        if (cmpeq:boolean(and:int(var_0_AE4:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_2635)
                        }
                        
                        if (cmpeq:boolean(and:int(var_0_AE4:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_0_AE4 = and:int(var_0_AE4:int, ldc:int(-1204800715))
                            goto(Label_2551)
                        }
                        
                        if (cmpeq:boolean(and:int(var_0_AE4:int, ldc:int(1)), ldc:int(0))) {
                            var_0_AE4 = and:int(var_0_AE4:int, ldc:int(959100183))
                            goto(Label_2375)
                        }
                        
                        if (cmpeq:boolean(and:int(var_0_AE4:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_0_AE4 = and:int(var_0_AE4:int, ldc:int(911693481))
                            goto(Label_2225)
                        }
                        
                        if (cmpne:boolean(and:int(var_0_AE4:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_2114)
                        }
                        
                        if (cmpeq:boolean(and:int(var_0_AE4:int, ldc:int(32768)), ldc:int(0))) {
                            var_0_AE4 = and:int(var_0_AE4:int, ldc:int(460509386))
                            goto(Label_1956)
                        }
                        
                        if (cmpne:boolean(and:int(var_0_AE4:int, ldc:int(16)), ldc:int(0))) {
                            var_0_AE4 = and:int(var_0_AE4:int, ldc:int(780113686))
                        }
                        else {
                            if (cmpne:boolean(and:int(var_0_AE4:int, ldc:int(2097152)), ldc:int(0))) {
                                loopcontinue()
                            }
                            
                            var_0_AE4 = and:int(var_0_AE4:int, ldc:int(-270877421))
                            invokevirtual:void(AccessibleObject::setAccessible, getstatic:Method[expected:AccessibleObject](\u983f\u40a9\u6d69\uceb8\u1187\ub8be::\u51b2\u97e6\u8753\u516c\uff55\uc3e3), xor:int[expected:boolean](ldc:int(-31608), ldc:int(-31607)))
                        }
                        
                        Label_1815:
                        
                        if (cmpeq:boolean(and:int(var_0_AE4:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_2635)
                        }
                        
                        if (cmpeq:boolean(and:int(var_0_AE4:int, ldc:int(2)), ldc:int(0))) {
                            var_0_AE4 = and:int(var_0_AE4:int, ldc:int(-1254738233))
                            goto(Label_2551)
                        }
                        
                        if (cmpeq:boolean(and:int(var_0_AE4:int, ldc:int(536870912)), ldc:int(0))) {
                            var_0_AE4 = and:int(var_0_AE4:int, ldc:int(1766519911))
                            goto(Label_2375)
                        }
                        
                        if (cmpeq:boolean(and:int(var_0_AE4:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_0_AE4 = and:int(var_0_AE4:int, ldc:int(121044485))
                            goto(Label_2225)
                        }
                        
                        if (cmpne:boolean(and:int(var_0_AE4:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_2114)
                        }
                        
                        if (cmpeq:boolean(and:int(var_0_AE4:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_1956)
                        }
                        
                        if (cmpeq:boolean(and:int(var_0_AE4:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_1695)
                        }
                        
                        if (cmpne:boolean(and:int(var_0_AE4:int, ldc:int(32768)), ldc:int(0))) {
                            var_0_AE4 = and:int(var_0_AE4:int, ldc:int(-273632989))
                            goto(Label_1956)
                        }
                        
                        var_0_AE4 = and:int(var_0_AE4:int, ldc:int(-1311499359))
                    }
                    
                    var_0_AE4 = and:int(var_0_AE4:int, ldc:int(536481386))
                    goto(Label_2635)
                }
                catch (java.lang.NoSuchMethodException stack_780_0) {
                }
                
                Label_1922:
                
                if (cmpeq:boolean(and:int(var_0_AE4:int, ldc:int(67108864)), ldc:int(0))) {
                    goto(Label_2751)
                }
                
                if (cmpne:boolean(and:int(var_0_AE4:int, ldc:int(16)), ldc:int(0))) {
                    var_0_AE4 = and:int(var_0_AE4:int, ldc:int(-253431219))
                    goto(Label_2341)
                }
                
                var_0_AE4 = and:int(var_0_AE4:int, ldc:int(-26506317))
                invokevirtual:void(Throwable::printStackTrace, var_6:Throwable)
                
                try {
                    Label_1956:
                    
                    while (cmpne:boolean(and:int(var_0_AE4:int, ldc:int(32768)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_0_AE4:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_2551)
                        }
                        
                        if (cmpne:boolean(and:int(var_0_AE4:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_2375)
                        }
                        
                        if (cmpne:boolean(and:int(var_0_AE4:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_2225)
                        }
                        
                        if (cmpeq:boolean(and:int(var_0_AE4:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_0_AE4 = and:int(var_0_AE4:int, ldc:int(759727403))
                        }
                        else {
                            if (cmpeq:boolean(and:int(var_0_AE4:int, ldc:int(134217728)), ldc:int(0))) {
                                goto(Label_1815)
                            }
                            
                            if (cmpne:boolean(and:int(var_0_AE4:int, ldc:int(16)), ldc:int(0))) {
                                var_0_AE4 = and:int(var_0_AE4:int, ldc:int(749511159))
                                goto(Label_1695)
                            }
                            
                            if (cmpne:boolean(and:int(var_0_AE4:int, ldc:int(32)), ldc:int(0))) {
                                var_0_AE4 = and:int(var_0_AE4:int, ldc:int(-1642268564))
                                loopcontinue(Label_1528)
                            }
                            
                            var_0_AE4 = and:int(var_0_AE4:int, ldc:int(-301408825))
                            stack_83C_0 = ldc:Class<MessageToByteEncoder>(io.netty.handler.codec.MessageToByteEncoder.class)
                            stack_83C_1 = loadelement:String(var_3_5F7:String[], xor:int(ldc:int(18432), ldc:int(18433)))
                            expr_818 = newarray:Class[](java.lang.Class.class, xor:int(ldc:int(1345), ldc:int(1346)))
                            storeelement:Class(expr_818:Class[], and:int(ldc:int(-26177), ldc:int(26176)), ldc:Class<ChannelHandlerContext>(io.netty.channel.ChannelHandlerContext.class))
                            storeelement:Class(expr_818:Class[], xor:int(ldc:int(16660), ldc:int(16661)), ldc:Class<Object>(java.lang.Object.class))
                            storeelement:Class(expr_818:Class[], and:int(ldc:int(6195), ldc:int(194)), ldc:Class<ByteBuf>(io.netty.buffer.ByteBuf.class))
                            putstatic:Method(\u983f\u40a9\u6d69\uceb8\u1187\ub8be::\ud36e\u7af6\u92ee\ub102\ua562\u2dcc, invokevirtual:Method(Class::getDeclaredMethod, stack_83C_0:Class, stack_83C_1:String, expr_818:Class[]))
                        }
                        
                        Label_2114:
                        
                        if (cmpeq:boolean(and:int(var_0_AE4:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_0_AE4 = and:int(var_0_AE4:int, ldc:int(1409336638))
                            goto(Label_2635)
                        }
                        
                        if (cmpne:boolean(and:int(var_0_AE4:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_2551)
                        }
                        
                        if (cmpne:boolean(and:int(var_0_AE4:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_2375)
                        }
                        
                        if (cmpeq:boolean(and:int(var_0_AE4:int, ldc:int(67108864)), ldc:int(0))) {
                            var_0_AE4 = and:int(var_0_AE4:int, ldc:int(1910601021))
                        }
                        else {
                            if (cmpne:boolean(and:int(var_0_AE4:int, ldc:int(32)), ldc:int(0))) {
                                var_0_AE4 = and:int(var_0_AE4:int, ldc:int(-2023668350))
                                loopcontinue()
                            }
                            
                            if (cmpne:boolean(and:int(var_0_AE4:int, ldc:int(16384)), ldc:int(0))) {
                                goto(Label_1815)
                            }
                            
                            if (cmpeq:boolean(and:int(var_0_AE4:int, ldc:int(2147483647)), ldc:int(0))) {
                                goto(Label_1695)
                            }
                            
                            if (cmpeq:boolean(and:int(var_0_AE4:int, ldc:int(2)), ldc:int(0))) {
                                var_0_AE4 = and:int(var_0_AE4:int, ldc:int(-465745984))
                                loopcontinue(Label_1528)
                            }
                            
                            var_0_AE4 = and:int(var_0_AE4:int, ldc:int(1842267379))
                            invokevirtual:void(AccessibleObject::setAccessible, getstatic:Method[expected:AccessibleObject](\u983f\u40a9\u6d69\uceb8\u1187\ub8be::\ud36e\u7af6\u92ee\ub102\ua562\u2dcc), and:int[expected:boolean](ldc:int(16899), ldc:int(1093)))
                        }
                        
                        Label_2225:
                        
                        if (cmpeq:boolean(and:int(var_0_AE4:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_2635)
                        }
                        
                        if (cmpeq:boolean(and:int(var_0_AE4:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_0_AE4 = and:int(var_0_AE4:int, ldc:int(863254690))
                            goto(Label_2551)
                        }
                        
                        if (cmpeq:boolean(and:int(var_0_AE4:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_2375)
                        }
                        
                        if (cmpne:boolean(and:int(var_0_AE4:int, ldc:int(2097152)), ldc:int(0))) {
                            var_0_AE4 = and:int(var_0_AE4:int, ldc:int(-1390097838))
                            goto(Label_2114)
                        }
                        
                        if (cmpeq:boolean(and:int(var_0_AE4:int, ldc:int(134217728)), ldc:int(0))) {
                            var_0_AE4 = and:int(var_0_AE4:int, ldc:int(-1577555118))
                        }
                        else {
                            if (cmpeq:boolean(and:int(var_0_AE4:int, ldc:int(2)), ldc:int(0))) {
                                var_0_AE4 = and:int(var_0_AE4:int, ldc:int(1767774499))
                                goto(Label_1815)
                            }
                            
                            if (cmpeq:boolean(and:int(var_0_AE4:int, ldc:int(2147483647)), ldc:int(0))) {
                                goto(Label_1695)
                            }
                            
                            if (cmpeq:boolean(and:int(var_0_AE4:int, ldc:int(1)), ldc:int(0))) {
                                var_0_AE4 = and:int(var_0_AE4:int, ldc:int(707476892))
                                loopcontinue(Label_1528)
                            }
                            
                            var_0_AE4 = and:int(var_0_AE4:int, ldc:int(2127343099))
                            goto(Label_2375)
                        }
                    }
                    
                    var_0_AE4 = and:int(var_0_AE4:int, ldc:int(1993288886))
                    goto(Label_2635)
                }
                catch (java.lang.NoSuchMethodException stack_923_0) {
                }
                
                Label_2341:
                
                if (cmpeq:boolean(and:int(var_0_AE4:int, ldc:int(1)), ldc:int(0))) {
                    var_0_AE4 = and:int(var_0_AE4:int, ldc:int(-1615837713))
                    goto(Label_2751)
                }
                
                if (cmpeq:boolean(and:int(var_0_AE4:int, ldc:int(67108864)), ldc:int(0))) {
                    goto(Label_1922)
                }
                
                var_0_AE4 = and:int(var_0_AE4:int, ldc:int(2106182499))
                invokevirtual:void(NoSuchMethodException::printStackTrace, var_6:Throwable)
                
                try {
                    loop {
                        Label_2375:
                        
                        if (cmpne:boolean(and:int(var_0_AE4:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_2635)
                        }
                        
                        if (cmpeq:boolean(and:int(var_0_AE4:int, ldc:int(536870912)), ldc:int(0))) {
                            var_0_AE4 = and:int(var_0_AE4:int, ldc:int(-741923031))
                        }
                        else {
                            if (cmpeq:boolean(and:int(var_0_AE4:int, ldc:int(536870912)), ldc:int(0))) {
                                var_0_AE4 = and:int(var_0_AE4:int, ldc:int(-1341554183))
                                goto(Label_2225)
                            }
                            
                            if (cmpne:boolean(and:int(var_0_AE4:int, ldc:int(8)), ldc:int(0))) {
                                var_0_AE4 = and:int(var_0_AE4:int, ldc:int(701114633))
                                goto(Label_2114)
                            }
                            
                            if (cmpne:boolean(and:int(var_0_AE4:int, ldc:int(524288)), ldc:int(0))) {
                                var_0_AE4 = and:int(var_0_AE4:int, ldc:int(132231686))
                                goto(Label_1956)
                            }
                            
                            if (cmpne:boolean(and:int(var_0_AE4:int, ldc:int(32)), ldc:int(0))) {
                                var_0_AE4 = and:int(var_0_AE4:int, ldc:int(1969099099))
                                goto(Label_1815)
                            }
                            
                            if (cmpeq:boolean(and:int(var_0_AE4:int, ldc:int(67108864)), ldc:int(0))) {
                                goto(Label_1695)
                            }
                            
                            if (cmpeq:boolean(and:int(var_0_AE4:int, ldc:int(536870912)), ldc:int(0))) {
                                var_0_AE4 = and:int(var_0_AE4:int, ldc:int(1422978732))
                                loopcontinue(Label_1528)
                            }
                            
                            var_0_AE4 = and:int(var_0_AE4:int, ldc:int(-35915705))
                            stack_9F1_0 = ldc:Class<MessageToMessageDecoder>(io.netty.handler.codec.MessageToMessageDecoder.class)
                            stack_9F1_1 = loadelement:String(var_3_5F7:String[], and:int(ldc:int(31249), ldc:int(-31284)))
                            expr_9CD = newarray:Class[](java.lang.Class.class, and:int(ldc:int(24583), ldc:int(2451)))
                            storeelement:Class(expr_9CD:Class[], and:int(ldc:int(24919), ldc:int(-27992)), ldc:Class<ChannelHandlerContext>(io.netty.channel.ChannelHandlerContext.class))
                            storeelement:Class(expr_9CD:Class[], and:int(ldc:int(131), ldc:int(69)), ldc:Class<Object>(java.lang.Object.class))
                            storeelement:Class(expr_9CD:Class[], xor:int(ldc:int(4680), ldc:int(4682)), ldc:Class<List>(java.util.List.class))
                            putstatic:Method(\u983f\u40a9\u6d69\uceb8\u1187\ub8be::\u9033\uc2e8\u47c2\ub171\u3e75\u624e, invokevirtual:Method(Class::getDeclaredMethod, stack_9F1_0:Class, stack_9F1_1:String, expr_9CD:Class[]))
                        }
                        
                        Label_2551:
                        
                        if (cmpeq:boolean(and:int(var_0_AE4:int, ldc:int(134217728)), ldc:int(0))) {
                            var_0_AE4 = and:int(var_0_AE4:int, ldc:int(-1262015365))
                        }
                        else {
                            if (cmpeq:boolean(and:int(var_0_AE4:int, ldc:int(1073741824)), ldc:int(0))) {
                                loopcontinue()
                            }
                            
                            if (cmpeq:boolean(and:int(var_0_AE4:int, ldc:int(2)), ldc:int(0))) {
                                goto(Label_2225)
                            }
                            
                            if (cmpne:boolean(and:int(var_0_AE4:int, ldc:int(524288)), ldc:int(0))) {
                                goto(Label_2114)
                            }
                            
                            if (cmpeq:boolean(and:int(var_0_AE4:int, ldc:int(2147483647)), ldc:int(0))) {
                                goto(Label_1956)
                            }
                            
                            if (cmpeq:boolean(and:int(var_0_AE4:int, ldc:int(134217728)), ldc:int(0))) {
                                goto(Label_1815)
                            }
                            
                            if (cmpeq:boolean(and:int(var_0_AE4:int, ldc:int(2)), ldc:int(0))) {
                                goto(Label_1695)
                            }
                            
                            if (cmpne:boolean(and:int(var_0_AE4:int, ldc:int(8)), ldc:int(0))) {
                                loopcontinue(Label_1528)
                            }
                            
                            var_0_AE4 = and:int(var_0_AE4:int, ldc:int(1835265115))
                            invokevirtual:void(AccessibleObject::setAccessible, getstatic:Method[expected:AccessibleObject](\u983f\u40a9\u6d69\uceb8\u1187\ub8be::\u9033\uc2e8\u47c2\ub171\u3e75\u624e), and:int[expected:boolean](ldc:int(1289), ldc:int(8391)))
                        }
                        
                        Label_2635:
                        
                        if (cmpeq:boolean(and:int(var_0_AE4:int, ldc:int(1)), ldc:int(0))) {
                            var_0_AE4 = and:int(var_0_AE4:int, ldc:int(130292978))
                            goto(Label_2551)
                        }
                        
                        if (cmpeq:boolean(and:int(var_0_AE4:int, ldc:int(32768)), ldc:int(0))) {
                            var_0_AE4 = and:int(var_0_AE4:int, ldc:int(286453891))
                        }
                        else {
                            if (cmpeq:boolean(and:int(var_0_AE4:int, ldc:int(536870912)), ldc:int(0))) {
                                var_0_AE4 = and:int(var_0_AE4:int, ldc:int(2045725895))
                                goto(Label_2225)
                            }
                            
                            if (cmpne:boolean(and:int(var_0_AE4:int, ldc:int(524288)), ldc:int(0))) {
                                var_0_AE4 = and:int(var_0_AE4:int, ldc:int(2119921523))
                                goto(Label_2114)
                            }
                            
                            if (cmpeq:boolean(and:int(var_0_AE4:int, ldc:int(134217728)), ldc:int(0))) {
                                goto(Label_1956)
                            }
                            
                            if (cmpeq:boolean(and:int(var_0_AE4:int, ldc:int(1073741824)), ldc:int(0))) {
                                var_0_AE4 = and:int(var_0_AE4:int, ldc:int(52371258))
                                goto(Label_1815)
                            }
                            
                            if (cmpne:boolean(and:int(var_0_AE4:int, ldc:int(32)), ldc:int(0))) {
                                goto(Label_1695)
                            }
                            
                            if (cmpne:boolean(and:int(var_0_AE4:int, ldc:int(32768)), ldc:int(0))) {
                                var_0_AE4 = and:int(var_0_AE4:int, ldc:int(-324551561))
                                looporswitchbreak(Label_2794)
                            }
                            
                            loopcontinue(Label_1528)
                        }
                    }
                }
                catch (java.lang.NoSuchMethodException stack_ABD_0) {
                }
                
                Label_2751:
                
                if (cmpne:boolean(and:int(var_0_AE4:int, ldc:int(524288)), ldc:int(0))) {
                    var_0_AE4 = and:int(var_0_AE4:int, ldc:int(817827849))
                    goto(Label_2341)
                }
                
                if (cmpne:boolean(and:int(var_0_AE4:int, ldc:int(32)), ldc:int(0))) {
                    var_0_AE4 = and:int(var_0_AE4:int, ldc:int(749206748))
                    goto(Label_1922)
                }
                
                var_0_AE4 = and:int(var_0_AE4:int, ldc:int(1846209555))
                invokevirtual:void(NoSuchMethodException::printStackTrace, var_6:Throwable)
                looporswitchbreak()
            }
            
            Label_2794:
            return:void()
        }
        
        goto(Label_0114)
    }
    
    public void \ud158\u3e75\u6ec6\u71f1\ud4fe\u72f1(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_65A : int
        var_5_80 : int
        var_6_87 : int
        var_7_96 : double
        var_9_C7 : double
        var_3_D9 : int
        var_11_EA : int
        var_14_114 : double
        var_16_118 : int
        var_12_110 : double
        var_17_665 : int
        
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
        var_3_65A = and:int(ldc:int(1918345603), ldc:int(920516042))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u983f\u40a9\u6d69\uceb8\u1187\ub8be[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0170)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(128)), ldc:int(0))) {
            var_3_65A = and:int(var_3_65A:int, ldc:int(-1787561034))
            var_5_80 = and:int(ldc:int(-6382), ldc:int(4333))
            var_6_87 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_96 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-3405), ldc:int(3404)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C7 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D9 = and:int(var_3_65A:int, ldc:int(1565893067))
                    var_9_C7 = sub:double(var_7_96:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EA = var_5_80:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EA:int, sub:int(var_6_87:int, xor:int(ldc:int(9408), ldc:int(9409)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EA:int, xor:int(ldc:int(139), ldc:int(138)))), var_7_96:double))) {
                        inc:int(var_11_EA, ldc:int(1))
                    }
                    
                    var_3_65A = and:int(var_3_D9:int, ldc:int(-1216752712))
                    var_14_114 = var_7_96:double
                    var_16_118 = var_11_EA:int
                }
                else {
                    var_11_EA = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_80:int), xor:int(ldc:int(4544), ldc:int(4545)))
                    var_12_110 = var_14_114 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_80)
                    
                    if (cmplt:boolean(var_16_118 = var_11_EA:int, var_6_87:int)) {
                        var_9_C7 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EA:int)
                        var_16_118 = var_11_EA:int
                        var_14_114 = var_12_110:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1518)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(8)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(-322667164))
                        goto(Label_1366)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(128)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(128225789))
                        goto(Label_1237)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(128)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(-994281769))
                        goto(Label_1135)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(-1434689690))
                        goto(Label_0972)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0845)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(8)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(182019674))
                        goto(Label_0718)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0590)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(-465410908))
                    }
                    else {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(847238085))
                        
                        if (cmplt:boolean(var_16_118:int, var_6_87:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0590)
                            }
                            
                            goto(Label_0845)
                        }
                    }
                    
                    Label_0423:
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(1621533402))
                        goto(Label_1518)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(-853012208))
                        goto(Label_1366)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1237)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(940537223))
                        goto(Label_1135)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0972)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(836014569))
                        goto(Label_0845)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0718)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(-1798407390))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(128)), ldc:int(0))) {
                            var_3_65A = and:int(var_3_65A:int, ldc:int(1416992708))
                            var_11_EA = and:int(ldc:int(-12781), ldc:int(12748))
                            goto(Label_1507)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0590:
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1518)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(380063109))
                        goto(Label_1366)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1237)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1135)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0972)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(21622658))
                        goto(Label_0845)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(4)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(1618423022))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(256)), ldc:int(0))) {
                            var_3_65A = and:int(var_3_65A:int, ldc:int(-1239992764))
                            goto(Label_0423)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_65A = and:int(var_3_65A:int, ldc:int(1472218731))
                            loopcontinue()
                        }
                        
                        var_3_65A = and:int(var_3_65A:int, ldc:int(2029507023))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_114 = var_9_C7:double
                            goto(Label_0845)
                        }
                    }
                    
                    Label_0718:
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(1661587347))
                        goto(Label_1518)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(8)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(-675049321))
                        goto(Label_1366)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1237)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(8)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(474602463))
                        goto(Label_1135)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0972)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(2048)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0590)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_65A = and:int(var_3_65A:int, ldc:int(1579795719))
                            goto(Label_0423)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(32768)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_65A = and:int(var_3_65A:int, ldc:int(-1334051959))
                        var_14_114 = mul:double(ldc:double(0.5), add:double(var_9_C7:double, var_14_114:double))
                    }
                    
                    Label_0845:
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1518)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(1631310203))
                        goto(Label_1366)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(739192046))
                        goto(Label_1237)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1135)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(167462310))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0718)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_65A = and:int(var_3_65A:int, ldc:int(-10701445))
                            goto(Label_0590)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0423)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_65A = and:int(var_3_65A:int, ldc:int(104514610))
                            loopcontinue()
                        }
                        
                        var_3_65A = and:int(var_3_65A:int, ldc:int(1568392615))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_80:int), var_7_96:double)) {
                                var_11_EA = xor:int(ldc:int(16392), ldc:int(16393))
                                goto(Label_1135)
                            }
                        }
                    }
                    
                    Label_0972:
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(-530238623))
                        goto(Label_1518)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1366)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1237)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(268435456)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0845)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_65A = and:int(var_3_65A:int, ldc:int(-2104528325))
                            goto(Label_0718)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(8)), ldc:int(0))) {
                            var_3_65A = and:int(var_3_65A:int, ldc:int(-1190388640))
                            goto(Label_0590)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_65A = and:int(var_3_65A:int, ldc:int(1667843205))
                            goto(Label_0423)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_65A = and:int(var_3_65A:int, ldc:int(-43196060))
                            loopcontinue()
                        }
                        
                        var_3_65A = and:int(var_3_65A:int, ldc:int(1381343660))
                        var_11_EA = and:int(ldc:int(-4317), ldc:int(4316))
                    }
                    
                    Label_1135:
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1518)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1366)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(65536)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0972)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0845)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0718)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0590)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(8)), ldc:int(0))) {
                            var_3_65A = and:int(var_3_65A:int, ldc:int(-400723540))
                            goto(Label_0423)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_65A = and:int(var_3_65A:int, ldc:int(-1123943007))
                            loopcontinue()
                        }
                        
                        var_3_65A = and:int(var_3_65A:int, ldc:int(1985458092))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EA:int, ldc:int(0))) {
                                goto(Label_1366)
                            }
                        }
                    }
                    
                    Label_1237:
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1518)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_65A = and:int(var_3_65A:int, ldc:int(1676688361))
                            goto(Label_1135)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(128)), ldc:int(0))) {
                            var_3_65A = and:int(var_3_65A:int, ldc:int(1137379623))
                            goto(Label_0972)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(256)), ldc:int(0))) {
                            var_3_65A = and:int(var_3_65A:int, ldc:int(-1432471544))
                            goto(Label_0845)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_65A = and:int(var_3_65A:int, ldc:int(906498016))
                            goto(Label_0718)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0590)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0423)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(4)), ldc:int(0))) {
                            var_3_65A = and:int(var_3_65A:int, ldc:int(-153776165))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_114:double, var_5_80:int, var_16_118:int)
                            goto(Label_1507)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1366:
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(-768260232))
                        goto(Label_1518)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1237)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1135)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(-1403862224))
                        goto(Label_0972)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0845)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(-85362076))
                        goto(Label_0718)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0590)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(806163947))
                        goto(Label_0423)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(8)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(1700317587))
                        loopcontinue()
                    }
                    
                    var_3_65A = and:int(var_3_65A:int, ldc:int(-780410393))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_114:double, ldc:double(0.0))
                    Label_1507:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_665 = var_5_80:int
                        
                        if (cmpeq:boolean(var_11_EA:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1518:
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(4)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(430667046))
                        goto(Label_1366)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(1289170806))
                        goto(Label_1237)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1135)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0972)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(-186900146))
                        goto(Label_0845)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0718)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0590)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0423)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(-1864376441))
                        var_17_665 = add:int(var_16_118:int, and:int(ldc:int(20515), ldc:int(8453)))
                        looporswitchbreak()
                    }
                    
                    var_3_65A = and:int(var_3_65A:int, ldc:int(-525542963))
                }
                
                var_3_65A = and:int(var_3_65A:int, ldc:int(-1638546991))
                
                if (cmple:boolean(var_5_80 = var_17_665:int, sub:int(var_6_87:int, xor:int(ldc:int(-31936), ldc:int(-31935))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0170:
        
        if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(4194304)), ldc:int(0))) {
            var_3_65A = and:int(var_3_65A:int, ldc:int(150345433))
            goto(Label_0108)
        }
    }
}
