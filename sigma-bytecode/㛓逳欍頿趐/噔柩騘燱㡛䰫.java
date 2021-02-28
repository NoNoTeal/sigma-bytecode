public class \u36d3\u9033\u6b0d\u983f\u8d90.\u5654\u67e9\u9a18\u71f1\u385b\u4c2b {
    public void \u5654\u67e9\u9a18\u71f1\u385b\u4c2b() {
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
            invokespecial:\u1833\ud171\u8350\ubded\u34df\uc9f6(\u1833\ud171\u8350\ubded\u34df\uc9f6::<init>, this:\u5654\u67e9\u9a18\u71f1\u385b\u4c2b, ldc:Class<\ud12e\ub18d\ud158\ud36e\ub8be\u56bd>(\u71f1\uc910\u3bc9\u516c\u93a2.\ud12e\ub18d\ud158\ud36e\ub8be\u56bd.class))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public \u71f1\uc910\u3bc9\u516c\u93a2.\ud12e\ub18d\ud158\ud36e\ub8be\u56bd \u4d85\uff55\uc3e3\ud4fe\u9937\uc229(io.netty.buffer.ByteBuf p0) {
        var_4_64 : int
        var_5_6A : int
        var_6_70 : boolean
        var_7_76 : boolean
        var_8_7F : int
        var_9_8B : \ub83f\u6c52\u12cb\u3c25\u3776
        var_10_A8 : int[]
        var_11_D5 : int
        var_11_BC : \u4975\u1833\u446c\u5bc4\ubded\u4f4a[]
        var_12_C5 : int
        var_13_153 : short
        var_14_15F : \u4975\u1833\u446c\u5bc4\ubded\u4f4a
        var_12_118 : ArrayList<\ub83f\u6c52\u12cb\u3c25\u3776>
        var_13_18A : byte[]
        
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
            var_4_64 = invokevirtual:int(ByteBuf::readInt, p0:ByteBuf)
            var_5_6A = invokevirtual:int(ByteBuf::readInt, p0:ByteBuf)
            var_6_70 = invokevirtual:boolean(ByteBuf::readBoolean, p0:ByteBuf)
            var_7_76 = invokevirtual:boolean(ByteBuf::readBoolean, p0:ByteBuf)
            var_8_7F = invokevirtual:int(\uceb8\u4c2b\ub8be\u7049\u8308\u3a62::\uc4d2\uf94d\u6d69\u6b5f\ucef1\u624e, getstatic:\uceb8\u4c2b\ub8be\u7049\u8308\u3a62(\u1833\ud171\u8350\ubded\u34df\uc9f6::\ud523\u62da\u6c52\u7043\ud217\u72f1), p0:ByteBuf)
            var_9_8B = checkcast:\ub83f\u6c52\u12cb\u3c25\u3776(\u51b2\u6fb0\ufcaf\u61a4\u0800.\uc7fe\ua61f\ub18d\u64ab\u4f4a.\ub83f\u6c52\u12cb\u3c25\u3776.class, invokevirtual:\ub83f\u6c52\u12cb\u3c25\u3776(\u8389\u494c\u527a\u8753\ub1b9\u8640<\ub83f\u6c52\u12cb\u3c25\u3776>::\u4d85\uff55\uc3e3\ud4fe\u9937\uc229, getstatic:\u1833\ud171\u8350\ubded\u34df\uc9f6<\ub83f\u6c52\u12cb\u3c25\u3776>[expected:\u8389\u494c\u527a\u8753\ub1b9\u8640<\ub83f\u6c52\u12cb\u3c25\u3776>](\u1833\ud171\u8350\ubded\u34df\uc9f6::\u3bc9\u5fe1\u4ab3\ub70c\u600f\u6fb0), p0:ByteBuf))
            var_10_A8 = ternaryop:int[](var_6_70:boolean, newarray:int[](int.class, xor:int(ldc:int(3), ldc:int(1027))), aconstnull:int[]())
            
            if (var_6_70:boolean) {
                var_11_D5 = and:int(ldc:int(4497), ldc:int(-4498))
                
                while (cmplt:boolean(var_11_D5:int, xor:int(ldc:int(3035), ldc:int(4059)))) {
                    storeelement:int(var_10_A8:int[], var_11_D5:int, invokevirtual:int(ByteBuf::readInt, p0:ByteBuf))
                    inc:int(var_11_D5, ldc:int(1))
                }
            }
            
            invokevirtual:int(\uceb8\u4c2b\ub8be\u7049\u8308\u3a62::\uc4d2\uf94d\u6d69\u6b5f\ucef1\u624e, getstatic:\uceb8\u4c2b\ub8be\u7049\u8308\u3a62(\u1833\ud171\u8350\ubded\u34df\uc9f6::\ud523\u62da\u6c52\u7043\ud217\u72f1), p0:ByteBuf)
            var_11_BC = newarray:\u4975\u1833\u446c\u5bc4\ubded\u4f4a[](\u5d20\u97b7\u8753\u873d\u16f6.\u4975\u1833\u446c\u5bc4\ubded\u4f4a.class, ldc:int(16))
            var_12_C5 = and:int(ldc:int(25861), ldc:int(-27942))
            
            while (cmplt:boolean(var_12_C5:int, ldc:int(16))) {
                if (cmpne:boolean(and:int(var_8_7F:int, shl:int(and:int(ldc:int(20849), ldc:int(137)), var_12_C5:int)), ldc:int(0))) {
                    var_13_153 = invokevirtual:short(ByteBuf::readShort, p0:ByteBuf)
                    var_14_15F = checkcast:\u4975\u1833\u446c\u5bc4\ubded\u4f4a(\u5d20\u97b7\u8753\u873d\u16f6.\u4975\u1833\u446c\u5bc4\ubded\u4f4a.class, invokevirtual:\u4975\u1833\u446c\u5bc4\ubded\u4f4a(\u8389\u494c\u527a\u8753\ub1b9\u8640<\u4975\u1833\u446c\u5bc4\ubded\u4f4a>::\u4d85\uff55\uc3e3\ud4fe\u9937\uc229, getstatic:\u1833\ud171\u8350\ubded\u34df\uc9f6<\u4975\u1833\u446c\u5bc4\ubded\u4f4a>[expected:\u8389\u494c\u527a\u8753\ub1b9\u8640<\u4975\u1833\u446c\u5bc4\ubded\u4f4a>](\u3776\uc910\u62da\uc31c\u51fa\u99f7::\u494c\u3c25\u99f7\u61a4\u7d52\u5fe1), p0:ByteBuf))
                    invokevirtual:void(\u4975\u1833\u446c\u5bc4\ubded\u4f4a::\u4179\u836c\ub32d\u156b\ud51e\u98a4, var_14_15F:\u4975\u1833\u446c\u5bc4\ubded\u4f4a, var_13_153:short[expected:int])
                    storeelement:\u4975\u1833\u446c\u5bc4\ubded\u4f4a(var_11_BC:\u4975\u1833\u446c\u5bc4\ubded\u4f4a[], var_12_C5:int, var_14_15F:\u4975\u1833\u446c\u5bc4\ubded\u4f4a)
                }
                
                inc:int(var_12_C5, ldc:int(1))
            }
            
            var_12_118 = initobject:ArrayList<\ub83f\u6c52\u12cb\u3c25\u3776>(ArrayList<\ub83f\u6c52\u12cb\u3c25\u3776>::<init>, invokestatic:List<\ub83f\u6c52\u12cb\u3c25\u3776>[expected:Collection<? extends \ub83f\u6c52\u12cb\u3c25\u3776>](Arrays::asList, checkcast:\ub83f\u6c52\u12cb\u3c25\u3776[](\u51b2\u6fb0\ufcaf\u61a4\u0800.\uc7fe\ua61f\ub18d\u64ab\u4f4a.\ub83f\u6c52\u12cb\u3c25\u3776[].class, invokevirtual:\ub83f\u6c52\u12cb\u3c25\u3776[](\u8389\u494c\u527a\u8753\ub1b9\u8640<\ub83f\u6c52\u12cb\u3c25\u3776[]>::\u4d85\uff55\uc3e3\ud4fe\u9937\uc229, getstatic:\u1833\ud171\u8350\ubded\u34df\uc9f6<\ub83f\u6c52\u12cb\u3c25\u3776[]>[expected:\u8389\u494c\u527a\u8753\ub1b9\u8640<\ub83f\u6c52\u12cb\u3c25\u3776[]>](\u1833\ud171\u8350\ubded\u34df\uc9f6::\u760c\ucfaf\ub19c\u446c\u7873\u97b7), p0:ByteBuf))))
            
            if (cmpgt:boolean(invokevirtual:int(ByteBuf::readableBytes, p0:ByteBuf), ldc:int(0))) {
                var_13_18A = checkcast:byte[](byte[].class, invokevirtual:byte[](\u8389\u494c\u527a\u8753\ub1b9\u8640<byte[]>::\u4d85\uff55\uc3e3\ud4fe\u9937\uc229, getstatic:\u1833\ud171\u8350\ubded\u34df\uc9f6<byte[]>[expected:\u8389\u494c\u527a\u8753\ub1b9\u8640<byte[]>](\u1833\ud171\u8350\ubded\u34df\uc9f6::\u3bc9\u6bb9\u8709\uc3e3\u34df\ud158), p0:ByteBuf))
                
                if (invokevirtual:boolean(\uc29a\u7043\u3d4b\u93a2\uceb8\u7d52::\uc229\u3e2a\u76bc\ubb2b\ud523\u6435, invokestatic:\uc29a\u7043\u3d4b\u93a2\uceb8\u7d52(\u183a\u71ae\ubf56\u6d69\u4e72\u3d4b::\u3776\uf9c5\u3d4b\u72f1\u647c\ubf56))) {
                    invokevirtual:void(Logger::warning, invokeinterface:Logger(\u0b8e\u12cb\ud523\u8308\u6fb0\u4ab3::\u8709\u839e\uafe7\ua61f\u71ae\ud158, invokestatic:\u0b8e\u12cb\ud523\u8308\u6fb0\u4ab3(\u183a\u71ae\ubf56\u6d69\u4e72\u3d4b::\u836c\u527a\u76bc\u4492\u72f1\u98a4)), invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u5654\u67e9\u9a18\u71f1\u385b\u4c2b::\u8753\u960f\u51fa\u7bad\u385b\uc9f6), and:int(ldc:int(23684), ldc:int(-23685)))), arraylength:int(var_13_18A:byte[])), loadelement:String(getstatic:String[](\u5654\u67e9\u9a18\u71f1\u385b\u4c2b::\u8753\u960f\u51fa\u7bad\u385b\uc9f6), and:int(ldc:int(8241), ldc:int(16899)))), var_4_64:int), loadelement:String(getstatic:String[](\u5654\u67e9\u9a18\u71f1\u385b\u4c2b::\u8753\u960f\u51fa\u7bad\u385b\uc9f6), and:int(ldc:int(4154), ldc:int(10758)))), var_5_6A:int)))
                }
            }
            
            return:\ud12e\ub18d\ud158\ud36e\ub8be\u56bd(initobject:\u927d\ua3b4\u7330\u8df4\u99f7\u0a06(\u927d\ua3b4\u7330\u8df4\u99f7\u0a06::<init>, var_4_64:int, var_5_6A:int, var_6_70:boolean, var_7_76:boolean, var_8_7F:int, var_11_BC:\u4975\u1833\u446c\u5bc4\ubded\u4f4a[], var_10_A8:int[], var_9_8B:\ub83f\u6c52\u12cb\u3c25\u3776, var_12_118:ArrayList<\ub83f\u6c52\u12cb\u3c25\u3776>[expected:List<\ub83f\u6c52\u12cb\u3c25\u3776>]))
        }
        
        goto(Label_0006)
    }
    
    public void \ud171\uc229\ufe34\u36d3\u5f50\uc2e8(io.netty.buffer.ByteBuf p0, \u71f1\uc910\u3bc9\u516c\u93a2.\ud12e\ub18d\ud158\ud36e\ub8be\u56bd p1) {
        var_3_6FC : int
        var_5_3F2 : int[]
        var_6_3F7 : int
        var_7_400 : int
        var_3_42B : int
        var_8_431 : int
        var_5_470 : ByteBuf
        var_6_47F : int
        var_7_574 : \u4975\u1833\u446c\u5bc4\ubded\u4f4a
        var_3_712 : int
        
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
            var_3_6FC = and:int(ldc:int(1689549698), ldc:int(-268732495))
            
            loop {
                if (cmpeq:boolean(and:int(var_3_6FC:int, ldc:int(8388608)), ldc:int(0))) {
                    goto(Label_0906)
                }
                
                if (cmpne:boolean(and:int(var_3_6FC:int, ldc:int(4)), ldc:int(0))) {
                    goto(Label_0817)
                }
                
                if (cmpne:boolean(and:int(var_3_6FC:int, ldc:int(16)), ldc:int(0))) {
                    var_3_6FC = and:int(var_3_6FC:int, ldc:int(73462499))
                    goto(Label_0708)
                }
                
                if (cmpne:boolean(and:int(var_3_6FC:int, ldc:int(131072)), ldc:int(0))) {
                    goto(Label_0610)
                }
                
                if (cmpeq:boolean(and:int(var_3_6FC:int, ldc:int(2147483647)), ldc:int(0))) {
                    goto(Label_0504)
                }
                
                if (cmpeq:boolean(and:int(var_3_6FC:int, ldc:int(1073741824)), ldc:int(0))) {
                    var_3_6FC = and:int(var_3_6FC:int, ldc:int(1166234938))
                    goto(Label_0376)
                }
                
                if (cmpne:boolean(and:int(var_3_6FC:int, ldc:int(64)), ldc:int(0))) {
                    goto(Label_0280)
                }
                
                if (cmpne:boolean(and:int(var_3_6FC:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_3_6FC = and:int(var_3_6FC:int, ldc:int(-290352296))
                    invokevirtual:ByteBuf(ByteBuf::writeInt, p0:ByteBuf, invokeinterface:int(\ud12e\ub18d\ud158\ud36e\ub8be\u56bd::\u718f\u64ab\uc9f6\uc246\u7006\ubff1, p1:\ud12e\ub18d\ud158\ud36e\ub8be\u56bd))
                }
                
                Label_0184:
                
                if (cmpne:boolean(and:int(var_3_6FC:int, ldc:int(524288)), ldc:int(0))) {
                    var_3_6FC = and:int(var_3_6FC:int, ldc:int(1467618006))
                    goto(Label_0906)
                }
                
                if (cmpne:boolean(and:int(var_3_6FC:int, ldc:int(1)), ldc:int(0))) {
                    goto(Label_0817)
                }
                
                if (cmpne:boolean(and:int(var_3_6FC:int, ldc:int(4)), ldc:int(0))) {
                    var_3_6FC = and:int(var_3_6FC:int, ldc:int(-614300312))
                    goto(Label_0708)
                }
                
                if (cmpne:boolean(and:int(var_3_6FC:int, ldc:int(4)), ldc:int(0))) {
                    var_3_6FC = and:int(var_3_6FC:int, ldc:int(635885555))
                    goto(Label_0610)
                }
                
                if (cmpeq:boolean(and:int(var_3_6FC:int, ldc:int(4096)), ldc:int(0))) {
                    goto(Label_0504)
                }
                
                if (cmpne:boolean(and:int(var_3_6FC:int, ldc:int(524288)), ldc:int(0))) {
                    goto(Label_0376)
                }
                
                if (cmpne:boolean(and:int(var_3_6FC:int, ldc:int(536870912)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_3_6FC:int, ldc:int(2147483647)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_6FC = and:int(var_3_6FC:int, ldc:int(-457354448))
                    invokevirtual:ByteBuf(ByteBuf::writeInt, p0:ByteBuf, invokeinterface:int(\ud12e\ub18d\ud158\ud36e\ub8be\u56bd::\u5140\u946b\u8709\u8413\u4f4a\ub18d, p1:\ud12e\ub18d\ud158\ud36e\ub8be\u56bd))
                }
                
                Label_0280:
                
                if (cmpne:boolean(and:int(var_3_6FC:int, ldc:int(4)), ldc:int(0))) {
                    goto(Label_0906)
                }
                
                if (cmpeq:boolean(and:int(var_3_6FC:int, ldc:int(512)), ldc:int(0))) {
                    goto(Label_0817)
                }
                
                if (cmpeq:boolean(and:int(var_3_6FC:int, ldc:int(1048576)), ldc:int(0))) {
                    var_3_6FC = and:int(var_3_6FC:int, ldc:int(-1940363914))
                    goto(Label_0708)
                }
                
                if (cmpeq:boolean(and:int(var_3_6FC:int, ldc:int(536870912)), ldc:int(0))) {
                    goto(Label_0610)
                }
                
                if (cmpne:boolean(and:int(var_3_6FC:int, ldc:int(32)), ldc:int(0))) {
                    goto(Label_0504)
                }
                
                if (cmpne:boolean(and:int(var_3_6FC:int, ldc:int(131072)), ldc:int(0))) {
                    var_3_6FC = and:int(var_3_6FC:int, ldc:int(1566360946))
                }
                else {
                    if (cmpeq:boolean(and:int(var_3_6FC:int, ldc:int(256)), ldc:int(0))) {
                        var_3_6FC = and:int(var_3_6FC:int, ldc:int(-608770335))
                        goto(Label_0184)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6FC:int, ldc:int(8388608)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_6FC = and:int(var_3_6FC:int, ldc:int(1672929195))
                    invokevirtual:ByteBuf(ByteBuf::writeBoolean, p0:ByteBuf, invokeinterface:boolean(\ud12e\ub18d\ud158\ud36e\ub8be\u56bd::\u52d3\u4e72\u36d3\u56bd\u0b8e\ud4fe, p1:\ud12e\ub18d\ud158\ud36e\ub8be\u56bd))
                }
                
                Label_0376:
                
                if (cmpne:boolean(and:int(var_3_6FC:int, ldc:int(131072)), ldc:int(0))) {
                    var_3_6FC = and:int(var_3_6FC:int, ldc:int(1786709390))
                    goto(Label_0906)
                }
                
                if (cmpne:boolean(and:int(var_3_6FC:int, ldc:int(16)), ldc:int(0))) {
                    var_3_6FC = and:int(var_3_6FC:int, ldc:int(916684295))
                    goto(Label_0817)
                }
                
                if (cmpeq:boolean(and:int(var_3_6FC:int, ldc:int(8388608)), ldc:int(0))) {
                    var_3_6FC = and:int(var_3_6FC:int, ldc:int(-969167753))
                    goto(Label_0708)
                }
                
                if (cmpne:boolean(and:int(var_3_6FC:int, ldc:int(1)), ldc:int(0))) {
                    goto(Label_0610)
                }
                
                if (cmpne:boolean(and:int(var_3_6FC:int, ldc:int(64)), ldc:int(0))) {
                    var_3_6FC = and:int(var_3_6FC:int, ldc:int(1559544949))
                }
                else {
                    if (cmpeq:boolean(and:int(var_3_6FC:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_6FC = and:int(var_3_6FC:int, ldc:int(186116274))
                        goto(Label_0280)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6FC:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_6FC = and:int(var_3_6FC:int, ldc:int(1893984486))
                        goto(Label_0184)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6FC:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_6FC = and:int(var_3_6FC:int, ldc:int(-24632123))
                        loopcontinue()
                    }
                    
                    var_3_6FC = and:int(var_3_6FC:int, ldc:int(2096193491))
                    invokevirtual:ByteBuf(ByteBuf::writeBoolean, p0:ByteBuf, invokeinterface:boolean(\ud12e\ub18d\ud158\ud36e\ub8be\u56bd::\u5140\ube23\u8709\u4c04\uae87\ub70c, p1:\ud12e\ub18d\ud158\ud36e\ub8be\u56bd))
                }
                
                Label_0504:
                
                if (cmpne:boolean(and:int(var_3_6FC:int, ldc:int(524288)), ldc:int(0))) {
                    var_3_6FC = and:int(var_3_6FC:int, ldc:int(652722800))
                    goto(Label_0906)
                }
                
                if (cmpeq:boolean(and:int(var_3_6FC:int, ldc:int(1073741824)), ldc:int(0))) {
                    var_3_6FC = and:int(var_3_6FC:int, ldc:int(-13095224))
                    goto(Label_0817)
                }
                
                if (cmpne:boolean(and:int(var_3_6FC:int, ldc:int(1)), ldc:int(0))) {
                    var_3_6FC = and:int(var_3_6FC:int, ldc:int(1777343578))
                    goto(Label_0708)
                }
                
                if (cmpeq:boolean(and:int(var_3_6FC:int, ldc:int(524288)), ldc:int(0))) {
                    if (cmpne:boolean(and:int(var_3_6FC:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0376)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6FC:int, ldc:int(64)), ldc:int(0))) {
                        var_3_6FC = and:int(var_3_6FC:int, ldc:int(-851962353))
                        goto(Label_0280)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6FC:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0184)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6FC:int, ldc:int(268435456)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_6FC = and:int(var_3_6FC:int, ldc:int(2023693304))
                    invokevirtual:void(\uceb8\u4c2b\ub8be\u7049\u8308\u3a62::\u0c95\u6435\u3504\u36d3\u2dcc\u16f6, getstatic:\uceb8\u4c2b\ub8be\u7049\u8308\u3a62(\u1833\ud171\u8350\ubded\u34df\uc9f6::\ud523\u62da\u6c52\u7043\ud217\u72f1), p0:ByteBuf, invokeinterface:int(\ud12e\ub18d\ud158\ud36e\ub8be\u56bd::\u624e\u3d4b\u16f6\u416d\ub1b9\u36d3, p1:\ud12e\ub18d\ud158\ud36e\ub8be\u56bd))
                }
                
                Label_0610:
                
                if (cmpne:boolean(and:int(var_3_6FC:int, ldc:int(16)), ldc:int(0))) {
                    var_3_6FC = and:int(var_3_6FC:int, ldc:int(1007096886))
                    goto(Label_0906)
                }
                
                if (cmpeq:boolean(and:int(var_3_6FC:int, ldc:int(536870912)), ldc:int(0))) {
                    goto(Label_0817)
                }
                
                if (cmpne:boolean(and:int(var_3_6FC:int, ldc:int(536870912)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_3_6FC:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0504)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6FC:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_6FC = and:int(var_3_6FC:int, ldc:int(281543292))
                        goto(Label_0376)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6FC:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0280)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6FC:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0184)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6FC:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_6FC = and:int(var_3_6FC:int, ldc:int(-1585627176))
                        loopcontinue()
                    }
                    
                    var_3_6FC = and:int(var_3_6FC:int, ldc:int(-285714680))
                    invokevirtual:void(\ua3b4\ub1b9\u9af2\u3d64\uf94d\u3dd3<\ub83f\u6c52\u12cb\u3c25\u3776>::\ud171\uc229\ufe34\u36d3\u5f50\uc2e8, getstatic:\u1833\ud171\u8350\ubded\u34df\uc9f6<\ub83f\u6c52\u12cb\u3c25\u3776>[expected:\ua3b4\ub1b9\u9af2\u3d64\uf94d\u3dd3<\ub83f\u6c52\u12cb\u3c25\u3776>](\u1833\ud171\u8350\ubded\u34df\uc9f6::\u3bc9\u5fe1\u4ab3\ub70c\u600f\u6fb0), p0:ByteBuf, invokeinterface:\ub83f\u6c52\u12cb\u3c25\u3776(\ud12e\ub18d\ud158\ud36e\ub8be\u56bd::\u7bad\u64ab\uc87f\uc84e\u34df\u0800, p1:\ud12e\ub18d\ud158\ud36e\ub8be\u56bd))
                }
                
                Label_0708:
                
                if (cmpne:boolean(and:int(var_3_6FC:int, ldc:int(8)), ldc:int(0))) {
                    goto(Label_0906)
                }
                
                if (cmpeq:boolean(and:int(var_3_6FC:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_3_6FC = and:int(var_3_6FC:int, ldc:int(-1305940040))
                }
                else {
                    if (cmpne:boolean(and:int(var_3_6FC:int, ldc:int(4)), ldc:int(0))) {
                        var_3_6FC = and:int(var_3_6FC:int, ldc:int(479132710))
                        goto(Label_0610)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6FC:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_6FC = and:int(var_3_6FC:int, ldc:int(1618385755))
                        goto(Label_0504)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6FC:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0376)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6FC:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0280)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6FC:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0184)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6FC:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_6FC = and:int(var_3_6FC:int, ldc:int(-2028683570))
                        loopcontinue()
                    }
                    
                    var_3_6FC = and:int(var_3_6FC:int, ldc:int(-338128105))
                    
                    if (logicalnot:boolean(invokeinterface:boolean(\ud12e\ub18d\ud158\ud36e\ub8be\u56bd::\u6cfe\uc2bd\ud36e\u071d\u7049\u9937, p1:\ud12e\ub18d\ud158\ud36e\ub8be\u56bd))) {
                        looporswitchbreak()
                    }
                }
                
                Label_0817:
                
                if (cmpeq:boolean(and:int(var_3_6FC:int, ldc:int(33554432)), ldc:int(0))) {
                    if (cmpne:boolean(and:int(var_3_6FC:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0708)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6FC:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0610)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6FC:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_6FC = and:int(var_3_6FC:int, ldc:int(-1695186666))
                        goto(Label_0504)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6FC:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6FC = and:int(var_3_6FC:int, ldc:int(1101163301))
                        goto(Label_0376)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6FC:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_6FC = and:int(var_3_6FC:int, ldc:int(-1644085083))
                        goto(Label_0280)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6FC:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0184)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6FC:int, ldc:int(16)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_6FC = and:int(var_3_6FC:int, ldc:int(2008719294))
                }
                
                Label_0906:
                
                if (cmpne:boolean(and:int(var_3_6FC:int, ldc:int(1)), ldc:int(0))) {
                    goto(Label_0817)
                }
                
                if (cmpeq:boolean(and:int(var_3_6FC:int, ldc:int(2147483647)), ldc:int(0))) {
                    goto(Label_0708)
                }
                
                if (cmpeq:boolean(and:int(var_3_6FC:int, ldc:int(256)), ldc:int(0))) {
                    goto(Label_0610)
                }
                
                if (cmpne:boolean(and:int(var_3_6FC:int, ldc:int(268435456)), ldc:int(0))) {
                    var_3_6FC = and:int(var_3_6FC:int, ldc:int(-78347052))
                    goto(Label_0504)
                }
                
                if (cmpne:boolean(and:int(var_3_6FC:int, ldc:int(131072)), ldc:int(0))) {
                    var_3_6FC = and:int(var_3_6FC:int, ldc:int(366158676))
                    goto(Label_0376)
                }
                
                if (cmpne:boolean(and:int(var_3_6FC:int, ldc:int(64)), ldc:int(0))) {
                    var_3_6FC = and:int(var_3_6FC:int, ldc:int(-1687805800))
                    goto(Label_0280)
                }
                
                if (cmpne:boolean(and:int(var_3_6FC:int, ldc:int(1)), ldc:int(0))) {
                    goto(Label_0184)
                }
                
                if (cmpeq:boolean(and:int(var_3_6FC:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_3_6FC = and:int(var_3_6FC:int, ldc:int(-1475535137))
                }
                else {
                    var_3_6FC = and:int(var_3_6FC:int, ldc:int(1656225723))
                    var_5_3F2 = invokeinterface:int[](\ud12e\ub18d\ud158\ud36e\ub8be\u56bd::\ub6ab\u946b\u4bc8\u12b2\u8389\ub113, p1:\ud12e\ub18d\ud158\ud36e\ub8be\u56bd)
                    var_6_3F7 = arraylength:int(var_5_3F2:int[])
                    var_7_400 = and:int(ldc:int(-11918), ldc:int(11916))
                    
                    loop {
                        if (cmpne:boolean(and:int(var_3_6FC:int, ldc:int(4)), ldc:int(0))) {
                            var_3_6FC = and:int(var_3_6FC:int, ldc:int(782916725))
                        }
                        else {
                            var_3_6FC = and:int(var_3_6FC:int, ldc:int(-527163469))
                            
                            if (cmpge:boolean(var_7_400:int, var_6_3F7:int)) {
                                looporswitchbreak(Label_1127)
                            }
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6FC:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_42B = and:int(var_3_6FC:int, ldc:int(1807374227))
                            var_8_431 = loadelement:int(var_5_3F2:int[], var_7_400:int)
                            
                            do {
                                if (cmpeq:boolean(and:int(var_3_42B:int, ldc:int(8388608)), ldc:int(0))) {
                                    var_3_42B = and:int(var_3_42B:int, ldc:int(-1711471861))
                                }
                                else {
                                    var_3_42B = and:int(var_3_42B:int, ldc:int(1908292358))
                                    invokevirtual:ByteBuf(ByteBuf::writeInt, p0:ByteBuf, var_8_431:int)
                                }
                            } while (cmpeq:boolean(and:int(var_3_42B:int, ldc:int(1048576)), ldc:int(0)))
                            
                            var_3_6FC = and:int(var_3_42B:int, ldc:int(-225316044))
                            inc:int(var_7_400, ldc:int(1))
                        }
                    }
                }
            }
            
            Label_1127:
            var_5_470 = invokeinterface:ByteBuf(ByteBufAllocator::buffer, invokevirtual:ByteBufAllocator(ByteBuf::alloc, p0:ByteBuf))
            
            try {
                var_3_6FC = and:int(var_3_6FC:int, ldc:int(2012741504))
                var_6_47F = and:int(ldc:int(-30584), ldc:int(29554))
                
                loop {
                    if (cmpne:boolean(and:int(var_3_6FC:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1705)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6FC:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_6FC = and:int(var_3_6FC:int, ldc:int(-418254788))
                        goto(Label_1615)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6FC:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1541)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6FC:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1454)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6FC:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1303)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6FC:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_6FC = and:int(var_3_6FC:int, ldc:int(-455673927))
                        
                        if (cmpge:boolean(var_6_47F:int, ldc:int(16))) {
                            invokevirtual:ByteBuf(ByteBuf::readerIndex, var_5_470:ByteBuf, and:int(ldc:int(-7037), ldc:int(6716)))
                            goto(Label_1454)
                        }
                    }
                    
                    Label_1218:
                    
                    if (cmpne:boolean(and:int(var_3_6FC:int, ldc:int(4)), ldc:int(0))) {
                        var_3_6FC = and:int(var_3_6FC:int, ldc:int(-1060627232))
                        goto(Label_1705)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6FC:int, ldc:int(4)), ldc:int(0))) {
                        var_3_6FC = and:int(var_3_6FC:int, ldc:int(-61245294))
                        goto(Label_1615)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6FC:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_6FC = and:int(var_3_6FC:int, ldc:int(-1494145927))
                        goto(Label_1541)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6FC:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1454)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6FC:int, ldc:int(1)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_6FC:int, ldc:int(8)), ldc:int(0))) {
                            var_3_6FC = and:int(var_3_6FC:int, ldc:int(92895188))
                            loopcontinue()
                        }
                        
                        var_3_6FC = and:int(var_3_6FC:int, ldc:int(-269148338))
                    }
                    
                    Label_1303:
                    
                    if (cmpne:boolean(and:int(var_3_6FC:int, ldc:int(4)), ldc:int(0))) {
                        var_3_6FC = and:int(var_3_6FC:int, ldc:int(-2026279665))
                        goto(Label_1705)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6FC:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1615)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6FC:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_6FC = and:int(var_3_6FC:int, ldc:int(-1765301013))
                        goto(Label_1541)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6FC:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_6FC = and:int(var_3_6FC:int, ldc:int(227806914))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6FC:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_6FC = and:int(var_3_6FC:int, ldc:int(-733091244))
                            goto(Label_1218)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6FC:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_6FC = and:int(var_3_6FC:int, ldc:int(2140566447))
                            var_7_574 = loadelement:\u4975\u1833\u446c\u5bc4\ubded\u4f4a(invokeinterface:\u4975\u1833\u446c\u5bc4\ubded\u4f4a[](\ud12e\ub18d\ud158\ud36e\ub8be\u56bd::\u52d3\u5bc4\u3c25\u8cae\ud7e8\u927d, p1:\ud12e\ub18d\ud158\ud36e\ub8be\u56bd), var_6_47F:int)
                            
                            if (cmpne:boolean(var_7_574:\u4975\u1833\u446c\u5bc4\ubded\u4f4a, aconstnull:\u4975\u1833\u446c\u5bc4\ubded\u4f4a())) {
                                invokevirtual:ByteBuf(ByteBuf::writeShort, var_5_470:ByteBuf, invokevirtual:int(\u4975\u1833\u446c\u5bc4\ubded\u4f4a::\u67e9\u5bc4\u5fe1\ub7dc\ud171\u8640, var_7_574:\u4975\u1833\u446c\u5bc4\ubded\u4f4a))
                                invokevirtual:void(\ua3b4\ub1b9\u9af2\u3d64\uf94d\u3dd3<\u4975\u1833\u446c\u5bc4\ubded\u4f4a>::\ud171\uc229\ufe34\u36d3\u5f50\uc2e8, getstatic:\u1833\ud171\u8350\ubded\u34df\uc9f6<\u4975\u1833\u446c\u5bc4\ubded\u4f4a>[expected:\ua3b4\ub1b9\u9af2\u3d64\uf94d\u3dd3<\u4975\u1833\u446c\u5bc4\ubded\u4f4a>](\u3776\uc910\u62da\uc31c\u51fa\u99f7::\u494c\u3c25\u99f7\u61a4\u7d52\u5fe1), var_5_470:ByteBuf, var_7_574:\u4975\u1833\u446c\u5bc4\ubded\u4f4a)
                            }
                            
                            inc:int(var_6_47F, ldc:int(1))
                            loopcontinue()
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1454:
                    
                    if (cmpne:boolean(and:int(var_3_6FC:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_6FC = and:int(var_3_6FC:int, ldc:int(1558549029))
                        goto(Label_1705)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6FC:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_6FC = and:int(var_3_6FC:int, ldc:int(-300397079))
                        goto(Label_1615)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6FC:int, ldc:int(256)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_6FC:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_1303)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6FC:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_1218)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6FC:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_6FC = and:int(var_3_6FC:int, ldc:int(308014399))
                            loopcontinue()
                        }
                        
                        var_3_6FC = and:int(var_3_6FC:int, ldc:int(-55052386))
                        invokevirtual:void(\uceb8\u4c2b\ub8be\u7049\u8308\u3a62::\u0c95\u6435\u3504\u36d3\u2dcc\u16f6, getstatic:\uceb8\u4c2b\ub8be\u7049\u8308\u3a62(\u1833\ud171\u8350\ubded\u34df\uc9f6::\ud523\u62da\u6c52\u7043\ud217\u72f1), p0:ByteBuf, invokevirtual:int(ByteBuf::readableBytes, var_5_470:ByteBuf))
                    }
                    
                    Label_1541:
                    
                    if (cmpne:boolean(and:int(var_3_6FC:int, ldc:int(8)), ldc:int(0))) {
                        var_3_6FC = and:int(var_3_6FC:int, ldc:int(-1688660417))
                        goto(Label_1705)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6FC:int, ldc:int(1)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_6FC:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_1454)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6FC:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_1303)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6FC:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_1218)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6FC:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_6FC = and:int(var_3_6FC:int, ldc:int(371114769))
                            loopcontinue()
                        }
                        
                        var_3_6FC = and:int(var_3_6FC:int, ldc:int(1655741368))
                        invokevirtual:ByteBuf(ByteBuf::writeBytes, p0:ByteBuf, var_5_470:ByteBuf)
                    }
                    
                    Label_1615:
                    
                    if (cmpeq:boolean(and:int(var_3_6FC:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6FC = and:int(var_3_6FC:int, ldc:int(-2026344668))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6FC:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_1541)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6FC:int, ldc:int(1)), ldc:int(0))) {
                            var_3_6FC = and:int(var_3_6FC:int, ldc:int(1816461698))
                            goto(Label_1454)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6FC:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_1303)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6FC:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_6FC = and:int(var_3_6FC:int, ldc:int(-1468324727))
                            goto(Label_1218)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6FC:int, ldc:int(16)), ldc:int(0))) {
                            var_3_6FC = and:int(var_3_6FC:int, ldc:int(406356077))
                            loopcontinue()
                        }
                        
                        var_3_6FC = and:int(var_3_6FC:int, ldc:int(2077905869))
                        invokevirtual:boolean(ByteBuf::release, var_5_470:ByteBuf)
                    }
                    
                    Label_1705:
                    
                    if (cmpne:boolean(and:int(var_3_6FC:int, ldc:int(16)), ldc:int(0))) {
                        var_3_6FC = and:int(var_3_6FC:int, ldc:int(717414659))
                        goto(Label_1615)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6FC:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1541)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6FC:int, ldc:int(4)), ldc:int(0))) {
                        var_3_6FC = and:int(var_3_6FC:int, ldc:int(449998997))
                        goto(Label_1454)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6FC:int, ldc:int(64)), ldc:int(0))) {
                        var_3_6FC = and:int(var_3_6FC:int, ldc:int(-63985130))
                        goto(Label_1303)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6FC:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1218)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6FC:int, ldc:int(1048576)), ldc:int(0))) {
                        looporswitchbreak()
                    }
                    
                    var_3_6FC = and:int(var_3_6FC:int, ldc:int(1431308486))
                }
                
                var_3_6FC = and:int(var_3_6FC:int, ldc:int(-7102544))
            }
            finally {
                loop {
                    if (cmpne:boolean(and:int(var_3_6FC:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_712 = and:int(var_3_6FC:int, ldc:int(132614496))
                    }
                    else {
                        var_3_712 = and:int(var_3_6FC:int, ldc:int(-201712800))
                        invokevirtual:boolean(ByteBuf::release, var_5_470:ByteBuf)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_712:int, ldc:int(8)), ldc:int(0))) {
                        looporswitchbreak()
                    }
                    
                    var_3_6FC = and:int(var_3_712:int, ldc:int(789736824))
                }
            }
            
            invokevirtual:void(\ua3b4\ub1b9\u9af2\u3d64\uf94d\u3dd3<\ub83f\u6c52\u12cb\u3c25\u3776[]>::\ud171\uc229\ufe34\u36d3\u5f50\uc2e8, getstatic:\u1833\ud171\u8350\ubded\u34df\uc9f6<\ub83f\u6c52\u12cb\u3c25\u3776[]>[expected:\ua3b4\ub1b9\u9af2\u3d64\uf94d\u3dd3<\ub83f\u6c52\u12cb\u3c25\u3776[]>](\u1833\ud171\u8350\ubded\u34df\uc9f6::\u760c\ucfaf\ub19c\u446c\u7873\u97b7), p0:ByteBuf, invokeinterface:\ub83f\u6c52\u12cb\u3c25\u3776[](List<\ub83f\u6c52\u12cb\u3c25\u3776>::toArray, invokeinterface:List<\ub83f\u6c52\u12cb\u3c25\u3776>(\ud12e\ub18d\ud158\ud36e\ub8be\u56bd::\u6ec6\ub83f\ud217\uc229\u74b1\ub32d, p1:\ud12e\ub18d\ud158\ud36e\ub8be\u56bd), getstatic:\ub83f\u6c52\u12cb\u3c25\u3776[](\u5654\u67e9\u9a18\u71f1\u385b\u4c2b::\u2dcc\u6b0d\u7bad\uae87\u759a\ufcaf)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public java.lang.Class<? extends \u3bd6\u6b0d\ubff1\u8aa5\u4f4a.\u1833\ud171\u8350\ubded\u34df\uc9f6> \u4d85\u4179\u92ff\u4d85\u3c25\u8d90() {
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
            return:Class<? extends \u1833\ud171\u8350\ubded\u34df\uc9f6>(ldc:Class<\ua068\u600f\ud523\ub8be\uae87\u5db4>(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\ua068\u600f\ud523\ub8be\uae87\u5db4.class))
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
            return:Object(invokevirtual:\ud12e\ub18d\ud158\ud36e\ub8be\u56bd[expected:Object](\u5654\u67e9\u9a18\u71f1\u385b\u4c2b::\u4d85\uff55\uc3e3\ud4fe\u9937\uc229, this:\u5654\u67e9\u9a18\u71f1\u385b\u4c2b, p0:ByteBuf))
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
            invokevirtual:void(\u5654\u67e9\u9a18\u71f1\u385b\u4c2b::\ud171\uc229\ufe34\u36d3\u5f50\uc2e8, this:\u5654\u67e9\u9a18\u71f1\u385b\u4c2b, p0:ByteBuf, checkcast:\ud12e\ub18d\ud158\ud36e\ub8be\u56bd(\u71f1\uc910\u3bc9\u516c\u93a2.\ud12e\ub18d\ud158\ud36e\ub8be\u56bd.class, p1:Object[expected:\ud12e\ub18d\ud158\ud36e\ub8be\u56bd]))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_179 : int
        expr_6E : int [generated]
        stack_94_0 : byte[] [generated]
        stack_96_0 : byte[] [generated]
        stack_B2_0 : byte[] [generated]
        stack_B4_0 : byte[] [generated]
        stack_DB_0 : byte[] [generated]
        stack_18C_0 : byte[] [generated]
        stack_208_0 : byte[] [generated]
        stack_25F_0 : byte[] [generated]
        var_4_164 : int
        var_3_169 : byte[]
        var_5_16A : int
        var_0_182 : int
        expr_18C : byte [generated]
        stack_1CB_2 : byte [generated]
        stack_1A8_0 : byte [generated]
        expr_208 : byte [generated]
        expr_96 : int [generated]
        var_2_B2 : byte[]
        expr_B6 : int [generated]
        var_3_24D : byte[]
        var_5_24E : int
        var_3_E7 : String
        stack_150_0 : String[] [generated]
        expr_F9 : String[] [generated]
        
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
        var_0_179 = and:int(ldc:int(39639953), ldc:int(-1612844643))
        expr_6E = arraylength:int(stack_94_0 = stack_96_0 = stack_B2_0 = stack_B4_0 = stack_DB_0 = stack_18C_0 = stack_208_0 = stack_25F_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("MP7JD/AzBAXH7BFKD7f49D0AEP0EANDsBkMX87zpAj8PBgT7vukKRtT8/TQD9b7Ex2s7MOL41N7sIQU=")))
        
        if (cmpeq:boolean(expr_6E:int, ldc:int(0))) {
            goto(Label_0115)
        }
        
        var_4_164 = expr_6E:int
        var_3_169 = newarray:byte[](byte.class, expr_6E:int)
        var_5_16A = expr_6E:int
        Label_0364:
        
        while (cmpne:boolean(and:int(var_0_179:int, ldc:int(262144)), ldc:int(0))) {
            var_0_182 = and:int(var_0_179:int, ldc:int(-2106664527))
            var_5_16A = add:int(var_5_16A:int, ldc:int(-1))
            expr_18C = stack_1CB_2 = loadelement(stack_18C_0, var_5_16A)
            
            if (cmplt:boolean(add:int(add:int(var_5_16A:int, ldc:int(3)), neg:int(var_4_164:int)), ldc:int(0))) {
                stack_1CB_2 = stack_1A8_0 = add:byte(expr_18C:byte, loadelement:byte(var_3_169:byte[], add:int(var_5_16A:int, ldc:int(3))))
                goto(Label_0440)
            }
            
            Label_0409:
            
            if (cmpne:boolean(and:int(var_0_182:int, ldc:int(4096)), ldc:int(0))) {
                var_0_182 = and:int(var_0_182:int, ldc:int(-2016545871))
                stack_1CB_2 = stack_1A8_0 = add:byte(expr_18C:byte, ldc:byte(3))
            }
            
            Label_0440:
            
            if (cmpeq:boolean(and:int(var_0_182:int, ldc:int(32768)), ldc:int(0))) {
                goto(Label_0409)
            }
            
            var_0_179 = and:int(var_0_182:int, ldc:int(872347097))
            storeelement:byte(var_3_169:byte[], var_5_16A:int, stack_1CB_2:byte)
            
            if (cmpne:boolean(var_5_16A:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_96_0 = stack_94_0 = stack_B2_0 = stack_B4_0 = stack_DB_0 = stack_18C_0 = stack_208_0 = stack_25F_0 = var_3_169:byte[]
            goto(Label_0115)
        }
        
        var_0_179 = and:int(var_0_179:int, ldc:int(1220143716))
        Label_0497:
        
        while (cmpeq:boolean(and:int(var_0_179:int, ldc:int(16777216)), ldc:int(0))) {
            var_0_179 = and:int(var_0_179:int, ldc:int(-1949499725))
            var_5_16A = add:int(var_5_16A:int, ldc:int(-1))
            expr_208 = loadelement:byte(stack_208_0:byte[], var_5_16A:int)
            storeelement:byte(var_3_169:byte[], var_5_16A:int, add:int(xor:int(or:int(and:int(shl:int(expr_208:byte, and:int(ldc:int(10341), ldc:int(1412))), ldc:int(-16)), and:int(shr:int(expr_208:byte[expected:int], and:int(ldc:int(10596), ldc:int(4612))), ldc:int(15))), ldc:int(76)), ldc:int(52)))
            
            if (cmpne:boolean(var_5_16A:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_96_0 = stack_94_0 = stack_B2_0 = stack_B4_0 = stack_DB_0 = stack_18C_0 = stack_208_0 = stack_25F_0 = var_3_169:byte[]
            goto(Label_0155)
        }
        
        goto(Label_0364)
        Label_0115:
        
        if (cmpne:boolean(and:int(var_0_179:int, ldc:int(8)), ldc:int(0))) {
            goto(Label_0187)
        }
        
        if (cmpeq:boolean(and:int(var_0_179:int, ldc:int(4194304)), ldc:int(0))) {
            var_0_179 = and:int(var_0_179:int, ldc:int(-1504417992))
        }
        else {
            var_0_179 = and:int(var_0_179:int, ldc:int(509533183))
            expr_96 = arraylength:int(stack_96_0:byte[])
            
            if (cmpne:boolean(expr_96:int, ldc:int(0))) {
                var_4_164 = expr_96:int
                var_3_169 = newarray:byte[](byte.class, expr_96:int)
                var_5_16A = expr_96:int
                goto(Label_0497)
            }
        }
        
        Label_0155:
        
        if (cmpne:boolean(and:int(var_0_179:int, ldc:int(262144)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_179:int, ldc:int(4096)), ldc:int(0))) {
                goto(Label_0115)
            }
            
            var_0_179 = and:int(var_0_179:int, ldc:int(122478037))
            var_2_B2 = stack_B2_0:byte[]
            expr_B6 = add:int(arraylength:int(stack_B4_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_B6:int, ldc:int(0))) {
                var_3_24D = newarray:byte[](byte.class, expr_B6:int)
                var_5_24E = expr_B6:int
                
                loop {
                    var_0_179 = and:int(var_0_179:int, ldc:int(108843923))
                    var_5_24E = add:int(var_5_24E:int, ldc:int(-1))
                    storeelement:byte(var_3_24D:byte[], var_5_24E:int, add:int(shl:int(loadelement:byte(stack_25F_0:byte[], var_5_24E:int), ldc:int(4)), and:int(shr:int(loadelement:byte(var_2_B2:byte[], add:int(var_5_24E:int, xor:int(ldc:int(18562), ldc:int(18563)))), ldc:int(4)), xor:int(ldc:int(1283), ldc:int(1292)))))
                    
                    if (cmpne:boolean(var_5_24E:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_96_0 = stack_94_0 = stack_B2_0 = stack_B4_0 = stack_DB_0 = stack_18C_0 = stack_208_0 = stack_25F_0 = var_3_24D:byte[]
            }
        }
        
        Label_0187:
        
        if (cmpeq:boolean(and:int(var_0_179:int, ldc:int(4194304)), ldc:int(0))) {
            goto(Label_0155)
        }
        
        if (cmpne:boolean(and:int(var_0_179:int, ldc:int(67108864)), ldc:int(0))) {
            var_0_179 = and:int(var_0_179:int, ldc:int(-495394498))
            goto(Label_0115)
        }
        
        var_3_E7 = initobject:String(String::<init>, stack_DB_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
        stack_150_0 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(6931), ldc:int(195)))
        expr_F9 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(20483), ldc:int(2027)))
        storeelement:String(expr_F9:String[], xor:int(ldc:int(10240), ldc:int(10241)), invokevirtual:String[expected:String](String::substring, var_3_E7:String, and:int(ldc:int(3601), ldc:int(-3602)), and:int(ldc:int(63), ldc:int(16947))))
        storeelement:String(expr_F9:String[], xor:int(ldc:int(2128), ldc:int(2130)), invokevirtual:String[expected:String](String::substring, var_3_E7:String, xor:int(ldc:int(16), ldc:int(35)), and:int(ldc:int(2228), ldc:int(895))))
        storeelement:String(expr_F9:String[], and:int(ldc:int(-12273), ldc:int(3536)), invokevirtual:String[expected:String](String::substring, var_3_E7:String, xor:int(ldc:int(18550), ldc:int(18498)), xor:int(ldc:int(-32741), ldc:int(-32735))))
        putstatic:String[](\u5654\u67e9\u9a18\u71f1\u385b\u4c2b::\u8753\u960f\u51fa\u7bad\u385b\uc9f6, expr_F9:String[])
        putstatic:\ub83f\u6c52\u12cb\u3c25\u3776[](\u5654\u67e9\u9a18\u71f1\u385b\u4c2b::\u2dcc\u6b0d\u7bad\uae87\u759a\ufcaf, newarray:\ub83f\u6c52\u12cb\u3c25\u3776[](\u51b2\u6fb0\ufcaf\u61a4\u0800.\uc7fe\ua61f\ub18d\u64ab\u4f4a.\ub83f\u6c52\u12cb\u3c25\u3776.class, and:int(ldc:int(-17110), ldc:int(17109))))
    }
    
    public void \u8cae\u5f50\u3e75\uceb8\u873d\ua3b4(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_669 : int
        var_5_89 : int
        var_6_90 : int
        var_7_9F : double
        var_9_CF : double
        var_3_E1 : int
        var_11_F2 : int
        var_14_11C : double
        var_16_120 : int
        var_12_118 : double
        var_17_674 : int
        
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
        var_3_669 = and:int(ldc:int(743524269), ldc:int(-554345291))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u5654\u67e9\u9a18\u71f1\u385b\u4c2b[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0179)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_669:int, ldc:int(131072)), ldc:int(0))) {
            var_3_669 = and:int(var_3_669:int, ldc:int(-1244804004))
        }
        else {
            var_3_669 = and:int(var_3_669:int, ldc:int(-621029425))
            var_5_89 = and:int(ldc:int(-24261), ldc:int(24196))
            var_6_90 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9F = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(24897), ldc:int(-24898)))
            invokestatic:int(m::a)
            
            loop {
                var_9_CF = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_E1 = and:int(var_3_669:int, ldc:int(164998781))
                    var_9_CF = sub:double(var_7_9F:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_F2 = var_5_89:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_F2:int, sub:int(var_6_90:int, xor:int(ldc:int(-28672), ldc:int(-28671)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_F2:int, xor:int(ldc:int(24768), ldc:int(24769)))), var_7_9F:double))) {
                        inc:int(var_11_F2, ldc:int(1))
                    }
                    
                    var_3_669 = and:int(var_3_E1:int, ldc:int(-545453051))
                    var_14_11C = var_7_9F:double
                    var_16_120 = var_11_F2:int
                }
                else {
                    var_11_F2 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_89:int), and:int(ldc:int(2055), ldc:int(16417)))
                    var_12_118 = var_14_11C = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_89)
                    
                    if (cmplt:boolean(var_16_120 = var_11_F2:int, var_6_90:int)) {
                        var_9_CF = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_F2:int)
                        var_16_120 = var_11_F2:int
                        var_14_11C = var_12_118:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(64)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(706711378))
                        goto(Label_1542)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(-1900718468))
                        goto(Label_1408)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(64)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(-99071987))
                        goto(Label_1267)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1139)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0985)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(-745235905))
                        goto(Label_0848)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0721)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0581)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(1218137965))
                        
                        if (cmplt:boolean(var_16_120:int, var_6_90:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0581)
                            }
                            
                            goto(Label_0848)
                        }
                    }
                    
                    Label_0411:
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(1342743185))
                        goto(Label_1542)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(207536019))
                        goto(Label_1408)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(-1399433115))
                        goto(Label_1267)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1139)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0985)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(4)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(-638188142))
                        goto(Label_0848)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0721)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(1024)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_669 = and:int(var_3_669:int, ldc:int(-1644677627))
                            loopcontinue()
                        }
                        
                        var_3_669 = and:int(var_3_669:int, ldc:int(-318933563))
                        var_11_F2 = and:int(ldc:int(17179), ldc:int(-25372))
                        goto(Label_1531)
                    }
                    
                    Label_0581:
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1542)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(2695305))
                        goto(Label_1408)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(-905463327))
                        goto(Label_1267)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1139)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(-1370818873))
                        goto(Label_0985)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(-1332469985))
                        goto(Label_0848)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(134217728)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(4)), ldc:int(0))) {
                            var_3_669 = and:int(var_3_669:int, ldc:int(556724663))
                            goto(Label_0411)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_669:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_669 = and:int(var_3_669:int, ldc:int(-786146337))
                            loopcontinue()
                        }
                        
                        var_3_669 = and:int(var_3_669:int, ldc:int(-1074035268))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_11C = var_9_CF:double
                            goto(Label_0848)
                        }
                    }
                    
                    Label_0721:
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1542)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1408)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(1705152823))
                        goto(Label_1267)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1139)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(1941963048))
                        goto(Label_0985)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(-1463370460))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_669:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0581)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_669:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_669 = and:int(var_3_669:int, ldc:int(-948873102))
                            goto(Label_0411)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_669:int, ldc:int(524288)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_669 = and:int(var_3_669:int, ldc:int(-1651376276))
                        var_14_11C = mul:double(ldc:double(0.5), add:double(var_9_CF:double, var_14_11C:double))
                    }
                    
                    Label_0848:
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(-634351398))
                        goto(Label_1542)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(-1025506659))
                        goto(Label_1408)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(176692969))
                        goto(Label_1267)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1139)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(16777216)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_669 = and:int(var_3_669:int, ldc:int(1291539326))
                            goto(Label_0721)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_669:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_669 = and:int(var_3_669:int, ldc:int(-746932034))
                            goto(Label_0581)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_669:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_669 = and:int(var_3_669:int, ldc:int(458388187))
                            goto(Label_0411)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_669:int, ldc:int(262144)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_669 = and:int(var_3_669:int, ldc:int(-306489612))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_89:int), var_7_9F:double)) {
                                var_11_F2 = xor:int(ldc:int(1025), ldc:int(1024))
                                goto(Label_1139)
                            }
                        }
                    }
                    
                    Label_0985:
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(1641329070))
                        goto(Label_1542)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1408)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(1897003170))
                        goto(Label_1267)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(524288)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_669:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0848)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0721)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_669:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_669 = and:int(var_3_669:int, ldc:int(-535040188))
                            goto(Label_0581)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_669:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0411)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_669:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_669 = and:int(var_3_669:int, ldc:int(352664207))
                            loopcontinue()
                        }
                        
                        var_3_669 = and:int(var_3_669:int, ldc:int(-1191360649))
                        var_11_F2 = and:int(ldc:int(-18627), ldc:int(18626))
                    }
                    
                    Label_1139:
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1542)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1408)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(1750543682))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_669:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_669 = and:int(var_3_669:int, ldc:int(-949314562))
                            goto(Label_0985)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_669 = and:int(var_3_669:int, ldc:int(121674777))
                            goto(Label_0848)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_669:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0721)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_669 = and:int(var_3_669:int, ldc:int(1328240131))
                            goto(Label_0581)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_669 = and:int(var_3_669:int, ldc:int(140339828))
                            goto(Label_0411)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(4)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_669 = and:int(var_3_669:int, ldc:int(-1674449691))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_F2:int, ldc:int(0))) {
                                goto(Label_1408)
                            }
                        }
                    }
                    
                    Label_1267:
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1542)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(33554432)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_669:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_1139)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_669:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_669 = and:int(var_3_669:int, ldc:int(2086199391))
                            goto(Label_0985)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_669:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0848)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_669:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_669 = and:int(var_3_669:int, ldc:int(-1547228814))
                            goto(Label_0721)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_669 = and:int(var_3_669:int, ldc:int(-1548128734))
                            goto(Label_0581)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_669:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_669 = and:int(var_3_669:int, ldc:int(-809437130))
                            goto(Label_0411)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_669:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_669 = and:int(var_3_669:int, ldc:int(1707994749))
                            loopcontinue()
                        }
                        
                        var_3_669 = and:int(var_3_669:int, ldc:int(2071711311))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_11C:double, var_5_89:int, var_16_120:int)
                        goto(Label_1531)
                    }
                    
                    Label_1408:
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1542)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1267)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(146969759))
                        goto(Label_1139)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0985)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0848)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0721)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(-164211888))
                        goto(Label_0581)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(2034189117))
                        goto(Label_0411)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(268435456)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_669 = and:int(var_3_669:int, ldc:int(-1178608553))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_11C:double, ldc:double(0.0))
                    Label_1531:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_674 = var_5_89:int
                        
                        if (cmpeq:boolean(var_11_F2:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1542:
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1408)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(-1833856013))
                        goto(Label_1267)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1139)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0985)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0848)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0721)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0581)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(47867783))
                        goto(Label_0411)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(-1673687836))
                        var_17_674 = add:int(var_16_120:int, xor:int(ldc:int(520), ldc:int(521)))
                        looporswitchbreak()
                    }
                    
                    var_3_669 = and:int(var_3_669:int, ldc:int(959831782))
                }
                
                var_3_669 = and:int(var_3_669:int, ldc:int(2037845925))
                
                if (cmple:boolean(var_5_89 = var_17_674:int, sub:int(var_6_90:int, and:int(ldc:int(769), ldc:int(8357))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0179:
        
        if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(2147483647)), ldc:int(0))) {
            var_3_669 = and:int(var_3_669:int, ldc:int(1263912652))
            goto(Label_0108)
        }
    }
}
