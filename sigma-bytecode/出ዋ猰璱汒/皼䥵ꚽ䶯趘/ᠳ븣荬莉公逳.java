public class \u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\u1833\ube23\u836c\u8389\u516c\u9033 {
    public void \u1833\ube23\u836c\u8389\u516c\u9033(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ub19c\u416d\uc84e\u8389\u12cb.\u760c\uc29a\u3c25\u7ce1\u98a4\u47c2 p0) {
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
            putfield:\u760c\uc29a\u3c25\u7ce1\u98a4\u47c2(\u1833\ube23\u836c\u8389\u516c\u9033::\ua3b4\uc246\u6d69\u12cb\u946b\uc910, this:\u1833\ube23\u836c\u8389\u516c\u9033, p0:\u760c\uc29a\u3c25\u7ce1\u98a4\u47c2)
            invokespecial:SimpleChannelInboundHandler(SimpleChannelInboundHandler::<init>, this:\u1833\ube23\u836c\u8389\u516c\u9033)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void channelActive(io.netty.channel.ChannelHandlerContext p0) {
        var_2_5F : int
        var_2_7C0 : int
        var_4_80 : ByteBuf
        var_5_14F : char[]
        var_6_17C : char[]
        var_7_181 : int
        var_8_18A : int
        var_9_26E : char
        
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
            var_2_5F = and:int(ldc:int(46580806), ldc:int(-1844875801))
            
            do {
                if (cmpne:boolean(and:int(var_2_5F:int, ldc:int(1024)), ldc:int(0))) {
                    var_2_5F = and:int(var_2_5F:int, ldc:int(1601085114))
                    invokespecial:void(SimpleChannelInboundHandler::channelActive, this:\u1833\ube23\u836c\u8389\u516c\u9033[expected:SimpleChannelInboundHandler], p0:ChannelHandlerContext)
                }
            } while (cmpne:boolean(and:int(var_2_5F:int, ldc:int(512)), ldc:int(0)))
            
            var_2_7C0 = and:int(var_2_5F:int, ldc:int(263716110))
            var_4_80 = invokestatic:ByteBuf(Unpooled::buffer)
            
            try {
                loop {
                    if (cmpne:boolean(and:int(var_2_7C0:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0279)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_7C0:int, ldc:int(1024)), ldc:int(0))) {
                        var_2_7C0 = and:int(var_2_7C0:int, ldc:int(20392887))
                        goto(Label_0232)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_7C0:int, ldc:int(65536)), ldc:int(0))) {
                        var_2_7C0 = and:int(var_2_7C0:int, ldc:int(-363731454))
                        invokevirtual:ByteBuf(ByteBuf::writeByte, var_4_80:ByteBuf, and:int(ldc:int(16639), ldc:int(6142)))
                    }
                    
                    Label_0177:
                    
                    if (cmpne:boolean(and:int(var_2_7C0:int, ldc:int(65536)), ldc:int(0))) {
                        var_2_7C0 = and:int(var_2_7C0:int, ldc:int(-159592223))
                        goto(Label_0279)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_7C0:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_2_7C0 = and:int(var_2_7C0:int, ldc:int(-895348216))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_2_7C0:int, ldc:int(33554432)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_2_7C0 = and:int(var_2_7C0:int, ldc:int(-1637565302))
                        invokevirtual:ByteBuf(ByteBuf::writeByte, var_4_80:ByteBuf, xor:int(ldc:int(-32120), ldc:int(-32119)))
                    }
                    
                    Label_0232:
                    
                    if (cmpne:boolean(and:int(var_2_7C0:int, ldc:int(1048576)), ldc:int(0))) {
                        var_2_7C0 = and:int(var_2_7C0:int, ldc:int(-1656067719))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_2_7C0:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0177)
                        }
                        
                        if (cmpeq:boolean(and:int(var_2_7C0:int, ldc:int(2147483647)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_2_7C0 = and:int(var_2_7C0:int, ldc:int(-1967418193))
                        invokevirtual:ByteBuf(ByteBuf::writeByte, var_4_80:ByteBuf, xor:int(ldc:int(583), ldc:int(701)))
                    }
                    
                    Label_0279:
                    
                    if (cmpeq:boolean(and:int(var_2_7C0:int, ldc:int(1024)), ldc:int(0))) {
                        var_2_7C0 = and:int(var_2_7C0:int, ldc:int(-1859246068))
                        goto(Label_0232)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_7C0:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0177)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_7C0:int, ldc:int(2147483647)), ldc:int(0))) {
                        looporswitchbreak()
                    }
                    
                    var_2_7C0 = and:int(var_2_7C0:int, ldc:int(-1682098369))
                }
                
                var_2_7C0 = and:int(var_2_7C0:int, ldc:int(716687331))
                var_5_14F = invokevirtual:char[](String::toCharArray, loadelement:String(getstatic:String[](\u1833\ube23\u836c\u8389\u516c\u9033::\ud523\u3bd6\u446c\u3a62\u8413\u647c), and:int(ldc:int(11013), ldc:int(-11014))))
                
                loop {
                    if (cmpeq:boolean(and:int(var_2_7C0:int, ldc:int(536870912)), ldc:int(0))) {
                        var_2_7C0 = and:int(var_2_7C0:int, ldc:int(-410304801))
                        invokevirtual:ByteBuf(ByteBuf::writeShort, var_4_80:ByteBuf, arraylength:int(var_5_14F:char[]))
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_7C0:int, ldc:int(134217728)), ldc:int(0))) {
                        looporswitchbreak()
                    }
                    
                    var_2_7C0 = and:int(var_2_7C0:int, ldc:int(2055884322))
                }
                
                var_2_7C0 = and:int(var_2_7C0:int, ldc:int(707489714))
                var_6_17C = var_5_14F:char[]
                var_7_181 = arraylength:int(var_6_17C:char[])
                var_8_18A = and:int(ldc:int(13092), ldc:int(-13093))
                
                loop {
                    if (cmpeq:boolean(and:int(var_2_7C0:int, ldc:int(1024)), ldc:int(0))) {
                        var_2_7C0 = and:int(var_2_7C0:int, ldc:int(548975907))
                        goto(Label_1878)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_7C0:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1757)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_7C0:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1636)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_7C0:int, ldc:int(2)), ldc:int(0))) {
                        var_2_7C0 = and:int(var_2_7C0:int, ldc:int(-1301699681))
                        goto(Label_1404)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_7C0:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1266)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_7C0:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1125)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_7C0:int, ldc:int(2048)), ldc:int(0))) {
                        var_2_7C0 = and:int(var_2_7C0:int, ldc:int(-1686408317))
                        goto(Label_0993)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_7C0:int, ldc:int(1048576)), ldc:int(0))) {
                        var_2_7C0 = and:int(var_2_7C0:int, ldc:int(69093503))
                        goto(Label_0863)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_7C0:int, ldc:int(512)), ldc:int(0))) {
                        var_2_7C0 = and:int(var_2_7C0:int, ldc:int(-1186859441))
                        goto(Label_0748)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_7C0:int, ldc:int(65536)), ldc:int(0))) {
                        var_2_7C0 = and:int(var_2_7C0:int, ldc:int(-418298264))
                    }
                    else {
                        var_2_7C0 = and:int(var_2_7C0:int, ldc:int(-770044925))
                        
                        if (cmpge:boolean(var_8_18A:int, var_7_181:int)) {
                            invokevirtual:ByteBuf(ByteBuf::writeShort, var_4_80:ByteBuf, add:int(ldc:int(7), mul:int(and:int(ldc:int(4226), ldc:int(778)), invokevirtual:int(String::length, invokevirtual:String(\u8258\ub19c\u0b8e\u98a4\u0800\ud217::\uc910\u67e9\uc29a\ua3b4\u2dcc\u965f, getfield:\u8258\ub19c\u0b8e\u98a4\u0800\ud217(\u760c\uc29a\u3c25\u7ce1\u98a4\u47c2::\ub19c\u51fa\u183a\ucfaf\u59ec\u71f1, getfield:\u760c\uc29a\u3c25\u7ce1\u98a4\u47c2(\u1833\ube23\u836c\u8389\u516c\u9033::\ua3b4\uc246\u6d69\u12cb\u946b\uc910, this:\u1833\ube23\u836c\u8389\u516c\u9033)))))))
                            goto(Label_0748)
                        }
                    }
                    
                    Label_0526:
                    
                    if (cmpne:boolean(and:int(var_2_7C0:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1878)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_7C0:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1757)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_7C0:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1636)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_7C0:int, ldc:int(2)), ldc:int(0))) {
                        var_2_7C0 = and:int(var_2_7C0:int, ldc:int(1781985956))
                        goto(Label_1404)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_7C0:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1266)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_7C0:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1125)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_7C0:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0993)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_7C0:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0863)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_7C0:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_2_7C0 = and:int(var_2_7C0:int, ldc:int(-2102296850))
                        goto(Label_0748)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_7C0:int, ldc:int(512)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_2_7C0 = and:int(var_2_7C0:int, ldc:int(-1429941230))
                    var_9_26E = loadelement:char(var_6_17C:char[], var_8_18A:int)
                    Label_0624:
                    
                    if (cmpne:boolean(and:int(var_2_7C0:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1568)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_7C0:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1518)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_7C0:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_2_7C0 = and:int(var_2_7C0:int, ldc:int(-1421697762))
                        invokevirtual:ByteBuf(ByteBuf::writeChar, var_4_80:ByteBuf, var_9_26E:char[expected:int])
                    }
                    
                    Label_0658:
                    
                    if (cmpne:boolean(and:int(var_2_7C0:int, ldc:int(512)), ldc:int(0))) {
                        var_2_7C0 = and:int(var_2_7C0:int, ldc:int(338633866))
                        goto(Label_1568)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_7C0:int, ldc:int(536870912)), ldc:int(0))) {
                        var_2_7C0 = and:int(var_2_7C0:int, ldc:int(-901156051))
                        goto(Label_1518)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_7C0:int, ldc:int(134217728)), ldc:int(0))) {
                        var_2_7C0 = and:int(var_2_7C0:int, ldc:int(2004905345))
                        goto(Label_0624)
                    }
                    
                    var_2_7C0 = and:int(var_2_7C0:int, ldc:int(1053763058))
                    inc:int(var_8_18A, ldc:int(1))
                    loopcontinue()
                    Label_0748:
                    
                    if (cmpne:boolean(and:int(var_2_7C0:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1878)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_7C0:int, ldc:int(134217728)), ldc:int(0))) {
                        var_2_7C0 = and:int(var_2_7C0:int, ldc:int(-378550443))
                        goto(Label_1757)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_7C0:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1636)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_7C0:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1404)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_7C0:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1266)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_7C0:int, ldc:int(536870912)), ldc:int(0))) {
                        var_2_7C0 = and:int(var_2_7C0:int, ldc:int(-500443902))
                        goto(Label_1125)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_7C0:int, ldc:int(65536)), ldc:int(0))) {
                        var_2_7C0 = and:int(var_2_7C0:int, ldc:int(137616745))
                        goto(Label_0993)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_7C0:int, ldc:int(536870912)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_2_7C0:int, ldc:int(2048)), ldc:int(0))) {
                            var_2_7C0 = and:int(var_2_7C0:int, ldc:int(-1838368313))
                            goto(Label_0526)
                        }
                        
                        if (cmpeq:boolean(and:int(var_2_7C0:int, ldc:int(2)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_2_7C0 = and:int(var_2_7C0:int, ldc:int(-1427958158))
                        invokevirtual:ByteBuf(ByteBuf::writeByte, var_4_80:ByteBuf, ldc:int(127))
                    }
                    
                    Label_0863:
                    
                    if (cmpne:boolean(and:int(var_2_7C0:int, ldc:int(512)), ldc:int(0))) {
                        var_2_7C0 = and:int(var_2_7C0:int, ldc:int(2138902252))
                        goto(Label_1878)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_7C0:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1757)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_7C0:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_2_7C0 = and:int(var_2_7C0:int, ldc:int(1349981347))
                        goto(Label_1636)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_7C0:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1404)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_7C0:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1266)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_7C0:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1125)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_7C0:int, ldc:int(512)), ldc:int(0))) {
                        var_2_7C0 = and:int(var_2_7C0:int, ldc:int(1119802745))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_2_7C0:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0748)
                        }
                        
                        if (cmpeq:boolean(and:int(var_2_7C0:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_2_7C0 = and:int(var_2_7C0:int, ldc:int(-2044728249))
                            goto(Label_0526)
                        }
                        
                        if (cmpeq:boolean(and:int(var_2_7C0:int, ldc:int(1024)), ldc:int(0))) {
                            var_2_7C0 = and:int(var_2_7C0:int, ldc:int(1940539504))
                            loopcontinue()
                        }
                        
                        var_2_7C0 = and:int(var_2_7C0:int, ldc:int(-1904570721))
                        var_5_14F = invokevirtual:char[](String::toCharArray, invokevirtual:String(\u8258\ub19c\u0b8e\u98a4\u0800\ud217::\uc910\u67e9\uc29a\ua3b4\u2dcc\u965f, getfield:\u8258\ub19c\u0b8e\u98a4\u0800\ud217(\u760c\uc29a\u3c25\u7ce1\u98a4\u47c2::\ub19c\u51fa\u183a\ucfaf\u59ec\u71f1, getfield:\u760c\uc29a\u3c25\u7ce1\u98a4\u47c2(\u1833\ube23\u836c\u8389\u516c\u9033::\ua3b4\uc246\u6d69\u12cb\u946b\uc910, this:\u1833\ube23\u836c\u8389\u516c\u9033))))
                    }
                    
                    Label_0993:
                    
                    if (cmpne:boolean(and:int(var_2_7C0:int, ldc:int(134217728)), ldc:int(0))) {
                        var_2_7C0 = and:int(var_2_7C0:int, ldc:int(1913401823))
                        goto(Label_1878)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_7C0:int, ldc:int(536870912)), ldc:int(0))) {
                        var_2_7C0 = and:int(var_2_7C0:int, ldc:int(817366179))
                        goto(Label_1757)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_7C0:int, ldc:int(2048)), ldc:int(0))) {
                        var_2_7C0 = and:int(var_2_7C0:int, ldc:int(646254992))
                        goto(Label_1636)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_7C0:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1404)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_7C0:int, ldc:int(512)), ldc:int(0))) {
                        var_2_7C0 = and:int(var_2_7C0:int, ldc:int(1459982599))
                        goto(Label_1266)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_7C0:int, ldc:int(1048576)), ldc:int(0))) {
                        var_2_7C0 = and:int(var_2_7C0:int, ldc:int(-69519736))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_2_7C0:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0863)
                        }
                        
                        if (cmpne:boolean(and:int(var_2_7C0:int, ldc:int(1048576)), ldc:int(0))) {
                            var_2_7C0 = and:int(var_2_7C0:int, ldc:int(-1069358018))
                            goto(Label_0748)
                        }
                        
                        if (cmpne:boolean(and:int(var_2_7C0:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0526)
                        }
                        
                        if (cmpne:boolean(and:int(var_2_7C0:int, ldc:int(536870912)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_2_7C0 = and:int(var_2_7C0:int, ldc:int(-1961296453))
                        invokevirtual:ByteBuf(ByteBuf::writeShort, var_4_80:ByteBuf, arraylength:int(var_5_14F:char[]))
                    }
                    
                    Label_1125:
                    
                    if (cmpne:boolean(and:int(var_2_7C0:int, ldc:int(512)), ldc:int(0))) {
                        var_2_7C0 = and:int(var_2_7C0:int, ldc:int(-591364367))
                        goto(Label_1878)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_7C0:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1757)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_7C0:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1636)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_7C0:int, ldc:int(1048576)), ldc:int(0))) {
                        var_2_7C0 = and:int(var_2_7C0:int, ldc:int(452584849))
                        goto(Label_1404)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_7C0:int, ldc:int(536870912)), ldc:int(0))) {
                        var_2_7C0 = and:int(var_2_7C0:int, ldc:int(-1888900348))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_2_7C0:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0993)
                        }
                        
                        if (cmpne:boolean(and:int(var_2_7C0:int, ldc:int(65536)), ldc:int(0))) {
                            var_2_7C0 = and:int(var_2_7C0:int, ldc:int(-244534351))
                            goto(Label_0863)
                        }
                        
                        if (cmpne:boolean(and:int(var_2_7C0:int, ldc:int(2048)), ldc:int(0))) {
                            var_2_7C0 = and:int(var_2_7C0:int, ldc:int(-1238689215))
                            goto(Label_0748)
                        }
                        
                        if (cmpeq:boolean(and:int(var_2_7C0:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0526)
                        }
                        
                        if (cmpne:boolean(and:int(var_2_7C0:int, ldc:int(134217728)), ldc:int(0))) {
                            var_2_7C0 = and:int(var_2_7C0:int, ldc:int(644353911))
                            loopcontinue()
                        }
                        
                        var_2_7C0 = and:int(var_2_7C0:int, ldc:int(535649447))
                        var_6_17C = var_5_14F:char[]
                        var_7_181 = arraylength:int(var_6_17C:char[])
                        var_8_18A = and:int(ldc:int(14435), ldc:int(-14948))
                    }
                    
                    Label_1266:
                    
                    if (cmpne:boolean(and:int(var_2_7C0:int, ldc:int(536870912)), ldc:int(0))) {
                        var_2_7C0 = and:int(var_2_7C0:int, ldc:int(276436524))
                        goto(Label_1878)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_7C0:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1757)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_7C0:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1636)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_7C0:int, ldc:int(33554432)), ldc:int(0))) {
                        var_2_7C0 = and:int(var_2_7C0:int, ldc:int(59497031))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_2_7C0:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_1125)
                        }
                        
                        if (cmpne:boolean(and:int(var_2_7C0:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_2_7C0 = and:int(var_2_7C0:int, ldc:int(161031585))
                            goto(Label_0993)
                        }
                        
                        if (cmpeq:boolean(and:int(var_2_7C0:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_2_7C0 = and:int(var_2_7C0:int, ldc:int(-1667147034))
                            goto(Label_0863)
                        }
                        
                        if (cmpne:boolean(and:int(var_2_7C0:int, ldc:int(536870912)), ldc:int(0))) {
                            var_2_7C0 = and:int(var_2_7C0:int, ldc:int(-1735366880))
                            goto(Label_0748)
                        }
                        
                        if (cmpne:boolean(and:int(var_2_7C0:int, ldc:int(536870912)), ldc:int(0))) {
                            var_2_7C0 = and:int(var_2_7C0:int, ldc:int(1719125875))
                            goto(Label_0526)
                        }
                        
                        if (cmpne:boolean(and:int(var_2_7C0:int, ldc:int(134217728)), ldc:int(0))) {
                            var_2_7C0 = and:int(var_2_7C0:int, ldc:int(-738717250))
                            loopcontinue()
                        }
                        
                        var_2_7C0 = and:int(var_2_7C0:int, ldc:int(-1823529354))
                        
                        if (cmpge:boolean(var_8_18A:int, var_7_181:int)) {
                            invokevirtual:ByteBuf(ByteBuf::writeInt, var_4_80:ByteBuf, invokevirtual:int(\u8258\ub19c\u0b8e\u98a4\u0800\ud217::\ua6bd\ubff1\u8c8a\u3776\uc84e\u9af2, getfield:\u8258\ub19c\u0b8e\u98a4\u0800\ud217(\u760c\uc29a\u3c25\u7ce1\u98a4\u47c2::\ub19c\u51fa\u183a\ucfaf\u59ec\u71f1, getfield:\u760c\uc29a\u3c25\u7ce1\u98a4\u47c2(\u1833\ube23\u836c\u8389\u516c\u9033::\ua3b4\uc246\u6d69\u12cb\u946b\uc910, this:\u1833\ube23\u836c\u8389\u516c\u9033))))
                            goto(Label_1636)
                        }
                    }
                    
                    Label_1404:
                    
                    if (cmpne:boolean(and:int(var_2_7C0:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1878)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_7C0:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1757)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_7C0:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_2_7C0 = and:int(var_2_7C0:int, ldc:int(1675618117))
                        goto(Label_1636)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_7C0:int, ldc:int(134217728)), ldc:int(0))) {
                        var_2_7C0 = and:int(var_2_7C0:int, ldc:int(-705771697))
                        goto(Label_1266)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_7C0:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_2_7C0 = and:int(var_2_7C0:int, ldc:int(1661029826))
                        goto(Label_1125)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_7C0:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0993)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_7C0:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0863)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_7C0:int, ldc:int(1024)), ldc:int(0))) {
                        var_2_7C0 = and:int(var_2_7C0:int, ldc:int(-571543602))
                        goto(Label_0748)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_7C0:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0526)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_7C0:int, ldc:int(33554432)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_2_7C0 = and:int(var_2_7C0:int, ldc:int(1654923207))
                    var_9_26E = loadelement:char(var_6_17C:char[], var_8_18A:int)
                    Label_1518:
                    
                    if (cmpeq:boolean(and:int(var_2_7C0:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_2_7C0 = and:int(var_2_7C0:int, ldc:int(-1953602750))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_2_7C0:int, ldc:int(1024)), ldc:int(0))) {
                            var_2_7C0 = and:int(var_2_7C0:int, ldc:int(-2091570575))
                            goto(Label_0658)
                        }
                        
                        if (cmpne:boolean(and:int(var_2_7C0:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0624)
                        }
                        
                        var_2_7C0 = and:int(var_2_7C0:int, ldc:int(-1215969922))
                        invokevirtual:ByteBuf(ByteBuf::writeChar, var_4_80:ByteBuf, var_9_26E:char[expected:int])
                    }
                    
                    Label_1568:
                    
                    if (cmpeq:boolean(and:int(var_2_7C0:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1518)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_7C0:int, ldc:int(1048576)), ldc:int(0))) {
                        var_2_7C0 = and:int(var_2_7C0:int, ldc:int(-486460034))
                        goto(Label_0658)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_7C0:int, ldc:int(2048)), ldc:int(0))) {
                        var_2_7C0 = and:int(var_2_7C0:int, ldc:int(1935228739))
                        goto(Label_0624)
                    }
                    
                    var_2_7C0 = and:int(var_2_7C0:int, ldc:int(-365476854))
                    inc:int(var_8_18A, ldc:int(1))
                    goto(Label_1266)
                    Label_1636:
                    
                    if (cmpeq:boolean(and:int(var_2_7C0:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_2_7C0 = and:int(var_2_7C0:int, ldc:int(-1261502177))
                        goto(Label_1878)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_7C0:int, ldc:int(134217728)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_2_7C0:int, ldc:int(512)), ldc:int(0))) {
                            var_2_7C0 = and:int(var_2_7C0:int, ldc:int(2037332166))
                            goto(Label_1404)
                        }
                        
                        if (cmpeq:boolean(and:int(var_2_7C0:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_1266)
                        }
                        
                        if (cmpne:boolean(and:int(var_2_7C0:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_1125)
                        }
                        
                        if (cmpne:boolean(and:int(var_2_7C0:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0993)
                        }
                        
                        if (cmpne:boolean(and:int(var_2_7C0:int, ldc:int(2048)), ldc:int(0))) {
                            var_2_7C0 = and:int(var_2_7C0:int, ldc:int(570286604))
                            goto(Label_0863)
                        }
                        
                        if (cmpeq:boolean(and:int(var_2_7C0:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0748)
                        }
                        
                        if (cmpeq:boolean(and:int(var_2_7C0:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0526)
                        }
                        
                        if (cmpne:boolean(and:int(var_2_7C0:int, ldc:int(536870912)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_2_7C0 = and:int(var_2_7C0:int, ldc:int(-1816574217))
                        invokeinterface:ChannelFuture(ChannelFuture::addListener, invokeinterface:ChannelFuture(Channel::writeAndFlush, invokeinterface:Channel(ChannelHandlerContext::channel, p0:ChannelHandlerContext), var_4_80:ByteBuf[expected:Object]), getstatic:ChannelFutureListener[expected:GenericFutureListener](ChannelFutureListener::CLOSE_ON_FAILURE))
                    }
                    
                    Label_1757:
                    
                    if (cmpeq:boolean(and:int(var_2_7C0:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_2_7C0 = and:int(var_2_7C0:int, ldc:int(-717122806))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_2_7C0:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_1636)
                        }
                        
                        if (cmpeq:boolean(and:int(var_2_7C0:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_1404)
                        }
                        
                        if (cmpne:boolean(and:int(var_2_7C0:int, ldc:int(536870912)), ldc:int(0))) {
                            var_2_7C0 = and:int(var_2_7C0:int, ldc:int(1587332343))
                            goto(Label_1266)
                        }
                        
                        if (cmpeq:boolean(and:int(var_2_7C0:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_1125)
                        }
                        
                        if (cmpeq:boolean(and:int(var_2_7C0:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0993)
                        }
                        
                        if (cmpne:boolean(and:int(var_2_7C0:int, ldc:int(2048)), ldc:int(0))) {
                            var_2_7C0 = and:int(var_2_7C0:int, ldc:int(1659434425))
                            goto(Label_0863)
                        }
                        
                        if (cmpne:boolean(and:int(var_2_7C0:int, ldc:int(536870912)), ldc:int(0))) {
                            var_2_7C0 = and:int(var_2_7C0:int, ldc:int(1156405889))
                            goto(Label_0748)
                        }
                        
                        if (cmpne:boolean(and:int(var_2_7C0:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0526)
                        }
                        
                        if (cmpne:boolean(and:int(var_2_7C0:int, ldc:int(512)), ldc:int(0))) {
                            var_2_7C0 = and:int(var_2_7C0:int, ldc:int(-1181794710))
                            loopcontinue()
                        }
                        
                        var_2_7C0 = and:int(var_2_7C0:int, ldc:int(-363359014))
                        invokevirtual:boolean(ByteBuf::release, var_4_80:ByteBuf)
                    }
                    
                    Label_1878:
                    
                    if (cmpne:boolean(and:int(var_2_7C0:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_2_7C0 = and:int(var_2_7C0:int, ldc:int(-674692987))
                        goto(Label_1757)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_7C0:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_2_7C0 = and:int(var_2_7C0:int, ldc:int(1402222317))
                        goto(Label_1636)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_7C0:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1404)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_7C0:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1266)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_7C0:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1125)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_7C0:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0993)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_7C0:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0863)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_7C0:int, ldc:int(2048)), ldc:int(0))) {
                        var_2_7C0 = and:int(var_2_7C0:int, ldc:int(1847454850))
                        goto(Label_0748)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_7C0:int, ldc:int(2)), ldc:int(0))) {
                        var_2_7C0 = and:int(var_2_7C0:int, ldc:int(406935330))
                        goto(Label_0526)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_7C0:int, ldc:int(65536)), ldc:int(0))) {
                        looporswitchbreak()
                    }
                }
                
                var_2_7C0 = and:int(var_2_7C0:int, ldc:int(-1639035642))
            }
            finally {
                invokevirtual:boolean(ByteBuf::release, var_4_80:ByteBuf)
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void channelRead0(io.netty.channel.ChannelHandlerContext p0, io.netty.buffer.ByteBuf p1) {
        var_7_B2 : String[]
        var_9_F6 : String
        var_10_102 : String
        var_11_112 : int
        var_12_122 : int
        
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
            
            if (cmpeq:boolean(invokevirtual:short[expected:int](ByteBuf::readUnsignedByte, p1:ByteBuf), xor:int(ldc:int(16614), ldc:int(16409)))) {
                var_7_B2 = checkcast:String[](java.lang.String[].class, invokestatic:Object[][expected:String[]](Iterables::toArray, invokevirtual:Iterable(Splitter::split, invokestatic:Splitter(\u8389\ub18d\u6b5f\u67e9\uc229\ua61f::\u3d4b\u71f1\u527a\u3d4b\u7c6b\u5245), initobject:String[expected:CharSequence](String::<init>, invokevirtual:byte[](ByteBuf::array, invokevirtual:ByteBuf(ByteBuf::readBytes, p1:ByteBuf, mul:int(invokevirtual:short[expected:int](ByteBuf::readShort, p1:ByteBuf), and:int(ldc:int(1250), ldc:int(2062))))), getstatic:Charset(StandardCharsets::UTF_16BE))), ldc:Class<String>(java.lang.String.class)))
                
                if (invokevirtual:boolean(String::equals, loadelement:String(getstatic:String[](\u1833\ube23\u836c\u8389\u516c\u9033::\ud523\u3bd6\u446c\u3a62\u8413\u647c), xor:int(ldc:int(-24573), ldc:int(-24574))), loadelement:String(var_7_B2:String[], and:int(ldc:int(-5319), ldc:int(5318))))) {
                    invokestatic:int(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\u9a18\u4d85\u71f1\ub83f\u92ff\u16f6, loadelement:String(var_7_B2:String[], and:int(ldc:int(33), ldc:int(19649))), and:int(ldc:int(-1831), ldc:int(1830)))
                    var_9_F6 = loadelement:String(var_7_B2:String[], xor:int(ldc:int(8305), ldc:int(8307)))
                    var_10_102 = loadelement:String(var_7_B2:String[], and:int(ldc:int(15491), ldc:int(3)))
                    var_11_112 = invokestatic:int(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\u9a18\u4d85\u71f1\ub83f\u92ff\u16f6, loadelement:String(var_7_B2:String[], and:int(ldc:int(644), ldc:int(16398))), ldc:int(-1))
                    var_12_122 = invokestatic:int(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\u9a18\u4d85\u71f1\ub83f\u92ff\u16f6, loadelement:String(var_7_B2:String[], xor:int(ldc:int(8258), ldc:int(8263))), ldc:int(-1))
                    putfield:int(\ub8be\u071d\u527a\u3711\ubff1\u759a::\u8350\u7006\uf94d\u5bc4\u1833\u071d, getfield:\ub8be\u071d\u527a\u3711\ubff1\u759a(\u760c\uc29a\u3c25\u7ce1\u98a4\u47c2::\u93a2\ucfaf\u873d\u3504\uc229\uc31c, getfield:\u760c\uc29a\u3c25\u7ce1\u98a4\u47c2(\u1833\ube23\u836c\u8389\u516c\u9033::\ua3b4\uc246\u6d69\u12cb\u946b\uc910, this:\u1833\ube23\u836c\u8389\u516c\u9033)), ldc:int(-1))
                    putfield:ITextComponent(\ub8be\u071d\u527a\u3711\ubff1\u759a::\u965f\u1833\u0b8e\u5654\uc238\u12b2, getfield:\ub8be\u071d\u527a\u3711\ubff1\u759a(\u760c\uc29a\u3c25\u7ce1\u98a4\u47c2::\u93a2\ucfaf\u873d\u3504\uc229\uc31c, getfield:\u760c\uc29a\u3c25\u7ce1\u98a4\u47c2(\u1833\ube23\u836c\u8389\u516c\u9033::\ua3b4\uc246\u6d69\u12cb\u946b\uc910, this:\u1833\ube23\u836c\u8389\u516c\u9033)), initobject:StringTextComponent(StringTextComponent::<init>, var_9_F6:String))
                    putfield:ITextComponent(\ub8be\u071d\u527a\u3711\ubff1\u759a::\u839e\u6b5f\u59ec\u47c2\u52d3\uc84e, getfield:\ub8be\u071d\u527a\u3711\ubff1\u759a(\u760c\uc29a\u3c25\u7ce1\u98a4\u47c2::\u93a2\ucfaf\u873d\u3504\uc229\uc31c, getfield:\u760c\uc29a\u3c25\u7ce1\u98a4\u47c2(\u1833\ube23\u836c\u8389\u516c\u9033::\ua3b4\uc246\u6d69\u12cb\u946b\uc910, this:\u1833\ube23\u836c\u8389\u516c\u9033)), initobject:StringTextComponent(StringTextComponent::<init>, var_10_102:String))
                    putfield:ITextComponent(\ub8be\u071d\u527a\u3711\ubff1\u759a::\u4e72\u6b0d\u7049\ud523\ubb2b\uae87, getfield:\ub8be\u071d\u527a\u3711\ubff1\u759a(\u760c\uc29a\u3c25\u7ce1\u98a4\u47c2::\u93a2\ucfaf\u873d\u3504\uc229\uc31c, getfield:\u760c\uc29a\u3c25\u7ce1\u98a4\u47c2(\u1833\ube23\u836c\u8389\u516c\u9033::\ua3b4\uc246\u6d69\u12cb\u946b\uc910, this:\u1833\ube23\u836c\u8389\u516c\u9033)), invokestatic:ITextComponent(\u8389\ub18d\u6b5f\u67e9\uc229\ua61f::\u624e\u52d3\ud12e\u7c6b\u983f\ua562, var_11_112:int, var_12_122:int))
                }
            }
            
            invokeinterface:ChannelFuture(ChannelHandlerContext::close, p0:ChannelHandlerContext)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void exceptionCaught(io.netty.channel.ChannelHandlerContext p0, java.lang.Throwable p1) {
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
            invokeinterface:ChannelFuture(ChannelHandlerContext::close, p0:ChannelHandlerContext)
            return:void()
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
            invokevirtual:void(\u1833\ube23\u836c\u8389\u516c\u9033::channelRead0, this:\u1833\ube23\u836c\u8389\u516c\u9033, p0:ChannelHandlerContext, checkcast:ByteBuf(io.netty.buffer.ByteBuf.class, p1:Object[expected:ByteBuf]))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_242 : int
        expr_6E : int [generated]
        stack_A5_0 : byte[] [generated]
        stack_A7_0 : byte[] [generated]
        stack_D6_0 : byte[] [generated]
        stack_D8_0 : byte[] [generated]
        stack_106_0 : byte[] [generated]
        stack_108_0 : byte[] [generated]
        stack_134_0 : byte[] [generated]
        stack_1B3_0 : byte[] [generated]
        stack_1EE_0 : byte[] [generated]
        stack_255_0 : byte[] [generated]
        stack_2D1_0 : byte[] [generated]
        var_4_195 : int
        var_3_19A : byte[]
        var_5_19B : int
        var_0_26E : int
        expr_255 : byte [generated]
        stack_29C_2 : byte [generated]
        stack_271_0 : byte [generated]
        var_2_A5 : byte[]
        expr_A9 : int [generated]
        var_3_1DC : byte[]
        var_5_1DD : int
        expr_D8 : int [generated]
        expr_108 : int [generated]
        var_3_2BF : byte[]
        var_5_2C0 : int
        expr_2D4 : byte [generated]
        var_3_140 : String
        stack_18E_0 : String[] [generated]
        expr_152 : String[] [generated]
        
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
        var_0_242 = and:int(ldc:int(781964955), ldc:int(532341424))
        expr_6E = arraylength:int(stack_A5_0 = stack_A7_0 = stack_D6_0 = stack_D8_0 = stack_106_0 = stack_108_0 = stack_134_0 = stack_1B3_0 = stack_1EE_0 = stack_255_0 = stack_2D1_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("OcAAfz+7hYRYyakype4B")))
        
        if (cmpeq:boolean(expr_6E:int, ldc:int(0))) {
            goto(Label_0115)
        }
        
        var_4_195 = expr_6E:int
        var_3_19A = newarray:byte[](byte.class, expr_6E:int)
        var_5_19B = expr_6E:int
        Label_0413:
        
        while (cmpne:boolean(and:int(var_0_242:int, ldc:int(33554432)), ldc:int(0))) {
            var_0_242 = and:int(var_0_242:int, ldc:int(513329836))
            var_5_19B = add:int(var_5_19B:int, ldc:int(-1))
            storeelement:byte(var_3_19A:byte[], var_5_19B:int, xor:byte(loadelement:byte(stack_1B3_0:byte[], var_5_19B:int), ldc:byte(57)))
            
            if (cmpne:boolean(var_5_19B:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A7_0 = stack_A5_0 = stack_D6_0 = stack_D8_0 = stack_106_0 = stack_108_0 = stack_134_0 = stack_1B3_0 = stack_1EE_0 = stack_255_0 = stack_2D1_0 = var_3_19A:byte[]
            goto(Label_0115)
        }
        
        Label_0565:
        
        while (cmpne:boolean(and:int(var_0_242:int, ldc:int(16384)), ldc:int(0))) {
            var_0_26E = and:int(var_0_242:int, ldc:int(-292421898))
            var_5_19B = add:int(var_5_19B:int, ldc:int(-1))
            expr_255 = stack_29C_2 = loadelement(stack_255_0, var_5_19B)
            
            if (cmplt:boolean(add:int(add:int(var_5_19B:int, ldc:int(4)), neg:int(var_4_195:int)), ldc:int(0))) {
                stack_29C_2 = stack_271_0 = add:byte(expr_255:byte, loadelement:byte(var_3_19A:byte[], add:int(var_5_19B:int, ldc:int(4))))
                goto(Label_0641)
            }
            
            Label_0610:
            
            if (cmpne:boolean(and:int(var_0_26E:int, ldc:int(512)), ldc:int(0))) {
                var_0_26E = and:int(var_0_26E:int, ldc:int(261279647))
                stack_29C_2 = stack_271_0 = add:byte(expr_255:byte, ldc:byte(4))
            }
            
            Label_0641:
            
            if (cmpeq:boolean(and:int(var_0_26E:int, ldc:int(33554432)), ldc:int(0))) {
                var_0_26E = and:int(var_0_26E:int, ldc:int(1497219334))
                goto(Label_0610)
            }
            
            var_0_242 = and:int(var_0_26E:int, ldc:int(-1348483429))
            storeelement:byte(var_3_19A:byte[], var_5_19B:int, stack_29C_2:byte)
            
            if (cmpne:boolean(var_5_19B:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A7_0 = stack_A5_0 = stack_D6_0 = stack_D8_0 = stack_106_0 = stack_108_0 = stack_134_0 = stack_1B3_0 = stack_1EE_0 = stack_255_0 = stack_2D1_0 = var_3_19A:byte[]
            goto(Label_0221)
        }
        
        var_0_242 = and:int(var_0_242:int, ldc:int(-1765421019))
        goto(Label_0413)
        Label_0115:
        
        if (cmpeq:boolean(and:int(var_0_242:int, ldc:int(67108864)), ldc:int(0))) {
            var_0_242 = and:int(var_0_242:int, ldc:int(571585516))
            goto(Label_0269)
        }
        
        if (cmpeq:boolean(and:int(var_0_242:int, ldc:int(67108864)), ldc:int(0))) {
            goto(Label_0221)
        }
        
        if (cmpne:boolean(and:int(var_0_242:int, ldc:int(32)), ldc:int(0))) {
            var_0_242 = and:int(var_0_242:int, ldc:int(-1810335750))
        }
        else {
            var_0_242 = and:int(var_0_242:int, ldc:int(798612440))
            var_2_A5 = stack_A5_0:byte[]
            expr_A9 = add:int(arraylength:int(stack_A7_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_A9:int, ldc:int(0))) {
                var_3_1DC = newarray:byte[](byte.class, expr_A9:int)
                var_5_1DD = expr_A9:int
                
                loop {
                    var_0_242 = and:int(var_0_242:int, ldc:int(-7089188))
                    var_5_1DD = add:int(var_5_1DD:int, ldc:int(-1))
                    storeelement:byte(var_3_1DC:byte[], var_5_1DD:int, add:int(shl:int(loadelement:byte(stack_1EE_0:byte[], var_5_1DD:int), ldc:int(6)), and:int(shr:int(loadelement:byte(var_2_A5:byte[], add:int(var_5_1DD:int, xor:int(ldc:int(6177), ldc:int(6176)))), ldc:int(2)), and:int(ldc:int(8255), ldc:int(20543)))))
                    
                    if (cmpne:boolean(var_5_1DD:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_A7_0 = stack_A5_0 = stack_D6_0 = stack_D8_0 = stack_106_0 = stack_108_0 = stack_134_0 = stack_1B3_0 = stack_1EE_0 = stack_255_0 = stack_2D1_0 = var_3_1DC:byte[]
            }
        }
        
        Label_0174:
        
        if (cmpeq:boolean(and:int(var_0_242:int, ldc:int(1048576)), ldc:int(0))) {
            var_0_242 = and:int(var_0_242:int, ldc:int(-1761857226))
            goto(Label_0269)
        }
        
        if (cmpne:boolean(and:int(var_0_242:int, ldc:int(8388608)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_242:int, ldc:int(64)), ldc:int(0))) {
                goto(Label_0115)
            }
            
            var_0_242 = and:int(var_0_242:int, ldc:int(2143287191))
            expr_D8 = arraylength:int(stack_D8_0:byte[])
            
            if (cmpne:boolean(expr_D8:int, ldc:int(0))) {
                var_4_195 = expr_D8:int
                var_3_19A = newarray:byte[](byte.class, expr_D8:int)
                var_5_19B = expr_D8:int
                goto(Label_0565)
            }
        }
        
        Label_0221:
        
        if (cmpne:boolean(and:int(var_0_242:int, ldc:int(8192)), ldc:int(0))) {
            var_0_242 = and:int(var_0_242:int, ldc:int(685785699))
        }
        else {
            if (cmpne:boolean(and:int(var_0_242:int, ldc:int(4194304)), ldc:int(0))) {
                goto(Label_0174)
            }
            
            if (cmpeq:boolean(and:int(var_0_242:int, ldc:int(32768)), ldc:int(0))) {
                goto(Label_0115)
            }
            
            var_0_242 = and:int(var_0_242:int, ldc:int(531886835))
            expr_108 = arraylength:int(stack_108_0:byte[])
            
            if (cmpne:boolean(expr_108:int, ldc:int(0))) {
                var_3_2BF = newarray:byte[](byte.class, expr_108:int)
                var_5_2C0 = expr_108:int
                
                loop {
                    var_0_242 = and:int(var_0_242:int, ldc:int(-287519787))
                    var_5_2C0 = add:int(var_5_2C0:int, ldc:int(-1))
                    expr_2D4 = add:byte(loadelement:byte(stack_2D1_0:byte[], var_5_2C0:int), ldc:byte(65))
                    storeelement:byte(var_3_2BF:byte[], var_5_2C0:int, or:int(and:int(shl:int(expr_2D4:byte, xor:int(ldc:int(16390), ldc:int(16386))), ldc:int(-16)), and:int(shr:int(expr_2D4:byte[expected:int], xor:int(ldc:int(4114), ldc:int(4118))), ldc:int(15))))
                    
                    if (cmpne:boolean(var_5_2C0:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_A7_0 = stack_A5_0 = stack_D6_0 = stack_D8_0 = stack_106_0 = stack_108_0 = stack_134_0 = stack_1B3_0 = stack_1EE_0 = stack_255_0 = stack_2D1_0 = var_3_2BF:byte[]
            }
        }
        
        Label_0269:
        
        if (cmpne:boolean(and:int(var_0_242:int, ldc:int(4194304)), ldc:int(0))) {
            var_0_242 = and:int(var_0_242:int, ldc:int(2105709756))
            goto(Label_0221)
        }
        
        if (cmpeq:boolean(and:int(var_0_242:int, ldc:int(128)), ldc:int(0))) {
            goto(Label_0174)
        }
        
        if (cmpne:boolean(and:int(var_0_242:int, ldc:int(512)), ldc:int(0))) {
            var_3_140 = initobject:String(String::<init>, stack_134_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_18E_0 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(161), ldc:int(163)))
            expr_152 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(2306), ldc:int(4207)))
            storeelement:String(expr_152:String[], and:int(ldc:int(-3888), ldc:int(2599)), invokevirtual:String[expected:String](String::substring, var_3_140:String, and:int(ldc:int(22728), ldc:int(-22730)), and:int(ldc:int(18635), ldc:int(8751))))
            storeelement:String(expr_152:String[], and:int(ldc:int(47), ldc:int(28737)), invokevirtual:String[expected:String](String::substring, var_3_140:String, xor:int(ldc:int(16527), ldc:int(16516)), and:int(ldc:int(18061), ldc:int(2093))))
            putstatic:String[](\u1833\ube23\u836c\u8389\u516c\u9033::\ud523\u3bd6\u446c\u3a62\u8413\u647c, expr_152:String[])
            return:void()
        }
        
        goto(Label_0115)
    }
    
    public void \ub83f\u6cfe\u7e3f\u4975\u62da\u5140(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_614 : int
        var_5_8A : int
        var_6_91 : int
        var_7_A0 : double
        var_9_D0 : double
        var_3_E2 : int
        var_11_F3 : int
        var_14_11D : double
        var_16_121 : int
        var_12_119 : double
        var_17_61F : int
        
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
        var_3_614 = and:int(ldc:int(-1395992216), ldc:int(-337945095))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u1833\ube23\u836c\u8389\u516c\u9033[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0180)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(16384)), ldc:int(0))) {
            var_3_614 = and:int(var_3_614:int, ldc:int(-1306811919))
        }
        else {
            var_3_614 = and:int(var_3_614:int, ldc:int(-53741778))
            var_5_8A = and:int(ldc:int(-7068), ldc:int(7067))
            var_6_91 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_A0 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(27043), ldc:int(-27052)))
            invokestatic:int(m::a)
            
            loop {
                var_9_D0 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_E2 = and:int(var_3_614:int, ldc:int(-1151610592))
                    var_9_D0 = sub:double(var_7_A0:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_F3 = var_5_8A:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_F3:int, sub:int(var_6_91:int, xor:int(ldc:int(384), ldc:int(385)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_F3:int, xor:int(ldc:int(568), ldc:int(569)))), var_7_A0:double))) {
                        inc:int(var_11_F3, ldc:int(1))
                    }
                    
                    var_3_614 = and:int(var_3_E2:int, ldc:int(-853647581))
                    var_14_11D = var_7_A0:double
                    var_16_121 = var_11_F3:int
                }
                else {
                    var_11_F3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_8A:int), and:int(ldc:int(2723), ldc:int(281)))
                    var_12_119 = var_14_11D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A)
                    
                    if (cmplt:boolean(var_16_121 = var_11_F3:int, var_6_91:int)) {
                        var_9_D0 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_F3:int)
                        var_16_121 = var_11_F3:int
                        var_14_11D = var_12_119:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1455)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1303)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1167)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1060)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0904)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_614 = and:int(var_3_614:int, ldc:int(382736246))
                        goto(Label_0772)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0653)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0523)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_614 = and:int(var_3_614:int, ldc:int(-13712581))
                        
                        if (cmplt:boolean(var_16_121:int, var_6_91:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0523)
                            }
                            
                            goto(Label_0772)
                        }
                    }
                    
                    Label_0386:
                    
                    if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1455)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1303)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1167)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1060)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0904)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0772)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0653)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(131072)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_614:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_614 = and:int(var_3_614:int, ldc:int(1231637858))
                            loopcontinue()
                        }
                        
                        var_3_614 = and:int(var_3_614:int, ldc:int(-856729690))
                        var_11_F3 = and:int(ldc:int(8674), ldc:int(-10723))
                        goto(Label_1444)
                    }
                    
                    Label_0523:
                    
                    if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(32)), ldc:int(0))) {
                        var_3_614 = and:int(var_3_614:int, ldc:int(-52769345))
                        goto(Label_1455)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1303)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_614 = and:int(var_3_614:int, ldc:int(-1176246344))
                        goto(Label_1167)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1060)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0904)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_614 = and:int(var_3_614:int, ldc:int(-199701664))
                        goto(Label_0772)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_614 = and:int(var_3_614:int, ldc:int(-1082288319))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_614:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0386)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(256)), ldc:int(0))) {
                            var_3_614 = and:int(var_3_614:int, ldc:int(-1954999047))
                            loopcontinue()
                        }
                        
                        var_3_614 = and:int(var_3_614:int, ldc:int(-98937481))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_11D = var_9_D0:double
                            goto(Label_0772)
                        }
                    }
                    
                    Label_0653:
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_614 = and:int(var_3_614:int, ldc:int(1077731699))
                        goto(Label_1455)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1303)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1167)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1060)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_614 = and:int(var_3_614:int, ldc:int(-57972289))
                        goto(Label_0904)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0523)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_614:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_614 = and:int(var_3_614:int, ldc:int(-295230522))
                            goto(Label_0386)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_614:int, ldc:int(1073741824)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_614 = and:int(var_3_614:int, ldc:int(-591477780))
                        var_14_11D = mul:double(ldc:double(0.5), add:double(var_9_D0:double, var_14_11D:double))
                    }
                    
                    Label_0772:
                    
                    if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_614 = and:int(var_3_614:int, ldc:int(486004259))
                        goto(Label_1455)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1303)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1167)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(32)), ldc:int(0))) {
                        var_3_614 = and:int(var_3_614:int, ldc:int(-1624232082))
                        goto(Label_1060)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(1)), ldc:int(0))) {
                        var_3_614 = and:int(var_3_614:int, ldc:int(-1948106072))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_614:int, ldc:int(128)), ldc:int(0))) {
                            var_3_614 = and:int(var_3_614:int, ldc:int(620848718))
                            goto(Label_0653)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_614:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0523)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_614:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0386)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_614:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_614 = and:int(var_3_614:int, ldc:int(-965238046))
                            loopcontinue()
                        }
                        
                        var_3_614 = and:int(var_3_614:int, ldc:int(-669358746))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A:int), var_7_A0:double)) {
                                var_11_F3 = and:int(ldc:int(2145), ldc:int(20995))
                                goto(Label_1060)
                            }
                        }
                    }
                    
                    Label_0904:
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1455)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1303)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_614 = and:int(var_3_614:int, ldc:int(1468651895))
                        goto(Label_1167)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_614:int, ldc:int(512)), ldc:int(0))) {
                            var_3_614 = and:int(var_3_614:int, ldc:int(-1730500068))
                            goto(Label_0772)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_614:int, ldc:int(512)), ldc:int(0))) {
                            var_3_614 = and:int(var_3_614:int, ldc:int(335411047))
                            goto(Label_0653)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_614:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_614 = and:int(var_3_614:int, ldc:int(1161625464))
                            goto(Label_0523)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0386)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_614:int, ldc:int(2097152)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_614 = and:int(var_3_614:int, ldc:int(-119840468))
                        var_11_F3 = and:int(ldc:int(3418), ldc:int(-3547))
                    }
                    
                    Label_1060:
                    
                    if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_614 = and:int(var_3_614:int, ldc:int(664000868))
                        goto(Label_1455)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1303)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(16)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_614:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0904)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(256)), ldc:int(0))) {
                            var_3_614 = and:int(var_3_614:int, ldc:int(503466363))
                            goto(Label_0772)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_614:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0653)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0523)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_614:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0386)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(524288)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_614 = and:int(var_3_614:int, ldc:int(-1884598983))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_F3:int, ldc:int(0))) {
                                goto(Label_1303)
                            }
                        }
                    }
                    
                    Label_1167:
                    
                    if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(32)), ldc:int(0))) {
                        var_3_614 = and:int(var_3_614:int, ldc:int(-1140143036))
                        goto(Label_1455)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(1)), ldc:int(0))) {
                        var_3_614 = and:int(var_3_614:int, ldc:int(-372383967))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_614:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_614 = and:int(var_3_614:int, ldc:int(-971481087))
                            goto(Label_1060)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_614 = and:int(var_3_614:int, ldc:int(-1330012904))
                            goto(Label_0904)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0772)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0653)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0523)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0386)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(16)), ldc:int(0))) {
                            var_3_614 = and:int(var_3_614:int, ldc:int(-640788044))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_11D:double, var_5_8A:int, var_16_121:int)
                            goto(Label_1444)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1303:
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_614 = and:int(var_3_614:int, ldc:int(1285276426))
                        goto(Label_1455)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_614 = and:int(var_3_614:int, ldc:int(810425107))
                        goto(Label_1167)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1060)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_614 = and:int(var_3_614:int, ldc:int(-778317723))
                        goto(Label_0904)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0772)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0653)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_614 = and:int(var_3_614:int, ldc:int(-1028122171))
                        goto(Label_0523)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0386)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_614 = and:int(var_3_614:int, ldc:int(1137562795))
                        loopcontinue()
                    }
                    
                    var_3_614 = and:int(var_3_614:int, ldc:int(-331691665))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_11D:double, ldc:double(0.0))
                    Label_1444:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_61F = var_5_8A:int
                        
                        if (cmpeq:boolean(var_11_F3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1455:
                    
                    if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1303)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1167)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1060)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0904)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_614 = and:int(var_3_614:int, ldc:int(419497543))
                        goto(Label_0772)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0653)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0523)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_614 = and:int(var_3_614:int, ldc:int(94366186))
                        goto(Label_0386)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_614 = and:int(var_3_614:int, ldc:int(-858037314))
                        var_17_61F = add:int(var_16_121:int, and:int(ldc:int(20563), ldc:int(8713)))
                        looporswitchbreak()
                    }
                    
                    var_3_614 = and:int(var_3_614:int, ldc:int(102079070))
                }
                
                var_3_614 = and:int(var_3_614:int, ldc:int(-1901367366))
                
                if (cmple:boolean(var_5_8A = var_17_61F:int, sub:int(var_6_91:int, xor:int(ldc:int(6144), ldc:int(6145))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0180:
        
        if (cmpne:boolean(and:int(var_3_614:int, ldc:int(512)), ldc:int(0))) {
            var_3_614 = and:int(var_3_614:int, ldc:int(-1992381586))
            goto(Label_0108)
        }
    }
}
