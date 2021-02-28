public class \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6b5f\u8c8a\u4975\u8709\ud158 {
    public void \u6b5f\u8c8a\u4975\u8709\ud158() {
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
            invokespecial:ByteToMessageDecoder(ByteToMessageDecoder::<init>, this:\u6b5f\u8c8a\u4975\u8709\ud158)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void decode(io.netty.channel.ChannelHandlerContext p0, io.netty.buffer.ByteBuf p1, java.util.List<java.lang.Object> p2) {
        var_4_61 : int
        var_4_8E : int
        var_6_99 : byte[]
        var_4_A0 : int
        var_7_A9 : int
        var_4_50A : int
        var_8_518 : \u98a4\uafe7\uc3e3\ua6bd\u8640
        var_9_526 : int
        
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
        var_4_61 = and:int(ldc:int(1248040485), ldc:int(-160836491))
        
        do {
            if (cmpeq:boolean(and:int(var_4_61:int, ldc:int(2147483647)), ldc:int(0))) {
                var_4_61 = and:int(var_4_61:int, ldc:int(704402291))
            }
            else {
                var_4_61 = and:int(var_4_61:int, ldc:int(1128782197))
                invokevirtual:ByteBuf(ByteBuf::markReaderIndex, p1:ByteBuf)
            }
        } while (cmpne:boolean(and:int(var_4_61:int, ldc:int(536870912)), ldc:int(0)))
        
        var_4_8E = and:int(var_4_61:int, ldc:int(-1956785075))
        var_6_99 = newarray:byte[](byte.class, xor:int(ldc:int(-14270), ldc:int(-14271)))
        var_4_A0 = and:int(var_4_8E:int, ldc:int(1651873967))
        var_7_A9 = and:int(ldc:int(583), ldc:int(-624))
        
        loop {
            if (cmpeq:boolean(and:int(var_4_A0:int, ldc:int(65536)), ldc:int(0))) {
                var_4_A0 = and:int(var_4_A0:int, ldc:int(-1965053056))
                goto(Label_1151)
            }
            
            if (cmpne:boolean(and:int(var_4_A0:int, ldc:int(128)), ldc:int(0))) {
                var_4_A0 = and:int(var_4_A0:int, ldc:int(1408177831))
                goto(Label_1030)
            }
            
            if (cmpne:boolean(and:int(var_4_A0:int, ldc:int(2)), ldc:int(0))) {
                var_4_A0 = and:int(var_4_A0:int, ldc:int(-812047872))
                goto(Label_0911)
            }
            
            if (cmpne:boolean(and:int(var_4_A0:int, ldc:int(262144)), ldc:int(0))) {
                var_4_A0 = and:int(var_4_A0:int, ldc:int(-151916805))
                goto(Label_0766)
            }
            
            if (cmpne:boolean(and:int(var_4_A0:int, ldc:int(16384)), ldc:int(0))) {
                var_4_A0 = and:int(var_4_A0:int, ldc:int(1062857142))
                goto(Label_0640)
            }
            
            if (cmpeq:boolean(and:int(var_4_A0:int, ldc:int(4096)), ldc:int(0))) {
                goto(Label_0529)
            }
            
            if (cmpeq:boolean(and:int(var_4_A0:int, ldc:int(4194304)), ldc:int(0))) {
                var_4_A0 = and:int(var_4_A0:int, ldc:int(-1907389492))
                goto(Label_0431)
            }
            
            if (cmpeq:boolean(and:int(var_4_A0:int, ldc:int(1048576)), ldc:int(0))) {
                var_4_A0 = and:int(var_4_A0:int, ldc:int(726119503))
                
                if (cmpge:boolean(var_7_A9:int, arraylength:int(var_6_99:byte[]))) {
                    athrow(initobject:CorruptedFrameException(CorruptedFrameException::<init>, loadelement:String(getstatic:String[](\u6b5f\u8c8a\u4975\u8709\ud158::\u59ec\u3bd6\ube23\uc238\ud51e\u0b8e), and:int(ldc:int(-20747), ldc:int(20746)))))
                }
            }
            
            Label_0310:
            
            if (cmpeq:boolean(and:int(var_4_A0:int, ldc:int(32768)), ldc:int(0))) {
                var_4_A0 = and:int(var_4_A0:int, ldc:int(-1631313104))
                goto(Label_1151)
            }
            
            if (cmpeq:boolean(and:int(var_4_A0:int, ldc:int(33554432)), ldc:int(0))) {
                var_4_A0 = and:int(var_4_A0:int, ldc:int(-1000955397))
                goto(Label_1030)
            }
            
            if (cmpeq:boolean(and:int(var_4_A0:int, ldc:int(4)), ldc:int(0))) {
                var_4_A0 = and:int(var_4_A0:int, ldc:int(-1769369610))
                goto(Label_0911)
            }
            
            if (cmpne:boolean(and:int(var_4_A0:int, ldc:int(1048576)), ldc:int(0))) {
                var_4_A0 = and:int(var_4_A0:int, ldc:int(-833831208))
                goto(Label_0766)
            }
            
            if (cmpeq:boolean(and:int(var_4_A0:int, ldc:int(2147483647)), ldc:int(0))) {
                var_4_A0 = and:int(var_4_A0:int, ldc:int(-1360435623))
                goto(Label_0640)
            }
            
            if (cmpeq:boolean(and:int(var_4_A0:int, ldc:int(32768)), ldc:int(0))) {
                goto(Label_0529)
            }
            
            if (cmpne:boolean(and:int(var_4_A0:int, ldc:int(32768)), ldc:int(0))) {
                if (cmpne:boolean(and:int(var_4_A0:int, ldc:int(2)), ldc:int(0))) {
                    loopcontinue()
                }
                
                var_4_A0 = and:int(var_4_A0:int, ldc:int(1783085247))
            }
            
            Label_0431:
            
            if (cmpne:boolean(and:int(var_4_A0:int, ldc:int(536870912)), ldc:int(0))) {
                var_4_A0 = and:int(var_4_A0:int, ldc:int(-910792733))
                goto(Label_1151)
            }
            
            if (cmpeq:boolean(and:int(var_4_A0:int, ldc:int(4096)), ldc:int(0))) {
                var_4_A0 = and:int(var_4_A0:int, ldc:int(1511832570))
                goto(Label_1030)
            }
            
            if (cmpeq:boolean(and:int(var_4_A0:int, ldc:int(4194304)), ldc:int(0))) {
                goto(Label_0911)
            }
            
            if (cmpeq:boolean(and:int(var_4_A0:int, ldc:int(65536)), ldc:int(0))) {
                goto(Label_0766)
            }
            
            if (cmpne:boolean(and:int(var_4_A0:int, ldc:int(128)), ldc:int(0))) {
                goto(Label_0640)
            }
            
            if (cmpne:boolean(and:int(var_4_A0:int, ldc:int(1)), ldc:int(0))) {
                if (cmpne:boolean(and:int(var_4_A0:int, ldc:int(8388608)), ldc:int(0))) {
                    goto(Label_0310)
                }
                
                if (cmpeq:boolean(and:int(var_4_A0:int, ldc:int(4)), ldc:int(0))) {
                    loopcontinue()
                }
                
                var_4_A0 = and:int(var_4_A0:int, ldc:int(-469919027))
                
                if (invokevirtual:boolean(ByteBuf::isReadable, p1:ByteBuf)) {
                    storeelement:byte(var_6_99:byte[], var_7_A9:int, invokevirtual:byte(ByteBuf::readByte, p1:ByteBuf))
                    goto(Label_0911)
                }
            }
            
            Label_0529:
            
            if (cmpne:boolean(and:int(var_4_A0:int, ldc:int(8388608)), ldc:int(0))) {
                goto(Label_1151)
            }
            
            if (cmpne:boolean(and:int(var_4_A0:int, ldc:int(536870912)), ldc:int(0))) {
                var_4_A0 = and:int(var_4_A0:int, ldc:int(-1747161815))
                goto(Label_1030)
            }
            
            if (cmpne:boolean(and:int(var_4_A0:int, ldc:int(536870912)), ldc:int(0))) {
                goto(Label_0911)
            }
            
            if (cmpne:boolean(and:int(var_4_A0:int, ldc:int(8388608)), ldc:int(0))) {
                var_4_A0 = and:int(var_4_A0:int, ldc:int(627433982))
                goto(Label_0766)
            }
            
            if (cmpne:boolean(and:int(var_4_A0:int, ldc:int(262144)), ldc:int(0))) {
                var_4_A0 = and:int(var_4_A0:int, ldc:int(-952424436))
            }
            else {
                if (cmpne:boolean(and:int(var_4_A0:int, ldc:int(8388608)), ldc:int(0))) {
                    goto(Label_0431)
                }
                
                if (cmpeq:boolean(and:int(var_4_A0:int, ldc:int(32768)), ldc:int(0))) {
                    var_4_A0 = and:int(var_4_A0:int, ldc:int(210048732))
                    goto(Label_0310)
                }
                
                if (cmpeq:boolean(and:int(var_4_A0:int, ldc:int(33554432)), ldc:int(0))) {
                    loopcontinue()
                }
                
                var_4_A0 = and:int(var_4_A0:int, ldc:int(1732885229))
            }
            
            Label_0640:
            
            if (cmpne:boolean(and:int(var_4_A0:int, ldc:int(536870912)), ldc:int(0))) {
                goto(Label_1151)
            }
            
            if (cmpeq:boolean(and:int(var_4_A0:int, ldc:int(4194304)), ldc:int(0))) {
                goto(Label_1030)
            }
            
            if (cmpne:boolean(and:int(var_4_A0:int, ldc:int(8388608)), ldc:int(0))) {
                var_4_A0 = and:int(var_4_A0:int, ldc:int(-1984619949))
                goto(Label_0911)
            }
            
            if (cmpne:boolean(and:int(var_4_A0:int, ldc:int(32768)), ldc:int(0))) {
                if (cmpeq:boolean(and:int(var_4_A0:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_4_A0 = and:int(var_4_A0:int, ldc:int(17472430))
                    goto(Label_0529)
                }
                
                if (cmpeq:boolean(and:int(var_4_A0:int, ldc:int(4096)), ldc:int(0))) {
                    var_4_A0 = and:int(var_4_A0:int, ldc:int(-1341939735))
                    goto(Label_0431)
                }
                
                if (cmpne:boolean(and:int(var_4_A0:int, ldc:int(128)), ldc:int(0))) {
                    var_4_A0 = and:int(var_4_A0:int, ldc:int(610052858))
                    goto(Label_0310)
                }
                
                if (cmpeq:boolean(and:int(var_4_A0:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_4_A0 = and:int(var_4_A0:int, ldc:int(-1809795636))
                    loopcontinue()
                }
                
                var_4_A0 = and:int(var_4_A0:int, ldc:int(-2092305491))
                invokevirtual:ByteBuf(ByteBuf::resetReaderIndex, p1:ByteBuf)
            }
            
            Label_0766:
            
            if (cmpeq:boolean(and:int(var_4_A0:int, ldc:int(1)), ldc:int(0))) {
                var_4_A0 = and:int(var_4_A0:int, ldc:int(-574776172))
                goto(Label_1151)
            }
            
            if (cmpne:boolean(and:int(var_4_A0:int, ldc:int(8192)), ldc:int(0))) {
                var_4_A0 = and:int(var_4_A0:int, ldc:int(-199625802))
                goto(Label_1030)
            }
            
            if (cmpne:boolean(and:int(var_4_A0:int, ldc:int(1048576)), ldc:int(0))) {
                var_4_A0 = and:int(var_4_A0:int, ldc:int(75785070))
            }
            else {
                if (cmpne:boolean(and:int(var_4_A0:int, ldc:int(1048576)), ldc:int(0))) {
                    var_4_A0 = and:int(var_4_A0:int, ldc:int(-645051671))
                    goto(Label_0640)
                }
                
                if (cmpne:boolean(and:int(var_4_A0:int, ldc:int(2)), ldc:int(0))) {
                    var_4_A0 = and:int(var_4_A0:int, ldc:int(-1528801636))
                    goto(Label_0529)
                }
                
                if (cmpne:boolean(and:int(var_4_A0:int, ldc:int(8388608)), ldc:int(0))) {
                    goto(Label_0431)
                }
                
                if (cmpne:boolean(and:int(var_4_A0:int, ldc:int(262144)), ldc:int(0))) {
                    goto(Label_0310)
                }
                
                if (cmpeq:boolean(and:int(var_4_A0:int, ldc:int(4194304)), ldc:int(0))) {
                    var_4_A0 = and:int(var_4_A0:int, ldc:int(2041332086))
                    loopcontinue()
                }
                
                return:void()
            }
            
            Label_0911:
            
            if (cmpeq:boolean(and:int(var_4_A0:int, ldc:int(1)), ldc:int(0))) {
                goto(Label_1151)
            }
            
            if (cmpne:boolean(and:int(var_4_A0:int, ldc:int(128)), ldc:int(0))) {
                var_4_A0 = and:int(var_4_A0:int, ldc:int(1067425381))
            }
            else {
                if (cmpne:boolean(and:int(var_4_A0:int, ldc:int(16384)), ldc:int(0))) {
                    goto(Label_0766)
                }
                
                if (cmpeq:boolean(and:int(var_4_A0:int, ldc:int(4)), ldc:int(0))) {
                    goto(Label_0640)
                }
                
                if (cmpeq:boolean(and:int(var_4_A0:int, ldc:int(1)), ldc:int(0))) {
                    var_4_A0 = and:int(var_4_A0:int, ldc:int(-159439946))
                    goto(Label_0529)
                }
                
                if (cmpeq:boolean(and:int(var_4_A0:int, ldc:int(33554432)), ldc:int(0))) {
                    var_4_A0 = and:int(var_4_A0:int, ldc:int(-1128063359))
                    goto(Label_0431)
                }
                
                if (cmpeq:boolean(and:int(var_4_A0:int, ldc:int(4096)), ldc:int(0))) {
                    var_4_A0 = and:int(var_4_A0:int, ldc:int(-1901135392))
                    goto(Label_0310)
                }
                
                if (cmpne:boolean(and:int(var_4_A0:int, ldc:int(16384)), ldc:int(0))) {
                    loopcontinue()
                }
                
                var_4_A0 = and:int(var_4_A0:int, ldc:int(-1033372385))
                
                if (cmplt:boolean(loadelement:byte(var_6_99:byte[], var_7_A9:int), ldc:byte(0))) {
                    inc:int(var_7_A9, ldc:int(1))
                    loopcontinue()
                }
            }
            
            Label_1030:
            
            if (cmpne:boolean(and:int(var_4_A0:int, ldc:int(2147483647)), ldc:int(0))) {
                if (cmpeq:boolean(and:int(var_4_A0:int, ldc:int(32768)), ldc:int(0))) {
                    var_4_A0 = and:int(var_4_A0:int, ldc:int(-836268785))
                    goto(Label_0911)
                }
                
                if (cmpne:boolean(and:int(var_4_A0:int, ldc:int(262144)), ldc:int(0))) {
                    var_4_A0 = and:int(var_4_A0:int, ldc:int(-567769578))
                    goto(Label_0766)
                }
                
                if (cmpeq:boolean(and:int(var_4_A0:int, ldc:int(4)), ldc:int(0))) {
                    goto(Label_0640)
                }
                
                if (cmpeq:boolean(and:int(var_4_A0:int, ldc:int(4096)), ldc:int(0))) {
                    var_4_A0 = and:int(var_4_A0:int, ldc:int(2126629030))
                    goto(Label_0529)
                }
                
                if (cmpeq:boolean(and:int(var_4_A0:int, ldc:int(32768)), ldc:int(0))) {
                    var_4_A0 = and:int(var_4_A0:int, ldc:int(2045749569))
                    goto(Label_0431)
                }
                
                if (cmpne:boolean(and:int(var_4_A0:int, ldc:int(8388608)), ldc:int(0))) {
                    var_4_A0 = and:int(var_4_A0:int, ldc:int(16549901))
                    goto(Label_0310)
                }
                
                if (cmpeq:boolean(and:int(var_4_A0:int, ldc:int(1)), ldc:int(0))) {
                    loopcontinue()
                }
                
                var_4_A0 = and:int(var_4_A0:int, ldc:int(401455821))
            }
            
            Label_1151:
            
            if (cmpne:boolean(and:int(var_4_A0:int, ldc:int(128)), ldc:int(0))) {
                goto(Label_1030)
            }
            
            if (cmpne:boolean(and:int(var_4_A0:int, ldc:int(128)), ldc:int(0))) {
                var_4_A0 = and:int(var_4_A0:int, ldc:int(667385640))
                goto(Label_0911)
            }
            
            if (cmpeq:boolean(and:int(var_4_A0:int, ldc:int(4096)), ldc:int(0))) {
                var_4_A0 = and:int(var_4_A0:int, ldc:int(-725019885))
                goto(Label_0766)
            }
            
            if (cmpne:boolean(and:int(var_4_A0:int, ldc:int(128)), ldc:int(0))) {
                var_4_A0 = and:int(var_4_A0:int, ldc:int(124565768))
                goto(Label_0640)
            }
            
            if (cmpne:boolean(and:int(var_4_A0:int, ldc:int(2)), ldc:int(0))) {
                var_4_A0 = and:int(var_4_A0:int, ldc:int(902450360))
                goto(Label_0529)
            }
            
            if (cmpne:boolean(and:int(var_4_A0:int, ldc:int(1048576)), ldc:int(0))) {
                var_4_A0 = and:int(var_4_A0:int, ldc:int(-1317448927))
                goto(Label_0431)
            }
            
            if (cmpne:boolean(and:int(var_4_A0:int, ldc:int(262144)), ldc:int(0))) {
                var_4_A0 = and:int(var_4_A0:int, ldc:int(-646384706))
                goto(Label_0310)
            }
            
            if (cmpne:boolean(and:int(var_4_A0:int, ldc:int(4)), ldc:int(0))) {
                var_4_50A = and:int(var_4_A0:int, ldc:int(133036407))
                var_8_518 = initobject:\u98a4\uafe7\uc3e3\ua6bd\u8640(\u98a4\uafe7\uc3e3\ua6bd\u8640::<init>, invokestatic:ByteBuf(Unpooled::wrappedBuffer, var_6_99:byte[]))
                
                try {
                    var_4_50A = and:int(var_4_50A:int, ldc:int(1054994821))
                    var_9_526 = invokevirtual:int(\u98a4\uafe7\uc3e3\ua6bd\u8640::\u6bb9\ub19c\u760c\ucef1\u3776\uf9c5, var_8_518:\u98a4\uafe7\uc3e3\ua6bd\u8640)
                    
                    loop {
                        if (cmpeq:boolean(and:int(var_4_50A:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_1924)
                        }
                        
                        if (cmpeq:boolean(and:int(var_4_50A:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_1813)
                        }
                        
                        if (cmpeq:boolean(and:int(var_4_50A:int, ldc:int(1)), ldc:int(0))) {
                            var_4_50A = and:int(var_4_50A:int, ldc:int(-1194936575))
                            goto(Label_1728)
                        }
                        
                        if (cmpeq:boolean(and:int(var_4_50A:int, ldc:int(65536)), ldc:int(0))) {
                            var_4_50A = and:int(var_4_50A:int, ldc:int(1692553384))
                            goto(Label_1637)
                        }
                        
                        if (cmpne:boolean(and:int(var_4_50A:int, ldc:int(262144)), ldc:int(0))) {
                            var_4_50A = and:int(var_4_50A:int, ldc:int(-962953801))
                            goto(Label_1539)
                        }
                        
                        if (cmpeq:boolean(and:int(var_4_50A:int, ldc:int(65536)), ldc:int(0))) {
                            var_4_50A = and:int(var_4_50A:int, ldc:int(-1791001752))
                        }
                        else {
                            var_4_50A = and:int(var_4_50A:int, ldc:int(511031263))
                            
                            if (cmplt:boolean(invokevirtual:int(ByteBuf::readableBytes, p1:ByteBuf), var_9_526:int)) {
                                invokevirtual:ByteBuf(ByteBuf::resetReaderIndex, p1:ByteBuf)
                                goto(Label_1813)
                            }
                        }
                        
                        Label_1424:
                        
                        if (cmpeq:boolean(and:int(var_4_50A:int, ldc:int(32768)), ldc:int(0))) {
                            var_4_50A = and:int(var_4_50A:int, ldc:int(-997008377))
                            goto(Label_1924)
                        }
                        
                        if (cmpne:boolean(and:int(var_4_50A:int, ldc:int(128)), ldc:int(0))) {
                            var_4_50A = and:int(var_4_50A:int, ldc:int(-297653184))
                            goto(Label_1813)
                        }
                        
                        if (cmpne:boolean(and:int(var_4_50A:int, ldc:int(2)), ldc:int(0))) {
                            var_4_50A = and:int(var_4_50A:int, ldc:int(666584542))
                            goto(Label_1728)
                        }
                        
                        if (cmpeq:boolean(and:int(var_4_50A:int, ldc:int(4)), ldc:int(0))) {
                            var_4_50A = and:int(var_4_50A:int, ldc:int(-1653604018))
                            goto(Label_1637)
                        }
                        
                        if (cmpeq:boolean(and:int(var_4_50A:int, ldc:int(65536)), ldc:int(0))) {
                            var_4_50A = and:int(var_4_50A:int, ldc:int(1356235706))
                        }
                        else {
                            if (cmpeq:boolean(and:int(var_4_50A:int, ldc:int(32768)), ldc:int(0))) {
                                var_4_50A = and:int(var_4_50A:int, ldc:int(-697703591))
                                loopcontinue()
                            }
                            
                            var_4_50A = and:int(var_4_50A:int, ldc:int(1935930399))
                        }
                        
                        Label_1539:
                        
                        if (cmpne:boolean(and:int(var_4_50A:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_1924)
                        }
                        
                        if (cmpeq:boolean(and:int(var_4_50A:int, ldc:int(65536)), ldc:int(0))) {
                            var_4_50A = and:int(var_4_50A:int, ldc:int(1113554493))
                            goto(Label_1813)
                        }
                        
                        if (cmpeq:boolean(and:int(var_4_50A:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_1728)
                        }
                        
                        if (cmpne:boolean(and:int(var_4_50A:int, ldc:int(536870912)), ldc:int(0))) {
                            var_4_50A = and:int(var_4_50A:int, ldc:int(1738553432))
                        }
                        else {
                            if (cmpeq:boolean(and:int(var_4_50A:int, ldc:int(4)), ldc:int(0))) {
                                goto(Label_1424)
                            }
                            
                            if (cmpne:boolean(and:int(var_4_50A:int, ldc:int(536870912)), ldc:int(0))) {
                                var_4_50A = and:int(var_4_50A:int, ldc:int(545952714))
                                loopcontinue()
                            }
                            
                            var_4_50A = and:int(var_4_50A:int, ldc:int(1876686575))
                            invokeinterface:boolean(List<ByteBuf>::add, p2:List<ByteBuf>, invokevirtual:ByteBuf(ByteBuf::readBytes, p1:ByteBuf, var_9_526:int))
                        }
                        
                        Label_1637:
                        
                        if (cmpeq:boolean(and:int(var_4_50A:int, ldc:int(65536)), ldc:int(0))) {
                            var_4_50A = and:int(var_4_50A:int, ldc:int(1249927518))
                            goto(Label_1924)
                        }
                        
                        if (cmpne:boolean(and:int(var_4_50A:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_1813)
                        }
                        
                        if (cmpne:boolean(and:int(var_4_50A:int, ldc:int(8388608)), ldc:int(0))) {
                            var_4_50A = and:int(var_4_50A:int, ldc:int(1250377264))
                        }
                        else {
                            if (cmpeq:boolean(and:int(var_4_50A:int, ldc:int(4096)), ldc:int(0))) {
                                goto(Label_1539)
                            }
                            
                            if (cmpne:boolean(and:int(var_4_50A:int, ldc:int(8388608)), ldc:int(0))) {
                                var_4_50A = and:int(var_4_50A:int, ldc:int(-1039227304))
                                goto(Label_1424)
                            }
                            
                            if (cmpeq:boolean(and:int(var_4_50A:int, ldc:int(4096)), ldc:int(0))) {
                                loopcontinue()
                            }
                            
                            var_4_50A = and:int(var_4_50A:int, ldc:int(1249638791))
                            invokevirtual:boolean(\u98a4\uafe7\uc3e3\ua6bd\u8640::release, var_8_518:\u98a4\uafe7\uc3e3\ua6bd\u8640)
                        }
                        
                        Label_1728:
                        
                        if (cmpne:boolean(and:int(var_4_50A:int, ldc:int(16384)), ldc:int(0))) {
                            var_4_50A = and:int(var_4_50A:int, ldc:int(-1018801843))
                            goto(Label_1924)
                        }
                        
                        if (cmpeq:boolean(and:int(var_4_50A:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_4_50A = and:int(var_4_50A:int, ldc:int(-538029157))
                        }
                        else {
                            if (cmpeq:boolean(and:int(var_4_50A:int, ldc:int(65536)), ldc:int(0))) {
                                goto(Label_1637)
                            }
                            
                            if (cmpeq:boolean(and:int(var_4_50A:int, ldc:int(32768)), ldc:int(0))) {
                                goto(Label_1539)
                            }
                            
                            if (cmpeq:boolean(and:int(var_4_50A:int, ldc:int(4194304)), ldc:int(0))) {
                                goto(Label_1424)
                            }
                            
                            if (cmpeq:boolean(and:int(var_4_50A:int, ldc:int(536870912)), ldc:int(0))) {
                                var_4_50A = and:int(var_4_50A:int, ldc:int(-213543281))
                                return:void()
                            }
                            
                            loopcontinue()
                        }
                        
                        Label_1813:
                        
                        if (cmpeq:boolean(and:int(var_4_50A:int, ldc:int(4)), ldc:int(0))) {
                            var_4_50A = and:int(var_4_50A:int, ldc:int(-1697814239))
                        }
                        else {
                            if (cmpeq:boolean(and:int(var_4_50A:int, ldc:int(4194304)), ldc:int(0))) {
                                var_4_50A = and:int(var_4_50A:int, ldc:int(-659144678))
                                goto(Label_1728)
                            }
                            
                            if (cmpne:boolean(and:int(var_4_50A:int, ldc:int(2)), ldc:int(0))) {
                                var_4_50A = and:int(var_4_50A:int, ldc:int(1035262596))
                                goto(Label_1637)
                            }
                            
                            if (cmpne:boolean(and:int(var_4_50A:int, ldc:int(8192)), ldc:int(0))) {
                                var_4_50A = and:int(var_4_50A:int, ldc:int(-452065072))
                                goto(Label_1539)
                            }
                            
                            if (cmpeq:boolean(and:int(var_4_50A:int, ldc:int(65536)), ldc:int(0))) {
                                var_4_50A = and:int(var_4_50A:int, ldc:int(472382116))
                                goto(Label_1424)
                            }
                            
                            if (cmpne:boolean(and:int(var_4_50A:int, ldc:int(16384)), ldc:int(0))) {
                                loopcontinue()
                            }
                            
                            var_4_50A = and:int(var_4_50A:int, ldc:int(-1419251217))
                            invokevirtual:boolean(\u98a4\uafe7\uc3e3\ua6bd\u8640::release, var_8_518:\u98a4\uafe7\uc3e3\ua6bd\u8640)
                        }
                        
                        Label_1924:
                        
                        if (cmpeq:boolean(and:int(var_4_50A:int, ldc:int(65536)), ldc:int(0))) {
                            var_4_50A = and:int(var_4_50A:int, ldc:int(-871812309))
                            goto(Label_1813)
                        }
                        
                        if (cmpeq:boolean(and:int(var_4_50A:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_1728)
                        }
                        
                        if (cmpne:boolean(and:int(var_4_50A:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_1637)
                        }
                        
                        if (cmpeq:boolean(and:int(var_4_50A:int, ldc:int(65536)), ldc:int(0))) {
                            var_4_50A = and:int(var_4_50A:int, ldc:int(-128284996))
                            goto(Label_1539)
                        }
                        
                        if (cmpne:boolean(and:int(var_4_50A:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_1424)
                        }
                        
                        if (cmpeq:boolean(and:int(var_4_50A:int, ldc:int(1048576)), ldc:int(0))) {
                            var_4_50A = and:int(var_4_50A:int, ldc:int(-556150211))
                            looporswitchbreak()
                        }
                        
                        var_4_50A = and:int(var_4_50A:int, ldc:int(1137843191))
                    }
                }
                finally {
                    invokevirtual:boolean(\u98a4\uafe7\uc3e3\ua6bd\u8640::release, var_8_518:\u98a4\uafe7\uc3e3\ua6bd\u8640)
                }
                
                return:void()
            }
            
            var_4_A0 = and:int(var_4_A0:int, ldc:int(705631187))
        }
    }
    
    static {
        var_0_21D : int
        expr_6B : int [generated]
        stack_9C_0 : byte[] [generated]
        stack_9E_0 : byte[] [generated]
        stack_C7_0 : byte[] [generated]
        stack_C9_0 : byte[] [generated]
        stack_104_0 : byte[] [generated]
        stack_106_0 : byte[] [generated]
        stack_136_0 : byte[] [generated]
        stack_19A_0 : byte[] [generated]
        stack_230_0 : byte[] [generated]
        stack_284_0 : byte[] [generated]
        stack_2DA_0 : byte[] [generated]
        var_4_17C : int
        var_3_181 : byte[]
        var_5_182 : int
        var_0_1B3 : int
        expr_19A : byte [generated]
        stack_1EA_2 : byte [generated]
        stack_1BF_0 : byte [generated]
        expr_230 : byte [generated]
        expr_9E : int [generated]
        var_2_C7 : byte[]
        expr_CB : int [generated]
        var_3_272 : byte[]
        var_5_273 : int
        expr_106 : int [generated]
        var_3_2C8 : byte[]
        var_5_2C9 : int
        var_3_142 : String
        stack_175_0 : String[] [generated]
        expr_154 : String[] [generated]
        
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
        var_0_21D = and:int(ldc:int(-189563337), ldc:int(-184551111))
        expr_6B = arraylength:int(stack_9C_0 = stack_9E_0 = stack_C7_0 = stack_C9_0 = stack_104_0 = stack_106_0 = stack_136_0 = stack_19A_0 = stack_230_0 = stack_284_0 = stack_2DA_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("2nAwGHg4ABD4GDiKcCLq+ChmUhNrnVUt0Q==")))
        
        if (cmpeq:boolean(expr_6B:int, ldc:int(0))) {
            goto(Label_0112)
        }
        
        var_4_17C = expr_6B:int
        var_3_181 = newarray:byte[](byte.class, expr_6B:int)
        var_5_182 = expr_6B:int
        Label_0388:
        
        while (cmpne:boolean(and:int(var_0_21D:int, ldc:int(536870912)), ldc:int(0))) {
            var_0_1B3 = and:int(var_0_21D:int, ldc:int(-306741955))
            var_5_182 = add:int(var_5_182:int, ldc:int(-1))
            expr_19A = stack_1EA_2 = loadelement(stack_19A_0, var_5_182)
            
            if (cmplt:boolean(add:int(add:int(var_5_182:int, ldc:int(6)), neg:int(var_4_17C:int)), ldc:int(0))) {
                stack_1EA_2 = stack_1BF_0 = add:byte(expr_19A:byte, loadelement:byte(var_3_181:byte[], add:int(var_5_182:int, ldc:int(6))))
                goto(Label_0463)
            }
            
            Label_0423:
            
            if (cmpeq:boolean(and:int(var_0_1B3:int, ldc:int(8388608)), ldc:int(0))) {
                var_0_1B3 = and:int(var_0_1B3:int, ldc:int(1429676610))
            }
            else {
                var_0_1B3 = and:int(var_0_1B3:int, ldc:int(-41060225))
                stack_1EA_2 = stack_1BF_0 = add:byte(expr_19A:byte, ldc:byte(6))
            }
            
            Label_0463:
            
            if (cmpne:boolean(and:int(var_0_1B3:int, ldc:int(524288)), ldc:int(0))) {
                var_0_1B3 = and:int(var_0_1B3:int, ldc:int(708323897))
                goto(Label_0423)
            }
            
            var_0_21D = and:int(var_0_1B3:int, ldc:int(-171705679))
            storeelement:byte(var_3_181:byte[], var_5_182:int, stack_1EA_2:byte)
            
            if (cmpne:boolean(var_5_182:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9E_0 = stack_9C_0 = stack_C7_0 = stack_C9_0 = stack_104_0 = stack_106_0 = stack_136_0 = stack_19A_0 = stack_230_0 = stack_284_0 = stack_2DA_0 = var_3_181:byte[]
            goto(Label_0112)
        }
        
        Label_0528:
        
        while (cmpeq:boolean(and:int(var_0_21D:int, ldc:int(16777216)), ldc:int(0))) {
            var_0_21D = and:int(var_0_21D:int, ldc:int(-8136265))
            var_5_182 = add:int(var_5_182:int, ldc:int(-1))
            expr_230 = loadelement:byte(stack_230_0:byte[], var_5_182:int)
            storeelement:byte(var_3_181:byte[], var_5_182:int, add:int(or:int(and:int(shl:int(expr_230:byte, xor:int(ldc:int(2050), ldc:int(2054))), ldc:int(-16)), and:int(shr:int(expr_230:byte[expected:int], and:int(ldc:int(25108), ldc:int(3078))), ldc:int(15))), ldc:int(3)))
            
            if (cmpne:boolean(var_5_182:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9E_0 = stack_9C_0 = stack_C7_0 = stack_C9_0 = stack_104_0 = stack_106_0 = stack_136_0 = stack_19A_0 = stack_230_0 = stack_284_0 = stack_2DA_0 = var_3_181:byte[]
            goto(Label_0163)
        }
        
        var_0_21D = and:int(var_0_21D:int, ldc:int(-1535755724))
        goto(Label_0388)
        Label_0112:
        
        if (cmpne:boolean(and:int(var_0_21D:int, ldc:int(524288)), ldc:int(0))) {
            goto(Label_0267)
        }
        
        if (cmpeq:boolean(and:int(var_0_21D:int, ldc:int(1073741824)), ldc:int(0))) {
            var_0_21D = and:int(var_0_21D:int, ldc:int(1149193303))
            goto(Label_0208)
        }
        
        if (cmpeq:boolean(and:int(var_0_21D:int, ldc:int(4096)), ldc:int(0))) {
            var_0_21D = and:int(var_0_21D:int, ldc:int(-226480837))
        }
        else {
            var_0_21D = and:int(var_0_21D:int, ldc:int(-17851657))
            expr_9E = arraylength:int(stack_9E_0:byte[])
            
            if (cmpne:boolean(expr_9E:int, ldc:int(0))) {
                var_4_17C = expr_9E:int
                var_3_181 = newarray:byte[](byte.class, expr_9E:int)
                var_5_182 = expr_9E:int
                goto(Label_0528)
            }
        }
        
        Label_0163:
        
        if (cmpne:boolean(and:int(var_0_21D:int, ldc:int(33554432)), ldc:int(0))) {
            var_0_21D = and:int(var_0_21D:int, ldc:int(179055665))
            goto(Label_0267)
        }
        
        if (cmpne:boolean(and:int(var_0_21D:int, ldc:int(16)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_21D:int, ldc:int(33554432)), ldc:int(0))) {
                goto(Label_0112)
            }
            
            var_0_21D = and:int(var_0_21D:int, ldc:int(-288145607))
            var_2_C7 = stack_C7_0:byte[]
            expr_CB = add:int(arraylength:int(stack_C9_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_CB:int, ldc:int(0))) {
                var_3_272 = newarray:byte[](byte.class, expr_CB:int)
                var_5_273 = expr_CB:int
                
                loop {
                    var_0_21D = and:int(var_0_21D:int, ldc:int(-8275023))
                    var_5_273 = add:int(var_5_273:int, ldc:int(-1))
                    storeelement:byte(var_3_272:byte[], var_5_273:int, add:int(shl:int(loadelement:byte(stack_284_0:byte[], var_5_273:int), ldc:int(1)), and:int(shr:int(loadelement:byte(var_2_C7:byte[], add:int(var_5_273:int, xor:int(ldc:int(-28672), ldc:int(-28671)))), ldc:int(7)), xor:int(ldc:int(4674), ldc:int(4675)))))
                    
                    if (cmpne:boolean(var_5_273:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_9E_0 = stack_9C_0 = stack_C7_0 = stack_C9_0 = stack_104_0 = stack_106_0 = stack_136_0 = stack_19A_0 = stack_230_0 = stack_284_0 = stack_2DA_0 = var_3_272:byte[]
            }
        }
        
        Label_0208:
        
        if (cmpeq:boolean(and:int(var_0_21D:int, ldc:int(67108864)), ldc:int(0))) {
            var_0_21D = and:int(var_0_21D:int, ldc:int(36800964))
        }
        else {
            if (cmpeq:boolean(and:int(var_0_21D:int, ldc:int(65536)), ldc:int(0))) {
                var_0_21D = and:int(var_0_21D:int, ldc:int(1782989819))
                goto(Label_0163)
            }
            
            if (cmpeq:boolean(and:int(var_0_21D:int, ldc:int(2048)), ldc:int(0))) {
                var_0_21D = and:int(var_0_21D:int, ldc:int(-1658056879))
                goto(Label_0112)
            }
            
            var_0_21D = and:int(var_0_21D:int, ldc:int(-3146049))
            expr_106 = arraylength:int(stack_106_0:byte[])
            
            if (cmpne:boolean(expr_106:int, ldc:int(0))) {
                var_3_2C8 = newarray:byte[](byte.class, expr_106:int)
                var_5_2C9 = expr_106:int
                
                loop {
                    var_0_21D = and:int(var_0_21D:int, ldc:int(-453935887))
                    var_5_2C9 = add:int(var_5_2C9:int, ldc:int(-1))
                    storeelement:byte(var_3_2C8:byte[], var_5_2C9:int, xor:byte(loadelement:byte(stack_2DA_0:byte[], var_5_2C9:int), ldc:byte(25)))
                    
                    if (cmpne:boolean(var_5_2C9:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_9E_0 = stack_9C_0 = stack_C7_0 = stack_C9_0 = stack_104_0 = stack_106_0 = stack_136_0 = stack_19A_0 = stack_230_0 = stack_284_0 = stack_2DA_0 = var_3_2C8:byte[]
            }
        }
        
        Label_0267:
        
        if (cmpne:boolean(and:int(var_0_21D:int, ldc:int(128)), ldc:int(0))) {
            goto(Label_0208)
        }
        
        if (cmpeq:boolean(and:int(var_0_21D:int, ldc:int(1073741824)), ldc:int(0))) {
            var_0_21D = and:int(var_0_21D:int, ldc:int(-335607227))
            goto(Label_0163)
        }
        
        if (cmpeq:boolean(and:int(var_0_21D:int, ldc:int(32)), ldc:int(0))) {
            var_0_21D = and:int(var_0_21D:int, ldc:int(-1021011281))
            goto(Label_0112)
        }
        
        var_3_142 = initobject:String(String::<init>, stack_136_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
        stack_175_0 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(22530), ldc:int(22531)))
        expr_154 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(33), ldc:int(25863)))
        storeelement:String(expr_154:String[], and:int(ldc:int(13861), ldc:int(-14118)), invokevirtual:String[expected:String](String::substring, var_3_142:String, and:int(ldc:int(-28485), ldc:int(28484)), and:int(ldc:int(760), ldc:int(27))))
        putstatic:String[](\u6b5f\u8c8a\u4975\u8709\ud158::\u59ec\u3bd6\ube23\uc238\ud51e\u0b8e, expr_154:String[])
    }
    
    public void \u8d90\u4d85\ubf56\ub83f\ubcb0\u8d90(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_692 : int
        var_5_8A : int
        var_6_91 : int
        var_7_A0 : double
        var_9_D1 : double
        var_3_E3 : int
        var_11_F4 : int
        var_14_11E : double
        var_16_122 : int
        var_12_11A : double
        var_17_69D : int
        
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
        var_3_692 = and:int(ldc:int(-1003716633), ldc:int(-565862425))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u6b5f\u8c8a\u4975\u8709\ud158[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0180)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_692:int, ldc:int(131072)), ldc:int(0))) {
            var_3_692 = and:int(var_3_692:int, ldc:int(116184449))
        }
        else {
            var_3_692 = and:int(var_3_692:int, ldc:int(-285352049))
            var_5_8A = and:int(ldc:int(-15551), ldc:int(11434))
            var_6_91 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_A0 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(5105), ldc:int(-21490)))
            invokestatic:int(m::a)
            
            loop {
                var_9_D1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_E3 = and:int(var_3_692:int, ldc:int(-866353217))
                    var_9_D1 = sub:double(var_7_A0:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_F4 = var_5_8A:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_F4:int, sub:int(var_6_91:int, xor:int(ldc:int(16448), ldc:int(16449)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_F4:int, xor:int(ldc:int(-28352), ldc:int(-28351)))), var_7_A0:double))) {
                        inc:int(var_11_F4, ldc:int(1))
                    }
                    
                    var_3_692 = and:int(var_3_E3:int, ldc:int(-153641049))
                    var_14_11E = var_7_A0:double
                    var_16_122 = var_11_F4:int
                }
                else {
                    var_11_F4 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_8A:int), xor:int(ldc:int(3137), ldc:int(3136)))
                    var_12_11A = var_14_11E = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A)
                    
                    if (cmplt:boolean(var_16_122 = var_11_F4:int, var_6_91:int)) {
                        var_9_D1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_F4:int)
                        var_16_122 = var_11_F4:int
                        var_14_11E = var_12_11A:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1547)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(648170596))
                        goto(Label_1398)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(-821789766))
                        goto(Label_1257)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_692:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(525200233))
                        goto(Label_1131)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_692:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0976)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0837)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_692:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0703)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_692:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(122269569))
                        goto(Label_0584)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_692:int, ldc:int(2)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(-281108593))
                        
                        if (cmplt:boolean(var_16_122:int, var_6_91:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0584)
                            }
                            
                            goto(Label_0837)
                        }
                    }
                    
                    Label_0417:
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(1)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(1306932664))
                        goto(Label_1547)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1398)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_692:int, ldc:int(8)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(2077064852))
                        goto(Label_1257)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1131)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(-153053695))
                        goto(Label_0976)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_692:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0837)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(4)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(773036055))
                        goto(Label_0703)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(-767876008))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_692:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_692 = and:int(var_3_692:int, ldc:int(-857210913))
                            var_11_F4 = and:int(ldc:int(25886), ldc:int(-28063))
                            goto(Label_1536)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0584:
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1547)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(256)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(269125786))
                        goto(Label_1398)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1257)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_692:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1131)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_692:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(613311537))
                        goto(Label_0976)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0837)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_692:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(-1990425360))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(1)), ldc:int(0))) {
                            var_3_692 = and:int(var_3_692:int, ldc:int(505233071))
                            goto(Label_0417)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(2147483647)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_692 = and:int(var_3_692:int, ldc:int(-278487065))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_11E = var_9_D1:double
                            goto(Label_0837)
                        }
                    }
                    
                    Label_0703:
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1547)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_692:int, ldc:int(8)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(-1928483163))
                        goto(Label_1398)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1257)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(2)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(-1133128329))
                        goto(Label_1131)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(-785608895))
                        goto(Label_0976)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_692:int, ldc:int(512)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_692 = and:int(var_3_692:int, ldc:int(2084570178))
                            goto(Label_0584)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0417)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_692 = and:int(var_3_692:int, ldc:int(-1171554655))
                            loopcontinue()
                        }
                        
                        var_3_692 = and:int(var_3_692:int, ldc:int(-736149521))
                        var_14_11E = mul:double(ldc:double(0.5), add:double(var_9_D1:double, var_14_11E:double))
                    }
                    
                    Label_0837:
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(906748907))
                        goto(Label_1547)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(-986167913))
                        goto(Label_1398)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_692:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1257)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_692:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1131)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(2)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(1047243011))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(512)), ldc:int(0))) {
                            var_3_692 = and:int(var_3_692:int, ldc:int(1569144384))
                            goto(Label_0703)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_692 = and:int(var_3_692:int, ldc:int(-76476093))
                            goto(Label_0584)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0417)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_692:int, ldc:int(8)), ldc:int(0))) {
                            var_3_692 = and:int(var_3_692:int, ldc:int(851869391))
                            loopcontinue()
                        }
                        
                        var_3_692 = and:int(var_3_692:int, ldc:int(-190373945))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A:int), var_7_A0:double)) {
                                var_11_F4 = and:int(ldc:int(11), ldc:int(11361))
                                goto(Label_1131)
                            }
                        }
                    }
                    
                    Label_0976:
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(497162342))
                        goto(Label_1547)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1398)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1257)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(512)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(1051194692))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_692:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_692 = and:int(var_3_692:int, ldc:int(105704378))
                            goto(Label_0837)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_692:int, ldc:int(8)), ldc:int(0))) {
                            var_3_692 = and:int(var_3_692:int, ldc:int(-1805013607))
                            goto(Label_0703)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_692:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0584)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0417)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(1)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_692 = and:int(var_3_692:int, ldc:int(-446423073))
                        var_11_F4 = and:int(ldc:int(-14516), ldc:int(14515))
                    }
                    
                    Label_1131:
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(2)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(-913573757))
                        goto(Label_1547)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1398)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(908966450))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(1)), ldc:int(0))) {
                            var_3_692 = and:int(var_3_692:int, ldc:int(-859702505))
                            goto(Label_0976)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_692:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_692 = and:int(var_3_692:int, ldc:int(-1374220918))
                            goto(Label_0837)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0703)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0584)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(1)), ldc:int(0))) {
                            var_3_692 = and:int(var_3_692:int, ldc:int(1731155125))
                            goto(Label_0417)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(128)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_692 = and:int(var_3_692:int, ldc:int(-685809777))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_F4:int, ldc:int(0))) {
                                goto(Label_1398)
                            }
                        }
                    }
                    
                    Label_1257:
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1547)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_692:int, ldc:int(1073741824)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(512)), ldc:int(0))) {
                            var_3_692 = and:int(var_3_692:int, ldc:int(1278129402))
                            goto(Label_1131)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(512)), ldc:int(0))) {
                            var_3_692 = and:int(var_3_692:int, ldc:int(-386284247))
                            goto(Label_0976)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(256)), ldc:int(0))) {
                            var_3_692 = and:int(var_3_692:int, ldc:int(1358846736))
                            goto(Label_0837)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0703)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_692:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_692 = and:int(var_3_692:int, ldc:int(1278081216))
                            goto(Label_0584)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_692 = and:int(var_3_692:int, ldc:int(-1877190712))
                            goto(Label_0417)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_692:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_692 = and:int(var_3_692:int, ldc:int(-1005248553))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_11E:double, var_5_8A:int, var_16_122:int)
                            goto(Label_1536)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1398:
                    
                    if (cmpne:boolean(and:int(var_3_692:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(-690980302))
                        goto(Label_1547)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_692:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(-592311526))
                        goto(Label_1257)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1131)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_692:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0976)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(210520121))
                        goto(Label_0837)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(166894101))
                        goto(Label_0703)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0584)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(-613585339))
                        goto(Label_0417)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(256)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_692 = and:int(var_3_692:int, ldc:int(-536879177))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_11E:double, ldc:double(0.0))
                    Label_1536:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_69D = var_5_8A:int
                        
                        if (cmpeq:boolean(var_11_F4:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1547:
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(1777781289))
                        goto(Label_1398)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_692:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1257)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_692:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(1683537473))
                        goto(Label_1131)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(256)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(-416815724))
                        goto(Label_0976)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(128)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(-1382154479))
                        goto(Label_0837)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(2)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(-377746304))
                        goto(Label_0703)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(128)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(2088388460))
                        goto(Label_0584)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_692:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(-510641472))
                        goto(Label_0417)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_692:int, ldc:int(256)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(-952180753))
                        var_17_69D = add:int(var_16_122:int, xor:int(ldc:int(4673), ldc:int(4672)))
                        looporswitchbreak()
                    }
                }
                
                var_3_692 = and:int(var_3_692:int, ldc:int(-194527321))
                
                if (cmple:boolean(var_5_8A = var_17_69D:int, sub:int(var_6_91:int, and:int(ldc:int(147), ldc:int(18477))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0180:
        
        if (cmpne:boolean(and:int(var_3_692:int, ldc:int(8)), ldc:int(0))) {
            var_3_692 = and:int(var_3_692:int, ldc:int(1672442842))
            goto(Label_0108)
        }
    }
}
