public class \u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u183a\u965f\u6ec6\u6b0d\u647c\u16f6 {
    public void \u183a\u965f\u6ec6\u6b0d\u647c\u16f6() {
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
            invokespecial:\u1833\ud171\u8350\ubded\u34df\uc9f6(\u1833\ud171\u8350\ubded\u34df\uc9f6::<init>, this:\u183a\u965f\u6ec6\u6b0d\u647c\u16f6, ldc:Class<\ud12e\ub18d\ud158\ud36e\ub8be\u56bd>(\u71f1\uc910\u3bc9\u516c\u93a2.\ud12e\ub18d\ud158\ud36e\ub8be\u56bd.class))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public \u71f1\uc910\u3bc9\u516c\u93a2.\ud12e\ub18d\ud158\ud36e\ub8be\u56bd \u4d85\uff55\uc3e3\ud4fe\u9937\uc229(io.netty.buffer.ByteBuf p0) {
        var_2_16A : int
        var_4_64 : int
        var_5_6A : int
        var_6_70 : boolean
        var_7_79 : int
        var_8_85 : \ub83f\u6c52\u12cb\u3c25\u3776
        var_9_94 : \u4975\u1833\u446c\u5bc4\ubded\u4f4a[]
        var_10_9D : int
        stack_1AA_0 : int[] [generated]
        var_11_16F : short
        var_12_17B : \u4975\u1833\u446c\u5bc4\ubded\u4f4a
        var_10_1AA : int[]
        var_11_1F8 : int
        var_11_1C5 : ArrayList<\ub83f\u6c52\u12cb\u3c25\u3776>
        var_12_22A : byte[]
        
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
            var_2_16A = and:int(ldc:int(1842893734), ldc:int(1807186941))
            var_4_64 = invokevirtual:int(ByteBuf::readInt, p0:ByteBuf)
            var_5_6A = invokevirtual:int(ByteBuf::readInt, p0:ByteBuf)
            var_6_70 = invokevirtual:boolean(ByteBuf::readBoolean, p0:ByteBuf)
            var_7_79 = invokevirtual:int(\uceb8\u4c2b\ub8be\u7049\u8308\u3a62::\uc4d2\uf94d\u6d69\u6b5f\ucef1\u624e, getstatic:\uceb8\u4c2b\ub8be\u7049\u8308\u3a62(\u1833\ud171\u8350\ubded\u34df\uc9f6::\ud523\u62da\u6c52\u7043\ud217\u72f1), p0:ByteBuf)
            var_8_85 = checkcast:\ub83f\u6c52\u12cb\u3c25\u3776(\u51b2\u6fb0\ufcaf\u61a4\u0800.\uc7fe\ua61f\ub18d\u64ab\u4f4a.\ub83f\u6c52\u12cb\u3c25\u3776.class, invokevirtual:\ub83f\u6c52\u12cb\u3c25\u3776(\u8389\u494c\u527a\u8753\ub1b9\u8640<\ub83f\u6c52\u12cb\u3c25\u3776>::\u4d85\uff55\uc3e3\ud4fe\u9937\uc229, getstatic:\u1833\ud171\u8350\ubded\u34df\uc9f6<\ub83f\u6c52\u12cb\u3c25\u3776>[expected:\u8389\u494c\u527a\u8753\ub1b9\u8640<\ub83f\u6c52\u12cb\u3c25\u3776>](\u1833\ud171\u8350\ubded\u34df\uc9f6::\u3bc9\u5fe1\u4ab3\ub70c\u600f\u6fb0), p0:ByteBuf))
            invokevirtual:int(\uceb8\u4c2b\ub8be\u7049\u8308\u3a62::\uc4d2\uf94d\u6d69\u6b5f\ucef1\u624e, getstatic:\uceb8\u4c2b\ub8be\u7049\u8308\u3a62(\u1833\ud171\u8350\ubded\u34df\uc9f6::\ud523\u62da\u6c52\u7043\ud217\u72f1), p0:ByteBuf)
            var_9_94 = newarray:\u4975\u1833\u446c\u5bc4\ubded\u4f4a[](\u5d20\u97b7\u8753\u873d\u16f6.\u4975\u1833\u446c\u5bc4\ubded\u4f4a.class, ldc:int(16))
            var_10_9D = and:int(ldc:int(-32308), ldc:int(15411))
            
            loop {
                if (cmpeq:boolean(and:int(var_2_16A:int, ldc:int(536870912)), ldc:int(0))) {
                    goto(Label_0313)
                }
                
                if (cmpeq:boolean(and:int(var_2_16A:int, ldc:int(536870912)), ldc:int(0))) {
                    var_2_16A = and:int(var_2_16A:int, ldc:int(-354624929))
                    goto(Label_0247)
                }
                
                if (cmpeq:boolean(and:int(var_2_16A:int, ldc:int(8)), ldc:int(0))) {
                    var_2_16A = and:int(var_2_16A:int, ldc:int(1872007678))
                    
                    if (cmplt:boolean(var_10_9D:int, ldc:int(16))) {
                        if (cmpne:boolean(and:int(var_7_79:int, shl:int(xor:int(ldc:int(16388), ldc:int(16389)), var_10_9D:int)), ldc:int(0))) {
                            goto(Label_0313)
                        }
                        
                        goto(Label_0402)
                    }
                }
                
                Label_0200:
                
                if (cmpeq:boolean(and:int(var_2_16A:int, ldc:int(536870912)), ldc:int(0))) {
                    var_2_16A = and:int(var_2_16A:int, ldc:int(1347780274))
                    goto(Label_0313)
                }
                
                if (cmpeq:boolean(and:int(var_2_16A:int, ldc:int(134217728)), ldc:int(0))) {
                    var_2_16A = and:int(var_2_16A:int, ldc:int(604748630))
                }
                else {
                    if (cmpne:boolean(and:int(var_2_16A:int, ldc:int(64)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_2_16A = and:int(var_2_16A:int, ldc:int(-109624395))
                    
                    if (var_6_70:boolean) {
                        stack_1AA_0 = newarray:int[](int.class, xor:int(ldc:int(10459), ldc:int(10715)))
                        looporswitchbreak()
                    }
                }
                
                Label_0247:
                
                if (cmpne:boolean(and:int(var_2_16A:int, ldc:int(16777216)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_2_16A:int, ldc:int(128)), ldc:int(0))) {
                        var_2_16A = and:int(var_2_16A:int, ldc:int(-1705481242))
                        goto(Label_0200)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_16A:int, ldc:int(134217728)), ldc:int(0))) {
                        var_2_16A = and:int(var_2_16A:int, ldc:int(-1038603707))
                        loopcontinue()
                    }
                    
                    stack_1AA_0 = aconstnull:int[]()
                    looporswitchbreak()
                }
                
                Label_0313:
                
                if (cmpne:boolean(and:int(var_2_16A:int, ldc:int(131072)), ldc:int(0))) {
                    var_2_16A = and:int(var_2_16A:int, ldc:int(565033602))
                    goto(Label_0247)
                }
                
                if (cmpeq:boolean(and:int(var_2_16A:int, ldc:int(536870912)), ldc:int(0))) {
                    var_2_16A = and:int(var_2_16A:int, ldc:int(181074417))
                    goto(Label_0200)
                }
                
                if (cmpne:boolean(and:int(var_2_16A:int, ldc:int(2048)), ldc:int(0))) {
                    var_2_16A = and:int(var_2_16A:int, ldc:int(1284254197))
                    loopcontinue()
                }
                
                var_2_16A = and:int(var_2_16A:int, ldc:int(-282039834))
                var_11_16F = invokevirtual:short(ByteBuf::readShort, p0:ByteBuf)
                var_12_17B = checkcast:\u4975\u1833\u446c\u5bc4\ubded\u4f4a(\u5d20\u97b7\u8753\u873d\u16f6.\u4975\u1833\u446c\u5bc4\ubded\u4f4a.class, invokevirtual:\u4975\u1833\u446c\u5bc4\ubded\u4f4a(\u8389\u494c\u527a\u8753\ub1b9\u8640<\u4975\u1833\u446c\u5bc4\ubded\u4f4a>::\u4d85\uff55\uc3e3\ud4fe\u9937\uc229, getstatic:\u1833\ud171\u8350\ubded\u34df\uc9f6<\u4975\u1833\u446c\u5bc4\ubded\u4f4a>[expected:\u8389\u494c\u527a\u8753\ub1b9\u8640<\u4975\u1833\u446c\u5bc4\ubded\u4f4a>](\u61a4\u4c04\ub102\ufcaf\uc29a\u6435::\ufe34\u4f4a\u7049\u8640\u9af2\u600f), p0:ByteBuf))
                invokevirtual:void(\u4975\u1833\u446c\u5bc4\ubded\u4f4a::\u4179\u836c\ub32d\u156b\ud51e\u98a4, var_12_17B:\u4975\u1833\u446c\u5bc4\ubded\u4f4a, var_11_16F:short[expected:int])
                storeelement:\u4975\u1833\u446c\u5bc4\ubded\u4f4a(var_9_94:\u4975\u1833\u446c\u5bc4\ubded\u4f4a[], var_10_9D:int, var_12_17B:\u4975\u1833\u446c\u5bc4\ubded\u4f4a)
                Label_0402:
                var_2_16A = and:int(var_2_16A:int, ldc:int(-275419226))
                inc:int(var_10_9D, ldc:int(1))
            }
            
            var_10_1AA = stack_1AA_0:int[]
            
            if (var_6_70:boolean) {
                var_11_1F8 = and:int(ldc:int(24781), ldc:int(-25806))
                
                while (cmplt:boolean(var_11_1F8:int, and:int(ldc:int(27912), ldc:int(4436)))) {
                    storeelement:int(var_10_1AA:int[], var_11_1F8:int, invokevirtual:int(ByteBuf::readInt, p0:ByteBuf))
                    inc:int(var_11_1F8, ldc:int(1))
                }
            }
            
            var_11_1C5 = initobject:ArrayList<\ub83f\u6c52\u12cb\u3c25\u3776>(ArrayList<\ub83f\u6c52\u12cb\u3c25\u3776>::<init>, invokestatic:List<\ub83f\u6c52\u12cb\u3c25\u3776>[expected:Collection<? extends \ub83f\u6c52\u12cb\u3c25\u3776>](Arrays::asList, checkcast:\ub83f\u6c52\u12cb\u3c25\u3776[](\u51b2\u6fb0\ufcaf\u61a4\u0800.\uc7fe\ua61f\ub18d\u64ab\u4f4a.\ub83f\u6c52\u12cb\u3c25\u3776[].class, invokevirtual:\ub83f\u6c52\u12cb\u3c25\u3776[](\u8389\u494c\u527a\u8753\ub1b9\u8640<\ub83f\u6c52\u12cb\u3c25\u3776[]>::\u4d85\uff55\uc3e3\ud4fe\u9937\uc229, getstatic:\u1833\ud171\u8350\ubded\u34df\uc9f6<\ub83f\u6c52\u12cb\u3c25\u3776[]>[expected:\u8389\u494c\u527a\u8753\ub1b9\u8640<\ub83f\u6c52\u12cb\u3c25\u3776[]>](\u1833\ud171\u8350\ubded\u34df\uc9f6::\u760c\ucfaf\ub19c\u446c\u7873\u97b7), p0:ByteBuf))))
            
            if (cmpgt:boolean(invokevirtual:int(ByteBuf::readableBytes, p0:ByteBuf), ldc:int(0))) {
                var_12_22A = checkcast:byte[](byte[].class, invokevirtual:byte[](\u8389\u494c\u527a\u8753\ub1b9\u8640<byte[]>::\u4d85\uff55\uc3e3\ud4fe\u9937\uc229, getstatic:\u1833\ud171\u8350\ubded\u34df\uc9f6<byte[]>[expected:\u8389\u494c\u527a\u8753\ub1b9\u8640<byte[]>](\u1833\ud171\u8350\ubded\u34df\uc9f6::\u3bc9\u6bb9\u8709\uc3e3\u34df\ud158), p0:ByteBuf))
                
                if (invokevirtual:boolean(\uc29a\u7043\u3d4b\u93a2\uceb8\u7d52::\uc229\u3e2a\u76bc\ubb2b\ud523\u6435, invokestatic:\uc29a\u7043\u3d4b\u93a2\uceb8\u7d52(\u183a\u71ae\ubf56\u6d69\u4e72\u3d4b::\u3776\uf9c5\u3d4b\u72f1\u647c\ubf56))) {
                    invokevirtual:void(Logger::warning, invokeinterface:Logger(\u0b8e\u12cb\ud523\u8308\u6fb0\u4ab3::\u8709\u839e\uafe7\ua61f\u71ae\ud158, invokestatic:\u0b8e\u12cb\ud523\u8308\u6fb0\u4ab3(\u183a\u71ae\ubf56\u6d69\u4e72\u3d4b::\u836c\u527a\u76bc\u4492\u72f1\u98a4)), invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u183a\u965f\u6ec6\u6b0d\u647c\u16f6::\u516c\ubb2b\u4f4a\u9a18\uff55\u0b8e), and:int(ldc:int(25025), ldc:int(-25030)))), arraylength:int(var_12_22A:byte[])), loadelement:String(getstatic:String[](\u183a\u965f\u6ec6\u6b0d\u647c\u16f6::\u516c\ubb2b\u4f4a\u9a18\uff55\u0b8e), and:int(ldc:int(1027), ldc:int(10377)))), var_4_64:int), loadelement:String(getstatic:String[](\u183a\u965f\u6ec6\u6b0d\u647c\u16f6::\u516c\ubb2b\u4f4a\u9a18\uff55\u0b8e), and:int(ldc:int(21758), ldc:int(515)))), var_5_6A:int)))
                }
            }
            
            return:\ud12e\ub18d\ud158\ud36e\ub8be\u56bd(initobject:\u927d\ua3b4\u7330\u8df4\u99f7\u0a06(\u927d\ua3b4\u7330\u8df4\u99f7\u0a06::<init>, var_4_64:int, var_5_6A:int, var_6_70:boolean, and:int[expected:boolean](ldc:int(23618), ldc:int(-32195)), var_7_79:int, var_9_94:\u4975\u1833\u446c\u5bc4\ubded\u4f4a[], var_10_1AA:int[], var_8_85:\ub83f\u6c52\u12cb\u3c25\u3776, var_11_1C5:ArrayList<\ub83f\u6c52\u12cb\u3c25\u3776>[expected:List<\ub83f\u6c52\u12cb\u3c25\u3776>]))
        }
        
        goto(Label_0006)
    }
    
    public void \ud171\uc229\ufe34\u36d3\u5f50\uc2e8(io.netty.buffer.ByteBuf p0, \u71f1\uc910\u3bc9\u516c\u93a2.\ud12e\ub18d\ud158\ud36e\ub8be\u56bd p1) {
        var_3_5F : int
        var_3_591 : int
        var_5_218 : ByteBuf
        var_6_227 : int
        var_7_362 : \u4975\u1833\u446c\u5bc4\ubded\u4f4a
        stack_43C_0 : \uceb8\u4c2b\ub8be\u7049\u8308\u3a62 [generated]
        stack_43B_0 : int [generated]
        stack_43B_1 : int [generated]
        var_3_67B : int
        var_6_682 : int[]
        var_7_687 : int
        var_8_690 : int
        var_3_6C5 : int
        var_9_6CB : int
        var_3_6D9 : int
        
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
            var_3_5F = and:int(ldc:int(337011072), ldc:int(-40831057))
            
            loop {
                if (cmpne:boolean(and:int(var_3_5F:int, ldc:int(8388608)), ldc:int(0))) {
                    goto(Label_0451)
                }
                
                if (cmpne:boolean(and:int(var_3_5F:int, ldc:int(8388608)), ldc:int(0))) {
                    var_3_5F = and:int(var_3_5F:int, ldc:int(-1686278733))
                    goto(Label_0374)
                }
                
                if (cmpne:boolean(and:int(var_3_5F:int, ldc:int(4)), ldc:int(0))) {
                    goto(Label_0305)
                }
                
                if (cmpne:boolean(and:int(var_3_5F:int, ldc:int(524288)), ldc:int(0))) {
                    goto(Label_0222)
                }
                
                if (cmpeq:boolean(and:int(var_3_5F:int, ldc:int(16777216)), ldc:int(0))) {
                    var_3_5F = and:int(var_3_5F:int, ldc:int(394492919))
                    invokevirtual:ByteBuf(ByteBuf::writeInt, p0:ByteBuf, invokeinterface:int(\ud12e\ub18d\ud158\ud36e\ub8be\u56bd::\u718f\u64ab\uc9f6\uc246\u7006\ubff1, p1:\ud12e\ub18d\ud158\ud36e\ub8be\u56bd))
                }
                
                Label_0155:
                
                if (cmpne:boolean(and:int(var_3_5F:int, ldc:int(134217728)), ldc:int(0))) {
                    goto(Label_0451)
                }
                
                if (cmpeq:boolean(and:int(var_3_5F:int, ldc:int(128)), ldc:int(0))) {
                    var_3_5F = and:int(var_3_5F:int, ldc:int(1242969498))
                    goto(Label_0374)
                }
                
                if (cmpeq:boolean(and:int(var_3_5F:int, ldc:int(2147483647)), ldc:int(0))) {
                    goto(Label_0305)
                }
                
                if (cmpeq:boolean(and:int(var_3_5F:int, ldc:int(256)), ldc:int(0))) {
                    var_3_5F = and:int(var_3_5F:int, ldc:int(-1423784867))
                }
                else {
                    if (cmpeq:boolean(and:int(var_3_5F:int, ldc:int(268435456)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_5F = and:int(var_3_5F:int, ldc:int(-1782846063))
                    invokevirtual:ByteBuf(ByteBuf::writeInt, p0:ByteBuf, invokeinterface:int(\ud12e\ub18d\ud158\ud36e\ub8be\u56bd::\u5140\u946b\u8709\u8413\u4f4a\ub18d, p1:\ud12e\ub18d\ud158\ud36e\ub8be\u56bd))
                }
                
                Label_0222:
                
                if (cmpne:boolean(and:int(var_3_5F:int, ldc:int(536870912)), ldc:int(0))) {
                    var_3_5F = and:int(var_3_5F:int, ldc:int(-961213146))
                    goto(Label_0451)
                }
                
                if (cmpne:boolean(and:int(var_3_5F:int, ldc:int(16777216)), ldc:int(0))) {
                    var_3_5F = and:int(var_3_5F:int, ldc:int(1796987636))
                    goto(Label_0374)
                }
                
                if (cmpeq:boolean(and:int(var_3_5F:int, ldc:int(524288)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_3_5F:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5F = and:int(var_3_5F:int, ldc:int(382690281))
                        goto(Label_0155)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F:int, ldc:int(4)), ldc:int(0))) {
                        var_3_5F = and:int(var_3_5F:int, ldc:int(1991512237))
                        loopcontinue()
                    }
                    
                    var_3_5F = and:int(var_3_5F:int, ldc:int(1017111993))
                    invokevirtual:ByteBuf(ByteBuf::writeBoolean, p0:ByteBuf, invokeinterface:boolean(\ud12e\ub18d\ud158\ud36e\ub8be\u56bd::\u52d3\u4e72\u36d3\u56bd\u0b8e\ud4fe, p1:\ud12e\ub18d\ud158\ud36e\ub8be\u56bd))
                }
                
                Label_0305:
                
                if (cmpeq:boolean(and:int(var_3_5F:int, ldc:int(128)), ldc:int(0))) {
                    goto(Label_0451)
                }
                
                if (cmpeq:boolean(and:int(var_3_5F:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_3_5F = and:int(var_3_5F:int, ldc:int(-1560916423))
                }
                else {
                    if (cmpeq:boolean(and:int(var_3_5F:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0222)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0155)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_5F = and:int(var_3_5F:int, ldc:int(-635720209))
                        loopcontinue()
                    }
                    
                    var_3_5F = and:int(var_3_5F:int, ldc:int(-20627047))
                    invokevirtual:void(\uceb8\u4c2b\ub8be\u7049\u8308\u3a62::\u0c95\u6435\u3504\u36d3\u2dcc\u16f6, getstatic:\uceb8\u4c2b\ub8be\u7049\u8308\u3a62(\u1833\ud171\u8350\ubded\u34df\uc9f6::\ud523\u62da\u6c52\u7043\ud217\u72f1), p0:ByteBuf, invokeinterface:int(\ud12e\ub18d\ud158\ud36e\ub8be\u56bd::\u624e\u3d4b\u16f6\u416d\ub1b9\u36d3, p1:\ud12e\ub18d\ud158\ud36e\ub8be\u56bd))
                }
                
                Label_0374:
                
                if (cmpne:boolean(and:int(var_3_5F:int, ldc:int(8388608)), ldc:int(0))) {
                    var_3_5F = and:int(var_3_5F:int, ldc:int(-502667045))
                }
                else {
                    if (cmpeq:boolean(and:int(var_3_5F:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0305)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_5F = and:int(var_3_5F:int, ldc:int(1314911710))
                        goto(Label_0222)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0155)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_5F = and:int(var_3_5F:int, ldc:int(-555016080))
                        loopcontinue()
                    }
                    
                    var_3_5F = and:int(var_3_5F:int, ldc:int(1444894700))
                    invokevirtual:void(\ua3b4\ub1b9\u9af2\u3d64\uf94d\u3dd3<\ub83f\u6c52\u12cb\u3c25\u3776>::\ud171\uc229\ufe34\u36d3\u5f50\uc2e8, getstatic:\u1833\ud171\u8350\ubded\u34df\uc9f6<\ub83f\u6c52\u12cb\u3c25\u3776>[expected:\ua3b4\ub1b9\u9af2\u3d64\uf94d\u3dd3<\ub83f\u6c52\u12cb\u3c25\u3776>](\u1833\ud171\u8350\ubded\u34df\uc9f6::\u3bc9\u5fe1\u4ab3\ub70c\u600f\u6fb0), p0:ByteBuf, invokeinterface:\ub83f\u6c52\u12cb\u3c25\u3776(\ud12e\ub18d\ud158\ud36e\ub8be\u56bd::\u7bad\u64ab\uc87f\uc84e\u34df\u0800, p1:\ud12e\ub18d\ud158\ud36e\ub8be\u56bd))
                }
                
                Label_0451:
                
                if (cmpeq:boolean(and:int(var_3_5F:int, ldc:int(128)), ldc:int(0))) {
                    goto(Label_0374)
                }
                
                if (cmpne:boolean(and:int(var_3_5F:int, ldc:int(524288)), ldc:int(0))) {
                    var_3_5F = and:int(var_3_5F:int, ldc:int(2126483317))
                    goto(Label_0305)
                }
                
                if (cmpne:boolean(and:int(var_3_5F:int, ldc:int(4)), ldc:int(0))) {
                    var_3_5F = and:int(var_3_5F:int, ldc:int(-761108000))
                    goto(Label_0222)
                }
                
                if (cmpne:boolean(and:int(var_3_5F:int, ldc:int(8388608)), ldc:int(0))) {
                    var_3_5F = and:int(var_3_5F:int, ldc:int(-2143804835))
                    goto(Label_0155)
                }
                
                if (cmpeq:boolean(and:int(var_3_5F:int, ldc:int(8388608)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_3_5F = and:int(var_3_5F:int, ldc:int(-1029029025))
            }
            
            loop {
                var_3_591 = and:int(var_3_5F:int, ldc:int(-30835720))
                var_5_218 = invokeinterface:ByteBuf(ByteBufAllocator::buffer, invokevirtual:ByteBufAllocator(ByteBuf::alloc, p0:ByteBuf))
                
                try {
                    var_3_591 = and:int(var_3_591:int, ldc:int(384488876))
                    var_6_227 = and:int(ldc:int(-26067), ldc:int(24978))
                    Label_0553:
                    
                    while (cmpeq:boolean(and:int(var_3_591:int, ldc:int(134217728)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_591:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Block_56)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_591:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_1315)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_591:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_591 = and:int(var_3_591:int, ldc:int(-1832379793))
                            goto(Label_1192)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_591:int, ldc:int(256)), ldc:int(0))) {
                            var_3_591 = and:int(var_3_591:int, ldc:int(746619449))
                            goto(Label_1087)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_591:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_591 = and:int(var_3_591:int, ldc:int(1783247941))
                            goto(Label_0924)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_591:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0777)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_591:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_591 = and:int(var_3_591:int, ldc:int(668460848))
                        }
                        else {
                            var_3_591 = and:int(var_3_591:int, ldc:int(905374658))
                            
                            if (cmpge:boolean(var_6_227:int, ldc:int(16))) {
                                invokevirtual:ByteBuf(ByteBuf::readerIndex, var_5_218:ByteBuf, and:int(ldc:int(16415), ldc:int(-21024)))
                                goto(Label_0924)
                            }
                        }
                        
                        Label_0667:
                        
                        if (cmpne:boolean(and:int(var_3_591:int, ldc:int(4)), ldc:int(0))) {
                            goto(Block_63)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_591:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Block_64)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_591:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_591 = and:int(var_3_591:int, ldc:int(-1385768140))
                            goto(Label_1315)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_591:int, ldc:int(32)), ldc:int(0))) {
                            var_3_591 = and:int(var_3_591:int, ldc:int(942348764))
                            goto(Label_1192)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_591:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_1087)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_591:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0924)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_591:int, ldc:int(2)), ldc:int(0))) {
                            if (cmpne:boolean(and:int(var_3_591:int, ldc:int(524288)), ldc:int(0))) {
                                var_3_591 = and:int(var_3_591:int, ldc:int(495650628))
                                loopcontinue()
                            }
                            
                            var_3_591 = and:int(var_3_591:int, ldc:int(2081473509))
                        }
                        
                        Label_0777:
                        
                        if (cmpeq:boolean(and:int(var_3_591:int, ldc:int(256)), ldc:int(0))) {
                            looporswitchbreak()
                        }
                        
                        if (cmpne:boolean(and:int(var_3_591:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Block_72)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_591:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_1315)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_591:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_1192)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_591:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_1087)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_591:int, ldc:int(256)), ldc:int(0))) {
                            if (cmpne:boolean(and:int(var_3_591:int, ldc:int(134217728)), ldc:int(0))) {
                                var_3_591 = and:int(var_3_591:int, ldc:int(1690392158))
                                goto(Label_0667)
                            }
                            
                            if (cmpne:boolean(and:int(var_3_591:int, ldc:int(256)), ldc:int(0))) {
                                var_3_591 = and:int(var_3_591:int, ldc:int(2011653613))
                                var_7_362 = loadelement:\u4975\u1833\u446c\u5bc4\ubded\u4f4a(invokeinterface:\u4975\u1833\u446c\u5bc4\ubded\u4f4a[](\ud12e\ub18d\ud158\ud36e\ub8be\u56bd::\u52d3\u5bc4\u3c25\u8cae\ud7e8\u927d, p1:\ud12e\ub18d\ud158\ud36e\ub8be\u56bd), var_6_227:int)
                                
                                if (cmpne:boolean(var_7_362:\u4975\u1833\u446c\u5bc4\ubded\u4f4a, aconstnull:\u4975\u1833\u446c\u5bc4\ubded\u4f4a())) {
                                    invokevirtual:ByteBuf(ByteBuf::writeShort, var_5_218:ByteBuf, invokevirtual:int(\u4975\u1833\u446c\u5bc4\ubded\u4f4a::\u67e9\u5bc4\u5fe1\ub7dc\ud171\u8640, var_7_362:\u4975\u1833\u446c\u5bc4\ubded\u4f4a))
                                    invokevirtual:void(\ua3b4\ub1b9\u9af2\u3d64\uf94d\u3dd3<\u4975\u1833\u446c\u5bc4\ubded\u4f4a>::\ud171\uc229\ufe34\u36d3\u5f50\uc2e8, getstatic:\u1833\ud171\u8350\ubded\u34df\uc9f6<\u4975\u1833\u446c\u5bc4\ubded\u4f4a>[expected:\ua3b4\ub1b9\u9af2\u3d64\uf94d\u3dd3<\u4975\u1833\u446c\u5bc4\ubded\u4f4a>](\u61a4\u4c04\ub102\ufcaf\uc29a\u6435::\ufe34\u4f4a\u7049\u8640\u9af2\u600f), var_5_218:ByteBuf, var_7_362:\u4975\u1833\u446c\u5bc4\ubded\u4f4a)
                                }
                                
                                inc:int(var_6_227, ldc:int(1))
                                loopcontinue()
                            }
                            
                            loopcontinue()
                        }
                        
                        Label_0924:
                        
                        if (cmpne:boolean(and:int(var_3_591:int, ldc:int(2048)), ldc:int(0))) {
                            looporswitchbreak()
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_591:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_1471)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_591:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_591 = and:int(var_3_591:int, ldc:int(-761113814))
                            goto(Label_1315)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_591:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_591 = and:int(var_3_591:int, ldc:int(-228252767))
                            goto(Label_1192)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_591:int, ldc:int(128)), ldc:int(0))) {
                            if (cmpne:boolean(and:int(var_3_591:int, ldc:int(536870912)), ldc:int(0))) {
                                var_3_591 = and:int(var_3_591:int, ldc:int(-741060587))
                                goto(Label_0777)
                            }
                            
                            if (cmpne:boolean(and:int(var_3_591:int, ldc:int(2)), ldc:int(0))) {
                                var_3_591 = and:int(var_3_591:int, ldc:int(-57082598))
                                goto(Label_0667)
                            }
                            
                            if (cmpeq:boolean(and:int(var_3_591:int, ldc:int(268435456)), ldc:int(0))) {
                                var_3_591 = and:int(var_3_591:int, ldc:int(1502997145))
                                loopcontinue()
                            }
                            
                            var_3_591 = and:int(var_3_591:int, ldc:int(518553002))
                            stack_43C_0 = getstatic:\uceb8\u4c2b\ub8be\u7049\u8308\u3a62(\u1833\ud171\u8350\ubded\u34df\uc9f6::\ud523\u62da\u6c52\u7043\ud217\u72f1)
                            stack_43B_0 = invokevirtual:int(ByteBuf::readableBytes, var_5_218:ByteBuf)
                            
                            if (invokeinterface:boolean(\ud12e\ub18d\ud158\ud36e\ub8be\u56bd::\u6cfe\uc2bd\ud36e\u071d\u7049\u9937, p1:\ud12e\ub18d\ud158\ud36e\ub8be\u56bd)) {
                                var_3_591 = and:int(var_3_591:int, ldc:int(2134994854))
                                stack_43B_1 = and:int(ldc:int(13381), ldc:int(3848))
                            }
                            else {
                                stack_43B_1 = and:int(ldc:int(-7979), ldc:int(7978))
                            }
                            
                            var_3_591 = and:int(var_3_591:int, ldc:int(-1772357229))
                            invokevirtual:void(\uceb8\u4c2b\ub8be\u7049\u8308\u3a62::\u0c95\u6435\u3504\u36d3\u2dcc\u16f6, stack_43C_0:\uceb8\u4c2b\ub8be\u7049\u8308\u3a62, p0:ByteBuf, add:int(stack_43B_0:int, stack_43B_1:int))
                        }
                        
                        Label_1087:
                        
                        if (cmpeq:boolean(and:int(var_3_591:int, ldc:int(16384)), ldc:int(0))) {
                            looporswitchbreak()
                        }
                        
                        if (cmpne:boolean(and:int(var_3_591:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Block_90)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_591:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_1315)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_591:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_591 = and:int(var_3_591:int, ldc:int(751319926))
                        }
                        else {
                            if (cmpne:boolean(and:int(var_3_591:int, ldc:int(1024)), ldc:int(0))) {
                                var_3_591 = and:int(var_3_591:int, ldc:int(1789956125))
                                goto(Label_0924)
                            }
                            
                            if (cmpeq:boolean(and:int(var_3_591:int, ldc:int(256)), ldc:int(0))) {
                                goto(Label_0777)
                            }
                            
                            if (cmpne:boolean(and:int(var_3_591:int, ldc:int(536870912)), ldc:int(0))) {
                                goto(Label_0667)
                            }
                            
                            if (cmpeq:boolean(and:int(var_3_591:int, ldc:int(16384)), ldc:int(0))) {
                                var_3_591 = and:int(var_3_591:int, ldc:int(97135566))
                                loopcontinue()
                            }
                            
                            var_3_591 = and:int(var_3_591:int, ldc:int(2121057778))
                            invokevirtual:ByteBuf(ByteBuf::writeBytes, p0:ByteBuf, var_5_218:ByteBuf)
                        }
                        
                        Label_1192:
                        
                        if (cmpne:boolean(and:int(var_3_591:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Block_97)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_591:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Block_98)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_591:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_591 = and:int(var_3_591:int, ldc:int(-451479436))
                        }
                        else {
                            if (cmpne:boolean(and:int(var_3_591:int, ldc:int(536870912)), ldc:int(0))) {
                                goto(Label_1087)
                            }
                            
                            if (cmpne:boolean(and:int(var_3_591:int, ldc:int(1024)), ldc:int(0))) {
                                var_3_591 = and:int(var_3_591:int, ldc:int(-1700889448))
                                goto(Label_0924)
                            }
                            
                            if (cmpne:boolean(and:int(var_3_591:int, ldc:int(2)), ldc:int(0))) {
                                var_3_591 = and:int(var_3_591:int, ldc:int(2022009594))
                                goto(Label_0777)
                            }
                            
                            if (cmpne:boolean(and:int(var_3_591:int, ldc:int(1024)), ldc:int(0))) {
                                var_3_591 = and:int(var_3_591:int, ldc:int(1202966018))
                                goto(Label_0667)
                            }
                            
                            if (cmpne:boolean(and:int(var_3_591:int, ldc:int(1024)), ldc:int(0))) {
                                loopcontinue()
                            }
                            
                            var_3_591 = and:int(var_3_591:int, ldc:int(2096984462))
                            invokevirtual:boolean(ByteBuf::release, var_5_218:ByteBuf)
                        }
                        
                        Label_1315:
                        
                        if (cmpeq:boolean(and:int(var_3_591:int, ldc:int(67108864)), ldc:int(0))) {
                            looporswitchbreak()
                        }
                        
                        if (cmpne:boolean(and:int(var_3_591:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_1471)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_591:int, ldc:int(128)), ldc:int(0))) {
                            var_3_591 = and:int(var_3_591:int, ldc:int(683969653))
                            goto(Label_1192)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_591:int, ldc:int(4)), ldc:int(0))) {
                            var_3_591 = and:int(var_3_591:int, ldc:int(-721097446))
                            goto(Label_1087)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_591:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0924)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_591:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0777)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_591:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0667)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_591:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_1398)
                        }
                        
                        var_3_591 = and:int(var_3_591:int, ldc:int(-1666216601))
                    }
                    
                    goto(Label_1569)
                    Block_56:
                    var_3_591 = and:int(var_3_591:int, ldc:int(966636993))
                    goto(Label_1471)
                    Block_63:
                    var_3_591 = and:int(var_3_591:int, ldc:int(-681388884))
                    goto(Label_1569)
                    Block_64:
                    var_3_591 = and:int(var_3_591:int, ldc:int(-1995635124))
                    goto(Label_1471)
                    Block_72:
                    var_3_591 = and:int(var_3_591:int, ldc:int(-1604986538))
                    goto(Label_1471)
                    Block_90:
                    var_3_591 = and:int(var_3_591:int, ldc:int(-66726970))
                    goto(Label_1471)
                    Block_97:
                    var_3_591 = and:int(var_3_591:int, ldc:int(672760469))
                    goto(Label_1569)
                    Block_98:
                    var_3_591 = and:int(var_3_591:int, ldc:int(217116091))
                    goto(Label_1471)
                    Label_1398:
                    var_3_591 = and:int(var_3_591:int, ldc:int(-10101841))
                }
                finally {
                    loop {
                        if (cmpne:boolean(and:int(var_3_591:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_591 = and:int(var_3_591:int, ldc:int(1979609062))
                            invokevirtual:boolean(ByteBuf::release, var_5_218:ByteBuf)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_591:int, ldc:int(2)), ldc:int(0))) {
                            looporswitchbreak()
                        }
                        
                        var_3_591 = and:int(var_3_591:int, ldc:int(1672897564))
                    }
                    
                    var_3_591 = and:int(var_3_591:int, ldc:int(1601142761))
                }
                
                if (logicalnot:boolean(invokeinterface:boolean(\ud12e\ub18d\ud158\ud36e\ub8be\u56bd::\u6cfe\uc2bd\ud36e\u071d\u7049\u9937, p1:\ud12e\ub18d\ud158\ud36e\ub8be\u56bd))) {
                    looporswitchbreak()
                }
                
                Label_1471:
                
                if (cmpne:boolean(and:int(var_3_591:int, ldc:int(128)), ldc:int(0))) {
                    if (cmpne:boolean(and:int(var_3_591:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1315)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_591:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1192)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_591:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1087)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_591:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_591 = and:int(var_3_591:int, ldc:int(471323096))
                        goto(Label_0924)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_591:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_591 = and:int(var_3_591:int, ldc:int(-498375574))
                        goto(Label_0777)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_591:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_591 = and:int(var_3_591:int, ldc:int(1954822697))
                        goto(Label_0667)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_591:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_591 = and:int(var_3_591:int, ldc:int(87723124))
                        goto(Label_0553)
                    }
                    
                    var_3_591 = and:int(var_3_591:int, ldc:int(508282763))
                }
                
                Label_1569:
                
                if (cmpne:boolean(and:int(var_3_591:int, ldc:int(16777216)), ldc:int(0))) {
                    var_3_591 = and:int(var_3_591:int, ldc:int(-1855469848))
                    goto(Label_1471)
                }
                
                if (cmpeq:boolean(and:int(var_3_591:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_3_591 = and:int(var_3_591:int, ldc:int(856069509))
                    goto(Label_1315)
                }
                
                if (cmpne:boolean(and:int(var_3_591:int, ldc:int(2)), ldc:int(0))) {
                    var_3_591 = and:int(var_3_591:int, ldc:int(-114865662))
                    goto(Label_1192)
                }
                
                if (cmpeq:boolean(and:int(var_3_591:int, ldc:int(67108864)), ldc:int(0))) {
                    goto(Label_1087)
                }
                
                if (cmpne:boolean(and:int(var_3_591:int, ldc:int(4)), ldc:int(0))) {
                    goto(Label_0924)
                }
                
                if (cmpeq:boolean(and:int(var_3_591:int, ldc:int(268435456)), ldc:int(0))) {
                    goto(Label_0777)
                }
                
                if (cmpne:boolean(and:int(var_3_591:int, ldc:int(32)), ldc:int(0))) {
                    goto(Label_0667)
                }
                
                if (cmpne:boolean(and:int(var_3_591:int, ldc:int(536870912)), ldc:int(0))) {
                    goto(Label_0553)
                }
                
                var_3_67B = and:int(var_3_591:int, ldc:int(401431490))
                var_6_682 = invokeinterface:int[](\ud12e\ub18d\ud158\ud36e\ub8be\u56bd::\ub6ab\u946b\u4bc8\u12b2\u8389\ub113, p1:\ud12e\ub18d\ud158\ud36e\ub8be\u56bd)
                var_7_687 = arraylength:int(var_6_682:int[])
                var_8_690 = and:int(ldc:int(-9229), ldc:int(9228))
                
                loop {
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(32)), ldc:int(0))) {
                        var_3_591 = and:int(var_3_67B:int, ldc:int(58306638))
                    }
                    else {
                        var_3_591 = and:int(var_3_67B:int, ldc:int(1949095908))
                        
                        if (cmpge:boolean(var_8_690:int, var_7_687:int)) {
                            looporswitchbreak(Label_1810)
                        }
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_591:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_591:int, ldc:int(-1732551102))
                    }
                    else {
                        var_3_6C5 = and:int(var_3_591:int, ldc:int(1973935062))
                        var_9_6CB = loadelement:int(var_6_682:int[], var_8_690:int)
                        
                        loop {
                            if (cmpeq:boolean(and:int(var_3_6C5:int, ldc:int(67108864)), ldc:int(0))) {
                                var_3_6D9 = and:int(var_3_6C5:int, ldc:int(-1427952971))
                            }
                            else {
                                var_3_6D9 = and:int(var_3_6C5:int, ldc:int(1959150468))
                                invokevirtual:ByteBuf(ByteBuf::writeInt, p0:ByteBuf, and:int(var_9_6CB:int, and:int(ldc:int(2559), ldc:int(12543))))
                            }
                            
                            if (cmpeq:boolean(and:int(var_3_6D9:int, ldc:int(524288)), ldc:int(0))) {
                                looporswitchbreak()
                            }
                            
                            var_3_6C5 = and:int(var_3_6D9:int, ldc:int(1594208311))
                        }
                        
                        var_3_67B = and:int(var_3_6D9:int, ldc:int(-19701868))
                        inc:int(var_8_690, ldc:int(1))
                    }
                }
            }
            
            Label_1810:
            invokevirtual:void(\ua3b4\ub1b9\u9af2\u3d64\uf94d\u3dd3<\ub83f\u6c52\u12cb\u3c25\u3776[]>::\ud171\uc229\ufe34\u36d3\u5f50\uc2e8, getstatic:\u1833\ud171\u8350\ubded\u34df\uc9f6<\ub83f\u6c52\u12cb\u3c25\u3776[]>[expected:\ua3b4\ub1b9\u9af2\u3d64\uf94d\u3dd3<\ub83f\u6c52\u12cb\u3c25\u3776[]>](\u1833\ud171\u8350\ubded\u34df\uc9f6::\u760c\ucfaf\ub19c\u446c\u7873\u97b7), p0:ByteBuf, invokeinterface:\ub83f\u6c52\u12cb\u3c25\u3776[](List<\ub83f\u6c52\u12cb\u3c25\u3776>::toArray, invokeinterface:List<\ub83f\u6c52\u12cb\u3c25\u3776>(\ud12e\ub18d\ud158\ud36e\ub8be\u56bd::\u6ec6\ub83f\ud217\uc229\u74b1\ub32d, p1:\ud12e\ub18d\ud158\ud36e\ub8be\u56bd), newarray:\ub83f\u6c52\u12cb\u3c25\u3776[](\u51b2\u6fb0\ufcaf\u61a4\u0800.\uc7fe\ua61f\ub18d\u64ab\u4f4a.\ub83f\u6c52\u12cb\u3c25\u3776.class, and:int(ldc:int(-14455), ldc:int(14452)))))
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
            return:Object(invokevirtual:\ud12e\ub18d\ud158\ud36e\ub8be\u56bd[expected:Object](\u183a\u965f\u6ec6\u6b0d\u647c\u16f6::\u4d85\uff55\uc3e3\ud4fe\u9937\uc229, this:\u183a\u965f\u6ec6\u6b0d\u647c\u16f6, p0:ByteBuf))
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
            invokevirtual:void(\u183a\u965f\u6ec6\u6b0d\u647c\u16f6::\ud171\uc229\ufe34\u36d3\u5f50\uc2e8, this:\u183a\u965f\u6ec6\u6b0d\u647c\u16f6, p0:ByteBuf, checkcast:\ud12e\ub18d\ud158\ud36e\ub8be\u56bd(\u71f1\uc910\u3bc9\u516c\u93a2.\ud12e\ub18d\ud158\ud36e\ub8be\u56bd.class, p1:Object[expected:\ud12e\ub18d\ud158\ud36e\ub8be\u56bd]))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_1CA : int
        expr_6E : int [generated]
        stack_A4_0 : byte[] [generated]
        stack_A6_0 : byte[] [generated]
        stack_DB_0 : byte[] [generated]
        stack_DD_0 : byte[] [generated]
        stack_101_0 : byte[] [generated]
        stack_103_0 : byte[] [generated]
        stack_132_0 : byte[] [generated]
        stack_1DD_0 : byte[] [generated]
        stack_255_0 : byte[] [generated]
        stack_2E0_0 : byte[] [generated]
        stack_31B_0 : byte[] [generated]
        var_4_1AE : int
        var_3_1B3 : byte[]
        var_5_1B4 : int
        expr_1DD : byte [generated]
        var_0_24B : int
        expr_255 : byte [generated]
        stack_293_2 : byte [generated]
        stack_271_0 : byte [generated]
        expr_A6 : int [generated]
        expr_DD : int [generated]
        var_2_101 : byte[]
        expr_105 : int [generated]
        var_3_309 : byte[]
        var_5_30A : int
        var_3_13E : String
        stack_1A7_0 : String[] [generated]
        expr_150 : String[] [generated]
        
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
        var_0_1CA = and:int(ldc:int(-45675131), ldc:int(2116384921))
        expr_6E = arraylength:int(stack_A4_0 = stack_A6_0 = stack_DB_0 = stack_DD_0 = stack_101_0 = stack_103_0 = stack_132_0 = stack_1DD_0 = stack_255_0 = stack_2E0_0 = stack_31B_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("dGKXfn4d+GZoemp4Up+dYPObQFT6m2qFhf3Uj25qdANsev6TcmDw/2iFhw8o4OIucuUL4TSuiZWrJ28=")))
        
        if (cmpeq:boolean(expr_6E:int, ldc:int(0))) {
            goto(Label_0115)
        }
        
        var_4_1AE = expr_6E:int
        var_3_1B3 = newarray:byte[](byte.class, expr_6E:int)
        var_5_1B4 = expr_6E:int
        Label_0438:
        
        while (cmpne:boolean(and:int(var_0_1CA:int, ldc:int(262144)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_1CA:int, ldc:int(2147483647)), ldc:int(0))) {
                var_0_1CA = and:int(var_0_1CA:int, ldc:int(-657025549))
                goto(Label_0549)
            }
            
            var_0_1CA = and:int(var_0_1CA:int, ldc:int(1697990873))
            var_5_1B4 = add:int(var_5_1B4:int, ldc:int(-1))
            expr_1DD = loadelement:byte(stack_1DD_0:byte[], var_5_1B4:int)
            storeelement:byte(var_3_1B3:byte[], var_5_1B4:int, xor:int(or:int(and:int(shl:int(expr_1DD:byte, and:int(ldc:int(2316), ldc:int(20996))), ldc:int(-16)), and:int(shr:int(expr_1DD:byte[expected:int], xor:int(ldc:int(-31478), ldc:int(-31474))), ldc:int(15))), ldc:int(39)))
            
            if (cmpne:boolean(var_5_1B4:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A6_0 = stack_A4_0 = stack_DB_0 = stack_DD_0 = stack_101_0 = stack_103_0 = stack_132_0 = stack_1DD_0 = stack_255_0 = stack_2E0_0 = stack_31B_0 = var_3_1B3:byte[]
            goto(Label_0115)
        }
        
        goto(Label_0697)
        Label_0549:
        
        while (cmpne:boolean(and:int(var_0_1CA:int, ldc:int(262144)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_1CA:int, ldc:int(8)), ldc:int(0))) {
                var_0_1CA = and:int(var_0_1CA:int, ldc:int(296911662))
                goto(Label_0438)
            }
            
            var_0_24B = and:int(var_0_1CA:int, ldc:int(-64535651))
            var_5_1B4 = add:int(var_5_1B4:int, ldc:int(-1))
            expr_255 = stack_293_2 = loadelement(stack_255_0, var_5_1B4)
            
            if (cmplt:boolean(add:int(add:int(var_5_1B4:int, ldc:int(5)), neg:int(var_4_1AE:int)), ldc:int(0))) {
                stack_293_2 = stack_271_0 = add:byte(expr_255:byte, loadelement:byte(var_3_1B3:byte[], add:int(var_5_1B4:int, ldc:int(5))))
                goto(Label_0641)
            }
            
            Label_0610:
            
            if (cmpeq:boolean(and:int(var_0_24B:int, ldc:int(8)), ldc:int(0))) {
                var_0_24B = and:int(var_0_24B:int, ldc:int(-156827495))
                stack_293_2 = stack_271_0 = add:byte(expr_255:byte, ldc:byte(5))
            }
            
            Label_0641:
            
            if (cmpne:boolean(and:int(var_0_24B:int, ldc:int(8388608)), ldc:int(0))) {
                goto(Label_0610)
            }
            
            var_0_1CA = and:int(var_0_24B:int, ldc:int(1806682605))
            storeelement:byte(var_3_1B3:byte[], var_5_1B4:int, stack_293_2:byte)
            
            if (cmpne:boolean(var_5_1B4:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A6_0 = stack_A4_0 = stack_DB_0 = stack_DD_0 = stack_101_0 = stack_103_0 = stack_132_0 = stack_1DD_0 = stack_255_0 = stack_2E0_0 = stack_31B_0 = var_3_1B3:byte[]
            goto(Label_0171)
        }
        
        var_0_1CA = and:int(var_0_1CA:int, ldc:int(-1979773712))
        Label_0697:
        
        while (cmpne:boolean(and:int(var_0_1CA:int, ldc:int(536870912)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_1CA:int, ldc:int(16)), ldc:int(0))) {
                var_0_1CA = and:int(var_0_1CA:int, ldc:int(188088527))
                goto(Label_0438)
            }
            
            var_0_1CA = and:int(var_0_1CA:int, ldc:int(-104506949))
            var_5_1B4 = add:int(var_5_1B4:int, ldc:int(-1))
            storeelement:byte(var_3_1B3:byte[], var_5_1B4:int, add:byte(loadelement:byte(stack_2E0_0:byte[], var_5_1B4:int), ldc:byte(42)))
            
            if (cmpne:boolean(var_5_1B4:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A6_0 = stack_A4_0 = stack_DB_0 = stack_DD_0 = stack_101_0 = stack_103_0 = stack_132_0 = stack_1DD_0 = stack_255_0 = stack_2E0_0 = stack_31B_0 = var_3_1B3:byte[]
            goto(Label_0226)
        }
        
        goto(Label_0549)
        Label_0115:
        
        if (cmpeq:boolean(and:int(var_0_1CA:int, ldc:int(1073741824)), ldc:int(0))) {
            var_0_1CA = and:int(var_0_1CA:int, ldc:int(-2044450925))
            goto(Label_0266)
        }
        
        if (cmpne:boolean(and:int(var_0_1CA:int, ldc:int(8)), ldc:int(0))) {
            goto(Label_0226)
        }
        
        if (cmpeq:boolean(and:int(var_0_1CA:int, ldc:int(262144)), ldc:int(0))) {
            var_0_1CA = and:int(var_0_1CA:int, ldc:int(377113687))
        }
        else {
            var_0_1CA = and:int(var_0_1CA:int, ldc:int(1728512977))
            expr_A6 = arraylength:int(stack_A6_0:byte[])
            
            if (cmpne:boolean(expr_A6:int, ldc:int(0))) {
                var_4_1AE = expr_A6:int
                var_3_1B3 = newarray:byte[](byte.class, expr_A6:int)
                var_5_1B4 = expr_A6:int
                goto(Label_0549)
            }
        }
        
        Label_0171:
        
        if (cmpne:boolean(and:int(var_0_1CA:int, ldc:int(524288)), ldc:int(0))) {
            goto(Label_0266)
        }
        
        if (cmpne:boolean(and:int(var_0_1CA:int, ldc:int(32)), ldc:int(0))) {
            var_0_1CA = and:int(var_0_1CA:int, ldc:int(-1250724913))
        }
        else {
            if (cmpeq:boolean(and:int(var_0_1CA:int, ldc:int(128)), ldc:int(0))) {
                var_0_1CA = and:int(var_0_1CA:int, ldc:int(564170934))
                goto(Label_0115)
            }
            
            var_0_1CA = and:int(var_0_1CA:int, ldc:int(1921900267))
            expr_DD = arraylength:int(stack_DD_0:byte[])
            
            if (cmpne:boolean(expr_DD:int, ldc:int(0))) {
                var_4_1AE = expr_DD:int
                var_3_1B3 = newarray:byte[](byte.class, expr_DD:int)
                var_5_1B4 = expr_DD:int
                goto(Label_0697)
            }
        }
        
        Label_0226:
        
        if (cmpeq:boolean(and:int(var_0_1CA:int, ldc:int(16)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_1CA:int, ldc:int(2147483647)), ldc:int(0))) {
                goto(Label_0171)
            }
            
            if (cmpne:boolean(and:int(var_0_1CA:int, ldc:int(16)), ldc:int(0))) {
                goto(Label_0115)
            }
            
            var_0_1CA = and:int(var_0_1CA:int, ldc:int(-211856487))
            var_2_101 = stack_101_0:byte[]
            expr_105 = add:int(arraylength:int(stack_103_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_105:int, ldc:int(0))) {
                var_3_309 = newarray:byte[](byte.class, expr_105:int)
                var_5_30A = expr_105:int
                
                loop {
                    var_0_1CA = and:int(var_0_1CA:int, ldc:int(1688716421))
                    var_5_30A = add:int(var_5_30A:int, ldc:int(-1))
                    storeelement:byte(var_3_309:byte[], var_5_30A:int, add:int(shl:int(loadelement:byte(stack_31B_0:byte[], var_5_30A:int), ldc:int(3)), and:int(shr:int(loadelement:byte(var_2_101:byte[], add:int(var_5_30A:int, xor:int(ldc:int(-16318), ldc:int(-16317)))), ldc:int(5)), and:int(ldc:int(23), ldc:int(16935)))))
                    
                    if (cmpne:boolean(var_5_30A:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_A6_0 = stack_A4_0 = stack_DB_0 = stack_DD_0 = stack_101_0 = stack_103_0 = stack_132_0 = stack_1DD_0 = stack_255_0 = stack_2E0_0 = stack_31B_0 = var_3_309:byte[]
            }
        }
        
        Label_0266:
        
        if (cmpeq:boolean(and:int(var_0_1CA:int, ldc:int(1073741824)), ldc:int(0))) {
            goto(Label_0226)
        }
        
        if (cmpne:boolean(and:int(var_0_1CA:int, ldc:int(16)), ldc:int(0))) {
            var_0_1CA = and:int(var_0_1CA:int, ldc:int(-1335501078))
            goto(Label_0171)
        }
        
        if (cmpne:boolean(and:int(var_0_1CA:int, ldc:int(1)), ldc:int(0))) {
            var_3_13E = initobject:String(String::<init>, stack_132_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_1A7_0 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(1170), ldc:int(1169)))
            expr_150 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(13699), ldc:int(16403)))
            storeelement:String(expr_150:String[], and:int(ldc:int(5407), ldc:int(26689)), invokevirtual:String[expected:String](String::substring, var_3_13E:String, and:int(ldc:int(6548), ldc:int(-6623)), xor:int(ldc:int(-32232), ldc:int(-32213))))
            storeelement:String(expr_150:String[], and:int(ldc:int(1286), ldc:int(4267)), invokevirtual:String[expected:String](String::substring, var_3_13E:String, xor:int(ldc:int(4625), ldc:int(4642)), and:int(ldc:int(4404), ldc:int(18998))))
            storeelement:String(expr_150:String[], and:int(ldc:int(-10344), ldc:int(8295)), invokevirtual:String[expected:String](String::substring, var_3_13E:String, xor:int(ldc:int(-14287), ldc:int(-14331)), and:int(ldc:int(6842), ldc:int(17535))))
            putstatic:String[](\u183a\u965f\u6ec6\u6b0d\u647c\u16f6::\u516c\ubb2b\u4f4a\u9a18\uff55\u0b8e, expr_150:String[])
            return:void()
        }
        
        goto(Label_0115)
    }
    
    public void \u8cae\u5f50\u3e75\uceb8\u873d\ua3b4(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_679 : int
        var_5_81 : int
        var_6_88 : int
        var_7_97 : double
        var_9_C8 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
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
        var_3_679 = and:int(ldc:int(1254372108), ldc:int(-18877479))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u183a\u965f\u6ec6\u6b0d\u647c\u16f6[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0171)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_679:int, ldc:int(8192)), ldc:int(0))) {
            var_3_679 = and:int(var_3_679:int, ldc:int(-539495746))
            var_5_81 = and:int(ldc:int(-12118), ldc:int(11857))
            var_6_88 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_97 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-11043), ldc:int(11042)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C8 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_679:int, ldc:int(717010590))
                    var_9_C8 = sub:double(var_7_97:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_81:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_88:int, xor:int(ldc:int(114), ldc:int(115)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, xor:int(ldc:int(192), ldc:int(193)))), var_7_97:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_679 = and:int(var_3_DA:int, ldc:int(194996360))
                    var_14_115 = var_7_97:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_81:int), xor:int(ldc:int(12560), ldc:int(12561)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_88:int)) {
                        var_9_C8 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_679:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_679 = and:int(var_3_679:int, ldc:int(1554844240))
                        goto(Label_1557)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1422)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_679:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1265)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_679:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_679 = and:int(var_3_679:int, ldc:int(1880595023))
                        goto(Label_1146)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_679:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0983)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_679:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_679 = and:int(var_3_679:int, ldc:int(-158662955))
                        goto(Label_0857)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_679:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0711)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_679:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_679 = and:int(var_3_679:int, ldc:int(-1089003169))
                        goto(Label_0575)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(32)), ldc:int(0))) {
                        var_3_679 = and:int(var_3_679:int, ldc:int(-5952884))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_88:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0575)
                            }
                            
                            goto(Label_0857)
                        }
                    }
                    
                    Label_0405:
                    
                    if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1557)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_679 = and:int(var_3_679:int, ldc:int(289840659))
                        goto(Label_1422)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_679:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1265)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_679:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1146)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_679:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_679 = and:int(var_3_679:int, ldc:int(-1536047758))
                        goto(Label_0983)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_679:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_679 = and:int(var_3_679:int, ldc:int(-1359690736))
                        goto(Label_0857)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_679:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_679 = and:int(var_3_679:int, ldc:int(109250497))
                        goto(Label_0711)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(65536)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_679 = and:int(var_3_679:int, ldc:int(-741955909))
                            loopcontinue()
                        }
                        
                        var_3_679 = and:int(var_3_679:int, ldc:int(-1430359637))
                        var_11_EB = and:int(ldc:int(-10455), ldc:int(10452))
                        goto(Label_1546)
                    }
                    
                    Label_0575:
                    
                    if (cmpne:boolean(and:int(var_3_679:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_679 = and:int(var_3_679:int, ldc:int(-544444688))
                        goto(Label_1557)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_679 = and:int(var_3_679:int, ldc:int(-1022748550))
                        goto(Label_1422)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_679:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1265)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_679:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1146)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_679 = and:int(var_3_679:int, ldc:int(-1618501351))
                        goto(Label_0983)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_679:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_679 = and:int(var_3_679:int, ldc:int(-858546078))
                        goto(Label_0857)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_679:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_679 = and:int(var_3_679:int, ldc:int(-726768330))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0405)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_679:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_679 = and:int(var_3_679:int, ldc:int(141743668))
                            loopcontinue()
                        }
                        
                        var_3_679 = and:int(var_3_679:int, ldc:int(-822810689))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C8:double
                            goto(Label_0857)
                        }
                    }
                    
                    Label_0711:
                    
                    if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_679 = and:int(var_3_679:int, ldc:int(189253722))
                        goto(Label_1557)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_679:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_679 = and:int(var_3_679:int, ldc:int(-743588229))
                        goto(Label_1422)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_679:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1265)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_679 = and:int(var_3_679:int, ldc:int(942615850))
                        goto(Label_1146)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_679:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_679 = and:int(var_3_679:int, ldc:int(-184386197))
                        goto(Label_0983)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_679 = and:int(var_3_679:int, ldc:int(-1683415300))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_679:int, ldc:int(128)), ldc:int(0))) {
                            var_3_679 = and:int(var_3_679:int, ldc:int(-398799861))
                            goto(Label_0575)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0405)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_679:int, ldc:int(1024)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_679 = and:int(var_3_679:int, ldc:int(444988429))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C8:double, var_14_115:double))
                    }
                    
                    Label_0857:
                    
                    if (cmpne:boolean(and:int(var_3_679:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_679 = and:int(var_3_679:int, ldc:int(1352190556))
                        goto(Label_1557)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_679:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_679 = and:int(var_3_679:int, ldc:int(427834684))
                        goto(Label_1422)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1265)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_679:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_679 = and:int(var_3_679:int, ldc:int(-583870787))
                        goto(Label_1146)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_679:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_679:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_679 = and:int(var_3_679:int, ldc:int(-1975328710))
                            goto(Label_0711)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_679:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0575)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_679:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0405)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_679 = and:int(var_3_679:int, ldc:int(-157404898))
                            loopcontinue()
                        }
                        
                        var_3_679 = and:int(var_3_679:int, ldc:int(-1964022017))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81:int), var_7_97:double)) {
                                var_11_EB = xor:int(ldc:int(10245), ldc:int(10244))
                                goto(Label_1146)
                            }
                        }
                    }
                    
                    Label_0983:
                    
                    if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1557)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_679:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1422)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_679 = and:int(var_3_679:int, ldc:int(-1051886558))
                        goto(Label_1265)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_679:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_679 = and:int(var_3_679:int, ldc:int(507417916))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_679:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_679 = and:int(var_3_679:int, ldc:int(1463299651))
                            goto(Label_0857)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_679:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_679 = and:int(var_3_679:int, ldc:int(310056028))
                            goto(Label_0711)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_679:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0575)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_679:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_679 = and:int(var_3_679:int, ldc:int(2047787015))
                            goto(Label_0405)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(262144)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_679 = and:int(var_3_679:int, ldc:int(1518762446))
                        var_11_EB = and:int(ldc:int(26064), ldc:int(-26073))
                    }
                    
                    Label_1146:
                    
                    if (cmpne:boolean(and:int(var_3_679:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1557)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_679:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1422)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_679:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_679 = and:int(var_3_679:int, ldc:int(1700507998))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_679 = and:int(var_3_679:int, ldc:int(-503091365))
                            goto(Label_0983)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_679:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0857)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_679 = and:int(var_3_679:int, ldc:int(-233734199))
                            goto(Label_0711)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0575)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_679 = and:int(var_3_679:int, ldc:int(598645368))
                            goto(Label_0405)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_679:int, ldc:int(32)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_679 = and:int(var_3_679:int, ldc:int(-876087192))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1422)
                            }
                        }
                    }
                    
                    Label_1265:
                    
                    if (cmpne:boolean(and:int(var_3_679:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_679 = and:int(var_3_679:int, ldc:int(315097394))
                        goto(Label_1557)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_679:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_679 = and:int(var_3_679:int, ldc:int(1050143829))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_679:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_1146)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_679:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_679 = and:int(var_3_679:int, ldc:int(1485685028))
                            goto(Label_0983)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_679 = and:int(var_3_679:int, ldc:int(-744415831))
                            goto(Label_0857)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_679 = and:int(var_3_679:int, ldc:int(1608811491))
                            goto(Label_0711)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_679:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0575)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_679 = and:int(var_3_679:int, ldc:int(1098107311))
                            goto(Label_0405)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_679:int, ldc:int(128)), ldc:int(0))) {
                            var_3_679 = and:int(var_3_679:int, ldc:int(-897497907))
                            loopcontinue()
                        }
                        
                        var_3_679 = and:int(var_3_679:int, ldc:int(1317419722))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_81:int, var_16_119:int)
                        goto(Label_1546)
                    }
                    
                    Label_1422:
                    
                    if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1557)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1265)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1146)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_679:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0983)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_679 = and:int(var_3_679:int, ldc:int(-1848306193))
                        goto(Label_0857)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_679:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0711)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_679:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0575)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_679:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_679 = and:int(var_3_679:int, ldc:int(-49819031))
                        goto(Label_0405)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_679 = and:int(var_3_679:int, ldc:int(-820690209))
                        loopcontinue()
                    }
                    
                    var_3_679 = and:int(var_3_679:int, ldc:int(-889264993))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1546:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_684 = var_5_81:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1557:
                    
                    if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_679 = and:int(var_3_679:int, ldc:int(-2138679524))
                        goto(Label_1422)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1265)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_679:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_679 = and:int(var_3_679:int, ldc:int(973344284))
                        goto(Label_1146)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0983)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0857)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_679:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0711)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_679:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0575)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_679:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0405)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(32)), ldc:int(0))) {
                        var_3_679 = and:int(var_3_679:int, ldc:int(-1970985715))
                        var_17_684 = add:int(var_16_119:int, xor:int(ldc:int(17411), ldc:int(17410)))
                        looporswitchbreak()
                    }
                    
                    var_3_679 = and:int(var_3_679:int, ldc:int(-1586925559))
                }
                
                var_3_679 = and:int(var_3_679:int, ldc:int(998618058))
                
                if (cmple:boolean(var_5_81 = var_17_684:int, sub:int(var_6_88:int, xor:int(ldc:int(8544), ldc:int(8545))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0171:
        
        if (cmpeq:boolean(and:int(var_3_679:int, ldc:int(8192)), ldc:int(0))) {
            var_3_679 = and:int(var_3_679:int, ldc:int(1275318826))
            goto(Label_0108)
        }
    }
}
