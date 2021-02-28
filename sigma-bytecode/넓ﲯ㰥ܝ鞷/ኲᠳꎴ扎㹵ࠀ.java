public class \ub113\ufcaf\u3c25\u071d\u97b7.\u12b2\u1833\ua3b4\u624e\u3e75\u0800 {
    public void \u12b2\u1833\ua3b4\u624e\u3e75\u0800(\u12b2\u9a18\uc7fe\u4c2b\u6c52.\u62da\u5f50\u7330\u4492\u51fa\u6d69 p0) {
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
            invokespecial:Thread(Thread::<init>, this:\u12b2\u1833\ua3b4\u624e\u3e75\u0800, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u12b2\u1833\ua3b4\u624e\u3e75\u0800::\u983f\u6cfe\u7330\u4179\ufe34\u4f52), and:int(ldc:int(615), ldc:int(-17000)))), invokevirtual:int(AtomicInteger::incrementAndGet, invokestatic:AtomicInteger(\u5db4\u98a4\u9937\ua61f\u4bc8\u8c8a::\uf94d\u392e\u0800\ub171\u92ff\u59ec)))))
            putfield:\u62da\u5f50\u7330\u4492\u51fa\u6d69(\u12b2\u1833\ua3b4\u624e\u3e75\u0800::\u3d4b\u34df\u759a\u56bd\u9a18\uae87, this:\u12b2\u1833\ua3b4\u624e\u3e75\u0800, p0:\u62da\u5f50\u7330\u4492\u51fa\u6d69)
            invokevirtual:void(Thread::setDaemon, this:\u12b2\u1833\ua3b4\u624e\u3e75\u0800[expected:Thread], xor:int[expected:boolean](ldc:int(8194), ldc:int(8195)))
            invokevirtual:void(Thread::setUncaughtExceptionHandler, this:\u12b2\u1833\ua3b4\u624e\u3e75\u0800[expected:Thread], initobject:\u9a18\u7bad\u5db4\u6d99\u7873\u59ec[expected:UncaughtExceptionHandler](\u9a18\u7bad\u5db4\u6d99\u7873\u59ec::<init>, invokestatic:Logger(\u5db4\u98a4\u9937\ua61f\u4bc8\u8c8a::\ub8be\u7330\u99f7\ub70c\u6ec6\ud4fe)))
            putfield:MulticastSocket(\u12b2\u1833\ua3b4\u624e\u3e75\u0800::\u3d4b\u836c\uc238\u527a\u527a\ua61f, this:\u12b2\u1833\ua3b4\u624e\u3e75\u0800, initobject:MulticastSocket(MulticastSocket::<init>, xor:int(ldc:int(17603), ldc:int(21918))))
            putfield:InetAddress(\u12b2\u1833\ua3b4\u624e\u3e75\u0800::\u4daf\u71f1\ud12e\u960f\uafe7\u8753, this:\u12b2\u1833\ua3b4\u624e\u3e75\u0800, invokestatic:InetAddress(InetAddress::getByName, loadelement:String(getstatic:String[](\u12b2\u1833\ua3b4\u624e\u3e75\u0800::\u983f\u6cfe\u7330\u4179\ufe34\u4f52), xor:int(ldc:int(18432), ldc:int(18433)))))
            invokevirtual:void(DatagramSocket::setSoTimeout, getfield:MulticastSocket[expected:DatagramSocket](\u12b2\u1833\ua3b4\u624e\u3e75\u0800::\u3d4b\u836c\uc238\u527a\u527a\ua61f, this:\u12b2\u1833\ua3b4\u624e\u3e75\u0800), xor:int(ldc:int(7249), ldc:int(4057)))
            invokevirtual:void(MulticastSocket::joinGroup, getfield:MulticastSocket(\u12b2\u1833\ua3b4\u624e\u3e75\u0800::\u3d4b\u836c\uc238\u527a\u527a\ua61f, this:\u12b2\u1833\ua3b4\u624e\u3e75\u0800), getfield:InetAddress(\u12b2\u1833\ua3b4\u624e\u3e75\u0800::\u4daf\u71f1\ud12e\u960f\uafe7\u8753, this:\u12b2\u1833\ua3b4\u624e\u3e75\u0800))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void run() {
        var_1_81 : int
        var_3_6E : byte[]
        var_1_18F : int
        var_4_FB : DatagramPacket
        var_5_133 : IOException
        var_5_182 : String
        
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
            var_1_81 = and:int(and:int(ldc:int(333604910), ldc:int(1583483799)), ldc:int(318470412))
            var_3_6E = newarray:byte[](byte.class, xor:int(ldc:int(9605), ldc:int(8581)))
            
            loop {
                if (cmpeq:boolean(and:int(var_1_81:int, ldc:int(2147483647)), ldc:int(0))) {
                    goto(Label_0585)
                }
                
                if (cmpne:boolean(and:int(var_1_81:int, ldc:int(1024)), ldc:int(0))) {
                    var_1_81 = and:int(var_1_81:int, ldc:int(370182561))
                    goto(Label_0519)
                }
                
                if (cmpeq:boolean(and:int(var_1_81:int, ldc:int(4)), ldc:int(0))) {
                    goto(Label_0208)
                }
                
                if (cmpeq:boolean(and:int(var_1_81:int, ldc:int(67108864)), ldc:int(0))) {
                    var_1_81 = and:int(var_1_81:int, ldc:int(872216759))
                    
                    if (invokevirtual:boolean(Thread::isInterrupted, this:\u12b2\u1833\ua3b4\u624e\u3e75\u0800[expected:Thread])) {
                        goto(Label_0508)
                    }
                }
                
                Label_0159:
                
                if (cmpne:boolean(and:int(var_1_81:int, ldc:int(256)), ldc:int(0))) {
                    goto(Label_0585)
                }
                
                if (cmpeq:boolean(and:int(var_1_81:int, ldc:int(2147483647)), ldc:int(0))) {
                    goto(Label_0519)
                }
                
                if (cmpeq:boolean(and:int(var_1_81:int, ldc:int(33554432)), ldc:int(0))) {
                    var_1_81 = and:int(var_1_81:int, ldc:int(-1282811845))
                }
                else {
                    if (cmpne:boolean(and:int(var_1_81:int, ldc:int(262144)), ldc:int(0))) {
                        var_1_81 = and:int(var_1_81:int, ldc:int(-1055483190))
                        loopcontinue()
                    }
                    
                    var_1_81 = and:int(var_1_81:int, ldc:int(-681304363))
                }
                
                Label_0208:
                
                if (cmpeq:boolean(and:int(var_1_81:int, ldc:int(2097152)), ldc:int(0))) {
                    goto(Label_0585)
                }
                
                if (cmpne:boolean(and:int(var_1_81:int, ldc:int(1024)), ldc:int(0))) {
                    goto(Label_0519)
                }
                
                if (cmpeq:boolean(and:int(var_1_81:int, ldc:int(33554432)), ldc:int(0))) {
                    goto(Label_0159)
                }
                
                if (cmpeq:boolean(and:int(var_1_81:int, ldc:int(1024)), ldc:int(0))) {
                    var_1_18F = and:int(var_1_81:int, ldc:int(-2040595))
                    var_4_FB = initobject:DatagramPacket(DatagramPacket::<init>, var_3_6E:byte[], arraylength:int(var_3_6E:byte[]))
                    
                    try {
                        do {
                            if (cmpeq:boolean(and:int(var_1_18F:int, ldc:int(67108864)), ldc:int(0))) {
                                var_1_18F = and:int(var_1_18F:int, ldc:int(-1141314755))
                                invokevirtual:void(DatagramSocket::receive, getfield:MulticastSocket[expected:DatagramSocket](\u12b2\u1833\ua3b4\u624e\u3e75\u0800::\u3d4b\u836c\uc238\u527a\u527a\ua61f, this:\u12b2\u1833\ua3b4\u624e\u3e75\u0800), var_4_FB:DatagramPacket)
                            }
                        } while (cmpne:boolean(and:int(var_1_18F:int, ldc:int(32768)), ldc:int(0)))
                        
                        var_1_18F = and:int(var_1_18F:int, ldc:int(-740124035))
                    }
                    catch (java.net.SocketTimeoutException var_5_125) {
                        var_1_81 = and:int(var_1_18F:int, ldc:int(1920618047))
                        loopcontinue()
                    }
                    catch (java.io.IOException var_5_133) {
                        do {
                            if (cmpeq:boolean(and:int(var_1_18F:int, ldc:int(32768)), ldc:int(0))) {
                                var_1_18F = and:int(var_1_18F:int, ldc:int(308993188))
                                invokeinterface:void(Logger::error, invokestatic:Logger(\u5db4\u98a4\u9937\ua61f\u4bc8\u8c8a::\ub8be\u7330\u99f7\ub70c\u6ec6\ud4fe), loadelement:String(getstatic:String[](\u12b2\u1833\ua3b4\u624e\u3e75\u0800::\u983f\u6cfe\u7330\u4179\ufe34\u4f52), xor:int(ldc:int(369), ldc:int(371))), var_5_133:IOException[expected:Throwable])
                            }
                        } while (cmpeq:boolean(and:int(var_1_18F:int, ldc:int(268435456)), ldc:int(0)))
                        
                        var_1_81 = and:int(var_1_18F:int, ldc:int(2121866812))
                        goto(Label_0508)
                    }
                    
                    var_5_182 = initobject:String(String::<init>, invokevirtual:byte[](DatagramPacket::getData, var_4_FB:DatagramPacket), invokevirtual:int(DatagramPacket::getOffset, var_4_FB:DatagramPacket), invokevirtual:int(DatagramPacket::getLength, var_4_FB:DatagramPacket), getstatic:Charset(StandardCharsets::UTF_8))
                    
                    loop {
                        if (cmpne:boolean(and:int(var_1_18F:int, ldc:int(1)), ldc:int(0))) {
                            var_1_18F = and:int(var_1_18F:int, ldc:int(-1306538463))
                            goto(Label_0482)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_18F:int, ldc:int(67108864)), ldc:int(0))) {
                            var_1_18F = and:int(var_1_18F:int, ldc:int(-1694945828))
                            invokeinterface:void(Logger::debug, invokestatic:Logger(\u5db4\u98a4\u9937\ua61f\u4bc8\u8c8a::\ub8be\u7330\u99f7\ub70c\u6ec6\ud4fe), loadelement:String(getstatic:String[](\u12b2\u1833\ua3b4\u624e\u3e75\u0800::\u983f\u6cfe\u7330\u4179\ufe34\u4f52), and:int(ldc:int(1027), ldc:int(14343))), invokevirtual:InetAddress[expected:Object](DatagramPacket::getAddress, var_4_FB:DatagramPacket), var_5_182:String[expected:Object])
                        }
                        
                        Label_0441:
                        
                        if (cmpeq:boolean(and:int(var_1_18F:int, ldc:int(512)), ldc:int(0))) {
                            if (cmpne:boolean(and:int(var_1_18F:int, ldc:int(256)), ldc:int(0))) {
                                var_1_18F = and:int(var_1_18F:int, ldc:int(774413629))
                                loopcontinue()
                            }
                            
                            var_1_18F = and:int(var_1_18F:int, ldc:int(1467460966))
                            invokevirtual:void(\u62da\u5f50\u7330\u4492\u51fa\u6d69::\u8df4\ubefe\uafe7\u61a4\u9255\u93a2, getfield:\u62da\u5f50\u7330\u4492\u51fa\u6d69(\u12b2\u1833\ua3b4\u624e\u3e75\u0800::\u3d4b\u34df\u759a\u56bd\u9a18\uae87, this:\u12b2\u1833\ua3b4\u624e\u3e75\u0800), var_5_182:String, invokevirtual:InetAddress(DatagramPacket::getAddress, var_4_FB:DatagramPacket))
                        }
                        
                        Label_0482:
                        
                        if (cmpne:boolean(and:int(var_1_18F:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0441)
                        }
                        
                        if (cmpne:boolean(and:int(var_1_18F:int, ldc:int(2097152)), ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    var_1_81 = and:int(var_1_18F:int, ldc:int(-1091469346))
                    loopcontinue()
                }
                
                loopcontinue()
                
                try {
                    Label_0508:
                    invokevirtual:void(MulticastSocket::leaveGroup, getfield:MulticastSocket(\u12b2\u1833\ua3b4\u624e\u3e75\u0800::\u3d4b\u836c\uc238\u527a\u527a\ua61f, this:\u12b2\u1833\ua3b4\u624e\u3e75\u0800), getfield:InetAddress(\u12b2\u1833\ua3b4\u624e\u3e75\u0800::\u4daf\u71f1\ud12e\u960f\uafe7\u8753, this:\u12b2\u1833\ua3b4\u624e\u3e75\u0800))
                    Label_0519:
                    
                    if (cmpne:boolean(and:int(var_1_81:int, ldc:int(512)), ldc:int(0))) {
                        var_1_81 = and:int(var_1_81:int, ldc:int(1807744124))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_1_81:int, ldc:int(2097152)), ldc:int(0))) {
                            var_1_81 = and:int(var_1_81:int, ldc:int(1165379081))
                            goto(Label_0208)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_81:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0159)
                        }
                        
                        if (cmpne:boolean(and:int(var_1_81:int, ldc:int(1)), ldc:int(0))) {
                            var_1_81 = and:int(var_1_81:int, ldc:int(-1447393350))
                            loopcontinue()
                        }
                        
                        var_1_81 = and:int(var_1_81:int, ldc:int(-546140385))
                    }
                }
                catch (java.io.IOException stack_247_0) {
                }
                
                Label_0585:
                
                if (cmpeq:boolean(and:int(var_1_81:int, ldc:int(33554432)), ldc:int(0))) {
                    goto(Label_0519)
                }
                
                if (cmpne:boolean(and:int(var_1_81:int, ldc:int(256)), ldc:int(0))) {
                    var_1_81 = and:int(var_1_81:int, ldc:int(-1534199114))
                    goto(Label_0208)
                }
                
                if (cmpne:boolean(and:int(var_1_81:int, ldc:int(65536)), ldc:int(0))) {
                    goto(Label_0159)
                }
                
                if (cmpeq:boolean(and:int(var_1_81:int, ldc:int(256)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_1_81 = and:int(var_1_81:int, ldc:int(841809594))
            }
            
            invokevirtual:void(DatagramSocket::close, getfield:MulticastSocket[expected:DatagramSocket](\u12b2\u1833\ua3b4\u624e\u3e75\u0800::\u3d4b\u836c\uc238\u527a\u527a\ua61f, this:\u12b2\u1833\ua3b4\u624e\u3e75\u0800))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_5F : int
        expr_65 : byte[] [generated]
        var_2_69 : byte[]
        stack_97_0 : byte[] [generated]
        stack_99_0 : byte[] [generated]
        stack_BB_0 : byte[] [generated]
        stack_BD_0 : byte[] [generated]
        stack_E6_0 : byte[] [generated]
        stack_1E7_0 : byte[] [generated]
        stack_263_0 : byte[] [generated]
        expr_6D : int [generated]
        var_3_17F : byte[]
        var_4_180 : int
        var_0_7D : int
        expr_99 : int [generated]
        var_5_1D0 : int
        var_3_1D5 : byte[]
        var_4_1D6 : int
        var_0_200 : int
        expr_1E7 : byte [generated]
        stack_22E_2 : byte [generated]
        stack_203_0 : byte [generated]
        expr_BD : int [generated]
        var_3_251 : byte[]
        var_4_252 : int
        expr_269 : byte [generated]
        var_3_F2 : String
        stack_176_0 : String[] [generated]
        expr_104 : String[] [generated]
        
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
            var_0_5F = and:int(ldc:int(-1598491733), ldc:int(-1174670545))
            expr_65 = var_2_69 = stack_97_0 = stack_99_0 = stack_BB_0 = stack_BD_0 = stack_E6_0 = stack_1E7_0 = stack_263_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("ABB4N/L7MwcHR3Gr1W/sAD8Rcuxb38g229AQS4AAGHAv/EA4BEg4FIvRSR/cFMlS1utzZn4rc0A="))
            expr_6D = add:int(arraylength:int(expr_65:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_6D:int, ldc:int(0))) {
                var_3_17F = newarray:byte[](byte.class, expr_6D:int)
                var_4_180 = expr_6D:int
                
                loop {
                    var_0_5F = and:int(var_0_5F:int, ldc:int(-1782982659))
                    var_4_180 = add:int(var_4_180:int, ldc:int(-1))
                    storeelement:byte(var_3_17F:byte[], var_4_180:int, add:int(shl:int(loadelement:byte(expr_65:byte[], var_4_180:int), ldc:int(2)), and:int(shr:int(loadelement:byte(var_2_69:byte[], add:int(var_4_180:int, xor:int(ldc:int(4145), ldc:int(4144)))), ldc:int(6)), and:int(ldc:int(19), ldc:int(10283)))))
                    
                    if (cmpne:boolean(var_4_180:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_99_0 = stack_97_0 = stack_BB_0 = stack_BD_0 = stack_E6_0 = stack_1E7_0 = stack_263_0 = var_3_17F:byte[]
            }
            
            loop {
                if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(16384)), ldc:int(0))) {
                    var_0_7D = and:int(var_0_5F:int, ldc:int(1040912404))
                    goto(Label_0194)
                }
                
                if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(32768)), ldc:int(0))) {
                    var_0_5F = and:int(var_0_5F:int, ldc:int(-1588707637))
                }
                else {
                    var_0_5F = and:int(var_0_5F:int, ldc:int(-608505153))
                    expr_99 = arraylength:int(stack_99_0:byte[])
                    
                    if (cmpne:boolean(expr_99:int, ldc:int(0))) {
                        var_5_1D0 = expr_99:int
                        var_3_1D5 = newarray:byte[](byte.class, expr_99:int)
                        var_4_1D6 = expr_99:int
                        
                        loop {
                            var_0_200 = and:int(var_0_5F:int, ldc:int(-1883450569))
                            var_4_1D6 = add:int(var_4_1D6:int, ldc:int(-1))
                            expr_1E7 = stack_22E_2 = loadelement(stack_1E7_0, var_4_1D6)
                            
                            if (cmplt:boolean(add:int(add:int(var_4_1D6:int, ldc:int(6)), neg:int(var_5_1D0:int)), ldc:int(0))) {
                                stack_22E_2 = stack_203_0 = add:byte(expr_1E7:byte, loadelement:byte(var_3_1D5:byte[], add:int(var_4_1D6:int, ldc:int(6))))
                                goto(Label_0531)
                            }
                            
                            Label_0500:
                            
                            if (cmpne:boolean(and:int(var_0_200:int, ldc:int(512)), ldc:int(0))) {
                                var_0_200 = and:int(var_0_200:int, ldc:int(-1011361875))
                                stack_22E_2 = stack_203_0 = add:byte(expr_1E7:byte, ldc:byte(6))
                            }
                            
                            Label_0531:
                            
                            if (cmpeq:boolean(and:int(var_0_200:int, ldc:int(512)), ldc:int(0))) {
                                var_0_200 = and:int(var_0_200:int, ldc:int(-1989474805))
                                goto(Label_0500)
                            }
                            
                            var_0_5F = and:int(var_0_200:int, ldc:int(-792865243))
                            storeelement:byte(var_3_1D5:byte[], var_4_1D6:int, stack_22E_2:byte)
                            
                            if (cmpne:boolean(var_4_1D6:int, ldc:int(0))) {
                                loopcontinue()
                            }
                            
                            looporswitchbreak()
                        }
                        
                        stack_99_0 = stack_97_0 = stack_BB_0 = stack_BD_0 = stack_E6_0 = stack_1E7_0 = stack_263_0 = var_3_1D5:byte[]
                    }
                }
                
                Label_0158:
                
                if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(4)), ldc:int(0))) {
                    var_0_7D = and:int(var_0_5F:int, ldc:int(-1412777352))
                }
                else {
                    if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(2048)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_0_7D = and:int(var_0_5F:int, ldc:int(-1699292363))
                    expr_BD = arraylength:int(stack_BD_0:byte[])
                    
                    if (cmpne:boolean(expr_BD:int, ldc:int(0))) {
                        var_3_251 = newarray:byte[](byte.class, expr_BD:int)
                        var_4_252 = expr_BD:int
                        
                        loop {
                            var_0_7D = and:int(var_0_7D:int, ldc:int(-2101676421))
                            var_4_252 = add:int(var_4_252:int, ldc:int(-1))
                            expr_269 = xor:byte(add:byte(loadelement:byte(stack_263_0:byte[], var_4_252:int), ldc:byte(10)), ldc:byte(10))
                            storeelement:byte(var_3_251:byte[], var_4_252:int, or:int(and:int(shl:int(expr_269:byte, xor:int(ldc:int(16400), ldc:int(16404))), ldc:int(-16)), and:int(shr:int(expr_269:byte[expected:int], and:int(ldc:int(1548), ldc:int(20502))), ldc:int(15))))
                            
                            if (cmpne:boolean(var_4_252:int, ldc:int(0))) {
                                loopcontinue()
                            }
                            
                            looporswitchbreak()
                        }
                        
                        stack_99_0 = stack_97_0 = stack_BB_0 = stack_BD_0 = stack_E6_0 = stack_1E7_0 = stack_263_0 = var_3_251:byte[]
                    }
                }
                
                Label_0194:
                
                if (cmpne:boolean(and:int(var_0_7D:int, ldc:int(262144)), ldc:int(0))) {
                    var_0_5F = and:int(var_0_7D:int, ldc:int(-1953541924))
                    goto(Label_0158)
                }
                
                if (cmpne:boolean(and:int(var_0_7D:int, ldc:int(512)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_0_5F = and:int(var_0_7D:int, ldc:int(493074360))
            }
            
            var_3_F2 = initobject:String(String::<init>, stack_E6_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_176_0 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(5251), ldc:int(5255)))
            expr_104 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(802), ldc:int(806)))
            storeelement:String(expr_104:String[], and:int(ldc:int(1033), ldc:int(353)), invokevirtual:String[expected:String](String::substring, var_3_F2:String, and:int(ldc:int(25862), ldc:int(-25863)), and:int(ldc:int(90), ldc:int(17070))))
            storeelement:String(expr_104:String[], and:int(ldc:int(130), ldc:int(25650)), invokevirtual:String[expected:String](String::substring, var_3_F2:String, xor:int(ldc:int(-16189), ldc:int(-16183)), xor:int(ldc:int(5379), ldc:int(5405))))
            storeelement:String(expr_104:String[], and:int(ldc:int(-30983), ldc:int(30980)), invokevirtual:String[expected:String](String::substring, var_3_F2:String, and:int(ldc:int(8254), ldc:int(20510)), xor:int(ldc:int(8761), ldc:int(8712))))
            storeelement:String(expr_104:String[], xor:int(ldc:int(131), ldc:int(128)), invokevirtual:String[expected:String](String::substring, var_3_F2:String, xor:int(ldc:int(-30520), ldc:int(-30471)), and:int(ldc:int(2743), ldc:int(119))))
            putstatic:String[](\u12b2\u1833\ua3b4\u624e\u3e75\u0800::\u983f\u6cfe\u7330\u4179\ufe34\u4f52, expr_104:String[])
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u6d99\u8350\u6c52\u92ff\u62da\u9033(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_679 : int
        var_5_8A : int
        var_6_91 : int
        var_7_A0 : double
        var_9_C7 : double
        var_3_D9 : int
        var_11_EA : int
        var_14_114 : double
        var_16_118 : int
        var_12_110 : double
        var_17_684 : int
        
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
        var_3_679 = and:int(ldc:int(1244937814), ldc:int(1068809274))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u12b2\u1833\ua3b4\u624e\u3e75\u0800[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0180)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(1048576)), ldc:int(0))) {
            var_3_679 = and:int(var_3_679:int, ldc:int(1792212233))
        }
        else {
            var_3_679 = and:int(var_3_679:int, ldc:int(515259359))
            var_5_8A = and:int(ldc:int(-16177), ldc:int(14128))
            var_6_91 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_A0 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-56), ldc:int(55)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C7 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D9 = and:int(var_3_679:int, ldc:int(1526528146))
                    var_9_C7 = sub:double(var_7_A0:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EA = var_5_8A:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EA:int, sub:int(var_6_91:int, xor:int(ldc:int(1098), ldc:int(1099)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EA:int, and:int(ldc:int(3689), ldc:int(16771)))), var_7_A0:double))) {
                        inc:int(var_11_EA, ldc:int(1))
                    }
                    
                    var_3_679 = and:int(var_3_D9:int, ldc:int(-822838401))
                    var_14_114 = var_7_A0:double
                    var_16_118 = var_11_EA:int
                }
                else {
                    var_11_EA = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_8A:int), xor:int(ldc:int(5120), ldc:int(5121)))
                    var_12_110 = var_14_114 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A)
                    
                    if (cmplt:boolean(var_16_118 = var_11_EA:int, var_6_91:int)) {
                        var_9_C7 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EA:int)
                        var_16_118 = var_11_EA:int
                        var_14_114 = var_12_110:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_679:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_679 = and:int(var_3_679:int, ldc:int(883599292))
                        goto(Label_1547)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1395)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_679:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1236)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1106)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(2)), ldc:int(0))) {
                        var_3_679 = and:int(var_3_679:int, ldc:int(959666959))
                        goto(Label_0934)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0823)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0694)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_679:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0549)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_679 = and:int(var_3_679:int, ldc:int(-1514116555))
                    }
                    else {
                        var_3_679 = and:int(var_3_679:int, ldc:int(-180678))
                        
                        if (cmplt:boolean(var_16_118:int, var_6_91:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0549)
                            }
                            
                            goto(Label_0823)
                        }
                    }
                    
                    Label_0396:
                    
                    if (cmpne:boolean(and:int(var_3_679:int, ldc:int(1)), ldc:int(0))) {
                        var_3_679 = and:int(var_3_679:int, ldc:int(1779933011))
                        goto(Label_1547)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1395)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1236)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1106)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_679:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0934)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(16)), ldc:int(0))) {
                        var_3_679 = and:int(var_3_679:int, ldc:int(606236437))
                        goto(Label_0823)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_679:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0694)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_679 = and:int(var_3_679:int, ldc:int(-345700874))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_679:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_679 = and:int(var_3_679:int, ldc:int(-608912770))
                            var_11_EA = and:int(ldc:int(16612), ldc:int(-16622))
                            goto(Label_1536)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0549:
                    
                    if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1547)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_679 = and:int(var_3_679:int, ldc:int(590818490))
                        goto(Label_1395)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_679 = and:int(var_3_679:int, ldc:int(1691924941))
                        goto(Label_1236)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_679 = and:int(var_3_679:int, ldc:int(-812796084))
                        goto(Label_1106)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_679:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_679 = and:int(var_3_679:int, ldc:int(1357066578))
                        goto(Label_0934)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0823)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_679 = and:int(var_3_679:int, ldc:int(-492634251))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_679 = and:int(var_3_679:int, ldc:int(-430774530))
                            goto(Label_0396)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_679 = and:int(var_3_679:int, ldc:int(1049388027))
                            loopcontinue()
                        }
                        
                        var_3_679 = and:int(var_3_679:int, ldc:int(-1170868205))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_114 = var_9_C7:double
                            goto(Label_0823)
                        }
                    }
                    
                    Label_0694:
                    
                    if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(16)), ldc:int(0))) {
                        var_3_679 = and:int(var_3_679:int, ldc:int(-1099900343))
                        goto(Label_1547)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(2)), ldc:int(0))) {
                        var_3_679 = and:int(var_3_679:int, ldc:int(464975862))
                        goto(Label_1395)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_679:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_679 = and:int(var_3_679:int, ldc:int(-359230802))
                        goto(Label_1236)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1106)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_679 = and:int(var_3_679:int, ldc:int(610238750))
                        goto(Label_0934)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_679:int, ldc:int(2)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0549)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0396)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(2097152)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_679 = and:int(var_3_679:int, ldc:int(2142534803))
                        var_14_114 = mul:double(ldc:double(0.5), add:double(var_9_C7:double, var_14_114:double))
                    }
                    
                    Label_0823:
                    
                    if (cmpne:boolean(and:int(var_3_679:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1547)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1395)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1236)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_679:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_679 = and:int(var_3_679:int, ldc:int(435921132))
                        goto(Label_1106)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_679:int, ldc:int(2097152)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_679 = and:int(var_3_679:int, ldc:int(949581764))
                            goto(Label_0694)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_679:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_679 = and:int(var_3_679:int, ldc:int(1054920437))
                            goto(Label_0549)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0396)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(16)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_679 = and:int(var_3_679:int, ldc:int(-1413613230))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A:int), var_7_A0:double)) {
                                var_11_EA = and:int(ldc:int(18645), ldc:int(5633))
                                goto(Label_1106)
                            }
                        }
                    }
                    
                    Label_0934:
                    
                    if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1547)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_679 = and:int(var_3_679:int, ldc:int(1681899923))
                        goto(Label_1395)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_679 = and:int(var_3_679:int, ldc:int(-230534946))
                        goto(Label_1236)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_679 = and:int(var_3_679:int, ldc:int(1548884318))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_679 = and:int(var_3_679:int, ldc:int(-956050271))
                            goto(Label_0823)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_679:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0694)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_679 = and:int(var_3_679:int, ldc:int(620017068))
                            goto(Label_0549)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_679 = and:int(var_3_679:int, ldc:int(-66101419))
                            goto(Label_0396)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_679:int, ldc:int(65536)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_679 = and:int(var_3_679:int, ldc:int(1261844567))
                        var_11_EA = and:int(ldc:int(-22925), ldc:int(18828))
                    }
                    
                    Label_1106:
                    
                    if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_679 = and:int(var_3_679:int, ldc:int(-736827038))
                        goto(Label_1547)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_679 = and:int(var_3_679:int, ldc:int(-713923949))
                        goto(Label_1395)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_679:int, ldc:int(4096)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_679 = and:int(var_3_679:int, ldc:int(598335390))
                            goto(Label_0934)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0823)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(16)), ldc:int(0))) {
                            var_3_679 = and:int(var_3_679:int, ldc:int(-1140842655))
                            goto(Label_0694)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_679:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0549)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0396)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_679:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_679 = and:int(var_3_679:int, ldc:int(-861214440))
                            loopcontinue()
                        }
                        
                        var_3_679 = and:int(var_3_679:int, ldc:int(1270725526))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EA:int, ldc:int(0))) {
                                goto(Label_1395)
                            }
                        }
                    }
                    
                    Label_1236:
                    
                    if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(2)), ldc:int(0))) {
                        var_3_679 = and:int(var_3_679:int, ldc:int(-86089443))
                        goto(Label_1547)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(32768)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_679 = and:int(var_3_679:int, ldc:int(-1398682716))
                            goto(Label_1106)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(2)), ldc:int(0))) {
                            var_3_679 = and:int(var_3_679:int, ldc:int(-821229812))
                            goto(Label_0934)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_679:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_679 = and:int(var_3_679:int, ldc:int(1969268582))
                            goto(Label_0823)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0694)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_679 = and:int(var_3_679:int, ldc:int(-707471865))
                            goto(Label_0549)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(2)), ldc:int(0))) {
                            var_3_679 = and:int(var_3_679:int, ldc:int(460310077))
                            goto(Label_0396)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_679 = and:int(var_3_679:int, ldc:int(817663249))
                            loopcontinue()
                        }
                        
                        var_3_679 = and:int(var_3_679:int, ldc:int(2142600766))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_114:double, var_5_8A:int, var_16_118:int)
                        goto(Label_1536)
                    }
                    
                    Label_1395:
                    
                    if (cmpne:boolean(and:int(var_3_679:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_679 = and:int(var_3_679:int, ldc:int(487329168))
                        goto(Label_1547)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_679 = and:int(var_3_679:int, ldc:int(470139037))
                        goto(Label_1236)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1106)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_679 = and:int(var_3_679:int, ldc:int(-1398684710))
                        goto(Label_0934)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0823)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0694)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_679:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_679 = and:int(var_3_679:int, ldc:int(458826627))
                        goto(Label_0549)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_679:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0396)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_679:int, ldc:int(1)), ldc:int(0))) {
                        var_3_679 = and:int(var_3_679:int, ldc:int(-1932312215))
                        loopcontinue()
                    }
                    
                    var_3_679 = and:int(var_3_679:int, ldc:int(2050866782))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_114:double, ldc:double(0.0))
                    Label_1536:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_684 = var_5_8A:int
                        
                        if (cmpeq:boolean(var_11_EA:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1547:
                    
                    if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1395)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_679 = and:int(var_3_679:int, ldc:int(-743384309))
                        goto(Label_1236)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_679:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1106)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_679 = and:int(var_3_679:int, ldc:int(-1546676720))
                        goto(Label_0934)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0823)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_679:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_679 = and:int(var_3_679:int, ldc:int(65350709))
                        goto(Label_0694)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0549)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_679 = and:int(var_3_679:int, ldc:int(1740739432))
                        goto(Label_0396)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_679 = and:int(var_3_679:int, ldc:int(-1099138446))
                        var_17_684 = add:int(var_16_118:int, and:int(ldc:int(16641), ldc:int(4177)))
                        looporswitchbreak()
                    }
                }
                
                var_3_679 = and:int(var_3_679:int, ldc:int(200620378))
                
                if (cmple:boolean(var_5_8A = var_17_684:int, sub:int(var_6_91:int, and:int(ldc:int(12947), ldc:int(16389))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0180:
        
        if (cmpne:boolean(and:int(var_3_679:int, ldc:int(2097152)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
