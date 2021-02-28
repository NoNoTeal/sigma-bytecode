public class \u927d\u92ff\u71ae\uafe7\u6bb9.\ub70c\u64ab\u3bc9\u6d69\u5140\u92ff {
    public void \ub70c\u64ab\u3bc9\u6d69\u5140\u92ff() {
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
            invokespecial:\u1833\ud171\u8350\ubded\u34df\uc9f6(\u1833\ud171\u8350\ubded\u34df\uc9f6::<init>, this:\ub70c\u64ab\u3bc9\u6d69\u5140\u92ff, ldc:Class<\ud12e\ub18d\ud158\ud36e\ub8be\u56bd>(\u71f1\uc910\u3bc9\u516c\u93a2.\ud12e\ub18d\ud158\ud36e\ub8be\u56bd.class))
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
        var_9_88 : int[]
        var_10_9C : \u4975\u1833\u446c\u5bc4\ubded\u4f4a[]
        var_11_A5 : int
        var_12_11C : short
        var_13_128 : \u4975\u1833\u446c\u5bc4\ubded\u4f4a
        var_11_DC : ArrayList<\ub83f\u6c52\u12cb\u3c25\u3776>
        var_12_153 : byte[]
        
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
            var_9_88 = aconstnull:int[]()
            
            if (var_6_70:boolean) {
                var_9_88 = checkcast:int[](int[].class, invokevirtual:int[](\u8389\u494c\u527a\u8753\ub1b9\u8640<int[]>::\u4d85\uff55\uc3e3\ud4fe\u9937\uc229, getstatic:\u1833\ud171\u8350\ubded\u34df\uc9f6<int[]>[expected:\u8389\u494c\u527a\u8753\ub1b9\u8640<int[]>](\u1833\ud171\u8350\ubded\u34df\uc9f6::\uc31c\u8753\ua6bd\u836c\ub18d\u4c2b), p0:ByteBuf))
            }
            
            invokevirtual:int(\uceb8\u4c2b\ub8be\u7049\u8308\u3a62::\uc4d2\uf94d\u6d69\u6b5f\ucef1\u624e, getstatic:\uceb8\u4c2b\ub8be\u7049\u8308\u3a62(\u1833\ud171\u8350\ubded\u34df\uc9f6::\ud523\u62da\u6c52\u7043\ud217\u72f1), p0:ByteBuf)
            var_10_9C = newarray:\u4975\u1833\u446c\u5bc4\ubded\u4f4a[](\u5d20\u97b7\u8753\u873d\u16f6.\u4975\u1833\u446c\u5bc4\ubded\u4f4a.class, ldc:int(16))
            var_11_A5 = and:int(ldc:int(-11312), ldc:int(11309))
            
            while (cmplt:boolean(var_11_A5:int, ldc:int(16))) {
                if (cmpne:boolean(and:int(var_7_79:int, shl:int(and:int(ldc:int(33), ldc:int(6217)), var_11_A5:int)), ldc:int(0))) {
                    var_12_11C = invokevirtual:short(ByteBuf::readShort, p0:ByteBuf)
                    var_13_128 = checkcast:\u4975\u1833\u446c\u5bc4\ubded\u4f4a(\u5d20\u97b7\u8753\u873d\u16f6.\u4975\u1833\u446c\u5bc4\ubded\u4f4a.class, invokevirtual:\u4975\u1833\u446c\u5bc4\ubded\u4f4a(\u8389\u494c\u527a\u8753\ub1b9\u8640<\u4975\u1833\u446c\u5bc4\ubded\u4f4a>::\u4d85\uff55\uc3e3\ud4fe\u9937\uc229, getstatic:\u1833\ud171\u8350\ubded\u34df\uc9f6<\u4975\u1833\u446c\u5bc4\ubded\u4f4a>[expected:\u8389\u494c\u527a\u8753\ub1b9\u8640<\u4975\u1833\u446c\u5bc4\ubded\u4f4a>](\u3776\uc910\u62da\uc31c\u51fa\u99f7::\u494c\u3c25\u99f7\u61a4\u7d52\u5fe1), p0:ByteBuf))
                    invokevirtual:void(\u4975\u1833\u446c\u5bc4\ubded\u4f4a::\u4179\u836c\ub32d\u156b\ud51e\u98a4, var_13_128:\u4975\u1833\u446c\u5bc4\ubded\u4f4a, var_12_11C:short[expected:int])
                    storeelement:\u4975\u1833\u446c\u5bc4\ubded\u4f4a(var_10_9C:\u4975\u1833\u446c\u5bc4\ubded\u4f4a[], var_11_A5:int, var_13_128:\u4975\u1833\u446c\u5bc4\ubded\u4f4a)
                }
                
                inc:int(var_11_A5, ldc:int(1))
            }
            
            var_11_DC = initobject:ArrayList<\ub83f\u6c52\u12cb\u3c25\u3776>(ArrayList<\ub83f\u6c52\u12cb\u3c25\u3776>::<init>, invokestatic:List<\ub83f\u6c52\u12cb\u3c25\u3776>[expected:Collection<? extends \ub83f\u6c52\u12cb\u3c25\u3776>](Arrays::asList, checkcast:\ub83f\u6c52\u12cb\u3c25\u3776[](\u51b2\u6fb0\ufcaf\u61a4\u0800.\uc7fe\ua61f\ub18d\u64ab\u4f4a.\ub83f\u6c52\u12cb\u3c25\u3776[].class, invokevirtual:\ub83f\u6c52\u12cb\u3c25\u3776[](\u8389\u494c\u527a\u8753\ub1b9\u8640<\ub83f\u6c52\u12cb\u3c25\u3776[]>::\u4d85\uff55\uc3e3\ud4fe\u9937\uc229, getstatic:\u1833\ud171\u8350\ubded\u34df\uc9f6<\ub83f\u6c52\u12cb\u3c25\u3776[]>[expected:\u8389\u494c\u527a\u8753\ub1b9\u8640<\ub83f\u6c52\u12cb\u3c25\u3776[]>](\u1833\ud171\u8350\ubded\u34df\uc9f6::\u760c\ucfaf\ub19c\u446c\u7873\u97b7), p0:ByteBuf))))
            
            if (cmpgt:boolean(invokevirtual:int(ByteBuf::readableBytes, p0:ByteBuf), ldc:int(0))) {
                var_12_153 = checkcast:byte[](byte[].class, invokevirtual:byte[](\u8389\u494c\u527a\u8753\ub1b9\u8640<byte[]>::\u4d85\uff55\uc3e3\ud4fe\u9937\uc229, getstatic:\u1833\ud171\u8350\ubded\u34df\uc9f6<byte[]>[expected:\u8389\u494c\u527a\u8753\ub1b9\u8640<byte[]>](\u1833\ud171\u8350\ubded\u34df\uc9f6::\u3bc9\u6bb9\u8709\uc3e3\u34df\ud158), p0:ByteBuf))
                
                if (invokevirtual:boolean(\uc29a\u7043\u3d4b\u93a2\uceb8\u7d52::\uc229\u3e2a\u76bc\ubb2b\ud523\u6435, invokestatic:\uc29a\u7043\u3d4b\u93a2\uceb8\u7d52(\u183a\u71ae\ubf56\u6d69\u4e72\u3d4b::\u3776\uf9c5\u3d4b\u72f1\u647c\ubf56))) {
                    invokevirtual:void(Logger::warning, invokeinterface:Logger(\u0b8e\u12cb\ud523\u8308\u6fb0\u4ab3::\u8709\u839e\uafe7\ua61f\u71ae\ud158, invokestatic:\u0b8e\u12cb\ud523\u8308\u6fb0\u4ab3(\u183a\u71ae\ubf56\u6d69\u4e72\u3d4b::\u836c\u527a\u76bc\u4492\u72f1\u98a4)), invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\ub70c\u64ab\u3bc9\u6d69\u5140\u92ff::\u3bd6\u600f\u6198\u2dcc\u98a4\u4cd9), and:int(ldc:int(7096), ldc:int(-7097)))), arraylength:int(var_12_153:byte[])), loadelement:String(getstatic:String[](\ub70c\u64ab\u3bc9\u6d69\u5140\u92ff::\u3bd6\u600f\u6198\u2dcc\u98a4\u4cd9), and:int(ldc:int(261), ldc:int(8265)))), var_4_64:int), loadelement:String(getstatic:String[](\ub70c\u64ab\u3bc9\u6d69\u5140\u92ff::\u3bd6\u600f\u6198\u2dcc\u98a4\u4cd9), and:int(ldc:int(130), ldc:int(822)))), var_5_6A:int)))
                }
            }
            
            return:\ud12e\ub18d\ud158\ud36e\ub8be\u56bd(initobject:\u927d\ua3b4\u7330\u8df4\u99f7\u0a06(\u927d\ua3b4\u7330\u8df4\u99f7\u0a06::<init>, var_4_64:int, var_5_6A:int, var_6_70:boolean, and:int[expected:boolean](ldc:int(-19340), ldc:int(18818)), var_7_79:int, var_10_9C:\u4975\u1833\u446c\u5bc4\ubded\u4f4a[], var_9_88:int[], var_8_85:\ub83f\u6c52\u12cb\u3c25\u3776, var_11_DC:ArrayList<\ub83f\u6c52\u12cb\u3c25\u3776>[expected:List<\ub83f\u6c52\u12cb\u3c25\u3776>]))
        }
        
        goto(Label_0006)
    }
    
    public void \ud171\uc229\ufe34\u36d3\u5f50\uc2e8(io.netty.buffer.ByteBuf p0, \u71f1\uc910\u3bc9\u516c\u93a2.\ud12e\ub18d\ud158\ud36e\ub8be\u56bd p1) {
        var_3_5F : int
        var_3_43C : int
        var_5_446 : ByteBuf
        var_6_455 : int
        var_7_538 : \u4975\u1833\u446c\u5bc4\ubded\u4f4a
        var_3_6D5 : int
        
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
            var_3_5F = and:int(ldc:int(438543652), ldc:int(2147172792))
            
            loop {
                if (cmpeq:boolean(and:int(var_3_5F:int, ldc:int(33554432)), ldc:int(0))) {
                    var_3_5F = and:int(var_3_5F:int, ldc:int(248305789))
                    goto(Label_0995)
                }
                
                if (cmpeq:boolean(and:int(var_3_5F:int, ldc:int(256)), ldc:int(0))) {
                    var_3_5F = and:int(var_3_5F:int, ldc:int(-91615191))
                    goto(Label_0874)
                }
                
                if (cmpeq:boolean(and:int(var_3_5F:int, ldc:int(33554432)), ldc:int(0))) {
                    goto(Label_0758)
                }
                
                if (cmpeq:boolean(and:int(var_3_5F:int, ldc:int(131072)), ldc:int(0))) {
                    var_3_5F = and:int(var_3_5F:int, ldc:int(-1235465393))
                    goto(Label_0660)
                }
                
                if (cmpne:boolean(and:int(var_3_5F:int, ldc:int(1073741824)), ldc:int(0))) {
                    goto(Label_0546)
                }
                
                if (cmpne:boolean(and:int(var_3_5F:int, ldc:int(262144)), ldc:int(0))) {
                    var_3_5F = and:int(var_3_5F:int, ldc:int(-1486548094))
                    goto(Label_0440)
                }
                
                if (cmpeq:boolean(and:int(var_3_5F:int, ldc:int(256)), ldc:int(0))) {
                    var_3_5F = and:int(var_3_5F:int, ldc:int(-876323465))
                    goto(Label_0328)
                }
                
                if (cmpeq:boolean(and:int(var_3_5F:int, ldc:int(256)), ldc:int(0))) {
                    var_3_5F = and:int(var_3_5F:int, ldc:int(-1109937319))
                }
                else {
                    var_3_5F = and:int(var_3_5F:int, ldc:int(-548760680))
                    invokevirtual:ByteBuf(ByteBuf::writeInt, p0:ByteBuf, invokeinterface:int(\ud12e\ub18d\ud158\ud36e\ub8be\u56bd::\u718f\u64ab\uc9f6\uc246\u7006\ubff1, p1:\ud12e\ub18d\ud158\ud36e\ub8be\u56bd))
                }
                
                Label_0216:
                
                if (cmpne:boolean(and:int(var_3_5F:int, ldc:int(8388608)), ldc:int(0))) {
                    var_3_5F = and:int(var_3_5F:int, ldc:int(-1898475190))
                    goto(Label_0995)
                }
                
                if (cmpne:boolean(and:int(var_3_5F:int, ldc:int(8388608)), ldc:int(0))) {
                    goto(Label_0874)
                }
                
                if (cmpne:boolean(and:int(var_3_5F:int, ldc:int(4096)), ldc:int(0))) {
                    goto(Label_0758)
                }
                
                if (cmpne:boolean(and:int(var_3_5F:int, ldc:int(8388608)), ldc:int(0))) {
                    var_3_5F = and:int(var_3_5F:int, ldc:int(-1092649096))
                    goto(Label_0660)
                }
                
                if (cmpeq:boolean(and:int(var_3_5F:int, ldc:int(256)), ldc:int(0))) {
                    goto(Label_0546)
                }
                
                if (cmpne:boolean(and:int(var_3_5F:int, ldc:int(536870912)), ldc:int(0))) {
                    var_3_5F = and:int(var_3_5F:int, ldc:int(-446279128))
                    goto(Label_0440)
                }
                
                if (cmpeq:boolean(and:int(var_3_5F:int, ldc:int(268435456)), ldc:int(0))) {
                    var_3_5F = and:int(var_3_5F:int, ldc:int(-19376205))
                }
                else {
                    if (cmpne:boolean(and:int(var_3_5F:int, ldc:int(16)), ldc:int(0))) {
                        var_3_5F = and:int(var_3_5F:int, ldc:int(-673918823))
                        loopcontinue()
                    }
                    
                    var_3_5F = and:int(var_3_5F:int, ldc:int(2123027355))
                    invokevirtual:ByteBuf(ByteBuf::writeInt, p0:ByteBuf, invokeinterface:int(\ud12e\ub18d\ud158\ud36e\ub8be\u56bd::\u5140\u946b\u8709\u8413\u4f4a\ub18d, p1:\ud12e\ub18d\ud158\ud36e\ub8be\u56bd))
                }
                
                Label_0328:
                
                if (cmpne:boolean(and:int(var_3_5F:int, ldc:int(262144)), ldc:int(0))) {
                    goto(Label_0995)
                }
                
                if (cmpeq:boolean(and:int(var_3_5F:int, ldc:int(131072)), ldc:int(0))) {
                    var_3_5F = and:int(var_3_5F:int, ldc:int(1829779377))
                    goto(Label_0874)
                }
                
                if (cmpne:boolean(and:int(var_3_5F:int, ldc:int(4096)), ldc:int(0))) {
                    var_3_5F = and:int(var_3_5F:int, ldc:int(635535657))
                    goto(Label_0758)
                }
                
                if (cmpne:boolean(and:int(var_3_5F:int, ldc:int(262144)), ldc:int(0))) {
                    var_3_5F = and:int(var_3_5F:int, ldc:int(617184890))
                    goto(Label_0660)
                }
                
                if (cmpeq:boolean(and:int(var_3_5F:int, ldc:int(256)), ldc:int(0))) {
                    var_3_5F = and:int(var_3_5F:int, ldc:int(-1891832582))
                    goto(Label_0546)
                }
                
                if (cmpeq:boolean(and:int(var_3_5F:int, ldc:int(1073741824)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_3_5F:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0216)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_5F = and:int(var_3_5F:int, ldc:int(1710117740))
                        loopcontinue()
                    }
                    
                    var_3_5F = and:int(var_3_5F:int, ldc:int(993442229))
                    invokevirtual:ByteBuf(ByteBuf::writeBoolean, p0:ByteBuf, invokeinterface:boolean(\ud12e\ub18d\ud158\ud36e\ub8be\u56bd::\u52d3\u4e72\u36d3\u56bd\u0b8e\ud4fe, p1:\ud12e\ub18d\ud158\ud36e\ub8be\u56bd))
                }
                
                Label_0440:
                
                if (cmpne:boolean(and:int(var_3_5F:int, ldc:int(8388608)), ldc:int(0))) {
                    goto(Label_0995)
                }
                
                if (cmpne:boolean(and:int(var_3_5F:int, ldc:int(16)), ldc:int(0))) {
                    goto(Label_0874)
                }
                
                if (cmpne:boolean(and:int(var_3_5F:int, ldc:int(8)), ldc:int(0))) {
                    var_3_5F = and:int(var_3_5F:int, ldc:int(604594610))
                    goto(Label_0758)
                }
                
                if (cmpeq:boolean(and:int(var_3_5F:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_3_5F = and:int(var_3_5F:int, ldc:int(-930809800))
                    goto(Label_0660)
                }
                
                if (cmpne:boolean(and:int(var_3_5F:int, ldc:int(4096)), ldc:int(0))) {
                    var_3_5F = and:int(var_3_5F:int, ldc:int(-1864140502))
                }
                else {
                    if (cmpne:boolean(and:int(var_3_5F:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_5F = and:int(var_3_5F:int, ldc:int(-505328659))
                        goto(Label_0328)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0216)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F:int, ldc:int(2147483647)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_5F = and:int(var_3_5F:int, ldc:int(2050417536))
                    invokevirtual:void(\uceb8\u4c2b\ub8be\u7049\u8308\u3a62::\u0c95\u6435\u3504\u36d3\u2dcc\u16f6, getstatic:\uceb8\u4c2b\ub8be\u7049\u8308\u3a62(\u1833\ud171\u8350\ubded\u34df\uc9f6::\ud523\u62da\u6c52\u7043\ud217\u72f1), p0:ByteBuf, invokeinterface:int(\ud12e\ub18d\ud158\ud36e\ub8be\u56bd::\u624e\u3d4b\u16f6\u416d\ub1b9\u36d3, p1:\ud12e\ub18d\ud158\ud36e\ub8be\u56bd))
                }
                
                Label_0546:
                
                if (cmpne:boolean(and:int(var_3_5F:int, ldc:int(262144)), ldc:int(0))) {
                    goto(Label_0995)
                }
                
                if (cmpeq:boolean(and:int(var_3_5F:int, ldc:int(268435456)), ldc:int(0))) {
                    var_3_5F = and:int(var_3_5F:int, ldc:int(2005069042))
                    goto(Label_0874)
                }
                
                if (cmpeq:boolean(and:int(var_3_5F:int, ldc:int(268435456)), ldc:int(0))) {
                    var_3_5F = and:int(var_3_5F:int, ldc:int(-1285276451))
                    goto(Label_0758)
                }
                
                if (cmpne:boolean(and:int(var_3_5F:int, ldc:int(33554432)), ldc:int(0))) {
                    if (cmpne:boolean(and:int(var_3_5F:int, ldc:int(8)), ldc:int(0))) {
                        var_3_5F = and:int(var_3_5F:int, ldc:int(-1051769323))
                        goto(Label_0440)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F:int, ldc:int(8)), ldc:int(0))) {
                        var_3_5F = and:int(var_3_5F:int, ldc:int(2120049176))
                        goto(Label_0328)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0216)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_5F = and:int(var_3_5F:int, ldc:int(340900049))
                        loopcontinue()
                    }
                    
                    var_3_5F = and:int(var_3_5F:int, ldc:int(399141678))
                    invokevirtual:void(\ua3b4\ub1b9\u9af2\u3d64\uf94d\u3dd3<\ub83f\u6c52\u12cb\u3c25\u3776>::\ud171\uc229\ufe34\u36d3\u5f50\uc2e8, getstatic:\u1833\ud171\u8350\ubded\u34df\uc9f6<\ub83f\u6c52\u12cb\u3c25\u3776>[expected:\ua3b4\ub1b9\u9af2\u3d64\uf94d\u3dd3<\ub83f\u6c52\u12cb\u3c25\u3776>](\u1833\ud171\u8350\ubded\u34df\uc9f6::\u3bc9\u5fe1\u4ab3\ub70c\u600f\u6fb0), p0:ByteBuf, invokeinterface:\ub83f\u6c52\u12cb\u3c25\u3776(\ud12e\ub18d\ud158\ud36e\ub8be\u56bd::\u7bad\u64ab\uc87f\uc84e\u34df\u0800, p1:\ud12e\ub18d\ud158\ud36e\ub8be\u56bd))
                }
                
                Label_0660:
                
                if (cmpeq:boolean(and:int(var_3_5F:int, ldc:int(33554432)), ldc:int(0))) {
                    goto(Label_0995)
                }
                
                if (cmpne:boolean(and:int(var_3_5F:int, ldc:int(1073741824)), ldc:int(0))) {
                    goto(Label_0874)
                }
                
                if (cmpne:boolean(and:int(var_3_5F:int, ldc:int(8)), ldc:int(0))) {
                    var_3_5F = and:int(var_3_5F:int, ldc:int(-820465837))
                }
                else {
                    if (cmpne:boolean(and:int(var_3_5F:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_5F = and:int(var_3_5F:int, ldc:int(-1403296282))
                        goto(Label_0546)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0440)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0328)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F:int, ldc:int(16)), ldc:int(0))) {
                        var_3_5F = and:int(var_3_5F:int, ldc:int(1912136729))
                        goto(Label_0216)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F:int, ldc:int(8)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_5F = and:int(var_3_5F:int, ldc:int(1073690608))
                    
                    if (logicalnot:boolean(invokeinterface:boolean(\ud12e\ub18d\ud158\ud36e\ub8be\u56bd::\u6cfe\uc2bd\ud36e\u071d\u7049\u9937, p1:\ud12e\ub18d\ud158\ud36e\ub8be\u56bd))) {
                        goto(Label_0995)
                    }
                }
                
                Label_0758:
                
                if (cmpeq:boolean(and:int(var_3_5F:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_3_5F = and:int(var_3_5F:int, ldc:int(90487876))
                    goto(Label_0995)
                }
                
                if (cmpeq:boolean(and:int(var_3_5F:int, ldc:int(16)), ldc:int(0))) {
                    if (cmpne:boolean(and:int(var_3_5F:int, ldc:int(16)), ldc:int(0))) {
                        var_3_5F = and:int(var_3_5F:int, ldc:int(-1043633996))
                        goto(Label_0660)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0546)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F:int, ldc:int(256)), ldc:int(0))) {
                        var_3_5F = and:int(var_3_5F:int, ldc:int(674243075))
                        goto(Label_0440)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_5F = and:int(var_3_5F:int, ldc:int(392588888))
                        goto(Label_0328)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_5F = and:int(var_3_5F:int, ldc:int(-1580714008))
                        goto(Label_0216)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_5F = and:int(var_3_5F:int, ldc:int(863336427))
                        loopcontinue()
                    }
                    
                    var_3_5F = and:int(var_3_5F:int, ldc:int(2117247249))
                }
                
                Label_0874:
                
                if (cmpne:boolean(and:int(var_3_5F:int, ldc:int(16384)), ldc:int(0))) {
                    var_3_5F = and:int(var_3_5F:int, ldc:int(1872958720))
                }
                else {
                    if (cmpne:boolean(and:int(var_3_5F:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_5F = and:int(var_3_5F:int, ldc:int(-2098119161))
                        goto(Label_0758)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0660)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0546)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_5F = and:int(var_3_5F:int, ldc:int(-1982173530))
                        goto(Label_0440)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F:int, ldc:int(256)), ldc:int(0))) {
                        var_3_5F = and:int(var_3_5F:int, ldc:int(-1420814521))
                        goto(Label_0328)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_5F = and:int(var_3_5F:int, ldc:int(-525562190))
                        goto(Label_0216)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F:int, ldc:int(536870912)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_5F = and:int(var_3_5F:int, ldc:int(992649597))
                    invokevirtual:void(\ua3b4\ub1b9\u9af2\u3d64\uf94d\u3dd3<int[]>::\ud171\uc229\ufe34\u36d3\u5f50\uc2e8, getstatic:\u1833\ud171\u8350\ubded\u34df\uc9f6<int[]>[expected:\ua3b4\ub1b9\u9af2\u3d64\uf94d\u3dd3<int[]>](\u1833\ud171\u8350\ubded\u34df\uc9f6::\uc31c\u8753\ua6bd\u836c\ub18d\u4c2b), p0:ByteBuf, invokeinterface:int[](\ud12e\ub18d\ud158\ud36e\ub8be\u56bd::\ub6ab\u946b\u4bc8\u12b2\u8389\ub113, p1:\ud12e\ub18d\ud158\ud36e\ub8be\u56bd))
                }
                
                Label_0995:
                
                if (cmpne:boolean(and:int(var_3_5F:int, ldc:int(16384)), ldc:int(0))) {
                    goto(Label_0874)
                }
                
                if (cmpeq:boolean(and:int(var_3_5F:int, ldc:int(268435456)), ldc:int(0))) {
                    goto(Label_0758)
                }
                
                if (cmpne:boolean(and:int(var_3_5F:int, ldc:int(262144)), ldc:int(0))) {
                    var_3_5F = and:int(var_3_5F:int, ldc:int(-771290548))
                    goto(Label_0660)
                }
                
                if (cmpne:boolean(and:int(var_3_5F:int, ldc:int(1073741824)), ldc:int(0))) {
                    var_3_5F = and:int(var_3_5F:int, ldc:int(589902968))
                    goto(Label_0546)
                }
                
                if (cmpne:boolean(and:int(var_3_5F:int, ldc:int(524288)), ldc:int(0))) {
                    goto(Label_0440)
                }
                
                if (cmpne:boolean(and:int(var_3_5F:int, ldc:int(262144)), ldc:int(0))) {
                    goto(Label_0328)
                }
                
                if (cmpeq:boolean(and:int(var_3_5F:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_3_5F = and:int(var_3_5F:int, ldc:int(-438855749))
                    goto(Label_0216)
                }
                
                if (cmpeq:boolean(and:int(var_3_5F:int, ldc:int(536870912)), ldc:int(0))) {
                    looporswitchbreak()
                }
            }
            
            var_3_43C = and:int(var_3_5F:int, ldc:int(334727598))
            var_5_446 = invokeinterface:ByteBuf(ByteBufAllocator::buffer, invokevirtual:ByteBufAllocator(ByteBuf::alloc, p0:ByteBuf))
            
            try {
                var_3_43C = and:int(var_3_43C:int, ldc:int(-560806018))
                var_6_455 = and:int(ldc:int(22930), ldc:int(-22943))
                
                loop {
                    if (cmpne:boolean(and:int(var_3_43C:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1653)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_43C:int, ldc:int(8)), ldc:int(0))) {
                        var_3_43C = and:int(var_3_43C:int, ldc:int(978087774))
                        goto(Label_1572)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_43C:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1490)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_43C:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1394)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_43C:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1270)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_43C:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_43C = and:int(var_3_43C:int, ldc:int(-141162619))
                        
                        if (cmpge:boolean(var_6_455:int, ldc:int(16))) {
                            invokevirtual:ByteBuf(ByteBuf::readerIndex, var_5_446:ByteBuf, and:int(ldc:int(-19490), ldc:int(19489)))
                            goto(Label_1394)
                        }
                    }
                    
                    Label_1176:
                    
                    if (cmpne:boolean(and:int(var_3_43C:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_43C = and:int(var_3_43C:int, ldc:int(1319373618))
                        goto(Label_1653)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_43C:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_43C = and:int(var_3_43C:int, ldc:int(1516482884))
                        goto(Label_1572)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_43C:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_43C = and:int(var_3_43C:int, ldc:int(-39442319))
                        goto(Label_1490)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_43C:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_43C = and:int(var_3_43C:int, ldc:int(1556719080))
                        goto(Label_1394)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_43C:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_43C = and:int(var_3_43C:int, ldc:int(-1451770870))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_43C:int, ldc:int(4096)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_43C = and:int(var_3_43C:int, ldc:int(927989563))
                    }
                    
                    Label_1270:
                    
                    if (cmpne:boolean(and:int(var_3_43C:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1653)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_43C:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1572)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_43C:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1490)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_43C:int, ldc:int(8388608)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_43C:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_1176)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_43C:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_43C = and:int(var_3_43C:int, ldc:int(1951619878))
                            loopcontinue()
                        }
                        
                        var_3_43C = and:int(var_3_43C:int, ldc:int(916416779))
                        var_7_538 = loadelement:\u4975\u1833\u446c\u5bc4\ubded\u4f4a(invokeinterface:\u4975\u1833\u446c\u5bc4\ubded\u4f4a[](\ud12e\ub18d\ud158\ud36e\ub8be\u56bd::\u52d3\u5bc4\u3c25\u8cae\ud7e8\u927d, p1:\ud12e\ub18d\ud158\ud36e\ub8be\u56bd), var_6_455:int)
                        
                        if (cmpne:boolean(var_7_538:\u4975\u1833\u446c\u5bc4\ubded\u4f4a, aconstnull:\u4975\u1833\u446c\u5bc4\ubded\u4f4a())) {
                            invokevirtual:ByteBuf(ByteBuf::writeShort, var_5_446:ByteBuf, invokevirtual:int(\u4975\u1833\u446c\u5bc4\ubded\u4f4a::\u67e9\u5bc4\u5fe1\ub7dc\ud171\u8640, var_7_538:\u4975\u1833\u446c\u5bc4\ubded\u4f4a))
                            invokevirtual:void(\ua3b4\ub1b9\u9af2\u3d64\uf94d\u3dd3<\u4975\u1833\u446c\u5bc4\ubded\u4f4a>::\ud171\uc229\ufe34\u36d3\u5f50\uc2e8, getstatic:\u1833\ud171\u8350\ubded\u34df\uc9f6<\u4975\u1833\u446c\u5bc4\ubded\u4f4a>[expected:\ua3b4\ub1b9\u9af2\u3d64\uf94d\u3dd3<\u4975\u1833\u446c\u5bc4\ubded\u4f4a>](\u3776\uc910\u62da\uc31c\u51fa\u99f7::\u494c\u3c25\u99f7\u61a4\u7d52\u5fe1), var_5_446:ByteBuf, var_7_538:\u4975\u1833\u446c\u5bc4\ubded\u4f4a)
                        }
                        
                        inc:int(var_6_455, ldc:int(1))
                        loopcontinue()
                    }
                    
                    Label_1394:
                    
                    if (cmpeq:boolean(and:int(var_3_43C:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_43C = and:int(var_3_43C:int, ldc:int(1513988155))
                        goto(Label_1653)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_43C:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_43C = and:int(var_3_43C:int, ldc:int(620379343))
                        goto(Label_1572)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_43C:int, ldc:int(268435456)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_43C:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_43C = and:int(var_3_43C:int, ldc:int(-2041090101))
                            goto(Label_1270)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_43C:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_43C = and:int(var_3_43C:int, ldc:int(1707515783))
                            goto(Label_1176)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_43C:int, ldc:int(8388608)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_43C = and:int(var_3_43C:int, ldc:int(-1220822090))
                        invokevirtual:void(\uceb8\u4c2b\ub8be\u7049\u8308\u3a62::\u0c95\u6435\u3504\u36d3\u2dcc\u16f6, getstatic:\uceb8\u4c2b\ub8be\u7049\u8308\u3a62(\u1833\ud171\u8350\ubded\u34df\uc9f6::\ud523\u62da\u6c52\u7043\ud217\u72f1), p0:ByteBuf, invokevirtual:int(ByteBuf::readableBytes, var_5_446:ByteBuf))
                    }
                    
                    Label_1490:
                    
                    if (cmpeq:boolean(and:int(var_3_43C:int, ldc:int(256)), ldc:int(0))) {
                        var_3_43C = and:int(var_3_43C:int, ldc:int(57590188))
                        goto(Label_1653)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_43C:int, ldc:int(256)), ldc:int(0))) {
                        var_3_43C = and:int(var_3_43C:int, ldc:int(1049628747))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_43C:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_1394)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_43C:int, ldc:int(256)), ldc:int(0))) {
                            var_3_43C = and:int(var_3_43C:int, ldc:int(1057004435))
                            goto(Label_1270)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_43C:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_1176)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_43C:int, ldc:int(2147483647)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_43C = and:int(var_3_43C:int, ldc:int(844272401))
                        invokevirtual:ByteBuf(ByteBuf::writeBytes, p0:ByteBuf, var_5_446:ByteBuf)
                    }
                    
                    Label_1572:
                    
                    if (cmpeq:boolean(and:int(var_3_43C:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_43C = and:int(var_3_43C:int, ldc:int(574432770))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_43C:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_1490)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_43C:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_1394)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_43C:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_43C = and:int(var_3_43C:int, ldc:int(1180819831))
                            goto(Label_1270)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_43C:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_1176)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_43C:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_43C = and:int(var_3_43C:int, ldc:int(-1310359068))
                            loopcontinue()
                        }
                        
                        var_3_43C = and:int(var_3_43C:int, ldc:int(-140003329))
                        invokevirtual:boolean(ByteBuf::release, var_5_446:ByteBuf)
                    }
                    
                    Label_1653:
                    
                    if (cmpne:boolean(and:int(var_3_43C:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1572)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_43C:int, ldc:int(16)), ldc:int(0))) {
                        var_3_43C = and:int(var_3_43C:int, ldc:int(546742923))
                        goto(Label_1490)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_43C:int, ldc:int(8)), ldc:int(0))) {
                        var_3_43C = and:int(var_3_43C:int, ldc:int(-918023077))
                        goto(Label_1394)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_43C:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1270)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_43C:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1176)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_43C:int, ldc:int(4096)), ldc:int(0))) {
                        looporswitchbreak()
                    }
                    
                    var_3_43C = and:int(var_3_43C:int, ldc:int(-902906903))
                }
                
                var_3_43C = and:int(var_3_43C:int, ldc:int(387440582))
            }
            finally {
                loop {
                    if (cmpeq:boolean(and:int(var_3_43C:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_6D5 = and:int(var_3_43C:int, ldc:int(1997343854))
                    }
                    else {
                        var_3_6D5 = and:int(var_3_43C:int, ldc:int(-1301101066))
                        invokevirtual:boolean(ByteBuf::release, var_5_446:ByteBuf)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6D5:int, ldc:int(4096)), ldc:int(0))) {
                        looporswitchbreak()
                    }
                    
                    var_3_43C = and:int(var_3_6D5:int, ldc:int(548728022))
                }
            }
            
            invokevirtual:void(\ua3b4\ub1b9\u9af2\u3d64\uf94d\u3dd3<\ub83f\u6c52\u12cb\u3c25\u3776[]>::\ud171\uc229\ufe34\u36d3\u5f50\uc2e8, getstatic:\u1833\ud171\u8350\ubded\u34df\uc9f6<\ub83f\u6c52\u12cb\u3c25\u3776[]>[expected:\ua3b4\ub1b9\u9af2\u3d64\uf94d\u3dd3<\ub83f\u6c52\u12cb\u3c25\u3776[]>](\u1833\ud171\u8350\ubded\u34df\uc9f6::\u760c\ucfaf\ub19c\u446c\u7873\u97b7), p0:ByteBuf, invokeinterface:\ub83f\u6c52\u12cb\u3c25\u3776[](List<\ub83f\u6c52\u12cb\u3c25\u3776>::toArray, invokeinterface:List<\ub83f\u6c52\u12cb\u3c25\u3776>(\ud12e\ub18d\ud158\ud36e\ub8be\u56bd::\u6ec6\ub83f\ud217\uc229\u74b1\ub32d, p1:\ud12e\ub18d\ud158\ud36e\ub8be\u56bd), getstatic:\ub83f\u6c52\u12cb\u3c25\u3776[](\ub70c\u64ab\u3bc9\u6d69\u5140\u92ff::\u718f\u99f7\u92ee\u6ec6\u446c\ucfaf)))
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
            return:Object(invokevirtual:\ud12e\ub18d\ud158\ud36e\ub8be\u56bd[expected:Object](\ub70c\u64ab\u3bc9\u6d69\u5140\u92ff::\u4d85\uff55\uc3e3\ud4fe\u9937\uc229, this:\ub70c\u64ab\u3bc9\u6d69\u5140\u92ff, p0:ByteBuf))
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
            invokevirtual:void(\ub70c\u64ab\u3bc9\u6d69\u5140\u92ff::\ud171\uc229\ufe34\u36d3\u5f50\uc2e8, this:\ub70c\u64ab\u3bc9\u6d69\u5140\u92ff, p0:ByteBuf, checkcast:\ud12e\ub18d\ud158\ud36e\ub8be\u56bd(\u71f1\uc910\u3bc9\u516c\u93a2.\ud12e\ub18d\ud158\ud36e\ub8be\u56bd.class, p1:Object[expected:\ud12e\ub18d\ud158\ud36e\ub8be\u56bd]))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_86 : int
        expr_6E : int [generated]
        stack_9A_0 : byte[] [generated]
        stack_9C_0 : byte[] [generated]
        stack_D9_0 : byte[] [generated]
        stack_DB_0 : byte[] [generated]
        stack_113_0 : byte[] [generated]
        stack_115_0 : byte[] [generated]
        stack_13F_0 : byte[] [generated]
        stack_1E7_0 : byte[] [generated]
        stack_26C_0 : byte[] [generated]
        stack_2C0_0 : byte[] [generated]
        stack_316_0 : byte[] [generated]
        var_4_1C8 : int
        var_3_1CD : byte[]
        var_5_1CE : int
        var_0_201 : int
        expr_1E7 : byte [generated]
        stack_22F_2 : byte [generated]
        stack_204_0 : byte [generated]
        expr_26C : byte [generated]
        expr_9C : int [generated]
        var_2_D9 : byte[]
        expr_DD : int [generated]
        var_3_2AE : byte[]
        var_5_2AF : int
        expr_115 : int [generated]
        var_3_304 : byte[]
        var_5_305 : int
        var_3_14B : String
        stack_1B4_0 : String[] [generated]
        expr_15D : String[] [generated]
        
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
        var_0_86 = and:int(ldc:int(969456047), ldc:int(1061240667))
        expr_6E = arraylength:int(stack_9A_0 = stack_9C_0 = stack_D9_0 = stack_DB_0 = stack_113_0 = stack_115_0 = stack_13F_0 = stack_1E7_0 = stack_26C_0 = stack_2C0_0 = stack_316_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("pgEKiob7AAV3e1ymf/78/qcGANoI+Xp3e4EAgYMEBB77Z4GF/uIFIvxx///lXpCIgRkW/oQxtLk1UiA=")))
        
        if (cmpeq:boolean(expr_6E:int, ldc:int(0))) {
            goto(Label_0115)
        }
        
        var_4_1C8 = expr_6E:int
        var_3_1CD = newarray:byte[](byte.class, expr_6E:int)
        var_5_1CE = expr_6E:int
        Label_0464:
        
        while (cmpeq:boolean(and:int(var_0_86:int, ldc:int(64)), ldc:int(0))) {
            var_0_201 = and:int(var_0_86:int, ldc:int(971406806))
            var_5_1CE = add:int(var_5_1CE:int, ldc:int(-1))
            expr_1E7 = stack_22F_2 = loadelement(stack_1E7_0, var_5_1CE)
            
            if (cmplt:boolean(add:int(add:int(var_5_1CE:int, ldc:int(6)), neg:int(var_4_1C8:int)), ldc:int(0))) {
                stack_22F_2 = stack_204_0 = add:byte(expr_1E7:byte, loadelement:byte(var_3_1CD:byte[], add:int(var_5_1CE:int, ldc:int(6))))
                goto(Label_0532)
            }
            
            Label_0500:
            
            if (cmpne:boolean(and:int(var_0_201:int, ldc:int(134217728)), ldc:int(0))) {
                var_0_201 = and:int(var_0_201:int, ldc:int(976928514))
                stack_22F_2 = stack_204_0 = add:byte(expr_1E7:byte, ldc:byte(6))
            }
            
            Label_0532:
            
            if (cmpeq:boolean(and:int(var_0_201:int, ldc:int(2147483647)), ldc:int(0))) {
                var_0_201 = and:int(var_0_201:int, ldc:int(-323337646))
                goto(Label_0500)
            }
            
            var_0_86 = and:int(var_0_201:int, ldc:int(-38913558))
            storeelement:byte(var_3_1CD:byte[], var_5_1CE:int, stack_22F_2:byte)
            
            if (cmpne:boolean(var_5_1CE:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9C_0 = stack_9A_0 = stack_D9_0 = stack_DB_0 = stack_113_0 = stack_115_0 = stack_13F_0 = stack_1E7_0 = stack_26C_0 = stack_2C0_0 = stack_316_0 = var_3_1CD:byte[]
            goto(Label_0115)
        }
        
        Label_0597:
        
        while (cmpeq:boolean(and:int(var_0_86:int, ldc:int(512)), ldc:int(0))) {
            var_0_86 = and:int(var_0_86:int, ldc:int(2141027827))
            var_5_1CE = add:int(var_5_1CE:int, ldc:int(-1))
            expr_26C = loadelement:byte(stack_26C_0:byte[], var_5_1CE:int)
            storeelement:byte(var_3_1CD:byte[], var_5_1CE:int, add:int(or:int(and:int(shl:int(expr_26C:byte, xor:int(ldc:int(-31672), ldc:int(-31668))), ldc:int(-16)), and:int(shr:int(expr_26C:byte[expected:int], and:int(ldc:int(276), ldc:int(20517))), ldc:int(15))), ldc:int(54)))
            
            if (cmpne:boolean(var_5_1CE:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9C_0 = stack_9A_0 = stack_D9_0 = stack_DB_0 = stack_113_0 = stack_115_0 = stack_13F_0 = stack_1E7_0 = stack_26C_0 = stack_2C0_0 = stack_316_0 = var_3_1CD:byte[]
            goto(Label_0161)
        }
        
        goto(Label_0464)
        Label_0115:
        
        if (cmpne:boolean(and:int(var_0_86:int, ldc:int(1073741824)), ldc:int(0))) {
            goto(Label_0282)
        }
        
        if (cmpne:boolean(and:int(var_0_86:int, ldc:int(33554432)), ldc:int(0))) {
            var_0_86 = and:int(var_0_86:int, ldc:int(-996180757))
            goto(Label_0226)
        }
        
        if (cmpne:boolean(and:int(var_0_86:int, ldc:int(8192)), ldc:int(0))) {
            var_0_86 = and:int(var_0_86:int, ldc:int(-12502201))
            expr_9C = arraylength:int(stack_9C_0:byte[])
            
            if (cmpne:boolean(expr_9C:int, ldc:int(0))) {
                var_4_1C8 = expr_9C:int
                var_3_1CD = newarray:byte[](byte.class, expr_9C:int)
                var_5_1CE = expr_9C:int
                goto(Label_0597)
            }
        }
        
        Label_0161:
        
        if (cmpne:boolean(and:int(var_0_86:int, ldc:int(1073741824)), ldc:int(0))) {
            var_0_86 = and:int(var_0_86:int, ldc:int(259270904))
            goto(Label_0282)
        }
        
        if (cmpeq:boolean(and:int(var_0_86:int, ldc:int(2147483647)), ldc:int(0))) {
            var_0_86 = and:int(var_0_86:int, ldc:int(1874098231))
        }
        else {
            if (cmpne:boolean(and:int(var_0_86:int, ldc:int(16)), ldc:int(0))) {
                var_0_86 = and:int(var_0_86:int, ldc:int(1032026800))
                goto(Label_0115)
            }
            
            var_0_86 = and:int(var_0_86:int, ldc:int(-1137574981))
            var_2_D9 = stack_D9_0:byte[]
            expr_DD = add:int(arraylength:int(stack_DB_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_DD:int, ldc:int(0))) {
                var_3_2AE = newarray:byte[](byte.class, expr_DD:int)
                var_5_2AF = expr_DD:int
                
                loop {
                    var_0_86 = and:int(var_0_86:int, ldc:int(-35243173))
                    var_5_2AF = add:int(var_5_2AF:int, ldc:int(-1))
                    storeelement:byte(var_3_2AE:byte[], var_5_2AF:int, add:int(shl:int(loadelement:byte(stack_2C0_0:byte[], var_5_2AF:int), ldc:int(5)), and:int(shr:int(loadelement:byte(var_2_D9:byte[], add:int(var_5_2AF:int, and:int(ldc:int(4105), ldc:int(8215)))), ldc:int(3)), and:int(ldc:int(16543), ldc:int(2399)))))
                    
                    if (cmpne:boolean(var_5_2AF:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_9C_0 = stack_9A_0 = stack_D9_0 = stack_DB_0 = stack_113_0 = stack_115_0 = stack_13F_0 = stack_1E7_0 = stack_26C_0 = stack_2C0_0 = stack_316_0 = var_3_2AE:byte[]
            }
        }
        
        Label_0226:
        
        if (cmpne:boolean(and:int(var_0_86:int, ldc:int(512)), ldc:int(0))) {
            var_0_86 = and:int(var_0_86:int, ldc:int(-89812396))
        }
        else {
            if (cmpeq:boolean(and:int(var_0_86:int, ldc:int(256)), ldc:int(0))) {
                goto(Label_0161)
            }
            
            if (cmpeq:boolean(and:int(var_0_86:int, ldc:int(8192)), ldc:int(0))) {
                var_0_86 = and:int(var_0_86:int, ldc:int(532749315))
                goto(Label_0115)
            }
            
            var_0_86 = and:int(var_0_86:int, ldc:int(-1161135621))
            expr_115 = arraylength:int(stack_115_0:byte[])
            
            if (cmpne:boolean(expr_115:int, ldc:int(0))) {
                var_3_304 = newarray:byte[](byte.class, expr_115:int)
                var_5_305 = expr_115:int
                
                loop {
                    var_0_86 = and:int(var_0_86:int, ldc:int(2074574123))
                    var_5_305 = add:int(var_5_305:int, ldc:int(-1))
                    storeelement:byte(var_3_304:byte[], var_5_305:int, xor:byte(loadelement:byte(stack_316_0:byte[], var_5_305:int), ldc:byte(83)))
                    
                    if (cmpne:boolean(var_5_305:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_9C_0 = stack_9A_0 = stack_D9_0 = stack_DB_0 = stack_113_0 = stack_115_0 = stack_13F_0 = stack_1E7_0 = stack_26C_0 = stack_2C0_0 = stack_316_0 = var_3_304:byte[]
            }
        }
        
        Label_0282:
        
        if (cmpne:boolean(and:int(var_0_86:int, ldc:int(1073741824)), ldc:int(0))) {
            var_0_86 = and:int(var_0_86:int, ldc:int(1391452461))
            goto(Label_0226)
        }
        
        if (cmpeq:boolean(and:int(var_0_86:int, ldc:int(536870912)), ldc:int(0))) {
            goto(Label_0161)
        }
        
        if (cmpeq:boolean(and:int(var_0_86:int, ldc:int(16)), ldc:int(0))) {
            var_3_14B = initobject:String(String::<init>, stack_13F_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_1B4_0 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(-29440), ldc:int(-29437)))
            expr_15D = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(1235), ldc:int(10283)))
            storeelement:String(expr_15D:String[], and:int(ldc:int(8327), ldc:int(1025)), invokevirtual:String[expected:String](String::substring, var_3_14B:String, and:int(ldc:int(-27497), ldc:int(27496)), and:int(ldc:int(179), ldc:int(2099))))
            storeelement:String(expr_15D:String[], and:int(ldc:int(28803), ldc:int(1050)), invokevirtual:String[expected:String](String::substring, var_3_14B:String, and:int(ldc:int(12471), ldc:int(1395)), xor:int(ldc:int(-16265), ldc:int(-16317))))
            storeelement:String(expr_15D:String[], and:int(ldc:int(-1760), ldc:int(1755)), invokevirtual:String[expected:String](String::substring, var_3_14B:String, xor:int(ldc:int(6174), ldc:int(6186)), xor:int(ldc:int(20720), ldc:int(20682))))
            putstatic:String[](\ub70c\u64ab\u3bc9\u6d69\u5140\u92ff::\u3bd6\u600f\u6198\u2dcc\u98a4\u4cd9, expr_15D:String[])
            putstatic:\ub83f\u6c52\u12cb\u3c25\u3776[](\ub70c\u64ab\u3bc9\u6d69\u5140\u92ff::\u718f\u99f7\u92ee\u6ec6\u446c\ucfaf, newarray:\ub83f\u6c52\u12cb\u3c25\u3776[](\u51b2\u6fb0\ufcaf\u61a4\u0800.\uc7fe\ua61f\ub18d\u64ab\u4f4a.\ub83f\u6c52\u12cb\u3c25\u3776.class, and:int(ldc:int(31248), ldc:int(-32351))))
            return:void()
        }
        
        goto(Label_0115)
    }
    
    public void \u8cae\u5f50\u3e75\uceb8\u873d\ua3b4(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_655 : int
        var_5_89 : int
        var_6_90 : int
        var_7_9F : double
        var_9_C6 : double
        var_3_D8 : int
        var_11_E9 : int
        var_14_113 : double
        var_16_117 : int
        var_12_10F : double
        var_17_660 : int
        
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
        var_3_655 = and:int(ldc:int(-972310070), ldc:int(302225998))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\ub70c\u64ab\u3bc9\u6d69\u5140\u92ff[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0179)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_655:int, ldc:int(131072)), ldc:int(0))) {
            var_3_655 = and:int(var_3_655:int, ldc:int(434180872))
        }
        else {
            var_3_655 = and:int(var_3_655:int, ldc:int(456121963))
            var_5_89 = and:int(ldc:int(-12170), ldc:int(3976))
            var_6_90 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9F = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(856), ldc:int(-857)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C6 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D8 = and:int(var_3_655:int, ldc:int(1457512302))
                    var_9_C6 = sub:double(var_7_9F:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E9 = var_5_89:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E9:int, sub:int(var_6_90:int, and:int(ldc:int(10249), ldc:int(1283)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E9:int, and:int(ldc:int(1091), ldc:int(513)))), var_7_9F:double))) {
                        inc:int(var_11_E9, ldc:int(1))
                    }
                    
                    var_3_655 = and:int(var_3_D8:int, ldc:int(-609764514))
                    var_14_113 = var_7_9F:double
                    var_16_117 = var_11_E9:int
                }
                else {
                    var_11_E9 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_89:int), xor:int(ldc:int(16902), ldc:int(16903)))
                    var_12_10F = var_14_113 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_89)
                    
                    if (cmplt:boolean(var_16_117 = var_11_E9:int, var_6_90:int)) {
                        var_9_C6 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E9:int)
                        var_16_117 = var_11_E9:int
                        var_14_113 = var_12_10F:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_655:int, ldc:int(64)), ldc:int(0))) {
                        var_3_655 = and:int(var_3_655:int, ldc:int(-276481679))
                        goto(Label_1532)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_655:int, ldc:int(4)), ldc:int(0))) {
                        var_3_655 = and:int(var_3_655:int, ldc:int(1155284041))
                        goto(Label_1395)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_655:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_655 = and:int(var_3_655:int, ldc:int(1922067905))
                        goto(Label_1235)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_655:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_655 = and:int(var_3_655:int, ldc:int(-93935693))
                        goto(Label_1132)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_655:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_655 = and:int(var_3_655:int, ldc:int(2044083341))
                        goto(Label_0977)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_655:int, ldc:int(32)), ldc:int(0))) {
                        var_3_655 = and:int(var_3_655:int, ldc:int(-1150807250))
                        goto(Label_0859)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_655:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0720)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_655:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0602)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_655:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_655 = and:int(var_3_655:int, ldc:int(2143010814))
                        
                        if (cmplt:boolean(var_16_117:int, var_6_90:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0602)
                            }
                            
                            goto(Label_0859)
                        }
                    }
                    
                    Label_0422:
                    
                    if (cmpne:boolean(and:int(var_3_655:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_655 = and:int(var_3_655:int, ldc:int(157622600))
                        goto(Label_1532)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_655:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_655 = and:int(var_3_655:int, ldc:int(-2143176487))
                        goto(Label_1395)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_655:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_655 = and:int(var_3_655:int, ldc:int(-1630943821))
                        goto(Label_1235)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_655:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1132)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_655:int, ldc:int(8)), ldc:int(0))) {
                        var_3_655 = and:int(var_3_655:int, ldc:int(574776688))
                        goto(Label_0977)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_655:int, ldc:int(8)), ldc:int(0))) {
                        var_3_655 = and:int(var_3_655:int, ldc:int(-227230761))
                        goto(Label_0859)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_655:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_655 = and:int(var_3_655:int, ldc:int(1208400427))
                        goto(Label_0720)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_655:int, ldc:int(4)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_655:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_655 = and:int(var_3_655:int, ldc:int(736615899))
                            var_11_E9 = and:int(ldc:int(-14773), ldc:int(10656))
                            goto(Label_1521)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0602:
                    
                    if (cmpne:boolean(and:int(var_3_655:int, ldc:int(32)), ldc:int(0))) {
                        var_3_655 = and:int(var_3_655:int, ldc:int(-958906480))
                        goto(Label_1532)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_655:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1395)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_655:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1235)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_655:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1132)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_655:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_655 = and:int(var_3_655:int, ldc:int(-1703514340))
                        goto(Label_0977)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_655:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_655 = and:int(var_3_655:int, ldc:int(1165378262))
                        goto(Label_0859)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_655:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_655 = and:int(var_3_655:int, ldc:int(-1981904585))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_655:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0422)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_655:int, ldc:int(4096)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_655 = and:int(var_3_655:int, ldc:int(186302427))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_113 = var_9_C6:double
                            goto(Label_0859)
                        }
                    }
                    
                    Label_0720:
                    
                    if (cmpeq:boolean(and:int(var_3_655:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1532)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_655:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_655 = and:int(var_3_655:int, ldc:int(-1973720705))
                        goto(Label_1395)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_655:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1235)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_655:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1132)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_655:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_655 = and:int(var_3_655:int, ldc:int(-1102374599))
                        goto(Label_0977)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_655:int, ldc:int(64)), ldc:int(0))) {
                        var_3_655 = and:int(var_3_655:int, ldc:int(-1169846056))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_655:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_655 = and:int(var_3_655:int, ldc:int(-1193266570))
                            goto(Label_0602)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_655:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0422)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_655:int, ldc:int(2)), ldc:int(0))) {
                            var_3_655 = and:int(var_3_655:int, ldc:int(1016737248))
                            loopcontinue()
                        }
                        
                        var_3_655 = and:int(var_3_655:int, ldc:int(-1085293094))
                        var_14_113 = mul:double(ldc:double(0.5), add:double(var_9_C6:double, var_14_113:double))
                    }
                    
                    Label_0859:
                    
                    if (cmpeq:boolean(and:int(var_3_655:int, ldc:int(8)), ldc:int(0))) {
                        var_3_655 = and:int(var_3_655:int, ldc:int(1873547257))
                        goto(Label_1532)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_655:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_655 = and:int(var_3_655:int, ldc:int(-286061350))
                        goto(Label_1395)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_655:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1235)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_655:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_655 = and:int(var_3_655:int, ldc:int(1981225089))
                        goto(Label_1132)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_655:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_655 = and:int(var_3_655:int, ldc:int(1970248433))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_655:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0720)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_655:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0602)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_655:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0422)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_655:int, ldc:int(4096)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_655 = and:int(var_3_655:int, ldc:int(-2081498146))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_89:int), var_7_9F:double)) {
                                var_11_E9 = xor:int(ldc:int(8964), ldc:int(8965))
                                goto(Label_1132)
                            }
                        }
                    }
                    
                    Label_0977:
                    
                    if (cmpeq:boolean(and:int(var_3_655:int, ldc:int(8)), ldc:int(0))) {
                        var_3_655 = and:int(var_3_655:int, ldc:int(-1158109195))
                        goto(Label_1532)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_655:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1395)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_655:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_655 = and:int(var_3_655:int, ldc:int(-1930116590))
                        goto(Label_1235)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_655:int, ldc:int(33554432)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_655:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0859)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_655:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_655 = and:int(var_3_655:int, ldc:int(1096092231))
                            goto(Label_0720)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_655:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0602)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_655:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0422)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_655:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_655 = and:int(var_3_655:int, ldc:int(1684525705))
                            loopcontinue()
                        }
                        
                        var_3_655 = and:int(var_3_655:int, ldc:int(-745611413))
                        var_11_E9 = and:int(ldc:int(-27939), ldc:int(11522))
                    }
                    
                    Label_1132:
                    
                    if (cmpeq:boolean(and:int(var_3_655:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1532)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_655:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_655 = and:int(var_3_655:int, ldc:int(-1923953645))
                        goto(Label_1395)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_655:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_655 = and:int(var_3_655:int, ldc:int(1167892949))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_655:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0977)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_655:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0859)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_655:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0720)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_655:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0602)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_655:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0422)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_655:int, ldc:int(4194304)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_655 = and:int(var_3_655:int, ldc:int(803658619))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E9:int, ldc:int(0))) {
                                goto(Label_1395)
                            }
                        }
                    }
                    
                    Label_1235:
                    
                    if (cmpeq:boolean(and:int(var_3_655:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_655 = and:int(var_3_655:int, ldc:int(1748723550))
                        goto(Label_1532)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_655:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_655 = and:int(var_3_655:int, ldc:int(-469043154))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_655:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_655 = and:int(var_3_655:int, ldc:int(-1557066888))
                            goto(Label_1132)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_655:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_655 = and:int(var_3_655:int, ldc:int(-320811139))
                            goto(Label_0977)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_655:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0859)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_655:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0720)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_655:int, ldc:int(4)), ldc:int(0))) {
                            var_3_655 = and:int(var_3_655:int, ldc:int(804090680))
                            goto(Label_0602)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_655:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_655 = and:int(var_3_655:int, ldc:int(-1343520672))
                            goto(Label_0422)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_655:int, ldc:int(2)), ldc:int(0))) {
                            var_3_655 = and:int(var_3_655:int, ldc:int(-6734734))
                            loopcontinue()
                        }
                        
                        var_3_655 = and:int(var_3_655:int, ldc:int(-831866130))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_113:double, var_5_89:int, var_16_117:int)
                        goto(Label_1521)
                    }
                    
                    Label_1395:
                    
                    if (cmpne:boolean(and:int(var_3_655:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1532)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_655:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1235)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_655:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_655 = and:int(var_3_655:int, ldc:int(1604736579))
                        goto(Label_1132)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_655:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0977)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_655:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0859)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_655:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0720)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_655:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_655 = and:int(var_3_655:int, ldc:int(-1896451612))
                        goto(Label_0602)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_655:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0422)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_655:int, ldc:int(4)), ldc:int(0))) {
                        var_3_655 = and:int(var_3_655:int, ldc:int(1566451790))
                        loopcontinue()
                    }
                    
                    var_3_655 = and:int(var_3_655:int, ldc:int(-1968506418))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_113:double, ldc:double(0.0))
                    Label_1521:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_660 = var_5_89:int
                        
                        if (cmpeq:boolean(var_11_E9:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1532:
                    
                    if (cmpne:boolean(and:int(var_3_655:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1395)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_655:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1235)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_655:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1132)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_655:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0977)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_655:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0859)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_655:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_655 = and:int(var_3_655:int, ldc:int(-74912499))
                        goto(Label_0720)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_655:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0602)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_655:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0422)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_655:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_655 = and:int(var_3_655:int, ldc:int(459774314))
                        var_17_660 = add:int(var_16_117:int, xor:int(ldc:int(8608), ldc:int(8609)))
                        looporswitchbreak()
                    }
                    
                    var_3_655 = and:int(var_3_655:int, ldc:int(1286381801))
                }
                
                var_3_655 = and:int(var_3_655:int, ldc:int(1992202718))
                
                if (cmple:boolean(var_5_89 = var_17_660:int, sub:int(var_6_90:int, and:int(ldc:int(585), ldc:int(5251))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0179:
        
        if (cmpne:boolean(and:int(var_3_655:int, ldc:int(2147483647)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
