public class \u51b2\u6fb0\ufcaf\u61a4\u0800.\uc7fe\ua61f\ub18d\u64ab\u4f4a.\u3a62\ub70c\uf9c5\u927d\u3d64\u3d64 {
    public void \u3a62\ub70c\uf9c5\u927d\u3d64\u3d64() {
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
            invokespecial:\u1833\ud171\u8350\ubded\u34df\uc9f6(\u1833\ud171\u8350\ubded\u34df\uc9f6::<init>, this:\u3a62\ub70c\uf9c5\u927d\u3d64\u3d64, loadelement:String(getstatic:String[](\u3a62\ub70c\uf9c5\u927d\u3d64\u3d64::\u9033\u8258\u4e72\u9af2\ua61f\u3e2a), and:int(ldc:int(26937), ldc:int(-28090))), ldc:Class<\u4975\u1833\u446c\u5bc4\ubded\u4f4a>(\u5d20\u97b7\u8753\u873d\u16f6.\u4975\u1833\u446c\u5bc4\ubded\u4f4a.class))
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
        var_7_15A : long[]
        var_8_174 : char
        var_9_18B : int
        var_2_199 : int
        var_10_1A1 : int
        var_2_21C : int
        stack_26B_0 : int [generated]
        stack_26B_1 : int [generated]
        stack_26B_2 : long[] [generated]
        stack_26B_3 : \ua068\u5f50\u416d\ud51e\u760c\u97b7 [generated]
        
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
            var_2_120 = and:int(ldc:int(792880251), ldc:int(-1076248785))
            var_4_64 = invokevirtual:short[expected:int](ByteBuf::readUnsignedByte, p0:ByteBuf)
            
            if (cmpne:boolean(var_5_68 = var_4_64:int, ldc:int(0))) {
                if (cmple:boolean(var_4_64:int, ldc:int(8))) {
                    goto(Label_0164)
                }
            }
            
            Label_0111:
            
            if (cmpne:boolean(and:int(var_2_120:int, ldc:int(32768)), ldc:int(0))) {
                var_2_120 = and:int(var_2_120:int, ldc:int(-1717890705))
                goto(Label_0198)
            }
            
            if (cmpeq:boolean(and:int(var_2_120:int, ldc:int(8)), ldc:int(0))) {
                var_2_120 = and:int(var_2_120:int, ldc:int(-704799545))
            }
            else {
                var_2_120 = and:int(var_2_120:int, ldc:int(1869622779))
                var_4_64 = ldc:int(15)
            }
            
            Label_0164:
            
            if (cmpeq:boolean(and:int(var_2_120:int, ldc:int(1)), ldc:int(0))) {
                var_2_120 = and:int(var_2_120:int, ldc:int(1748075254))
            }
            else {
                if (cmpeq:boolean(and:int(var_2_120:int, ldc:int(134217728)), ldc:int(0))) {
                    goto(Label_0111)
                }
                
                var_2_120 = and:int(var_2_120:int, ldc:int(-1343197269))
                
                if (cmpne:boolean(var_4_64:int, ldc:int(15))) {
                    var_7_FF = invokevirtual:int(\uceb8\u4c2b\ub8be\u7049\u8308\u3a62::\uc4d2\uf94d\u6d69\u6b5f\ucef1\u624e, getstatic:\uceb8\u4c2b\ub8be\u7049\u8308\u3a62(\u1833\ud171\u8350\ubded\u34df\uc9f6::\ud523\u62da\u6c52\u7043\ud217\u72f1), p0:ByteBuf)
                    var_6_E8 = initobject:\u4975\u1833\u446c\u5bc4\ubded\u4f4a(\u4975\u1833\u446c\u5bc4\ubded\u4f4a::<init>, var_7_FF:int)
                    var_8_113 = and:int(ldc:int(-23236), ldc:int(23107))
                    
                    loop {
                        if (cmpeq:boolean(and:int(var_2_120:int, ldc:int(256)), ldc:int(0))) {
                            var_2_120 = and:int(var_2_120:int, ldc:int(-1350849089))
                            
                            if (cmplt:boolean(var_8_113:int, var_7_FF:int)) {
                                invokevirtual:void(\u4975\u1833\u446c\u5bc4\ubded\u4f4a::\u12cb\ud158\u64f2\u527a\u7e3f\u6198, var_6_E8:\u4975\u1833\u446c\u5bc4\ubded\u4f4a, invokevirtual:int(\uceb8\u4c2b\ub8be\u7049\u8308\u3a62::\uc4d2\uf94d\u6d69\u6b5f\ucef1\u624e, getstatic:\uceb8\u4c2b\ub8be\u7049\u8308\u3a62(\u1833\ud171\u8350\ubded\u34df\uc9f6::\ud523\u62da\u6c52\u7043\ud217\u72f1), p0:ByteBuf))
                                inc:int(var_8_113, ldc:int(1))
                                loopcontinue()
                            }
                        }
                        
                        if (cmpeq:boolean(and:int(var_2_120:int, ldc:int(268435456)), ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    var_2_E0 = and:int(var_2_120:int, ldc:int(1072462895))
                    goto(Label_0337)
                }
            }
            
            Label_0198:
            
            if (cmpne:boolean(and:int(var_2_120:int, ldc:int(268435456)), ldc:int(0))) {
                var_2_120 = and:int(var_2_120:int, ldc:int(1488189340))
                goto(Label_0164)
            }
            
            if (cmpne:boolean(and:int(var_2_120:int, ldc:int(32768)), ldc:int(0))) {
                goto(Label_0111)
            }
            
            var_2_E0 = and:int(var_2_120:int, ldc:int(-280122305))
            var_6_E8 = initobject:\u4975\u1833\u446c\u5bc4\ubded\u4f4a(\u4975\u1833\u446c\u5bc4\ubded\u4f4a::<init>)
            Label_0337:
            var_7_15A = newarray:long[](long.class, invokevirtual:int(\uceb8\u4c2b\ub8be\u7049\u8308\u3a62::\uc4d2\uf94d\u6d69\u6b5f\ucef1\u624e, getstatic:\uceb8\u4c2b\ub8be\u7049\u8308\u3a62(\u1833\ud171\u8350\ubded\u34df\uc9f6::\ud523\u62da\u6c52\u7043\ud217\u72f1), p0:ByteBuf))
            
            if (cmpgt:boolean(arraylength:int(var_7_15A:long[]), ldc:int(0))) {
                var_8_174 = i2c:char(div:int(ldc:int(64), var_4_64:int))
                var_9_18B = div:int(sub:int(add:int(xor:int(ldc:int(1693), ldc:int(5789)), var_8_174:char[expected:int]), xor:int(ldc:int(8520), ldc:int(8521))), var_8_174:char[expected:int])
                
                if (cmpne:boolean(arraylength:int(var_7_15A:long[]), var_9_18B:int)) {
                    athrow(initobject:IllegalStateException(IllegalStateException::<init>, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u3a62\ub70c\uf9c5\u927d\u3d64\u3d64::\u9033\u8258\u4e72\u9af2\ua61f\u3e2a), and:int(ldc:int(25601), ldc:int(131)))), arraylength:int(var_7_15A:long[])), loadelement:String(getstatic:String[](\u3a62\ub70c\uf9c5\u927d\u3d64\u3d64::\u9033\u8258\u4e72\u9af2\ua61f\u3e2a), and:int(ldc:int(12290), ldc:int(20226)))), var_9_18B:int), loadelement:String(getstatic:String[](\u3a62\ub70c\uf9c5\u927d\u3d64\u3d64::\u9033\u8258\u4e72\u9af2\ua61f\u3e2a), and:int(ldc:int(8195), ldc:int(2571)))), var_4_64:int), loadelement:String(getstatic:String[](\u3a62\ub70c\uf9c5\u927d\u3d64\u3d64::\u9033\u8258\u4e72\u9af2\ua61f\u3e2a), and:int(ldc:int(516), ldc:int(8589)))), var_5_68:int))))
                }
                
                var_2_199 = and:int(var_2_E0:int, ldc:int(2136306155))
                var_10_1A1 = and:int(ldc:int(-31407), ldc:int(29356))
                
                while (cmplt:boolean(var_10_1A1:int, arraylength:int(var_7_15A:long[]))) {
                    storeelement:long(var_7_15A:long[], var_10_1A1:int, invokevirtual:long(ByteBuf::readLong, p0:ByteBuf))
                    inc:int(var_10_1A1, ldc:int(1))
                }
                
                var_2_21C = and:int(var_2_199:int, ldc:int(1869213231))
                stack_26B_0 = var_4_64:int
                stack_26B_1 = and:int(ldc:int(14176), ldc:int(4226))
                stack_26B_2 = var_7_15A:long[]
                
                if (cmpne:boolean(var_4_64:int, ldc:int(15))) {
                    var_2_21C = and:int(var_2_21C:int, ldc:int(793112767))
                    stack_26B_3 = invokedynamic:\ua068\u5f50\u416d\ud51e\u760c\u97b7(\ub6ab\ud12e\ufcaf\u0a06\u71ae\u120d:(L\u5d20\u97b7\u8753\u873d\u16f6/\u4975\u1833\u446c\u5bc4\ubded\u4f4a;)L\u47c2\u2dcc\u12cb\ud171\u8c8a/\ua068\u5f50\u416d\ud51e\u760c\u97b7;, var_6_E8:\u4975\u1833\u446c\u5bc4\ubded\u4f4a)
                }
                else {
                    stack_26B_3 = invokedynamic:\ua068\u5f50\u416d\ud51e\u760c\u97b7(\ub6ab\ud12e\ufcaf\u0a06\u71ae\u120d:(L\u5d20\u97b7\u8753\u873d\u16f6/\u4975\u1833\u446c\u5bc4\ubded\u4f4a;)L\u47c2\u2dcc\u12cb\ud171\u8c8a/\ua068\u5f50\u416d\ud51e\u760c\u97b7;, var_6_E8:\u4975\u1833\u446c\u5bc4\ubded\u4f4a)
                }
                
                var_2_E0 = and:int(var_2_21C:int, ldc:int(-9687617))
                invokestatic:void(\ub113\u4179\u6cfe\u12b2\u8d90\u3711::\u4975\ua3b4\u4e72\u760c\ufe34\u8753, stack_26B_0:int, stack_26B_1:int, stack_26B_2:long[], stack_26B_3:\ua068\u5f50\u416d\ud51e\u760c\u97b7)
            }
            
            return:\u4975\u1833\u446c\u5bc4\ubded\u4f4a(var_6_E8:\u4975\u1833\u446c\u5bc4\ubded\u4f4a)
        }
        
        goto(Label_0006)
    }
    
    public void \ud171\uc229\ufe34\u36d3\u5f50\uc2e8(io.netty.buffer.ByteBuf p0, \u5d20\u97b7\u8753\u873d\u16f6.\u4975\u1833\u446c\u5bc4\ubded\u4f4a p1) {
        var_3_5F : int
        var_5_67 : int
        var_6_16D : int
        var_3_11E : int
        stack_1AB_0 : int [generated]
        stack_1AB_1 : int [generated]
        stack_1AB_2 : IntToLongFunction [generated]
        var_3_1AA : int
        var_6_1AE : long[]
        var_7_1BC : long[]
        var_8_1C1 : int
        var_9_1CA : int
        
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
            var_3_5F = and:int(ldc:int(1781193129), ldc:int(2075905719))
            var_5_67 = and:int(ldc:int(8452), ldc:int(2069))
            
            loop {
                if (cmpne:boolean(and:int(var_3_5F:int, ldc:int(67108864)), ldc:int(0))) {
                    var_3_5F = and:int(var_3_5F:int, ldc:int(-2059226554))
                    goto(Label_0261)
                }
                
                if (cmpne:boolean(and:int(var_3_5F:int, ldc:int(65536)), ldc:int(0))) {
                    goto(Label_0205)
                }
                
                if (cmpeq:boolean(and:int(var_3_5F:int, ldc:int(32768)), ldc:int(0))) {
                    var_3_5F = and:int(var_3_5F:int, ldc:int(-824301149))
                }
                else {
                    var_3_5F = and:int(var_3_5F:int, ldc:int(-1426139207))
                    
                    if (cmpgt:boolean(invokevirtual:int(\u4975\u1833\u446c\u5bc4\ubded\u4f4a::\u927d\ubb2b\u69d9\u74b1\ubded\ub7dc, p1:\u4975\u1833\u446c\u5bc4\ubded\u4f4a), shl:int(and:int(ldc:int(28817), ldc:int(3589)), var_5_67:int))) {
                        inc:int(var_5_67, ldc:int(1))
                        loopcontinue()
                    }
                }
                
                Label_0164:
                
                if (cmpeq:boolean(and:int(var_3_5F:int, ldc:int(2097152)), ldc:int(0))) {
                    goto(Label_0261)
                }
                
                if (cmpne:boolean(and:int(var_3_5F:int, ldc:int(32)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_3_5F:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_5F = and:int(var_3_5F:int, ldc:int(-479905476))
                        loopcontinue()
                    }
                    
                    var_3_5F = and:int(var_3_5F:int, ldc:int(-1510348887))
                    
                    if (cmpgt:boolean(var_5_67:int, ldc:int(8))) {
                        var_5_67 = ldc:int(15)
                    }
                }
                
                Label_0205:
                
                if (cmpeq:boolean(and:int(var_3_5F:int, ldc:int(32)), ldc:int(0))) {
                    var_3_5F = and:int(var_3_5F:int, ldc:int(-623275465))
                }
                else {
                    if (cmpeq:boolean(and:int(var_3_5F:int, ldc:int(128)), ldc:int(0))) {
                        var_3_5F = and:int(var_3_5F:int, ldc:int(727342290))
                        goto(Label_0164)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F:int, ldc:int(1)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_5F = and:int(var_3_5F:int, ldc:int(-1125128769))
                    invokevirtual:ByteBuf(ByteBuf::writeByte, p0:ByteBuf, var_5_67:int)
                    
                    if (cmpne:boolean(var_5_67:int, ldc:int(15))) {
                        invokevirtual:void(\uceb8\u4c2b\ub8be\u7049\u8308\u3a62::\u0c95\u6435\u3504\u36d3\u2dcc\u16f6, getstatic:\uceb8\u4c2b\ub8be\u7049\u8308\u3a62(\u1833\ud171\u8350\ubded\u34df\uc9f6::\ud523\u62da\u6c52\u7043\ud217\u72f1), p0:ByteBuf, invokevirtual:int(\u4975\u1833\u446c\u5bc4\ubded\u4f4a::\u927d\ubb2b\u69d9\u74b1\ubded\ub7dc, p1:\u4975\u1833\u446c\u5bc4\ubded\u4f4a))
                        var_6_16D = and:int(ldc:int(-11745), ldc:int(11744))
                        
                        loop {
                            var_3_5F = and:int(var_3_5F:int, ldc:int(-1226059521))
                            
                            if (cmpge:boolean(var_6_16D:int, invokevirtual:int(\u4975\u1833\u446c\u5bc4\ubded\u4f4a::\u927d\ubb2b\u69d9\u74b1\ubded\ub7dc, p1:\u4975\u1833\u446c\u5bc4\ubded\u4f4a))) {
                                looporswitchbreak()
                            }
                            
                            invokevirtual:void(\uceb8\u4c2b\ub8be\u7049\u8308\u3a62::\u0c95\u6435\u3504\u36d3\u2dcc\u16f6, getstatic:\uceb8\u4c2b\ub8be\u7049\u8308\u3a62(\u1833\ud171\u8350\ubded\u34df\uc9f6::\ud523\u62da\u6c52\u7043\ud217\u72f1), p0:ByteBuf, invokevirtual:int(\u4975\u1833\u446c\u5bc4\ubded\u4f4a::\u1833\u7049\u64ab\u927d\u760c\u97e6, p1:\u4975\u1833\u446c\u5bc4\ubded\u4f4a, var_6_16D:int))
                            inc:int(var_6_16D, ldc:int(1))
                        }
                    }
                }
                
                Label_0261:
                
                if (cmpne:boolean(and:int(var_3_5F:int, ldc:int(4194304)), ldc:int(0))) {
                    goto(Label_0205)
                }
                
                if (cmpne:boolean(and:int(var_3_5F:int, ldc:int(67108864)), ldc:int(0))) {
                    goto(Label_0164)
                }
                
                if (cmpne:boolean(and:int(var_3_5F:int, ldc:int(128)), ldc:int(0))) {
                    looporswitchbreak()
                }
            }
            
            var_3_11E = and:int(var_3_5F:int, ldc:int(-1183135071))
            stack_1AB_0 = var_5_67:int
            stack_1AB_1 = and:int(ldc:int(14592), ldc:int(4653))
            
            if (cmpne:boolean(var_5_67:int, ldc:int(15))) {
                var_3_11E = and:int(var_3_11E:int, ldc:int(1915674293))
                stack_1AB_2 = invokedynamic:IntToLongFunction(applyAsLong:(L\u5d20\u97b7\u8753\u873d\u16f6/\u4975\u1833\u446c\u5bc4\ubded\u4f4a;)Ljava/util/function/IntToLongFunction;, p1:\u4975\u1833\u446c\u5bc4\ubded\u4f4a)
            }
            else {
                stack_1AB_2 = invokedynamic:IntToLongFunction(applyAsLong:(L\u5d20\u97b7\u8753\u873d\u16f6/\u4975\u1833\u446c\u5bc4\ubded\u4f4a;)Ljava/util/function/IntToLongFunction;, p1:\u4975\u1833\u446c\u5bc4\ubded\u4f4a)
            }
            
            var_3_1AA = and:int(var_3_11E:int, ldc:int(-1275138071))
            var_6_1AE = invokestatic:long[](\ub113\u4179\u6cfe\u12b2\u8d90\u3711::\u873d\ub32d\u3d4b\u92ff\ub171\u7330, stack_1AB_0:int, stack_1AB_1:int, stack_1AB_2:IntToLongFunction)
            invokevirtual:void(\uceb8\u4c2b\ub8be\u7049\u8308\u3a62::\u0c95\u6435\u3504\u36d3\u2dcc\u16f6, getstatic:\uceb8\u4c2b\ub8be\u7049\u8308\u3a62(\u1833\ud171\u8350\ubded\u34df\uc9f6::\ud523\u62da\u6c52\u7043\ud217\u72f1), p0:ByteBuf, arraylength:int(var_6_1AE:long[]))
            var_7_1BC = var_6_1AE:long[]
            var_8_1C1 = arraylength:int(var_7_1BC:long[])
            var_9_1CA = and:int(ldc:int(-30925), ldc:int(30924))
            
            loop {
                var_3_1AA = and:int(var_3_1AA:int, ldc:int(-29824799))
                
                if (cmpge:boolean(var_9_1CA:int, var_8_1C1:int)) {
                    looporswitchbreak()
                }
                
                invokevirtual:ByteBuf(ByteBuf::writeLong, p0:ByteBuf, loadelement:long(var_7_1BC:long[], var_9_1CA:int))
                inc:int(var_9_1CA, ldc:int(1))
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
            return:Object(invokevirtual:\u4975\u1833\u446c\u5bc4\ubded\u4f4a[expected:Object](\u3a62\ub70c\uf9c5\u927d\u3d64\u3d64::\u4d85\uff55\uc3e3\ud4fe\u9937\uc229, this:\u3a62\ub70c\uf9c5\u927d\u3d64\u3d64, p0:ByteBuf))
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
            invokevirtual:void(\u3a62\ub70c\uf9c5\u927d\u3d64\u3d64::\ud171\uc229\ufe34\u36d3\u5f50\uc2e8, this:\u3a62\ub70c\uf9c5\u927d\u3d64\u3d64, p0:ByteBuf, checkcast:\u4975\u1833\u446c\u5bc4\ubded\u4f4a(\u5d20\u97b7\u8753\u873d\u16f6.\u4975\u1833\u446c\u5bc4\ubded\u4f4a.class, p1:Object[expected:\u4975\u1833\u446c\u5bc4\ubded\u4f4a]))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_1A5 : int
        expr_6B : int [generated]
        stack_90_0 : byte[] [generated]
        stack_92_0 : byte[] [generated]
        stack_B0_0 : byte[] [generated]
        stack_B2_0 : byte[] [generated]
        stack_DF_0 : byte[] [generated]
        stack_1B8_0 : byte[] [generated]
        stack_20F_0 : byte[] [generated]
        stack_276_0 : byte[] [generated]
        var_4_191 : int
        var_3_196 : byte[]
        var_5_197 : int
        expr_1BB : byte [generated]
        var_0_26C : int
        expr_276 : byte [generated]
        stack_2A6_2 : byte [generated]
        var_2_90 : byte[]
        expr_94 : int [generated]
        var_3_1FD : byte[]
        var_5_1FE : int
        expr_B2 : int [generated]
        var_3_EB : String
        stack_18A_0 : String[] [generated]
        expr_FD : String[] [generated]
        
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
        var_0_1A5 = and:int(ldc:int(1511623236), ldc:int(1457229127))
        expr_6B = arraylength:int(stack_90_0 = stack_92_0 = stack_B0_0 = stack_B2_0 = stack_DF_0 = stack_1B8_0 = stack_20F_0 = stack_276_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("tLyZB6nthAvREoj5vSfFnZTZKsHZxS+1wZjhkeXiD8rJ/eS4hIU+Bt0GvdVJ3Zai/gm8rP35se3NhrW1BT4G3Qa91UndllLBCU3dB8n9jNne9cWU4ZHl4g9qsJQpwSc27cxByaXp8japkIWvg1fR")))
        
        if (cmpeq:boolean(expr_6B:int, ldc:int(0))) {
            goto(Label_0112)
        }
        
        var_4_191 = expr_6B:int
        var_3_196 = newarray:byte[](byte.class, expr_6B:int)
        var_5_197 = expr_6B:int
        Label_0409:
        
        while (cmpne:boolean(and:int(var_0_1A5:int, ldc:int(268435456)), ldc:int(0))) {
            var_0_1A5 = and:int(var_0_1A5:int, ldc:int(-20976724))
            var_5_197 = add:int(var_5_197:int, ldc:int(-1))
            expr_1BB = xor:byte(loadelement:byte(stack_1B8_0:byte[], var_5_197:int), ldc:byte(4))
            storeelement:byte(var_3_196:byte[], var_5_197:int, add:int(or:int(and:int(shl:int(expr_1BB:byte, xor:int(ldc:int(-32600), ldc:int(-32596))), ldc:int(-16)), and:int(shr:int(expr_1BB:byte[expected:int], and:int(ldc:int(1036), ldc:int(711))), ldc:int(15))), ldc:int(35)))
            
            if (cmpne:boolean(var_5_197:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_92_0 = stack_90_0 = stack_B0_0 = stack_B2_0 = stack_DF_0 = stack_1B8_0 = stack_20F_0 = stack_276_0 = var_3_196:byte[]
            goto(Label_0112)
        }
        
        var_0_1A5 = and:int(var_0_1A5:int, ldc:int(-244697268))
        Label_0598:
        
        while (cmpeq:boolean(and:int(var_0_1A5:int, ldc:int(16384)), ldc:int(0))) {
            var_0_26C = and:int(var_0_1A5:int, ldc:int(1918630918))
            var_5_197 = add:int(var_5_197:int, ldc:int(-1))
            expr_276 = loadelement:byte(stack_276_0:byte[], var_5_197:int)
            
            if (cmpge:boolean(add:int(add:int(var_5_197:int, ldc:int(3)), neg:int(var_4_191:int)), ldc:int(0))) {
                var_0_26C = and:int(var_0_26C:int, ldc:int(1608511410))
                stack_2A6_2 = add:byte(expr_276:byte, ldc:byte(3))
            }
            else {
                stack_2A6_2 = add:byte(expr_276:byte, loadelement:byte(var_3_196:byte[], add:int(var_5_197:int, ldc:int(3))))
            }
            
            var_0_1A5 = and:int(var_0_26C:int, ldc:int(2116020533))
            storeelement:byte(var_3_196:byte[], var_5_197:int, stack_2A6_2:byte)
            
            if (cmpne:boolean(var_5_197:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_92_0 = stack_90_0 = stack_B0_0 = stack_B2_0 = stack_DF_0 = stack_1B8_0 = stack_20F_0 = stack_276_0 = var_3_196:byte[]
            goto(Label_0183)
        }
        
        var_0_1A5 = and:int(var_0_1A5:int, ldc:int(348448906))
        goto(Label_0409)
        Label_0112:
        
        if (cmpne:boolean(and:int(var_0_1A5:int, ldc:int(16777216)), ldc:int(0))) {
            var_0_1A5 = and:int(var_0_1A5:int, ldc:int(-1046593617))
            goto(Label_0183)
        }
        
        if (cmpeq:boolean(and:int(var_0_1A5:int, ldc:int(8)), ldc:int(0))) {
            var_0_1A5 = and:int(var_0_1A5:int, ldc:int(1941538930))
            var_2_90 = stack_90_0:byte[]
            expr_94 = add:int(arraylength:int(stack_92_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_94:int, ldc:int(0))) {
                var_3_1FD = newarray:byte[](byte.class, expr_94:int)
                var_5_1FE = expr_94:int
                
                loop {
                    var_0_1A5 = and:int(var_0_1A5:int, ldc:int(2145365618))
                    var_5_1FE = add:int(var_5_1FE:int, ldc:int(-1))
                    storeelement:byte(var_3_1FD:byte[], var_5_1FE:int, add:int(shl:int(loadelement:byte(stack_20F_0:byte[], var_5_1FE:int), ldc:int(2)), and:int(shr:int(loadelement:byte(var_2_90:byte[], add:int(var_5_1FE:int, and:int(ldc:int(163), ldc:int(31045)))), ldc:int(6)), xor:int(ldc:int(11), ldc:int(8)))))
                    
                    if (cmpne:boolean(var_5_1FE:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_92_0 = stack_90_0 = stack_B0_0 = stack_B2_0 = stack_DF_0 = stack_1B8_0 = stack_20F_0 = stack_276_0 = var_3_1FD:byte[]
            }
        }
        
        Label_0153:
        
        if (cmpne:boolean(and:int(var_0_1A5:int, ldc:int(65536)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_1A5:int, ldc:int(8192)), ldc:int(0))) {
                goto(Label_0112)
            }
            
            var_0_1A5 = and:int(var_0_1A5:int, ldc:int(1526332255))
            expr_B2 = arraylength:int(stack_B2_0:byte[])
            
            if (cmpne:boolean(expr_B2:int, ldc:int(0))) {
                var_4_191 = expr_B2:int
                var_3_196 = newarray:byte[](byte.class, expr_B2:int)
                var_5_197 = expr_B2:int
                goto(Label_0598)
            }
        }
        
        Label_0183:
        
        if (cmpne:boolean(and:int(var_0_1A5:int, ldc:int(16)), ldc:int(0))) {
            var_0_1A5 = and:int(var_0_1A5:int, ldc:int(2022033789))
            goto(Label_0153)
        }
        
        if (cmpne:boolean(and:int(var_0_1A5:int, ldc:int(128)), ldc:int(0))) {
            var_0_1A5 = and:int(var_0_1A5:int, ldc:int(-1038091100))
            goto(Label_0112)
        }
        
        var_3_EB = initobject:String(String::<init>, stack_DF_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
        stack_18A_0 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(4109), ldc:int(2405)))
        expr_FD = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(12288), ldc:int(12293)))
        storeelement:String(expr_FD:String[], xor:int(ldc:int(5257), ldc:int(5259)), invokevirtual:String[expected:String](String::substring, var_3_EB:String, and:int(ldc:int(14644), ldc:int(-31037)), and:int(ldc:int(18482), ldc:int(9126))))
        storeelement:String(expr_FD:String[], xor:int(ldc:int(1089), ldc:int(1090)), invokevirtual:String[expected:String](String::substring, var_3_EB:String, and:int(ldc:int(162), ldc:int(99)), xor:int(ldc:int(-32107), ldc:int(-32089))))
        storeelement:String(expr_FD:String[], xor:int(ldc:int(2049), ldc:int(2053)), invokevirtual:String[expected:String](String::substring, var_3_EB:String, and:int(ldc:int(2227), ldc:int(318)), xor:int(ldc:int(543), ldc:int(598))))
        storeelement:String(expr_FD:String[], and:int(ldc:int(24871), ldc:int(1153)), invokevirtual:String[expected:String](String::substring, var_3_EB:String, xor:int(ldc:int(733), ldc:int(660)), and:int(ldc:int(16477), ldc:int(12508))))
        storeelement:String(expr_FD:String[], and:int(ldc:int(-17409), ldc:int(17408)), invokevirtual:String[expected:String](String::substring, var_3_EB:String, xor:int(ldc:int(398), ldc:int(466)), and:int(ldc:int(366), ldc:int(28783))))
        putstatic:String[](\u3a62\ub70c\uf9c5\u927d\u3d64\u3d64::\u9033\u8258\u4e72\u9af2\ua61f\u3e2a, expr_FD:String[])
    }
    
    public void \u8cae\u5f50\u3e75\uceb8\u873d\ua3b4(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_67A : int
        var_5_80 : int
        var_6_87 : int
        var_7_96 : double
        var_9_BE : double
        var_3_D0 : int
        var_11_E1 : int
        var_14_10B : double
        var_16_10F : int
        var_12_107 : double
        var_17_685 : int
        
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
        var_3_67A = and:int(ldc:int(16995393), ldc:int(863884380))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u3a62\ub70c\uf9c5\u927d\u3d64\u3d64[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0170)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(2097152)), ldc:int(0))) {
            var_3_67A = and:int(var_3_67A:int, ldc:int(1302710252))
            var_5_80 = and:int(ldc:int(-31216), ldc:int(18542))
            var_6_87 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_96 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-25394), ldc:int(9009)))
            invokestatic:int(m::a)
            
            loop {
                var_9_BE = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D0 = and:int(var_3_67A:int, ldc:int(-414581056))
                    var_9_BE = sub:double(var_7_96:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E1 = var_5_80:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E1:int, sub:int(var_6_87:int, and:int(ldc:int(4321), ldc:int(18457)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E1:int, and:int(ldc:int(769), ldc:int(9253)))), var_7_96:double))) {
                        inc:int(var_11_E1, ldc:int(1))
                    }
                    
                    var_3_67A = and:int(var_3_D0:int, ldc:int(1495123559))
                    var_14_10B = var_7_96:double
                    var_16_10F = var_11_E1:int
                }
                else {
                    var_11_E1 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_80:int), xor:int(ldc:int(258), ldc:int(259)))
                    var_12_107 = var_14_10B = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_80)
                    
                    if (cmplt:boolean(var_16_10F = var_11_E1:int, var_6_87:int)) {
                        var_9_BE = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E1:int)
                        var_16_10F = var_11_E1:int
                        var_14_10B = var_12_107:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_67A = and:int(var_3_67A:int, ldc:int(2077969844))
                        goto(Label_1547)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1394)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1259)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1138)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0963)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(128)), ldc:int(0))) {
                        var_3_67A = and:int(var_3_67A:int, ldc:int(627568869))
                        goto(Label_0858)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_67A = and:int(var_3_67A:int, ldc:int(39252643))
                        goto(Label_0730)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0590)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_67A = and:int(var_3_67A:int, ldc:int(-2132074064))
                    }
                    else {
                        var_3_67A = and:int(var_3_67A:int, ldc:int(-740818999))
                        
                        if (cmplt:boolean(var_16_10F:int, var_6_87:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0590)
                            }
                            
                            goto(Label_0858)
                        }
                    }
                    
                    Label_0400:
                    
                    if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_67A = and:int(var_3_67A:int, ldc:int(-1112707915))
                        goto(Label_1547)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_67A = and:int(var_3_67A:int, ldc:int(-1176002686))
                        goto(Label_1394)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_67A = and:int(var_3_67A:int, ldc:int(958252286))
                        goto(Label_1259)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(8)), ldc:int(0))) {
                        var_3_67A = and:int(var_3_67A:int, ldc:int(-1421610547))
                        goto(Label_1138)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(8)), ldc:int(0))) {
                        var_3_67A = and:int(var_3_67A:int, ldc:int(-1208310906))
                        goto(Label_0963)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_67A = and:int(var_3_67A:int, ldc:int(-297820736))
                        goto(Label_0858)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0730)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(8388608)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(64)), ldc:int(0))) {
                            var_3_67A = and:int(var_3_67A:int, ldc:int(-543871937))
                            loopcontinue()
                        }
                        
                        var_3_67A = and:int(var_3_67A:int, ldc:int(-1185294908))
                        var_11_E1 = and:int(ldc:int(5892), ldc:int(-14215))
                        goto(Label_1536)
                    }
                    
                    Label_0590:
                    
                    if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_67A = and:int(var_3_67A:int, ldc:int(-1894624222))
                        goto(Label_1547)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(512)), ldc:int(0))) {
                        var_3_67A = and:int(var_3_67A:int, ldc:int(-1986059903))
                        goto(Label_1394)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1259)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_67A = and:int(var_3_67A:int, ldc:int(-1544923254))
                        goto(Label_1138)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_67A = and:int(var_3_67A:int, ldc:int(-886356236))
                        goto(Label_0963)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(512)), ldc:int(0))) {
                        var_3_67A = and:int(var_3_67A:int, ldc:int(-81246550))
                        goto(Label_0858)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(1048576)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0400)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_67A = and:int(var_3_67A:int, ldc:int(-967287234))
                            loopcontinue()
                        }
                        
                        var_3_67A = and:int(var_3_67A:int, ldc:int(-177126045))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10B = var_9_BE:double
                            goto(Label_0858)
                        }
                    }
                    
                    Label_0730:
                    
                    if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1547)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1394)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1259)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(512)), ldc:int(0))) {
                        var_3_67A = and:int(var_3_67A:int, ldc:int(1838446370))
                        goto(Label_1138)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_67A = and:int(var_3_67A:int, ldc:int(-155734568))
                        goto(Label_0963)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(268435456)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_67A = and:int(var_3_67A:int, ldc:int(76292723))
                            goto(Label_0590)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0400)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(256)), ldc:int(0))) {
                            var_3_67A = and:int(var_3_67A:int, ldc:int(374467330))
                            loopcontinue()
                        }
                        
                        var_3_67A = and:int(var_3_67A:int, ldc:int(-1747886240))
                        var_14_10B = mul:double(ldc:double(0.5), add:double(var_9_BE:double, var_14_10B:double))
                    }
                    
                    Label_0858:
                    
                    if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1547)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1394)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1259)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(16)), ldc:int(0))) {
                        var_3_67A = and:int(var_3_67A:int, ldc:int(926770852))
                        goto(Label_1138)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(16384)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0730)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0590)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0400)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_67A = and:int(var_3_67A:int, ldc:int(417248179))
                            loopcontinue()
                        }
                        
                        var_3_67A = and:int(var_3_67A:int, ldc:int(2038527685))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_80:int), var_7_96:double)) {
                                var_11_E1 = xor:int(ldc:int(-32250), ldc:int(-32249))
                                goto(Label_1138)
                            }
                        }
                    }
                    
                    Label_0963:
                    
                    if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_67A = and:int(var_3_67A:int, ldc:int(1322538001))
                        goto(Label_1547)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1394)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_67A = and:int(var_3_67A:int, ldc:int(489606883))
                        goto(Label_1259)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_67A = and:int(var_3_67A:int, ldc:int(-930317999))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0858)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0730)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(64)), ldc:int(0))) {
                            var_3_67A = and:int(var_3_67A:int, ldc:int(1853660164))
                            goto(Label_0590)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(64)), ldc:int(0))) {
                            var_3_67A = and:int(var_3_67A:int, ldc:int(-1949954380))
                            goto(Label_0400)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(128)), ldc:int(0))) {
                            var_3_67A = and:int(var_3_67A:int, ldc:int(-370524150))
                            loopcontinue()
                        }
                        
                        var_3_67A = and:int(var_3_67A:int, ldc:int(-447785532))
                        var_11_E1 = and:int(ldc:int(-23699), ldc:int(23698))
                    }
                    
                    Label_1138:
                    
                    if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1547)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1394)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(128)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(16)), ldc:int(0))) {
                            var_3_67A = and:int(var_3_67A:int, ldc:int(-673077711))
                            goto(Label_0963)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_67A = and:int(var_3_67A:int, ldc:int(-2117018278))
                            goto(Label_0858)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_67A = and:int(var_3_67A:int, ldc:int(-2044094890))
                            goto(Label_0730)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_67A = and:int(var_3_67A:int, ldc:int(-1159555427))
                            goto(Label_0590)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0400)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(512)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_67A = and:int(var_3_67A:int, ldc:int(830599160))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E1:int, ldc:int(0))) {
                                goto(Label_1394)
                            }
                        }
                    }
                    
                    Label_1259:
                    
                    if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1547)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(64)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_67A = and:int(var_3_67A:int, ldc:int(579274181))
                            goto(Label_1138)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_67A = and:int(var_3_67A:int, ldc:int(1048080605))
                            goto(Label_0963)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_67A = and:int(var_3_67A:int, ldc:int(-430076042))
                            goto(Label_0858)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0730)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0590)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0400)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_67A = and:int(var_3_67A:int, ldc:int(-720168201))
                            loopcontinue()
                        }
                        
                        var_3_67A = and:int(var_3_67A:int, ldc:int(-884640566))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10B:double, var_5_80:int, var_16_10F:int)
                        goto(Label_1536)
                    }
                    
                    Label_1394:
                    
                    if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_67A = and:int(var_3_67A:int, ldc:int(1292578239))
                        goto(Label_1547)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1259)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_67A = and:int(var_3_67A:int, ldc:int(468755107))
                        goto(Label_1138)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0963)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0858)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(16)), ldc:int(0))) {
                        var_3_67A = and:int(var_3_67A:int, ldc:int(724047183))
                        goto(Label_0730)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_67A = and:int(var_3_67A:int, ldc:int(1719783314))
                        goto(Label_0590)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0400)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_67A = and:int(var_3_67A:int, ldc:int(-1959079696))
                        loopcontinue()
                    }
                    
                    var_3_67A = and:int(var_3_67A:int, ldc:int(-1795039917))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10B:double, ldc:double(0.0))
                    Label_1536:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_685 = var_5_80:int
                        
                        if (cmpeq:boolean(var_11_E1:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1547:
                    
                    if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_67A = and:int(var_3_67A:int, ldc:int(-1205746094))
                        goto(Label_1394)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1259)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(512)), ldc:int(0))) {
                        var_3_67A = and:int(var_3_67A:int, ldc:int(-1730601212))
                        goto(Label_1138)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0963)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0858)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0730)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_67A = and:int(var_3_67A:int, ldc:int(-920076120))
                        goto(Label_0590)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67A:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0400)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(128)), ldc:int(0))) {
                        var_3_67A = and:int(var_3_67A:int, ldc:int(-406229824))
                        var_17_685 = add:int(var_16_10F:int, xor:int(ldc:int(4148), ldc:int(4149)))
                        looporswitchbreak()
                    }
                    
                    var_3_67A = and:int(var_3_67A:int, ldc:int(956955859))
                }
                
                var_3_67A = and:int(var_3_67A:int, ldc:int(-2058785319))
                
                if (cmple:boolean(var_5_80 = var_17_685:int, sub:int(var_6_87:int, and:int(ldc:int(29841), ldc:int(813))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0170:
        
        if (cmpeq:boolean(and:int(var_3_67A:int, ldc:int(8388608)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
