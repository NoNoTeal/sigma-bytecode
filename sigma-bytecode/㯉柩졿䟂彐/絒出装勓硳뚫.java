public abstract class \u3bc9\u67e9\uc87f\u47c2\u5f50.\u7d52\u51fa\u88c5\u52d3\u7873\ub6ab {
    public void \u7d52\u51fa\u88c5\u52d3\u7873\ub6ab() {
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
            invokespecial:Object(Object::<init>, this:\u7d52\u51fa\u88c5\u52d3\u7873\ub6ab)
            putfield:\u6ec6\uc9f6\u8aa5\ub70c\ub8be\ubcb0(\u7d52\u51fa\u88c5\u52d3\u7873\ub6ab::\ud12e\u6c56\u3bc9\u9a18\u8350\u3d64, this:\u7d52\u51fa\u88c5\u52d3\u7873\ub6ab, aconstnull:\u6ec6\uc9f6\u8aa5\ub70c\ub8be\ubcb0())
            putfield:\u4daf\u5d20\u12cb\u8c8a\u8aa5\u6b0d(\u7d52\u51fa\u88c5\u52d3\u7873\ub6ab::\u74b1\u71f1\ucb79\ube23\u927d\ubb2b, this:\u7d52\u51fa\u88c5\u52d3\u7873\ub6ab, aconstnull:\u4daf\u5d20\u12cb\u8c8a\u8aa5\u6b0d())
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static java.nio.ByteBuffer \ud12e\u6435\u7ce1\u72f1\u8308\u839e(java.nio.ByteBuffer p0) {
        var_1_5F : int
        var_3_67 : ByteBuffer
        var_4_6A : byte
        var_5_93 : byte
        
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
        var_1_5F = and:int(ldc:int(-1319689744), ldc:int(1969188339))
        var_3_67 = invokestatic:ByteBuffer(ByteBuffer::allocate, invokevirtual:int(Buffer::remaining, p0:ByteBuffer[expected:Buffer]))
        var_4_6A = ldc:byte(48)
        
        loop {
            var_1_5F = and:int(var_1_5F:int, ldc:int(-11171599))
            
            if (logicalnot:boolean(invokevirtual:boolean(Buffer::hasRemaining, p0:ByteBuffer[expected:Buffer]))) {
                invokevirtual:Buffer(Buffer::position, p0:ByteBuffer[expected:Buffer], sub:int(invokevirtual:int(Buffer::position, p0:ByteBuffer[expected:Buffer]), invokevirtual:int(Buffer::position, var_3_67:ByteBuffer[expected:Buffer])))
                return:ByteBuffer(aconstnull:ByteBuffer())
            }
            
            var_5_93 = var_4_6A:byte
            var_4_6A = invokevirtual:byte(ByteBuffer::get, p0:ByteBuffer)
            invokevirtual:ByteBuffer(ByteBuffer::put, var_3_67:ByteBuffer, var_4_6A:byte)
            
            if (cmpne:boolean(var_5_93:byte, ldc:byte(13))) {
                loopcontinue()
            }
            
            if (cmpne:boolean(var_4_6A:byte, ldc:byte(10))) {
                loopcontinue()
            }
            
            invokevirtual:Buffer(Buffer::limit, var_3_67:ByteBuffer[expected:Buffer], sub:int(invokevirtual:int(Buffer::position, var_3_67:ByteBuffer[expected:Buffer]), and:int(ldc:int(19535), ldc:int(4098))))
            invokevirtual:Buffer(Buffer::position, var_3_67:ByteBuffer[expected:Buffer], and:int(ldc:int(1704), ldc:int(-1709)))
            return:ByteBuffer(var_3_67:ByteBuffer)
        }
    }
    
    public static java.lang.String \ud12e\uceb8\ud4fe\ud523\uc2e8\u647c(java.nio.ByteBuffer p0) {
        var_3_64 : ByteBuffer
        
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
            var_3_64 = invokestatic:ByteBuffer(\u7d52\u51fa\u88c5\u52d3\u7873\ub6ab::\ud12e\u6435\u7ce1\u72f1\u8308\u839e, p0:ByteBuffer)
            return:String(ternaryop:String(cmpne:boolean(var_3_64:ByteBuffer, aconstnull:ByteBuffer()), invokestatic:String(\uc7fe\ud217\u416d\u4c2b\u47c2\ufe34::\uf9c5\u6d69\u67e9\ube23\ube23\ub8be, invokevirtual:byte[](ByteBuffer::array, var_3_64:ByteBuffer), and:int(ldc:int(12224), ldc:int(-16359)), invokevirtual:int(Buffer::limit, var_3_64:ByteBuffer[expected:Buffer])), aconstnull:String()))
        }
        
        goto(Label_0006)
    }
    
    public static \u5245\u8aa5\u61a4\u7049\u4cd9.\u9033\ufcaf\u6b5f\u12b2\u3504\u8bb0 \u3d64\u8350\u6435\ubb2b\u6d99\u7006(java.nio.ByteBuffer p0, \u56bd\u8413\u647c\u5bc4\ud158.\u6ec6\uc9f6\u8aa5\ub70c\ub8be\ubcb0 p1) {
        var_2_5F : int
        var_4_64 : String
        var_2_1ED : int
        var_5_7E : String[]
        var_6_B3 : \u9033\ufcaf\u6b5f\u12b2\u3504\u8bb0
        var_7_1AB : String[]
        var_2_1F5 : int
        
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
        var_2_5F = and:int(ldc:int(-1350679011), ldc:int(1822365503))
        var_4_64 = invokestatic:String(\u7d52\u51fa\u88c5\u52d3\u7873\ub6ab::\ud12e\uceb8\ud4fe\ud523\uc2e8\u647c, p0:ByteBuffer)
        
        if (cmpeq:boolean(var_4_64:String, aconstnull:String())) {
            athrow(initobject:\u156b\uc31c\ubf56\u3dd3\u47c2\ucef1(\u156b\uc31c\ubf56\u3dd3\u47c2\ucef1::<init>, add:int(invokevirtual:int(Buffer::capacity, p0:ByteBuffer[expected:Buffer]), and:int(ldc:int(3716), ldc:int(16528)))))
        }
        
        var_2_1ED = and:int(var_2_5F:int, ldc:int(754576591))
        var_5_7E = invokevirtual:String[](String::split, var_4_64:String, ldc:String(" "), xor:int(ldc:int(12295), ldc:int(12292)))
        
        if (cmpeq:boolean(arraylength:int(var_5_7E:String[]), xor:int(ldc:int(-15231), ldc:int(-15230)))) {
            do {
                if (cmpne:boolean(and:int(var_2_1ED:int, ldc:int(1024)), ldc:int(0))) {
                    var_2_1ED = and:int(var_2_1ED:int, ldc:int(1851398061))
                    
                    if (cmpne:boolean(p1:\u6ec6\uc9f6\u8aa5\ub70c\ub8be\ubcb0, getstatic:\u6ec6\uc9f6\u8aa5\ub70c\ub8be\ubcb0(\u6ec6\uc9f6\u8aa5\ub70c\ub8be\ubcb0::\u9937\u40a9\ud523\u7d52\u624e\uc9f6))) {
                        loopcontinue()
                    }
                    
                    var_6_B3 = invokestatic:\u9033\ufcaf\u6b5f\u12b2\u3504\u8bb0(\u7d52\u51fa\u88c5\u52d3\u7873\ub6ab::\ud217\u6d99\uc7fe\u7ce1\u3c25\uff55, var_5_7E:String[], var_4_64:String)
                    
                    loop {
                        Label_0239:
                        
                        if (cmpeq:boolean(and:int(var_2_1ED:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0365)
                        }
                        
                        if (cmpne:boolean(and:int(var_2_1ED:int, ldc:int(32768)), ldc:int(0))) {
                            var_2_1ED = and:int(var_2_1ED:int, ldc:int(-511127874))
                            goto(Label_0326)
                        }
                        
                        if (cmpne:boolean(and:int(var_2_1ED:int, ldc:int(1024)), ldc:int(0))) {
                            var_2_1ED = and:int(var_2_1ED:int, ldc:int(-126325507))
                            var_4_64 = invokestatic:String(\u7d52\u51fa\u88c5\u52d3\u7873\ub6ab::\ud12e\uceb8\ud4fe\ud523\uc2e8\u647c, p0:ByteBuffer)
                        }
                        
                        Label_0279:
                        
                        while (cmpeq:boolean(and:int(var_2_1ED:int, ldc:int(4096)), ldc:int(0))) {
                            if (cmpeq:boolean(and:int(var_2_1ED:int, ldc:int(1048576)), ldc:int(0))) {
                                var_2_1ED = and:int(var_2_1ED:int, ldc:int(-536770536))
                                goto(Label_0326)
                            }
                            
                            if (cmpeq:boolean(and:int(var_2_1ED:int, ldc:int(4)), ldc:int(0))) {
                                var_2_1ED = and:int(var_2_1ED:int, ldc:int(-428670444))
                                loopcontinue(Label_0239)
                            }
                            
                            var_2_1ED = and:int(var_2_1ED:int, ldc:int(2115612125))
                            
                            if (cmpeq:boolean(var_4_64:String, aconstnull:String())) {
                                goto(Label_0326)
                            }
                            
                            if (cmple:boolean(invokevirtual:int(String::length, var_4_64:String), ldc:int(0))) {
                                goto(Label_0326)
                            }
                            
                            var_7_1AB = invokevirtual:String[](String::split, var_4_64:String, ldc:String(":"), xor:int(ldc:int(2209), ldc:int(2211)))
                            
                            if (cmpne:boolean(arraylength:int(var_7_1AB:String[]), and:int(ldc:int(20355), ldc:int(8226)))) {
                                athrow(initobject:\u6bb9\u946b\u120d\u6435\ub102\u983f(\u6bb9\u946b\u120d\u6435\ub102\u983f::<init>, ldc:String("not an http header")))
                            }
                            
                            loop {
                                if (cmpeq:boolean(and:int(var_2_1ED:int, ldc:int(134217728)), ldc:int(0))) {
                                    var_2_1F5 = and:int(var_2_1ED:int, ldc:int(-1868493283))
                                }
                                else {
                                    var_2_1F5 = and:int(var_2_1ED:int, ldc:int(2048818895))
                                    
                                    if (invokeinterface:boolean(\ubded\u718f\ucef1\ube23\u8640\u9af2::\uc246\u8308\u3bd6\u446c\u4cd9\u3d4b, var_6_B3:\u9033\ufcaf\u6b5f\u12b2\u3504\u8bb0[expected:\ubded\u718f\ucef1\ube23\u8640\u9af2], loadelement:String(var_7_1AB:String[], and:int(ldc:int(16738), ldc:int(-16739))))) {
                                        invokeinterface:void(\u9033\ufcaf\u6b5f\u12b2\u3504\u8bb0::\u527a\u97b7\u7043\uf94d\u416d\ud12e, var_6_B3:\u9033\ufcaf\u6b5f\u12b2\u3504\u8bb0, loadelement:String(var_7_1AB:String[], and:int(ldc:int(10794), ldc:int(-12075))), invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), invokeinterface:String(\ubded\u718f\ucef1\ube23\u8640\u9af2::\u5d20\u7ce1\ubded\ub18d\u4c04\u516c, var_6_B3:\u9033\ufcaf\u6b5f\u12b2\u3504\u8bb0[expected:\ubded\u718f\ucef1\ube23\u8640\u9af2], loadelement:String(var_7_1AB:String[], and:int(ldc:int(12042), ldc:int(-12047))))), ldc:String("; ")), invokevirtual:String(String::replaceFirst, loadelement:String(var_7_1AB:String[], and:int(ldc:int(21827), ldc:int(10241))), ldc:String("^ +"), ldc:String("")))))
                                        looporswitchbreak()
                                    }
                                }
                                
                                if (cmpne:boolean(and:int(var_2_1F5:int, ldc:int(1)), ldc:int(0))) {
                                    var_2_1F5 = and:int(var_2_1F5:int, ldc:int(672935005))
                                    invokeinterface:void(\u9033\ufcaf\u6b5f\u12b2\u3504\u8bb0::\u527a\u97b7\u7043\uf94d\u416d\ud12e, var_6_B3:\u9033\ufcaf\u6b5f\u12b2\u3504\u8bb0, loadelement:String(var_7_1AB:String[], and:int(ldc:int(-13575), ldc:int(13574))), invokevirtual:String(String::replaceFirst, loadelement:String(var_7_1AB:String[], xor:int(ldc:int(-14320), ldc:int(-14319))), ldc:String("^ +"), ldc:String("")))
                                    looporswitchbreak()
                                }
                                
                                var_2_1ED = and:int(var_2_1F5:int, ldc:int(676890703))
                            }
                            
                            var_2_1ED = and:int(var_2_1F5:int, ldc:int(731815103))
                            var_4_64 = invokestatic:String(\u7d52\u51fa\u88c5\u52d3\u7873\ub6ab::\ud12e\uceb8\ud4fe\ud523\uc2e8\u647c, p0:ByteBuffer)
                        }
                        
                        goto(Label_0365)
                        Label_0326:
                        
                        if (cmpeq:boolean(and:int(var_2_1ED:int, ldc:int(1073741824)), ldc:int(0))) {
                            if (cmpeq:boolean(and:int(var_2_1ED:int, ldc:int(134217728)), ldc:int(0))) {
                                goto(Label_0279)
                            }
                            
                            if (cmpne:boolean(and:int(var_2_1ED:int, ldc:int(64)), ldc:int(0))) {
                                var_2_1ED = and:int(var_2_1ED:int, ldc:int(-552172856))
                                loopcontinue()
                            }
                            
                            var_2_1ED = and:int(var_2_1ED:int, ldc:int(672972029))
                            
                            if (cmpeq:boolean(var_4_64:String, aconstnull:String())) {
                                athrow(initobject:\u156b\uc31c\ubf56\u3dd3\u47c2\ucef1(\u156b\uc31c\ubf56\u3dd3\u47c2\ucef1::<init>))
                            }
                        }
                        
                        Label_0365:
                        
                        if (cmpne:boolean(and:int(var_2_1ED:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0326)
                        }
                        
                        if (cmpeq:boolean(and:int(var_2_1ED:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0279)
                        }
                        
                        if (cmpne:boolean(and:int(var_2_1ED:int, ldc:int(2147483647)), ldc:int(0))) {
                            return:\u9033\ufcaf\u6b5f\u12b2\u3504\u8bb0(var_6_B3:\u9033\ufcaf\u6b5f\u12b2\u3504\u8bb0)
                        }
                    }
                }
            } while (cmpne:boolean(and:int(var_2_1ED:int, ldc:int(8388608)), ldc:int(0)))
            
            var_2_1ED = and:int(var_2_1ED:int, ldc:int(-31808289))
            var_6_B3 = invokestatic:\u9033\ufcaf\u6b5f\u12b2\u3504\u8bb0(\u7d52\u51fa\u88c5\u52d3\u7873\ub6ab::\u8df4\u8258\u6ec6\u3d4b\ud12e\u1187, var_5_7E:String[], var_4_64:String)
            goto(Label_0239)
        }
        
        athrow(initobject:\u6bb9\u946b\u120d\u6435\ub102\u983f(\u6bb9\u946b\u120d\u6435\ub102\u983f::<init>))
    }
    
    private static \u5245\u8aa5\u61a4\u7049\u4cd9.\u9033\ufcaf\u6b5f\u12b2\u3504\u8bb0 \u8df4\u8258\u6ec6\u3d4b\ud12e\u1187(java.lang.String[] p0, java.lang.String p1) {
        stack_D8_0 : String [generated]
        expr_B9 : Object[] [generated]
        var_4_93 : \uc29a\ub7dc\u4daf\ubff1\u98a4\ua068
        stack_112_0 : String [generated]
        expr_F3 : Object[] [generated]
        
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
        
        if (logicalnot:boolean(invokevirtual:boolean(String::equalsIgnoreCase, ldc:String("GET"), loadelement:String(p0:String[], and:int(ldc:int(-12904), ldc:int(12390)))))) {
            stack_D8_0 = ldc:String("Invalid request method received: %s Status line: %s")
            expr_B9 = newarray:Object[](java.lang.Object.class, and:int(ldc:int(6466), ldc:int(551)))
            storeelement:Object(expr_B9:Object[], and:int(ldc:int(-12999), ldc:int(12994)), loadelement:String[expected:Object](p0:String[], and:int(ldc:int(-27649), ldc:int(27648))))
            storeelement:Object(expr_B9:Object[], xor:int(ldc:int(1100), ldc:int(1101)), p1:String[expected:Object])
            athrow(initobject:\u6bb9\u946b\u120d\u6435\ub102\u983f(\u6bb9\u946b\u120d\u6435\ub102\u983f::<init>, invokestatic:String(String::format, stack_D8_0:String, expr_B9:Object[])))
        }
        
        if (invokevirtual:boolean(String::equalsIgnoreCase, ldc:String("HTTP/1.1"), loadelement:String(p0:String[], xor:int(ldc:int(19201), ldc:int(19203))))) {
            var_4_93 = initobject:\uc29a\ub7dc\u4daf\ubff1\u98a4\ua068(\uc29a\ub7dc\u4daf\ubff1\u98a4\ua068::<init>)
            invokeinterface:void(\ub6ab\u516c\ub70c\u76bc\u74b1\u416d::\u56bd\u965f\uc84e\u7330\u927d\ubded, var_4_93:\uc29a\ub7dc\u4daf\ubff1\u98a4\ua068[expected:\ub6ab\u516c\ub70c\u76bc\u74b1\u416d], loadelement:String(p0:String[], and:int(ldc:int(12889), ldc:int(1189))))
            return:\u9033\ufcaf\u6b5f\u12b2\u3504\u8bb0(var_4_93:\uc29a\ub7dc\u4daf\ubff1\u98a4\ua068[expected:\u9033\ufcaf\u6b5f\u12b2\u3504\u8bb0])
        }
        
        stack_112_0 = ldc:String("Invalid status line received: %s Status line: %s")
        expr_F3 = newarray:Object[](java.lang.Object.class, and:int(ldc:int(24715), ldc:int(2562)))
        storeelement:Object(expr_F3:Object[], and:int(ldc:int(-9386), ldc:int(9385)), loadelement:String[expected:Object](p0:String[], xor:int(ldc:int(3073), ldc:int(3075))))
        storeelement:Object(expr_F3:Object[], and:int(ldc:int(21573), ldc:int(185)), p1:String[expected:Object])
        athrow(initobject:\u6bb9\u946b\u120d\u6435\ub102\u983f(\u6bb9\u946b\u120d\u6435\ub102\u983f::<init>, invokestatic:String(String::format, stack_112_0:String, expr_F3:Object[])))
    }
    
    private static \u5245\u8aa5\u61a4\u7049\u4cd9.\u9033\ufcaf\u6b5f\u12b2\u3504\u8bb0 \ud217\u6d99\uc7fe\u7ce1\u3c25\uff55(java.lang.String[] p0, java.lang.String p1) {
        stack_F3_0 : String [generated]
        expr_D4 : Object[] [generated]
        var_4_93 : \u4daf\u3711\u8258\u67e9\ua61f\ub102
        var_5_9A : \u4daf\u3711\u8258\u67e9\ua61f\ub102
        stack_12D_0 : String [generated]
        expr_10E : Object[] [generated]
        
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
        
        if (logicalnot:boolean(invokevirtual:boolean(String::equals, ldc:String("101"), loadelement:String[expected:Object](p0:String[], and:int(ldc:int(97), ldc:int(18189)))))) {
            stack_F3_0 = ldc:String("Invalid status code received: %s Status line: %s")
            expr_D4 = newarray:Object[](java.lang.Object.class, and:int(ldc:int(26), ldc:int(24647)))
            storeelement:Object(expr_D4:Object[], and:int(ldc:int(-27779), ldc:int(19586)), loadelement:String[expected:Object](p0:String[], xor:int(ldc:int(21008), ldc:int(21009))))
            storeelement:Object(expr_D4:Object[], xor:int(ldc:int(12288), ldc:int(12289)), p1:String[expected:Object])
            athrow(initobject:\u6bb9\u946b\u120d\u6435\ub102\u983f(\u6bb9\u946b\u120d\u6435\ub102\u983f::<init>, invokestatic:String(String::format, stack_F3_0:String, expr_D4:Object[])))
        }
        
        if (invokevirtual:boolean(String::equalsIgnoreCase, ldc:String("HTTP/1.1"), loadelement:String(p0:String[], and:int(ldc:int(-17333), ldc:int(17332))))) {
            var_4_93 = initobject:\u4daf\u3711\u8258\u67e9\ua61f\ub102(\u4daf\u3711\u8258\u67e9\ua61f\ub102::<init>)
            var_5_9A = checkcast:\u4daf\u3711\u8258\u67e9\ua61f\ub102(\ud36e\u6bb9\u960f\u4c04\u64ab.\u4daf\u3711\u8258\u67e9\ua61f\ub102.class, var_4_93:\u4daf\u3711\u8258\u67e9\ua61f\ub102)
            invokeinterface:void(\u9af2\u7873\u59ec\uceb8\ub6ab\u927d::\u5bc4\uafe7\ua068\ub1b9\u7ce1\u3504, var_5_9A:\u4daf\u3711\u8258\u67e9\ua61f\ub102[expected:\u9af2\u7873\u59ec\uceb8\ub6ab\u927d], invokestatic:short(Short::parseShort, loadelement:String(p0:String[], xor:int(ldc:int(14338), ldc:int(14339)))))
            invokeinterface:void(\u9af2\u7873\u59ec\uceb8\ub6ab\u927d::\u0b8e\ub18d\uc246\uc2e8\u7bad\u156b, var_5_9A:\u4daf\u3711\u8258\u67e9\ua61f\ub102[expected:\u9af2\u7873\u59ec\uceb8\ub6ab\u927d], loadelement:String(p0:String[], and:int(ldc:int(15394), ldc:int(74))))
            return:\u9033\ufcaf\u6b5f\u12b2\u3504\u8bb0(var_4_93:\u4daf\u3711\u8258\u67e9\ua61f\ub102[expected:\u9033\ufcaf\u6b5f\u12b2\u3504\u8bb0])
        }
        
        stack_12D_0 = ldc:String("Invalid status line received: %s Status line: %s")
        expr_10E = newarray:Object[](java.lang.Object.class, and:int(ldc:int(25223), ldc:int(7426)))
        storeelement:Object(expr_10E:Object[], and:int(ldc:int(23920), ldc:int(-32627)), loadelement:String[expected:Object](p0:String[], and:int(ldc:int(-21305), ldc:int(824))))
        storeelement:Object(expr_10E:Object[], xor:int(ldc:int(-14848), ldc:int(-14847)), p1:String[expected:Object])
        athrow(initobject:\u6bb9\u946b\u120d\u6435\ub102\u983f(\u6bb9\u946b\u120d\u6435\ub102\u983f::<init>, invokestatic:String(String::format, stack_12D_0:String, expr_10E:Object[])))
    }
    
    public abstract \u5d20\u97b7\u8753\u873d\u16f6.\u416d\u56bd\u600f\u4ab3\u7bad\u51b2 \u4c04\u64f2\u5f50\u156b\ub102\u62da(\u12b2\u9a18\uc7fe\u4c2b\u6c52.\ufcaf\u8753\u446c\u6c56\u52d3\u5d20 p0, \ua562\ucb79\uc87f\u3dd3\ubcb0.\u6cfe\ua3b4\u416d\u71ae\uc910\u7e3f p1);
    
    public abstract \u5d20\u97b7\u8753\u873d\u16f6.\u416d\u56bd\u600f\u4ab3\u7bad\u51b2 \u1187\uae5d\u183a\u8cae\u59ec\u494c(\u12b2\u9a18\uc7fe\u4c2b\u6c52.\ufcaf\u8753\u446c\u6c56\u52d3\u5d20 p0);
    
    public boolean \u4179\u4d85\u527a\ubcb0\u3776\u6ec6(\u3bc9\u67e9\uc87f\u47c2\u5f50.\ubded\u718f\ucef1\ube23\u8640\u9af2 p0) {
        var_2_61 : int
        stack_B4_0 : int [generated]
        
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
            var_2_61 = and:int(ldc:int(280490379), ldc:int(1687673849))
            
            if (logicaland:boolean(invokevirtual:boolean(String::equalsIgnoreCase, invokeinterface:String(\ubded\u718f\ucef1\ube23\u8640\u9af2::\u5d20\u7ce1\ubded\ub18d\u4c04\u516c, p0:\ubded\u718f\ucef1\ube23\u8640\u9af2, ldc:String("Upgrade")), ldc:String("websocket")), invokevirtual:boolean(String::contains, invokevirtual:String(String::toLowerCase, invokeinterface:String(\ubded\u718f\ucef1\ube23\u8640\u9af2::\u5d20\u7ce1\ubded\ub18d\u4c04\u516c, p0:\ubded\u718f\ucef1\ube23\u8640\u9af2, ldc:String("Connection")), getstatic:Locale(Locale::ENGLISH)), ldc:String[expected:CharSequence]("upgrade")))) {
                stack_B4_0 = and:int(ldc:int(8221), ldc:int(6017))
            }
            else {
                var_2_61 = and:int(var_2_61:int, ldc:int(-2036477461))
                stack_B4_0 = and:int(ldc:int(6825), ldc:int(-7850))
            }
            
            return:boolean(stack_B4_0:int)
        }
        
        goto(Label_0006)
    }
    
    public abstract java.nio.ByteBuffer \u0800\u7043\u385b\u7873\u36d3\u40a9(\u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\u3504\u624e\u0b8e\u965f\ubf56\uc4d2 p0);
    
    public abstract java.util.List<\u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\u3504\u624e\u0b8e\u965f\ubf56\uc4d2> \u416d\u76bc\u946b\ub18d\u3776\u5245(java.nio.ByteBuffer p0, boolean p1);
    
    public abstract java.util.List<\u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\u3504\u624e\u0b8e\u965f\ubf56\uc4d2> \u416d\u76bc\u946b\ub18d\u3776\u5245(java.lang.String p0, boolean p1);
    
    public abstract void \u0800\u071d\u99f7\u6cfe\u6b0d\u4daf(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ub171\u8df4\ub70c\u7006\uc238\u3bc9 p0, \u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\u3504\u624e\u0b8e\u965f\ubf56\uc4d2 p1);
    
    public java.util.List<\u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\u3504\u624e\u0b8e\u965f\ubf56\uc4d2> \ud7e8\ubcb0\u59ec\u759a\u9255\u47c2(\u6cfe\u16f6\u4c04\u61a4\u8bb0.\u4daf\u5d20\u12cb\u8c8a\u8aa5\u6b0d p0, java.nio.ByteBuffer p1, boolean p2) {
        var_4_95 : int
        var_6_FA : \ub6ab\u67e9\u624e\u7049\u5bc4\u6cfe
        var_7_157 : \u5bc4\uc4d2\u64f2\u16f6\u3d64\uafe7
        
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
            var_4_95 = and:int(ldc:int(217962935), ldc:int(-1665345629))
            
            loop {
                if (cmpne:boolean(and:int(var_4_95:int, ldc:int(131072)), ldc:int(0))) {
                    goto(Label_0178)
                }
                
                if (cmpne:boolean(and:int(var_4_95:int, ldc:int(128)), ldc:int(0))) {
                    var_4_95 = and:int(var_4_95:int, ldc:int(-1121162765))
                    
                    if (cmpeq:boolean(p0:\u4daf\u5d20\u12cb\u8c8a\u8aa5\u6b0d, getstatic:\u4daf\u5d20\u12cb\u8c8a\u8aa5\u6b0d(\u4daf\u5d20\u12cb\u8c8a\u8aa5\u6b0d::\u51fa\u873d\u8d90\u8df4\u36d3\u5bc4))) {
                        looporswitchbreak()
                    }
                }
                
                Label_0134:
                
                if (cmpeq:boolean(and:int(var_4_95:int, ldc:int(128)), ldc:int(0))) {
                    var_4_95 = and:int(var_4_95:int, ldc:int(1793530453))
                }
                else {
                    if (cmpne:boolean(and:int(var_4_95:int, ldc:int(131072)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_4_95 = and:int(var_4_95:int, ldc:int(-1659906138))
                    
                    if (cmpeq:boolean(p0:\u4daf\u5d20\u12cb\u8c8a\u8aa5\u6b0d, getstatic:\u4daf\u5d20\u12cb\u8c8a\u8aa5\u6b0d(\u4daf\u5d20\u12cb\u8c8a\u8aa5\u6b0d::\u759a\u6bb9\u4daf\u7330\ud51e\ub70c))) {
                        looporswitchbreak()
                    }
                }
                
                Label_0178:
                
                if (cmpne:boolean(and:int(var_4_95:int, ldc:int(512)), ldc:int(0))) {
                    var_4_95 = and:int(var_4_95:int, ldc:int(1884859466))
                    goto(Label_0134)
                }
                
                if (cmpeq:boolean(and:int(var_4_95:int, ldc:int(8192)), ldc:int(0))) {
                    athrow(initobject:IllegalArgumentException(IllegalArgumentException::<init>, ldc:String("Only Opcode.BINARY or  Opcode.TEXT are allowed")))
                }
                
                var_4_95 = and:int(var_4_95:int, ldc:int(-170794479))
            }
            
            var_6_FA = aconstnull:\ub6ab\u67e9\u624e\u7049\u5bc4\u6cfe()
            
            if (cmpne:boolean(getfield:\u4daf\u5d20\u12cb\u8c8a\u8aa5\u6b0d(\u7d52\u51fa\u88c5\u52d3\u7873\ub6ab::\u74b1\u71f1\ucb79\ube23\u927d\ubb2b, this:\u7d52\u51fa\u88c5\u52d3\u7873\ub6ab), aconstnull:\u4daf\u5d20\u12cb\u8c8a\u8aa5\u6b0d())) {
                var_6_FA = initobject:\u7c6b\u92ff\u6c56\u56bd\u3c25\u624e[expected:\ub6ab\u67e9\u624e\u7049\u5bc4\u6cfe](\u7c6b\u92ff\u6c56\u56bd\u3c25\u624e::<init>)
            }
            else {
                if (cmpeq:boolean(putfield:\u4daf\u5d20\u12cb\u8c8a\u8aa5\u6b0d(\u7d52\u51fa\u88c5\u52d3\u7873\ub6ab::\u74b1\u71f1\ucb79\ube23\u927d\ubb2b, this:\u7d52\u51fa\u88c5\u52d3\u7873\ub6ab, p0:\u4daf\u5d20\u12cb\u8c8a\u8aa5\u6b0d), getstatic:\u4daf\u5d20\u12cb\u8c8a\u8aa5\u6b0d(\u4daf\u5d20\u12cb\u8c8a\u8aa5\u6b0d::\u51fa\u873d\u8d90\u8df4\u36d3\u5bc4))) {
                    var_6_FA = initobject:\u0a06\ua3b4\u3776\ubf56\uc29a\u12b2[expected:\ub6ab\u67e9\u624e\u7049\u5bc4\u6cfe](\u0a06\ua3b4\u3776\ubf56\uc29a\u12b2::<init>)
                }
                else {
                    if (cmpeq:boolean(p0:\u4daf\u5d20\u12cb\u8c8a\u8aa5\u6b0d, getstatic:\u4daf\u5d20\u12cb\u8c8a\u8aa5\u6b0d(\u4daf\u5d20\u12cb\u8c8a\u8aa5\u6b0d::\u759a\u6bb9\u4daf\u7330\ud51e\ub70c))) {
                        var_6_FA = initobject:\u5654\u624e\u4cd9\u8bb0\u62da\u7049[expected:\ub6ab\u67e9\u624e\u7049\u5bc4\u6cfe](\u5654\u624e\u4cd9\u8bb0\u62da\u7049::<init>)
                    }
                }
            }
            
            invokevirtual:void(\u8308\u6bb9\u8308\u7e3f\u965f\ubb2b::\ud523\u6b0d\u4e72\uc246\u5140\u120d, var_6_FA:\ub6ab\u67e9\u624e\u7049\u5bc4\u6cfe[expected:\u8308\u6bb9\u8308\u7e3f\u965f\ubb2b], p1:ByteBuffer)
            invokevirtual:void(\u8308\u6bb9\u8308\u7e3f\u965f\ubb2b::\ua61f\u64ab\ucef1\u4cd9\u0b8e\u59ec, var_6_FA:\ub6ab\u67e9\u624e\u7049\u5bc4\u6cfe[expected:\u8308\u6bb9\u8308\u7e3f\u965f\ubb2b], p2:boolean)
            
            try {
                invokevirtual:void(\ub6ab\u67e9\u624e\u7049\u5bc4\u6cfe::\u5bc4\ucef1\ub70c\u8bb0\ub171\u600f, var_6_FA:\ub6ab\u67e9\u624e\u7049\u5bc4\u6cfe)
            }
            catch (\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u5bc4\uc4d2\u64f2\u16f6\u3d64\uafe7 var_7_157) {
                athrow(initobject:IllegalArgumentException(IllegalArgumentException::<init>, var_7_157:\u5bc4\uc4d2\u64f2\u16f6\u3d64\uafe7[expected:Throwable]))
            }
            
            if (p2:boolean) {
                putfield:\u4daf\u5d20\u12cb\u8c8a\u8aa5\u6b0d(\u7d52\u51fa\u88c5\u52d3\u7873\ub6ab::\u74b1\u71f1\ucb79\ube23\u927d\ubb2b, this:\u7d52\u51fa\u88c5\u52d3\u7873\ub6ab, aconstnull:\u4daf\u5d20\u12cb\u8c8a\u8aa5\u6b0d())
            }
            else {
                putfield:\u4daf\u5d20\u12cb\u8c8a\u8aa5\u6b0d(\u7d52\u51fa\u88c5\u52d3\u7873\ub6ab::\u74b1\u71f1\ucb79\ube23\u927d\ubb2b, this:\u7d52\u51fa\u88c5\u52d3\u7873\ub6ab, p0:\u4daf\u5d20\u12cb\u8c8a\u8aa5\u6b0d)
            }
            
            return:List<\u3504\u624e\u0b8e\u965f\ubf56\uc4d2>(invokestatic:List<\ub6ab\u67e9\u624e\u7049\u5bc4\u6cfe>(Collections::singletonList, var_6_FA:\ub6ab\u67e9\u624e\u7049\u5bc4\u6cfe))
        }
        
        goto(Label_0006)
    }
    
    public abstract void \u9033\u7330\u6c56\u7043\uf9c5\u3a62();
    
    public java.util.List<java.nio.ByteBuffer> \u527a\u9255\u6c52\u3711\ud7e8\ud523(\u3bc9\u67e9\uc87f\u47c2\u5f50.\ubded\u718f\ucef1\ube23\u8640\u9af2 p0, \u56bd\u8413\u647c\u5bc4\ud158.\u6ec6\uc9f6\u8aa5\ub70c\ub8be\ubcb0 p1) {
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
            return:List<ByteBuffer>(invokevirtual:List<ByteBuffer>(\u7d52\u51fa\u88c5\u52d3\u7873\ub6ab::\u527a\u9255\u6c52\u3711\ud7e8\ud523, this:\u7d52\u51fa\u88c5\u52d3\u7873\ub6ab, p0:\ubded\u718f\ucef1\ube23\u8640\u9af2))
        }
        
        goto(Label_0006)
    }
    
    public java.util.List<java.nio.ByteBuffer> \u527a\u9255\u6c52\u3711\ud7e8\ud523(\u3bc9\u67e9\uc87f\u47c2\u5f50.\ubded\u718f\ucef1\ube23\u8640\u9af2 p0) {
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
            return:List<ByteBuffer>(invokevirtual:List<ByteBuffer>(\u7d52\u51fa\u88c5\u52d3\u7873\ub6ab::\u527a\u9255\u6c52\u3711\ud7e8\ud523, this:\u7d52\u51fa\u88c5\u52d3\u7873\ub6ab, p0:\ubded\u718f\ucef1\ube23\u8640\u9af2, xor:int[expected:boolean](ldc:int(12), ldc:int(13))))
        }
        
        goto(Label_0006)
    }
    
    public java.util.List<java.nio.ByteBuffer> \u527a\u9255\u6c52\u3711\ud7e8\ud523(\u3bc9\u67e9\uc87f\u47c2\u5f50.\ubded\u718f\ucef1\ube23\u8640\u9af2 p0, \u56bd\u8413\u647c\u5bc4\ud158.\u6ec6\uc9f6\u8aa5\ub70c\ub8be\ubcb0 p1, boolean p2) {
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
            return:List<ByteBuffer>(invokevirtual:List<ByteBuffer>(\u7d52\u51fa\u88c5\u52d3\u7873\ub6ab::\u527a\u9255\u6c52\u3711\ud7e8\ud523, this:\u7d52\u51fa\u88c5\u52d3\u7873\ub6ab, p0:\ubded\u718f\ucef1\ube23\u8640\u9af2, p2:boolean))
        }
        
        goto(Label_0006)
    }
    
    public java.util.List<java.nio.ByteBuffer> \u527a\u9255\u6c52\u3711\ud7e8\ud523(\u3bc9\u67e9\uc87f\u47c2\u5f50.\ubded\u718f\ucef1\ube23\u8640\u9af2 p0, boolean p1) {
        var_3_88 : int
        var_5_6B : StringBuilder
        var_3_143 : int
        var_6_135 : Iterator<String>
        var_7_19D : String
        var_8_1A7 : String
        var_7_17F : byte[]
        var_8_1D8 : byte[]
        var_9_1F7 : ByteBuffer
        
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
        var_3_88 = and:int(ldc:int(-1390074623), ldc:int(-2026263543))
        var_5_6B = initobject:StringBuilder(StringBuilder::<init>, ldc:int(100))
        
        if (instanceof:boolean(\u12b2\u9a18\uc7fe\u4c2b\u6c52.\ufcaf\u8753\u446c\u6c56\u52d3\u5d20.class, p0:\ubded\u718f\ucef1\ube23\u8640\u9af2)) {
            invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, var_5_6B:StringBuilder, ldc:String("GET ")), invokeinterface:String(\ufcaf\u8753\u446c\u6c56\u52d3\u5d20::\u2dcc\u12cb\u624e\u67d0\u51b2\u494c, checkcast:\ufcaf\u8753\u446c\u6c56\u52d3\u5d20(\u12b2\u9a18\uc7fe\u4c2b\u6c52.\ufcaf\u8753\u446c\u6c56\u52d3\u5d20.class, p0:\ubded\u718f\ucef1\ube23\u8640\u9af2[expected:\ufcaf\u8753\u446c\u6c56\u52d3\u5d20]))), ldc:String(" HTTP/1.1"))
            goto(Label_0265)
        }
        
        Label_0116:
        
        if (cmpeq:boolean(and:int(var_3_88:int, ldc:int(16777216)), ldc:int(0))) {
            goto(Label_0265)
        }
        
        if (cmpeq:boolean(and:int(var_3_88:int, ldc:int(2147483647)), ldc:int(0))) {
            var_3_88 = and:int(var_3_88:int, ldc:int(-1760842949))
        }
        else {
            var_3_88 = and:int(var_3_88:int, ldc:int(-1925343371))
            
            if (instanceof:boolean(\ua562\ucb79\uc87f\u3dd3\ubcb0.\u6cfe\ua3b4\u416d\u71ae\uc910\u7e3f.class, p0:\ubded\u718f\ucef1\ube23\u8640\u9af2)) {
                invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, var_5_6B:StringBuilder, ldc:String("HTTP/1.1 101 ")), invokeinterface:String(\u6cfe\ua3b4\u416d\u71ae\uc910\u7e3f::\uc7fe\ud171\ub6ab\ud12e\u93a2\ud171, checkcast:\u6cfe\ua3b4\u416d\u71ae\uc910\u7e3f(\ua562\ucb79\uc87f\u3dd3\ubcb0.\u6cfe\ua3b4\u416d\u71ae\uc910\u7e3f.class, p0:\ubded\u718f\ucef1\ube23\u8640\u9af2[expected:\u6cfe\ua3b4\u416d\u71ae\uc910\u7e3f])))
                goto(Label_0265)
            }
        }
        
        Label_0153:
        
        if (cmpne:boolean(and:int(var_3_88:int, ldc:int(4096)), ldc:int(0))) {
            var_3_88 = and:int(var_3_88:int, ldc:int(-1390389753))
        }
        else {
            if (cmpne:boolean(and:int(var_3_88:int, ldc:int(131072)), ldc:int(0))) {
                var_3_88 = and:int(var_3_88:int, ldc:int(-1132481818))
                goto(Label_0116)
            }
            
            athrow(initobject:IllegalArgumentException(IllegalArgumentException::<init>, ldc:String("unknown role")))
        }
        
        Label_0265:
        
        if (cmpne:boolean(and:int(var_3_88:int, ldc:int(4096)), ldc:int(0))) {
            goto(Label_0153)
        }
        
        if (cmpne:boolean(and:int(var_3_88:int, ldc:int(4096)), ldc:int(0))) {
            var_3_88 = and:int(var_3_88:int, ldc:int(306620726))
            goto(Label_0116)
        }
        
        var_3_143 = and:int(var_3_88:int, ldc:int(-1757753923))
        invokevirtual:StringBuilder(StringBuilder::append, var_5_6B:StringBuilder, ldc:String("\r\n"))
        var_6_135 = invokeinterface:Iterator<String>(\ubded\u718f\ucef1\ube23\u8640\u9af2::\u0a06\uf94d\u0b8e\uc4d2\u927d\u5245, p0:\ubded\u718f\ucef1\ube23\u8640\u9af2)
        
        loop {
            if (cmpne:boolean(and:int(var_3_143:int, ldc:int(1048576)), ldc:int(0))) {
                var_3_143 = and:int(var_3_143:int, ldc:int(-1373792274))
            }
            else {
                var_3_143 = and:int(var_3_143:int, ldc:int(-1075479437))
                
                if (invokeinterface:boolean(Iterator::hasNext, var_6_135:Iterator)) {
                    var_7_19D = checkcast:String(java.lang.String.class, invokeinterface:String(Iterator<String>::next, var_6_135:Iterator<String>))
                    var_8_1A7 = invokeinterface:String(\ubded\u718f\ucef1\ube23\u8640\u9af2::\u5d20\u7ce1\ubded\ub18d\u4c04\u516c, p0:\ubded\u718f\ucef1\ube23\u8640\u9af2, var_7_19D:String)
                    invokevirtual:StringBuilder(StringBuilder::append, var_5_6B:StringBuilder, var_7_19D:String)
                    invokevirtual:StringBuilder(StringBuilder::append, var_5_6B:StringBuilder, ldc:String(": "))
                    invokevirtual:StringBuilder(StringBuilder::append, var_5_6B:StringBuilder, var_8_1A7:String)
                    invokevirtual:StringBuilder(StringBuilder::append, var_5_6B:StringBuilder, ldc:String("\r\n"))
                    loopcontinue()
                }
            }
            
            if (cmpeq:boolean(and:int(var_3_143:int, ldc:int(16)), ldc:int(0))) {
                looporswitchbreak()
            }
            
            var_3_143 = and:int(var_3_143:int, ldc:int(1548392428))
        }
        
        invokevirtual:StringBuilder(StringBuilder::append, var_5_6B:StringBuilder, ldc:String("\r\n"))
        var_7_17F = invokestatic:byte[](\uc7fe\ud217\u416d\u4c2b\u47c2\ufe34::\u7e3f\u4f4a\u527a\u8258\u34df\u392e, invokevirtual:String(StringBuilder::toString, var_5_6B:StringBuilder))
        var_8_1D8 = ternaryop:byte[](p1:boolean, invokeinterface:byte[](\ubded\u718f\ucef1\ube23\u8640\u9af2::\uf995\u946b\u7873\u4daf\u4f52\ub70c, p0:\ubded\u718f\ucef1\ube23\u8640\u9af2), aconstnull:byte[]())
        var_9_1F7 = invokestatic:ByteBuffer(ByteBuffer::allocate, add:int(ternaryop:int(cmpne:boolean(var_8_1D8:byte[], aconstnull:byte[]()), arraylength:int(var_8_1D8:byte[]), and:int(ldc:int(-13007), ldc:int(12878))), arraylength:int(var_7_17F:byte[])))
        invokevirtual:ByteBuffer(ByteBuffer::put, var_9_1F7:ByteBuffer, var_7_17F:byte[])
        
        if (cmpne:boolean(var_8_1D8:byte[], aconstnull:byte[]())) {
            invokevirtual:ByteBuffer(ByteBuffer::put, var_9_1F7:ByteBuffer, var_8_1D8:byte[])
        }
        
        invokevirtual:Buffer(Buffer::flip, var_9_1F7:ByteBuffer[expected:Buffer])
        return:List<ByteBuffer>(invokestatic:List<ByteBuffer>(Collections::singletonList, var_9_1F7:ByteBuffer))
    }
    
    public abstract \u8cae\u8bb0\ucef1\u8c8a\u3a62.\ub6ab\u516c\ub70c\u76bc\u74b1\u416d \u6d99\u8d98\u0800\u5654\u647c\u69d9(\u8cae\u8bb0\ucef1\u8c8a\u3a62.\ub6ab\u516c\ub70c\u76bc\u74b1\u416d p0);
    
    public abstract \u5245\u8aa5\u61a4\u7049\u4cd9.\u9033\ufcaf\u6b5f\u12b2\u3504\u8bb0 \u0c95\u9a18\uc29a\u5f50\u40a9\u4975(\u12b2\u9a18\uc7fe\u4c2b\u6c52.\ufcaf\u8753\u446c\u6c56\u52d3\u5d20 p0, \ud36e\u6bb9\u960f\u4c04\u64ab.\u9af2\u7873\u59ec\uceb8\ub6ab\u927d p1);
    
    public abstract java.util.List<\u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\u3504\u624e\u0b8e\u965f\ubf56\uc4d2> \ub83f\ub32d\u4f52\u183a\u6198\u7049(java.nio.ByteBuffer p0);
    
    public abstract \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ub19c\u416d\uc84e\u8389\u12cb.\u99f7\u9a18\u92ee\u12b2\u9255\u7330 \u98a4\u8d90\uc229\u5f50\u7bad\ucb79();
    
    public abstract \u3bc9\u67e9\uc87f\u47c2\u5f50.\u7d52\u51fa\u88c5\u52d3\u7873\ub6ab \u071d\u40a9\u0b8e\ucb79\u718f\u71f1();
    
    public \u3bc9\u67e9\uc87f\u47c2\u5f50.\ubded\u718f\ucef1\ube23\u8640\u9af2 \u8413\u965f\u59ec\u4f4a\u873d\u7af6(java.nio.ByteBuffer p0) {
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
            return:\ubded\u718f\ucef1\ube23\u8640\u9af2(invokestatic:\u9033\ufcaf\u6b5f\u12b2\u3504\u8bb0[expected:\ubded\u718f\ucef1\ube23\u8640\u9af2](\u7d52\u51fa\u88c5\u52d3\u7873\ub6ab::\u3d64\u8350\u6435\ubb2b\u6d99\u7006, p0:ByteBuffer, getfield:\u6ec6\uc9f6\u8aa5\ub70c\ub8be\ubcb0(\u7d52\u51fa\u88c5\u52d3\u7873\ub6ab::\ud12e\u6c56\u3bc9\u9a18\u8350\u3d64, this:\u7d52\u51fa\u88c5\u52d3\u7873\ub6ab)))
        }
        
        goto(Label_0006)
    }
    
    public int \uf94d\ucb79\ub171\u416d\u527a\ub171(int p0) {
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
        
        if (cmpge:boolean(p0:int, ldc:int(0))) {
            return:int(p0:int)
        }
        
        athrow(initobject:\u5bc4\uc4d2\u64f2\u16f6\u3d64\uafe7(\u5bc4\uc4d2\u64f2\u16f6\u3d64\uafe7::<init>, xor:int(ldc:int(-30367), ldc:int(-30069)), ldc:String("Negative count")))
    }
    
    public int \u92ee\ubb2b\u9937\ucb79\ub8be\u3c25(\u3bc9\u67e9\uc87f\u47c2\u5f50.\ubded\u718f\ucef1\ube23\u8640\u9af2 p0) {
        var_2_CB : int
        var_4_71 : String
        var_5_DB : int
        stack_EB_0 : int [generated]
        
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
            var_2_CB = and:int(and:int(ldc:int(-1323205493), ldc:int(1556329862)), ldc:int(813299178))
            var_4_71 = invokeinterface:String(\ubded\u718f\ucef1\ube23\u8640\u9af2::\u5d20\u7ce1\ubded\ub18d\u4c04\u516c, p0:\ubded\u718f\ucef1\ube23\u8640\u9af2, ldc:String("Sec-WebSocket-Version"))
            
            loop {
                if (cmpne:boolean(and:int(var_2_CB:int, ldc:int(134217728)), ldc:int(0))) {
                    var_2_CB = and:int(var_2_CB:int, ldc:int(1688524612))
                    goto(Label_0174)
                }
                
                if (cmpeq:boolean(and:int(var_2_CB:int, ldc:int(4194304)), ldc:int(0))) {
                    var_2_CB = and:int(var_2_CB:int, ldc:int(-1335413282))
                    
                    if (cmple:boolean(invokevirtual:int(String::length, var_4_71:String), ldc:int(0))) {
                        looporswitchbreak()
                    }
                }
                
                Label_0153:
                
                if (cmpeq:boolean(and:int(var_2_CB:int, ldc:int(1073741824)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_2_CB:int, ldc:int(268435456)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_2_CB = and:int(var_2_CB:int, ldc:int(2123841179))
                }
                
                try {
                    Label_0174:
                    
                    if (cmpeq:boolean(and:int(var_2_CB:int, ldc:int(128)), ldc:int(0))) {
                        var_2_CB = and:int(var_2_CB:int, ldc:int(1982913110))
                        goto(Label_0153)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_CB:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_2_CB = and:int(var_2_CB:int, ldc:int(-1844873269))
                        var_5_DB = invokevirtual:int(Integer::intValue, initobject:Integer(Integer::<init>, invokevirtual:String(String::trim, var_4_71:String)))
                        var_2_CB = and:int(var_2_CB:int, ldc:int(-1864632113))
                        stack_EB_0 = var_5_DB:int
                        var_2_CB = and:int(var_2_CB:int, ldc:int(926513586))
                        return:int(stack_EB_0:int)
                    }
                    
                    loopcontinue()
                }
                catch (java.lang.NumberFormatException var_6_F0) {
                    return:int(ldc:int(-1))
                }
                
                looporswitchbreak()
            }
            
            return:int(ldc:int(-1))
        }
        
        goto(Label_0006)
    }
    
    public void \uceb8\u88c5\ud36e\ubefe\u6198\u7af6(\u56bd\u8413\u647c\u5bc4\ud158.\u6ec6\uc9f6\u8aa5\ub70c\ub8be\ubcb0 p0) {
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
            putfield:\u6ec6\uc9f6\u8aa5\ub70c\ub8be\ubcb0(\u7d52\u51fa\u88c5\u52d3\u7873\ub6ab::\ud12e\u6c56\u3bc9\u9a18\u8350\u3d64, this:\u7d52\u51fa\u88c5\u52d3\u7873\ub6ab, p0:\u6ec6\uc9f6\u8aa5\ub70c\ub8be\ubcb0)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public \u56bd\u8413\u647c\u5bc4\ud158.\u6ec6\uc9f6\u8aa5\ub70c\ub8be\ubcb0 \u9255\uafe7\u7af6\u76bc\u624e\u624e() {
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
            return:\u6ec6\uc9f6\u8aa5\ub70c\ub8be\ubcb0(getfield:\u6ec6\uc9f6\u8aa5\ub70c\ub8be\ubcb0(\u7d52\u51fa\u88c5\u52d3\u7873\ub6ab::\ud12e\u6c56\u3bc9\u9a18\u8350\u3d64, this:\u7d52\u51fa\u88c5\u52d3\u7873\ub6ab))
        }
        
        goto(Label_0006)
    }
    
    public java.lang.String toString() {
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
            return:String(invokevirtual:String(Class<T>::getSimpleName, invokevirtual:Class<? extends \u7d52\u51fa\u88c5\u52d3\u7873\ub6ab>(\u7d52\u51fa\u88c5\u52d3\u7873\ub6ab::getClass, this:\u7d52\u51fa\u88c5\u52d3\u7873\ub6ab)))
        }
        
        goto(Label_0006)
    }
    
    public void \u5d20\u67e9\u71ae\u4975\u40a9\ud12e(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_67B : int
        var_5_89 : int
        var_6_90 : int
        var_7_9F : double
        var_9_C7 : double
        var_3_D9 : int
        var_11_EA : int
        var_14_114 : double
        var_16_118 : int
        var_12_110 : double
        var_17_686 : int
        
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
        var_3_67B = and:int(ldc:int(1350411370), ldc:int(-37880449))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u7d52\u51fa\u88c5\u52d3\u7873\ub6ab[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0179)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(1)), ldc:int(0))) {
            var_3_67B = and:int(var_3_67B:int, ldc:int(1036491748))
        }
        else {
            var_3_67B = and:int(var_3_67B:int, ldc:int(1463725159))
            var_5_89 = and:int(ldc:int(20032), ldc:int(-28513))
            var_6_90 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9F = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(4880), ldc:int(-4881)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C7 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D9 = and:int(var_3_67B:int, ldc:int(-147327942))
                    var_9_C7 = sub:double(var_7_9F:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EA = var_5_89:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EA:int, sub:int(var_6_90:int, xor:int(ldc:int(19968), ldc:int(19969)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EA:int, xor:int(ldc:int(6153), ldc:int(6152)))), var_7_9F:double))) {
                        inc:int(var_11_EA, ldc:int(1))
                    }
                    
                    var_3_67B = and:int(var_3_D9:int, ldc:int(1597486390))
                    var_14_114 = var_7_9F:double
                    var_16_118 = var_11_EA:int
                }
                else {
                    var_11_EA = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_89:int), xor:int(ldc:int(-28600), ldc:int(-28599)))
                    var_12_110 = var_14_114 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_89)
                    
                    if (cmplt:boolean(var_16_118 = var_11_EA:int, var_6_90:int)) {
                        var_9_C7 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EA:int)
                        var_16_118 = var_11_EA:int
                        var_14_114 = var_12_110:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1530)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(81767738))
                        goto(Label_1357)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1215)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1073)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(2)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(1716522249))
                        goto(Label_0907)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(16)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(1246224485))
                        goto(Label_0776)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0665)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0561)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(32)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(1563360367))
                        
                        if (cmplt:boolean(var_16_118:int, var_6_90:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0561)
                            }
                            
                            goto(Label_0776)
                        }
                    }
                    
                    Label_0399:
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(1)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(1220998081))
                        goto(Label_1530)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1357)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1215)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-619164686))
                        goto(Label_1073)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0907)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(1207334900))
                        goto(Label_0776)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0665)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(16)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(-1272644705))
                            loopcontinue()
                        }
                        
                        var_3_67B = and:int(var_3_67B:int, ldc:int(1488774371))
                        var_11_EA = and:int(ldc:int(4932), ldc:int(-13159))
                        goto(Label_1519)
                    }
                    
                    Label_0561:
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(2051072635))
                        goto(Label_1530)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-1167101020))
                        goto(Label_1357)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1215)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1073)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0907)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0776)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(1024)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0399)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(32768)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-60506242))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_114 = var_9_C7:double
                            goto(Label_0776)
                        }
                    }
                    
                    Label_0665:
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1530)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1357)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-2003360838))
                        goto(Label_1215)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(1086643591))
                        goto(Label_1073)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0907)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(16)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0561)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0399)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(134217728)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-635114313))
                        var_14_114 = mul:double(ldc:double(0.5), add:double(var_9_C7:double, var_14_114:double))
                    }
                    
                    Label_0776:
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1530)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(1530046197))
                        goto(Label_1357)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-1800692146))
                        goto(Label_1215)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(785341170))
                        goto(Label_1073)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(16)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-2005647750))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(360529430))
                            goto(Label_0665)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0561)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0399)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(1)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_67B = and:int(var_3_67B:int, ldc:int(1463727919))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_89:int), var_7_9F:double)) {
                                var_11_EA = xor:int(ldc:int(3648), ldc:int(3649))
                                goto(Label_1073)
                            }
                        }
                    }
                    
                    Label_0907:
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1530)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(854459431))
                        goto(Label_1357)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-827813970))
                        goto(Label_1215)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-917580912))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0776)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0665)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0561)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(-361478642))
                            goto(Label_0399)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(-214863453))
                            loopcontinue()
                        }
                        
                        var_3_67B = and:int(var_3_67B:int, ldc:int(1940323879))
                        var_11_EA = and:int(ldc:int(-23429), ldc:int(4996))
                    }
                    
                    Label_1073:
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(155571971))
                        goto(Label_1530)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(128)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(1525705089))
                        goto(Label_1357)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-1633892544))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(551704961))
                            goto(Label_0907)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(16)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(1112430367))
                            goto(Label_0776)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(-684426390))
                            goto(Label_0665)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0561)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0399)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(128)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_67B = and:int(var_3_67B:int, ldc:int(1420209722))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EA:int, ldc:int(0))) {
                                goto(Label_1357)
                            }
                        }
                    }
                    
                    Label_1215:
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1530)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(161278038))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_1073)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(762686055))
                            goto(Label_0907)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(128)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(-1495906260))
                            goto(Label_0776)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(32)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(-1135433069))
                            goto(Label_0665)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(-1763526419))
                            goto(Label_0561)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0399)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(1555412346))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_114:double, var_5_89:int, var_16_118:int)
                            goto(Label_1519)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1357:
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-218244096))
                        goto(Label_1530)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(128)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(728348021))
                        goto(Label_1215)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1073)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(16)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-1187439317))
                        goto(Label_0907)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(32)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(1764748365))
                        goto(Label_0776)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-1455563191))
                        goto(Label_0665)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(46217058))
                        goto(Label_0561)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(2)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(1644595167))
                        goto(Label_0399)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(16)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_67B = and:int(var_3_67B:int, ldc:int(-265307018))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_114:double, ldc:double(0.0))
                    Label_1519:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_686 = var_5_89:int
                        
                        if (cmpeq:boolean(var_11_EA:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1530:
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1357)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-890181261))
                        goto(Label_1215)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(2134678907))
                        goto(Label_1073)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(953582796))
                        goto(Label_0907)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0776)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(1505121837))
                        goto(Label_0665)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(16)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(1606761403))
                        goto(Label_0561)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(128)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-1358784387))
                        goto(Label_0399)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(2)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(1450049067))
                        var_17_686 = add:int(var_16_118:int, and:int(ldc:int(4357), ldc:int(209)))
                        looporswitchbreak()
                    }
                }
                
                var_3_67B = and:int(var_3_67B:int, ldc:int(-651317830))
                
                if (cmple:boolean(var_5_89 = var_17_686:int, sub:int(var_6_90:int, xor:int(ldc:int(9736), ldc:int(9737))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0179:
        
        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(8192)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
