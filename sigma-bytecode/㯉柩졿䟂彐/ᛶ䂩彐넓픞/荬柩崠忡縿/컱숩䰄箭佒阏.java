public class \u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u836c\u67e9\u5d20\u5fe1\u7e3f.\ucef1\uc229\u4c04\u7bad\u4f52\u960f {
    public void \ucef1\uc229\u4c04\u7bad\u4f52\u960f() {
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
            invokespecial:\u1833\ud171\u8350\ubded\u34df\uc9f6(\u1833\ud171\u8350\ubded\u34df\uc9f6::<init>, this:\ucef1\uc229\u4c04\u7bad\u4f52\u960f, ldc:Class<int[]>(int[].class))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public int[] \u4d85\uff55\uc3e3\ud4fe\u9937\uc229(io.netty.buffer.ByteBuf p0) {
        var_2_5F : int
        var_4_67 : int
        var_5_76 : int[]
        var_6_7F : int
        
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
            var_2_5F = and:int(ldc:int(287228185), ldc:int(1805642137))
            var_4_67 = invokevirtual:int(\uceb8\u4c2b\ub8be\u7049\u8308\u3a62::\uc4d2\uf94d\u6d69\u6b5f\ucef1\u624e, getstatic:\uceb8\u4c2b\ub8be\u7049\u8308\u3a62(\u1833\ud171\u8350\ubded\u34df\uc9f6::\ud523\u62da\u6c52\u7043\ud217\u72f1), p0:ByteBuf)
            invokestatic:void(Preconditions::checkArgument, invokevirtual:boolean(ByteBuf::isReadable, p0:ByteBuf, var_4_67:int))
            var_5_76 = newarray:int[](int.class, var_4_67:int)
            var_6_7F = and:int(ldc:int(-31197), ldc:int(20940))
            
            loop {
                var_2_5F = and:int(var_2_5F:int, ldc:int(-1975536357))
                
                if (cmpge:boolean(var_6_7F:int, arraylength:int(var_5_76:int[]))) {
                    looporswitchbreak()
                }
                
                storeelement:int(var_5_76:int[], var_6_7F:int, invokevirtual:int(\uceb8\u4c2b\ub8be\u7049\u8308\u3a62::\uc4d2\uf94d\u6d69\u6b5f\ucef1\u624e, getstatic:\uceb8\u4c2b\ub8be\u7049\u8308\u3a62(\u1833\ud171\u8350\ubded\u34df\uc9f6::\ud523\u62da\u6c52\u7043\ud217\u72f1), p0:ByteBuf))
                inc:int(var_6_7F, ldc:int(1))
            }
            
            return:int[](var_5_76:int[])
        }
        
        goto(Label_0006)
    }
    
    public void \ud171\uc229\ufe34\u36d3\u5f50\uc2e8(io.netty.buffer.ByteBuf p0, int[] p1) {
        var_3_5F : int
        var_6_6F : int
        var_7_78 : int
        
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
            var_3_5F = and:int(ldc:int(-1621332133), ldc:int(467510225))
            invokevirtual:void(\uceb8\u4c2b\ub8be\u7049\u8308\u3a62::\u0c95\u6435\u3504\u36d3\u2dcc\u16f6, getstatic:\uceb8\u4c2b\ub8be\u7049\u8308\u3a62(\u1833\ud171\u8350\ubded\u34df\uc9f6::\ud523\u62da\u6c52\u7043\ud217\u72f1), p0:ByteBuf, arraylength:int(p1:int[]))
            var_6_6F = arraylength:int(p1:int[])
            var_7_78 = and:int(ldc:int(4371), ldc:int(-4372))
            
            loop {
                var_3_5F = and:int(var_3_5F:int, ldc:int(-438541343))
                
                if (cmpge:boolean(var_7_78:int, var_6_6F:int)) {
                    looporswitchbreak()
                }
                
                invokevirtual:void(\uceb8\u4c2b\ub8be\u7049\u8308\u3a62::\u0c95\u6435\u3504\u36d3\u2dcc\u16f6, getstatic:\uceb8\u4c2b\ub8be\u7049\u8308\u3a62(\u1833\ud171\u8350\ubded\u34df\uc9f6::\ud523\u62da\u6c52\u7043\ud217\u72f1), p0:ByteBuf, loadelement:int(p1:int[], var_7_78:int))
                inc:int(var_7_78, ldc:int(1))
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
            return:Object(invokevirtual:int[][expected:Object](\ucef1\uc229\u4c04\u7bad\u4f52\u960f::\u4d85\uff55\uc3e3\ud4fe\u9937\uc229, this:\ucef1\uc229\u4c04\u7bad\u4f52\u960f, p0:ByteBuf))
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
            invokevirtual:void(\ucef1\uc229\u4c04\u7bad\u4f52\u960f::\ud171\uc229\ufe34\u36d3\u5f50\uc2e8, this:\ucef1\uc229\u4c04\u7bad\u4f52\u960f, p0:ByteBuf, checkcast:int[](int[].class, p1:Object[expected:int[]]))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u8cae\u5f50\u3e75\uceb8\u873d\ua3b4(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_5ED : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_B9 : double
        var_3_CA : int
        var_11_DB : int
        var_14_105 : double
        var_16_109 : int
        var_12_101 : double
        var_17_5F8 : int
        
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
        var_3_5ED = and:int(ldc:int(1440830595), ldc:int(-3148101))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\ucef1\uc229\u4c04\u7bad\u4f52\u960f[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(2147483647)), ldc:int(0))) {
            var_3_5ED = and:int(var_3_5ED:int, ldc:int(1155398907))
            var_5_7D = and:int(ldc:int(-1287), ldc:int(1286))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-20232), ldc:int(19719)))
            invokestatic:int(m::a)
            
            loop {
                var_9_B9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_CA = and:int(var_3_5ED:int, ldc:int(1833140223))
                    var_9_B9 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_DB = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_DB:int, sub:int(var_6_84:int, xor:int(ldc:int(21008), ldc:int(21009)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_DB:int, and:int(ldc:int(27753), ldc:int(135)))), var_7_93:double))) {
                        inc:int(var_11_DB, ldc:int(1))
                    }
                    
                    var_3_5ED = and:int(var_3_CA:int, ldc:int(1593270059))
                    var_14_105 = var_7_93:double
                    var_16_109 = var_11_DB:int
                }
                else {
                    var_11_DB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), xor:int(ldc:int(16392), ldc:int(16393)))
                    var_12_101 = var_14_105 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_109 = var_11_DB:int, var_6_84:int)) {
                        var_9_B9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_DB:int)
                        var_16_109 = var_11_DB:int
                        var_14_105 = var_12_101:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(1)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(1330557903))
                        goto(Label_1442)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(256419607))
                        goto(Label_1300)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1162)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(64)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(-35852912))
                        goto(Label_1051)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0905)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0786)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0652)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(-45736591))
                        goto(Label_0525)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(-62693789))
                        
                        if (cmplt:boolean(var_16_109:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0525)
                            }
                            
                            goto(Label_0786)
                        }
                    }
                    
                    Label_0381:
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(32)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(-325903780))
                        goto(Label_1442)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(-747442922))
                        goto(Label_1300)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1162)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(361861638))
                        goto(Label_1051)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0905)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0786)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0652)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(1024)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_5ED = and:int(var_3_5ED:int, ldc:int(1609653791))
                            var_11_DB = and:int(ldc:int(12742), ldc:int(-14823))
                            goto(Label_1431)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0525:
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(567178391))
                        goto(Label_1442)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(1)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(-876113079))
                        goto(Label_1300)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(-913625583))
                        goto(Label_1162)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(1428581429))
                        goto(Label_1051)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0905)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0786)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(-115836534))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(1)), ldc:int(0))) {
                            var_3_5ED = and:int(var_3_5ED:int, ldc:int(574397598))
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(32)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(-698260377))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_105 = var_9_B9:double
                            goto(Label_0786)
                        }
                    }
                    
                    Label_0652:
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(-1255132785))
                        goto(Label_1442)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1300)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(309890120))
                        goto(Label_1162)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(64)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(-1898529395))
                        goto(Label_1051)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0905)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(32)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(-72224671))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0525)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(64)), ldc:int(0))) {
                            var_3_5ED = and:int(var_3_5ED:int, ldc:int(-285995134))
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_5ED = and:int(var_3_5ED:int, ldc:int(560021335))
                            loopcontinue()
                        }
                        
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(-444906357))
                        var_14_105 = mul:double(ldc:double(0.5), add:double(var_9_B9:double, var_14_105:double))
                    }
                    
                    Label_0786:
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1442)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(64)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(-1987413564))
                        goto(Label_1300)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(1195422093))
                        goto(Label_1162)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1051)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(-1568280907))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(32)), ldc:int(0))) {
                            var_3_5ED = and:int(var_3_5ED:int, ldc:int(-1445132789))
                            goto(Label_0652)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0525)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_5ED = and:int(var_3_5ED:int, ldc:int(-161612030))
                            loopcontinue()
                        }
                        
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(1558793675))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_DB = xor:int(ldc:int(20), ldc:int(21))
                                goto(Label_1051)
                            }
                        }
                    }
                    
                    Label_0905:
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(-1339209739))
                        goto(Label_1442)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1300)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(512)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(-1929856499))
                        goto(Label_1162)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(32)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0786)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_5ED = and:int(var_3_5ED:int, ldc:int(2140907862))
                            goto(Label_0652)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(64)), ldc:int(0))) {
                            var_3_5ED = and:int(var_3_5ED:int, ldc:int(554246896))
                            goto(Label_0525)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(512)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(-17445089))
                        var_11_DB = and:int(ldc:int(-11022), ldc:int(11021))
                    }
                    
                    Label_1051:
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(30551425))
                        goto(Label_1442)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1300)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(67108864)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_5ED = and:int(var_3_5ED:int, ldc:int(-1991907104))
                            goto(Label_0905)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0786)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0652)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0525)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(512)), ldc:int(0))) {
                            var_3_5ED = and:int(var_3_5ED:int, ldc:int(1656140259))
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_5ED = and:int(var_3_5ED:int, ldc:int(-2122639649))
                            loopcontinue()
                        }
                        
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(-831783673))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                                goto(Label_1300)
                            }
                        }
                    }
                    
                    Label_1162:
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1442)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(1)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(64)), ldc:int(0))) {
                            var_3_5ED = and:int(var_3_5ED:int, ldc:int(-907820089))
                            goto(Label_1051)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_5ED = and:int(var_3_5ED:int, ldc:int(1802136358))
                            goto(Label_0905)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_5ED = and:int(var_3_5ED:int, ldc:int(909186591))
                            goto(Label_0786)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_5ED = and:int(var_3_5ED:int, ldc:int(1914656315))
                            goto(Label_0652)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_5ED = and:int(var_3_5ED:int, ldc:int(64616300))
                            goto(Label_0525)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(2)), ldc:int(0))) {
                            var_3_5ED = and:int(var_3_5ED:int, ldc:int(-569442804))
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(1)), ldc:int(0))) {
                            var_3_5ED = and:int(var_3_5ED:int, ldc:int(1556438035))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_105:double, var_5_7D:int, var_16_109:int)
                            goto(Label_1431)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1300:
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(-1175559420))
                        goto(Label_1442)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(1660300239))
                        goto(Label_1162)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1051)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0905)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(250151586))
                        goto(Label_0786)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(-1426896722))
                        goto(Label_0652)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0525)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0381)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(1)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(365072591))
                        loopcontinue()
                    }
                    
                    var_3_5ED = and:int(var_3_5ED:int, ldc:int(1322514331))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_105:double, ldc:double(0.0))
                    Label_1431:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_5F8 = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1442:
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1300)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1162)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(1659091798))
                        goto(Label_1051)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0905)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0786)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0652)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0525)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0381)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(1458269303))
                        var_17_5F8 = add:int(var_16_109:int, xor:int(ldc:int(-30703), ldc:int(-30704)))
                        looporswitchbreak()
                    }
                }
                
                var_3_5ED = and:int(var_3_5ED:int, ldc:int(-3575865))
                
                if (cmple:boolean(var_5_7D = var_17_5F8:int, sub:int(var_6_84:int, xor:int(ldc:int(18432), ldc:int(18433))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(64)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
