public class \u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u836c\u67e9\u5d20\u5fe1\u7e3f.\u4bc8\u6b0d\u965f\u67e9\uc84e\u7af6 {
    public void \u4bc8\u6b0d\u965f\u67e9\uc84e\u7af6() {
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
            invokespecial:Object(Object::<init>, this:\u4bc8\u6b0d\u965f\u67e9\uc84e\u7af6)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static short \u69d9\u6198\u1187\u3711\uc229\u3e2a(short p0) {
        var_3_64 : int
        
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
            var_3_64 = and:int(p0:short[expected:int], ldc:int(65535))
            return:short(i2s:short(or:int(shl:int(var_3_64:int, ldc:int(8)), ushr:int(and:int(var_3_64:int, ldc:int(65280)), ldc:int(8)))))
        }
        
        goto(Label_0006)
    }
    
    public void \u7e3f\u8d98\u71f1\u0800\u3d64\u416d(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\ucfaf\ubb2b\u6fb0\u8cae\uc3e3\u760c p0, java.lang.String p1, java.io.OutputStream p2, boolean p3) {
        var_5_61 : int
        var_7_72 : DataOutputStream
        var_5_152 : int
        var_8_160 : int
        var_5_1B9 : int
        var_9_1AA : int
        var_10_1E5 : \u9a18\u5d20\uc2bd\u93a2\uc2e8\u7330
        
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
        var_5_61 = and:int(ldc:int(-1715821197), ldc:int(-1712067537))
        var_7_72 = initobject:DataOutputStream(DataOutputStream::<init>, initobject:BufferedOutputStream[expected:OutputStream](BufferedOutputStream::<init>, p2:OutputStream))
        invokevirtual:void(DataOutputStream::writeByte, var_7_72:DataOutputStream, and:int(ldc:int(2102), ldc:int(-11831)))
        invokevirtual:void(DataOutputStream::writeByte, var_7_72:DataOutputStream, and:int(ldc:int(-18778), ldc:int(2377)))
        invokevirtual:void(DataOutputStream::writeByte, var_7_72:DataOutputStream, xor:int(ldc:int(8209), ldc:int(8211)))
        invokevirtual:void(DataOutputStream::writeShort, var_7_72:DataOutputStream, invokestatic:short[expected:int](\u4bc8\u6b0d\u965f\u67e9\uc84e\u7af6::\u69d9\u6198\u1187\u3711\uc229\u3e2a, and:int[expected:short](ldc:int(-15702), ldc:int(9552))))
        invokevirtual:void(DataOutputStream::writeShort, var_7_72:DataOutputStream, invokestatic:short[expected:int](\u4bc8\u6b0d\u965f\u67e9\uc84e\u7af6::\u69d9\u6198\u1187\u3711\uc229\u3e2a, and:int[expected:short](ldc:int(20817), ldc:int(-22866))))
        invokevirtual:void(DataOutputStream::writeByte, var_7_72:DataOutputStream, and:int(ldc:int(-28577), ldc:int(28576)))
        invokevirtual:void(DataOutputStream::writeShort, var_7_72:DataOutputStream, invokestatic:short[expected:int](\u4bc8\u6b0d\u965f\u67e9\uc84e\u7af6::\u69d9\u6198\u1187\u3711\uc229\u3e2a, and:int[expected:short](ldc:int(23584), ldc:int(-23593))))
        invokevirtual:void(DataOutputStream::writeShort, var_7_72:DataOutputStream, invokestatic:short[expected:int](\u4bc8\u6b0d\u965f\u67e9\uc84e\u7af6::\u69d9\u6198\u1187\u3711\uc229\u3e2a, and:int[expected:short](ldc:int(-14607), ldc:int(10510))))
        invokevirtual:void(DataOutputStream::writeShort, var_7_72:DataOutputStream, invokestatic:short[expected:int](\u4bc8\u6b0d\u965f\u67e9\uc84e\u7af6::\u69d9\u6198\u1187\u3711\uc229\u3e2a, i2s:short(invokevirtual:int(\ucfaf\ubb2b\u6fb0\u8cae\uc3e3\u760c::\uc238\uc29a\uf995\u5245\ucef1\u836c, p0:\ucfaf\ubb2b\u6fb0\u8cae\uc3e3\u760c))))
        invokevirtual:void(DataOutputStream::writeShort, var_7_72:DataOutputStream, invokestatic:short[expected:int](\u4bc8\u6b0d\u965f\u67e9\uc84e\u7af6::\u69d9\u6198\u1187\u3711\uc229\u3e2a, i2s:short(invokevirtual:int(\ucfaf\ubb2b\u6fb0\u8cae\uc3e3\u760c::\uc31c\u3d64\uff55\u36d3\u3bd6\u12b2, p0:\ucfaf\ubb2b\u6fb0\u8cae\uc3e3\u760c))))
        
        if (p3:boolean) {
            invokevirtual:void(DataOutputStream::writeByte, var_7_72:DataOutputStream, ldc:int(32))
            invokevirtual:void(DataOutputStream::writeByte, var_7_72:DataOutputStream, and:int(ldc:int(6065), ldc:int(8207)))
            goto(Label_0325)
        }
        
        Label_0255:
        
        if (cmpeq:boolean(and:int(var_5_61:int, ldc:int(16777216)), ldc:int(0))) {
            var_5_61 = and:int(var_5_61:int, ldc:int(-68224154))
        }
        else {
            var_5_61 = and:int(var_5_61:int, ldc:int(-878713283))
            invokevirtual:void(DataOutputStream::writeByte, var_7_72:DataOutputStream, ldc:int(24))
            invokevirtual:void(DataOutputStream::writeByte, var_7_72:DataOutputStream, and:int(ldc:int(-16080), ldc:int(13390)))
        }
        
        Label_0325:
        
        if (cmpeq:boolean(and:int(var_5_61:int, ldc:int(4096)), ldc:int(0))) {
            var_5_152 = and:int(var_5_61:int, ldc:int(-1610875724))
            var_8_160 = sub:int(invokevirtual:int(\ucfaf\ubb2b\u6fb0\u8cae\uc3e3\u760c::\uc31c\u3d64\uff55\u36d3\u3bd6\u12b2, p0:\ucfaf\ubb2b\u6fb0\u8cae\uc3e3\u760c), and:int(ldc:int(8233), ldc:int(6723)))
            
            loop {
                if (cmpne:boolean(and:int(var_5_152:int, ldc:int(4194304)), ldc:int(0))) {
                    var_5_1B9 = and:int(var_5_152:int, ldc:int(31027735))
                }
                else {
                    var_5_1B9 = and:int(var_5_152:int, ldc:int(-277354893))
                    
                    if (cmple:boolean(var_8_160:int, ldc:int(0))) {
                        var_9_1AA = and:int(ldc:int(4272), ldc:int(-4273))
                        
                        loop {
                            if (cmpne:boolean(and:int(var_5_1B9:int, ldc:int(134217728)), ldc:int(0))) {
                                var_5_1B9 = and:int(var_5_1B9:int, ldc:int(-1619598105))
                                
                                if (cmplt:boolean(var_9_1AA:int, invokevirtual:int(\ucfaf\ubb2b\u6fb0\u8cae\uc3e3\u760c::\uc238\uc29a\uf995\u5245\ucef1\u836c, p0:\ucfaf\ubb2b\u6fb0\u8cae\uc3e3\u760c))) {
                                    var_10_1E5 = invokevirtual:\u9a18\u5d20\uc2bd\u93a2\uc2e8\u7330(\ucfaf\ubb2b\u6fb0\u8cae\uc3e3\u760c::\ua3b4\u946b\uceb8\u416d\ud12e\u0800, p0:\ucfaf\ubb2b\u6fb0\u8cae\uc3e3\u760c, var_9_1AA:int, var_8_160:int)
                                    invokevirtual:void(DataOutputStream::writeByte, var_7_72:DataOutputStream, i2b:byte(f2i:int(mul:float(getfield:float(\u9a18\u5d20\uc2bd\u93a2\uc2e8\u7330::\u5245\u3bc9\uc910\ub1b9\u4f52\uf94d, var_10_1E5:\u9a18\u5d20\uc2bd\u93a2\uc2e8\u7330), ldc:float(255.0f)))))
                                    invokevirtual:void(DataOutputStream::writeByte, var_7_72:DataOutputStream, i2b:byte(f2i:int(mul:float(getfield:float(\u9a18\u5d20\uc2bd\u93a2\uc2e8\u7330::\uc31c\ua562\u64f2\u0a06\u839e\u120d, var_10_1E5:\u9a18\u5d20\uc2bd\u93a2\uc2e8\u7330), ldc:float(255.0f)))))
                                    invokevirtual:void(DataOutputStream::writeByte, var_7_72:DataOutputStream, i2b:byte(f2i:int(mul:float(getfield:float(\u9a18\u5d20\uc2bd\u93a2\uc2e8\u7330::\u385b\uc4d2\u527a\u4cd9\u56bd\ubff1, var_10_1E5:\u9a18\u5d20\uc2bd\u93a2\uc2e8\u7330), ldc:float(255.0f)))))
                                    
                                    if (p3:boolean) {
                                        invokevirtual:void(DataOutputStream::writeByte, var_7_72:DataOutputStream, i2b:byte(f2i:int(mul:float(getfield:float(\u9a18\u5d20\uc2bd\u93a2\uc2e8\u7330::\ubb2b\u3d64\ud171\u76bc\u071d\u8d90, var_10_1E5:\u9a18\u5d20\uc2bd\u93a2\uc2e8\u7330), ldc:float(255.0f)))))
                                    }
                                    
                                    var_5_1B9 = and:int(var_5_1B9:int, ldc:int(-271077468))
                                    inc:int(var_9_1AA, ldc:int(1))
                                    loopcontinue()
                                }
                            }
                            
                            if (cmpeq:boolean(and:int(var_5_1B9:int, ldc:int(512)), ldc:int(0))) {
                                looporswitchbreak()
                            }
                        }
                        
                        var_5_152 = and:int(var_5_1B9:int, ldc:int(-1424562976))
                        inc:int(var_8_160, ldc:int(-1))
                        loopcontinue()
                    }
                }
                
                if (cmpne:boolean(and:int(var_5_1B9:int, ldc:int(8192)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_5_152 = and:int(var_5_1B9:int, ldc:int(1364895770))
            }
            
            invokevirtual:void(FilterOutputStream::close, var_7_72:DataOutputStream[expected:FilterOutputStream])
            return:void()
        }
        
        goto(Label_0255)
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
    
    public void \u6ec6\u76bc\u839e\u3bc9\uc2e8\ubf56(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_5EB : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_B9 : double
        var_3_CA : int
        var_11_DB : int
        var_14_105 : double
        var_16_109 : int
        var_12_101 : double
        var_17_5F6 : int
        
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
        var_3_5EB = and:int(ldc:int(140628797), ldc:int(-293915585))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u4bc8\u6b0d\u965f\u67e9\uc84e\u7af6[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_5EB:int, ldc:int(8192)), ldc:int(0))) {
            var_3_5EB = and:int(var_3_5EB:int, ldc:int(47552049))
            var_5_7D = and:int(ldc:int(25441), ldc:int(-25446))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(19532), ldc:int(-27727)))
            invokestatic:int(m::a)
            
            loop {
                var_9_B9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_CA = and:int(var_3_5EB:int, ldc:int(893909303))
                    var_9_B9 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_DB = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_DB:int, sub:int(var_6_84:int, and:int(ldc:int(16641), ldc:int(7845)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_DB:int, xor:int(ldc:int(17026), ldc:int(17027)))), var_7_93:double))) {
                        inc:int(var_11_DB, ldc:int(1))
                    }
                    
                    var_3_5EB = and:int(var_3_CA:int, ldc:int(895292273))
                    var_14_105 = var_7_93:double
                    var_16_109 = var_11_DB:int
                }
                else {
                    var_11_DB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), xor:int(ldc:int(3), ldc:int(2)))
                    var_12_101 = var_14_105 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_109 = var_11_DB:int, var_6_84:int)) {
                        var_9_B9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_DB:int)
                        var_16_109 = var_11_DB:int
                        var_14_105 = var_12_101:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_5EB:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1402)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5EB:int, ldc:int(64)), ldc:int(0))) {
                        var_3_5EB = and:int(var_3_5EB:int, ldc:int(1802397689))
                        goto(Label_1268)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EB:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1146)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EB:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1035)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5EB:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_5EB = and:int(var_3_5EB:int, ldc:int(-1526730105))
                        goto(Label_0881)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EB:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_5EB = and:int(var_3_5EB:int, ldc:int(-391239566))
                        goto(Label_0786)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EB:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0676)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EB:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5EB = and:int(var_3_5EB:int, ldc:int(77698594))
                        goto(Label_0565)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EB:int, ldc:int(32)), ldc:int(0))) {
                        var_3_5EB = and:int(var_3_5EB:int, ldc:int(1757182016))
                    }
                    else {
                        var_3_5EB = and:int(var_3_5EB:int, ldc:int(-1235675265))
                        
                        if (cmplt:boolean(var_16_109:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0565)
                            }
                            
                            goto(Label_0786)
                        }
                    }
                    
                    Label_0389:
                    
                    if (cmpne:boolean(and:int(var_3_5EB:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_5EB = and:int(var_3_5EB:int, ldc:int(-676288401))
                        goto(Label_1402)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EB:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_5EB = and:int(var_3_5EB:int, ldc:int(-1588930109))
                        goto(Label_1268)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5EB:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_5EB = and:int(var_3_5EB:int, ldc:int(-1750666666))
                        goto(Label_1146)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5EB:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1035)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5EB:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0881)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EB:int, ldc:int(32)), ldc:int(0))) {
                        var_3_5EB = and:int(var_3_5EB:int, ldc:int(1744026379))
                        goto(Label_0786)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5EB:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_5EB = and:int(var_3_5EB:int, ldc:int(1332682299))
                        goto(Label_0676)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EB:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_5EB = and:int(var_3_5EB:int, ldc:int(-1568166344))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5EB:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_5EB = and:int(var_3_5EB:int, ldc:int(-1132453749))
                            loopcontinue()
                        }
                        
                        var_3_5EB = and:int(var_3_5EB:int, ldc:int(-1318872069))
                        var_11_DB = and:int(ldc:int(-12856), ldc:int(12834))
                        goto(Label_1391)
                    }
                    
                    Label_0565:
                    
                    if (cmpne:boolean(and:int(var_3_5EB:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_5EB = and:int(var_3_5EB:int, ldc:int(1478557922))
                        goto(Label_1402)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5EB:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1268)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EB:int, ldc:int(32)), ldc:int(0))) {
                        var_3_5EB = and:int(var_3_5EB:int, ldc:int(-958748037))
                        goto(Label_1146)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5EB:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1035)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EB:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0881)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EB:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0786)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EB:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_5EB = and:int(var_3_5EB:int, ldc:int(-1895082396))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5EB:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5EB:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_5EB = and:int(var_3_5EB:int, ldc:int(-1822966056))
                            loopcontinue()
                        }
                        
                        var_3_5EB = and:int(var_3_5EB:int, ldc:int(1987131449))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_105 = var_9_B9:double
                            goto(Label_0786)
                        }
                    }
                    
                    Label_0676:
                    
                    if (cmpeq:boolean(and:int(var_3_5EB:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5EB = and:int(var_3_5EB:int, ldc:int(139269877))
                        goto(Label_1402)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EB:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1268)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EB:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1146)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5EB:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_5EB = and:int(var_3_5EB:int, ldc:int(-1974049893))
                        goto(Label_1035)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EB:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_5EB = and:int(var_3_5EB:int, ldc:int(-1808026351))
                        goto(Label_0881)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EB:int, ldc:int(262144)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5EB:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0565)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5EB:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5EB:int, ldc:int(2147483647)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5EB = and:int(var_3_5EB:int, ldc:int(123861875))
                        var_14_105 = mul:double(ldc:double(0.5), add:double(var_9_B9:double, var_14_105:double))
                    }
                    
                    Label_0786:
                    
                    if (cmpeq:boolean(and:int(var_3_5EB:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1402)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5EB:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1268)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5EB:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1146)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5EB:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1035)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EB:int, ldc:int(1048576)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5EB:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0676)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5EB:int, ldc:int(16)), ldc:int(0))) {
                            var_3_5EB = and:int(var_3_5EB:int, ldc:int(-1928309772))
                            goto(Label_0565)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5EB:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_5EB = and:int(var_3_5EB:int, ldc:int(-723631009))
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5EB:int, ldc:int(8192)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5EB = and:int(var_3_5EB:int, ldc:int(332099965))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_DB = and:int(ldc:int(793), ldc:int(16577))
                                goto(Label_1035)
                            }
                        }
                    }
                    
                    Label_0881:
                    
                    if (cmpne:boolean(and:int(var_3_5EB:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_5EB = and:int(var_3_5EB:int, ldc:int(541474754))
                        goto(Label_1402)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EB:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1268)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5EB:int, ldc:int(128)), ldc:int(0))) {
                        var_3_5EB = and:int(var_3_5EB:int, ldc:int(-1535706655))
                        goto(Label_1146)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5EB:int, ldc:int(16)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5EB:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_5EB = and:int(var_3_5EB:int, ldc:int(-3608661))
                            goto(Label_0786)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5EB:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0676)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5EB:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_5EB = and:int(var_3_5EB:int, ldc:int(68793974))
                            goto(Label_0565)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5EB:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_5EB = and:int(var_3_5EB:int, ldc:int(1604400731))
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5EB:int, ldc:int(1073741824)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5EB = and:int(var_3_5EB:int, ldc:int(82556667))
                        var_11_DB = and:int(ldc:int(5124), ldc:int(-5125))
                    }
                    
                    Label_1035:
                    
                    if (cmpne:boolean(and:int(var_3_5EB:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1402)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EB:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5EB = and:int(var_3_5EB:int, ldc:int(1195200811))
                        goto(Label_1268)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5EB:int, ldc:int(16)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5EB:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_5EB = and:int(var_3_5EB:int, ldc:int(1297002286))
                            goto(Label_0881)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5EB:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0786)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5EB:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0676)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5EB:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0565)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5EB:int, ldc:int(1)), ldc:int(0))) {
                            var_3_5EB = and:int(var_3_5EB:int, ldc:int(-1117164055))
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5EB:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_5EB = and:int(var_3_5EB:int, ldc:int(1930713095))
                            loopcontinue()
                        }
                        
                        var_3_5EB = and:int(var_3_5EB:int, ldc:int(1272025531))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                                goto(Label_1268)
                            }
                        }
                    }
                    
                    Label_1146:
                    
                    if (cmpeq:boolean(and:int(var_3_5EB:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1402)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5EB:int, ldc:int(1)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5EB:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_1035)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5EB:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_5EB = and:int(var_3_5EB:int, ldc:int(1252510190))
                            goto(Label_0881)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5EB:int, ldc:int(32)), ldc:int(0))) {
                            var_3_5EB = and:int(var_3_5EB:int, ldc:int(2122706375))
                            goto(Label_0786)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5EB:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_5EB = and:int(var_3_5EB:int, ldc:int(503932206))
                            goto(Label_0676)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5EB:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0565)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5EB:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5EB:int, ldc:int(32)), ldc:int(0))) {
                            var_3_5EB = and:int(var_3_5EB:int, ldc:int(536370837))
                            loopcontinue()
                        }
                        
                        var_3_5EB = and:int(var_3_5EB:int, ldc:int(-1320086735))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_105:double, var_5_7D:int, var_16_109:int)
                        goto(Label_1391)
                    }
                    
                    Label_1268:
                    
                    if (cmpne:boolean(and:int(var_3_5EB:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_5EB = and:int(var_3_5EB:int, ldc:int(1561579266))
                        goto(Label_1402)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5EB:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_5EB = and:int(var_3_5EB:int, ldc:int(172644489))
                        goto(Label_1146)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5EB:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1035)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5EB:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0881)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EB:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_5EB = and:int(var_3_5EB:int, ldc:int(-1968775923))
                        goto(Label_0786)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EB:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_5EB = and:int(var_3_5EB:int, ldc:int(725269671))
                        goto(Label_0676)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5EB:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0565)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5EB:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0389)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EB:int, ldc:int(32)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_5EB = and:int(var_3_5EB:int, ldc:int(1448459635))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_105:double, ldc:double(0.0))
                    Label_1391:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_5F6 = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1402:
                    
                    if (cmpne:boolean(and:int(var_3_5EB:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1268)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EB:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1146)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EB:int, ldc:int(1)), ldc:int(0))) {
                        var_3_5EB = and:int(var_3_5EB:int, ldc:int(192878114))
                        goto(Label_1035)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5EB:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0881)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EB:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_5EB = and:int(var_3_5EB:int, ldc:int(823092107))
                        goto(Label_0786)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5EB:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_5EB = and:int(var_3_5EB:int, ldc:int(356251649))
                        goto(Label_0676)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EB:int, ldc:int(32)), ldc:int(0))) {
                        var_3_5EB = and:int(var_3_5EB:int, ldc:int(722409564))
                        goto(Label_0565)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EB:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_5EB = and:int(var_3_5EB:int, ldc:int(-2021656935))
                        goto(Label_0389)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5EB:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_5EB = and:int(var_3_5EB:int, ldc:int(-1216669771))
                        var_17_5F6 = add:int(var_16_109:int, xor:int(ldc:int(6304), ldc:int(6305)))
                        looporswitchbreak()
                    }
                }
                
                var_3_5EB = and:int(var_3_5EB:int, ldc:int(-740961487))
                
                if (cmple:boolean(var_5_7D = var_17_5F6:int, sub:int(var_6_84:int, and:int(ldc:int(789), ldc:int(28673))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpeq:boolean(and:int(var_3_5EB:int, ldc:int(1048576)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
