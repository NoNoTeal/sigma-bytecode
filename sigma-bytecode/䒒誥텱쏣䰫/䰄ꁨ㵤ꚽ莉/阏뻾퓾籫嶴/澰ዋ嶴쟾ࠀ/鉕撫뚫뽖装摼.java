public class \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\u9255\u64ab\ub6ab\ubf56\u88c5\u647c {
    public void \u9255\u64ab\ub6ab\ubf56\u88c5\u647c() {
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
            invokespecial:Object(Object::<init>, this:\u9255\u64ab\ub6ab\ubf56\u88c5\u647c)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static java.nio.IntBuffer \u965f\uc2bd\ub1b9\u12b2\u3711\ua6bd(int p0) {
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
            
            if (cmplt:boolean(invokevirtual:int(Buffer::capacity, getstatic:IntBuffer[expected:Buffer](\u9255\u64ab\ub6ab\ubf56\u88c5\u647c::\ubded\u3776\ub83f\ubded\u72f1\u836c)), p0:int)) {
                putstatic:ByteBuffer(\u9255\u64ab\ub6ab\ubf56\u88c5\u647c::\u34df\u071d\u600f\u9937\u494c\ub19c, invokestatic:ByteBuffer(BufferUtils::createByteBuffer, mul:int(invokestatic:int(\u9255\u64ab\ub6ab\ubf56\u88c5\u647c::\u7bad\u7ce1\u6d99\u47c2\u6c52\u4f52, p0:int), xor:int(ldc:int(-20415), ldc:int(-20411)))))
                putstatic:IntBuffer(\u9255\u64ab\ub6ab\ubf56\u88c5\u647c::\ubded\u3776\ub83f\ubded\u72f1\u836c, invokevirtual:IntBuffer(ByteBuffer::asIntBuffer, getstatic:ByteBuffer(\u9255\u64ab\ub6ab\ubf56\u88c5\u647c::\u34df\u071d\u600f\u9937\u494c\ub19c)))
            }
            
            return:IntBuffer(getstatic:IntBuffer(\u9255\u64ab\ub6ab\ubf56\u88c5\u647c::\ubded\u3776\ub83f\ubded\u72f1\u836c))
        }
        
        goto(Label_0006)
    }
    
    public static int[] \uf995\u8753\ufe34\u600f\u8258\uf995(int p0) {
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
            
            if (cmpeq:boolean(getstatic:int[](\u9255\u64ab\ub6ab\ubf56\u88c5\u647c::\u76bc\u6c56\u6c56\ubff1\uc9f6\u34df), aconstnull:int[]())) {
                putstatic:int[](\u9255\u64ab\ub6ab\ubf56\u88c5\u647c::\u76bc\u6c56\u6c56\ubff1\uc9f6\u34df, newarray:int[](int.class, ldc:int(1048576)))
            }
            
            if (cmplt:boolean(arraylength:int(getstatic:int[](\u9255\u64ab\ub6ab\ubf56\u88c5\u647c::\u76bc\u6c56\u6c56\ubff1\uc9f6\u34df)), p0:int)) {
                putstatic:int[](\u9255\u64ab\ub6ab\ubf56\u88c5\u647c::\u76bc\u6c56\u6c56\ubff1\uc9f6\u34df, newarray:int[](int.class, invokestatic:int(\u9255\u64ab\ub6ab\ubf56\u88c5\u647c::\u7bad\u7ce1\u6d99\u47c2\u6c52\u4f52, p0:int)))
            }
            
            return:int[](getstatic:int[](\u9255\u64ab\ub6ab\ubf56\u88c5\u647c::\u76bc\u6c56\u6c56\ubff1\uc9f6\u34df))
        }
        
        goto(Label_0006)
    }
    
    public static int \u7bad\u7ce1\u6d99\u47c2\u6c52\u4f52(int p0) {
        var_3_69 : int
        var_3_75 : int
        var_3_81 : int
        var_3_8D : int
        var_3_94 : int
        
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
            var_3_69 = sub:int(p0:int, and:int(ldc:int(19), ldc:int(24773)))
            var_3_75 = or:int(var_3_69:int, shr:int(var_3_69:int, xor:int(ldc:int(-15864), ldc:int(-15863))))
            var_3_81 = or:int(var_3_75:int, shr:int(var_3_75:int, xor:int(ldc:int(-8189), ldc:int(-8191))))
            var_3_8D = or:int(var_3_81:int, shr:int(var_3_81:int, and:int(ldc:int(6), ldc:int(22548))))
            var_3_94 = or:int(var_3_8D:int, shr:int(var_3_8D:int, ldc:int(8)))
            return:int(add:int(or:int(var_3_94:int, shr:int(var_3_94:int, ldc:int(16))), xor:int(ldc:int(192), ldc:int(193))))
        }
        
        goto(Label_0006)
    }
    
    public static int \u7d52\ud4fe\u9af2\u4d85\u47c2\ud171(int p0) {
        var_1_5F : int
        var_3_67 : int
        
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
            var_1_5F = and:int(ldc:int(976099733), ldc:int(1624114047))
            var_3_67 = and:int(ldc:int(10529), ldc:int(-10530))
            
            if (cmpne:boolean(and:int(p0:int, ldc:int(-65536)), ldc:int(0))) {
                inc:int(var_3_67, ldc:int(16))
                p0 = shr:int(p0:int, ldc:int(16))
            }
            
            loop {
                if (cmpne:boolean(and:int(var_1_5F:int, ldc:int(1048576)), ldc:int(0))) {
                    goto(Label_0231)
                }
                
                if (cmpne:boolean(and:int(var_1_5F:int, ldc:int(8)), ldc:int(0))) {
                    var_1_5F = and:int(var_1_5F:int, ldc:int(311158879))
                    goto(Label_0198)
                }
                
                if (cmpeq:boolean(and:int(var_1_5F:int, ldc:int(16777216)), ldc:int(0))) {
                    var_1_5F = and:int(var_1_5F:int, ldc:int(-1428166913))
                    
                    if (cmpne:boolean(and:int(p0:int, ldc:int(65280)), ldc:int(0))) {
                        inc:int(var_3_67, ldc:int(8))
                        p0 = shr:int(p0:int, ldc:int(8))
                    }
                }
                
                Label_0152:
                
                if (cmpne:boolean(and:int(var_1_5F:int, ldc:int(1048576)), ldc:int(0))) {
                    var_1_5F = and:int(var_1_5F:int, ldc:int(930511997))
                    goto(Label_0231)
                }
                
                if (cmpne:boolean(and:int(var_1_5F:int, ldc:int(16)), ldc:int(0))) {
                    if (cmpne:boolean(and:int(var_1_5F:int, ldc:int(1048576)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_1_5F = and:int(var_1_5F:int, ldc:int(1063851164))
                    
                    if (cmpne:boolean(and:int(p0:int, and:int(ldc:int(1780), ldc:int(16624))), ldc:int(0))) {
                        inc:int(var_3_67, ldc:int(4))
                        p0 = shr:int(p0:int, xor:int(ldc:int(98), ldc:int(102)))
                    }
                }
                
                Label_0198:
                
                if (cmpeq:boolean(and:int(var_1_5F:int, ldc:int(16384)), ldc:int(0))) {
                    if (cmpne:boolean(and:int(var_1_5F:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0152)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_5F:int, ldc:int(32)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_1_5F = and:int(var_1_5F:int, ldc:int(-205695428))
                    
                    if (cmpne:boolean(and:int(p0:int, ldc:int(6)), ldc:int(0))) {
                        inc:int(var_3_67, ldc:int(2))
                        p0 = shr:int(p0:int, and:int(ldc:int(24715), ldc:int(1142)))
                    }
                }
                
                Label_0231:
                
                if (cmpeq:boolean(and:int(var_1_5F:int, ldc:int(4)), ldc:int(0))) {
                    goto(Label_0198)
                }
                
                if (cmpne:boolean(and:int(var_1_5F:int, ldc:int(16384)), ldc:int(0))) {
                    var_1_5F = and:int(var_1_5F:int, ldc:int(1544732403))
                    goto(Label_0152)
                }
                
                if (cmpeq:boolean(and:int(var_1_5F:int, ldc:int(16384)), ldc:int(0))) {
                    looporswitchbreak()
                }
            }
            
            if (cmpne:boolean(and:int(p0:int, and:int(ldc:int(2), ldc:int(32386))), ldc:int(0))) {
                inc:int(var_3_67, ldc:int(1))
            }
            
            return:int(var_3_67:int)
        }
        
        goto(Label_0006)
    }
    
    public static java.nio.IntBuffer \ub70c\ucb79\uc87f\ubff1\uafe7\u9a18(int p0, int p1) {
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
            invokestatic:int[](\u9255\u64ab\ub6ab\ubf56\u88c5\u647c::\uf995\u8753\ufe34\u600f\u8258\uf995, p0:int)
            invokestatic:IntBuffer(\u9255\u64ab\ub6ab\ubf56\u88c5\u647c::\u965f\uc2bd\ub1b9\u12b2\u3711\ua6bd, p0:int)
            invokestatic:void(Arrays::fill, getstatic:int[](\u9255\u64ab\ub6ab\ubf56\u88c5\u647c::\u76bc\u6c56\u6c56\ubff1\uc9f6\u34df), and:int(ldc:int(11200), ldc:int(-11202)), p0:int, p1:int)
            invokevirtual:IntBuffer(IntBuffer::put, getstatic:IntBuffer(\u9255\u64ab\ub6ab\ubf56\u88c5\u647c::\ubded\u3776\ub83f\ubded\u72f1\u836c), getstatic:int[](\u9255\u64ab\ub6ab\ubf56\u88c5\u647c::\u76bc\u6c56\u6c56\ubff1\uc9f6\u34df), and:int(ldc:int(-19774), ldc:int(18709)), p0:int)
            return:IntBuffer(getstatic:IntBuffer(\u9255\u64ab\ub6ab\ubf56\u88c5\u647c::\ubded\u3776\ub83f\ubded\u72f1\u836c))
        }
        
        goto(Label_0006)
    }
    
    public static int[] \uc31c\ub7dc\ua068\ud4fe\ud12e\u5fe1(int p0) {
        var_3_6B : int[]
        
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
            var_3_6B = newarray:int[](int.class, mul:int(p0:int, and:int(ldc:int(4679), ldc:int(283))))
            invokestatic:void(Arrays::fill, var_3_6B:int[], and:int(ldc:int(18850), ldc:int(-18867)), p0:int, and:int(ldc:int(-18572), ldc:int(18571)))
            invokestatic:void(Arrays::fill, var_3_6B:int[], p0:int, mul:int(p0:int, xor:int(ldc:int(16519), ldc:int(16517))), ldc:int(-8421377))
            invokestatic:void(Arrays::fill, var_3_6B:int[], mul:int(p0:int, xor:int(ldc:int(-24443), ldc:int(-24441))), mul:int(p0:int, and:int(ldc:int(17483), ldc:int(259))), and:int(ldc:int(-29763), ldc:int(25666)))
            return:int[](var_3_6B:int[])
        }
        
        goto(Label_0006)
    }
    
    public static int[] \uc31c\ub7dc\ua068\ud4fe\ud12e\u5fe1(int p0, int p1) {
        var_4_6B : int[]
        
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
            var_4_6B = newarray:int[](int.class, mul:int(p0:int, and:int(ldc:int(24631), ldc:int(1923))))
            invokestatic:void(Arrays::fill, var_4_6B:int[], and:int(ldc:int(-32316), ldc:int(21523)), p0:int, p1:int)
            invokestatic:void(Arrays::fill, var_4_6B:int[], p0:int, mul:int(p0:int, and:int(ldc:int(115), ldc:int(13446))), ldc:int(-8421377))
            invokestatic:void(Arrays::fill, var_4_6B:int[], mul:int(p0:int, and:int(ldc:int(2), ldc:int(17818))), mul:int(p0:int, xor:int(ldc:int(8962), ldc:int(8961))), and:int(ldc:int(30979), ldc:int(-31492)))
            return:int[](var_4_6B:int[])
        }
        
        goto(Label_0006)
    }
    
    public static \u12b2\u7049\u8df4\uc9f6\uae87.\ucfaf\uc2e8\u3776\u1187\u120d\u9255 \ud523\u446c\u600f\ud12e\uf9c5\u7043(\u3504\ufe34\u600f\u6b0d\u69d9.\u9937\u4cd9\u4ab3\u59ec\u64f2\uc29a p0) {
        var_1_5F : int
        var_3_64 : \ucfaf\uc2e8\u3776\u1187\u120d\u9255
        var_4_78 : int
        
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
            var_1_5F = and:int(ldc:int(-84140283), ldc:int(-88335825))
            var_3_64 = getfield:\ucfaf\uc2e8\u3776\u1187\u120d\u9255(\u9937\u4cd9\u4ab3\u59ec\u64f2\uc29a::\u5f50\u760c\u6cfe\u839e\u5bc4\uc910, p0:\u9937\u4cd9\u4ab3\u59ec\u64f2\uc29a)
            
            if (cmpeq:boolean(var_3_64:\ucfaf\uc2e8\u3776\u1187\u120d\u9255, aconstnull:\ucfaf\uc2e8\u3776\u1187\u120d\u9255())) {
                var_4_78 = invokevirtual:int(\u9937\u4cd9\u4ab3\u59ec\u64f2\uc29a::\u3dd3\u071d\u6fb0\u8413\u64f2\u3bc9, p0:\u9937\u4cd9\u4ab3\u59ec\u64f2\uc29a)
                var_3_64 = checkcast:\ucfaf\uc2e8\u3776\u1187\u120d\u9255(\u12b2\u7049\u8df4\uc9f6\uae87.\ucfaf\uc2e8\u3776\u1187\u120d\u9255.class, invokeinterface:\ucfaf\uc2e8\u3776\u1187\u120d\u9255(Map<Integer, \ucfaf\uc2e8\u3776\u1187\u120d\u9255>::get, getstatic:Map<Integer, \ucfaf\uc2e8\u3776\u1187\u120d\u9255>(\u9255\u64ab\ub6ab\ubf56\u88c5\u647c::\uc7fe\u5bc4\ub113\u3a62\u6bb9\u8d98), invokestatic:Integer(Integer::valueOf, var_4_78:int)))
                
                if (cmpeq:boolean(var_3_64:\ucfaf\uc2e8\u3776\u1187\u120d\u9255, aconstnull:\ucfaf\uc2e8\u3776\u1187\u120d\u9255())) {
                    var_3_64 = initobject:\ucfaf\uc2e8\u3776\u1187\u120d\u9255(\ucfaf\uc2e8\u3776\u1187\u120d\u9255::<init>, var_4_78:int, invokestatic:int(GL11::glGenTextures), invokestatic:int(GL11::glGenTextures))
                    invokeinterface:\ucfaf\uc2e8\u3776\u1187\u120d\u9255(Map<Integer, \ucfaf\uc2e8\u3776\u1187\u120d\u9255>::put, getstatic:Map<Integer, \ucfaf\uc2e8\u3776\u1187\u120d\u9255>(\u9255\u64ab\ub6ab\ubf56\u88c5\u647c::\uc7fe\u5bc4\ub113\u3a62\u6bb9\u8d98), invokestatic:Integer(Integer::valueOf, var_4_78:int), var_3_64:\ucfaf\uc2e8\u3776\u1187\u120d\u9255)
                }
                
                var_1_5F = and:int(var_1_5F:int, ldc:int(-92323849))
                putfield:\ucfaf\uc2e8\u3776\u1187\u120d\u9255(\u9937\u4cd9\u4ab3\u59ec\u64f2\uc29a::\u5f50\u760c\u6cfe\u839e\u5bc4\uc910, p0:\u9937\u4cd9\u4ab3\u59ec\u64f2\uc29a, var_3_64:\ucfaf\uc2e8\u3776\u1187\u120d\u9255)
            }
            
            return:\ucfaf\uc2e8\u3776\u1187\u120d\u9255(var_3_64:\ucfaf\uc2e8\u3776\u1187\u120d\u9255)
        }
        
        goto(Label_0006)
    }
    
    public static void \u839e\u7006\uc9f6\u416d\u16f6\u3c25(\u3504\ufe34\u600f\u6b0d\u69d9.\u9937\u4cd9\u4ab3\u59ec\u64f2\uc29a p0, int p1) {
        var_4_64 : \ucfaf\uc2e8\u3776\u1187\u120d\u9255
        
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
            var_4_64 = getfield:\ucfaf\uc2e8\u3776\u1187\u120d\u9255(\u9937\u4cd9\u4ab3\u59ec\u64f2\uc29a::\u5f50\u760c\u6cfe\u839e\u5bc4\uc910, p0:\u9937\u4cd9\u4ab3\u59ec\u64f2\uc29a)
            
            if (cmpne:boolean(var_4_64:\ucfaf\uc2e8\u3776\u1187\u120d\u9255, aconstnull:\ucfaf\uc2e8\u3776\u1187\u120d\u9255())) {
                putfield:\ucfaf\uc2e8\u3776\u1187\u120d\u9255(\u9937\u4cd9\u4ab3\u59ec\u64f2\uc29a::\u5f50\u760c\u6cfe\u839e\u5bc4\uc910, p0:\u9937\u4cd9\u4ab3\u59ec\u64f2\uc29a, aconstnull:\ucfaf\uc2e8\u3776\u1187\u120d\u9255())
                invokeinterface:\ucfaf\uc2e8\u3776\u1187\u120d\u9255(Map<Integer, \ucfaf\uc2e8\u3776\u1187\u120d\u9255>::remove, getstatic:Map<Integer, \ucfaf\uc2e8\u3776\u1187\u120d\u9255>(\u9255\u64ab\ub6ab\ubf56\u88c5\u647c::\uc7fe\u5bc4\ub113\u3a62\u6bb9\u8d98), invokestatic:Integer(Integer::valueOf, getfield:int(\ucfaf\uc2e8\u3776\u1187\u120d\u9255::\u624e\uc2bd\u9af2\u960f\u8709\u6c56, var_4_64:\ucfaf\uc2e8\u3776\u1187\u120d\u9255)))
                invokestatic:void(\u3a62\u92ff\u12cb\u8753\u7bad::\u64ab\u7d52\u3dd3\u0b8e\uafe7\u5654, getfield:int(\ucfaf\uc2e8\u3776\u1187\u120d\u9255::\ucfaf\uf9c5\u0b8e\u416d\u62da\u7049, var_4_64:\ucfaf\uc2e8\u3776\u1187\u120d\u9255))
                invokestatic:void(\u3a62\u92ff\u12cb\u8753\u7bad::\u64ab\u7d52\u3dd3\u0b8e\uafe7\u5654, getfield:int(\ucfaf\uc2e8\u3776\u1187\u120d\u9255::\u156b\u8c8a\uc3e3\ub18d\u5bc4\ud523, var_4_64:\ucfaf\uc2e8\u3776\u1187\u120d\u9255))
                
                if (cmpne:boolean(getfield:int(\ucfaf\uc2e8\u3776\u1187\u120d\u9255::\u624e\uc2bd\u9af2\u960f\u8709\u6c56, var_4_64:\ucfaf\uc2e8\u3776\u1187\u120d\u9255), p1:int)) {
                    invokestatic:void(\u67e9\u6d99\u873d\uff55\u6cfe\ubff1::\u51fa\u69d9\u8350\u9033\u965f\u7873, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u9255\u64ab\ub6ab\ubf56\u88c5\u647c::\u760c\u8389\ud51e\u0800\u61a4\u759a), and:int(ldc:int(-28109), ldc:int(28096)))), getfield:int(\ucfaf\uc2e8\u3776\u1187\u120d\u9255::\u624e\uc2bd\u9af2\u960f\u8709\u6c56, var_4_64:\ucfaf\uc2e8\u3776\u1187\u120d\u9255)), loadelement:String(getstatic:String[](\u9255\u64ab\ub6ab\ubf56\u88c5\u647c::\u760c\u8389\ud51e\u0800\u61a4\u759a), xor:int(ldc:int(5138), ldc:int(5139)))), p1:int)))
                    invokestatic:void(\u3a62\u92ff\u12cb\u8753\u7bad::\u64ab\u7d52\u3dd3\u0b8e\uafe7\u5654, getfield:int(\ucfaf\uc2e8\u3776\u1187\u120d\u9255::\u624e\uc2bd\u9af2\u960f\u8709\u6c56, var_4_64:\ucfaf\uc2e8\u3776\u1187\u120d\u9255))
                }
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static void \ub1b9\u156b\u7049\u6d99\uff55\u873d(int p0, int p1) {
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
            
            if (getstatic:boolean(\uc238\u69d9\u92ff\ub83f\u5245\uc229::\u8bb0\u0a06\u392e\u527a\u8640\u6c52)) {
                if (cmpeq:boolean(invokestatic:int(\u3a62\u92ff\u12cb\u8753\u7bad::\u74b1\u92ff\u4e72\u839e\u416d\u99f7), ldc:int(33984))) {
                    invokestatic:void(\u3a62\u92ff\u12cb\u8753\u7bad::\u6ec6\ufe34\u7006\uc4d2\u8cae\u47c2, ldc:int(33985))
                    invokestatic:void(\u3a62\u92ff\u12cb\u8753\u7bad::\u67d0\u93a2\ub83f\u6c52\u8308\uc3e3, p0:int)
                    invokestatic:void(\u3a62\u92ff\u12cb\u8753\u7bad::\u6ec6\ufe34\u7006\uc4d2\u8cae\u47c2, ldc:int(33987))
                    invokestatic:void(\u3a62\u92ff\u12cb\u8753\u7bad::\u67d0\u93a2\ub83f\u6c52\u8308\uc3e3, p1:int)
                    invokestatic:void(\u3a62\u92ff\u12cb\u8753\u7bad::\u6ec6\ufe34\u7006\uc4d2\u8cae\u47c2, ldc:int(33984))
                }
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static void \ub1b9\u156b\u7049\u6d99\uff55\u873d(\u12b2\u7049\u8df4\uc9f6\uae87.\ucfaf\uc2e8\u3776\u1187\u120d\u9255 p0) {
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
            invokestatic:void(\u9255\u64ab\ub6ab\ubf56\u88c5\u647c::\ub1b9\u156b\u7049\u6d99\uff55\u873d, getfield:int(\ucfaf\uc2e8\u3776\u1187\u120d\u9255::\ucfaf\uf9c5\u0b8e\u416d\u62da\u7049, p0:\ucfaf\uc2e8\u3776\u1187\u120d\u9255), getfield:int(\ucfaf\uc2e8\u3776\u1187\u120d\u9255::\u156b\u8c8a\uc3e3\ub18d\u5bc4\ud523, p0:\ucfaf\uc2e8\u3776\u1187\u120d\u9255))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static void \uae87\u7e3f\u34df\u67d0\u839e\u6c52(int p0, int p1, int p2) {
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
            
            if (getstatic:boolean(\uc238\u69d9\u92ff\ub83f\u5245\uc229::\u8bb0\u0a06\u392e\u527a\u8640\u6c52)) {
                if (cmpeq:boolean(invokestatic:int(\u3a62\u92ff\u12cb\u8753\u7bad::\u74b1\u92ff\u4e72\u839e\u416d\u99f7), ldc:int(33984))) {
                    invokestatic:void(\u3a62\u92ff\u12cb\u8753\u7bad::\u6ec6\ufe34\u7006\uc4d2\u8cae\u47c2, ldc:int(33985))
                    invokestatic:void(\u3a62\u92ff\u12cb\u8753\u7bad::\u67d0\u93a2\ub83f\u6c52\u8308\uc3e3, p1:int)
                    invokestatic:void(\u3a62\u92ff\u12cb\u8753\u7bad::\u6ec6\ufe34\u7006\uc4d2\u8cae\u47c2, ldc:int(33987))
                    invokestatic:void(\u3a62\u92ff\u12cb\u8753\u7bad::\u67d0\u93a2\ub83f\u6c52\u8308\uc3e3, p2:int)
                    invokestatic:void(\u3a62\u92ff\u12cb\u8753\u7bad::\u6ec6\ufe34\u7006\uc4d2\u8cae\u47c2, ldc:int(33984))
                }
            }
            
            invokestatic:void(\u3a62\u92ff\u12cb\u8753\u7bad::\u67d0\u93a2\ub83f\u6c52\u8308\uc3e3, p0:int)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static void \uae87\u7e3f\u34df\u67d0\u839e\u6c52(\u12b2\u7049\u8df4\uc9f6\uae87.\ucfaf\uc2e8\u3776\u1187\u120d\u9255 p0) {
        var_1_75 : int
        var_1_B6 : int
        
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
        var_1_75 = and:int(ldc:int(430836229), ldc:int(-1649414555))
        
        if (getstatic:boolean(\uc238\u69d9\u92ff\ub83f\u5245\uc229::\u8bb0\u0a06\u392e\u527a\u8640\u6c52)) {
            if (cmpeq:boolean(invokestatic:int(\u3a62\u92ff\u12cb\u8753\u7bad::\u74b1\u92ff\u4e72\u839e\u416d\u99f7), ldc:int(33984))) {
                if (logicalnot:boolean(getstatic:boolean(\uc238\u69d9\u92ff\ub83f\u5245\uc229::\u7bad\u4e72\uafe7\uf995\u6198\u47c2))) {
                    goto(Label_0160)
                }
                
                invokestatic:void(\u3a62\u92ff\u12cb\u8753\u7bad::\u6ec6\ufe34\u7006\uc4d2\u8cae\u47c2, ldc:int(33985))
                invokestatic:void(\u3a62\u92ff\u12cb\u8753\u7bad::\u67d0\u93a2\ub83f\u6c52\u8308\uc3e3, getfield:int(\ucfaf\uc2e8\u3776\u1187\u120d\u9255::\ucfaf\uf9c5\u0b8e\u416d\u62da\u7049, p0:\ucfaf\uc2e8\u3776\u1187\u120d\u9255))
                goto(Label_0160)
            }
        }
        
        Label_0104:
        
        if (cmpeq:boolean(and:int(var_1_75:int, ldc:int(128)), ldc:int(0))) {
            invokestatic:void(\u3a62\u92ff\u12cb\u8753\u7bad::\u67d0\u93a2\ub83f\u6c52\u8308\uc3e3, getfield:int(\ucfaf\uc2e8\u3776\u1187\u120d\u9255::\u624e\uc2bd\u9af2\u960f\u8709\u6c56, p0:\ucfaf\uc2e8\u3776\u1187\u120d\u9255))
            return:void()
        }
        
        var_1_75 = and:int(var_1_75:int, ldc:int(-458120977))
        Label_0160:
        
        if (cmpne:boolean(and:int(var_1_75:int, ldc:int(1024)), ldc:int(0))) {
            var_1_75 = and:int(var_1_75:int, ldc:int(1241011291))
            goto(Label_0104)
        }
        
        var_1_B6 = and:int(var_1_75:int, ldc:int(1975216723))
        
        if (getstatic:boolean(\uc238\u69d9\u92ff\ub83f\u5245\uc229::\u494c\u3711\u97e6\ubefe\u6cfe\u4c04)) {
            invokestatic:void(\u3a62\u92ff\u12cb\u8753\u7bad::\u6ec6\ufe34\u7006\uc4d2\u8cae\u47c2, ldc:int(33987))
            invokestatic:void(\u3a62\u92ff\u12cb\u8753\u7bad::\u67d0\u93a2\ub83f\u6c52\u8308\uc3e3, getfield:int(\ucfaf\uc2e8\u3776\u1187\u120d\u9255::\u156b\u8c8a\uc3e3\ub18d\u5bc4\ud523, p0:\ucfaf\uc2e8\u3776\u1187\u120d\u9255))
        }
        
        var_1_75 = and:int(var_1_B6:int, ldc:int(-202432595))
        invokestatic:void(\u3a62\u92ff\u12cb\u8753\u7bad::\u6ec6\ufe34\u7006\uc4d2\u8cae\u47c2, ldc:int(33984))
        goto(Label_0104)
    }
    
    public static void \u6ec6\ucb79\uc229\u8cae\ud523\u8640(\u3504\ufe34\u600f\u6b0d\u69d9.\u9937\u4cd9\u4ab3\u59ec\u64f2\uc29a p0) {
        var_1_9E : int
        var_4_84 : int
        var_5_89 : int
        var_6_105 : boolean
        
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
            var_1_9E = and:int(ldc:int(-160120303), ldc:int(-138529016))
            invokevirtual:int(\u9937\u4cd9\u4ab3\u59ec\u64f2\uc29a::\u3dd3\u071d\u6fb0\u8413\u64f2\u3bc9, p0:\u9937\u4cd9\u4ab3\u59ec\u64f2\uc29a)
            invokestatic:void(\u9255\u64ab\ub6ab\ubf56\u88c5\u647c::\uae87\u7e3f\u34df\u67d0\u839e\u6c52, invokevirtual:\ucfaf\uc2e8\u3776\u1187\u120d\u9255(\u9937\u4cd9\u4ab3\u59ec\u64f2\uc29a::\ub102\u494c\u0a06\uc229\ua562\uf94d, p0:\u9937\u4cd9\u4ab3\u59ec\u64f2\uc29a))
            
            if (cmpeq:boolean(invokestatic:int(\u3a62\u92ff\u12cb\u8753\u7bad::\u74b1\u92ff\u4e72\u839e\u416d\u99f7), ldc:int(33984))) {
                var_4_84 = getstatic:int(\uc238\u69d9\u92ff\ub83f\u5245\uc229::\u40a9\ub32d\u40a9\u4daf\u3e2a\uc7fe)
                var_5_89 = getstatic:int(\uc238\u69d9\u92ff\ub83f\u5245\uc229::\u97b7\ubb2b\u527a\u9255\ucb79\uc229)
                
                if (instanceof:boolean(\u12b2\u4e72\u8df4\u67e9\u67e9.\ud171\u156b\u0800\u36d3\ub8be\u760c.class, p0:\u9937\u4cd9\u4ab3\u59ec\u64f2\uc29a)) {
                    putstatic:int(\uc238\u69d9\u92ff\ub83f\u5245\uc229::\u40a9\ub32d\u40a9\u4daf\u3e2a\uc7fe, getfield:int(\ud171\u156b\u0800\u36d3\ub8be\u760c::\ua068\u8bb0\ua562\u62da\u156b\ud51e, checkcast:\ud171\u156b\u0800\u36d3\ub8be\u760c(\u12b2\u4e72\u8df4\u67e9\u67e9.\ud171\u156b\u0800\u36d3\ub8be\u760c.class, p0:\u9937\u4cd9\u4ab3\u59ec\u64f2\uc29a[expected:\ud171\u156b\u0800\u36d3\ub8be\u760c])))
                    putstatic:int(\uc238\u69d9\u92ff\ub83f\u5245\uc229::\u97b7\ubb2b\u527a\u9255\ucb79\uc229, getfield:int(\ud171\u156b\u0800\u36d3\ub8be\u760c::\u6d69\u6bb9\uc3e3\u8413\u64ab\uc29a, checkcast:\ud171\u156b\u0800\u36d3\ub8be\u760c(\u12b2\u4e72\u8df4\u67e9\u67e9.\ud171\u156b\u0800\u36d3\ub8be\u760c.class, p0:\u9937\u4cd9\u4ab3\u59ec\u64f2\uc29a[expected:\ud171\u156b\u0800\u36d3\ub8be\u760c])))
                    goto(Label_0215)
                }
                
                Label_0146:
                
                if (cmpeq:boolean(and:int(var_1_9E:int, ldc:int(1048576)), ldc:int(0))) {
                    var_1_9E = and:int(var_1_9E:int, ldc:int(-246564931))
                }
                else {
                    var_1_9E = and:int(var_1_9E:int, ldc:int(-157295802))
                    putstatic:int(\uc238\u69d9\u92ff\ub83f\u5245\uc229::\u40a9\ub32d\u40a9\u4daf\u3e2a\uc7fe, and:int(ldc:int(-23131), ldc:int(21082)))
                    putstatic:int(\uc238\u69d9\u92ff\ub83f\u5245\uc229::\u97b7\ubb2b\u527a\u9255\ucb79\uc229, and:int(ldc:int(2846), ldc:int(-2911)))
                }
                
                Label_0215:
                
                if (cmpne:boolean(and:int(var_1_9E:int, ldc:int(4)), ldc:int(0))) {
                    var_1_9E = and:int(var_1_9E:int, ldc:int(-859218059))
                    goto(Label_0146)
                }
                
                var_1_9E = and:int(var_1_9E:int, ldc:int(-31634690))
                
                if (logicalor:boolean(cmpne:boolean(getstatic:int(\uc238\u69d9\u92ff\ub83f\u5245\uc229::\u40a9\ub32d\u40a9\u4daf\u3e2a\uc7fe), var_4_84:int), cmpne:boolean(getstatic:int(\uc238\u69d9\u92ff\ub83f\u5245\uc229::\u97b7\ubb2b\u527a\u9255\ucb79\uc229), var_5_89:int))) {
                    var_1_9E = and:int(var_1_9E:int, ldc:int(-161519367))
                    var_6_105 = invokestatic:boolean(\ub70c\u92ee\u0b8e\ub7dc\u7d52\u61a4::\ub18d\ufe34\u071d\ua6bd\u1187\u965f, and:int[expected:boolean](ldc:int(-9628), ldc:int(9361)))
                    invokevirtual:void(\u8aa5\u7c6b\ud7e8\u4179\ubcb0\u93a2::\u4f52\uc238\u5db4\uafe7\u3c25\u120d, getstatic:\u8aa5\u7c6b\ud7e8\u4179\ubcb0\u93a2(\uc238\u69d9\u92ff\ub83f\u5245\uc229::\u5245\u4cd9\u4e72\u3e2a\u16f6\u8389), getstatic:int(\uc238\u69d9\u92ff\ub83f\u5245\uc229::\u40a9\ub32d\u40a9\u4daf\u3e2a\uc7fe), getstatic:int(\uc238\u69d9\u92ff\ub83f\u5245\uc229::\u97b7\ubb2b\u527a\u9255\ucb79\uc229))
                    invokestatic:boolean(\ub70c\u92ee\u0b8e\ub7dc\u7d52\u61a4::\ub18d\ufe34\u071d\ua6bd\u1187\u965f, var_6_105:boolean)
                }
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static void \uae87\u7e3f\u34df\u67d0\u839e\u6c52(int p0) {
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
            invokestatic:void(\u9255\u64ab\ub6ab\ubf56\u88c5\u647c::\uae87\u7e3f\u34df\u67d0\u839e\u6c52, checkcast:\ucfaf\uc2e8\u3776\u1187\u120d\u9255(\u12b2\u7049\u8df4\uc9f6\uae87.\ucfaf\uc2e8\u3776\u1187\u120d\u9255.class, invokeinterface:\ucfaf\uc2e8\u3776\u1187\u120d\u9255(Map<Integer, \ucfaf\uc2e8\u3776\u1187\u120d\u9255>::get, getstatic:Map<Integer, \ucfaf\uc2e8\u3776\u1187\u120d\u9255>(\u9255\u64ab\ub6ab\ubf56\u88c5\u647c::\uc7fe\u5bc4\ub113\u3a62\u6bb9\u8d98), invokestatic:Integer[expected:Object](Integer::valueOf, p0:int))))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static void \ucfaf\u4f4a\u71f1\u69d9\uafe7\u647c(\ubcb0\ud12e\u51fa\u8aa5\u0c95.\u5140\u4ab3\u183a\ud523\u071d\u983f p0) {
        var_3_66 : \ucfaf\uc2e8\u3776\u1187\u120d\u9255
        var_4_6B : \u5db4\ud523\u7043\u6c52\u8308\u8350
        var_5_72 : int
        var_6_79 : int
        var_7_84 : \u5db4\ud523\u7043\u6c52\u8308\u8350
        var_8_E7 : \u5db4\ud523\u7043\u6c52\u8308\u8350
        
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
            var_3_66 = invokevirtual:\ucfaf\uc2e8\u3776\u1187\u120d\u9255(\u9937\u4cd9\u4ab3\u59ec\u64f2\uc29a::\ub102\u494c\u0a06\uc229\ua562\uf94d, p0:\u5140\u4ab3\u183a\ud523\u071d\u983f[expected:\u9937\u4cd9\u4ab3\u59ec\u64f2\uc29a])
            var_4_6B = invokevirtual:\u5db4\ud523\u7043\u6c52\u8308\u8350(\u5140\u4ab3\u183a\ud523\u071d\u983f::\uc31c\u97b7\u7049\ub19c\u56bd\u3e2a, p0:\u5140\u4ab3\u183a\ud523\u071d\u983f)
            var_5_72 = invokevirtual:int(\u5db4\ud523\u7043\u6c52\u8308\u8350::\ubb2b\u3a62\u71ae\ub171\u92ff\u8389, var_4_6B:\u5db4\ud523\u7043\u6c52\u8308\u8350)
            var_6_79 = invokevirtual:int(\u5db4\ud523\u7043\u6c52\u8308\u8350::\u392e\u839e\u183a\u72f1\ucb79\u5245, var_4_6B:\u5db4\ud523\u7043\u6c52\u8308\u8350)
            var_7_84 = invokestatic:\u5db4\ud523\u7043\u6c52\u8308\u8350(\u9255\u64ab\ub6ab\ubf56\u88c5\u647c::\u8c8a\u72f1\u385b\uf9c5\u8308\ua3b4, var_5_72:int, var_6_79:int, ldc:int(-8421377))
            invokestatic:void(\u9255\uc2e8\u6d69\u7e3f\uae87\uc31c::\u946b\u92ee\u8cae\u624e\u4d85\u6435, getfield:int(\ucfaf\uc2e8\u3776\u1187\u120d\u9255::\ucfaf\uf9c5\u0b8e\u416d\u62da\u7049, var_3_66:\ucfaf\uc2e8\u3776\u1187\u120d\u9255), var_5_72:int, var_6_79:int)
            invokevirtual:void(\u5db4\ud523\u7043\u6c52\u8308\u8350::\u7e3f\u4cd9\u071d\u8640\u4179\u0800, var_7_84:\u5db4\ud523\u7043\u6c52\u8308\u8350, and:int(ldc:int(4096), ldc:int(-4097)), and:int(ldc:int(-23353), ldc:int(19232)), and:int(ldc:int(-6878), ldc:int(2780)), and:int(ldc:int(10421), ldc:int(-14526)), and:int(ldc:int(467), ldc:int(-4596)), var_5_72:int, var_6_79:int, and:int[expected:boolean](ldc:int(-2359), ldc:int(2358)), and:int[expected:boolean](ldc:int(14209), ldc:int(-16292)), and:int[expected:boolean](ldc:int(12888), ldc:int(-12889)), and:int[expected:boolean](ldc:int(12437), ldc:int(1537)))
            var_8_E7 = invokestatic:\u5db4\ud523\u7043\u6c52\u8308\u8350(\u9255\u64ab\ub6ab\ubf56\u88c5\u647c::\u8c8a\u72f1\u385b\uf9c5\u8308\ua3b4, var_5_72:int, var_6_79:int, and:int(ldc:int(-32030), ldc:int(21789)))
            invokestatic:void(\u9255\uc2e8\u6d69\u7e3f\uae87\uc31c::\u946b\u92ee\u8cae\u624e\u4d85\u6435, getfield:int(\ucfaf\uc2e8\u3776\u1187\u120d\u9255::\u156b\u8c8a\uc3e3\ub18d\u5bc4\ud523, var_3_66:\ucfaf\uc2e8\u3776\u1187\u120d\u9255), var_5_72:int, var_6_79:int)
            invokevirtual:void(\u5db4\ud523\u7043\u6c52\u8308\u8350::\u7e3f\u4cd9\u071d\u8640\u4179\u0800, var_8_E7:\u5db4\ud523\u7043\u6c52\u8308\u8350, and:int(ldc:int(-5619), ldc:int(5554)), and:int(ldc:int(2816), ldc:int(-2817)), and:int(ldc:int(13403), ldc:int(-29788)), and:int(ldc:int(-7746), ldc:int(7744)), and:int(ldc:int(9554), ldc:int(-9555)), var_5_72:int, var_6_79:int, and:int[expected:boolean](ldc:int(-5921), ldc:int(5920)), and:int[expected:boolean](ldc:int(25953), ldc:int(-26102)), and:int[expected:boolean](ldc:int(25634), ldc:int(-25635)), xor:int[expected:boolean](ldc:int(-32488), ldc:int(-32487)))
            invokestatic:void(\u3a62\u92ff\u12cb\u8753\u7bad::\u67d0\u93a2\ub83f\u6c52\u8308\uc3e3, getfield:int(\ucfaf\uc2e8\u3776\u1187\u120d\u9255::\u624e\uc2bd\u9af2\u960f\u8709\u6c56, var_3_66:\ucfaf\uc2e8\u3776\u1187\u120d\u9255))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static void \u8d90\u52d3\u4c2b\u7043\u8350\uc229(int[] p0, int p1, int p2, int p3, int p4, int p5) {
        var_8_68 : int
        var_9_6F : IntBuffer
        var_10_7C : int
        
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
            var_8_68 = mul:int(p1:int, p2:int)
            var_9_6F = invokestatic:IntBuffer(\u9255\u64ab\ub6ab\ubf56\u88c5\u647c::\u965f\uc2bd\ub1b9\u12b2\u3711\ua6bd, var_8_68:int)
            invokevirtual:Buffer(Buffer::clear, var_9_6F:IntBuffer[expected:Buffer])
            var_10_7C = mul:int(p5:int, var_8_68:int)
            
            if (cmpge:boolean(arraylength:int(p0:int[]), add:int(var_10_7C:int, var_8_68:int))) {
                invokevirtual:Buffer(Buffer::limit, invokevirtual:Buffer(Buffer::position, invokevirtual:IntBuffer(IntBuffer::put, var_9_6F:IntBuffer, p0:int[], var_10_7C:int, var_8_68:int), and:int(ldc:int(3141), ldc:int(-19526))), var_8_68:int)
                invokestatic:void(\uc910\uc2e8\u3e2a\u3bd6\u836c\uff55::\u5654\uc9f6\u51fa\uc87f\u8640\u0c95)
                invokestatic:void(GL11::glTexSubImage2D, and:int(ldc:int(3563), ldc:int(12257)), and:int(ldc:int(-31769), ldc:int(31752)), p3:int, p4:int, p1:int, p2:int, ldc:int(32993), ldc:int(33639), var_9_6F:IntBuffer)
                invokevirtual:Buffer(Buffer::clear, var_9_6F:IntBuffer[expected:Buffer])
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static \u3504\ufe34\u600f\u6b0d\u69d9.\u9937\u4cd9\u4ab3\u59ec\u64f2\uc29a \u156b\u9af2\u759a\u7af6\u9a18\ud4fe() {
        var_2_7E : \u5140\u4ab3\u183a\ud523\u071d\u983f
        
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
            var_2_7E = initobject:\u5140\u4ab3\u183a\ud523\u071d\u983f(\u5140\u4ab3\u183a\ud523\u071d\u983f::<init>, xor:int(ldc:int(8360), ldc:int(8361)), and:int(ldc:int(16961), ldc:int(11651)), xor:int[expected:boolean](ldc:int(1169), ldc:int(1168)))
            invokevirtual:void(\u5db4\ud523\u7043\u6c52\u8308\u8350::\u36d3\u59ec\u8640\u392e\u3dd3\ub32d, invokevirtual:\u5db4\ud523\u7043\u6c52\u8308\u8350(\u5140\u4ab3\u183a\ud523\u071d\u983f::\uc31c\u97b7\u7049\ub19c\u56bd\u3e2a, var_2_7E:\u5140\u4ab3\u183a\ud523\u071d\u983f), and:int(ldc:int(17692), ldc:int(-17694)), and:int(ldc:int(18599), ldc:int(-26800)), ldc:int(-1))
            invokevirtual:void(\u5140\u4ab3\u183a\ud523\u071d\u983f::\u76bc\ua3b4\ua3b4\uc9f6\u92ff\ud158, var_2_7E:\u5140\u4ab3\u183a\ud523\u071d\u983f)
            return:\u9937\u4cd9\u4ab3\u59ec\u64f2\uc29a(var_2_7E:\u5140\u4ab3\u183a\ud523\u071d\u983f[expected:\u9937\u4cd9\u4ab3\u59ec\u64f2\uc29a])
        }
        
        goto(Label_0006)
    }
    
    public static void \u64ab\u6198\u718f\u56bd\u6d99\uf995(int p0, int p1, int p2, \u12b2\u4e72\u8df4\u67e9\u67e9.\ud171\u156b\u0800\u36d3\ub8be\u760c p3) {
        var_6_69 : \ucfaf\uc2e8\u3776\u1187\u120d\u9255
        
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
            var_6_69 = invokestatic:\ucfaf\uc2e8\u3776\u1187\u120d\u9255(\u9255\u64ab\ub6ab\ubf56\u88c5\u647c::\ud523\u446c\u600f\ud12e\uf9c5\u7043, p3:\ud171\u156b\u0800\u36d3\ub8be\u760c[expected:\u9937\u4cd9\u4ab3\u59ec\u64f2\uc29a])
            
            if (getstatic:boolean(\uc238\u69d9\u92ff\ub83f\u5245\uc229::\u7bad\u4e72\uafe7\uf995\u6198\u47c2)) {
                invokestatic:void(\u67e9\u6d99\u873d\uff55\u6cfe\ubff1::\u7d52\u0800\u983f\u8d90\uceb8\ud171, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u9255\u64ab\ub6ab\ubf56\u88c5\u647c::\u760c\u8389\ud51e\u0800\u61a4\u759a), and:int(ldc:int(2066), ldc:int(8679)))), p1:int), loadelement:String(getstatic:String[](\u9255\u64ab\ub6ab\ubf56\u88c5\u647c::\u760c\u8389\ud51e\u0800\u61a4\u759a), and:int(ldc:int(12303), ldc:int(17411)))), p2:int), loadelement:String(getstatic:String[](\u9255\u64ab\ub6ab\ubf56\u88c5\u647c::\u760c\u8389\ud51e\u0800\u61a4\u759a), xor:int(ldc:int(-32247), ldc:int(-32243)))), p0:int)))
                invokestatic:void(\u9255\uc2e8\u6d69\u7e3f\uae87\uc31c::\u946b\u92ee\u8cae\u624e\u4d85\u6435, getfield:int(\ucfaf\uc2e8\u3776\u1187\u120d\u9255::\ucfaf\uf9c5\u0b8e\u416d\u62da\u7049, var_6_69:\ucfaf\uc2e8\u3776\u1187\u120d\u9255), p0:int, p1:int, p2:int)
            }
            
            if (getstatic:boolean(\uc238\u69d9\u92ff\ub83f\u5245\uc229::\u494c\u3711\u97e6\ubefe\u6cfe\u4c04)) {
                invokestatic:void(\u67e9\u6d99\u873d\uff55\u6cfe\ubff1::\u7d52\u0800\u983f\u8d90\uceb8\ud171, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u9255\u64ab\ub6ab\ubf56\u88c5\u647c::\u760c\u8389\ud51e\u0800\u61a4\u759a), and:int(ldc:int(2053), ldc:int(4103)))), p1:int), loadelement:String(getstatic:String[](\u9255\u64ab\ub6ab\ubf56\u88c5\u647c::\u760c\u8389\ud51e\u0800\u61a4\u759a), and:int(ldc:int(3), ldc:int(9667)))), p2:int), loadelement:String(getstatic:String[](\u9255\u64ab\ub6ab\ubf56\u88c5\u647c::\u760c\u8389\ud51e\u0800\u61a4\u759a), xor:int(ldc:int(4418), ldc:int(4422)))), p0:int)))
                invokestatic:void(\u9255\uc2e8\u6d69\u7e3f\uae87\uc31c::\u946b\u92ee\u8cae\u624e\u4d85\u6435, getfield:int(\ucfaf\uc2e8\u3776\u1187\u120d\u9255::\u156b\u8c8a\uc3e3\ub18d\u5bc4\ud523, var_6_69:\ucfaf\uc2e8\u3776\u1187\u120d\u9255), p0:int, p1:int, p2:int)
            }
            
            invokestatic:void(\u3a62\u92ff\u12cb\u8753\u7bad::\u67d0\u93a2\ub83f\u6c52\u8308\uc3e3, getfield:int(\ucfaf\uc2e8\u3776\u1187\u120d\u9255::\u624e\uc2bd\u9af2\u960f\u8709\u6c56, var_6_69:\ucfaf\uc2e8\u3776\u1187\u120d\u9255))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static \ub113\uc4d2\u183a\u527a\u6435.\uc3e3\u5f50\u5bc4\ud217\u97e6.\u5db4\ud523\u7043\u6c52\u8308\u8350[] \uceb8\ub83f\u6fb0\u4c2b\u6d69\u7c6b(\ub113\uc4d2\u183a\u527a\u6435.\uc3e3\u5f50\u5bc4\ud217\u97e6.\u5db4\ud523\u7043\u6c52\u8308\u8350 p0, int p1) {
        var_2_61 : int
        var_2_6B : int
        var_4_78 : \u5db4\ud523\u7043\u6c52\u8308\u8350[]
        var_5_AC : int
        var_6_CE : \u5db4\ud523\u7043\u6c52\u8308\u8350
        var_7_F8 : \u5db4\ud523\u7043\u6c52\u8308\u8350
        var_8_FF : int
        var_9_106 : int
        var_10_10F : int
        var_11_130 : int
        
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
            var_2_61 = and:int(ldc:int(-1883458876), ldc:int(-171977780))
            
            if (cmplt:boolean(p1:int, ldc:int(0))) {
                p1 = and:int(ldc:int(-23118), ldc:int(6733))
            }
            
            var_2_6B = and:int(var_2_61:int, ldc:int(-677408033))
            var_4_78 = newarray:\u5db4\ud523\u7043\u6c52\u8308\u8350[](\ub113\uc4d2\u183a\u527a\u6435.\uc3e3\u5f50\u5bc4\ud217\u97e6.\u5db4\ud523\u7043\u6c52\u8308\u8350.class, add:int(p1:int, xor:int(ldc:int(-31710), ldc:int(-31709))))
            storeelement:\u5db4\ud523\u7043\u6c52\u8308\u8350(var_4_78:\u5db4\ud523\u7043\u6c52\u8308\u8350[], and:int(ldc:int(29831), ldc:int(-31904)), p0:\u5db4\ud523\u7043\u6c52\u8308\u8350)
            
            if (cmpgt:boolean(p1:int, ldc:int(0))) {
                var_5_AC = xor:int(ldc:int(2049), ldc:int(2048))
                
                loop {
                    var_2_6B = and:int(var_2_6B:int, ldc:int(664648407))
                    
                    if (cmpgt:boolean(var_5_AC:int, p1:int)) {
                        looporswitchbreak()
                    }
                    
                    var_6_CE = loadelement:\u5db4\ud523\u7043\u6c52\u8308\u8350(var_4_78:\u5db4\ud523\u7043\u6c52\u8308\u8350[], sub:int(var_5_AC:int, xor:int(ldc:int(2050), ldc:int(2051))))
                    var_7_F8 = initobject:\u5db4\ud523\u7043\u6c52\u8308\u8350(\u5db4\ud523\u7043\u6c52\u8308\u8350::<init>, shr:int(invokevirtual:int(\u5db4\ud523\u7043\u6c52\u8308\u8350::\ubb2b\u3a62\u71ae\ub171\u92ff\u8389, var_6_CE:\u5db4\ud523\u7043\u6c52\u8308\u8350), xor:int(ldc:int(9221), ldc:int(9220))), shr:int(invokevirtual:int(\u5db4\ud523\u7043\u6c52\u8308\u8350::\u392e\u839e\u183a\u72f1\ucb79\u5245, var_6_CE:\u5db4\ud523\u7043\u6c52\u8308\u8350), xor:int(ldc:int(1200), ldc:int(1201))), and:int[expected:boolean](ldc:int(-10673), ldc:int(10640)))
                    var_8_FF = invokevirtual:int(\u5db4\ud523\u7043\u6c52\u8308\u8350::\ubb2b\u3a62\u71ae\ub171\u92ff\u8389, var_7_F8:\u5db4\ud523\u7043\u6c52\u8308\u8350)
                    var_9_106 = invokevirtual:int(\u5db4\ud523\u7043\u6c52\u8308\u8350::\u392e\u839e\u183a\u72f1\ucb79\u5245, var_7_F8:\u5db4\ud523\u7043\u6c52\u8308\u8350)
                    var_10_10F = and:int(ldc:int(-31999), ldc:int(25852))
                    
                    while (cmplt:boolean(var_10_10F:int, var_8_FF:int)) {
                        var_11_130 = and:int(ldc:int(-11986), ldc:int(11345))
                        
                        while (cmplt:boolean(var_11_130:int, var_9_106:int)) {
                            invokevirtual:void(\u5db4\ud523\u7043\u6c52\u8308\u8350::\u36d3\u59ec\u8640\u392e\u3dd3\ub32d, var_7_F8:\u5db4\ud523\u7043\u6c52\u8308\u8350, var_10_10F:int, var_11_130:int, invokestatic:int(\u9255\u64ab\ub6ab\ubf56\u88c5\u647c::\u9af2\ucef1\u6c52\uff55\u0a06\u760c, invokevirtual:int(\u5db4\ud523\u7043\u6c52\u8308\u8350::\u6d99\u5bc4\ubefe\uc2e8\u64ab\u6c52, var_6_CE:\u5db4\ud523\u7043\u6c52\u8308\u8350, add:int(mul:int(var_10_10F:int, and:int(ldc:int(2050), ldc:int(16387))), and:int(ldc:int(7348), ldc:int(-8117))), add:int(mul:int(var_11_130:int, and:int(ldc:int(8194), ldc:int(3154))), and:int(ldc:int(5810), ldc:int(-5812)))), invokevirtual:int(\u5db4\ud523\u7043\u6c52\u8308\u8350::\u6d99\u5bc4\ubefe\uc2e8\u64ab\u6c52, var_6_CE:\u5db4\ud523\u7043\u6c52\u8308\u8350, add:int(mul:int(var_10_10F:int, xor:int(ldc:int(17664), ldc:int(17666))), and:int(ldc:int(24581), ldc:int(2379))), add:int(mul:int(var_11_130:int, and:int(ldc:int(18), ldc:int(4943))), and:int(ldc:int(12904), ldc:int(-15977)))), invokevirtual:int(\u5db4\ud523\u7043\u6c52\u8308\u8350::\u6d99\u5bc4\ubefe\uc2e8\u64ab\u6c52, var_6_CE:\u5db4\ud523\u7043\u6c52\u8308\u8350, add:int(mul:int(var_10_10F:int, and:int(ldc:int(22726), ldc:int(514))), and:int(ldc:int(19533), ldc:int(-19534))), add:int(mul:int(var_11_130:int, and:int(ldc:int(1026), ldc:int(131))), xor:int(ldc:int(16896), ldc:int(16897)))), invokevirtual:int(\u5db4\ud523\u7043\u6c52\u8308\u8350::\u6d99\u5bc4\ubefe\uc2e8\u64ab\u6c52, var_6_CE:\u5db4\ud523\u7043\u6c52\u8308\u8350, add:int(mul:int(var_10_10F:int, and:int(ldc:int(2562), ldc:int(1314))), xor:int(ldc:int(20520), ldc:int(20521))), add:int(mul:int(var_11_130:int, xor:int(ldc:int(681), ldc:int(683))), xor:int(ldc:int(2369), ldc:int(2368))))))
                            inc:int(var_11_130, ldc:int(1))
                        }
                        
                        inc:int(var_10_10F, ldc:int(1))
                    }
                    
                    storeelement:\u5db4\ud523\u7043\u6c52\u8308\u8350(var_4_78:\u5db4\ud523\u7043\u6c52\u8308\u8350[], var_5_AC:int, var_7_F8:\u5db4\ud523\u7043\u6c52\u8308\u8350)
                    inc:int(var_5_AC, ldc:int(1))
                }
            }
            
            return:\u5db4\ud523\u7043\u6c52\u8308\u8350[](var_4_78:\u5db4\ud523\u7043\u6c52\u8308\u8350[])
        }
        
        goto(Label_0006)
    }
    
    public static java.awt.image.BufferedImage \u600f\ud523\u6b5f\u8258\ubefe\ub19c(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753 p0) {
        var_1_D6 : int
        var_3_E1 : InputStream
        var_4_143 : BufferedImage
        stack_176_0 : BufferedImage [generated]
        
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
        var_1_D6 = and:int(ldc:int(-1739908138), ldc:int(-1790391370))
        
        try {
            loop {
                if (cmpeq:boolean(and:int(var_1_D6:int, ldc:int(2147483647)), ldc:int(0))) {
                    goto(Label_0176)
                }
                
                if (cmpne:boolean(and:int(var_1_D6:int, ldc:int(2097152)), ldc:int(0))) {
                    var_1_D6 = and:int(var_1_D6:int, ldc:int(1874161508))
                }
                else {
                    var_1_D6 = and:int(var_1_D6:int, ldc:int(-236347805))
                    
                    if (invokestatic:boolean(\u8308\u51fa\u6c56\u5db4\ub18d\u34df::\u7049\u3c25\u965f\u6fb0\u8753\u7873, p0:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753)) {
                        var_3_E1 = invokestatic:InputStream(\u8308\u51fa\u6c56\u5db4\ub18d\u34df::\u527a\u12cb\u61a4\u8d98\ub113\u4179, p0:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753)
                        
                        loop {
                            if (cmpeq:boolean(and:int(var_1_D6:int, ldc:int(2147483647)), ldc:int(0))) {
                                goto(Label_0282)
                            }
                            
                            if (cmpeq:boolean(and:int(var_1_D6:int, ldc:int(16777216)), ldc:int(0))) {
                                var_1_D6 = and:int(var_1_D6:int, ldc:int(-103154989))
                                
                                if (cmpne:boolean(var_3_E1:InputStream, aconstnull:InputStream())) {
                                    var_4_143 = invokestatic:BufferedImage(ImageIO::read, var_3_E1:InputStream)
                                    
                                    do {
                                        if (cmpne:boolean(and:int(var_1_D6:int, ldc:int(1024)), ldc:int(0))) {
                                            var_1_D6 = and:int(var_1_D6:int, ldc:int(450897825))
                                        }
                                        else {
                                            var_1_D6 = and:int(var_1_D6:int, ldc:int(-1426465894))
                                            invokevirtual:void(InputStream::close, var_3_E1:InputStream)
                                        }
                                    } while (cmpeq:boolean(and:int(var_1_D6:int, ldc:int(524288)), ldc:int(0)))
                                    
                                    var_1_D6 = and:int(var_1_D6:int, ldc:int(-471286099))
                                    stack_176_0 = var_4_143:BufferedImage
                                    var_1_D6 = and:int(var_1_D6:int, ldc:int(-1627709648))
                                    return:BufferedImage(stack_176_0:BufferedImage)
                                }
                            }
                            
                            Label_0251:
                            
                            if (cmpeq:boolean(and:int(var_1_D6:int, ldc:int(2048)), ldc:int(0))) {
                                var_1_D6 = and:int(var_1_D6:int, ldc:int(569809718))
                            }
                            else {
                                if (cmpeq:boolean(and:int(var_1_D6:int, ldc:int(4194304)), ldc:int(0))) {
                                    loopcontinue()
                                }
                                
                                var_1_D6 = and:int(var_1_D6:int, ldc:int(-556830799))
                            }
                            
                            Label_0282:
                            
                            if (cmpeq:boolean(and:int(var_1_D6:int, ldc:int(524288)), ldc:int(0))) {
                                var_1_D6 = and:int(var_1_D6:int, ldc:int(963261091))
                                goto(Label_0251)
                            }
                            
                            if (cmpeq:boolean(and:int(var_1_D6:int, ldc:int(33554432)), ldc:int(0))) {
                                var_1_D6 = and:int(var_1_D6:int, ldc:int(-1336042671))
                                return:BufferedImage(aconstnull:BufferedImage())
                            }
                        }
                    }
                }
                
                Label_0136:
                
                if (cmpne:boolean(and:int(var_1_D6:int, ldc:int(33554432)), ldc:int(0))) {
                    var_1_D6 = and:int(var_1_D6:int, ldc:int(1559741276))
                }
                else {
                    if (cmpeq:boolean(and:int(var_1_D6:int, ldc:int(2048)), ldc:int(0))) {
                        var_1_D6 = and:int(var_1_D6:int, ldc:int(1294139651))
                        loopcontinue()
                    }
                    
                    var_1_D6 = and:int(var_1_D6:int, ldc:int(-2090091978))
                }
                
                Label_0176:
                
                if (cmpne:boolean(and:int(var_1_D6:int, ldc:int(2097152)), ldc:int(0))) {
                    var_1_D6 = and:int(var_1_D6:int, ldc:int(1377024746))
                    goto(Label_0136)
                }
                
                if (cmpeq:boolean(and:int(var_1_D6:int, ldc:int(16384)), ldc:int(0))) {
                    var_1_D6 = and:int(var_1_D6:int, ldc:int(-506627373))
                    return:BufferedImage(aconstnull:BufferedImage())
                }
                
                var_1_D6 = and:int(var_1_D6:int, ldc:int(-1398762864))
            }
        }
        catch (java.io.IOException var_3_17B) {
            return:BufferedImage(aconstnull:BufferedImage())
        }
    }
    
    public static int[][] \uc229\u71f1\u92ff\u7330\uf94d\u67d0(int p0, int p1, int[][] p2) {
        var_3_61 : int
        var_5_69 : int
        var_6_AD : int
        var_7_B9 : int
        var_8_C7 : int[]
        expr_CA : int [generated]
        expr_D1 : int[] [generated]
        var_9_D5 : int[]
        var_10_DE : int
        var_11_F5 : int
        var_12_120 : int
        
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
            var_3_61 = and:int(ldc:int(-1097556160), ldc:int(-644082))
            var_5_69 = xor:int(ldc:int(-24432), ldc:int(-24431))
            
            loop {
                if (cmpne:boolean(and:int(var_3_61:int, ldc:int(1024)), ldc:int(0))) {
                    var_3_61 = and:int(var_3_61:int, ldc:int(536658996))
                    
                    if (cmple:boolean(var_5_69:int, p0:int)) {
                        if (cmpeq:boolean(loadelement:int[](p2:int[][], var_5_69:int), aconstnull:int[]())) {
                            var_6_AD = shr:int(p1:int, var_5_69:int)
                            var_7_B9 = mul:int(var_6_AD:int, and:int(ldc:int(18434), ldc:int(12298)))
                            var_8_C7 = loadelement:int[](p2:int[][], sub:int(var_5_69:int, and:int(ldc:int(2241), ldc:int(9))))
                            expr_CA = var_5_69:int
                            expr_D1 = newarray:int[](int.class, mul:int(var_6_AD:int, var_6_AD:int))
                            storeelement:int[](p2:int[][], expr_CA:int, expr_D1:int[])
                            var_9_D5 = expr_D1:int[]
                            var_10_DE = and:int(ldc:int(797), ldc:int(-2910))
                            
                            while (cmplt:boolean(var_10_DE:int, var_6_AD:int)) {
                                var_11_F5 = and:int(ldc:int(-18390), ldc:int(16852))
                                
                                while (cmplt:boolean(var_11_F5:int, var_6_AD:int)) {
                                    var_12_120 = add:int(mul:int(mul:int(var_10_DE:int, and:int(ldc:int(8714), ldc:int(16514))), var_7_B9:int), mul:int(var_11_F5:int, xor:int(ldc:int(-26624), ldc:int(-26622))))
                                    storeelement:int(var_9_D5:int[], add:int(mul:int(var_10_DE:int, var_6_AD:int), var_11_F5:int), invokestatic:int(\u9255\u64ab\ub6ab\ubf56\u88c5\u647c::\u9af2\ucef1\u6c52\uff55\u0a06\u760c, loadelement:int(var_8_C7:int[], var_12_120:int), loadelement:int(var_8_C7:int[], add:int(var_12_120:int, and:int(ldc:int(5645), ldc:int(24753)))), loadelement:int(var_8_C7:int[], add:int(var_12_120:int, var_7_B9:int)), loadelement:int(var_8_C7:int[], add:int(add:int(var_12_120:int, var_7_B9:int), and:int(ldc:int(393), ldc:int(8229))))))
                                    inc:int(var_11_F5, ldc:int(1))
                                }
                                
                                inc:int(var_10_DE, ldc:int(1))
                            }
                        }
                        
                        var_3_61 = and:int(var_3_61:int, ldc:int(955528711))
                        inc:int(var_5_69, ldc:int(1))
                        loopcontinue()
                    }
                }
                
                if (cmpeq:boolean(and:int(var_3_61:int, ldc:int(16384)), ldc:int(0))) {
                    looporswitchbreak()
                }
            }
            
            return:int[][](p2:int[][])
        }
        
        goto(Label_0006)
    }
    
    public static void \ud171\u69d9\u62da\u4bc8\u98a4\u8aa5(int[][] p0, int p1, int p2, int p3, int p4, int p5) {
        var_6_63 : int
        var_9_72 : IntBuffer
        var_10_76 : int
        var_11_7F : int
        var_12_82 : int
        var_13_85 : int
        var_14_88 : int
        var_15_8C : int
        var_16_CD : int
        var_17_D3 : int[]
        
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
            var_6_63 = and:int(ldc:int(976981645), ldc:int(1995900813))
            invokestatic:void(\uc910\uc2e8\u3e2a\u3bd6\u836c\uff55::\u5654\uc9f6\u51fa\uc87f\u8640\u0c95)
            var_9_72 = invokestatic:IntBuffer(\u9255\u64ab\ub6ab\ubf56\u88c5\u647c::\u965f\uc2bd\ub1b9\u12b2\u3711\ua6bd, mul:int(p1:int, p2:int))
            var_10_76 = arraylength:int(p0:int[][])
            var_11_7F = and:int(ldc:int(10144), ldc:int(-10147))
            var_12_82 = p1:int
            var_13_85 = p2:int
            var_14_88 = p3:int
            var_15_8C = p4:int
            
            loop {
                var_6_63 = and:int(var_6_63:int, ldc:int(2058319295))
                
                if (cmple:boolean(var_12_82:int, ldc:int(0))) {
                    looporswitchbreak()
                }
                
                if (cmple:boolean(var_13_85:int, ldc:int(0))) {
                    looporswitchbreak()
                }
                
                if (cmpge:boolean(var_11_7F:int, var_10_76:int)) {
                    looporswitchbreak()
                }
                
                var_16_CD = mul:int(var_12_82:int, var_13_85:int)
                var_17_D3 = loadelement:int[](p0:int[][], var_11_7F:int)
                invokevirtual:Buffer(Buffer::clear, var_9_72:IntBuffer[expected:Buffer])
                
                if (cmpge:boolean(arraylength:int(var_17_D3:int[]), mul:int(var_16_CD:int, add:int(p5:int, xor:int(ldc:int(-32731), ldc:int(-32732)))))) {
                    invokevirtual:Buffer(Buffer::limit, invokevirtual:Buffer(Buffer::position, invokevirtual:IntBuffer(IntBuffer::put, var_9_72:IntBuffer, var_17_D3:int[], mul:int(var_16_CD:int, p5:int), var_16_CD:int), and:int(ldc:int(12104), ldc:int(-28507))), var_16_CD:int)
                    invokestatic:void(GL11::glTexSubImage2D, and:int(ldc:int(24547), ldc:int(3561)), var_11_7F:int, var_14_88:int, var_15_8C:int, var_12_82:int, var_13_85:int, ldc:int(32993), ldc:int(33639), var_9_72:IntBuffer)
                }
                
                var_12_82 = shr:int(var_12_82:int, xor:int(ldc:int(-32640), ldc:int(-32639)))
                var_13_85 = shr:int(var_13_85:int, xor:int(ldc:int(2132), ldc:int(2133)))
                var_14_88 = shr:int(var_14_88:int, and:int(ldc:int(8833), ldc:int(1057)))
                var_15_8C = shr:int(var_15_8C:int, xor:int(ldc:int(18441), ldc:int(18440)))
                inc:int(var_11_7F, ldc:int(1))
            }
            
            Label_0155:
            invokevirtual:Buffer(Buffer::clear, var_9_72:IntBuffer[expected:Buffer])
            return:void()
            goto(Label_0155)
        }
        
        goto(Label_0006)
    }
    
    public static int \uae5d\ubf56\u74b1\u927d\u76bc\u6bb9(int p0, int p1, int p2, int p3) {
        var_4_63 : int
        var_6_71 : int
        var_7_7F : int
        var_8_8D : int
        var_9_9B : int
        var_10_A8 : int
        var_11_BC : int
        var_12_D2 : int
        var_13_11D : int
        
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
            var_4_63 = and:int(ldc:int(-1107293583), ldc:int(-42907396))
            var_6_71 = and:int(ushr:int(p0:int, ldc:int(24)), xor:int(ldc:int(8261), ldc:int(8378)))
            var_7_7F = and:int(ushr:int(p1:int, ldc:int(24)), and:int(ldc:int(767), ldc:int(29951)))
            var_8_8D = and:int(ushr:int(p2:int, ldc:int(24)), xor:int(ldc:int(359), ldc:int(408)))
            var_9_9B = and:int(ushr:int(p3:int, ldc:int(24)), xor:int(ldc:int(598), ldc:int(681)))
            var_10_A8 = add:int(add:int(add:int(var_6_71:int, var_7_7F:int), var_8_8D:int), var_9_9B:int)
            var_11_BC = div:int(add:int(var_10_A8:int, xor:int(ldc:int(2192), ldc:int(2194))), and:int(ldc:int(268), ldc:int(16964)))
            
            if (cmpeq:boolean(var_10_A8:int, ldc:int(0))) {
                var_4_63 = and:int(var_4_63:int, ldc:int(-14357254))
                var_12_D2 = xor:int(ldc:int(4258), ldc:int(4262))
                var_6_71 = and:int(ldc:int(3091), ldc:int(129))
                var_7_7F = and:int(ldc:int(521), ldc:int(30993))
                var_8_8D = and:int(ldc:int(1361), ldc:int(161))
                var_9_9B = xor:int(ldc:int(-26592), ldc:int(-26591))
            }
            else {
                var_12_D2 = var_10_A8:int
            }
            
            var_13_11D = div:int(add:int(var_12_D2:int, and:int(ldc:int(8805), ldc:int(16411))), and:int(ldc:int(29730), ldc:int(138)))
            return:int(or:int(or:int(or:int(shl:int(var_11_BC:int, ldc:int(24)), shl:int(div:int(add:int(add:int(add:int(add:int(mul:int(and:int(ushr:int(p0:int, ldc:int(16)), xor:int(ldc:int(2803), ldc:int(2572))), var_6_71:int), mul:int(and:int(ushr:int(p1:int, ldc:int(16)), and:int(ldc:int(4863), ldc:int(8703))), var_7_7F:int)), mul:int(and:int(ushr:int(p2:int, ldc:int(16)), and:int(ldc:int(767), ldc:int(1279))), var_8_8D:int)), mul:int(and:int(ushr:int(p3:int, ldc:int(16)), and:int(ldc:int(255), ldc:int(4351))), var_9_9B:int)), var_13_11D:int), var_12_D2:int), ldc:int(16))), shl:int(div:int(add:int(add:int(add:int(add:int(mul:int(and:int(ushr:int(p0:int, ldc:int(8)), xor:int(ldc:int(4705), ldc:int(4766))), var_6_71:int), mul:int(and:int(ushr:int(p1:int, ldc:int(8)), xor:int(ldc:int(8257), ldc:int(8382))), var_7_7F:int)), mul:int(and:int(ushr:int(p2:int, ldc:int(8)), xor:int(ldc:int(8283), ldc:int(8356))), var_8_8D:int)), mul:int(and:int(ushr:int(p3:int, ldc:int(8)), xor:int(ldc:int(-22368), ldc:int(-22433))), var_9_9B:int)), var_13_11D:int), var_12_D2:int), ldc:int(8))), shl:int(div:int(add:int(add:int(add:int(add:int(mul:int(and:int(ushr:int(p0:int, and:int(ldc:int(-31487), ldc:int(10876))), xor:int(ldc:int(264), ldc:int(503))), var_6_71:int), mul:int(and:int(ushr:int(p1:int, and:int(ldc:int(-15365), ldc:int(15364))), and:int(ldc:int(14079), ldc:int(255))), var_7_7F:int)), mul:int(and:int(ushr:int(p2:int, and:int(ldc:int(-29353), ldc:int(29352))), and:int(ldc:int(767), ldc:int(511))), var_8_8D:int)), mul:int(and:int(ushr:int(p3:int, and:int(ldc:int(-27265), ldc:int(27264))), and:int(ldc:int(3327), ldc:int(255))), var_9_9B:int)), var_13_11D:int), var_12_D2:int), and:int(ldc:int(-25398), ldc:int(25381)))))
        }
        
        goto(Label_0006)
    }
    
    public static int \u9af2\ucef1\u6c52\uff55\u0a06\u760c(int p0, int p1, int p2, int p3) {
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
            return:int(or:int(or:int(or:int(shl:int(div:int(add:int(add:int(add:int(add:int(and:int(ushr:int(p0:int, ldc:int(24)), and:int(ldc:int(767), ldc:int(1279))), and:int(ushr:int(p1:int, ldc:int(24)), xor:int(ldc:int(8958), ldc:int(8705)))), and:int(ushr:int(p2:int, ldc:int(24)), and:int(ldc:int(16895), ldc:int(7935)))), and:int(ushr:int(p3:int, ldc:int(24)), and:int(ldc:int(1023), ldc:int(12543)))), and:int(ldc:int(9219), ldc:int(2574))), and:int(ldc:int(5748), ldc:int(16646))), ldc:int(24)), shl:int(div:int(add:int(add:int(add:int(add:int(and:int(ushr:int(p0:int, ldc:int(16)), and:int(ldc:int(17919), ldc:int(8447))), and:int(ushr:int(p1:int, ldc:int(16)), xor:int(ldc:int(8214), ldc:int(8425)))), and:int(ushr:int(p2:int, ldc:int(16)), and:int(ldc:int(1535), ldc:int(15103)))), and:int(ushr:int(p3:int, ldc:int(16)), and:int(ldc:int(511), ldc:int(255)))), and:int(ldc:int(6402), ldc:int(9303))), and:int(ldc:int(2324), ldc:int(16421))), ldc:int(16))), shl:int(div:int(add:int(add:int(add:int(add:int(and:int(ushr:int(p0:int, ldc:int(8)), and:int(ldc:int(1023), ldc:int(255))), and:int(ushr:int(p1:int, ldc:int(8)), xor:int(ldc:int(24957), ldc:int(24962)))), and:int(ushr:int(p2:int, ldc:int(8)), xor:int(ldc:int(-31813), ldc:int(-31932)))), and:int(ushr:int(p3:int, ldc:int(8)), xor:int(ldc:int(18434), ldc:int(18685)))), and:int(ldc:int(11399), ldc:int(346))), xor:int(ldc:int(-16125), ldc:int(-16121))), ldc:int(8))), shl:int(div:int(add:int(add:int(add:int(add:int(and:int(ushr:int(p0:int, and:int(ldc:int(20577), ldc:int(-20842))), xor:int(ldc:int(1342), ldc:int(1473))), and:int(ushr:int(p1:int, and:int(ldc:int(-19744), ldc:int(19739))), and:int(ldc:int(2303), ldc:int(17663)))), and:int(ushr:int(p2:int, and:int(ldc:int(-22653), ldc:int(22588))), and:int(ldc:int(767), ldc:int(1279)))), and:int(ushr:int(p3:int, and:int(ldc:int(-21440), ldc:int(16575))), xor:int(ldc:int(-7996), ldc:int(-8133)))), xor:int(ldc:int(-22523), ldc:int(-22521))), and:int(ldc:int(8260), ldc:int(4391))), and:int(ldc:int(9254), ldc:int(-9255)))))
        }
        
        goto(Label_0006)
    }
    
    public static void \u5fe1\u2dcc\u5bc4\u3a62\u8389\u51b2(int[] p0, int p1, int p2, int p3) {
        var_4_310 : int
        var_6_6C : int
        var_7_6F : int
        var_8_72 : int
        var_9_7B : int
        var_10_84 : int
        var_12_96 : int
        var_11_145 : int
        var_13_14E : int
        var_14_1A2 : int
        var_15_1B4 : int
        var_16_1BD : int
        var_13_289 : int
        var_14_292 : int
        var_15_2DD : int
        var_4_2EE : int
        
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
            var_4_310 = and:int(ldc:int(-1399110525), ldc:int(-1397549426))
            invokestatic:int(Math::min, p2:int, p3:int)
            var_6_6C = p1:int
            var_7_6F = p2:int
            var_8_72 = p3:int
            var_9_7B = and:int(ldc:int(-6856), ldc:int(6337))
            var_10_84 = and:int(ldc:int(-28356), ldc:int(20099))
            var_12_96 = and:int(ldc:int(-14607), ldc:int(2318))
            
            loop {
                Label_0152:
                
                if (cmpeq:boolean(and:int(var_4_310:int, ldc:int(67108864)), ldc:int(0))) {
                    goto(Label_0232)
                }
                
                if (cmpne:boolean(and:int(var_4_310:int, ldc:int(128)), ldc:int(0))) {
                    var_4_310 = and:int(var_4_310:int, ldc:int(748121235))
                    
                    if (cmpgt:boolean(var_7_6F:int, and:int(ldc:int(8971), ldc:int(3109)))) {
                        if (cmpgt:boolean(var_8_72:int, and:int(ldc:int(137), ldc:int(21761)))) {
                            var_9_7B = add:int(var_6_6C:int, mul:int(var_7_6F:int, var_8_72:int))
                            var_10_84 = div:int(var_7_6F:int, and:int(ldc:int(24075), ldc:int(2)))
                            var_11_145 = div:int(var_8_72:int, xor:int(ldc:int(8337), ldc:int(8339)))
                            var_13_14E = and:int(ldc:int(-28484), ldc:int(28225))
                            
                            loop {
                                if (cmpeq:boolean(and:int(var_4_310:int, ldc:int(1073741824)), ldc:int(0))) {
                                    var_4_310 = and:int(var_4_310:int, ldc:int(-1345870198))
                                    
                                    if (cmplt:boolean(var_13_14E:int, var_11_145:int)) {
                                        var_14_1A2 = add:int(var_9_7B:int, mul:int(var_13_14E:int, var_10_84:int))
                                        var_15_1B4 = add:int(var_6_6C:int, mul:int(mul:int(var_13_14E:int, xor:int(ldc:int(-31480), ldc:int(-31478))), var_7_6F:int))
                                        var_16_1BD = and:int(ldc:int(-28877), ldc:int(28876))
                                        
                                        loop {
                                            if (cmpne:boolean(and:int(var_4_310:int, ldc:int(64)), ldc:int(0))) {
                                                var_4_310 = and:int(var_4_310:int, ldc:int(-890688864))
                                            }
                                            else {
                                                var_4_310 = and:int(var_4_310:int, ldc:int(-51444230))
                                                
                                                if (cmplt:boolean(var_16_1BD:int, var_10_84:int)) {
                                                    storeelement:int(p0:int[], add:int(var_14_1A2:int, var_16_1BD:int), invokestatic:int(\u9255\u64ab\ub6ab\ubf56\u88c5\u647c::\uae5d\ubf56\u74b1\u927d\u76bc\u6bb9, loadelement:int(p0:int[], add:int(var_15_1B4:int, mul:int(var_16_1BD:int, xor:int(ldc:int(1), ldc:int(3))))), loadelement:int(p0:int[], add:int(add:int(var_15_1B4:int, mul:int(var_16_1BD:int, and:int(ldc:int(2842), ldc:int(28774)))), and:int(ldc:int(3149), ldc:int(305)))), loadelement:int(p0:int[], add:int(add:int(var_15_1B4:int, var_7_6F:int), mul:int(var_16_1BD:int, xor:int(ldc:int(133), ldc:int(135))))), loadelement:int(p0:int[], add:int(add:int(add:int(var_15_1B4:int, var_7_6F:int), mul:int(var_16_1BD:int, and:int(ldc:int(25094), ldc:int(6402)))), xor:int(ldc:int(-23040), ldc:int(-23039))))))
                                                    inc:int(var_16_1BD, ldc:int(1))
                                                    loopcontinue()
                                                }
                                            }
                                            
                                            if (cmpne:boolean(and:int(var_4_310:int, ldc:int(131072)), ldc:int(0))) {
                                                looporswitchbreak()
                                            }
                                            
                                            var_4_310 = and:int(var_4_310:int, ldc:int(570933869))
                                        }
                                        
                                        var_4_310 = and:int(var_4_310:int, ldc:int(1871146222))
                                        inc:int(var_13_14E, ldc:int(1))
                                        loopcontinue()
                                    }
                                }
                                
                                if (cmpeq:boolean(and:int(var_4_310:int, ldc:int(4096)), ldc:int(0))) {
                                    looporswitchbreak()
                                }
                                
                                var_4_310 = and:int(var_4_310:int, ldc:int(1137997115))
                            }
                            
                            var_4_310 = and:int(var_4_310:int, ldc:int(-799078))
                            inc:int(var_12_96, ldc:int(1))
                            var_7_6F = var_10_84:int
                            var_8_72 = var_11_145:int
                            var_6_6C = var_9_7B:int
                            loopcontinue()
                        }
                    }
                }
                
                Label_0190:
                
                while (cmpeq:boolean(and:int(var_4_310:int, ldc:int(4096)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_4_310:int, ldc:int(67108864)), ldc:int(0))) {
                        loopcontinue(Label_0152)
                    }
                    
                    var_4_310 = and:int(var_4_310:int, ldc:int(1036723623))
                    
                    if (cmple:boolean(var_12_96:int, ldc:int(0))) {
                        goto(Label_0232)
                    }
                    
                    inc:int(var_12_96, ldc:int(-1))
                    var_7_6F = shr:int(p2:int, var_12_96:int)
                    var_8_72 = shr:int(p3:int, var_12_96:int)
                    var_6_6C = var_13_289 = sub:int(var_9_7B:int, mul:int(var_7_6F:int, var_8_72:int))
                    var_14_292 = and:int(ldc:int(19731), ldc:int(-19732))
                    
                    loop {
                        if (cmpeq:boolean(and:int(var_4_310:int, ldc:int(8)), ldc:int(0))) {
                            var_4_310 = and:int(var_4_310:int, ldc:int(-3431014))
                            
                            if (cmplt:boolean(var_14_292:int, var_8_72:int)) {
                                var_15_2DD = and:int(ldc:int(-27689), ldc:int(25640))
                                
                                loop {
                                    if (cmpeq:boolean(and:int(var_4_310:int, ldc:int(65536)), ldc:int(0))) {
                                        var_4_2EE = and:int(var_4_310:int, ldc:int(-1019466002))
                                    }
                                    else {
                                        var_4_2EE = and:int(var_4_310:int, ldc:int(-1093425990))
                                        
                                        if (cmplt:boolean(var_15_2DD:int, var_7_6F:int)) {
                                            if (cmpeq:boolean(loadelement:int(p0:int[], var_13_289:int), ldc:int(0))) {
                                                storeelement:int(p0:int[], var_13_289:int, and:int(loadelement:int(p0:int[], add:int(add:int(var_9_7B:int, mul:int(div:int(var_14_292:int, xor:int(ldc:int(4098), ldc:int(4096))), var_10_84:int)), div:int(var_15_2DD:int, and:int(ldc:int(134), ldc:int(8762))))), ldc:int(16777215)))
                                            }
                                            
                                            var_4_310 = and:int(var_4_2EE:int, ldc:int(1035453690))
                                            inc:int(var_13_289, ldc:int(1))
                                            inc:int(var_15_2DD, ldc:int(1))
                                            loopcontinue()
                                        }
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_4_2EE:int, ldc:int(8388608)), ldc:int(0))) {
                                        looporswitchbreak()
                                    }
                                    
                                    var_4_310 = and:int(var_4_2EE:int, ldc:int(1170997092))
                                }
                                
                                var_4_310 = and:int(var_4_2EE:int, ldc:int(1858811887))
                                inc:int(var_14_292, ldc:int(1))
                                loopcontinue()
                            }
                        }
                        
                        if (cmpne:boolean(and:int(var_4_310:int, ldc:int(134217728)), ldc:int(0))) {
                            looporswitchbreak()
                        }
                        
                        var_4_310 = and:int(var_4_310:int, ldc:int(-356952529))
                    }
                    
                    var_4_310 = and:int(var_4_310:int, ldc:int(-1347440698))
                    var_9_7B = var_6_6C:int
                    var_10_84 = var_7_6F:int
                }
                
                var_4_310 = and:int(var_4_310:int, ldc:int(245938949))
                Label_0232:
                
                if (cmpeq:boolean(and:int(var_4_310:int, ldc:int(128)), ldc:int(0))) {
                    goto(Label_0190)
                }
                
                if (cmpne:boolean(and:int(var_4_310:int, ldc:int(65536)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_4_310 = and:int(var_4_310:int, ldc:int(394333422))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static void \u624e\u760c\u6c56\u8640\u4e72\u56bd(int[] p0, int p1, int p2, int p3) {
        var_4_2D5 : int
        var_6_6C : int
        var_7_6F : int
        var_8_72 : int
        var_9_7B : int
        var_10_84 : int
        var_12_96 : int
        var_11_142 : int
        var_13_14B : int
        var_14_194 : int
        var_15_1A6 : int
        var_16_1AF : int
        var_13_270 : int
        var_14_279 : int
        var_15_2C4 : int
        
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
            var_4_2D5 = and:int(ldc:int(916344758), ldc:int(863454166))
            invokestatic:int(Math::min, p2:int, p3:int)
            var_6_6C = p1:int
            var_7_6F = p2:int
            var_8_72 = p3:int
            var_9_7B = and:int(ldc:int(-22932), ldc:int(22803))
            var_10_84 = and:int(ldc:int(22680), ldc:int(-22939))
            var_12_96 = and:int(ldc:int(-12933), ldc:int(12932))
            
            loop {
                Label_0152:
                
                if (cmpne:boolean(and:int(var_4_2D5:int, ldc:int(8)), ldc:int(0))) {
                    goto(Label_0241)
                }
                
                if (cmpne:boolean(and:int(var_4_2D5:int, ldc:int(131072)), ldc:int(0))) {
                    var_4_2D5 = and:int(var_4_2D5:int, ldc:int(-1088983154))
                    
                    if (cmpgt:boolean(var_7_6F:int, xor:int(ldc:int(1569), ldc:int(1568)))) {
                        if (cmpgt:boolean(var_8_72:int, xor:int(ldc:int(658), ldc:int(659)))) {
                            var_9_7B = add:int(var_6_6C:int, mul:int(var_7_6F:int, var_8_72:int))
                            var_10_84 = div:int(var_7_6F:int, xor:int(ldc:int(2696), ldc:int(2698)))
                            var_11_142 = div:int(var_8_72:int, and:int(ldc:int(18018), ldc:int(18)))
                            var_13_14B = and:int(ldc:int(30722), ldc:int(-31251))
                            
                            loop {
                                if (cmpne:boolean(and:int(var_4_2D5:int, ldc:int(2147483647)), ldc:int(0))) {
                                    var_4_2D5 = and:int(var_4_2D5:int, ldc:int(1943458266))
                                    
                                    if (cmplt:boolean(var_13_14B:int, var_11_142:int)) {
                                        var_14_194 = add:int(var_9_7B:int, mul:int(var_13_14B:int, var_10_84:int))
                                        var_15_1A6 = add:int(var_6_6C:int, mul:int(mul:int(var_13_14B:int, and:int(ldc:int(23194), ldc:int(8483))), var_7_6F:int))
                                        var_16_1AF = and:int(ldc:int(7327), ldc:int(-7328))
                                        
                                        loop {
                                            if (cmpne:boolean(and:int(var_4_2D5:int, ldc:int(128)), ldc:int(0))) {
                                                var_4_2D5 = and:int(var_4_2D5:int, ldc:int(-1174963729))
                                                
                                                if (cmplt:boolean(var_16_1AF:int, var_10_84:int)) {
                                                    storeelement:int(p0:int[], add:int(var_14_194:int, var_16_1AF:int), invokestatic:int(\u9255\u64ab\ub6ab\ubf56\u88c5\u647c::\u9af2\ucef1\u6c52\uff55\u0a06\u760c, loadelement:int(p0:int[], add:int(var_15_1A6:int, mul:int(var_16_1AF:int, and:int(ldc:int(1410), ldc:int(10243))))), loadelement:int(p0:int[], add:int(add:int(var_15_1A6:int, mul:int(var_16_1AF:int, and:int(ldc:int(6275), ldc:int(25402)))), xor:int(ldc:int(-12284), ldc:int(-12283)))), loadelement:int(p0:int[], add:int(add:int(var_15_1A6:int, var_7_6F:int), mul:int(var_16_1AF:int, xor:int(ldc:int(2120), ldc:int(2122))))), loadelement:int(p0:int[], add:int(add:int(add:int(var_15_1A6:int, var_7_6F:int), mul:int(var_16_1AF:int, and:int(ldc:int(4162), ldc:int(27811)))), xor:int(ldc:int(144), ldc:int(145))))))
                                                    inc:int(var_16_1AF, ldc:int(1))
                                                    loopcontinue()
                                                }
                                            }
                                            
                                            if (cmpne:boolean(and:int(var_4_2D5:int, ldc:int(131072)), ldc:int(0))) {
                                                looporswitchbreak()
                                            }
                                            
                                            var_4_2D5 = and:int(var_4_2D5:int, ldc:int(1723906453))
                                        }
                                        
                                        var_4_2D5 = and:int(var_4_2D5:int, ldc:int(-1092685425))
                                        inc:int(var_13_14B, ldc:int(1))
                                        loopcontinue()
                                    }
                                }
                                
                                if (cmpeq:boolean(and:int(var_4_2D5:int, ldc:int(4194304)), ldc:int(0))) {
                                    looporswitchbreak()
                                }
                            }
                            
                            var_4_2D5 = and:int(var_4_2D5:int, ldc:int(2120139722))
                            inc:int(var_12_96, ldc:int(1))
                            var_7_6F = var_10_84:int
                            var_8_72 = var_11_142:int
                            var_6_6C = var_9_7B:int
                            loopcontinue()
                        }
                    }
                }
                
                Label_0189:
                
                while (cmpne:boolean(and:int(var_4_2D5:int, ldc:int(1048576)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_4_2D5:int, ldc:int(2)), ldc:int(0))) {
                        var_4_2D5 = and:int(var_4_2D5:int, ldc:int(-1031525930))
                        loopcontinue(Label_0152)
                    }
                    
                    var_4_2D5 = and:int(var_4_2D5:int, ldc:int(-138490410))
                    
                    if (cmple:boolean(var_12_96:int, ldc:int(0))) {
                        goto(Label_0241)
                    }
                    
                    inc:int(var_12_96, ldc:int(-1))
                    var_7_6F = shr:int(p2:int, var_12_96:int)
                    var_8_72 = shr:int(p3:int, var_12_96:int)
                    var_6_6C = var_13_270 = sub:int(var_9_7B:int, mul:int(var_7_6F:int, var_8_72:int))
                    var_14_279 = and:int(ldc:int(-19790), ldc:int(17733))
                    
                    loop {
                        if (cmpeq:boolean(and:int(var_4_2D5:int, ldc:int(1048576)), ldc:int(0))) {
                            var_4_2D5 = and:int(var_4_2D5:int, ldc:int(-1294656329))
                        }
                        else {
                            var_4_2D5 = and:int(var_4_2D5:int, ldc:int(-165741057))
                            
                            if (cmplt:boolean(var_14_279:int, var_8_72:int)) {
                                var_15_2C4 = and:int(ldc:int(-27077), ldc:int(26820))
                                
                                loop {
                                    if (cmpeq:boolean(and:int(var_4_2D5:int, ldc:int(268435456)), ldc:int(0))) {
                                        var_4_2D5 = and:int(var_4_2D5:int, ldc:int(-1107535677))
                                    }
                                    else {
                                        var_4_2D5 = and:int(var_4_2D5:int, ldc:int(894943646))
                                        
                                        if (cmplt:boolean(var_15_2C4:int, var_7_6F:int)) {
                                            if (cmpeq:boolean(loadelement:int(p0:int[], var_13_270:int), ldc:int(0))) {
                                                storeelement:int(p0:int[], var_13_270:int, and:int(loadelement:int(p0:int[], add:int(add:int(var_9_7B:int, mul:int(div:int(var_14_279:int, xor:int(ldc:int(1049), ldc:int(1051))), var_10_84:int)), div:int(var_15_2C4:int, xor:int(ldc:int(161), ldc:int(163))))), ldc:int(16777215)))
                                            }
                                            
                                            var_4_2D5 = and:int(var_4_2D5:int, ldc:int(-1109926970))
                                            inc:int(var_13_270, ldc:int(1))
                                            inc:int(var_15_2C4, ldc:int(1))
                                            loopcontinue()
                                        }
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_4_2D5:int, ldc:int(16777216)), ldc:int(0))) {
                                        looporswitchbreak()
                                    }
                                }
                                
                                var_4_2D5 = and:int(var_4_2D5:int, ldc:int(2046224322))
                                inc:int(var_14_279, ldc:int(1))
                                loopcontinue()
                            }
                        }
                        
                        if (cmpeq:boolean(and:int(var_4_2D5:int, ldc:int(4096)), ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    var_4_2D5 = and:int(var_4_2D5:int, ldc:int(-1241586222))
                    var_9_7B = var_6_6C:int
                    var_10_84 = var_7_6F:int
                }
                
                var_4_2D5 = and:int(var_4_2D5:int, ldc:int(2022899894))
                Label_0241:
                
                if (cmpeq:boolean(and:int(var_4_2D5:int, ldc:int(268435456)), ldc:int(0))) {
                    goto(Label_0189)
                }
                
                if (cmpne:boolean(and:int(var_4_2D5:int, ldc:int(16384)), ldc:int(0))) {
                    looporswitchbreak()
                }
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static boolean \ube23\ubded\u93a2\u9a18\ubcb0\u4d85(int[] p0, int p1, int p2) {
        var_3_61 : int
        var_5_65 : int
        var_3_82 : int
        var_6_8A : int
        var_7_D8 : int
        
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
        var_3_61 = and:int(ldc:int(2128444292), ldc:int(-956964450))
        var_5_65 = mul:int(p1:int, p2:int)
        
        if (logicaland:boolean(cmpeq:boolean(ushr:int(loadelement:int(p0:int[], and:int(ldc:int(-28319), ldc:int(27792))), ldc:int(24)), and:int(ldc:int(6399), ldc:int(1535))), cmpeq:boolean(loadelement:int(p0:int[], sub:int(var_5_65:int, xor:int(ldc:int(-30680), ldc:int(-30679)))), ldc:int(0)))) {
            return:boolean(and:int[expected:boolean](ldc:int(8225), ldc:int(2699)))
        }
        
        var_3_82 = and:int(var_3_61:int, ldc:int(-809752787))
        var_6_8A = and:int(ldc:int(-18858), ldc:int(18601))
        
        while (cmplt:boolean(var_6_8A:int, var_5_65:int)) {
            var_7_D8 = ushr:int(loadelement:int(p0:int[], var_6_8A:int), ldc:int(24))
            
            if (logicaland:boolean(cmpne:boolean(var_7_D8:int, ldc:int(0)), cmpne:boolean(var_7_D8:int, and:int(ldc:int(18175), ldc:int(14591))))) {
                return:boolean(xor:int[expected:boolean](ldc:int(7176), ldc:int(7177)))
            }
            
            var_3_82 = and:int(var_3_82:int, ldc:int(2078144239))
            inc:int(var_6_8A, ldc:int(1))
        }
        
        return:boolean(and:int[expected:boolean](ldc:int(2261), ldc:int(-3800)))
    }
    
    public static void \u6b0d\uf94d\u7ce1\u3bd6\u8709\ub102(int[] p0, int p1, int p2, int p3, int p4) {
        var_5_63 : int
        var_7_6C : int
        var_8_6F : int
        var_9_72 : int
        var_10_75 : int
        var_11_79 : int
        
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
            var_5_63 = and:int(ldc:int(-814404303), ldc:int(-742707267))
            var_7_6C = and:int(ldc:int(-29960), ldc:int(25863))
            var_8_6F = p1:int
            var_9_72 = p2:int
            var_10_75 = p3:int
            var_11_79 = p4:int
            
            loop {
                var_5_63 = and:int(var_5_63:int, ldc:int(-359281737))
                
                if (logicalor:boolean(cmple:boolean(var_8_6F:int, ldc:int(0)), cmple:boolean(var_9_72:int, ldc:int(0)))) {
                    looporswitchbreak()
                }
                
                invokestatic:void(GL11::glCopyTexSubImage2D, xor:int(ldc:int(17211), ldc:int(20186)), var_7_6C:int, var_10_75:int, var_11_79:int, and:int(ldc:int(3653), ldc:int(-20038)), and:int(ldc:int(5080), ldc:int(-5115)), var_8_6F:int, var_9_72:int)
                inc:int(var_7_6C, ldc:int(1))
                var_8_6F = div:int(var_8_6F:int, xor:int(ldc:int(2073), ldc:int(2075)))
                var_9_72 = div:int(var_9_72:int, xor:int(ldc:int(-30720), ldc:int(-30718)))
                var_10_75 = div:int(var_10_75:int, xor:int(ldc:int(4111), ldc:int(4109)))
                var_11_79 = div:int(var_11_79:int, and:int(ldc:int(4294), ldc:int(18219)))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static void \u7c6b\u7330\ube23\u0a06\u960f\ud217(\u12b2\u7049\u8df4\uc9f6\uae87.\ucfaf\uc2e8\u3776\u1187\u120d\u9255 p0, int[] p1, int p2, int p3, int p4, int p5, boolean p6, boolean p7) {
        var_10_68 : int
        var_11_6F : IntBuffer
        
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
            var_10_68 = mul:int(p2:int, p3:int)
            var_11_6F = invokestatic:IntBuffer(\u9255\u64ab\ub6ab\ubf56\u88c5\u647c::\u965f\uc2bd\ub1b9\u12b2\u3711\ua6bd, var_10_68:int)
            invokestatic:void(\uc910\uc2e8\u3e2a\u3bd6\u836c\uff55::\u5654\uc9f6\u51fa\uc87f\u8640\u0c95)
            invokevirtual:Buffer(Buffer::clear, var_11_6F:IntBuffer[expected:Buffer])
            invokevirtual:IntBuffer(IntBuffer::put, var_11_6F:IntBuffer, p1:int[], and:int(ldc:int(-16122), ldc:int(7849)), var_10_68:int)
            invokevirtual:Buffer(Buffer::limit, invokevirtual:Buffer(Buffer::position, var_11_6F:IntBuffer[expected:Buffer], and:int(ldc:int(-645), ldc:int(644))), var_10_68:int)
            invokestatic:void(\u3a62\u92ff\u12cb\u8753\u7bad::\u67d0\u93a2\ub83f\u6c52\u8308\uc3e3, getfield:int(\ucfaf\uc2e8\u3776\u1187\u120d\u9255::\u624e\uc2bd\u9af2\u960f\u8709\u6c56, p0:\ucfaf\uc2e8\u3776\u1187\u120d\u9255))
            invokestatic:void(GL11::glTexParameteri, xor:int(ldc:int(-31492), ldc:int(-30435)), and:int(ldc:int(10281), ldc:int(14357)), xor:int(ldc:int(1710), ldc:int(8366)))
            invokestatic:void(GL11::glTexParameteri, and:int(ldc:int(3557), ldc:int(3555)), and:int(ldc:int(26896), ldc:int(14560)), and:int(ldc:int(26248), ldc:int(9762)))
            invokestatic:void(GL11::glTexParameteri, xor:int(ldc:int(14494), ldc:int(13695)), xor:int(ldc:int(218), ldc:int(10456)), xor:int(ldc:int(5760), ldc:int(16257)))
            invokestatic:void(GL11::glTexParameteri, xor:int(ldc:int(852), ldc:int(3765)), xor:int(ldc:int(273), ldc:int(10514)), and:int(ldc:int(11183), ldc:int(26897)))
            invokestatic:void(GL11::glTexSubImage2D, and:int(ldc:int(11745), ldc:int(20453)), and:int(ldc:int(2523), ldc:int(-4060)), p4:int, p5:int, p2:int, p3:int, ldc:int(32993), ldc:int(33639), var_11_6F:IntBuffer)
            
            if (cmpeq:boolean(arraylength:int(p1:int[]), mul:int(var_10_68:int, and:int(ldc:int(4131), ldc:int(11651))))) {
                invokevirtual:Buffer(Buffer::clear, var_11_6F:IntBuffer[expected:Buffer])
                invokevirtual:Buffer(Buffer::position, invokevirtual:IntBuffer(IntBuffer::put, var_11_6F:IntBuffer, p1:int[], var_10_68:int, var_10_68:int), and:int(ldc:int(-23197), ldc:int(19100)))
                invokevirtual:Buffer(Buffer::limit, invokevirtual:Buffer(Buffer::position, var_11_6F:IntBuffer[expected:Buffer], and:int(ldc:int(-22155), ldc:int(5762))), var_10_68:int)
            }
            
            invokestatic:void(\u3a62\u92ff\u12cb\u8753\u7bad::\u67d0\u93a2\ub83f\u6c52\u8308\uc3e3, getfield:int(\ucfaf\uc2e8\u3776\u1187\u120d\u9255::\ucfaf\uf9c5\u0b8e\u416d\u62da\u7049, p0:\ucfaf\uc2e8\u3776\u1187\u120d\u9255))
            invokestatic:void(GL11::glTexParameteri, xor:int(ldc:int(-32170), ldc:int(-28745)), and:int(ldc:int(14373), ldc:int(11267)), xor:int(ldc:int(27623), ldc:int(19943)))
            invokestatic:void(GL11::glTexParameteri, and:int(ldc:int(7649), ldc:int(3555)), and:int(ldc:int(12064), ldc:int(26831)), and:int(ldc:int(28196), ldc:int(9866)))
            invokestatic:void(GL11::glTexParameteri, and:int(ldc:int(3553), ldc:int(4065)), and:int(ldc:int(27010), ldc:int(14338)), xor:int(ldc:int(11305), ldc:int(1320)))
            invokestatic:void(GL11::glTexParameteri, xor:int(ldc:int(20209), ldc:int(17168)), and:int(ldc:int(26779), ldc:int(14343)), and:int(ldc:int(27473), ldc:int(11553)))
            invokestatic:void(GL11::glTexSubImage2D, xor:int(ldc:int(-10797), ldc:int(-10190)), and:int(ldc:int(-11535), ldc:int(3340)), p4:int, p5:int, p2:int, p3:int, ldc:int(32993), ldc:int(33639), var_11_6F:IntBuffer)
            
            if (cmpeq:boolean(arraylength:int(p1:int[]), mul:int(var_10_68:int, and:int(ldc:int(13459), ldc:int(267))))) {
                invokevirtual:Buffer(Buffer::clear, var_11_6F:IntBuffer[expected:Buffer])
                invokevirtual:IntBuffer(IntBuffer::put, var_11_6F:IntBuffer, p1:int[], mul:int(var_10_68:int, and:int(ldc:int(291), ldc:int(8262))), var_10_68:int)
                invokevirtual:Buffer(Buffer::limit, invokevirtual:Buffer(Buffer::position, var_11_6F:IntBuffer[expected:Buffer], and:int(ldc:int(-10351), ldc:int(2158))), var_10_68:int)
            }
            
            invokestatic:void(\u3a62\u92ff\u12cb\u8753\u7bad::\u67d0\u93a2\ub83f\u6c52\u8308\uc3e3, getfield:int(\ucfaf\uc2e8\u3776\u1187\u120d\u9255::\u156b\u8c8a\uc3e3\ub18d\u5bc4\ud523, p0:\ucfaf\uc2e8\u3776\u1187\u120d\u9255))
            invokestatic:void(GL11::glTexParameteri, and:int(ldc:int(3569), ldc:int(7655)), and:int(ldc:int(30769), ldc:int(10377)), xor:int(ldc:int(4410), ldc:int(14138)))
            invokestatic:void(GL11::glTexParameteri, and:int(ldc:int(32225), ldc:int(4089)), xor:int(ldc:int(6975), ldc:int(13119)), xor:int(ldc:int(-25348), ldc:int(-17668)))
            invokestatic:void(GL11::glTexParameteri, and:int(ldc:int(11753), ldc:int(4067)), xor:int(ldc:int(6424), ldc:int(12570)), xor:int(ldc:int(15280), ldc:int(4785)))
            invokestatic:void(GL11::glTexParameteri, and:int(ldc:int(24035), ldc:int(3553)), xor:int(ldc:int(14429), ldc:int(4190)), xor:int(ldc:int(-24338), ldc:int(-30225)))
            invokestatic:void(GL11::glTexSubImage2D, and:int(ldc:int(32249), ldc:int(3557)), and:int(ldc:int(3544), ldc:int(-3545)), p4:int, p5:int, p2:int, p3:int, ldc:int(32993), ldc:int(33639), var_11_6F:IntBuffer)
            invokestatic:void(\u3a62\u92ff\u12cb\u8753\u7bad::\u6ec6\ufe34\u7006\uc4d2\u8cae\u47c2, ldc:int(33984))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static \u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753 \u6bb9\u3dd3\ube23\ud523\ufcaf\u97e6(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753 p0, java.lang.String p1) {
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
        
        if (cmpne:boolean(p0:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, aconstnull:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753())) {
            return:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(initobject:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::<init>, invokevirtual:String(\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::\u92ff\ubf56\ub8be\u647c\u624e\u0c95, p0:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753), invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(invokevirtual:String[](String::split, invokevirtual:String(\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::\u3776\ubded\u88c5\u647c\u40a9\u494c, p0:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753), loadelement:String(getstatic:String[](\u9255\u64ab\ub6ab\ubf56\u88c5\u647c::\u760c\u8389\ud51e\u0800\u61a4\u759a), xor:int(ldc:int(148), ldc:int(146)))), and:int(ldc:int(-9666), ldc:int(9665)))), loadelement:String(getstatic:String[](\u9255\u64ab\ub6ab\ubf56\u88c5\u647c::\u760c\u8389\ud51e\u0800\u61a4\u759a), and:int(ldc:int(9303), ldc:int(20495)))), p1:String), loadelement:String(getstatic:String[](\u9255\u64ab\ub6ab\ubf56\u88c5\u647c::\u760c\u8389\ud51e\u0800\u61a4\u759a), and:int(ldc:int(566), ldc:int(135)))))))
        }
        
        return:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(aconstnull:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753())
    }
    
    private static \ub113\uc4d2\u183a\u527a\u6435.\uc3e3\u5f50\u5bc4\ud217\u97e6.\u5db4\ud523\u7043\u6c52\u8308\u8350 \uc2e8\u47c2\ubf56\ub102\u5654\u34df(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u6c52\u52d3\u516c\uae87\uae5d p0, \u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753 p1, int p2, int p3, int p4) {
        var_7_6C : \u5db4\ud523\u7043\u6c52\u8308\u8350
        
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
            var_7_6C = invokestatic:\u5db4\ud523\u7043\u6c52\u8308\u8350(\u9255\u64ab\ub6ab\ubf56\u88c5\u647c::\uf9c5\u6c56\ub1b9\u1833\ub70c\ua068, p0:\u6c52\u52d3\u516c\uae87\uae5d, p1:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, p2:int, p3:int)
            
            if (cmpeq:boolean(var_7_6C:\u5db4\ud523\u7043\u6c52\u8308\u8350, aconstnull:\u5db4\ud523\u7043\u6c52\u8308\u8350())) {
                var_7_6C = initobject:\u5db4\ud523\u7043\u6c52\u8308\u8350(\u5db4\ud523\u7043\u6c52\u8308\u8350::<init>, p2:int, p3:int, and:int[expected:boolean](ldc:int(-9846), ldc:int(9845)))
                invokevirtual:void(\u5db4\ud523\u7043\u6c52\u8308\u8350::\u8d90\u3e75\u3e2a\u4f4a\u624e\ub70c, var_7_6C:\u5db4\ud523\u7043\u6c52\u8308\u8350, and:int(ldc:int(-26494), ldc:int(18285)), and:int(ldc:int(7431), ldc:int(-23824)), p2:int, p3:int, invokestatic:int(\uc910\uc2e8\u3e2a\u3bd6\u836c\uff55::\ubb2b\ud12e\u4cd9\u88c5\ua6bd\u8413, p4:int))
            }
            
            return:\u5db4\ud523\u7043\u6c52\u8308\u8350(var_7_6C:\u5db4\ud523\u7043\u6c52\u8308\u8350)
        }
        
        goto(Label_0006)
    }
    
    private static \ub113\uc4d2\u183a\u527a\u6435.\uc3e3\u5f50\u5bc4\ud217\u97e6.\u5db4\ud523\u7043\u6c52\u8308\u8350 \u8c8a\u72f1\u385b\uf9c5\u8308\ua3b4(int p0, int p1, int p2) {
        var_5_72 : \u5db4\ud523\u7043\u6c52\u8308\u8350
        
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
            var_5_72 = initobject:\u5db4\ud523\u7043\u6c52\u8308\u8350(\u5db4\ud523\u7043\u6c52\u8308\u8350::<init>, p0:int, p1:int, and:int[expected:boolean](ldc:int(656), ldc:int(-657)))
            invokevirtual:void(\u5db4\ud523\u7043\u6c52\u8308\u8350::\uc3e3\u600f\uceb8\uc7fe\u5f50\u3dd3, var_5_72:\u5db4\ud523\u7043\u6c52\u8308\u8350, invokestatic:int(\uc910\uc2e8\u3e2a\u3bd6\u836c\uff55::\ubb2b\ud12e\u4cd9\u88c5\ua6bd\u8413, p2:int))
            return:\u5db4\ud523\u7043\u6c52\u8308\u8350(var_5_72:\u5db4\ud523\u7043\u6c52\u8308\u8350)
        }
        
        goto(Label_0006)
    }
    
    private static \ub113\uc4d2\u183a\u527a\u6435.\uc3e3\u5f50\u5bc4\ud217\u97e6.\u5db4\ud523\u7043\u6c52\u8308\u8350 \uf9c5\u6c56\ub1b9\u1833\ub70c\ua068(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u6c52\u52d3\u516c\uae87\uae5d p0, \u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753 p1, int p2, int p3) {
        var_4_1FF : int
        var_6_D9 : \ufe34\u960f\ua6bd\u71f1\u516c
        var_7_ED : \u5db4\ud523\u7043\u6c52\u8308\u8350
        stack_33E_0 : \u5db4\ud523\u7043\u6c52\u8308\u8350 [generated]
        
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
        var_4_1FF = and:int(ldc:int(342547733), ldc:int(-1671449837))
        
        loop {
            if (cmpeq:boolean(and:int(var_4_1FF:int, ldc:int(2147483647)), ldc:int(0))) {
                goto(Label_0167)
            }
            
            if (cmpne:boolean(and:int(var_4_1FF:int, ldc:int(256)), ldc:int(0))) {
                var_4_1FF = and:int(var_4_1FF:int, ldc:int(-1258670177))
                
                if (cmpne:boolean(p1:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, aconstnull:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753())) {
                    try {
                        var_6_D9 = invokeinterface:\ufe34\u960f\ua6bd\u71f1\u516c(\u6c52\u52d3\u516c\uae87\uae5d::\u5d20\uc2e8\ubff1\u120d\u965f\u36d3, p0:\u6c52\u52d3\u516c\uae87\uae5d, p1:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753)
                        var_4_1FF = and:int(var_4_1FF:int, ldc:int(1481618427))
                        var_7_ED = invokestatic:\u5db4\ud523\u7043\u6c52\u8308\u8350(\u5db4\ud523\u7043\u6c52\u8308\u8350::\u3c25\u647c\u7006\u4e72\u9937\u385b, invokeinterface:InputStream(\ufe34\u960f\ua6bd\u71f1\u516c::\u494c\u9af2\u3a62\u67d0\uff55\uc9f6, var_6_D9:\ufe34\u960f\ua6bd\u71f1\u516c))
                        
                        loop {
                            if (cmpeq:boolean(and:int(var_4_1FF:int, ldc:int(268435456)), ldc:int(0))) {
                                goto(Label_0840)
                            }
                            
                            if (cmpeq:boolean(and:int(var_4_1FF:int, ldc:int(268435456)), ldc:int(0))) {
                                var_4_1FF = and:int(var_4_1FF:int, ldc:int(-745981647))
                                goto(Label_0736)
                            }
                            
                            if (cmpne:boolean(and:int(var_4_1FF:int, ldc:int(8192)), ldc:int(0))) {
                                goto(Label_0631)
                            }
                            
                            if (cmpne:boolean(and:int(var_4_1FF:int, ldc:int(512)), ldc:int(0))) {
                                goto(Label_0528)
                            }
                            
                            if (cmpne:boolean(and:int(var_4_1FF:int, ldc:int(8388608)), ldc:int(0))) {
                                var_4_1FF = and:int(var_4_1FF:int, ldc:int(-2045095791))
                                goto(Label_0430)
                            }
                            
                            if (cmpeq:boolean(and:int(var_4_1FF:int, ldc:int(8388608)), ldc:int(0))) {
                                var_4_1FF = and:int(var_4_1FF:int, ldc:int(-151053027))
                                
                                if (cmpne:boolean(var_7_ED:\u5db4\ud523\u7043\u6c52\u8308\u8350, aconstnull:\u5db4\ud523\u7043\u6c52\u8308\u8350())) {
                                    if (cmpeq:boolean(invokevirtual:int(\u5db4\ud523\u7043\u6c52\u8308\u8350::\ubb2b\u3a62\u71ae\ub171\u92ff\u8389, var_7_ED:\u5db4\ud523\u7043\u6c52\u8308\u8350), p2:int)) {
                                        goto(Label_0528)
                                    }
                                    
                                    goto(Label_0835)
                                }
                            }
                            
                            Label_0326:
                            
                            if (cmpeq:boolean(and:int(var_4_1FF:int, ldc:int(4194304)), ldc:int(0))) {
                                var_4_1FF = and:int(var_4_1FF:int, ldc:int(1859770424))
                                goto(Label_0840)
                            }
                            
                            if (cmpne:boolean(and:int(var_4_1FF:int, ldc:int(32)), ldc:int(0))) {
                                var_4_1FF = and:int(var_4_1FF:int, ldc:int(-909805642))
                                goto(Label_0736)
                            }
                            
                            if (cmpeq:boolean(and:int(var_4_1FF:int, ldc:int(524288)), ldc:int(0))) {
                                goto(Label_0631)
                            }
                            
                            if (cmpne:boolean(and:int(var_4_1FF:int, ldc:int(32)), ldc:int(0))) {
                                goto(Label_0528)
                            }
                            
                            if (cmpeq:boolean(and:int(var_4_1FF:int, ldc:int(256)), ldc:int(0))) {
                                var_4_1FF = and:int(var_4_1FF:int, ldc:int(-1956266365))
                            }
                            else {
                                if (cmpne:boolean(and:int(var_4_1FF:int, ldc:int(536870912)), ldc:int(0))) {
                                    var_4_1FF = and:int(var_4_1FF:int, ldc:int(-533119420))
                                    loopcontinue()
                                }
                                
                                var_4_1FF = and:int(var_4_1FF:int, ldc:int(1380612979))
                            }
                            
                            Label_0430:
                            
                            if (cmpeq:boolean(and:int(var_4_1FF:int, ldc:int(256)), ldc:int(0))) {
                                goto(Label_0840)
                            }
                            
                            if (cmpeq:boolean(and:int(var_4_1FF:int, ldc:int(16)), ldc:int(0))) {
                                goto(Label_0736)
                            }
                            
                            if (cmpeq:boolean(and:int(var_4_1FF:int, ldc:int(256)), ldc:int(0))) {
                                goto(Label_0631)
                            }
                            
                            if (cmpne:boolean(and:int(var_4_1FF:int, ldc:int(8192)), ldc:int(0))) {
                                var_4_1FF = and:int(var_4_1FF:int, ldc:int(599436250))
                            }
                            else {
                                if (cmpne:boolean(and:int(var_4_1FF:int, ldc:int(536870912)), ldc:int(0))) {
                                    goto(Label_0326)
                                }
                                
                                if (cmpeq:boolean(and:int(var_4_1FF:int, ldc:int(1)), ldc:int(0))) {
                                    var_4_1FF = and:int(var_4_1FF:int, ldc:int(232827667))
                                    loopcontinue()
                                }
                                
                                var_4_1FF = and:int(var_4_1FF:int, ldc:int(-582314657))
                                return:\u5db4\ud523\u7043\u6c52\u8308\u8350(aconstnull:\u5db4\ud523\u7043\u6c52\u8308\u8350())
                            }
                            
                            Label_0528:
                            
                            if (cmpeq:boolean(and:int(var_4_1FF:int, ldc:int(268435456)), ldc:int(0))) {
                                goto(Label_0840)
                            }
                            
                            if (cmpeq:boolean(and:int(var_4_1FF:int, ldc:int(131072)), ldc:int(0))) {
                                var_4_1FF = and:int(var_4_1FF:int, ldc:int(416475805))
                                goto(Label_0736)
                            }
                            
                            if (cmpeq:boolean(and:int(var_4_1FF:int, ldc:int(2147483647)), ldc:int(0))) {
                                var_4_1FF = and:int(var_4_1FF:int, ldc:int(-853127792))
                            }
                            else {
                                if (cmpne:boolean(and:int(var_4_1FF:int, ldc:int(2)), ldc:int(0))) {
                                    var_4_1FF = and:int(var_4_1FF:int, ldc:int(51778155))
                                    goto(Label_0430)
                                }
                                
                                if (cmpne:boolean(and:int(var_4_1FF:int, ldc:int(512)), ldc:int(0))) {
                                    goto(Label_0326)
                                }
                                
                                if (cmpeq:boolean(and:int(var_4_1FF:int, ldc:int(16)), ldc:int(0))) {
                                    loopcontinue()
                                }
                                
                                var_4_1FF = and:int(var_4_1FF:int, ldc:int(919330611))
                                
                                if (cmpne:boolean(invokevirtual:int(\u5db4\ud523\u7043\u6c52\u8308\u8350::\u392e\u839e\u183a\u72f1\ucb79\u5245, var_7_ED:\u5db4\ud523\u7043\u6c52\u8308\u8350), p3:int)) {
                                    goto(Label_0835)
                                }
                            }
                            
                            Label_0631:
                            
                            if (cmpne:boolean(and:int(var_4_1FF:int, ldc:int(512)), ldc:int(0))) {
                                var_4_1FF = and:int(var_4_1FF:int, ldc:int(-1289546502))
                                goto(Label_0840)
                            }
                            
                            if (cmpne:boolean(and:int(var_4_1FF:int, ldc:int(8192)), ldc:int(0))) {
                                var_4_1FF = and:int(var_4_1FF:int, ldc:int(-1427873244))
                            }
                            else {
                                if (cmpne:boolean(and:int(var_4_1FF:int, ldc:int(536870912)), ldc:int(0))) {
                                    goto(Label_0528)
                                }
                                
                                if (cmpeq:boolean(and:int(var_4_1FF:int, ldc:int(16)), ldc:int(0))) {
                                    goto(Label_0430)
                                }
                                
                                if (cmpeq:boolean(and:int(var_4_1FF:int, ldc:int(524288)), ldc:int(0))) {
                                    var_4_1FF = and:int(var_4_1FF:int, ldc:int(1491846368))
                                    goto(Label_0326)
                                }
                                
                                if (cmpne:boolean(and:int(var_4_1FF:int, ldc:int(512)), ldc:int(0))) {
                                    var_4_1FF = and:int(var_4_1FF:int, ldc:int(904232591))
                                    loopcontinue()
                                }
                                
                                var_4_1FF = and:int(var_4_1FF:int, ldc:int(1483620145))
                            }
                            
                            Label_0736:
                            
                            if (cmpne:boolean(and:int(var_4_1FF:int, ldc:int(65536)), ldc:int(0))) {
                                goto(Label_0840)
                            }
                            
                            if (cmpne:boolean(and:int(var_4_1FF:int, ldc:int(134217728)), ldc:int(0))) {
                                goto(Label_0631)
                            }
                            
                            if (cmpne:boolean(and:int(var_4_1FF:int, ldc:int(128)), ldc:int(0))) {
                                var_4_1FF = and:int(var_4_1FF:int, ldc:int(-428596100))
                                goto(Label_0528)
                            }
                            
                            if (cmpne:boolean(and:int(var_4_1FF:int, ldc:int(65536)), ldc:int(0))) {
                                goto(Label_0430)
                            }
                            
                            if (cmpeq:boolean(and:int(var_4_1FF:int, ldc:int(1)), ldc:int(0))) {
                                var_4_1FF = and:int(var_4_1FF:int, ldc:int(-845177073))
                                goto(Label_0326)
                            }
                            
                            if (cmpeq:boolean(and:int(var_4_1FF:int, ldc:int(65536)), ldc:int(0))) {
                                var_4_1FF = and:int(var_4_1FF:int, ldc:int(919238065))
                                stack_33E_0 = var_7_ED:\u5db4\ud523\u7043\u6c52\u8308\u8350
                                var_4_1FF = and:int(var_4_1FF:int, ldc:int(-119882753))
                                return:\u5db4\ud523\u7043\u6c52\u8308\u8350(stack_33E_0:\u5db4\ud523\u7043\u6c52\u8308\u8350)
                            }
                            
                            loopcontinue()
                            Label_0835:
                            invokevirtual:void(\u5db4\ud523\u7043\u6c52\u8308\u8350::close, var_7_ED:\u5db4\ud523\u7043\u6c52\u8308\u8350)
                            Label_0840:
                            
                            if (cmpne:boolean(and:int(var_4_1FF:int, ldc:int(65536)), ldc:int(0))) {
                                goto(Label_0736)
                            }
                            
                            if (cmpne:boolean(and:int(var_4_1FF:int, ldc:int(512)), ldc:int(0))) {
                                goto(Label_0631)
                            }
                            
                            if (cmpne:boolean(and:int(var_4_1FF:int, ldc:int(512)), ldc:int(0))) {
                                var_4_1FF = and:int(var_4_1FF:int, ldc:int(-1105576472))
                                goto(Label_0528)
                            }
                            
                            if (cmpeq:boolean(and:int(var_4_1FF:int, ldc:int(268435456)), ldc:int(0))) {
                                var_4_1FF = and:int(var_4_1FF:int, ldc:int(-452829250))
                                goto(Label_0430)
                            }
                            
                            if (cmpeq:boolean(and:int(var_4_1FF:int, ldc:int(524288)), ldc:int(0))) {
                                goto(Label_0326)
                            }
                            
                            if (cmpeq:boolean(and:int(var_4_1FF:int, ldc:int(8192)), ldc:int(0))) {
                                var_4_1FF = and:int(var_4_1FF:int, ldc:int(317453593))
                                return:\u5db4\ud523\u7043\u6c52\u8308\u8350(aconstnull:\u5db4\ud523\u7043\u6c52\u8308\u8350())
                            }
                        }
                    }
                    catch (java.io.IOException var_6_3A2) {
                        return:\u5db4\ud523\u7043\u6c52\u8308\u8350(aconstnull:\u5db4\ud523\u7043\u6c52\u8308\u8350())
                    }
                }
            }
            
            Label_0131:
            
            if (cmpeq:boolean(and:int(var_4_1FF:int, ldc:int(536870912)), ldc:int(0))) {
                if (cmpne:boolean(and:int(var_4_1FF:int, ldc:int(1048576)), ldc:int(0))) {
                    var_4_1FF = and:int(var_4_1FF:int, ldc:int(1112519472))
                    loopcontinue()
                }
                
                var_4_1FF = and:int(var_4_1FF:int, ldc:int(-755081327))
            }
            
            Label_0167:
            
            if (cmpeq:boolean(and:int(var_4_1FF:int, ldc:int(2147483647)), ldc:int(0))) {
                goto(Label_0131)
            }
            
            if (cmpeq:boolean(and:int(var_4_1FF:int, ldc:int(536870912)), ldc:int(0))) {
                return:\u5db4\ud523\u7043\u6c52\u8308\u8350(aconstnull:\u5db4\ud523\u7043\u6c52\u8308\u8350())
            }
            
            var_4_1FF = and:int(var_4_1FF:int, ldc:int(-551001973))
        }
    }
    
    public static void \u36d3\u12cb\u98a4\u927d\uf9c5\ud158(int p0, \ub113\uc4d2\u183a\u527a\u6435.\uc3e3\u5f50\u5bc4\ud217\u97e6.\u5db4\ud523\u7043\u6c52\u8308\u8350 p1, boolean p2, boolean p3, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u6c52\u52d3\u516c\uae87\uae5d p4, \u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753 p5, \u12b2\u7049\u8df4\uc9f6\uae87.\ucfaf\uc2e8\u3776\u1187\u120d\u9255 p6) {
        var_9_69 : int
        var_10_6F : int
        var_12_90 : \u5db4\ud523\u7043\u6c52\u8308\u8350
        var_14_105 : \u5db4\ud523\u7043\u6c52\u8308\u8350
        
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
            var_9_69 = invokevirtual:int(\u5db4\ud523\u7043\u6c52\u8308\u8350::\ubb2b\u3a62\u71ae\ub171\u92ff\u8389, p1:\u5db4\ud523\u7043\u6c52\u8308\u8350)
            var_10_6F = invokevirtual:int(\u5db4\ud523\u7043\u6c52\u8308\u8350::\u392e\u839e\u183a\u72f1\ucb79\u5245, p1:\u5db4\ud523\u7043\u6c52\u8308\u8350)
            var_12_90 = invokestatic:\u5db4\ud523\u7043\u6c52\u8308\u8350(\u9255\u64ab\ub6ab\ubf56\u88c5\u647c::\uc2e8\u47c2\ubf56\ub102\u5654\u34df, p4:\u6c52\u52d3\u516c\uae87\uae5d, invokestatic:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u9255\u64ab\ub6ab\ubf56\u88c5\u647c::\u6bb9\u3dd3\ube23\ud523\ufcaf\u97e6, p5:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, loadelement:String(getstatic:String[](\u9255\u64ab\ub6ab\ubf56\u88c5\u647c::\u760c\u8389\ud51e\u0800\u61a4\u759a), xor:int(ldc:int(-24501), ldc:int(-24509)))), var_9_69:int, var_10_6F:int, ldc:int(-8421377))
            invokestatic:void(\u9255\uc2e8\u6d69\u7e3f\uae87\uc31c::\u946b\u92ee\u8cae\u624e\u4d85\u6435, getfield:int(\ucfaf\uc2e8\u3776\u1187\u120d\u9255::\ucfaf\uf9c5\u0b8e\u416d\u62da\u7049, p6:\ucfaf\uc2e8\u3776\u1187\u120d\u9255), and:int(ldc:int(-3122), ldc:int(3121)), var_9_69:int, var_10_6F:int)
            invokevirtual:void(\u5db4\ud523\u7043\u6c52\u8308\u8350::\u7e3f\u4cd9\u071d\u8640\u4179\u0800, var_12_90:\u5db4\ud523\u7043\u6c52\u8308\u8350, and:int(ldc:int(-10278), ldc:int(10277)), and:int(ldc:int(16602), ldc:int(-16603)), and:int(ldc:int(-7666), ldc:int(7537)), and:int(ldc:int(5030), ldc:int(-21440)), and:int(ldc:int(-10987), ldc:int(10474)), var_9_69:int, var_10_6F:int, p2:boolean, p3:boolean, and:int[expected:boolean](ldc:int(-21464), ldc:int(4245)), xor:int[expected:boolean](ldc:int(3120), ldc:int(3121)))
            var_14_105 = invokestatic:\u5db4\ud523\u7043\u6c52\u8308\u8350(\u9255\u64ab\ub6ab\ubf56\u88c5\u647c::\uc2e8\u47c2\ubf56\ub102\u5654\u34df, p4:\u6c52\u52d3\u516c\uae87\uae5d, invokestatic:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u9255\u64ab\ub6ab\ubf56\u88c5\u647c::\u6bb9\u3dd3\ube23\ud523\ufcaf\u97e6, p5:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, loadelement:String(getstatic:String[](\u9255\u64ab\ub6ab\ubf56\u88c5\u647c::\u760c\u8389\ud51e\u0800\u61a4\u759a), xor:int(ldc:int(2086), ldc:int(2095)))), var_9_69:int, var_10_6F:int, and:int(ldc:int(6982), ldc:int(-8008)))
            invokestatic:void(\u9255\uc2e8\u6d69\u7e3f\uae87\uc31c::\u946b\u92ee\u8cae\u624e\u4d85\u6435, getfield:int(\ucfaf\uc2e8\u3776\u1187\u120d\u9255::\u156b\u8c8a\uc3e3\ub18d\u5bc4\ud523, p6:\ucfaf\uc2e8\u3776\u1187\u120d\u9255), and:int(ldc:int(371), ldc:int(-16884)), var_9_69:int, var_10_6F:int)
            invokevirtual:void(\u5db4\ud523\u7043\u6c52\u8308\u8350::\u7e3f\u4cd9\u071d\u8640\u4179\u0800, var_14_105:\u5db4\ud523\u7043\u6c52\u8308\u8350, and:int(ldc:int(-26802), ldc:int(26769)), and:int(ldc:int(20776), ldc:int(-20777)), and:int(ldc:int(-25581), ldc:int(17260)), and:int(ldc:int(-19730), ldc:int(19729)), and:int(ldc:int(18839), ldc:int(-18840)), var_9_69:int, var_10_6F:int, p2:boolean, p3:boolean, and:int[expected:boolean](ldc:int(-2056), ldc:int(2055)), xor:int[expected:boolean](ldc:int(10273), ldc:int(10272)))
            invokestatic:void(\u3a62\u92ff\u12cb\u8753\u7bad::\u67d0\u93a2\ub83f\u6c52\u8308\uc3e3, getfield:int(\ucfaf\uc2e8\u3776\u1187\u120d\u9255::\u624e\uc2bd\u9af2\u960f\u8709\u6c56, p6:\ucfaf\uc2e8\u3776\u1187\u120d\u9255))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static void \u76bc\u3bc9\ubefe\u527a\u0b8e\u3a62(int[] p0, int p1, int p2, int p3) {
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
    
    public static int \u3e75\u6435\ud523\u7c6b\ud36e\u7ce1(int p0, int p1, int p2) {
        var_5_6B : int
        
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
            var_5_6B = sub:int(and:int(ldc:int(255), ldc:int(255)), p2:int)
            return:int(or:int(or:int(or:int(shl:int(div:int(add:int(mul:int(and:int(ushr:int(p0:int, ldc:int(24)), and:int(ldc:int(24831), ldc:int(255))), p2:int), mul:int(and:int(ushr:int(p1:int, ldc:int(24)), xor:int(ldc:int(2675), ldc:int(2700))), var_5_6B:int)), and:int(ldc:int(7167), ldc:int(255))), ldc:int(24)), shl:int(div:int(add:int(mul:int(and:int(ushr:int(p0:int, ldc:int(16)), xor:int(ldc:int(4288), ldc:int(4159))), p2:int), mul:int(and:int(ushr:int(p1:int, ldc:int(16)), and:int(ldc:int(511), ldc:int(24831))), var_5_6B:int)), xor:int(ldc:int(11626), ldc:int(11669))), ldc:int(16))), shl:int(div:int(add:int(mul:int(and:int(ushr:int(p0:int, ldc:int(8)), xor:int(ldc:int(-32723), ldc:int(-32558))), p2:int), mul:int(and:int(ushr:int(p1:int, ldc:int(8)), xor:int(ldc:int(2206), ldc:int(2145))), var_5_6B:int)), xor:int(ldc:int(18460), ldc:int(18659))), ldc:int(8))), shl:int(div:int(add:int(mul:int(and:int(ushr:int(p0:int, and:int(ldc:int(-4864), ldc:int(175))), and:int(ldc:int(4351), ldc:int(10495))), p2:int), mul:int(and:int(ushr:int(p1:int, and:int(ldc:int(-22493), ldc:int(17292))), and:int(ldc:int(16639), ldc:int(4095))), var_5_6B:int)), xor:int(ldc:int(345), ldc:int(422))), and:int(ldc:int(-12884), ldc:int(12881)))))
        }
        
        goto(Label_0006)
    }
    
    public static void \u6bb9\u51fa\u8308\u40a9\ud158\u600f() {
        var_3_70 : \u9937\u4cd9\u4ab3\u59ec\u64f2\uc29a
        var_4_84 : \ucfaf\uc2e8\u3776\u1187\u120d\u9255
        
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
            var_3_70 = invokevirtual:\u9937\u4cd9\u4ab3\u59ec\u64f2\uc29a(\u4f52\ub7dc\u7bad\ud217\u76bc\u6d99::\u624e\uc3e3\u6bb9\u4c2b\u7d52\u5db4, invokevirtual:\u4f52\ub7dc\u7bad\ud217\u76bc\u6d99(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uf94d\u6d69\u4492\u6c56\u98a4\u3d64, invokestatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u6d69\u71ae\ucfaf\u516c\ube23\u8350)), getstatic:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\ud171\u156b\u0800\u36d3\ub8be\u760c::\u7043\u3e2a\u5d20\u52d3\u4e72\ub32d))
            
            if (cmpne:boolean(var_3_70:\u9937\u4cd9\u4ab3\u59ec\u64f2\uc29a, aconstnull:\u9937\u4cd9\u4ab3\u59ec\u64f2\uc29a())) {
                var_4_84 = invokevirtual:\ucfaf\uc2e8\u3776\u1187\u120d\u9255(\u9937\u4cd9\u4ab3\u59ec\u64f2\uc29a::\ub102\u494c\u0a06\uc229\ua562\uf94d, var_3_70:\u9937\u4cd9\u4ab3\u59ec\u64f2\uc29a)
                invokestatic:void(\u3a62\u92ff\u12cb\u8753\u7bad::\u67d0\u93a2\ub83f\u6c52\u8308\uc3e3, getfield:int(\ucfaf\uc2e8\u3776\u1187\u120d\u9255::\u624e\uc2bd\u9af2\u960f\u8709\u6c56, var_4_84:\ucfaf\uc2e8\u3776\u1187\u120d\u9255))
                invokestatic:void(GL11::glTexParameteri, xor:int(ldc:int(-15587), ldc:int(-12548)), xor:int(ldc:int(26434), ldc:int(20291)), loadelement:int(getstatic:int[](\uc238\u69d9\u92ff\ub83f\u5245\uc229::\uf9c5\u156b\uc910\ua61f\uc246\u4492), getstatic:int(\uc238\u69d9\u92ff\ub83f\u5245\uc229::\u600f\ubf56\u97e6\u836c\u3504\ua562)))
                invokestatic:void(GL11::glTexParameteri, and:int(ldc:int(4065), ldc:int(19953)), and:int(ldc:int(10240), ldc:int(26634)), loadelement:int(getstatic:int[](\uc238\u69d9\u92ff\ub83f\u5245\uc229::\uc4d2\ud217\u5fe1\u946b\u718f\u3d4b), getstatic:int(\uc238\u69d9\u92ff\ub83f\u5245\uc229::\u7049\u7006\ubff1\u6d69\u67d0\u7d52)))
                invokestatic:void(\u3a62\u92ff\u12cb\u8753\u7bad::\u67d0\u93a2\ub83f\u6c52\u8308\uc3e3, getfield:int(\ucfaf\uc2e8\u3776\u1187\u120d\u9255::\ucfaf\uf9c5\u0b8e\u416d\u62da\u7049, var_4_84:\ucfaf\uc2e8\u3776\u1187\u120d\u9255))
                invokestatic:void(GL11::glTexParameteri, and:int(ldc:int(12257), ldc:int(7663)), and:int(ldc:int(32147), ldc:int(10793)), loadelement:int(getstatic:int[](\uc238\u69d9\u92ff\ub83f\u5245\uc229::\uf9c5\u156b\uc910\ua61f\uc246\u4492), getstatic:int(\uc238\u69d9\u92ff\ub83f\u5245\uc229::\u56bd\ub113\u88c5\u97e6\u120d\u4d85)))
                invokestatic:void(GL11::glTexParameteri, and:int(ldc:int(19951), ldc:int(3553)), xor:int(ldc:int(-30200), ldc:int(-24056)), loadelement:int(getstatic:int[](\uc238\u69d9\u92ff\ub83f\u5245\uc229::\uc4d2\ud217\u5fe1\u946b\u718f\u3d4b), getstatic:int(\uc238\u69d9\u92ff\ub83f\u5245\uc229::\u6ec6\u36d3\ubded\u52d3\u72f1\u8aa5)))
                invokestatic:void(\u3a62\u92ff\u12cb\u8753\u7bad::\u67d0\u93a2\ub83f\u6c52\u8308\uc3e3, getfield:int(\ucfaf\uc2e8\u3776\u1187\u120d\u9255::\u156b\u8c8a\uc3e3\ub18d\u5bc4\ud523, var_4_84:\ucfaf\uc2e8\u3776\u1187\u120d\u9255))
                invokestatic:void(GL11::glTexParameteri, and:int(ldc:int(28135), ldc:int(7673)), xor:int(ldc:int(16906), ldc:int(27147)), loadelement:int(getstatic:int[](\uc238\u69d9\u92ff\ub83f\u5245\uc229::\uf9c5\u156b\uc910\ua61f\uc246\u4492), getstatic:int(\uc238\u69d9\u92ff\ub83f\u5245\uc229::\u071d\u7049\u92ff\ub6ab\ud523\u67d0)))
                invokestatic:void(GL11::glTexParameteri, xor:int(ldc:int(17823), ldc:int(18558)), and:int(ldc:int(10528), ldc:int(26712)), loadelement:int(getstatic:int[](\uc238\u69d9\u92ff\ub83f\u5245\uc229::\uc4d2\ud217\u5fe1\u946b\u718f\u3d4b), getstatic:int(\uc238\u69d9\u92ff\ub83f\u5245\uc229::\ua068\u6c52\uafe7\u99f7\ua562\u8bb0)))
                invokestatic:void(\u3a62\u92ff\u12cb\u8753\u7bad::\u67d0\u93a2\ub83f\u6c52\u8308\uc3e3, and:int(ldc:int(6930), ldc:int(-7964)))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static int[][] \u71f1\u0c95\uc7fe\uae5d\u4d85\uae87(int[][] p0, int p1, int p2, int p3) {
        var_4_63 : int
        var_6_67 : int
        var_7_6E : int[][]
        var_8_77 : int
        var_9_9B : int[]
        var_10_B5 : int
        var_11_C3 : int[]
        var_12_D7 : int
        var_13_DD : int
        var_14_E6 : int
        var_13_FA : int
        var_14_101 : int
        
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
            var_4_63 = and:int(ldc:int(-1391714663), ldc:int(-1351059529))
            var_6_67 = arraylength:int(p0:int[][])
            var_7_6E = newarray:int[][](int[].class, var_6_67:int)
            var_8_77 = and:int(ldc:int(-21142), ldc:int(21137))
            
            loop {
                var_4_63 = and:int(var_4_63:int, ldc:int(-1222887981))
                
                if (cmpge:boolean(var_8_77:int, var_6_67:int)) {
                    looporswitchbreak()
                }
                
                var_9_9B = loadelement:int[](p0:int[][], var_8_77:int)
                
                if (cmpne:boolean(var_9_9B:int[], aconstnull:int[]())) {
                    var_10_B5 = mul:int(shr:int(p1:int, var_8_77:int), shr:int(p2:int, var_8_77:int))
                    var_11_C3 = newarray:int[](int.class, mul:int(var_10_B5:int, xor:int(ldc:int(-14303), ldc:int(-14302))))
                    storeelement:int[](var_7_6E:int[][], var_8_77:int, var_11_C3:int[])
                    var_12_D7 = div:int(arraylength:int(var_9_9B:int[]), xor:int(ldc:int(14466), ldc:int(14465)))
                    var_13_DD = mul:int(var_10_B5:int, p3:int)
                    var_14_E6 = and:int(ldc:int(-28368), ldc:int(18573))
                    invokestatic:void(System::arraycopy, var_9_9B:int[][expected:Object], var_13_DD:int, var_11_C3:int[][expected:Object], var_14_E6:int, var_10_B5:int)
                    var_13_FA = add:int(var_13_DD:int, var_12_D7:int)
                    var_14_101 = add:int(var_14_E6:int, var_10_B5:int)
                    invokestatic:void(System::arraycopy, var_9_9B:int[][expected:Object], var_13_FA:int, var_11_C3:int[][expected:Object], var_14_101:int, var_10_B5:int)
                    invokestatic:void(System::arraycopy, var_9_9B:int[][expected:Object], add:int(var_13_FA:int, var_12_D7:int), var_11_C3:int[][expected:Object], add:int(var_14_101:int, var_10_B5:int), var_10_B5:int)
                }
                
                inc:int(var_8_77, ldc:int(1))
            }
            
            return:int[][](var_7_6E:int[][])
        }
        
        goto(Label_0006)
    }
    
    public static int[][] \u946b\ud158\u72f1\u6435\u6b5f\ubb2b(\u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u97b7\u8350\u99f7\ub1b9\u839e\u873d p0, int[][] p1, int p2, int p3) {
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
            return:int[][](p1:int[][])
        }
        
        goto(Label_0006)
    }
    
    public static void \ud36e\uc7fe\ua562\u8709\u516c\u4f4a(\u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u97b7\u8350\u99f7\ub1b9\u839e\u873d p0, int[] p1) {
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
    
    static {
        var_0_2F7 : int
        expr_68 : byte[] [generated]
        var_2_6C : byte[]
        stack_8D_0 : byte[] [generated]
        stack_8F_0 : byte[] [generated]
        stack_B5_0 : byte[] [generated]
        stack_B7_0 : byte[] [generated]
        stack_D2_0 : byte[] [generated]
        stack_29F_0 : byte[] [generated]
        stack_30A_0 : byte[] [generated]
        expr_70 : int [generated]
        var_3_230 : byte[]
        var_4_231 : int
        expr_8F : int [generated]
        var_5_281 : int
        var_3_286 : byte[]
        var_4_287 : int
        expr_2A5 : byte [generated]
        var_0_300 : int
        expr_30A : byte [generated]
        stack_33A_2 : byte [generated]
        expr_B7 : int [generated]
        var_3_DE : String
        stack_204_0 : String[] [generated]
        expr_F0 : String[] [generated]
        
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
            var_0_2F7 = and:int(ldc:int(-2066707330), ldc:int(-1681272390))
            expr_68 = var_2_6C = stack_8D_0 = stack_8F_0 = stack_B5_0 = stack_B7_0 = stack_D2_0 = stack_29F_0 = stack_30A_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("FrRbZjDsrKNpuohSiwDGUZdfT0R6rZWJnoWgl2tPMbNsJbyVtf24x3BXQ2WEQmSubb9fRuhehaCXa08xs2wlvJW1/bj7dFGrV0R561Y0sltnNZKxlbj+G0mkLuKTH3YyVntBvYMCLo9rCYGkGa2OXLmJs3NCWczRHTlA"))
            expr_70 = add:int(arraylength:int(expr_68:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_70:int, ldc:int(0))) {
                var_3_230 = newarray:byte[](byte.class, expr_70:int)
                var_4_231 = expr_70:int
                
                loop {
                    var_0_2F7 = and:int(var_0_2F7:int, ldc:int(16026558))
                    var_4_231 = add:int(var_4_231:int, ldc:int(-1))
                    storeelement:byte(var_3_230:byte[], var_4_231:int, add:int(shl:int(loadelement:byte(expr_68:byte[], var_4_231:int), ldc:int(2)), and:int(shr:int(loadelement:byte(var_2_6C:byte[], add:int(var_4_231:int, and:int(ldc:int(24857), ldc:int(5185)))), ldc:int(6)), and:int(ldc:int(10771), ldc:int(335)))))
                    
                    if (cmpne:boolean(var_4_231:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_8F_0 = stack_8D_0 = stack_B5_0 = stack_B7_0 = stack_D2_0 = stack_29F_0 = stack_30A_0 = var_3_230:byte[]
            }
            
            loop {
                if (cmpne:boolean(and:int(var_0_2F7:int, ldc:int(65536)), ldc:int(0))) {
                    goto(Label_0188)
                }
                
                if (cmpne:boolean(and:int(var_0_2F7:int, ldc:int(65536)), ldc:int(0))) {
                    goto(Label_0148)
                }
                
                var_0_2F7 = and:int(var_0_2F7:int, ldc:int(1958932666))
                expr_8F = arraylength:int(stack_8F_0:byte[])
                
                if (cmpeq:boolean(expr_8F:int, ldc:int(0))) {
                    goto(Label_0148)
                }
                
                var_5_281 = expr_8F:int
                var_3_286 = newarray:byte[](byte.class, expr_8F:int)
                var_4_287 = expr_8F:int
                Label_0649:
                
                while (cmpeq:boolean(and:int(var_0_2F7:int, ldc:int(16384)), ldc:int(0))) {
                    var_0_2F7 = and:int(var_0_2F7:int, ldc:int(-2014278662))
                    var_4_287 = add:int(var_4_287:int, ldc:int(-1))
                    expr_2A5 = xor:byte(add:byte(loadelement:byte(stack_29F_0:byte[], var_4_287:int), ldc:byte(78)), ldc:byte(20))
                    storeelement:byte(var_3_286:byte[], var_4_287:int, or:int(and:int(shl:int(expr_2A5:byte, and:int(ldc:int(676), ldc:int(7428))), ldc:int(-16)), and:int(shr:int(expr_2A5:byte[expected:int], and:int(ldc:int(12823), ldc:int(2156))), ldc:int(15))))
                    
                    if (cmpne:boolean(var_4_287:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    stack_8F_0 = stack_8D_0 = stack_B5_0 = stack_B7_0 = stack_D2_0 = stack_29F_0 = stack_30A_0 = var_3_286:byte[]
                    goto(Label_0148)
                }
                
                Label_0746:
                
                while (cmpeq:boolean(and:int(var_0_2F7:int, ldc:int(268435456)), ldc:int(0))) {
                    var_0_300 = and:int(var_0_2F7:int, ldc:int(-2101223942))
                    var_4_287 = add:int(var_4_287:int, ldc:int(-1))
                    expr_30A = loadelement:byte(stack_30A_0:byte[], var_4_287:int)
                    
                    if (cmpge:boolean(add:int(add:int(var_4_287:int, ldc:int(6)), neg:int(var_5_281:int)), ldc:int(0))) {
                        var_0_300 = and:int(var_0_300:int, ldc:int(1375181823))
                        stack_33A_2 = add:byte(expr_30A:byte, ldc:byte(6))
                    }
                    else {
                        stack_33A_2 = add:byte(expr_30A:byte, loadelement:byte(var_3_286:byte[], add:int(var_4_287:int, ldc:int(6))))
                    }
                    
                    var_0_2F7 = and:int(var_0_300:int, ldc:int(-756232326))
                    storeelement:byte(var_3_286:byte[], var_4_287:int, stack_33A_2:byte)
                    
                    if (cmpne:boolean(var_4_287:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    stack_8F_0 = stack_8D_0 = stack_B5_0 = stack_B7_0 = stack_D2_0 = stack_29F_0 = stack_30A_0 = var_3_286:byte[]
                    goto(Label_0188)
                }
                
                var_0_2F7 = and:int(var_0_2F7:int, ldc:int(623486884))
                goto(Label_0649)
                Label_0148:
                
                if (cmpeq:boolean(and:int(var_0_2F7:int, ldc:int(2097152)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_0_2F7:int, ldc:int(2)), ldc:int(0))) {
                        var_0_2F7 = and:int(var_0_2F7:int, ldc:int(844527013))
                        loopcontinue()
                    }
                    
                    var_0_2F7 = and:int(var_0_2F7:int, ldc:int(-620837637))
                    expr_B7 = arraylength:int(stack_B7_0:byte[])
                    
                    if (cmpne:boolean(expr_B7:int, ldc:int(0))) {
                        var_5_281 = expr_B7:int
                        var_3_286 = newarray:byte[](byte.class, expr_B7:int)
                        var_4_287 = expr_B7:int
                        goto(Label_0746)
                    }
                }
                
                Label_0188:
                
                if (cmpne:boolean(and:int(var_0_2F7:int, ldc:int(262144)), ldc:int(0))) {
                    goto(Label_0148)
                }
                
                if (cmpeq:boolean(and:int(var_0_2F7:int, ldc:int(16384)), ldc:int(0))) {
                    looporswitchbreak()
                }
            }
            
            var_3_DE = initobject:String(String::<init>, stack_D2_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_204_0 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(74), ldc:int(2059)))
            expr_F0 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(522), ldc:int(2315)))
            storeelement:String(expr_F0:String[], and:int(ldc:int(16389), ldc:int(3092)), invokevirtual:String[expected:String](String::substring, var_3_DE:String, and:int(ldc:int(1106), ldc:int(-1107)), xor:int(ldc:int(2393), ldc:int(2386))))
            storeelement:String(expr_F0:String[], and:int(ldc:int(17835), ldc:int(513)), invokevirtual:String[expected:String](String::substring, var_3_DE:String, xor:int(ldc:int(-22014), ldc:int(-22007)), and:int(ldc:int(21), ldc:int(13332))))
            storeelement:String(expr_F0:String[], and:int(ldc:int(15030), ldc:int(7)), invokevirtual:String[expected:String](String::substring, var_3_DE:String, and:int(ldc:int(1308), ldc:int(16533)), and:int(ldc:int(10782), ldc:int(4536))))
            storeelement:String(expr_F0:String[], xor:int(ldc:int(4688), ldc:int(4690)), invokevirtual:String[expected:String](String::substring, var_3_DE:String, and:int(ldc:int(2586), ldc:int(17436)), xor:int(ldc:int(8203), ldc:int(8254))))
            storeelement:String(expr_F0:String[], and:int(ldc:int(22815), ldc:int(9829)), invokevirtual:String[expected:String](String::substring, var_3_DE:String, xor:int(ldc:int(-24531), ldc:int(-24552)), and:int(ldc:int(596), ldc:int(5364))))
            storeelement:String(expr_F0:String[], and:int(ldc:int(670), ldc:int(-11935)), invokevirtual:String[expected:String](String::substring, var_3_DE:String, xor:int(ldc:int(-32375), ldc:int(-32291)), and:int(ldc:int(119), ldc:int(7798))))
            storeelement:String(expr_F0:String[], and:int(ldc:int(4399), ldc:int(583)), invokevirtual:String[expected:String](String::substring, var_3_DE:String, and:int(ldc:int(759), ldc:int(9590)), xor:int(ldc:int(2134), ldc:int(2081))))
            storeelement:String(expr_F0:String[], xor:int(ldc:int(139), ldc:int(131)), invokevirtual:String[expected:String](String::substring, var_3_DE:String, xor:int(ldc:int(4765), ldc:int(4842)), xor:int(ldc:int(49), ldc:int(73))))
            storeelement:String(expr_F0:String[], and:int(ldc:int(361), ldc:int(2587)), invokevirtual:String[expected:String](String::substring, var_3_DE:String, and:int(ldc:int(9464), ldc:int(6268)), and:int(ldc:int(2941), ldc:int(123))))
            storeelement:String(expr_F0:String[], xor:int(ldc:int(-24539), ldc:int(-24538)), invokevirtual:String[expected:String](String::substring, var_3_DE:String, xor:int(ldc:int(2082), ldc:int(2139)), and:int(ldc:int(3194), ldc:int(251))))
            putstatic:String[](\u9255\u64ab\ub6ab\ubf56\u88c5\u647c::\u760c\u8389\ud51e\u0800\u61a4\u759a, expr_F0:String[])
            putstatic:ByteBuffer(\u9255\u64ab\ub6ab\ubf56\u88c5\u647c::\u34df\u071d\u600f\u9937\u494c\ub19c, invokestatic:ByteBuffer(BufferUtils::createByteBuffer, ldc:int(4194304)))
            putstatic:IntBuffer(\u9255\u64ab\ub6ab\ubf56\u88c5\u647c::\ubded\u3776\ub83f\ubded\u72f1\u836c, invokevirtual:IntBuffer(ByteBuffer::asIntBuffer, getstatic:ByteBuffer(\u9255\u64ab\ub6ab\ubf56\u88c5\u647c::\u34df\u071d\u600f\u9937\u494c\ub19c)))
            putstatic:int[](\u9255\u64ab\ub6ab\ubf56\u88c5\u647c::\u76bc\u6c56\u6c56\ubff1\uc9f6\u34df, newarray:int[](int.class, ldc:int(1048576)))
            putstatic:Map<Integer, \ucfaf\uc2e8\u3776\u1187\u120d\u9255>(\u9255\u64ab\ub6ab\ubf56\u88c5\u647c::\uc7fe\u5bc4\ub113\u3a62\u6bb9\u8d98, initobject:HashMap<Integer, \ucfaf\uc2e8\u3776\u1187\u120d\u9255>[expected:Map<Integer, \ucfaf\uc2e8\u3776\u1187\u120d\u9255>](HashMap<K, V>::<init>))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u2dcc\ub113\ube23\u36d3\ub113\ua61f(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_67B : int
        var_5_8A : int
        var_6_91 : int
        var_7_A0 : double
        var_9_D0 : double
        var_3_E2 : int
        var_11_F3 : int
        var_14_11D : double
        var_16_121 : int
        var_12_119 : double
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
        var_3_67B = and:int(ldc:int(1168516538), ldc:int(1071988735))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u9255\u64ab\ub6ab\ubf56\u88c5\u647c[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0180)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(64)), ldc:int(0))) {
            var_3_67B = and:int(var_3_67B:int, ldc:int(-1078655699))
        }
        else {
            var_3_67B = and:int(var_3_67B:int, ldc:int(-2056966665))
            var_5_8A = and:int(ldc:int(12851), ldc:int(-12852))
            var_6_91 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_A0 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-9460), ldc:int(9267)))
            invokestatic:int(m::a)
            
            loop {
                var_9_D0 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_E2 = and:int(var_3_67B:int, ldc:int(-2021775875))
                    var_9_D0 = sub:double(var_7_A0:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_F3 = var_5_8A:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_F3:int, sub:int(var_6_91:int, xor:int(ldc:int(12560), ldc:int(12561)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_F3:int, and:int(ldc:int(33), ldc:int(24579)))), var_7_A0:double))) {
                        inc:int(var_11_F3, ldc:int(1))
                    }
                    
                    var_3_67B = and:int(var_3_E2:int, ldc:int(1832887807))
                    var_14_11D = var_7_A0:double
                    var_16_121 = var_11_F3:int
                }
                else {
                    var_11_F3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_8A:int), and:int(ldc:int(2319), ldc:int(13857)))
                    var_12_119 = var_14_11D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A)
                    
                    if (cmplt:boolean(var_16_121 = var_11_F3:int, var_6_91:int)) {
                        var_9_D0 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_F3:int)
                        var_16_121 = var_11_F3:int
                        var_14_11D = var_12_119:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1523)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1369)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(18038628))
                        goto(Label_1224)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-440235321))
                        goto(Label_1085)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0927)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-2095098542))
                        goto(Label_0823)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0703)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(64)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(213619883))
                        goto(Label_0592)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(1709600700))
                        
                        if (cmplt:boolean(var_16_121:int, var_6_91:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0592)
                            }
                            
                            goto(Label_0823)
                        }
                    }
                    
                    Label_0419:
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-1558815218))
                        goto(Label_1523)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-2009397435))
                        goto(Label_1369)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(4)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-1963782376))
                        goto(Label_1224)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1085)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0927)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0823)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0703)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-1091805318))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(99161674))
                            loopcontinue()
                        }
                        
                        var_3_67B = and:int(var_3_67B:int, ldc:int(2134161406))
                        var_11_F3 = and:int(ldc:int(-24862), ldc:int(24605))
                        goto(Label_1512)
                    }
                    
                    Label_0592:
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1523)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1369)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(1227775406))
                        goto(Label_1224)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-878806254))
                        goto(Label_1085)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0927)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-250286401))
                        goto(Label_0823)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(524288)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0419)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(1024)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-1375899717))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_11D = var_9_D0:double
                            goto(Label_0823)
                        }
                    }
                    
                    Label_0703:
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1523)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1369)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1224)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-1902956365))
                        goto(Label_1085)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0927)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(4)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0592)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(32)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(829642248))
                            goto(Label_0419)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(1489923561))
                            loopcontinue()
                        }
                        
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-1653293061))
                        var_14_11D = mul:double(ldc:double(0.5), add:double(var_9_D0:double, var_14_11D:double))
                    }
                    
                    Label_0823:
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1523)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(103299189))
                        goto(Label_1369)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1224)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1085)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(4194304)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(32)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(-1795810019))
                            goto(Label_0703)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0592)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0419)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(8192)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_67B = and:int(var_3_67B:int, ldc:int(1600503221))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A:int), var_7_A0:double)) {
                                var_11_F3 = and:int(ldc:int(309), ldc:int(11915))
                                goto(Label_1085)
                            }
                        }
                    }
                    
                    Label_0927:
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1523)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(88677920))
                        goto(Label_1369)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1224)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-511995366))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(1243257059))
                            goto(Label_0823)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0703)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(-1523805930))
                            goto(Label_0592)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0419)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(1)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_67B = and:int(var_3_67B:int, ldc:int(91223536))
                        var_11_F3 = and:int(ldc:int(25613), ldc:int(-29838))
                    }
                    
                    Label_1085:
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(128)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-953836231))
                        goto(Label_1523)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-1440439705))
                        goto(Label_1369)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(1)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-970098776))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0927)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0823)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(186232970))
                            goto(Label_0703)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0592)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(1242133409))
                            goto(Label_0419)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(1496677201))
                            loopcontinue()
                        }
                        
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-709464577))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_F3:int, ldc:int(0))) {
                                goto(Label_1369)
                            }
                        }
                    }
                    
                    Label_1224:
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-1582757141))
                        goto(Label_1523)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(262144)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_1085)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(1753761412))
                            goto(Label_0927)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(862448451))
                            goto(Label_0823)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0703)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(128)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(-2135048377))
                            goto(Label_0592)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0419)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(64)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(1606769943))
                            loopcontinue()
                        }
                        
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-445169735))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_11D:double, var_5_8A:int, var_16_121:int)
                        goto(Label_1512)
                    }
                    
                    Label_1369:
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-219227701))
                        goto(Label_1523)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1224)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1085)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-2125474327))
                        goto(Label_0927)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(4)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(1510218876))
                        goto(Label_0823)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0703)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0592)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-1572945068))
                        goto(Label_0419)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(4)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-1356222641))
                        loopcontinue()
                    }
                    
                    var_3_67B = and:int(var_3_67B:int, ldc:int(929429434))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_11D:double, ldc:double(0.0))
                    Label_1512:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_686 = var_5_8A:int
                        
                        if (cmpeq:boolean(var_11_F3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1523:
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1369)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-1138810840))
                        goto(Label_1224)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(1848945265))
                        goto(Label_1085)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0927)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-1026956967))
                        goto(Label_0823)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(4)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(265854616))
                        goto(Label_0703)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(4)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(188093421))
                        goto(Label_0592)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(64)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-1179016130))
                        goto(Label_0419)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(624862710))
                        var_17_686 = add:int(var_16_121:int, xor:int(ldc:int(4361), ldc:int(4360)))
                        looporswitchbreak()
                    }
                    
                    var_3_67B = and:int(var_3_67B:int, ldc:int(-1270021964))
                }
                
                var_3_67B = and:int(var_3_67B:int, ldc:int(390068217))
                
                if (cmple:boolean(var_5_8A = var_17_686:int, sub:int(var_6_91:int, xor:int(ldc:int(4166), ldc:int(4167))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0180:
        
        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(16777216)), ldc:int(0))) {
            var_3_67B = and:int(var_3_67B:int, ldc:int(1870730102))
            goto(Label_0108)
        }
    }
}
