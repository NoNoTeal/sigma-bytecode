public class \u3bd6\u6b0d\ubff1\u8aa5\u4f4a.\ube23\u7e3f\u071d\uc31c\u3dd3\uc3e3 {
    public void \ube23\u7e3f\u071d\uc31c\u3dd3\uc3e3() {
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
            invokespecial:\u1833\ud171\u8350\ubded\u34df\uc9f6(\u1833\ud171\u8350\ubded\u34df\uc9f6::<init>, this:\ube23\u7e3f\u071d\uc31c\u3dd3\uc3e3, loadelement:String(getstatic:String[](\ube23\u7e3f\u071d\uc31c\u3dd3\uc3e3::\u3711\ud4fe\u527a\u385b\u97e6\u527a), and:int(ldc:int(-30075), ldc:int(12666))), ldc:Class<\u4975\u1833\u446c\u5bc4\ubded\u4f4a>(\u5d20\u97b7\u8753\u873d\u16f6.\u4975\u1833\u446c\u5bc4\ubded\u4f4a.class))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public \u5d20\u97b7\u8753\u873d\u16f6.\u4975\u1833\u446c\u5bc4\ubded\u4f4a \u4d85\uff55\uc3e3\ud4fe\u9937\uc229(io.netty.buffer.ByteBuf p0) {
        var_2_120 : int
        var_4_64 : int
        var_5_68 : int
        var_7_FF : int
        var_6_E8 : \u4975\u1833\u446c\u5bc4\ubded\u4f4a
        var_8_113 : int
        var_2_E0 : int
        var_7_16A : long[]
        var_8_191 : int
        var_2_19F : int
        var_9_1A7 : int
        var_2_222 : int
        stack_271_0 : int [generated]
        stack_271_1 : int [generated]
        stack_271_2 : long[] [generated]
        stack_271_3 : \ua068\u5f50\u416d\ud51e\u760c\u97b7 [generated]
        
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
            var_2_120 = and:int(ldc:int(-989530944), ldc:int(-299895020))
            var_4_64 = invokevirtual:short[expected:int](ByteBuf::readUnsignedByte, p0:ByteBuf)
            
            if (cmpne:boolean(var_5_68 = var_4_64:int, ldc:int(0))) {
                if (cmple:boolean(var_4_64:int, ldc:int(8))) {
                    goto(Label_0164)
                }
            }
            
            Label_0111:
            
            if (cmpeq:boolean(and:int(var_2_120:int, ldc:int(2147483647)), ldc:int(0))) {
                var_2_120 = and:int(var_2_120:int, ldc:int(-1344891254))
                goto(Label_0198)
            }
            
            if (cmpeq:boolean(and:int(var_2_120:int, ldc:int(4096)), ldc:int(0))) {
                var_2_120 = and:int(var_2_120:int, ldc:int(-1698633729))
            }
            else {
                var_2_120 = and:int(var_2_120:int, ldc:int(-3146070))
                var_4_64 = ldc:int(14)
            }
            
            Label_0164:
            
            if (cmpeq:boolean(and:int(var_2_120:int, ldc:int(4)), ldc:int(0))) {
                if (cmpeq:boolean(and:int(var_2_120:int, ldc:int(4096)), ldc:int(0))) {
                    var_2_120 = and:int(var_2_120:int, ldc:int(-1364617489))
                    goto(Label_0111)
                }
                
                var_2_120 = and:int(var_2_120:int, ldc:int(-560989564))
                
                if (cmpne:boolean(var_4_64:int, ldc:int(14))) {
                    var_7_FF = invokevirtual:int(\uceb8\u4c2b\ub8be\u7049\u8308\u3a62::\uc4d2\uf94d\u6d69\u6b5f\ucef1\u624e, getstatic:\uceb8\u4c2b\ub8be\u7049\u8308\u3a62(\u1833\ud171\u8350\ubded\u34df\uc9f6::\ud523\u62da\u6c52\u7043\ud217\u72f1), p0:ByteBuf)
                    var_6_E8 = initobject:\u4975\u1833\u446c\u5bc4\ubded\u4f4a(\u4975\u1833\u446c\u5bc4\ubded\u4f4a::<init>, var_7_FF:int)
                    var_8_113 = and:int(ldc:int(-17271), ldc:int(17270))
                    
                    loop {
                        if (cmpne:boolean(and:int(var_2_120:int, ldc:int(32)), ldc:int(0))) {
                            var_2_120 = and:int(var_2_120:int, ldc:int(-1390252809))
                        }
                        else {
                            var_2_120 = and:int(var_2_120:int, ldc:int(-286404491))
                            
                            if (cmplt:boolean(var_8_113:int, var_7_FF:int)) {
                                invokevirtual:void(\u4975\u1833\u446c\u5bc4\ubded\u4f4a::\u12cb\ud158\u64f2\u527a\u7e3f\u6198, var_6_E8:\u4975\u1833\u446c\u5bc4\ubded\u4f4a, invokevirtual:int(\uceb8\u4c2b\ub8be\u7049\u8308\u3a62::\uc4d2\uf94d\u6d69\u6b5f\ucef1\u624e, getstatic:\uceb8\u4c2b\ub8be\u7049\u8308\u3a62(\u1833\ud171\u8350\ubded\u34df\uc9f6::\ud523\u62da\u6c52\u7043\ud217\u72f1), p0:ByteBuf))
                                inc:int(var_8_113, ldc:int(1))
                                loopcontinue()
                            }
                        }
                        
                        if (cmpeq:boolean(and:int(var_2_120:int, ldc:int(32)), ldc:int(0))) {
                            looporswitchbreak()
                        }
                        
                        var_2_120 = and:int(var_2_120:int, ldc:int(-831062182))
                    }
                    
                    var_2_E0 = and:int(var_2_120:int, ldc:int(-445776241))
                    goto(Label_0353)
                }
            }
            
            Label_0198:
            
            if (cmpne:boolean(and:int(var_2_120:int, ldc:int(33554432)), ldc:int(0))) {
                var_2_120 = and:int(var_2_120:int, ldc:int(-756760235))
                goto(Label_0164)
            }
            
            if (cmpeq:boolean(and:int(var_2_120:int, ldc:int(262144)), ldc:int(0))) {
                goto(Label_0111)
            }
            
            var_2_E0 = and:int(var_2_120:int, ldc:int(-155331548))
            var_6_E8 = initobject:\u4975\u1833\u446c\u5bc4\ubded\u4f4a(\u4975\u1833\u446c\u5bc4\ubded\u4f4a::<init>)
            Label_0353:
            var_7_16A = newarray:long[](long.class, invokevirtual:int(\uceb8\u4c2b\ub8be\u7049\u8308\u3a62::\uc4d2\uf94d\u6d69\u6b5f\ucef1\u624e, getstatic:\uceb8\u4c2b\ub8be\u7049\u8308\u3a62(\u1833\ud171\u8350\ubded\u34df\uc9f6::\ud523\u62da\u6c52\u7043\ud217\u72f1), p0:ByteBuf))
            
            if (cmpgt:boolean(arraylength:int(var_7_16A:long[]), ldc:int(0))) {
                var_8_191 = d2i:int(invokestatic:double(Math::ceil, div:double(i2d:double(mul:int(xor:int(ldc:int(17260), ldc:int(21356)), var_4_64:int)), ldc:double(64.0))))
                
                if (cmpne:boolean(arraylength:int(var_7_16A:long[]), var_8_191:int)) {
                    athrow(initobject:IllegalStateException(IllegalStateException::<init>, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\ube23\u7e3f\u071d\uc31c\u3dd3\uc3e3::\u3711\ud4fe\u527a\u385b\u97e6\u527a), and:int(ldc:int(6561), ldc:int(24583)))), arraylength:int(var_7_16A:long[])), loadelement:String(getstatic:String[](\ube23\u7e3f\u071d\uc31c\u3dd3\uc3e3::\u3711\ud4fe\u527a\u385b\u97e6\u527a), and:int(ldc:int(18), ldc:int(17123)))), var_8_191:int), loadelement:String(getstatic:String[](\ube23\u7e3f\u071d\uc31c\u3dd3\uc3e3::\u3711\ud4fe\u527a\u385b\u97e6\u527a), xor:int(ldc:int(16451), ldc:int(16448)))), var_4_64:int), loadelement:String(getstatic:String[](\ube23\u7e3f\u071d\uc31c\u3dd3\uc3e3::\u3711\ud4fe\u527a\u385b\u97e6\u527a), and:int(ldc:int(1046), ldc:int(2116)))), var_5_68:int))))
                }
                
                var_2_19F = and:int(var_2_E0:int, ldc:int(-864027314))
                var_9_1A7 = and:int(ldc:int(-2954), ldc:int(2953))
                
                while (cmplt:boolean(var_9_1A7:int, arraylength:int(var_7_16A:long[]))) {
                    storeelement:long(var_7_16A:long[], var_9_1A7:int, invokevirtual:long(ByteBuf::readLong, p0:ByteBuf))
                    inc:int(var_9_1A7, ldc:int(1))
                }
                
                var_2_222 = and:int(var_2_19F:int, ldc:int(-443687457))
                stack_271_0 = var_4_64:int
                stack_271_1 = xor:int(ldc:int(8534), ldc:int(12630))
                stack_271_2 = var_7_16A:long[]
                
                if (cmpne:boolean(var_4_64:int, ldc:int(14))) {
                    var_2_222 = and:int(var_2_222:int, ldc:int(-841682445))
                    stack_271_3 = invokedynamic:\ua068\u5f50\u416d\ud51e\u760c\u97b7(\ub6ab\ud12e\ufcaf\u0a06\u71ae\u120d:(L\u5d20\u97b7\u8753\u873d\u16f6/\u4975\u1833\u446c\u5bc4\ubded\u4f4a;)L\u47c2\u2dcc\u12cb\ud171\u8c8a/\ua068\u5f50\u416d\ud51e\u760c\u97b7;, var_6_E8:\u4975\u1833\u446c\u5bc4\ubded\u4f4a)
                }
                else {
                    stack_271_3 = invokedynamic:\ua068\u5f50\u416d\ud51e\u760c\u97b7(\ub6ab\ud12e\ufcaf\u0a06\u71ae\u120d:(L\u5d20\u97b7\u8753\u873d\u16f6/\u4975\u1833\u446c\u5bc4\ubded\u4f4a;)L\u47c2\u2dcc\u12cb\ud171\u8c8a/\ua068\u5f50\u416d\ud51e\u760c\u97b7;, var_6_E8:\u4975\u1833\u446c\u5bc4\ubded\u4f4a)
                }
                
                var_2_E0 = and:int(var_2_222:int, ldc:int(-1004022695))
                invokestatic:void(\ub113\u4179\u6cfe\u12b2\u8d90\u3711::\u7af6\u647c\u3bc9\uafe7\u6bb9\u416d, stack_271_0:int, stack_271_1:int, stack_271_2:long[], stack_271_3:\ua068\u5f50\u416d\ud51e\u760c\u97b7)
            }
            
            return:\u4975\u1833\u446c\u5bc4\ubded\u4f4a(var_6_E8:\u4975\u1833\u446c\u5bc4\ubded\u4f4a)
        }
        
        goto(Label_0006)
    }
    
    public void \ud171\uc229\ufe34\u36d3\u5f50\uc2e8(io.netty.buffer.ByteBuf p0, \u5d20\u97b7\u8753\u873d\u16f6.\u4975\u1833\u446c\u5bc4\ubded\u4f4a p1) {
        var_3_A7 : int
        var_5_67 : int
        var_6_17D : int
        var_3_12E : int
        stack_1BB_0 : int [generated]
        stack_1BB_1 : int [generated]
        stack_1BB_2 : IntToLongFunction [generated]
        var_3_1BA : int
        var_6_1BE : long[]
        var_7_1CC : long[]
        var_8_1D1 : int
        var_9_1DA : int
        
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
            var_3_A7 = and:int(ldc:int(1425776034), ldc:int(2113128354))
            var_5_67 = xor:int(ldc:int(-16384), ldc:int(-16380))
            
            loop {
                if (cmpeq:boolean(and:int(var_3_A7:int, ldc:int(2147483647)), ldc:int(0))) {
                    goto(Label_0253)
                }
                
                if (cmpne:boolean(and:int(var_3_A7:int, ldc:int(1)), ldc:int(0))) {
                    var_3_A7 = and:int(var_3_A7:int, ldc:int(-248068274))
                    goto(Label_0205)
                }
                
                if (cmpeq:boolean(and:int(var_3_A7:int, ldc:int(16384)), ldc:int(0))) {
                    var_3_A7 = and:int(var_3_A7:int, ldc:int(-752924749))
                    
                    if (cmpgt:boolean(invokevirtual:int(\u4975\u1833\u446c\u5bc4\ubded\u4f4a::\u927d\ubb2b\u69d9\u74b1\ubded\ub7dc, p1:\u4975\u1833\u446c\u5bc4\ubded\u4f4a), shl:int(xor:int(ldc:int(65), ldc:int(64)), var_5_67:int))) {
                        inc:int(var_5_67, ldc:int(1))
                        loopcontinue()
                    }
                }
                
                Label_0156:
                
                if (cmpne:boolean(and:int(var_3_A7:int, ldc:int(16384)), ldc:int(0))) {
                    var_3_A7 = and:int(var_3_A7:int, ldc:int(-1536244827))
                    goto(Label_0253)
                }
                
                if (cmpne:boolean(and:int(var_3_A7:int, ldc:int(8192)), ldc:int(0))) {
                    var_3_A7 = and:int(var_3_A7:int, ldc:int(624047019))
                }
                else {
                    if (cmpeq:boolean(and:int(var_3_A7:int, ldc:int(1024)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_A7 = and:int(var_3_A7:int, ldc:int(-680056849))
                    
                    if (cmpgt:boolean(var_5_67:int, ldc:int(8))) {
                        var_5_67 = ldc:int(14)
                    }
                }
                
                Label_0205:
                
                if (cmpeq:boolean(and:int(var_3_A7:int, ldc:int(131072)), ldc:int(0))) {
                    var_3_A7 = and:int(var_3_A7:int, ldc:int(-1350782556))
                }
                else {
                    if (cmpeq:boolean(and:int(var_3_A7:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0156)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_A7:int, ldc:int(1)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_A7 = and:int(var_3_A7:int, ldc:int(2004346355))
                    invokevirtual:ByteBuf(ByteBuf::writeByte, p0:ByteBuf, var_5_67:int)
                    
                    if (cmpne:boolean(var_5_67:int, ldc:int(14))) {
                        invokevirtual:void(\uceb8\u4c2b\ub8be\u7049\u8308\u3a62::\u0c95\u6435\u3504\u36d3\u2dcc\u16f6, getstatic:\uceb8\u4c2b\ub8be\u7049\u8308\u3a62(\u1833\ud171\u8350\ubded\u34df\uc9f6::\ud523\u62da\u6c52\u7043\ud217\u72f1), p0:ByteBuf, invokevirtual:int(\u4975\u1833\u446c\u5bc4\ubded\u4f4a::\u927d\ubb2b\u69d9\u74b1\ubded\ub7dc, p1:\u4975\u1833\u446c\u5bc4\ubded\u4f4a))
                        var_6_17D = and:int(ldc:int(290), ldc:int(-291))
                        
                        loop {
                            var_3_A7 = and:int(var_3_A7:int, ldc:int(-583576157))
                            
                            if (cmpge:boolean(var_6_17D:int, invokevirtual:int(\u4975\u1833\u446c\u5bc4\ubded\u4f4a::\u927d\ubb2b\u69d9\u74b1\ubded\ub7dc, p1:\u4975\u1833\u446c\u5bc4\ubded\u4f4a))) {
                                looporswitchbreak()
                            }
                            
                            invokevirtual:void(\uceb8\u4c2b\ub8be\u7049\u8308\u3a62::\u0c95\u6435\u3504\u36d3\u2dcc\u16f6, getstatic:\uceb8\u4c2b\ub8be\u7049\u8308\u3a62(\u1833\ud171\u8350\ubded\u34df\uc9f6::\ud523\u62da\u6c52\u7043\ud217\u72f1), p0:ByteBuf, invokevirtual:int(\u4975\u1833\u446c\u5bc4\ubded\u4f4a::\u1833\u7049\u64ab\u927d\u760c\u97e6, p1:\u4975\u1833\u446c\u5bc4\ubded\u4f4a, var_6_17D:int))
                            inc:int(var_6_17D, ldc:int(1))
                        }
                    }
                }
                
                Label_0253:
                
                if (cmpeq:boolean(and:int(var_3_A7:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_3_A7 = and:int(var_3_A7:int, ldc:int(1025418806))
                    goto(Label_0205)
                }
                
                if (cmpeq:boolean(and:int(var_3_A7:int, ldc:int(65536)), ldc:int(0))) {
                    var_3_A7 = and:int(var_3_A7:int, ldc:int(-872750944))
                    goto(Label_0156)
                }
                
                if (cmpne:boolean(and:int(var_3_A7:int, ldc:int(268435456)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_3_A7 = and:int(var_3_A7:int, ldc:int(1032000541))
            }
            
            var_3_12E = and:int(var_3_A7:int, ldc:int(-138979846))
            stack_1BB_0 = var_5_67:int
            stack_1BB_1 = and:int(ldc:int(20480), ldc:int(6439))
            
            if (cmpne:boolean(var_5_67:int, ldc:int(14))) {
                var_3_12E = and:int(var_3_12E:int, ldc:int(-193219089))
                stack_1BB_2 = invokedynamic:IntToLongFunction(applyAsLong:(L\u5d20\u97b7\u8753\u873d\u16f6/\u4975\u1833\u446c\u5bc4\ubded\u4f4a;)Ljava/util/function/IntToLongFunction;, p1:\u4975\u1833\u446c\u5bc4\ubded\u4f4a)
            }
            else {
                stack_1BB_2 = invokedynamic:IntToLongFunction(applyAsLong:(L\u5d20\u97b7\u8753\u873d\u16f6/\u4975\u1833\u446c\u5bc4\ubded\u4f4a;)Ljava/util/function/IntToLongFunction;, p1:\u4975\u1833\u446c\u5bc4\ubded\u4f4a)
            }
            
            var_3_1BA = and:int(var_3_12E:int, ldc:int(-155504641))
            var_6_1BE = invokestatic:long[](\ub113\u4179\u6cfe\u12b2\u8d90\u3711::\u516c\u6cfe\u71f1\u4daf\u873d\u946b, stack_1BB_0:int, stack_1BB_1:int, stack_1BB_2:IntToLongFunction)
            invokevirtual:void(\uceb8\u4c2b\ub8be\u7049\u8308\u3a62::\u0c95\u6435\u3504\u36d3\u2dcc\u16f6, getstatic:\uceb8\u4c2b\ub8be\u7049\u8308\u3a62(\u1833\ud171\u8350\ubded\u34df\uc9f6::\ud523\u62da\u6c52\u7043\ud217\u72f1), p0:ByteBuf, arraylength:int(var_6_1BE:long[]))
            var_7_1CC = var_6_1BE:long[]
            var_8_1D1 = arraylength:int(var_7_1CC:long[])
            var_9_1DA = and:int(ldc:int(3443), ldc:int(-20340))
            
            loop {
                var_3_1BA = and:int(var_3_1BA:int, ldc:int(-694947869))
                
                if (cmpge:boolean(var_9_1DA:int, var_8_1D1:int)) {
                    looporswitchbreak()
                }
                
                invokevirtual:ByteBuf(ByteBuf::writeLong, p0:ByteBuf, loadelement:long(var_7_1CC:long[], var_9_1DA:int))
                inc:int(var_9_1DA, ldc:int(1))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public java.lang.Object \u4d85\uff55\uc3e3\ud4fe\u9937\uc229(io.netty.buffer.ByteBuf p0) {
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
            return:Object(invokevirtual:\u4975\u1833\u446c\u5bc4\ubded\u4f4a[expected:Object](\ube23\u7e3f\u071d\uc31c\u3dd3\uc3e3::\u4d85\uff55\uc3e3\ud4fe\u9937\uc229, this:\ube23\u7e3f\u071d\uc31c\u3dd3\uc3e3, p0:ByteBuf))
        }
        
        goto(Label_0006)
    }
    
    public void \ud171\uc229\ufe34\u36d3\u5f50\uc2e8(io.netty.buffer.ByteBuf p0, java.lang.Object p1) {
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
            invokevirtual:void(\ube23\u7e3f\u071d\uc31c\u3dd3\uc3e3::\ud171\uc229\ufe34\u36d3\u5f50\uc2e8, this:\ube23\u7e3f\u071d\uc31c\u3dd3\uc3e3, p0:ByteBuf, checkcast:\u4975\u1833\u446c\u5bc4\ubded\u4f4a(\u5d20\u97b7\u8753\u873d\u16f6.\u4975\u1833\u446c\u5bc4\ubded\u4f4a.class, p1:Object[expected:\u4975\u1833\u446c\u5bc4\ubded\u4f4a]))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_2B1 : int
        expr_6C : int [generated]
        stack_A3_0 : byte[] [generated]
        stack_A5_0 : byte[] [generated]
        stack_D4_0 : byte[] [generated]
        stack_D6_0 : byte[] [generated]
        stack_10D_0 : byte[] [generated]
        stack_10F_0 : byte[] [generated]
        stack_13A_0 : byte[] [generated]
        stack_20A_0 : byte[] [generated]
        stack_25E_0 : byte[] [generated]
        stack_2C4_0 : byte[] [generated]
        stack_338_0 : byte[] [generated]
        var_4_1EC : int
        var_3_1F1 : byte[]
        var_5_1F2 : int
        expr_20D : byte [generated]
        var_0_2BA : int
        expr_2C4 : byte [generated]
        stack_303_2 : byte [generated]
        stack_2E1_0 : byte [generated]
        var_2_A3 : byte[]
        expr_A7 : int [generated]
        var_3_24C : byte[]
        var_5_24D : int
        expr_D6 : int [generated]
        expr_10F : int [generated]
        var_3_326 : byte[]
        var_5_327 : int
        var_3_146 : String
        stack_1E5_0 : String[] [generated]
        expr_158 : String[] [generated]
        
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
        var_0_2B1 = and:int(ldc:int(-125878114), ldc:int(-1845543204))
        expr_6C = arraylength:int(stack_A3_0 = stack_A5_0 = stack_D4_0 = stack_D6_0 = stack_10D_0 = stack_10F_0 = stack_13A_0 = stack_20A_0 = stack_25E_0 = stack_2C4_0 = stack_338_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("Z22K5KrCY9uZtWKbrfCzmVenp7Crp+qzoHaloJjhAtumpl9yX4u2sLa4qcCCptT14n5JbZ6/rJ6xvKuPb7awtripwIKm1NWoenmm5KqaXZvyuK9rpaCY4QK7cE+StOi0mnGIqqvD4bCOYIcmGxKv")))
        
        if (cmpeq:boolean(expr_6C:int, ldc:int(0))) {
            goto(Label_0113)
        }
        
        var_4_1EC = expr_6C:int
        var_3_1F1 = newarray:byte[](byte.class, expr_6C:int)
        var_5_1F2 = expr_6C:int
        Label_0500:
        
        while (cmpne:boolean(and:int(var_0_2B1:int, ldc:int(131072)), ldc:int(0))) {
            var_0_2B1 = and:int(var_0_2B1:int, ldc:int(-562072676))
            var_5_1F2 = add:int(var_5_1F2:int, ldc:int(-1))
            expr_20D = add:byte(loadelement:byte(stack_20A_0:byte[], var_5_1F2:int), ldc:byte(89))
            storeelement:byte(var_3_1F1:byte[], var_5_1F2:int, or:int(and:int(shl:int(expr_20D:byte, and:int(ldc:int(30276), ldc:int(388))), ldc:int(-16)), and:int(shr:int(expr_20D:byte[expected:int], and:int(ldc:int(516), ldc:int(2198))), ldc:int(15))))
            
            if (cmpne:boolean(var_5_1F2:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A5_0 = stack_A3_0 = stack_D4_0 = stack_D6_0 = stack_10D_0 = stack_10F_0 = stack_13A_0 = stack_20A_0 = stack_25E_0 = stack_2C4_0 = stack_338_0 = var_3_1F1:byte[]
            goto(Label_0113)
        }
        
        Label_0677:
        
        while (cmpeq:boolean(and:int(var_0_2B1:int, ldc:int(33554432)), ldc:int(0))) {
            var_0_2BA = and:int(var_0_2B1:int, ldc:int(-877945927))
            var_5_1F2 = add:int(var_5_1F2:int, ldc:int(-1))
            expr_2C4 = stack_303_2 = loadelement(stack_2C4_0, var_5_1F2)
            
            if (cmplt:boolean(add:int(add:int(var_5_1F2:int, ldc:int(3)), neg:int(var_4_1EC:int)), ldc:int(0))) {
                stack_303_2 = stack_2E1_0 = add:byte(expr_2C4:byte, loadelement:byte(var_3_1F1:byte[], add:int(var_5_1F2:int, ldc:int(3))))
                goto(Label_0753)
            }
            
            Label_0721:
            
            if (cmpeq:boolean(and:int(var_0_2BA:int, ldc:int(512)), ldc:int(0))) {
                var_0_2BA = and:int(var_0_2BA:int, ldc:int(-1056971080))
                stack_303_2 = stack_2E1_0 = add:byte(expr_2C4:byte, ldc:byte(3))
            }
            
            Label_0753:
            
            if (cmpeq:boolean(and:int(var_0_2BA:int, ldc:int(131072)), ldc:int(0))) {
                goto(Label_0721)
            }
            
            var_0_2B1 = and:int(var_0_2BA:int, ldc:int(-1909498630))
            storeelement:byte(var_3_1F1:byte[], var_5_1F2:int, stack_303_2:byte)
            
            if (cmpne:boolean(var_5_1F2:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A5_0 = stack_A3_0 = stack_D4_0 = stack_D6_0 = stack_10D_0 = stack_10F_0 = stack_13A_0 = stack_20A_0 = stack_25E_0 = stack_2C4_0 = stack_338_0 = var_3_1F1:byte[]
            goto(Label_0219)
        }
        
        var_0_2B1 = and:int(var_0_2B1:int, ldc:int(-1712630961))
        goto(Label_0500)
        Label_0113:
        
        if (cmpeq:boolean(and:int(var_0_2B1:int, ldc:int(16)), ldc:int(0))) {
            var_0_2B1 = and:int(var_0_2B1:int, ldc:int(1515959172))
            goto(Label_0276)
        }
        
        if (cmpeq:boolean(and:int(var_0_2B1:int, ldc:int(524288)), ldc:int(0))) {
            goto(Label_0219)
        }
        
        if (cmpeq:boolean(and:int(var_0_2B1:int, ldc:int(16)), ldc:int(0))) {
            var_0_2B1 = and:int(var_0_2B1:int, ldc:int(-49799867))
        }
        else {
            var_0_2B1 = and:int(var_0_2B1:int, ldc:int(-1713683011))
            var_2_A3 = stack_A3_0:byte[]
            expr_A7 = add:int(arraylength:int(stack_A5_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_A7:int, ldc:int(0))) {
                var_3_24C = newarray:byte[](byte.class, expr_A7:int)
                var_5_24D = expr_A7:int
                
                loop {
                    var_0_2B1 = and:int(var_0_2B1:int, ldc:int(-1236579077))
                    var_5_24D = add:int(var_5_24D:int, ldc:int(-1))
                    storeelement:byte(var_3_24C:byte[], var_5_24D:int, add:int(shl:int(loadelement:byte(stack_25E_0:byte[], var_5_24D:int), ldc:int(4)), and:int(shr:int(loadelement:byte(var_2_A3:byte[], add:int(var_5_24D:int, xor:int(ldc:int(8472), ldc:int(8473)))), ldc:int(4)), xor:int(ldc:int(202), ldc:int(197)))))
                    
                    if (cmpne:boolean(var_5_24D:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_A5_0 = stack_A3_0 = stack_D4_0 = stack_D6_0 = stack_10D_0 = stack_10F_0 = stack_13A_0 = stack_20A_0 = stack_25E_0 = stack_2C4_0 = stack_338_0 = var_3_24C:byte[]
            }
        }
        
        Label_0172:
        
        if (cmpeq:boolean(and:int(var_0_2B1:int, ldc:int(131072)), ldc:int(0))) {
            goto(Label_0276)
        }
        
        if (cmpne:boolean(and:int(var_0_2B1:int, ldc:int(128)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_2B1:int, ldc:int(524288)), ldc:int(0))) {
                var_0_2B1 = and:int(var_0_2B1:int, ldc:int(-1022497128))
                goto(Label_0113)
            }
            
            var_0_2B1 = and:int(var_0_2B1:int, ldc:int(-999315556))
            expr_D6 = arraylength:int(stack_D6_0:byte[])
            
            if (cmpne:boolean(expr_D6:int, ldc:int(0))) {
                var_4_1EC = expr_D6:int
                var_3_1F1 = newarray:byte[](byte.class, expr_D6:int)
                var_5_1F2 = expr_D6:int
                goto(Label_0677)
            }
        }
        
        Label_0219:
        
        if (cmpeq:boolean(and:int(var_0_2B1:int, ldc:int(512)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_2B1:int, ldc:int(524288)), ldc:int(0))) {
                var_0_2B1 = and:int(var_0_2B1:int, ldc:int(349066842))
                goto(Label_0172)
            }
            
            if (cmpne:boolean(and:int(var_0_2B1:int, ldc:int(512)), ldc:int(0))) {
                var_0_2B1 = and:int(var_0_2B1:int, ldc:int(-1803134303))
                goto(Label_0113)
            }
            
            var_0_2B1 = and:int(var_0_2B1:int, ldc:int(-622914657))
            expr_10F = arraylength:int(stack_10F_0:byte[])
            
            if (cmpne:boolean(expr_10F:int, ldc:int(0))) {
                var_3_326 = newarray:byte[](byte.class, expr_10F:int)
                var_5_327 = expr_10F:int
                
                loop {
                    var_0_2B1 = and:int(var_0_2B1:int, ldc:int(-192190561))
                    var_5_327 = add:int(var_5_327:int, ldc:int(-1))
                    storeelement:byte(var_3_326:byte[], var_5_327:int, xor:byte(loadelement:byte(stack_338_0:byte[], var_5_327:int), ldc:byte(14)))
                    
                    if (cmpne:boolean(var_5_327:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_A5_0 = stack_A3_0 = stack_D4_0 = stack_D6_0 = stack_10D_0 = stack_10F_0 = stack_13A_0 = stack_20A_0 = stack_25E_0 = stack_2C4_0 = stack_338_0 = var_3_326:byte[]
            }
        }
        
        Label_0276:
        
        if (cmpne:boolean(and:int(var_0_2B1:int, ldc:int(33554432)), ldc:int(0))) {
            var_0_2B1 = and:int(var_0_2B1:int, ldc:int(1986988621))
            goto(Label_0219)
        }
        
        if (cmpeq:boolean(and:int(var_0_2B1:int, ldc:int(524288)), ldc:int(0))) {
            goto(Label_0172)
        }
        
        if (cmpne:boolean(and:int(var_0_2B1:int, ldc:int(65536)), ldc:int(0))) {
            var_3_146 = initobject:String(String::<init>, stack_13A_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_1E5_0 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(28701), ldc:int(709)))
            expr_158 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(16481), ldc:int(16484)))
            storeelement:String(expr_158:String[], xor:int(ldc:int(1056), ldc:int(1058)), invokevirtual:String[expected:String](String::substring, var_3_146:String, and:int(ldc:int(10378), ldc:int(-26764)), xor:int(ldc:int(-28501), ldc:int(-28535))))
            storeelement:String(expr_158:String[], xor:int(ldc:int(5642), ldc:int(5641)), invokevirtual:String[expected:String](String::substring, var_3_146:String, and:int(ldc:int(6179), ldc:int(290)), and:int(ldc:int(13106), ldc:int(19510))))
            storeelement:String(expr_158:String[], and:int(ldc:int(222), ldc:int(18436)), invokevirtual:String[expected:String](String::substring, var_3_146:String, xor:int(ldc:int(2592), ldc:int(2578)), and:int(ldc:int(8265), ldc:int(6985))))
            storeelement:String(expr_158:String[], xor:int(ldc:int(4227), ldc:int(4226)), invokevirtual:String[expected:String](String::substring, var_3_146:String, xor:int(ldc:int(55), ldc:int(126)), and:int(ldc:int(4444), ldc:int(8285))))
            storeelement:String(expr_158:String[], and:int(ldc:int(-5640), ldc:int(5639)), invokevirtual:String[expected:String](String::substring, var_3_146:String, and:int(ldc:int(18557), ldc:int(13404)), and:int(ldc:int(16494), ldc:int(12654))))
            putstatic:String[](\ube23\u7e3f\u071d\uc31c\u3dd3\uc3e3::\u3711\ud4fe\u527a\u385b\u97e6\u527a, expr_158:String[])
            return:void()
        }
        
        goto(Label_0113)
    }
    
    public void \u8cae\u5f50\u3e75\uceb8\u873d\ua3b4(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_6B1 : int
        var_5_89 : int
        var_6_90 : int
        var_7_9F : double
        var_9_D0 : double
        var_3_E2 : int
        var_11_F3 : int
        var_14_11D : double
        var_16_121 : int
        var_12_119 : double
        var_17_6BC : int
        
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
        var_3_6B1 = and:int(ldc:int(-230588102), ldc:int(-1720729834))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\ube23\u7e3f\u071d\uc31c\u3dd3\uc3e3[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0179)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(4096)), ldc:int(0))) {
            var_3_6B1 = and:int(var_3_6B1:int, ldc:int(657459426))
        }
        else {
            var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-1236316314))
            var_5_89 = and:int(ldc:int(10380), ldc:int(-10381))
            var_6_90 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9F = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-9294), ldc:int(9293)))
            invokestatic:int(m::a)
            
            loop {
                var_9_D0 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_E2 = and:int(var_3_6B1:int, ldc:int(1381448547))
                    var_9_D0 = sub:double(var_7_9F:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_F3 = var_5_89:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_F3:int, sub:int(var_6_90:int, and:int(ldc:int(16385), ldc:int(2049)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_F3:int, xor:int(ldc:int(-31224), ldc:int(-31223)))), var_7_9F:double))) {
                        inc:int(var_11_F3, ldc:int(1))
                    }
                    
                    var_3_6B1 = and:int(var_3_E2:int, ldc:int(-665607786))
                    var_14_11D = var_7_9F:double
                    var_16_121 = var_11_F3:int
                }
                else {
                    var_11_F3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_89:int), and:int(ldc:int(513), ldc:int(2081)))
                    var_12_119 = var_14_11D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_89)
                    
                    if (cmplt:boolean(var_16_121 = var_11_F3:int, var_6_90:int)) {
                        var_9_D0 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_F3:int)
                        var_16_121 = var_11_F3:int
                        var_14_11D = var_12_119:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(990931152))
                        goto(Label_1604)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1441)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-394128044))
                        goto(Label_1284)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(2142577642))
                        goto(Label_1154)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1007)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0859)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-1101514969))
                        goto(Label_0732)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0601)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-577542277))
                    }
                    else {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(1449632534))
                        
                        if (cmplt:boolean(var_16_121:int, var_6_90:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0601)
                            }
                            
                            goto(Label_0859)
                        }
                    }
                    
                    Label_0422:
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(1070242445))
                        goto(Label_1604)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(1375984374))
                        goto(Label_1441)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1284)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(512)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-488527419))
                        goto(Label_1154)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-1252570413))
                        goto(Label_1007)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(2142562630))
                        goto(Label_0859)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(256)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-378001657))
                        goto(Label_0732)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(65536)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_6B1 = and:int(var_3_6B1:int, ldc:int(341558127))
                            var_11_F3 = and:int(ldc:int(6955), ldc:int(-6956))
                            goto(Label_1593)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0601:
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(899756))
                        goto(Label_1604)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1441)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(346840313))
                        goto(Label_1284)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(505785460))
                        goto(Label_1154)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1007)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(1083073431))
                        goto(Label_0859)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(2048)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0422)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_6B1 = and:int(var_3_6B1:int, ldc:int(315508469))
                            loopcontinue()
                        }
                        
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(1609555371))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_11D = var_9_D0:double
                            goto(Label_0859)
                        }
                    }
                    
                    Label_0732:
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1604)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1441)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(1006010315))
                        goto(Label_1284)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1154)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1007)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(1069603593))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-1787274236))
                            goto(Label_0601)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0422)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_6B1 = and:int(var_3_6B1:int, ldc:int(1177241271))
                            loopcontinue()
                        }
                        
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-663529517))
                        var_14_11D = mul:double(ldc:double(0.5), add:double(var_9_D0:double, var_14_11D:double))
                    }
                    
                    Label_0859:
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1604)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1441)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-1647942335))
                        goto(Label_1284)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-1606179635))
                        goto(Label_1154)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(512)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(921861034))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-1801740834))
                            goto(Label_0732)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-1804213633))
                            goto(Label_0601)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_6B1 = and:int(var_3_6B1:int, ldc:int(402875910))
                            goto(Label_0422)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_6B1 = and:int(var_3_6B1:int, ldc:int(141844126))
                            loopcontinue()
                        }
                        
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-622491278))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_89:int), var_7_9F:double)) {
                                var_11_F3 = xor:int(ldc:int(27136), ldc:int(27137))
                                goto(Label_1154)
                            }
                        }
                    }
                    
                    Label_1007:
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1604)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1441)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1284)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(65536)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(256)), ldc:int(0))) {
                            var_3_6B1 = and:int(var_3_6B1:int, ldc:int(1854291909))
                            goto(Label_0859)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-2115137709))
                            goto(Label_0732)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0601)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0422)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-363030266))
                            loopcontinue()
                        }
                        
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-1714180849))
                        var_11_F3 = and:int(ldc:int(1123), ldc:int(-1252))
                    }
                    
                    Label_1154:
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1604)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1441)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(133353065))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-1652743995))
                            goto(Label_1007)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(512)), ldc:int(0))) {
                            var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-2048354991))
                            goto(Label_0859)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_6B1 = and:int(var_3_6B1:int, ldc:int(327442400))
                            goto(Label_0732)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0601)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-2037877102))
                            goto(Label_0422)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(65536)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-1628213313))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_F3:int, ldc:int(0))) {
                                goto(Label_1441)
                            }
                        }
                    }
                    
                    Label_1284:
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-1013769708))
                        goto(Label_1604)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(1323598309))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_1154)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_1007)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_6B1 = and:int(var_3_6B1:int, ldc:int(809555813))
                            goto(Label_0859)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(256)), ldc:int(0))) {
                            var_3_6B1 = and:int(var_3_6B1:int, ldc:int(1846506861))
                            goto(Label_0732)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-186743432))
                            goto(Label_0601)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_6B1 = and:int(var_3_6B1:int, ldc:int(1400411210))
                            goto(Label_0422)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_6B1 = and:int(var_3_6B1:int, ldc:int(2109982038))
                            loopcontinue()
                        }
                        
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(979698683))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_11D:double, var_5_89:int, var_16_121:int)
                        goto(Label_1593)
                    }
                    
                    Label_1441:
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1604)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-602976772))
                        goto(Label_1284)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(1318113864))
                        goto(Label_1154)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1007)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(567191984))
                        goto(Label_0859)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(1871582727))
                        goto(Label_0732)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(101713964))
                        goto(Label_0601)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-1463247240))
                        goto(Label_0422)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(134217728)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_6B1 = and:int(var_3_6B1:int, ldc:int(1029927198))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_11D:double, ldc:double(0.0))
                    Label_1593:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_6BC = var_5_89:int
                        
                        if (cmpeq:boolean(var_11_F3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1604:
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1441)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(418829471))
                        goto(Label_1284)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1154)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1007)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(256)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-593558744))
                        goto(Label_0859)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0732)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0601)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-1076169204))
                        goto(Label_0422)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-78386798))
                        var_17_6BC = add:int(var_16_121:int, xor:int(ldc:int(16545), ldc:int(16544)))
                        looporswitchbreak()
                    }
                    
                    var_3_6B1 = and:int(var_3_6B1:int, ldc:int(2015260517))
                }
                
                var_3_6B1 = and:int(var_3_6B1:int, ldc:int(1366661898))
                
                if (cmple:boolean(var_5_89 = var_17_6BC:int, sub:int(var_6_90:int, xor:int(ldc:int(-32380), ldc:int(-32379))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0179:
        
        if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(2048)), ldc:int(0))) {
            var_3_6B1 = and:int(var_3_6B1:int, ldc:int(997474647))
            goto(Label_0108)
        }
    }
}
