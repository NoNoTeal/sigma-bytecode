public class \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\ub70c\uc910\u071d\uc2e8\ufe34\u120d {
    public void \ub70c\uc910\u071d\uc2e8\ufe34\u120d() {
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
            invokespecial:\u1833\ud171\u8350\ubded\u34df\uc9f6(\u1833\ud171\u8350\ubded\u34df\uc9f6::<init>, this:\ub70c\uc910\u071d\uc2e8\ufe34\u120d, ldc:Class<\ud12e\ub18d\ud158\ud36e\ub8be\u56bd>(\u71f1\uc910\u3bc9\u516c\u93a2.\ud12e\ub18d\ud158\ud36e\ub8be\u56bd.class))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public \u71f1\uc910\u3bc9\u516c\u93a2.\ud12e\ub18d\ud158\ud36e\ub8be\u56bd \u4d85\uff55\uc3e3\ud4fe\u9937\uc229(io.netty.buffer.ByteBuf p0) {
        var_4_64 : int
        var_5_6A : int
        var_6_70 : boolean
        var_7_79 : int
        var_8_85 : \ub83f\u6c52\u12cb\u3c25\u3776
        var_9_A2 : int[]
        var_10_CF : int
        var_10_B6 : \u4975\u1833\u446c\u5bc4\ubded\u4f4a[]
        var_11_BF : int
        var_12_152 : short
        var_13_15E : \u4975\u1833\u446c\u5bc4\ubded\u4f4a
        var_11_112 : ArrayList<\ub83f\u6c52\u12cb\u3c25\u3776>
        var_12_189 : byte[]
        
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
            var_7_79 = invokevirtual:int(\uceb8\u4c2b\ub8be\u7049\u8308\u3a62::\uc4d2\uf94d\u6d69\u6b5f\ucef1\u624e, getstatic:\uceb8\u4c2b\ub8be\u7049\u8308\u3a62(\u1833\ud171\u8350\ubded\u34df\uc9f6::\ud523\u62da\u6c52\u7043\ud217\u72f1), p0:ByteBuf)
            var_8_85 = checkcast:\ub83f\u6c52\u12cb\u3c25\u3776(\u51b2\u6fb0\ufcaf\u61a4\u0800.\uc7fe\ua61f\ub18d\u64ab\u4f4a.\ub83f\u6c52\u12cb\u3c25\u3776.class, invokevirtual:\ub83f\u6c52\u12cb\u3c25\u3776(\u8389\u494c\u527a\u8753\ub1b9\u8640<\ub83f\u6c52\u12cb\u3c25\u3776>::\u4d85\uff55\uc3e3\ud4fe\u9937\uc229, getstatic:\u1833\ud171\u8350\ubded\u34df\uc9f6<\ub83f\u6c52\u12cb\u3c25\u3776>[expected:\u8389\u494c\u527a\u8753\ub1b9\u8640<\ub83f\u6c52\u12cb\u3c25\u3776>](\u1833\ud171\u8350\ubded\u34df\uc9f6::\u3bc9\u5fe1\u4ab3\ub70c\u600f\u6fb0), p0:ByteBuf))
            var_9_A2 = ternaryop:int[](var_6_70:boolean, newarray:int[](int.class, and:int(ldc:int(1025), ldc:int(1542))), aconstnull:int[]())
            
            if (var_6_70:boolean) {
                var_10_CF = and:int(ldc:int(-6710), ldc:int(2597))
                
                while (cmplt:boolean(var_10_CF:int, xor:int(ldc:int(10946), ldc:int(11970)))) {
                    storeelement:int(var_9_A2:int[], var_10_CF:int, invokevirtual:int(ByteBuf::readInt, p0:ByteBuf))
                    inc:int(var_10_CF, ldc:int(1))
                }
            }
            
            invokevirtual:int(\uceb8\u4c2b\ub8be\u7049\u8308\u3a62::\uc4d2\uf94d\u6d69\u6b5f\ucef1\u624e, getstatic:\uceb8\u4c2b\ub8be\u7049\u8308\u3a62(\u1833\ud171\u8350\ubded\u34df\uc9f6::\ud523\u62da\u6c52\u7043\ud217\u72f1), p0:ByteBuf)
            var_10_B6 = newarray:\u4975\u1833\u446c\u5bc4\ubded\u4f4a[](\u5d20\u97b7\u8753\u873d\u16f6.\u4975\u1833\u446c\u5bc4\ubded\u4f4a.class, ldc:int(16))
            var_11_BF = and:int(ldc:int(-15651), ldc:int(15650))
            
            while (cmplt:boolean(var_11_BF:int, ldc:int(16))) {
                if (cmpne:boolean(and:int(var_7_79:int, shl:int(and:int(ldc:int(4193), ldc:int(9217)), var_11_BF:int)), ldc:int(0))) {
                    var_12_152 = invokevirtual:short(ByteBuf::readShort, p0:ByteBuf)
                    var_13_15E = checkcast:\u4975\u1833\u446c\u5bc4\ubded\u4f4a(\u5d20\u97b7\u8753\u873d\u16f6.\u4975\u1833\u446c\u5bc4\ubded\u4f4a.class, invokevirtual:\u4975\u1833\u446c\u5bc4\ubded\u4f4a(\u8389\u494c\u527a\u8753\ub1b9\u8640<\u4975\u1833\u446c\u5bc4\ubded\u4f4a>::\u4d85\uff55\uc3e3\ud4fe\u9937\uc229, getstatic:\u1833\ud171\u8350\ubded\u34df\uc9f6<\u4975\u1833\u446c\u5bc4\ubded\u4f4a>[expected:\u8389\u494c\u527a\u8753\ub1b9\u8640<\u4975\u1833\u446c\u5bc4\ubded\u4f4a>](\u61a4\u4c04\ub102\ufcaf\uc29a\u6435::\ufe34\u4f4a\u7049\u8640\u9af2\u600f), p0:ByteBuf))
                    invokevirtual:void(\u4975\u1833\u446c\u5bc4\ubded\u4f4a::\u4179\u836c\ub32d\u156b\ud51e\u98a4, var_13_15E:\u4975\u1833\u446c\u5bc4\ubded\u4f4a, var_12_152:short[expected:int])
                    storeelement:\u4975\u1833\u446c\u5bc4\ubded\u4f4a(var_10_B6:\u4975\u1833\u446c\u5bc4\ubded\u4f4a[], var_11_BF:int, var_13_15E:\u4975\u1833\u446c\u5bc4\ubded\u4f4a)
                }
                
                inc:int(var_11_BF, ldc:int(1))
            }
            
            var_11_112 = initobject:ArrayList<\ub83f\u6c52\u12cb\u3c25\u3776>(ArrayList<\ub83f\u6c52\u12cb\u3c25\u3776>::<init>, invokestatic:List<\ub83f\u6c52\u12cb\u3c25\u3776>[expected:Collection<? extends \ub83f\u6c52\u12cb\u3c25\u3776>](Arrays::asList, checkcast:\ub83f\u6c52\u12cb\u3c25\u3776[](\u51b2\u6fb0\ufcaf\u61a4\u0800.\uc7fe\ua61f\ub18d\u64ab\u4f4a.\ub83f\u6c52\u12cb\u3c25\u3776[].class, invokevirtual:\ub83f\u6c52\u12cb\u3c25\u3776[](\u8389\u494c\u527a\u8753\ub1b9\u8640<\ub83f\u6c52\u12cb\u3c25\u3776[]>::\u4d85\uff55\uc3e3\ud4fe\u9937\uc229, getstatic:\u1833\ud171\u8350\ubded\u34df\uc9f6<\ub83f\u6c52\u12cb\u3c25\u3776[]>[expected:\u8389\u494c\u527a\u8753\ub1b9\u8640<\ub83f\u6c52\u12cb\u3c25\u3776[]>](\u1833\ud171\u8350\ubded\u34df\uc9f6::\u760c\ucfaf\ub19c\u446c\u7873\u97b7), p0:ByteBuf))))
            
            if (cmpgt:boolean(invokevirtual:int(ByteBuf::readableBytes, p0:ByteBuf), ldc:int(0))) {
                var_12_189 = checkcast:byte[](byte[].class, invokevirtual:byte[](\u8389\u494c\u527a\u8753\ub1b9\u8640<byte[]>::\u4d85\uff55\uc3e3\ud4fe\u9937\uc229, getstatic:\u1833\ud171\u8350\ubded\u34df\uc9f6<byte[]>[expected:\u8389\u494c\u527a\u8753\ub1b9\u8640<byte[]>](\u1833\ud171\u8350\ubded\u34df\uc9f6::\u3bc9\u6bb9\u8709\uc3e3\u34df\ud158), p0:ByteBuf))
                
                if (invokevirtual:boolean(\uc29a\u7043\u3d4b\u93a2\uceb8\u7d52::\uc229\u3e2a\u76bc\ubb2b\ud523\u6435, invokestatic:\uc29a\u7043\u3d4b\u93a2\uceb8\u7d52(\u183a\u71ae\ubf56\u6d69\u4e72\u3d4b::\u3776\uf9c5\u3d4b\u72f1\u647c\ubf56))) {
                    invokevirtual:void(Logger::warning, invokeinterface:Logger(\u0b8e\u12cb\ud523\u8308\u6fb0\u4ab3::\u8709\u839e\uafe7\ua61f\u71ae\ud158, invokestatic:\u0b8e\u12cb\ud523\u8308\u6fb0\u4ab3(\u183a\u71ae\ubf56\u6d69\u4e72\u3d4b::\u836c\u527a\u76bc\u4492\u72f1\u98a4)), invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\ub70c\uc910\u071d\uc2e8\ufe34\u120d::\ub7dc\ucef1\u8d98\uc238\ua562\u7bad), and:int(ldc:int(-8039), ldc:int(5926)))), arraylength:int(var_12_189:byte[])), loadelement:String(getstatic:String[](\ub70c\uc910\u071d\uc2e8\ufe34\u120d::\ub7dc\ucef1\u8d98\uc238\ua562\u7bad), and:int(ldc:int(3633), ldc:int(453)))), var_4_64:int), loadelement:String(getstatic:String[](\ub70c\uc910\u071d\uc2e8\ufe34\u120d::\ub7dc\ucef1\u8d98\uc238\ua562\u7bad), xor:int(ldc:int(-32692), ldc:int(-32690)))), var_5_6A:int)))
                }
            }
            
            return:\ud12e\ub18d\ud158\ud36e\ub8be\u56bd(initobject:\u927d\ua3b4\u7330\u8df4\u99f7\u0a06(\u927d\ua3b4\u7330\u8df4\u99f7\u0a06::<init>, var_4_64:int, var_5_6A:int, var_6_70:boolean, and:int[expected:boolean](ldc:int(-24899), ldc:int(24898)), var_7_79:int, var_10_B6:\u4975\u1833\u446c\u5bc4\ubded\u4f4a[], var_9_A2:int[], var_8_85:\ub83f\u6c52\u12cb\u3c25\u3776, var_11_112:ArrayList<\ub83f\u6c52\u12cb\u3c25\u3776>[expected:List<\ub83f\u6c52\u12cb\u3c25\u3776>]))
        }
        
        goto(Label_0006)
    }
    
    public void \ud171\uc229\ufe34\u36d3\u5f50\uc2e8(io.netty.buffer.ByteBuf p0, \u71f1\uc910\u3bc9\u516c\u93a2.\ud12e\ub18d\ud158\ud36e\ub8be\u56bd p1) {
        var_3_638 : int
        var_3_334 : int
        var_5_33B : int[]
        var_6_340 : int
        var_7_349 : int
        var_3_37E : int
        var_8_384 : int
        var_3_393 : int
        var_5_3CD : ByteBuf
        var_6_3DC : int
        var_7_4DA : \u4975\u1833\u446c\u5bc4\ubded\u4f4a
        
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
            var_3_638 = and:int(ldc:int(1682575057), ldc:int(1297813749))
            
            loop {
                if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(1073741824)), ldc:int(0))) {
                    goto(Label_0729)
                }
                
                if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(67108864)), ldc:int(0))) {
                    var_3_638 = and:int(var_3_638:int, ldc:int(-1922688358))
                    goto(Label_0648)
                }
                
                if (cmpne:boolean(and:int(var_3_638:int, ldc:int(2)), ldc:int(0))) {
                    var_3_638 = and:int(var_3_638:int, ldc:int(1994739721))
                    goto(Label_0545)
                }
                
                if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(524288)), ldc:int(0))) {
                    goto(Label_0454)
                }
                
                if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(16)), ldc:int(0))) {
                    var_3_638 = and:int(var_3_638:int, ldc:int(-902122584))
                    goto(Label_0355)
                }
                
                if (cmpne:boolean(and:int(var_3_638:int, ldc:int(8388608)), ldc:int(0))) {
                    goto(Label_0266)
                }
                
                if (cmpne:boolean(and:int(var_3_638:int, ldc:int(65536)), ldc:int(0))) {
                    var_3_638 = and:int(var_3_638:int, ldc:int(580743122))
                }
                else {
                    var_3_638 = and:int(var_3_638:int, ldc:int(-36714248))
                    invokevirtual:ByteBuf(ByteBuf::writeInt, p0:ByteBuf, invokeinterface:int(\ud12e\ub18d\ud158\ud36e\ub8be\u56bd::\u718f\u64ab\uc9f6\uc246\u7006\ubff1, p1:\ud12e\ub18d\ud158\ud36e\ub8be\u56bd))
                }
                
                Label_0193:
                
                if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(131072)), ldc:int(0))) {
                    goto(Label_0729)
                }
                
                if (cmpne:boolean(and:int(var_3_638:int, ldc:int(65536)), ldc:int(0))) {
                    goto(Label_0648)
                }
                
                if (cmpne:boolean(and:int(var_3_638:int, ldc:int(8388608)), ldc:int(0))) {
                    goto(Label_0545)
                }
                
                if (cmpne:boolean(and:int(var_3_638:int, ldc:int(2)), ldc:int(0))) {
                    goto(Label_0454)
                }
                
                if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(1073741824)), ldc:int(0))) {
                    goto(Label_0355)
                }
                
                if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(67108864)), ldc:int(0))) {
                    var_3_638 = and:int(var_3_638:int, ldc:int(2135208468))
                }
                else {
                    if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(67108864)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_638 = and:int(var_3_638:int, ldc:int(1471074043))
                    invokevirtual:ByteBuf(ByteBuf::writeInt, p0:ByteBuf, invokeinterface:int(\ud12e\ub18d\ud158\ud36e\ub8be\u56bd::\u5140\u946b\u8709\u8413\u4f4a\ub18d, p1:\ud12e\ub18d\ud158\ud36e\ub8be\u56bd))
                }
                
                Label_0266:
                
                if (cmpne:boolean(and:int(var_3_638:int, ldc:int(65536)), ldc:int(0))) {
                    goto(Label_0729)
                }
                
                if (cmpne:boolean(and:int(var_3_638:int, ldc:int(16384)), ldc:int(0))) {
                    var_3_638 = and:int(var_3_638:int, ldc:int(-902569894))
                    goto(Label_0648)
                }
                
                if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(1073741824)), ldc:int(0))) {
                    goto(Label_0545)
                }
                
                if (cmpne:boolean(and:int(var_3_638:int, ldc:int(1048576)), ldc:int(0))) {
                    goto(Label_0454)
                }
                
                if (cmpne:boolean(and:int(var_3_638:int, ldc:int(2)), ldc:int(0))) {
                    var_3_638 = and:int(var_3_638:int, ldc:int(-1326311157))
                }
                else {
                    if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0193)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_638 = and:int(var_3_638:int, ldc:int(-971181545))
                        loopcontinue()
                    }
                    
                    var_3_638 = and:int(var_3_638:int, ldc:int(-983827750))
                    invokevirtual:ByteBuf(ByteBuf::writeBoolean, p0:ByteBuf, invokeinterface:boolean(\ud12e\ub18d\ud158\ud36e\ub8be\u56bd::\u52d3\u4e72\u36d3\u56bd\u0b8e\ud4fe, p1:\ud12e\ub18d\ud158\ud36e\ub8be\u56bd))
                }
                
                Label_0355:
                
                if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(128)), ldc:int(0))) {
                    var_3_638 = and:int(var_3_638:int, ldc:int(-1004337621))
                    goto(Label_0729)
                }
                
                if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(128)), ldc:int(0))) {
                    goto(Label_0648)
                }
                
                if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(524288)), ldc:int(0))) {
                    goto(Label_0545)
                }
                
                if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(131072)), ldc:int(0))) {
                    var_3_638 = and:int(var_3_638:int, ldc:int(456990708))
                }
                else {
                    if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0266)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(128)), ldc:int(0))) {
                        var_3_638 = and:int(var_3_638:int, ldc:int(130333639))
                        goto(Label_0193)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(128)), ldc:int(0))) {
                        var_3_638 = and:int(var_3_638:int, ldc:int(460355477))
                        loopcontinue()
                    }
                    
                    var_3_638 = and:int(var_3_638:int, ldc:int(-576013863))
                    invokevirtual:void(\uceb8\u4c2b\ub8be\u7049\u8308\u3a62::\u0c95\u6435\u3504\u36d3\u2dcc\u16f6, getstatic:\uceb8\u4c2b\ub8be\u7049\u8308\u3a62(\u1833\ud171\u8350\ubded\u34df\uc9f6::\ud523\u62da\u6c52\u7043\ud217\u72f1), p0:ByteBuf, invokeinterface:int(\ud12e\ub18d\ud158\ud36e\ub8be\u56bd::\u624e\u3d4b\u16f6\u416d\ub1b9\u36d3, p1:\ud12e\ub18d\ud158\ud36e\ub8be\u56bd))
                }
                
                Label_0454:
                
                if (cmpne:boolean(and:int(var_3_638:int, ldc:int(65536)), ldc:int(0))) {
                    goto(Label_0729)
                }
                
                if (cmpne:boolean(and:int(var_3_638:int, ldc:int(16384)), ldc:int(0))) {
                    var_3_638 = and:int(var_3_638:int, ldc:int(1341119866))
                    goto(Label_0648)
                }
                
                if (cmpne:boolean(and:int(var_3_638:int, ldc:int(65536)), ldc:int(0))) {
                    var_3_638 = and:int(var_3_638:int, ldc:int(193675548))
                }
                else {
                    if (cmpne:boolean(and:int(var_3_638:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0355)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_638 = and:int(var_3_638:int, ldc:int(1555680009))
                        goto(Label_0266)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0193)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_638:int, ldc:int(16384)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_638 = and:int(var_3_638:int, ldc:int(-999306249))
                    invokevirtual:void(\ua3b4\ub1b9\u9af2\u3d64\uf94d\u3dd3<\ub83f\u6c52\u12cb\u3c25\u3776>::\ud171\uc229\ufe34\u36d3\u5f50\uc2e8, getstatic:\u1833\ud171\u8350\ubded\u34df\uc9f6<\ub83f\u6c52\u12cb\u3c25\u3776>[expected:\ua3b4\ub1b9\u9af2\u3d64\uf94d\u3dd3<\ub83f\u6c52\u12cb\u3c25\u3776>](\u1833\ud171\u8350\ubded\u34df\uc9f6::\u3bc9\u5fe1\u4ab3\ub70c\u600f\u6fb0), p0:ByteBuf, invokeinterface:\ub83f\u6c52\u12cb\u3c25\u3776(\ud12e\ub18d\ud158\ud36e\ub8be\u56bd::\u7bad\u64ab\uc87f\uc84e\u34df\u0800, p1:\ud12e\ub18d\ud158\ud36e\ub8be\u56bd))
                }
                
                Label_0545:
                
                if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(16)), ldc:int(0))) {
                    var_3_638 = and:int(var_3_638:int, ldc:int(-351099933))
                    goto(Label_0729)
                }
                
                if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(65536)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_638 = and:int(var_3_638:int, ldc:int(-1365698267))
                        goto(Label_0454)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0355)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_638:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_638 = and:int(var_3_638:int, ldc:int(-741026056))
                        goto(Label_0266)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(64)), ldc:int(0))) {
                        var_3_638 = and:int(var_3_638:int, ldc:int(185474530))
                        goto(Label_0193)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_638:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_638 = and:int(var_3_638:int, ldc:int(-335640833))
                        loopcontinue()
                    }
                    
                    var_3_638 = and:int(var_3_638:int, ldc:int(-960590889))
                    
                    if (logicalnot:boolean(invokeinterface:boolean(\ud12e\ub18d\ud158\ud36e\ub8be\u56bd::\u6cfe\uc2bd\ud36e\u071d\u7049\u9937, p1:\ud12e\ub18d\ud158\ud36e\ub8be\u56bd))) {
                        looporswitchbreak()
                    }
                }
                
                Label_0648:
                
                if (cmpne:boolean(and:int(var_3_638:int, ldc:int(2147483647)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_638 = and:int(var_3_638:int, ldc:int(661627129))
                        goto(Label_0545)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(128)), ldc:int(0))) {
                        var_3_638 = and:int(var_3_638:int, ldc:int(-663671090))
                        goto(Label_0454)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0355)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0266)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0193)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_638:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_638 = and:int(var_3_638:int, ldc:int(-1761777271))
                        loopcontinue()
                    }
                    
                    var_3_638 = and:int(var_3_638:int, ldc:int(1287269844))
                }
                
                Label_0729:
                
                if (cmpne:boolean(and:int(var_3_638:int, ldc:int(65536)), ldc:int(0))) {
                    var_3_638 = and:int(var_3_638:int, ldc:int(-188092541))
                    goto(Label_0648)
                }
                
                if (cmpne:boolean(and:int(var_3_638:int, ldc:int(134217728)), ldc:int(0))) {
                    goto(Label_0545)
                }
                
                if (cmpne:boolean(and:int(var_3_638:int, ldc:int(1048576)), ldc:int(0))) {
                    var_3_638 = and:int(var_3_638:int, ldc:int(816544779))
                    goto(Label_0454)
                }
                
                if (cmpne:boolean(and:int(var_3_638:int, ldc:int(8192)), ldc:int(0))) {
                    var_3_638 = and:int(var_3_638:int, ldc:int(1367631572))
                    goto(Label_0355)
                }
                
                if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(131072)), ldc:int(0))) {
                    goto(Label_0266)
                }
                
                if (cmpne:boolean(and:int(var_3_638:int, ldc:int(16384)), ldc:int(0))) {
                    var_3_638 = and:int(var_3_638:int, ldc:int(-1161868435))
                    goto(Label_0193)
                }
                
                if (cmpne:boolean(and:int(var_3_638:int, ldc:int(65536)), ldc:int(0))) {
                    loopcontinue()
                }
                
                var_3_334 = and:int(var_3_638:int, ldc:int(1195110109))
                var_5_33B = invokeinterface:int[](\ud12e\ub18d\ud158\ud36e\ub8be\u56bd::\ub6ab\u946b\u4bc8\u12b2\u8389\ub113, p1:\ud12e\ub18d\ud158\ud36e\ub8be\u56bd)
                var_6_340 = arraylength:int(var_5_33B:int[])
                var_7_349 = and:int(ldc:int(28738), ldc:int(-30803))
                
                loop {
                    if (cmpne:boolean(and:int(var_3_334:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_638 = and:int(var_3_334:int, ldc:int(-639702306))
                    }
                    else {
                        var_3_638 = and:int(var_3_334:int, ldc:int(-948229165))
                        
                        if (cmpge:boolean(var_7_349:int, var_6_340:int)) {
                            looporswitchbreak(Label_0964)
                        }
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_334 = and:int(var_3_638:int, ldc:int(1707358867))
                    }
                    else {
                        var_3_37E = and:int(var_3_638:int, ldc:int(2123309051))
                        var_8_384 = loadelement:int(var_5_33B:int[], var_7_349:int)
                        
                        loop {
                            if (cmpne:boolean(and:int(var_3_37E:int, ldc:int(262144)), ldc:int(0))) {
                                var_3_393 = and:int(var_3_37E:int, ldc:int(12715414))
                            }
                            else {
                                var_3_393 = and:int(var_3_37E:int, ldc:int(1715368411))
                                invokevirtual:ByteBuf(ByteBuf::writeInt, p0:ByteBuf, var_8_384:int)
                            }
                            
                            if (cmpne:boolean(and:int(var_3_393:int, ldc:int(128)), ldc:int(0))) {
                                looporswitchbreak()
                            }
                            
                            var_3_37E = and:int(var_3_393:int, ldc:int(-1206913854))
                        }
                        
                        var_3_334 = and:int(var_3_393:int, ldc:int(-732168968))
                        inc:int(var_7_349, ldc:int(1))
                    }
                }
            }
            
            Label_0964:
            var_5_3CD = invokeinterface:ByteBuf(ByteBufAllocator::buffer, invokevirtual:ByteBufAllocator(ByteBuf::alloc, p0:ByteBuf))
            
            try {
                var_3_638 = and:int(var_3_638:int, ldc:int(1816796636))
                var_6_3DC = and:int(ldc:int(-17287), ldc:int(17286))
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_638 = and:int(var_3_638:int, ldc:int(1806799385))
                        goto(Label_1526)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_638:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1462)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_638:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1387)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(64)), ldc:int(0))) {
                        var_3_638 = and:int(var_3_638:int, ldc:int(-1065106887))
                        goto(Label_1300)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1175)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_638 = and:int(var_3_638:int, ldc:int(-1020158165))
                    }
                    else {
                        var_3_638 = and:int(var_3_638:int, ldc:int(1547611354))
                        
                        if (cmpge:boolean(var_6_3DC:int, ldc:int(16))) {
                            invokevirtual:ByteBuf(ByteBuf::readerIndex, var_5_3CD:ByteBuf, and:int(ldc:int(20999), ldc:int(-21064)))
                            goto(Label_1300)
                        }
                    }
                    
                    Label_1072:
                    
                    if (cmpne:boolean(and:int(var_3_638:int, ldc:int(2)), ldc:int(0))) {
                        var_3_638 = and:int(var_3_638:int, ldc:int(-675677414))
                        goto(Label_1526)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_638:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_638 = and:int(var_3_638:int, ldc:int(-158525783))
                        goto(Label_1462)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_638 = and:int(var_3_638:int, ldc:int(-1910243904))
                        goto(Label_1387)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_638:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_638 = and:int(var_3_638:int, ldc:int(-2016745103))
                        goto(Label_1300)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_638 = and:int(var_3_638:int, ldc:int(1262665750))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_638:int, ldc:int(2)), ldc:int(0))) {
                            var_3_638 = and:int(var_3_638:int, ldc:int(1909318090))
                            loopcontinue()
                        }
                        
                        var_3_638 = and:int(var_3_638:int, ldc:int(-543264782))
                    }
                    
                    Label_1175:
                    
                    if (cmpne:boolean(and:int(var_3_638:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1526)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(64)), ldc:int(0))) {
                        var_3_638 = and:int(var_3_638:int, ldc:int(837435636))
                        goto(Label_1462)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1387)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_638:int, ldc:int(16)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_638:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_1072)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_638:int, ldc:int(128)), ldc:int(0))) {
                            var_3_638 = and:int(var_3_638:int, ldc:int(1829645557))
                            var_7_4DA = loadelement:\u4975\u1833\u446c\u5bc4\ubded\u4f4a(invokeinterface:\u4975\u1833\u446c\u5bc4\ubded\u4f4a[](\ud12e\ub18d\ud158\ud36e\ub8be\u56bd::\u52d3\u5bc4\u3c25\u8cae\ud7e8\u927d, p1:\ud12e\ub18d\ud158\ud36e\ub8be\u56bd), var_6_3DC:int)
                            
                            if (cmpne:boolean(var_7_4DA:\u4975\u1833\u446c\u5bc4\ubded\u4f4a, aconstnull:\u4975\u1833\u446c\u5bc4\ubded\u4f4a())) {
                                invokevirtual:ByteBuf(ByteBuf::writeShort, var_5_3CD:ByteBuf, invokevirtual:int(\u4975\u1833\u446c\u5bc4\ubded\u4f4a::\u67e9\u5bc4\u5fe1\ub7dc\ud171\u8640, var_7_4DA:\u4975\u1833\u446c\u5bc4\ubded\u4f4a))
                                invokevirtual:void(\ua3b4\ub1b9\u9af2\u3d64\uf94d\u3dd3<\u4975\u1833\u446c\u5bc4\ubded\u4f4a>::\ud171\uc229\ufe34\u36d3\u5f50\uc2e8, getstatic:\u1833\ud171\u8350\ubded\u34df\uc9f6<\u4975\u1833\u446c\u5bc4\ubded\u4f4a>[expected:\ua3b4\ub1b9\u9af2\u3d64\uf94d\u3dd3<\u4975\u1833\u446c\u5bc4\ubded\u4f4a>](\u61a4\u4c04\ub102\ufcaf\uc29a\u6435::\ufe34\u4f4a\u7049\u8640\u9af2\u600f), var_5_3CD:ByteBuf, var_7_4DA:\u4975\u1833\u446c\u5bc4\ubded\u4f4a)
                            }
                            
                            inc:int(var_6_3DC, ldc:int(1))
                            loopcontinue()
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1300:
                    
                    if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1526)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_638:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_638 = and:int(var_3_638:int, ldc:int(-1542271424))
                        goto(Label_1462)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_638:int, ldc:int(16)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_638:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_638 = and:int(var_3_638:int, ldc:int(708939220))
                            goto(Label_1175)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_638 = and:int(var_3_638:int, ldc:int(-1731573582))
                            goto(Label_1072)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_638:int, ldc:int(2)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_638 = and:int(var_3_638:int, ldc:int(-62252037))
                        invokevirtual:void(\uceb8\u4c2b\ub8be\u7049\u8308\u3a62::\u0c95\u6435\u3504\u36d3\u2dcc\u16f6, getstatic:\uceb8\u4c2b\ub8be\u7049\u8308\u3a62(\u1833\ud171\u8350\ubded\u34df\uc9f6::\ud523\u62da\u6c52\u7043\ud217\u72f1), p0:ByteBuf, invokevirtual:int(ByteBuf::readableBytes, var_5_3CD:ByteBuf))
                    }
                    
                    Label_1387:
                    
                    if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1526)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(134217728)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_638:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_1300)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_638 = and:int(var_3_638:int, ldc:int(1295588919))
                            goto(Label_1175)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_638:int, ldc:int(2)), ldc:int(0))) {
                            var_3_638 = and:int(var_3_638:int, ldc:int(2055350996))
                            goto(Label_1072)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_638:int, ldc:int(16384)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_638 = and:int(var_3_638:int, ldc:int(1608159477))
                        invokevirtual:ByteBuf(ByteBuf::writeBytes, p0:ByteBuf, var_5_3CD:ByteBuf)
                    }
                    
                    Label_1462:
                    
                    if (cmpne:boolean(and:int(var_3_638:int, ldc:int(1073741824)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_638:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_1387)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_638:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_638 = and:int(var_3_638:int, ldc:int(310407179))
                            goto(Label_1300)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_1175)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_1072)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(131072)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_638 = and:int(var_3_638:int, ldc:int(1876590293))
                        invokevirtual:boolean(ByteBuf::release, var_5_3CD:ByteBuf)
                    }
                    
                    Label_1526:
                    
                    if (cmpne:boolean(and:int(var_3_638:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1462)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_638:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_638 = and:int(var_3_638:int, ldc:int(-1638383016))
                        goto(Label_1387)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_638 = and:int(var_3_638:int, ldc:int(407028081))
                        goto(Label_1300)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1175)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1072)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_638:int, ldc:int(64)), ldc:int(0))) {
                        looporswitchbreak()
                    }
                }
                
                var_3_638 = and:int(var_3_638:int, ldc:int(1954417137))
            }
            finally {
                do {
                    if (cmpne:boolean(and:int(var_3_638:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_638 = and:int(var_3_638:int, ldc:int(1188423173))
                    }
                    else {
                        var_3_638 = and:int(var_3_638:int, ldc:int(-411065859))
                        invokevirtual:boolean(ByteBuf::release, var_5_3CD:ByteBuf)
                    }
                } while (cmpeq:boolean(and:int(var_3_638:int, ldc:int(67108864)), ldc:int(0)))
            }
            
            invokevirtual:void(\ua3b4\ub1b9\u9af2\u3d64\uf94d\u3dd3<\ub83f\u6c52\u12cb\u3c25\u3776[]>::\ud171\uc229\ufe34\u36d3\u5f50\uc2e8, getstatic:\u1833\ud171\u8350\ubded\u34df\uc9f6<\ub83f\u6c52\u12cb\u3c25\u3776[]>[expected:\ua3b4\ub1b9\u9af2\u3d64\uf94d\u3dd3<\ub83f\u6c52\u12cb\u3c25\u3776[]>](\u1833\ud171\u8350\ubded\u34df\uc9f6::\u760c\ucfaf\ub19c\u446c\u7873\u97b7), p0:ByteBuf, invokeinterface:\ub83f\u6c52\u12cb\u3c25\u3776[](List<\ub83f\u6c52\u12cb\u3c25\u3776>::toArray, invokeinterface:List<\ub83f\u6c52\u12cb\u3c25\u3776>(\ud12e\ub18d\ud158\ud36e\ub8be\u56bd::\u6ec6\ub83f\ud217\uc229\u74b1\ub32d, p1:\ud12e\ub18d\ud158\ud36e\ub8be\u56bd), getstatic:\ub83f\u6c52\u12cb\u3c25\u3776[](\ub70c\uc910\u071d\uc2e8\ufe34\u120d::\u12cb\u74b1\ube23\u8bb0\u4daf\u5140)))
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
            return:Object(invokevirtual:\ud12e\ub18d\ud158\ud36e\ub8be\u56bd[expected:Object](\ub70c\uc910\u071d\uc2e8\ufe34\u120d::\u4d85\uff55\uc3e3\ud4fe\u9937\uc229, this:\ub70c\uc910\u071d\uc2e8\ufe34\u120d, p0:ByteBuf))
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
            invokevirtual:void(\ub70c\uc910\u071d\uc2e8\ufe34\u120d::\ud171\uc229\ufe34\u36d3\u5f50\uc2e8, this:\ub70c\uc910\u071d\uc2e8\ufe34\u120d, p0:ByteBuf, checkcast:\ud12e\ub18d\ud158\ud36e\ub8be\u56bd(\u71f1\uc910\u3bc9\u516c\u93a2.\ud12e\ub18d\ud158\ud36e\ub8be\u56bd.class, p1:Object[expected:\ud12e\ub18d\ud158\ud36e\ub8be\u56bd]))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_30D : int
        expr_6E : int [generated]
        stack_A2_0 : byte[] [generated]
        stack_A4_0 : byte[] [generated]
        stack_DA_0 : byte[] [generated]
        stack_DC_0 : byte[] [generated]
        stack_123_0 : byte[] [generated]
        stack_125_0 : byte[] [generated]
        stack_16A_0 : byte[] [generated]
        stack_16C_0 : byte[] [generated]
        stack_1B1_0 : byte[] [generated]
        stack_269_0 : byte[] [generated]
        stack_2BA_0 : byte[] [generated]
        stack_328_0 : byte[] [generated]
        stack_387_0 : byte[] [generated]
        stack_40D_0 : byte[] [generated]
        var_4_23A : int
        var_3_23F : byte[]
        var_5_240 : int
        expr_269 : byte [generated]
        var_0_3A1 : int
        expr_387 : byte [generated]
        stack_3D8_2 : byte [generated]
        stack_3AD_0 : byte [generated]
        var_2_A2 : byte[]
        expr_A6 : int [generated]
        var_3_2A8 : byte[]
        var_5_2A9 : int
        expr_DC : int [generated]
        expr_125 : int [generated]
        expr_16C : int [generated]
        var_3_3FB : byte[]
        var_5_3FC : int
        var_3_1BD : String
        stack_226_0 : String[] [generated]
        expr_1CF : String[] [generated]
        
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
        var_0_30D = and:int(ldc:int(-1013381973), ldc:int(-1651051361))
        expr_6E = arraylength:int(stack_A2_0 = stack_A4_0 = stack_DA_0 = stack_DC_0 = stack_123_0 = stack_125_0 = stack_16A_0 = stack_16C_0 = stack_1B1_0 = stack_269_0 = stack_2BA_0 = stack_328_0 = stack_387_0 = stack_40D_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("kq+rZEWm+0RknxnuYECfbbrvdHBc62xcRfJkr69ETeZoRKO3v0xN7mBQTaa3n0xcnDSb9we/SHxJgwg=")))
        
        if (cmpeq:boolean(expr_6E:int, ldc:int(0))) {
            goto(Label_0115)
        }
        
        var_4_23A = expr_6E:int
        var_3_23F = newarray:byte[](byte.class, expr_6E:int)
        var_5_240 = expr_6E:int
        Label_0578:
        
        while (cmpeq:boolean(and:int(var_0_30D:int, ldc:int(8192)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_30D:int, ldc:int(1024)), ldc:int(0))) {
                var_0_30D = and:int(var_0_30D:int, ldc:int(997312927))
                goto(Label_0769)
            }
            
            var_0_30D = and:int(var_0_30D:int, ldc:int(-1680382821))
            var_5_240 = add:int(var_5_240:int, ldc:int(-1))
            expr_269 = loadelement:byte(stack_269_0:byte[], var_5_240:int)
            storeelement:byte(var_3_23F:byte[], var_5_240:int, or:int(and:int(shl:int(expr_269:byte, xor:int(ldc:int(-12285), ldc:int(-12281))), ldc:int(-16)), and:int(shr:int(expr_269:byte[expected:int], and:int(ldc:int(24612), ldc:int(5957))), ldc:int(15))))
            
            if (cmpne:boolean(var_5_240:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A4_0 = stack_A2_0 = stack_DA_0 = stack_DC_0 = stack_123_0 = stack_125_0 = stack_16A_0 = stack_16C_0 = stack_1B1_0 = stack_269_0 = stack_2BA_0 = stack_328_0 = stack_387_0 = stack_40D_0 = var_3_23F:byte[]
            goto(Label_0115)
        }
        
        goto(Label_0855)
        Label_0769:
        
        while (cmpeq:boolean(and:int(var_0_30D:int, ldc:int(8192)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_30D:int, ldc:int(2048)), ldc:int(0))) {
                goto(Label_0578)
            }
            
            var_0_30D = and:int(var_0_30D:int, ldc:int(-302770277))
            var_5_240 = add:int(var_5_240:int, ldc:int(-1))
            storeelement:byte(var_3_23F:byte[], var_5_240:int, xor:byte(loadelement:byte(stack_328_0:byte[], var_5_240:int), ldc:byte(20)))
            
            if (cmpne:boolean(var_5_240:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A4_0 = stack_A2_0 = stack_DA_0 = stack_DC_0 = stack_123_0 = stack_125_0 = stack_16A_0 = stack_16C_0 = stack_1B1_0 = stack_269_0 = stack_2BA_0 = stack_328_0 = stack_387_0 = stack_40D_0 = var_3_23F:byte[]
            goto(Label_0225)
        }
        
        var_0_30D = and:int(var_0_30D:int, ldc:int(1960268594))
        Label_0855:
        
        while (cmpeq:boolean(and:int(var_0_30D:int, ldc:int(2048)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_30D:int, ldc:int(128)), ldc:int(0))) {
                var_0_30D = and:int(var_0_30D:int, ldc:int(1812215728))
                goto(Label_0578)
            }
            
            var_0_3A1 = and:int(var_0_30D:int, ldc:int(-436978467))
            var_5_240 = add:int(var_5_240:int, ldc:int(-1))
            expr_387 = stack_3D8_2 = loadelement(stack_387_0, var_5_240)
            
            if (cmplt:boolean(add:int(add:int(var_5_240:int, ldc:int(1)), neg:int(var_4_23A:int)), ldc:int(0))) {
                stack_3D8_2 = stack_3AD_0 = add:byte(expr_387:byte, loadelement:byte(var_3_23F:byte[], add:int(var_5_240:int, ldc:int(1))))
                goto(Label_0957)
            }
            
            Label_0916:
            
            if (cmpne:boolean(and:int(var_0_3A1:int, ldc:int(512)), ldc:int(0))) {
                var_0_3A1 = and:int(var_0_3A1:int, ldc:int(-1990131793))
            }
            else {
                var_0_3A1 = and:int(var_0_3A1:int, ldc:int(-1445874529))
                stack_3D8_2 = stack_3AD_0 = add:byte(expr_387:byte, ldc:byte(1))
            }
            
            Label_0957:
            
            if (cmpne:boolean(and:int(var_0_3A1:int, ldc:int(67108864)), ldc:int(0))) {
                var_0_3A1 = and:int(var_0_3A1:int, ldc:int(2034864610))
                goto(Label_0916)
            }
            
            var_0_30D = and:int(var_0_3A1:int, ldc:int(-2116685909))
            storeelement:byte(var_3_23F:byte[], var_5_240:int, stack_3D8_2:byte)
            
            if (cmpne:boolean(var_5_240:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A4_0 = stack_A2_0 = stack_DA_0 = stack_DC_0 = stack_123_0 = stack_125_0 = stack_16A_0 = stack_16C_0 = stack_1B1_0 = stack_269_0 = stack_2BA_0 = stack_328_0 = stack_387_0 = stack_40D_0 = var_3_23F:byte[]
            goto(Label_0298)
        }
        
        var_0_30D = and:int(var_0_30D:int, ldc:int(1894079325))
        goto(Label_0769)
        Label_0115:
        
        if (cmpne:boolean(and:int(var_0_30D:int, ldc:int(262144)), ldc:int(0))) {
            var_0_30D = and:int(var_0_30D:int, ldc:int(-33253267))
            goto(Label_0369)
        }
        
        if (cmpeq:boolean(and:int(var_0_30D:int, ldc:int(128)), ldc:int(0))) {
            goto(Label_0298)
        }
        
        if (cmpne:boolean(and:int(var_0_30D:int, ldc:int(2097152)), ldc:int(0))) {
            goto(Label_0225)
        }
        
        if (cmpne:boolean(and:int(var_0_30D:int, ldc:int(8388608)), ldc:int(0))) {
            var_0_30D = and:int(var_0_30D:int, ldc:int(-573135139))
            var_2_A2 = stack_A2_0:byte[]
            expr_A6 = add:int(arraylength:int(stack_A4_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_A6:int, ldc:int(0))) {
                var_3_2A8 = newarray:byte[](byte.class, expr_A6:int)
                var_5_2A9 = expr_A6:int
                
                loop {
                    var_0_30D = and:int(var_0_30D:int, ldc:int(-677894677))
                    var_5_2A9 = add:int(var_5_2A9:int, ldc:int(-1))
                    storeelement:byte(var_3_2A8:byte[], var_5_2A9:int, add:int(shl:int(loadelement:byte(stack_2BA_0:byte[], var_5_2A9:int), ldc:int(2)), and:int(shr:int(loadelement:byte(var_2_A2:byte[], add:int(var_5_2A9:int, xor:int(ldc:int(6720), ldc:int(6721)))), ldc:int(6)), xor:int(ldc:int(9252), ldc:int(9255)))))
                    
                    if (cmpne:boolean(var_5_2A9:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_A4_0 = stack_A2_0 = stack_DA_0 = stack_DC_0 = stack_123_0 = stack_125_0 = stack_16A_0 = stack_16C_0 = stack_1B1_0 = stack_269_0 = stack_2BA_0 = stack_328_0 = stack_387_0 = stack_40D_0 = var_3_2A8:byte[]
            }
        }
        
        Label_0171:
        
        if (cmpne:boolean(and:int(var_0_30D:int, ldc:int(134217728)), ldc:int(0))) {
            var_0_30D = and:int(var_0_30D:int, ldc:int(-834435360))
            goto(Label_0369)
        }
        
        if (cmpeq:boolean(and:int(var_0_30D:int, ldc:int(8388608)), ldc:int(0))) {
            goto(Label_0298)
        }
        
        if (cmpeq:boolean(and:int(var_0_30D:int, ldc:int(131072)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_30D:int, ldc:int(16777216)), ldc:int(0))) {
                goto(Label_0115)
            }
            
            var_0_30D = and:int(var_0_30D:int, ldc:int(-1818929527))
            expr_DC = arraylength:int(stack_DC_0:byte[])
            
            if (cmpne:boolean(expr_DC:int, ldc:int(0))) {
                var_4_23A = expr_DC:int
                var_3_23F = newarray:byte[](byte.class, expr_DC:int)
                var_5_240 = expr_DC:int
                goto(Label_0769)
            }
        }
        
        Label_0225:
        
        if (cmpeq:boolean(and:int(var_0_30D:int, ldc:int(1024)), ldc:int(0))) {
            var_0_30D = and:int(var_0_30D:int, ldc:int(-381059302))
            goto(Label_0369)
        }
        
        if (cmpeq:boolean(and:int(var_0_30D:int, ldc:int(512)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_30D:int, ldc:int(1048576)), ldc:int(0))) {
                var_0_30D = and:int(var_0_30D:int, ldc:int(628605596))
                goto(Label_0171)
            }
            
            if (cmpne:boolean(and:int(var_0_30D:int, ldc:int(262144)), ldc:int(0))) {
                var_0_30D = and:int(var_0_30D:int, ldc:int(-866969256))
                goto(Label_0115)
            }
            
            var_0_30D = and:int(var_0_30D:int, ldc:int(-975720983))
            expr_125 = arraylength:int(stack_125_0:byte[])
            
            if (cmpne:boolean(expr_125:int, ldc:int(0))) {
                var_4_23A = expr_125:int
                var_3_23F = newarray:byte[](byte.class, expr_125:int)
                var_5_240 = expr_125:int
                goto(Label_0855)
            }
        }
        
        Label_0298:
        
        if (cmpne:boolean(and:int(var_0_30D:int, ldc:int(1048576)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_30D:int, ldc:int(16777216)), ldc:int(0))) {
                var_0_30D = and:int(var_0_30D:int, ldc:int(1579937120))
                goto(Label_0225)
            }
            
            if (cmpne:boolean(and:int(var_0_30D:int, ldc:int(131072)), ldc:int(0))) {
                var_0_30D = and:int(var_0_30D:int, ldc:int(-1983148122))
                goto(Label_0171)
            }
            
            if (cmpne:boolean(and:int(var_0_30D:int, ldc:int(67108864)), ldc:int(0))) {
                var_0_30D = and:int(var_0_30D:int, ldc:int(1189618349))
                goto(Label_0115)
            }
            
            var_0_30D = and:int(var_0_30D:int, ldc:int(-673634369))
            expr_16C = arraylength:int(stack_16C_0:byte[])
            
            if (cmpne:boolean(expr_16C:int, ldc:int(0))) {
                var_3_3FB = newarray:byte[](byte.class, expr_16C:int)
                var_5_3FC = expr_16C:int
                
                loop {
                    var_0_30D = and:int(var_0_30D:int, ldc:int(-1953114947))
                    var_5_3FC = add:int(var_5_3FC:int, ldc:int(-1))
                    storeelement:byte(var_3_3FB:byte[], var_5_3FC:int, add:byte(loadelement:byte(stack_40D_0:byte[], var_5_3FC:int), ldc:byte(41)))
                    
                    if (cmpne:boolean(var_5_3FC:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_A4_0 = stack_A2_0 = stack_DA_0 = stack_DC_0 = stack_123_0 = stack_125_0 = stack_16A_0 = stack_16C_0 = stack_1B1_0 = stack_269_0 = stack_2BA_0 = stack_328_0 = stack_387_0 = stack_40D_0 = var_3_3FB:byte[]
            }
        }
        
        Label_0369:
        
        if (cmpne:boolean(and:int(var_0_30D:int, ldc:int(131072)), ldc:int(0))) {
            var_0_30D = and:int(var_0_30D:int, ldc:int(-1941642853))
            goto(Label_0298)
        }
        
        if (cmpne:boolean(and:int(var_0_30D:int, ldc:int(512)), ldc:int(0))) {
            var_0_30D = and:int(var_0_30D:int, ldc:int(-1394342162))
            goto(Label_0225)
        }
        
        if (cmpne:boolean(and:int(var_0_30D:int, ldc:int(8192)), ldc:int(0))) {
            goto(Label_0171)
        }
        
        if (cmpne:boolean(and:int(var_0_30D:int, ldc:int(4)), ldc:int(0))) {
            var_0_30D = and:int(var_0_30D:int, ldc:int(416067212))
            goto(Label_0115)
        }
        
        var_3_1BD = initobject:String(String::<init>, stack_1B1_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
        stack_226_0 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(711), ldc:int(1075)))
        expr_1CF = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(2567), ldc:int(4099)))
        storeelement:String(expr_1CF:String[], xor:int(ldc:int(-23551), ldc:int(-23552)), invokevirtual:String[expected:String](String::substring, var_3_1BD:String, and:int(ldc:int(-1080), ldc:int(1047)), xor:int(ldc:int(9230), ldc:int(9277))))
        storeelement:String(expr_1CF:String[], xor:int(ldc:int(544), ldc:int(546)), invokevirtual:String[expected:String](String::substring, var_3_1BD:String, and:int(ldc:int(435), ldc:int(631)), and:int(ldc:int(12596), ldc:int(16956))))
        storeelement:String(expr_1CF:String[], and:int(ldc:int(-28963), ldc:int(28930)), invokevirtual:String[expected:String](String::substring, var_3_1BD:String, and:int(ldc:int(12532), ldc:int(2358)), xor:int(ldc:int(16463), ldc:int(16501))))
        putstatic:String[](\ub70c\uc910\u071d\uc2e8\ufe34\u120d::\ub7dc\ucef1\u8d98\uc238\ua562\u7bad, expr_1CF:String[])
        putstatic:\ub83f\u6c52\u12cb\u3c25\u3776[](\ub70c\uc910\u071d\uc2e8\ufe34\u120d::\u12cb\u74b1\ube23\u8bb0\u4daf\u5140, newarray:\ub83f\u6c52\u12cb\u3c25\u3776[](\u51b2\u6fb0\ufcaf\u61a4\u0800.\uc7fe\ua61f\ub18d\u64ab\u4f4a.\ub83f\u6c52\u12cb\u3c25\u3776.class, and:int(ldc:int(27960), ldc:int(-28027))))
    }
    
    public void \u8cae\u5f50\u3e75\uceb8\u873d\ua3b4(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_676 : int
        var_5_80 : int
        var_6_87 : int
        var_7_96 : double
        var_9_C6 : double
        var_3_D8 : int
        var_11_E9 : int
        var_14_113 : double
        var_16_117 : int
        var_12_10F : double
        var_17_681 : int
        
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
        var_3_676 = and:int(ldc:int(650614683), ldc:int(667396058))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\ub70c\uc910\u071d\uc2e8\ufe34\u120d[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0170)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_676:int, ldc:int(67108864)), ldc:int(0))) {
            var_3_676 = and:int(var_3_676:int, ldc:int(-404758626))
            var_5_80 = and:int(ldc:int(-32060), ldc:int(18747))
            var_6_87 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_96 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(4385), ldc:int(-4386)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C6 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D8 = and:int(var_3_676:int, ldc:int(910419834))
                    var_9_C6 = sub:double(var_7_96:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E9 = var_5_80:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E9:int, sub:int(var_6_87:int, and:int(ldc:int(337), ldc:int(8365)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E9:int, and:int(ldc:int(1281), ldc:int(25105)))), var_7_96:double))) {
                        inc:int(var_11_E9, ldc:int(1))
                    }
                    
                    var_3_676 = and:int(var_3_D8:int, ldc:int(384030591))
                    var_14_113 = var_7_96:double
                    var_16_117 = var_11_E9:int
                }
                else {
                    var_11_E9 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_80:int), and:int(ldc:int(3921), ldc:int(16551)))
                    var_12_10F = var_14_113 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_80)
                    
                    if (cmplt:boolean(var_16_117 = var_11_E9:int, var_6_87:int)) {
                        var_9_C6 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E9:int)
                        var_16_117 = var_11_E9:int
                        var_14_113 = var_12_10F:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_676:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1534)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_676:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1391)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_676:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1239)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_676:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_676 = and:int(var_3_676:int, ldc:int(-281746155))
                        goto(Label_1125)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_676:int, ldc:int(512)), ldc:int(0))) {
                        var_3_676 = and:int(var_3_676:int, ldc:int(965627457))
                        goto(Label_0958)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_676:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0812)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_676:int, ldc:int(512)), ldc:int(0))) {
                        var_3_676 = and:int(var_3_676:int, ldc:int(-1198767169))
                        goto(Label_0663)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_676:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0549)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_676:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_676 = and:int(var_3_676:int, ldc:int(1718347640))
                        
                        if (cmplt:boolean(var_16_117:int, var_6_87:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0549)
                            }
                            
                            goto(Label_0812)
                        }
                    }
                    
                    Label_0395:
                    
                    if (cmpeq:boolean(and:int(var_3_676:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1534)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_676:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1391)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_676:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_676 = and:int(var_3_676:int, ldc:int(198176475))
                        goto(Label_1239)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_676:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_676 = and:int(var_3_676:int, ldc:int(1093784736))
                        goto(Label_1125)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_676:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0958)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_676:int, ldc:int(256)), ldc:int(0))) {
                        var_3_676 = and:int(var_3_676:int, ldc:int(1515041089))
                        goto(Label_0812)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_676:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0663)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_676:int, ldc:int(33554432)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_676:int, ldc:int(4)), ldc:int(0))) {
                            var_3_676 = and:int(var_3_676:int, ldc:int(1448066911))
                            var_11_E9 = and:int(ldc:int(-20753), ldc:int(20752))
                            goto(Label_1523)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0549:
                    
                    if (cmpne:boolean(and:int(var_3_676:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1534)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_676:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_676 = and:int(var_3_676:int, ldc:int(47262623))
                        goto(Label_1391)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_676:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_676 = and:int(var_3_676:int, ldc:int(1311312092))
                        goto(Label_1239)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_676:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1125)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_676:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0958)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_676:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0812)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_676:int, ldc:int(4)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_676:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0395)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_676:int, ldc:int(16)), ldc:int(0))) {
                            var_3_676 = and:int(var_3_676:int, ldc:int(993824908))
                            loopcontinue()
                        }
                        
                        var_3_676 = and:int(var_3_676:int, ldc:int(377220990))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_113 = var_9_C6:double
                            goto(Label_0812)
                        }
                    }
                    
                    Label_0663:
                    
                    if (cmpeq:boolean(and:int(var_3_676:int, ldc:int(256)), ldc:int(0))) {
                        var_3_676 = and:int(var_3_676:int, ldc:int(231039925))
                        goto(Label_1534)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_676:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_676 = and:int(var_3_676:int, ldc:int(1610483108))
                        goto(Label_1391)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_676:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_676 = and:int(var_3_676:int, ldc:int(-643387020))
                        goto(Label_1239)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_676:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1125)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_676:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0958)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_676:int, ldc:int(8)), ldc:int(0))) {
                        var_3_676 = and:int(var_3_676:int, ldc:int(-1777048618))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_676:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0549)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_676:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_676 = and:int(var_3_676:int, ldc:int(-531605168))
                            goto(Label_0395)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_676:int, ldc:int(256)), ldc:int(0))) {
                            var_3_676 = and:int(var_3_676:int, ldc:int(-417605691))
                            loopcontinue()
                        }
                        
                        var_3_676 = and:int(var_3_676:int, ldc:int(1599594365))
                        var_14_113 = mul:double(ldc:double(0.5), add:double(var_9_C6:double, var_14_113:double))
                    }
                    
                    Label_0812:
                    
                    if (cmpeq:boolean(and:int(var_3_676:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_676 = and:int(var_3_676:int, ldc:int(1586639871))
                        goto(Label_1534)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_676:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_676 = and:int(var_3_676:int, ldc:int(-1444972201))
                        goto(Label_1391)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_676:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1239)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_676:int, ldc:int(16)), ldc:int(0))) {
                        var_3_676 = and:int(var_3_676:int, ldc:int(1316580693))
                        goto(Label_1125)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_676:int, ldc:int(33554432)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_676:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_676 = and:int(var_3_676:int, ldc:int(1956468847))
                            goto(Label_0663)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_676:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_676 = and:int(var_3_676:int, ldc:int(1838856895))
                            goto(Label_0549)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_676:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_676 = and:int(var_3_676:int, ldc:int(-284571382))
                            goto(Label_0395)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_676:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_676 = and:int(var_3_676:int, ldc:int(170054039))
                            loopcontinue()
                        }
                        
                        var_3_676 = and:int(var_3_676:int, ldc:int(131843964))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_80:int), var_7_96:double)) {
                                var_11_E9 = and:int(ldc:int(17441), ldc:int(285))
                                goto(Label_1125)
                            }
                        }
                    }
                    
                    Label_0958:
                    
                    if (cmpeq:boolean(and:int(var_3_676:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_676 = and:int(var_3_676:int, ldc:int(1785397481))
                        goto(Label_1534)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_676:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_676 = and:int(var_3_676:int, ldc:int(1222954720))
                        goto(Label_1391)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_676:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_676 = and:int(var_3_676:int, ldc:int(-900035023))
                        goto(Label_1239)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_676:int, ldc:int(2048)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_676:int, ldc:int(256)), ldc:int(0))) {
                            var_3_676 = and:int(var_3_676:int, ldc:int(-1831798256))
                            goto(Label_0812)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_676:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_676 = and:int(var_3_676:int, ldc:int(228246601))
                            goto(Label_0663)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_676:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0549)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_676:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0395)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_676:int, ldc:int(32768)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_676 = and:int(var_3_676:int, ldc:int(1853357854))
                        var_11_E9 = and:int(ldc:int(-16237), ldc:int(14956))
                    }
                    
                    Label_1125:
                    
                    if (cmpeq:boolean(and:int(var_3_676:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_676 = and:int(var_3_676:int, ldc:int(467336682))
                        goto(Label_1534)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_676:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1391)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_676:int, ldc:int(4)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_676:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0958)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_676:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0812)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_676:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_676 = and:int(var_3_676:int, ldc:int(2061663071))
                            goto(Label_0663)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_676:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0549)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_676:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0395)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_676:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_676 = and:int(var_3_676:int, ldc:int(1204996688))
                            loopcontinue()
                        }
                        
                        var_3_676 = and:int(var_3_676:int, ldc:int(-1085831299))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E9:int, ldc:int(0))) {
                                goto(Label_1391)
                            }
                        }
                    }
                    
                    Label_1239:
                    
                    if (cmpeq:boolean(and:int(var_3_676:int, ldc:int(512)), ldc:int(0))) {
                        var_3_676 = and:int(var_3_676:int, ldc:int(-1174874201))
                        goto(Label_1534)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_676:int, ldc:int(8)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_676:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_676 = and:int(var_3_676:int, ldc:int(-2105233221))
                            goto(Label_1125)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_676:int, ldc:int(4)), ldc:int(0))) {
                            var_3_676 = and:int(var_3_676:int, ldc:int(2121217950))
                            goto(Label_0958)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_676:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0812)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_676:int, ldc:int(8)), ldc:int(0))) {
                            var_3_676 = and:int(var_3_676:int, ldc:int(-1602699079))
                            goto(Label_0663)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_676:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_676 = and:int(var_3_676:int, ldc:int(-542114723))
                            goto(Label_0549)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_676:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0395)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_676:int, ldc:int(8)), ldc:int(0))) {
                            var_3_676 = and:int(var_3_676:int, ldc:int(1055621071))
                            loopcontinue()
                        }
                        
                        var_3_676 = and:int(var_3_676:int, ldc:int(927967230))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_113:double, var_5_80:int, var_16_117:int)
                        goto(Label_1523)
                    }
                    
                    Label_1391:
                    
                    if (cmpeq:boolean(and:int(var_3_676:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1534)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_676:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_676 = and:int(var_3_676:int, ldc:int(1450002522))
                        goto(Label_1239)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_676:int, ldc:int(16)), ldc:int(0))) {
                        var_3_676 = and:int(var_3_676:int, ldc:int(-1387485730))
                        goto(Label_1125)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_676:int, ldc:int(512)), ldc:int(0))) {
                        var_3_676 = and:int(var_3_676:int, ldc:int(621405963))
                        goto(Label_0958)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_676:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0812)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_676:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0663)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_676:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0549)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_676:int, ldc:int(8)), ldc:int(0))) {
                        var_3_676 = and:int(var_3_676:int, ldc:int(-322150377))
                        goto(Label_0395)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_676:int, ldc:int(67108864)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_676 = and:int(var_3_676:int, ldc:int(1853345567))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_113:double, ldc:double(0.0))
                    Label_1523:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_681 = var_5_80:int
                        
                        if (cmpeq:boolean(var_11_E9:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1534:
                    
                    if (cmpeq:boolean(and:int(var_3_676:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_676 = and:int(var_3_676:int, ldc:int(-552840845))
                        goto(Label_1391)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_676:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1239)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_676:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_676 = and:int(var_3_676:int, ldc:int(-1698585050))
                        goto(Label_1125)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_676:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0958)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_676:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0812)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_676:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_676 = and:int(var_3_676:int, ldc:int(565578545))
                        goto(Label_0663)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_676:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0549)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_676:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_676 = and:int(var_3_676:int, ldc:int(231077217))
                        goto(Label_0395)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_676:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_676 = and:int(var_3_676:int, ldc:int(1207416830))
                        var_17_681 = add:int(var_16_117:int, xor:int(ldc:int(19520), ldc:int(19521)))
                        looporswitchbreak()
                    }
                    
                    var_3_676 = and:int(var_3_676:int, ldc:int(918333152))
                }
                
                var_3_676 = and:int(var_3_676:int, ldc:int(-958406754))
                
                if (cmple:boolean(var_5_80 = var_17_681:int, sub:int(var_6_87:int, xor:int(ldc:int(1536), ldc:int(1537))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0170:
        
        if (cmpne:boolean(and:int(var_3_676:int, ldc:int(16384)), ldc:int(0))) {
            var_3_676 = and:int(var_3_676:int, ldc:int(-398421153))
            goto(Label_0108)
        }
    }
}
