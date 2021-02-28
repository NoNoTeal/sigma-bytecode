public class \u3bc9\u67e9\uc87f\u47c2\u5f50.\u64f2\u718f\u56bd\u4975\u3bd6 {
    public void \u64f2\u718f\u56bd\u4975\u3bd6(\u56bd\u8413\u647c\u5bc4\ud158.\u5140\u6bb9\u8bb0\u946b\u3dd3 p0, \u56bd\u8413\u647c\u5bc4\ud158.\u5140\u6bb9\u8bb0\u946b\u3dd3 p1) {
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
            invokespecial:Object(Object::<init>, this:\u64f2\u718f\u56bd\u4975\u3bd6)
            putfield:ArrayList<\u5140\u6bb9\u8bb0\u946b\u3dd3>(\u64f2\u718f\u56bd\u4975\u3bd6::\uc9f6\ub18d\ub6ab\u3c25\u8258, this:\u64f2\u718f\u56bd\u4975\u3bd6, initobject:ArrayList<\u5140\u6bb9\u8bb0\u946b\u3dd3>(ArrayList<E>::<init>))
            putfield:ArrayList<\ubf56\ud7e8\u156b\u72f1\u494c>(\u64f2\u718f\u56bd\u4975\u3bd6::\u3bd6\ub7dc\u5db4\u71ae\u4bc8, this:\u64f2\u718f\u56bd\u4975\u3bd6, initobject:ArrayList<\ubf56\ud7e8\u156b\u72f1\u494c>(ArrayList<E>::<init>))
            putfield:ArrayList<\ubf56\ud7e8\u156b\u72f1\u494c>(\u64f2\u718f\u56bd\u4975\u3bd6::\uceb8\uc4d2\u8350\u7873\u5654, this:\u64f2\u718f\u56bd\u4975\u3bd6, initobject:ArrayList<\ubf56\ud7e8\u156b\u72f1\u494c>(ArrayList<E>::<init>))
            putfield:double(\u64f2\u718f\u56bd\u4975\u3bd6::\u2dcc\u4e72\u3711\u0a06\ua61f, this:\u64f2\u718f\u56bd\u4975\u3bd6, ldc:double(9.0))
            putfield:boolean(\u64f2\u718f\u56bd\u4975\u3bd6::\u839e\uc3e3\u64f2\u946b\u34df, this:\u64f2\u718f\u56bd\u4975\u3bd6, xor:int[expected:boolean](ldc:int(2098), ldc:int(2099)))
            putfield:\u5140\u6bb9\u8bb0\u946b\u3dd3(\u64f2\u718f\u56bd\u4975\u3bd6::\u92ee\u8350\u5fe1\u4c2b\u3d64, this:\u64f2\u718f\u56bd\u4975\u3bd6, invokevirtual:\u5140\u6bb9\u8bb0\u946b\u3dd3(\u5140\u6bb9\u8bb0\u946b\u3dd3::\uc229\uf995\u624e\u3d4b\u718f, invokevirtual:\u5140\u6bb9\u8bb0\u946b\u3dd3(\u5140\u6bb9\u8bb0\u946b\u3dd3::\ub113\ud158\u3bd6\u6fb0\ub32d, p0:\u5140\u6bb9\u8bb0\u946b\u3dd3, ldc:double(0.0), ldc:double(0.0), ldc:double(0.0))))
            putfield:\u5140\u6bb9\u8bb0\u946b\u3dd3(\u64f2\u718f\u56bd\u4975\u3bd6::\u1833\u8aa5\u3e75\u6bb9\u6d69, this:\u64f2\u718f\u56bd\u4975\u3bd6, invokevirtual:\u5140\u6bb9\u8bb0\u946b\u3dd3(\u5140\u6bb9\u8bb0\u946b\u3dd3::\uc229\uf995\u624e\u3d4b\u718f, invokevirtual:\u5140\u6bb9\u8bb0\u946b\u3dd3(\u5140\u6bb9\u8bb0\u946b\u3dd3::\ub113\ud158\u3bd6\u6fb0\ub32d, p1:\u5140\u6bb9\u8bb0\u946b\u3dd3, ldc:double(0.0), ldc:double(0.0), ldc:double(0.0))))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public java.util.ArrayList<\u56bd\u8413\u647c\u5bc4\ud158.\u5140\u6bb9\u8bb0\u946b\u3dd3> \u4e72\uae5d\u97e6\uc7fe\u34df() {
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
            return:ArrayList<\u5140\u6bb9\u8bb0\u946b\u3dd3>(getfield:ArrayList<\u5140\u6bb9\u8bb0\u946b\u3dd3>(\u64f2\u718f\u56bd\u4975\u3bd6::\uc9f6\ub18d\ub6ab\u3c25\u8258, this:\u64f2\u718f\u56bd\u4975\u3bd6))
        }
        
        goto(Label_0006)
    }
    
    public void \u93a2\u8709\u6435\u93a2\u3dd3() {
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
            invokevirtual:void(\u64f2\u718f\u56bd\u4975\u3bd6::\u93a2\u8709\u6435\u93a2\u3dd3, this:\u64f2\u718f\u56bd\u4975\u3bd6, xor:int(ldc:int(16797), ldc:int(17013)), and:int(ldc:int(5188), ldc:int(516)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u93a2\u8709\u6435\u93a2\u3dd3(int p0, int p1) {
        var_3_BF : int
        var_5_75 : ArrayList<\u5140\u6bb9\u8bb0\u946b\u3dd3>
        var_6_AB : int
        var_7_126 : int
        var_3_136 : int
        var_8_145 : Iterator<\ubf56\ud7e8\u156b\u72f1\u494c>
        var_9_178 : \ubf56\ud7e8\u156b\u72f1\u494c
        var_10_19F : \u5140\u6bb9\u8bb0\u946b\u3dd3[]
        var_11_1A4 : int
        var_12_1AD : int
        var_14_22E : \u5140\u6bb9\u8bb0\u946b\u3dd3
        var_10_1D7 : \u5140\u6bb9\u8bb0\u946b\u3dd3
        var_11_1FD : \u5140\u6bb9\u8bb0\u946b\u3dd3
        
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
            var_3_BF = and:int(ldc:int(1604951784), ldc:int(-608613436))
            invokevirtual:void(ArrayList<E>::clear, getfield:ArrayList<\u5140\u6bb9\u8bb0\u946b\u3dd3>(\u64f2\u718f\u56bd\u4975\u3bd6::\uc9f6\ub18d\ub6ab\u3c25\u8258, this:\u64f2\u718f\u56bd\u4975\u3bd6))
            invokevirtual:void(ArrayList<E>::clear, getfield:ArrayList<\ubf56\ud7e8\u156b\u72f1\u494c>(\u64f2\u718f\u56bd\u4975\u3bd6::\uceb8\uc4d2\u8350\u7873\u5654, this:\u64f2\u718f\u56bd\u4975\u3bd6))
            var_5_75 = initobject:ArrayList<\u5140\u6bb9\u8bb0\u946b\u3dd3>(ArrayList<E>::<init>)
            invokevirtual:boolean(ArrayList<\u5140\u6bb9\u8bb0\u946b\u3dd3>::add, var_5_75:ArrayList<\u5140\u6bb9\u8bb0\u946b\u3dd3>, getfield:\u5140\u6bb9\u8bb0\u946b\u3dd3(\u64f2\u718f\u56bd\u4975\u3bd6::\u92ee\u8350\u5fe1\u4c2b\u3d64, this:\u64f2\u718f\u56bd\u4975\u3bd6))
            invokevirtual:boolean(ArrayList<\ubf56\ud7e8\u156b\u72f1\u494c>::add, getfield:ArrayList<\ubf56\ud7e8\u156b\u72f1\u494c>(\u64f2\u718f\u56bd\u4975\u3bd6::\uceb8\uc4d2\u8350\u7873\u5654, this:\u64f2\u718f\u56bd\u4975\u3bd6), initobject:\ubf56\ud7e8\u156b\u72f1\u494c(\ubf56\ud7e8\u156b\u72f1\u494c::<init>, getfield:\u5140\u6bb9\u8bb0\u946b\u3dd3(\u64f2\u718f\u56bd\u4975\u3bd6::\u92ee\u8350\u5fe1\u4c2b\u3d64, this:\u64f2\u718f\u56bd\u4975\u3bd6), aconstnull:\ubf56\ud7e8\u156b\u72f1\u494c(), var_5_75:ArrayList<\u5140\u6bb9\u8bb0\u946b\u3dd3>, invokevirtual:double(\u5140\u6bb9\u8bb0\u946b\u3dd3::\uf9c5\u64ab\u927d\u0b8e\u34df, getfield:\u5140\u6bb9\u8bb0\u946b\u3dd3(\u64f2\u718f\u56bd\u4975\u3bd6::\u92ee\u8350\u5fe1\u4c2b\u3d64, this:\u64f2\u718f\u56bd\u4975\u3bd6), getfield:\u5140\u6bb9\u8bb0\u946b\u3dd3(\u64f2\u718f\u56bd\u4975\u3bd6::\u1833\u8aa5\u3e75\u6bb9\u6d69, this:\u64f2\u718f\u56bd\u4975\u3bd6)), ldc:double(0.0), ldc:double(0.0)))
            var_6_AB = and:int(ldc:int(30208), ldc:int(-30218))
            
            loop {
                if (cmpeq:boolean(and:int(var_3_BF:int, ldc:int(64)), ldc:int(0))) {
                    goto(Label_0240)
                }
                
                if (cmpeq:boolean(and:int(var_3_BF:int, ldc:int(536870912)), ldc:int(0))) {
                    var_3_BF = and:int(var_3_BF:int, ldc:int(-1410610440))
                    
                    if (cmplt:boolean(var_6_AB:int, p0:int)) {
                        invokestatic:void(Collections::sort, getfield:ArrayList<\ubf56\ud7e8\u156b\u72f1\u494c>[expected:List<\ubf56\ud7e8\u156b\u72f1\u494c>](\u64f2\u718f\u56bd\u4975\u3bd6::\uceb8\uc4d2\u8350\u7873\u5654, this:\u64f2\u718f\u56bd\u4975\u3bd6), initobject:\ua068\ub171\u3776\uc4d2\u7330[expected:Comparator<? super \ubf56\ud7e8\u156b\u72f1\u494c>](\ua068\ub171\u3776\uc4d2\u7330::<init>, this:\u64f2\u718f\u56bd\u4975\u3bd6))
                        var_7_126 = and:int(ldc:int(-14688), ldc:int(14686))
                        
                        if (cmpne:boolean(invokevirtual:int(ArrayList<E>::size, getfield:ArrayList<\ubf56\ud7e8\u156b\u72f1\u494c>(\u64f2\u718f\u56bd\u4975\u3bd6::\uceb8\uc4d2\u8350\u7873\u5654, this:\u64f2\u718f\u56bd\u4975\u3bd6)), ldc:int(0))) {
                            var_3_136 = and:int(var_3_BF:int, ldc:int(-1963344160))
                            var_8_145 = invokevirtual:Iterator<\ubf56\ud7e8\u156b\u72f1\u494c>(ArrayList<\ubf56\ud7e8\u156b\u72f1\u494c>::iterator, initobject:ArrayList<\ubf56\ud7e8\u156b\u72f1\u494c>(ArrayList<\ubf56\ud7e8\u156b\u72f1\u494c>::<init>, getfield:ArrayList<\ubf56\ud7e8\u156b\u72f1\u494c>[expected:Collection<? extends \ubf56\ud7e8\u156b\u72f1\u494c>](\u64f2\u718f\u56bd\u4975\u3bd6::\uceb8\uc4d2\u8350\u7873\u5654, this:\u64f2\u718f\u56bd\u4975\u3bd6)))
                            
                            while (invokeinterface:boolean(Iterator::hasNext, var_8_145:Iterator)) {
                                var_9_178 = checkcast:\ubf56\ud7e8\u156b\u72f1\u494c(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u836c\u67e9\u5d20\u5fe1\u7e3f.\ubf56\ud7e8\u156b\u72f1\u494c.class, invokeinterface:\ubf56\ud7e8\u156b\u72f1\u494c(Iterator<\ubf56\ud7e8\u156b\u72f1\u494c>::next, var_8_145:Iterator<\ubf56\ud7e8\u156b\u72f1\u494c>))
                                
                                if (cmpgt:boolean(preincrement:int(1, var_7_126:int), p1:int)) {
                                    looporswitchbreak()
                                }
                                
                                var_3_BF = and:int(var_3_136:int, ldc:int(251628526))
                                invokevirtual:boolean(ArrayList<E>::remove, getfield:ArrayList<\ubf56\ud7e8\u156b\u72f1\u494c>(\u64f2\u718f\u56bd\u4975\u3bd6::\uceb8\uc4d2\u8350\u7873\u5654, this:\u64f2\u718f\u56bd\u4975\u3bd6), var_9_178:\ubf56\ud7e8\u156b\u72f1\u494c[expected:Object])
                                invokevirtual:boolean(ArrayList<\ubf56\ud7e8\u156b\u72f1\u494c>::add, getfield:ArrayList<\ubf56\ud7e8\u156b\u72f1\u494c>(\u64f2\u718f\u56bd\u4975\u3bd6::\u3bd6\ub7dc\u5db4\u71ae\u4bc8, this:\u64f2\u718f\u56bd\u4975\u3bd6), var_9_178:\ubf56\ud7e8\u156b\u72f1\u494c)
                                var_10_19F = getstatic:\u5140\u6bb9\u8bb0\u946b\u3dd3[](\u64f2\u718f\u56bd\u4975\u3bd6::\u9255\u5bc4\u516c\u8389\u1833)
                                var_11_1A4 = arraylength:int(var_10_19F:\u5140\u6bb9\u8bb0\u946b\u3dd3[])
                                var_12_1AD = and:int(ldc:int(8704), ldc:int(-8705))
                                
                                while (cmplt:boolean(var_12_1AD:int, var_11_1A4:int)) {
                                    var_14_22E = invokevirtual:\u5140\u6bb9\u8bb0\u946b\u3dd3(\u5140\u6bb9\u8bb0\u946b\u3dd3::\uc229\uf995\u624e\u3d4b\u718f, invokevirtual:\u5140\u6bb9\u8bb0\u946b\u3dd3(\u5140\u6bb9\u8bb0\u946b\u3dd3::\ub1b9\ud51e\u647c\u6198\u52d3, invokevirtual:\u5140\u6bb9\u8bb0\u946b\u3dd3(\ubf56\ud7e8\u156b\u72f1\u494c::\uceb8\uc3e3\u71ae\ub19c\u7d52, var_9_178:\ubf56\ud7e8\u156b\u72f1\u494c), loadelement:\u5140\u6bb9\u8bb0\u946b\u3dd3(var_10_19F:\u5140\u6bb9\u8bb0\u946b\u3dd3[], var_12_1AD:int)))
                                    
                                    if (logicaland:boolean(invokestatic:boolean(\u64f2\u718f\u56bd\u4975\u3bd6::\u4c04\u4ab3\u527a\u6c56\u16f6, var_14_22E:\u5140\u6bb9\u8bb0\u946b\u3dd3, and:int[expected:boolean](ldc:int(-20210), ldc:int(19041))), invokevirtual:boolean(\u64f2\u718f\u56bd\u4975\u3bd6::\u6ec6\u67e9\u3504\u5654\u92ee, this:\u64f2\u718f\u56bd\u4975\u3bd6, var_9_178:\ubf56\ud7e8\u156b\u72f1\u494c, var_14_22E:\u5140\u6bb9\u8bb0\u946b\u3dd3, ldc:double(0.0)))) {
                                        goto(Label_0198)
                                    }
                                    
                                    inc:int(var_12_1AD, ldc:int(1))
                                }
                                
                                var_3_BF = and:int(var_3_BF:int, ldc:int(-810685697))
                                var_10_1D7 = invokevirtual:\u5140\u6bb9\u8bb0\u946b\u3dd3(\u5140\u6bb9\u8bb0\u946b\u3dd3::\uc229\uf995\u624e\u3d4b\u718f, invokevirtual:\u5140\u6bb9\u8bb0\u946b\u3dd3(\u5140\u6bb9\u8bb0\u946b\u3dd3::\ub113\ud158\u3bd6\u6fb0\ub32d, invokevirtual:\u5140\u6bb9\u8bb0\u946b\u3dd3(\ubf56\ud7e8\u156b\u72f1\u494c::\uceb8\uc3e3\u71ae\ub19c\u7d52, var_9_178:\ubf56\ud7e8\u156b\u72f1\u494c), ldc:double(0.0), ldc:double(1.0), ldc:double(0.0)))
                                
                                if (logicaland:boolean(invokestatic:boolean(\u64f2\u718f\u56bd\u4975\u3bd6::\u4c04\u4ab3\u527a\u6c56\u16f6, var_10_1D7:\u5140\u6bb9\u8bb0\u946b\u3dd3, and:int[expected:boolean](ldc:int(-3425), ldc:int(3424))), invokevirtual:boolean(\u64f2\u718f\u56bd\u4975\u3bd6::\u6ec6\u67e9\u3504\u5654\u92ee, this:\u64f2\u718f\u56bd\u4975\u3bd6, var_9_178:\ubf56\ud7e8\u156b\u72f1\u494c, var_10_1D7:\u5140\u6bb9\u8bb0\u946b\u3dd3, ldc:double(0.0)))) {
                                    goto(Label_0198)
                                }
                                
                                var_3_BF = and:int(var_3_BF:int, ldc:int(1811352820))
                                var_11_1FD = invokevirtual:\u5140\u6bb9\u8bb0\u946b\u3dd3(\u5140\u6bb9\u8bb0\u946b\u3dd3::\uc229\uf995\u624e\u3d4b\u718f, invokevirtual:\u5140\u6bb9\u8bb0\u946b\u3dd3(\u5140\u6bb9\u8bb0\u946b\u3dd3::\ub113\ud158\u3bd6\u6fb0\ub32d, invokevirtual:\u5140\u6bb9\u8bb0\u946b\u3dd3(\ubf56\ud7e8\u156b\u72f1\u494c::\uceb8\uc3e3\u71ae\ub19c\u7d52, var_9_178:\ubf56\ud7e8\u156b\u72f1\u494c), ldc:double(0.0), ldc:double(-1.0), ldc:double(0.0)))
                                
                                if (logicaland:boolean(invokestatic:boolean(\u64f2\u718f\u56bd\u4975\u3bd6::\u4c04\u4ab3\u527a\u6c56\u16f6, var_11_1FD:\u5140\u6bb9\u8bb0\u946b\u3dd3, and:int[expected:boolean](ldc:int(6795), ldc:int(-6796))), invokevirtual:boolean(\u64f2\u718f\u56bd\u4975\u3bd6::\u6ec6\u67e9\u3504\u5654\u92ee, this:\u64f2\u718f\u56bd\u4975\u3bd6, var_9_178:\ubf56\ud7e8\u156b\u72f1\u494c, var_11_1FD:\u5140\u6bb9\u8bb0\u946b\u3dd3, ldc:double(0.0)))) {
                                    goto(Label_0198)
                                }
                                
                                var_3_136 = and:int(var_3_BF:int, ldc:int(1068833477))
                            }
                            
                            var_3_BF = and:int(var_3_136:int, ldc:int(-287221257))
                            inc:int(var_6_AB, ldc:int(1))
                            loopcontinue()
                        }
                    }
                }
                
                Label_0198:
                
                if (cmpne:boolean(and:int(var_3_BF:int, ldc:int(1048576)), ldc:int(0))) {
                    var_3_BF = and:int(var_3_BF:int, ldc:int(1721373246))
                }
                else {
                    if (cmpne:boolean(and:int(var_3_BF:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_BF = and:int(var_3_BF:int, ldc:int(-1632431033))
                        loopcontinue()
                    }
                    
                    var_3_BF = and:int(var_3_BF:int, ldc:int(-621867277))
                    
                    if (getfield:boolean(\u64f2\u718f\u56bd\u4975\u3bd6::\u839e\uc3e3\u64f2\u946b\u34df, this:\u64f2\u718f\u56bd\u4975\u3bd6)) {
                        invokestatic:void(Collections::sort, getfield:ArrayList<\ubf56\ud7e8\u156b\u72f1\u494c>[expected:List<\ubf56\ud7e8\u156b\u72f1\u494c>](\u64f2\u718f\u56bd\u4975\u3bd6::\u3bd6\ub7dc\u5db4\u71ae\u4bc8, this:\u64f2\u718f\u56bd\u4975\u3bd6), initobject:\ua068\ub171\u3776\uc4d2\u7330[expected:Comparator<? super \ubf56\ud7e8\u156b\u72f1\u494c>](\ua068\ub171\u3776\uc4d2\u7330::<init>, this:\u64f2\u718f\u56bd\u4975\u3bd6))
                        putfield:ArrayList<\u5140\u6bb9\u8bb0\u946b\u3dd3>(\u64f2\u718f\u56bd\u4975\u3bd6::\uc9f6\ub18d\ub6ab\u3c25\u8258, this:\u64f2\u718f\u56bd\u4975\u3bd6, invokevirtual:ArrayList<\u5140\u6bb9\u8bb0\u946b\u3dd3>(\ubf56\ud7e8\u156b\u72f1\u494c::\uc246\ube23\u3d4b\u92ff\u98a4, checkcast:\ubf56\ud7e8\u156b\u72f1\u494c(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u836c\u67e9\u5d20\u5fe1\u7e3f.\ubf56\ud7e8\u156b\u72f1\u494c.class, invokevirtual:\ubf56\ud7e8\u156b\u72f1\u494c(ArrayList<\ubf56\ud7e8\u156b\u72f1\u494c>::get, getfield:ArrayList<\ubf56\ud7e8\u156b\u72f1\u494c>(\u64f2\u718f\u56bd\u4975\u3bd6::\u3bd6\ub7dc\u5db4\u71ae\u4bc8, this:\u64f2\u718f\u56bd\u4975\u3bd6), and:int(ldc:int(1290), ldc:int(-1291))))))
                    }
                }
                
                Label_0240:
                
                if (cmpne:boolean(and:int(var_3_BF:int, ldc:int(1048576)), ldc:int(0))) {
                    goto(Label_0198)
                }
                
                if (cmpne:boolean(and:int(var_3_BF:int, ldc:int(134217728)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_3_BF = and:int(var_3_BF:int, ldc:int(1060713))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static java.util.ArrayList<\u56bd\u8413\u647c\u5bc4\ud158.\u5140\u6bb9\u8bb0\u946b\u3dd3> \uf995\u624e\uc7fe\ud217\ub19c(\u56bd\u8413\u647c\u5bc4\ud158.\u5140\u6bb9\u8bb0\u946b\u3dd3 p0, \u56bd\u8413\u647c\u5bc4\ud158.\u5140\u6bb9\u8bb0\u946b\u3dd3 p1) {
        var_4_69 : \u64f2\u718f\u56bd\u4975\u3bd6
        var_5_77 : int
        var_6_80 : int
        var_7_83 : \u5140\u6bb9\u8bb0\u946b\u3dd3
        var_8_86 : \u5140\u6bb9\u8bb0\u946b\u3dd3
        var_9_8F : ArrayList<\u5140\u6bb9\u8bb0\u946b\u3dd3>
        var_10_96 : ArrayList<\u5140\u6bb9\u8bb0\u946b\u3dd3>
        var_11_9D : Iterator<\u5140\u6bb9\u8bb0\u946b\u3dd3>
        var_12_BA : \u5140\u6bb9\u8bb0\u946b\u3dd3
        var_13_FC : int
        var_14_11C : double
        var_16_12B : double
        var_18_13A : double
        var_20_149 : double
        var_22_158 : double
        var_24_167 : double
        var_26_16C : int
        var_27_1C4 : int
        var_28_1DC : int
        
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
            var_4_69 = initobject:\u64f2\u718f\u56bd\u4975\u3bd6(\u64f2\u718f\u56bd\u4975\u3bd6::<init>, p0:\u5140\u6bb9\u8bb0\u946b\u3dd3, p1:\u5140\u6bb9\u8bb0\u946b\u3dd3)
            invokevirtual:void(\u64f2\u718f\u56bd\u4975\u3bd6::\u93a2\u8709\u6435\u93a2\u3dd3, var_4_69:\u64f2\u718f\u56bd\u4975\u3bd6)
            var_5_77 = xor:int(ldc:int(25), ldc:int(28))
            var_6_80 = and:int(ldc:int(11345), ldc:int(-11476))
            var_7_83 = aconstnull:\u5140\u6bb9\u8bb0\u946b\u3dd3()
            var_8_86 = aconstnull:\u5140\u6bb9\u8bb0\u946b\u3dd3()
            var_9_8F = initobject:ArrayList<\u5140\u6bb9\u8bb0\u946b\u3dd3>(ArrayList<E>::<init>)
            var_10_96 = invokevirtual:ArrayList<\u5140\u6bb9\u8bb0\u946b\u3dd3>(\u64f2\u718f\u56bd\u4975\u3bd6::\u4e72\uae5d\u97e6\uc7fe\u34df, var_4_69:\u64f2\u718f\u56bd\u4975\u3bd6)
            var_11_9D = invokevirtual:Iterator<\u5140\u6bb9\u8bb0\u946b\u3dd3>(ArrayList<\u5140\u6bb9\u8bb0\u946b\u3dd3>::iterator, var_10_96:ArrayList<\u5140\u6bb9\u8bb0\u946b\u3dd3>)
            
            while (invokeinterface:boolean(Iterator::hasNext, var_11_9D:Iterator)) {
                var_12_BA = checkcast:\u5140\u6bb9\u8bb0\u946b\u3dd3(\u56bd\u8413\u647c\u5bc4\ud158.\u5140\u6bb9\u8bb0\u946b\u3dd3.class, invokeinterface:\u5140\u6bb9\u8bb0\u946b\u3dd3(Iterator<\u5140\u6bb9\u8bb0\u946b\u3dd3>::next, var_11_9D:Iterator<\u5140\u6bb9\u8bb0\u946b\u3dd3>))
                
                if (logicaland:boolean(cmpne:boolean(var_6_80:int, ldc:int(0)), cmpne:boolean(var_6_80:int, sub:int(invokevirtual:int(ArrayList<E>::size, var_10_96:ArrayList<\u5140\u6bb9\u8bb0\u946b\u3dd3>), and:int(ldc:int(675), ldc:int(1289)))))) {
                    var_13_FC = xor:int(ldc:int(1313), ldc:int(1312))
                    
                    if (cmple:boolean(invokevirtual:double(\u5140\u6bb9\u8bb0\u946b\u3dd3::\uf9c5\u64ab\u927d\u0b8e\u34df, var_12_BA:\u5140\u6bb9\u8bb0\u946b\u3dd3, var_8_86:\u5140\u6bb9\u8bb0\u946b\u3dd3), i2d:double(mul:int(var_5_77:int, var_5_77:int)))) {
                        var_14_11C = invokestatic:double(Math::min, invokevirtual:double(\u5140\u6bb9\u8bb0\u946b\u3dd3::\u759a\ub171\uf995\u836c\u9af2, var_8_86:\u5140\u6bb9\u8bb0\u946b\u3dd3), invokevirtual:double(\u5140\u6bb9\u8bb0\u946b\u3dd3::\u759a\ub171\uf995\u836c\u9af2, var_12_BA:\u5140\u6bb9\u8bb0\u946b\u3dd3))
                        var_16_12B = invokestatic:double(Math::min, invokevirtual:double(\u5140\u6bb9\u8bb0\u946b\u3dd3::\u9af2\u4f4a\ub83f\u97e6\u3e2a, var_8_86:\u5140\u6bb9\u8bb0\u946b\u3dd3), invokevirtual:double(\u5140\u6bb9\u8bb0\u946b\u3dd3::\u9af2\u4f4a\ub83f\u97e6\u3e2a, var_12_BA:\u5140\u6bb9\u8bb0\u946b\u3dd3))
                        var_18_13A = invokestatic:double(Math::min, invokevirtual:double(\u5140\u6bb9\u8bb0\u946b\u3dd3::\u527a\u0800\u3e2a\uc238\u71ae, var_8_86:\u5140\u6bb9\u8bb0\u946b\u3dd3), invokevirtual:double(\u5140\u6bb9\u8bb0\u946b\u3dd3::\u527a\u0800\u3e2a\uc238\u71ae, var_12_BA:\u5140\u6bb9\u8bb0\u946b\u3dd3))
                        var_20_149 = invokestatic:double(Math::max, invokevirtual:double(\u5140\u6bb9\u8bb0\u946b\u3dd3::\u759a\ub171\uf995\u836c\u9af2, var_8_86:\u5140\u6bb9\u8bb0\u946b\u3dd3), invokevirtual:double(\u5140\u6bb9\u8bb0\u946b\u3dd3::\u759a\ub171\uf995\u836c\u9af2, var_12_BA:\u5140\u6bb9\u8bb0\u946b\u3dd3))
                        var_22_158 = invokestatic:double(Math::max, invokevirtual:double(\u5140\u6bb9\u8bb0\u946b\u3dd3::\u9af2\u4f4a\ub83f\u97e6\u3e2a, var_8_86:\u5140\u6bb9\u8bb0\u946b\u3dd3), invokevirtual:double(\u5140\u6bb9\u8bb0\u946b\u3dd3::\u9af2\u4f4a\ub83f\u97e6\u3e2a, var_12_BA:\u5140\u6bb9\u8bb0\u946b\u3dd3))
                        var_24_167 = invokestatic:double(Math::max, invokevirtual:double(\u5140\u6bb9\u8bb0\u946b\u3dd3::\u527a\u0800\u3e2a\uc238\u71ae, var_8_86:\u5140\u6bb9\u8bb0\u946b\u3dd3), invokevirtual:double(\u5140\u6bb9\u8bb0\u946b\u3dd3::\u527a\u0800\u3e2a\uc238\u71ae, var_12_BA:\u5140\u6bb9\u8bb0\u946b\u3dd3))
                        var_26_16C = d2i:int(var_14_11C:double)
                        
                        while (cmple:boolean(i2d:double(var_26_16C:int), var_20_149:double)) {
                            var_27_1C4 = d2i:int(var_16_12B:double)
                            
                            while (cmple:boolean(i2d:double(var_27_1C4:int), var_22_158:double)) {
                                var_28_1DC = d2i:int(var_18_13A:double)
                                
                                while (cmple:boolean(i2d:double(var_28_1DC:int), var_24_167:double)) {
                                    if (logicalnot:boolean(invokestatic:boolean(\u64f2\u718f\u56bd\u4975\u3bd6::\u4c04\u4ab3\u527a\u6c56\u16f6, var_26_16C:int, var_27_1C4:int, var_28_1DC:int, and:int[expected:boolean](ldc:int(-19000), ldc:int(18998))))) {
                                        var_13_FC = and:int(ldc:int(-19229), ldc:int(19228))
                                        looporswitchbreak(Label_0430)
                                    }
                                    
                                    inc:int(var_28_1DC, ldc:int(1))
                                }
                                
                                inc:int(var_27_1C4, ldc:int(1))
                            }
                            
                            inc:int(var_26_16C, ldc:int(1))
                        }
                    }
                    else {
                        var_13_FC = and:int(ldc:int(-20833), ldc:int(20832))
                    }
                    
                    Label_0430:
                    
                    if (cmpeq:boolean(var_13_FC:int, ldc:int(0))) {
                        invokevirtual:boolean(ArrayList<\u5140\u6bb9\u8bb0\u946b\u3dd3>::add, var_9_8F:ArrayList<\u5140\u6bb9\u8bb0\u946b\u3dd3>, invokevirtual:\u5140\u6bb9\u8bb0\u946b\u3dd3(\u5140\u6bb9\u8bb0\u946b\u3dd3::\ub113\ud158\u3bd6\u6fb0\ub32d, var_7_83:\u5140\u6bb9\u8bb0\u946b\u3dd3, ldc:double(0.5), ldc:double(0.0), ldc:double(0.5)))
                        var_8_86 = var_7_83:\u5140\u6bb9\u8bb0\u946b\u3dd3
                    }
                }
                else {
                    if (cmpne:boolean(var_7_83:\u5140\u6bb9\u8bb0\u946b\u3dd3, aconstnull:\u5140\u6bb9\u8bb0\u946b\u3dd3())) {
                        invokevirtual:boolean(ArrayList<\u5140\u6bb9\u8bb0\u946b\u3dd3>::add, var_9_8F:ArrayList<\u5140\u6bb9\u8bb0\u946b\u3dd3>, invokevirtual:\u5140\u6bb9\u8bb0\u946b\u3dd3(\u5140\u6bb9\u8bb0\u946b\u3dd3::\ub113\ud158\u3bd6\u6fb0\ub32d, var_7_83:\u5140\u6bb9\u8bb0\u946b\u3dd3, ldc:double(0.5), ldc:double(0.0), ldc:double(0.5)))
                    }
                    
                    invokevirtual:boolean(ArrayList<\u5140\u6bb9\u8bb0\u946b\u3dd3>::add, var_9_8F:ArrayList<\u5140\u6bb9\u8bb0\u946b\u3dd3>, invokevirtual:\u5140\u6bb9\u8bb0\u946b\u3dd3(\u5140\u6bb9\u8bb0\u946b\u3dd3::\ub113\ud158\u3bd6\u6fb0\ub32d, var_12_BA:\u5140\u6bb9\u8bb0\u946b\u3dd3, ldc:double(0.5), ldc:double(0.0), ldc:double(0.5)))
                    var_8_86 = var_12_BA:\u5140\u6bb9\u8bb0\u946b\u3dd3
                }
                
                var_7_83 = var_12_BA:\u5140\u6bb9\u8bb0\u946b\u3dd3
                inc:int(var_6_80, ldc:int(1))
            }
            
            return:ArrayList<\u5140\u6bb9\u8bb0\u946b\u3dd3>(var_9_8F:ArrayList<\u5140\u6bb9\u8bb0\u946b\u3dd3>)
        }
        
        goto(Label_0006)
    }
    
    public static boolean \u4c04\u4ab3\u527a\u6c56\u16f6(\u56bd\u8413\u647c\u5bc4\ud158.\u5140\u6bb9\u8bb0\u946b\u3dd3 p0, boolean p1) {
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
            return:boolean(invokestatic:boolean(\u64f2\u718f\u56bd\u4975\u3bd6::\u4c04\u4ab3\u527a\u6c56\u16f6, d2i:int(invokevirtual:double(\u5140\u6bb9\u8bb0\u946b\u3dd3::\u759a\ub171\uf995\u836c\u9af2, p0:\u5140\u6bb9\u8bb0\u946b\u3dd3)), d2i:int(invokevirtual:double(\u5140\u6bb9\u8bb0\u946b\u3dd3::\u9af2\u4f4a\ub83f\u97e6\u3e2a, p0:\u5140\u6bb9\u8bb0\u946b\u3dd3)), d2i:int(invokevirtual:double(\u5140\u6bb9\u8bb0\u946b\u3dd3::\u527a\u0800\u3e2a\uc238\u71ae, p0:\u5140\u6bb9\u8bb0\u946b\u3dd3)), p1:boolean))
        }
        
        goto(Label_0006)
    }
    
    public static boolean \u4c04\u4ab3\u527a\u6c56\u16f6(int p0, int p1, int p2, boolean p3) {
        var_4_61 : int
        stack_9A_0 : \u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7 [generated]
        var_4_98 : int
        var_6_9A : \u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7
        stack_133_0 : int [generated]
        
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
            var_4_61 = and:int(ldc:int(-1304407504), ldc:int(-1099910285))
            
            if (cmpne:boolean(invokevirtual:\u7d52\u718f\u3776\u6fb0\ub83f(\u7d52\u718f\u3776\u6fb0\ub83f::\u183a\u36d3\u6bb9\u647c\u7873\uceb8, getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u64f2\u718f\u56bd\u4975\u3bd6::\u4492\u52d3\u4d85\uff55\u1187))), aconstnull:\u7d52\u718f\u3776\u6fb0\ub83f())) {
                var_4_61 = and:int(var_4_61:int, ldc:int(1013186236))
                stack_9A_0 = invokevirtual:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7(\u7d52\u718f\u3776\u6fb0\ub83f::\ub113\ub1b9\u9937\u1833\u64f2\u3504, invokevirtual:\u7d52\u718f\u3776\u6fb0\ub83f(\u7d52\u718f\u3776\u6fb0\ub83f::\u183a\u36d3\u6bb9\u647c\u7873\uceb8, getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u64f2\u718f\u56bd\u4975\u3bd6::\u4492\u52d3\u4d85\uff55\u1187))))
            }
            else {
                stack_9A_0 = invokevirtual:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7(\u7d52\u718f\u3776\u6fb0\ub83f::\ub113\ub1b9\u9937\u1833\u64f2\u3504, getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u64f2\u718f\u56bd\u4975\u3bd6::\u4492\u52d3\u4d85\uff55\u1187)))
            }
            
            var_4_98 = and:int(var_4_61:int, ldc:int(876754680))
            var_6_9A = stack_9A_0:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7
            
            if (cmpne:boolean(invokeinterface:long(Stream<T>::count, invokevirtual:Stream<\u6c52\ubded\u4975\u71ae\u47c2\u7d52>(\u516c\u5bc4\u494c\ub1b9\u5245::\ucfaf\u9033\ucb79\u9255\uc31c\u7049, getfield:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255[expected:\u516c\u5bc4\u494c\ub1b9\u5245](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u946b\u98a4\u8709\u7043\ubf56\u5f50, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u64f2\u718f\u56bd\u4975\u3bd6::\u4492\u52d3\u4d85\uff55\u1187)), getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u64f2\u718f\u56bd\u4975\u3bd6::\u4492\u52d3\u4d85\uff55\u1187)), initobject:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7(\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7::<init>, sub:double(f2d:double(add:float(i2f:float(p0:int), ldc:float(0.5f))), div:double(invokevirtual:double(\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7::\u8aa5\u97e6\ubff1\ub1b9\uc4d2\u51b2, var_6_9A:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7), ldc:double(2.0))), i2d:double(p1:int), sub:double(f2d:double(add:float(i2f:float(p2:int), ldc:float(0.5f))), div:double(invokevirtual:double(\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7::\ub19c\ud4fe\u3e2a\uc2bd\uf9c5\u51fa, var_6_9A:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7), ldc:double(2.0))), add:double(f2d:double(add:float(i2f:float(p0:int), ldc:float(0.5f))), div:double(invokevirtual:double(\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7::\u8aa5\u97e6\ubff1\ub1b9\uc4d2\u51b2, var_6_9A:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7), ldc:double(2.0))), add:double(i2d:double(p1:int), invokevirtual:double(\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7::\ubb2b\ub6ab\uf995\ubded\u16f6\u7873, var_6_9A:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7)), add:double(f2d:double(add:float(i2f:float(p2:int), ldc:float(0.5f))), div:double(invokevirtual:double(\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7::\ub19c\ud4fe\u3e2a\uc2bd\uf9c5\u51fa, var_6_9A:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7), ldc:double(2.0)))))), ldc:long(0L))) {
                var_4_98 = and:int(var_4_98:int, ldc:int(-1258490309))
                stack_133_0 = and:int(ldc:int(-5464), ldc:int(5460))
            }
            else {
                stack_133_0 = and:int(ldc:int(25), ldc:int(773))
            }
            
            return:boolean(stack_133_0:int)
        }
        
        goto(Label_0006)
    }
    
    public \u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u836c\u67e9\u5d20\u5fe1\u7e3f.\ubf56\ud7e8\u156b\u72f1\u494c \uae87\ub113\uc910\ubefe\u8308(\u56bd\u8413\u647c\u5bc4\ud158.\u5140\u6bb9\u8bb0\u946b\u3dd3 p0) {
        var_2_61 : int
        var_4_69 : Iterator<\ubf56\ud7e8\u156b\u72f1\u494c>
        var_2_78 : int
        var_5_DF : \ubf56\ud7e8\u156b\u72f1\u494c
        var_5_16F : \ubf56\ud7e8\u156b\u72f1\u494c
        
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
        var_2_61 = and:int(ldc:int(1274413380), ldc:int(534724982))
        var_4_69 = invokevirtual:Iterator<\ubf56\ud7e8\u156b\u72f1\u494c>(ArrayList<\ubf56\ud7e8\u156b\u72f1\u494c>::iterator, getfield:ArrayList<\ubf56\ud7e8\u156b\u72f1\u494c>(\u64f2\u718f\u56bd\u4975\u3bd6::\u3bd6\ub7dc\u5db4\u71ae\u4bc8, this:\u64f2\u718f\u56bd\u4975\u3bd6))
        
        loop {
            if (cmpne:boolean(and:int(var_2_61:int, ldc:int(4096)), ldc:int(0))) {
                var_2_78 = and:int(var_2_61:int, ldc:int(1717561470))
                goto(Label_0320)
            }
            
            if (cmpne:boolean(and:int(var_2_61:int, ldc:int(16384)), ldc:int(0))) {
                var_2_78 = and:int(var_2_61:int, ldc:int(1221449985))
            }
            else {
                var_2_78 = and:int(var_2_61:int, ldc:int(-1611381786))
                
                if (invokeinterface:boolean(Iterator<E>::hasNext, var_4_69:Iterator)) {
                    var_5_DF = checkcast:\ubf56\ud7e8\u156b\u72f1\u494c(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u836c\u67e9\u5d20\u5fe1\u7e3f.\ubf56\ud7e8\u156b\u72f1\u494c.class, invokeinterface:\ubf56\ud7e8\u156b\u72f1\u494c(Iterator<\ubf56\ud7e8\u156b\u72f1\u494c>::next, var_4_69:Iterator<\ubf56\ud7e8\u156b\u72f1\u494c>))
                    
                    if (cmpeq:boolean(invokevirtual:double(\u5140\u6bb9\u8bb0\u946b\u3dd3::\u759a\ub171\uf995\u836c\u9af2, invokevirtual:\u5140\u6bb9\u8bb0\u946b\u3dd3(\ubf56\ud7e8\u156b\u72f1\u494c::\uceb8\uc3e3\u71ae\ub19c\u7d52, var_5_DF:\ubf56\ud7e8\u156b\u72f1\u494c)), invokevirtual:double(\u5140\u6bb9\u8bb0\u946b\u3dd3::\u759a\ub171\uf995\u836c\u9af2, p0:\u5140\u6bb9\u8bb0\u946b\u3dd3))) {
                        if (cmpeq:boolean(invokevirtual:double(\u5140\u6bb9\u8bb0\u946b\u3dd3::\u9af2\u4f4a\ub83f\u97e6\u3e2a, invokevirtual:\u5140\u6bb9\u8bb0\u946b\u3dd3(\ubf56\ud7e8\u156b\u72f1\u494c::\uceb8\uc3e3\u71ae\ub19c\u7d52, var_5_DF:\ubf56\ud7e8\u156b\u72f1\u494c)), invokevirtual:double(\u5140\u6bb9\u8bb0\u946b\u3dd3::\u9af2\u4f4a\ub83f\u97e6\u3e2a, p0:\u5140\u6bb9\u8bb0\u946b\u3dd3))) {
                            if (cmpeq:boolean(invokevirtual:double(\u5140\u6bb9\u8bb0\u946b\u3dd3::\u527a\u0800\u3e2a\uc238\u71ae, invokevirtual:\u5140\u6bb9\u8bb0\u946b\u3dd3(\ubf56\ud7e8\u156b\u72f1\u494c::\uceb8\uc3e3\u71ae\ub19c\u7d52, var_5_DF:\ubf56\ud7e8\u156b\u72f1\u494c)), invokevirtual:double(\u5140\u6bb9\u8bb0\u946b\u3dd3::\u527a\u0800\u3e2a\uc238\u71ae, p0:\u5140\u6bb9\u8bb0\u946b\u3dd3))) {
                                return:\ubf56\ud7e8\u156b\u72f1\u494c(var_5_DF:\ubf56\ud7e8\u156b\u72f1\u494c)
                            }
                        }
                    }
                    
                    var_2_61 = and:int(var_2_78:int, ldc:int(1859984328))
                    loopcontinue()
                }
            }
            
            Label_0157:
            
            if (cmpne:boolean(and:int(var_2_78:int, ldc:int(32768)), ldc:int(0))) {
                var_2_78 = and:int(var_2_78:int, ldc:int(-786649233))
            }
            else {
                if (cmpeq:boolean(and:int(var_2_78:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_2_61 = and:int(var_2_78:int, ldc:int(525559819))
                    loopcontinue()
                }
                
                var_2_78 = and:int(var_2_78:int, ldc:int(-757182008))
                var_4_69 = invokevirtual:Iterator<\ubf56\ud7e8\u156b\u72f1\u494c>(ArrayList<\ubf56\ud7e8\u156b\u72f1\u494c>::iterator, getfield:ArrayList<\ubf56\ud7e8\u156b\u72f1\u494c>(\u64f2\u718f\u56bd\u4975\u3bd6::\uceb8\uc4d2\u8350\u7873\u5654, this:\u64f2\u718f\u56bd\u4975\u3bd6))
                
                while (invokeinterface:boolean(Iterator::hasNext, var_4_69:Iterator)) {
                    var_5_16F = checkcast:\ubf56\ud7e8\u156b\u72f1\u494c(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u836c\u67e9\u5d20\u5fe1\u7e3f.\ubf56\ud7e8\u156b\u72f1\u494c.class, invokeinterface:\ubf56\ud7e8\u156b\u72f1\u494c(Iterator<\ubf56\ud7e8\u156b\u72f1\u494c>::next, var_4_69:Iterator<\ubf56\ud7e8\u156b\u72f1\u494c>))
                    
                    if (cmpeq:boolean(invokevirtual:double(\u5140\u6bb9\u8bb0\u946b\u3dd3::\u759a\ub171\uf995\u836c\u9af2, invokevirtual:\u5140\u6bb9\u8bb0\u946b\u3dd3(\ubf56\ud7e8\u156b\u72f1\u494c::\uceb8\uc3e3\u71ae\ub19c\u7d52, var_5_16F:\ubf56\ud7e8\u156b\u72f1\u494c)), invokevirtual:double(\u5140\u6bb9\u8bb0\u946b\u3dd3::\u759a\ub171\uf995\u836c\u9af2, p0:\u5140\u6bb9\u8bb0\u946b\u3dd3))) {
                        if (cmpeq:boolean(invokevirtual:double(\u5140\u6bb9\u8bb0\u946b\u3dd3::\u9af2\u4f4a\ub83f\u97e6\u3e2a, invokevirtual:\u5140\u6bb9\u8bb0\u946b\u3dd3(\ubf56\ud7e8\u156b\u72f1\u494c::\uceb8\uc3e3\u71ae\ub19c\u7d52, var_5_16F:\ubf56\ud7e8\u156b\u72f1\u494c)), invokevirtual:double(\u5140\u6bb9\u8bb0\u946b\u3dd3::\u9af2\u4f4a\ub83f\u97e6\u3e2a, p0:\u5140\u6bb9\u8bb0\u946b\u3dd3))) {
                            if (cmpeq:boolean(invokevirtual:double(\u5140\u6bb9\u8bb0\u946b\u3dd3::\u527a\u0800\u3e2a\uc238\u71ae, invokevirtual:\u5140\u6bb9\u8bb0\u946b\u3dd3(\ubf56\ud7e8\u156b\u72f1\u494c::\uceb8\uc3e3\u71ae\ub19c\u7d52, var_5_16F:\ubf56\ud7e8\u156b\u72f1\u494c)), invokevirtual:double(\u5140\u6bb9\u8bb0\u946b\u3dd3::\u527a\u0800\u3e2a\uc238\u71ae, p0:\u5140\u6bb9\u8bb0\u946b\u3dd3))) {
                                return:\ubf56\ud7e8\u156b\u72f1\u494c(var_5_16F:\ubf56\ud7e8\u156b\u72f1\u494c)
                            }
                        }
                    }
                    
                    var_2_78 = and:int(var_2_78:int, ldc:int(-822083590))
                }
            }
            
            Label_0320:
            
            if (cmpeq:boolean(and:int(var_2_78:int, ldc:int(262144)), ldc:int(0))) {
                goto(Label_0157)
            }
            
            if (cmpeq:boolean(and:int(var_2_78:int, ldc:int(4096)), ldc:int(0))) {
                return:\ubf56\ud7e8\u156b\u72f1\u494c(aconstnull:\ubf56\ud7e8\u156b\u72f1\u494c())
            }
            
            var_2_61 = and:int(var_2_78:int, ldc:int(1596992593))
        }
    }
    
    public boolean \u6ec6\u67e9\u3504\u5654\u92ee(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u836c\u67e9\u5d20\u5fe1\u7e3f.\ubf56\ud7e8\u156b\u72f1\u494c p0, \u56bd\u8413\u647c\u5bc4\ud158.\u5140\u6bb9\u8bb0\u946b\u3dd3 p1, double p2) {
        var_5_E6 : int
        var_7_6A : \ubf56\ud7e8\u156b\u72f1\u494c
        var_8_6D : double
        var_10_2C8 : ArrayList<\u5140\u6bb9\u8bb0\u946b\u3dd3>
        var_10_216 : ArrayList<\u5140\u6bb9\u8bb0\u946b\u3dd3>
        
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
            var_5_E6 = and:int(ldc:int(1201139349), ldc:int(-896538819))
            var_7_6A = invokevirtual:\ubf56\ud7e8\u156b\u72f1\u494c(\u64f2\u718f\u56bd\u4975\u3bd6::\uae87\ub113\uc910\ubefe\u8308, this:\u64f2\u718f\u56bd\u4975\u3bd6, p1:\u5140\u6bb9\u8bb0\u946b\u3dd3)
            var_8_6D = p2:double
            
            if (cmpne:boolean(p0:\ubf56\ud7e8\u156b\u72f1\u494c, aconstnull:\ubf56\ud7e8\u156b\u72f1\u494c())) {
                var_8_6D = add:double(var_8_6D:double, invokevirtual:double(\ubf56\ud7e8\u156b\u72f1\u494c::\ub83f\uc31c\u446c\ua61f\u6198, p0:\ubf56\ud7e8\u156b\u72f1\u494c))
            }
            
            loop {
                if (cmpeq:boolean(and:int(var_5_E6:int, ldc:int(32768)), ldc:int(0))) {
                    var_5_E6 = and:int(var_5_E6:int, ldc:int(970146852))
                    goto(Label_0457)
                }
                
                if (cmpne:boolean(and:int(var_5_E6:int, ldc:int(524288)), ldc:int(0))) {
                    goto(Label_0393)
                }
                
                if (cmpeq:boolean(and:int(var_5_E6:int, ldc:int(65536)), ldc:int(0))) {
                    goto(Label_0262)
                }
                
                if (cmpne:boolean(and:int(var_5_E6:int, ldc:int(4194304)), ldc:int(0))) {
                    var_5_E6 = and:int(var_5_E6:int, ldc:int(-803748602))
                }
                else {
                    var_5_E6 = and:int(var_5_E6:int, ldc:int(-297402562))
                    
                    if (cmpeq:boolean(var_7_6A:\ubf56\ud7e8\u156b\u72f1\u494c, aconstnull:\ubf56\ud7e8\u156b\u72f1\u494c())) {
                        if (cmpne:boolean(invokevirtual:double(\u5140\u6bb9\u8bb0\u946b\u3dd3::\u759a\ub171\uf995\u836c\u9af2, p1:\u5140\u6bb9\u8bb0\u946b\u3dd3), invokevirtual:double(\u5140\u6bb9\u8bb0\u946b\u3dd3::\u759a\ub171\uf995\u836c\u9af2, getfield:\u5140\u6bb9\u8bb0\u946b\u3dd3(\u64f2\u718f\u56bd\u4975\u3bd6::\u1833\u8aa5\u3e75\u6bb9\u6d69, this:\u64f2\u718f\u56bd\u4975\u3bd6)))) {
                            goto(Label_0393)
                        }
                        
                        if (cmpne:boolean(invokevirtual:double(\u5140\u6bb9\u8bb0\u946b\u3dd3::\u9af2\u4f4a\ub83f\u97e6\u3e2a, p1:\u5140\u6bb9\u8bb0\u946b\u3dd3), invokevirtual:double(\u5140\u6bb9\u8bb0\u946b\u3dd3::\u9af2\u4f4a\ub83f\u97e6\u3e2a, getfield:\u5140\u6bb9\u8bb0\u946b\u3dd3(\u64f2\u718f\u56bd\u4975\u3bd6::\u1833\u8aa5\u3e75\u6bb9\u6d69, this:\u64f2\u718f\u56bd\u4975\u3bd6)))) {
                            goto(Label_0393)
                        }
                        
                        if (cmpeq:boolean(invokevirtual:double(\u5140\u6bb9\u8bb0\u946b\u3dd3::\u527a\u0800\u3e2a\uc238\u71ae, p1:\u5140\u6bb9\u8bb0\u946b\u3dd3), invokevirtual:double(\u5140\u6bb9\u8bb0\u946b\u3dd3::\u527a\u0800\u3e2a\uc238\u71ae, getfield:\u5140\u6bb9\u8bb0\u946b\u3dd3(\u64f2\u718f\u56bd\u4975\u3bd6::\u1833\u8aa5\u3e75\u6bb9\u6d69, this:\u64f2\u718f\u56bd\u4975\u3bd6)))) {
                            looporswitchbreak()
                        }
                        
                        goto(Label_0393)
                    }
                }
                
                Label_0186:
                
                if (cmpeq:boolean(and:int(var_5_E6:int, ldc:int(16384)), ldc:int(0))) {
                    var_5_E6 = and:int(var_5_E6:int, ldc:int(-142100305))
                    goto(Label_0457)
                }
                
                if (cmpeq:boolean(and:int(var_5_E6:int, ldc:int(65536)), ldc:int(0))) {
                    goto(Label_0393)
                }
                
                if (cmpeq:boolean(and:int(var_5_E6:int, ldc:int(16384)), ldc:int(0))) {
                    var_5_E6 = and:int(var_5_E6:int, ldc:int(-558657113))
                }
                else {
                    if (cmpeq:boolean(and:int(var_5_E6:int, ldc:int(8192)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_5_E6 = and:int(var_5_E6:int, ldc:int(1875240765))
                    
                    if (cmpgt:boolean(invokevirtual:double(\ubf56\ud7e8\u156b\u72f1\u494c::\uff55\uc229\uc910\u61a4\u74b1, var_7_6A:\ubf56\ud7e8\u156b\u72f1\u494c), p2:double)) {
                        var_10_2C8 = initobject:ArrayList<\u5140\u6bb9\u8bb0\u946b\u3dd3>(ArrayList<\u5140\u6bb9\u8bb0\u946b\u3dd3>::<init>, invokevirtual:ArrayList<\u5140\u6bb9\u8bb0\u946b\u3dd3>[expected:Collection<? extends \u5140\u6bb9\u8bb0\u946b\u3dd3>](\ubf56\ud7e8\u156b\u72f1\u494c::\uc246\ube23\u3d4b\u92ff\u98a4, p0:\ubf56\ud7e8\u156b\u72f1\u494c))
                        invokevirtual:boolean(ArrayList<\u5140\u6bb9\u8bb0\u946b\u3dd3>::add, var_10_2C8:ArrayList<\u5140\u6bb9\u8bb0\u946b\u3dd3>, p1:\u5140\u6bb9\u8bb0\u946b\u3dd3)
                        invokevirtual:void(\ubf56\ud7e8\u156b\u72f1\u494c::\u5f50\u3dd3\u6435\u1833\u67e9, var_7_6A:\ubf56\ud7e8\u156b\u72f1\u494c, p1:\u5140\u6bb9\u8bb0\u946b\u3dd3)
                        invokevirtual:void(\ubf56\ud7e8\u156b\u72f1\u494c::\u7043\u494c\u6ec6\u62da\ub8be, var_7_6A:\ubf56\ud7e8\u156b\u72f1\u494c, p0:\ubf56\ud7e8\u156b\u72f1\u494c)
                        invokevirtual:void(\ubf56\ud7e8\u156b\u72f1\u494c::\u416d\u965f\u3e75\u4179\u6c56, var_7_6A:\ubf56\ud7e8\u156b\u72f1\u494c, var_10_2C8:ArrayList<\u5140\u6bb9\u8bb0\u946b\u3dd3>)
                        invokevirtual:void(\ubf56\ud7e8\u156b\u72f1\u494c::\u5245\u3504\u7043\u2dcc\ub70c, var_7_6A:\ubf56\ud7e8\u156b\u72f1\u494c, invokevirtual:double(\u5140\u6bb9\u8bb0\u946b\u3dd3::\uf9c5\u64ab\u927d\u0b8e\u34df, p1:\u5140\u6bb9\u8bb0\u946b\u3dd3, getfield:\u5140\u6bb9\u8bb0\u946b\u3dd3(\u64f2\u718f\u56bd\u4975\u3bd6::\u1833\u8aa5\u3e75\u6bb9\u6d69, this:\u64f2\u718f\u56bd\u4975\u3bd6)))
                        invokevirtual:void(\ubf56\ud7e8\u156b\u72f1\u494c::\u8709\ud12e\u7330\uc246\ud171, var_7_6A:\ubf56\ud7e8\u156b\u72f1\u494c, p2:double)
                        invokevirtual:void(\ubf56\ud7e8\u156b\u72f1\u494c::\u416d\ube23\ua6bd\ua562\u5654, var_7_6A:\ubf56\ud7e8\u156b\u72f1\u494c, var_8_6D:double)
                    }
                }
                
                Label_0262:
                
                if (cmpne:boolean(and:int(var_5_E6:int, ldc:int(8)), ldc:int(0))) {
                    var_5_E6 = and:int(var_5_E6:int, ldc:int(-1432753362))
                    goto(Label_0457)
                }
                
                if (cmpeq:boolean(and:int(var_5_E6:int, ldc:int(16)), ldc:int(0))) {
                    var_5_E6 = and:int(var_5_E6:int, ldc:int(643952405))
                }
                else {
                    if (cmpeq:boolean(and:int(var_5_E6:int, ldc:int(32768)), ldc:int(0))) {
                        var_5_E6 = and:int(var_5_E6:int, ldc:int(223772))
                        goto(Label_0186)
                    }
                    
                    if (cmpeq:boolean(and:int(var_5_E6:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_5_E6 = and:int(var_5_E6:int, ldc:int(-138227800))
                        loopcontinue()
                    }
                    
                    return:boolean(and:int[expected:boolean](ldc:int(-9879), ldc:int(1686)))
                }
                
                Label_0393:
                
                if (cmpne:boolean(and:int(var_5_E6:int, ldc:int(1073741824)), ldc:int(0))) {
                    if (cmpne:boolean(and:int(var_5_E6:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0262)
                    }
                    
                    if (cmpeq:boolean(and:int(var_5_E6:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_5_E6 = and:int(var_5_E6:int, ldc:int(-1958137747))
                        goto(Label_0186)
                    }
                    
                    if (cmpeq:boolean(and:int(var_5_E6:int, ldc:int(16384)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_5_E6 = and:int(var_5_E6:int, ldc:int(1883502397))
                    
                    if (cmpne:boolean(getfield:double(\u64f2\u718f\u56bd\u4975\u3bd6::\u2dcc\u4e72\u3711\u0a06\ua61f, this:\u64f2\u718f\u56bd\u4975\u3bd6), ldc:double(0.0))) {
                        if (cmple:boolean(invokevirtual:double(\u5140\u6bb9\u8bb0\u946b\u3dd3::\uf9c5\u64ab\u927d\u0b8e\u34df, p1:\u5140\u6bb9\u8bb0\u946b\u3dd3, getfield:\u5140\u6bb9\u8bb0\u946b\u3dd3(\u64f2\u718f\u56bd\u4975\u3bd6::\u1833\u8aa5\u3e75\u6bb9\u6d69, this:\u64f2\u718f\u56bd\u4975\u3bd6)), getfield:double(\u64f2\u718f\u56bd\u4975\u3bd6::\u2dcc\u4e72\u3711\u0a06\ua61f, this:\u64f2\u718f\u56bd\u4975\u3bd6))) {
                            looporswitchbreak()
                        }
                    }
                }
                
                Label_0457:
                
                if (cmpeq:boolean(and:int(var_5_E6:int, ldc:int(2147483647)), ldc:int(0))) {
                    goto(Label_0393)
                }
                
                if (cmpne:boolean(and:int(var_5_E6:int, ldc:int(8)), ldc:int(0))) {
                    var_5_E6 = and:int(var_5_E6:int, ldc:int(981516224))
                    goto(Label_0262)
                }
                
                if (cmpne:boolean(and:int(var_5_E6:int, ldc:int(268435456)), ldc:int(0))) {
                    var_5_E6 = and:int(var_5_E6:int, ldc:int(1929460201))
                    goto(Label_0186)
                }
                
                if (cmpeq:boolean(and:int(var_5_E6:int, ldc:int(32)), ldc:int(0))) {
                    var_5_E6 = and:int(var_5_E6:int, ldc:int(-654836002))
                    var_10_216 = initobject:ArrayList<\u5140\u6bb9\u8bb0\u946b\u3dd3>(ArrayList<\u5140\u6bb9\u8bb0\u946b\u3dd3>::<init>, invokevirtual:ArrayList<\u5140\u6bb9\u8bb0\u946b\u3dd3>[expected:Collection<? extends \u5140\u6bb9\u8bb0\u946b\u3dd3>](\ubf56\ud7e8\u156b\u72f1\u494c::\uc246\ube23\u3d4b\u92ff\u98a4, p0:\ubf56\ud7e8\u156b\u72f1\u494c))
                    invokevirtual:boolean(ArrayList<\u5140\u6bb9\u8bb0\u946b\u3dd3>::add, var_10_216:ArrayList<\u5140\u6bb9\u8bb0\u946b\u3dd3>, p1:\u5140\u6bb9\u8bb0\u946b\u3dd3)
                    invokevirtual:boolean(ArrayList<\ubf56\ud7e8\u156b\u72f1\u494c>::add, getfield:ArrayList<\ubf56\ud7e8\u156b\u72f1\u494c>(\u64f2\u718f\u56bd\u4975\u3bd6::\uceb8\uc4d2\u8350\u7873\u5654, this:\u64f2\u718f\u56bd\u4975\u3bd6), initobject:\ubf56\ud7e8\u156b\u72f1\u494c(\ubf56\ud7e8\u156b\u72f1\u494c::<init>, p1:\u5140\u6bb9\u8bb0\u946b\u3dd3, p0:\ubf56\ud7e8\u156b\u72f1\u494c, var_10_216:ArrayList<\u5140\u6bb9\u8bb0\u946b\u3dd3>, invokevirtual:double(\u5140\u6bb9\u8bb0\u946b\u3dd3::\uf9c5\u64ab\u927d\u0b8e\u34df, p1:\u5140\u6bb9\u8bb0\u946b\u3dd3, getfield:\u5140\u6bb9\u8bb0\u946b\u3dd3(\u64f2\u718f\u56bd\u4975\u3bd6::\u1833\u8aa5\u3e75\u6bb9\u6d69, this:\u64f2\u718f\u56bd\u4975\u3bd6)), p2:double, var_8_6D:double))
                    goto(Label_0262)
                }
            }
            
            Label_0617:
            invokevirtual:void(ArrayList<E>::clear, getfield:ArrayList<\u5140\u6bb9\u8bb0\u946b\u3dd3>(\u64f2\u718f\u56bd\u4975\u3bd6::\uc9f6\ub18d\ub6ab\u3c25\u8258, this:\u64f2\u718f\u56bd\u4975\u3bd6))
            invokevirtual:boolean(ArrayList<\u5140\u6bb9\u8bb0\u946b\u3dd3>::add, putfield:ArrayList<\u5140\u6bb9\u8bb0\u946b\u3dd3>(\u64f2\u718f\u56bd\u4975\u3bd6::\uc9f6\ub18d\ub6ab\u3c25\u8258, this:\u64f2\u718f\u56bd\u4975\u3bd6, invokevirtual:ArrayList<\u5140\u6bb9\u8bb0\u946b\u3dd3>(\ubf56\ud7e8\u156b\u72f1\u494c::\uc246\ube23\u3d4b\u92ff\u98a4, p0:\ubf56\ud7e8\u156b\u72f1\u494c)), p1:\u5140\u6bb9\u8bb0\u946b\u3dd3)
            return:boolean(xor:int[expected:boolean](ldc:int(4488), ldc:int(4489)))
            goto(Label_0617)
        }
        
        goto(Label_0006)
    }
    
    static {
        expr_6F : \u5140\u6bb9\u8bb0\u946b\u3dd3[] [generated]
        
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
            putstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u64f2\u718f\u56bd\u4975\u3bd6::\u4492\u52d3\u4d85\uff55\u1187, invokestatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u6d69\u71ae\ucfaf\u516c\ube23\u8350))
            expr_6F = newarray:\u5140\u6bb9\u8bb0\u946b\u3dd3[](\u56bd\u8413\u647c\u5bc4\ud158.\u5140\u6bb9\u8bb0\u946b\u3dd3.class, and:int(ldc:int(8204), ldc:int(4166)))
            storeelement:\u5140\u6bb9\u8bb0\u946b\u3dd3(expr_6F:\u5140\u6bb9\u8bb0\u946b\u3dd3[], and:int(ldc:int(-26181), ldc:int(25156)), initobject:\u5140\u6bb9\u8bb0\u946b\u3dd3(\u5140\u6bb9\u8bb0\u946b\u3dd3::<init>, ldc:double(1.0), ldc:double(0.0), ldc:double(0.0)))
            storeelement:\u5140\u6bb9\u8bb0\u946b\u3dd3(expr_6F:\u5140\u6bb9\u8bb0\u946b\u3dd3[], xor:int(ldc:int(2067), ldc:int(2066)), initobject:\u5140\u6bb9\u8bb0\u946b\u3dd3(\u5140\u6bb9\u8bb0\u946b\u3dd3::<init>, ldc:double(-1.0), ldc:double(0.0), ldc:double(0.0)))
            storeelement:\u5140\u6bb9\u8bb0\u946b\u3dd3(expr_6F:\u5140\u6bb9\u8bb0\u946b\u3dd3[], and:int(ldc:int(26642), ldc:int(4994)), initobject:\u5140\u6bb9\u8bb0\u946b\u3dd3(\u5140\u6bb9\u8bb0\u946b\u3dd3::<init>, ldc:double(0.0), ldc:double(0.0), ldc:double(1.0)))
            storeelement:\u5140\u6bb9\u8bb0\u946b\u3dd3(expr_6F:\u5140\u6bb9\u8bb0\u946b\u3dd3[], xor:int(ldc:int(8706), ldc:int(8705)), initobject:\u5140\u6bb9\u8bb0\u946b\u3dd3(\u5140\u6bb9\u8bb0\u946b\u3dd3::<init>, ldc:double(0.0), ldc:double(0.0), ldc:double(-1.0)))
            putstatic:\u5140\u6bb9\u8bb0\u946b\u3dd3[](\u64f2\u718f\u56bd\u4975\u3bd6::\u9255\u5bc4\u516c\u8389\u1833, expr_6F:\u5140\u6bb9\u8bb0\u946b\u3dd3[])
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u74b1\u3bc9\u8753\u71ae\ufe34(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_642 : int
        var_5_81 : int
        var_6_88 : int
        var_7_97 : double
        var_9_BF : double
        var_3_D1 : int
        var_11_E2 : int
        var_14_10C : double
        var_16_110 : int
        var_12_108 : double
        var_17_64D : int
        
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
        var_3_642 = and:int(ldc:int(1055401246), ldc:int(-270389413))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u64f2\u718f\u56bd\u4975\u3bd6[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0171)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_642:int, ldc:int(2097152)), ldc:int(0))) {
            var_3_642 = and:int(var_3_642:int, ldc:int(-160354822))
            var_5_81 = and:int(ldc:int(-28820), ldc:int(28818))
            var_6_88 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_97 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-21859), ldc:int(21794)))
            invokestatic:int(m::a)
            
            loop {
                var_9_BF = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D1 = and:int(var_3_642:int, ldc:int(-1234831975))
                    var_9_BF = sub:double(var_7_97:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E2 = var_5_81:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E2:int, sub:int(var_6_88:int, xor:int(ldc:int(24586), ldc:int(24587)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E2:int, and:int(ldc:int(2305), ldc:int(8227)))), var_7_97:double))) {
                        inc:int(var_11_E2, ldc:int(1))
                    }
                    
                    var_3_642 = and:int(var_3_D1:int, ldc:int(-403275780))
                    var_14_10C = var_7_97:double
                    var_16_110 = var_11_E2:int
                }
                else {
                    var_11_E2 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_81:int), xor:int(ldc:int(-31724), ldc:int(-31723)))
                    var_12_108 = var_14_10C = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81)
                    
                    if (cmplt:boolean(var_16_110 = var_11_E2:int, var_6_88:int)) {
                        var_9_BF = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E2:int)
                        var_16_110 = var_11_E2:int
                        var_14_10C = var_12_108:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1491)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_642:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1372)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(16)), ldc:int(0))) {
                        var_3_642 = and:int(var_3_642:int, ldc:int(1402932138))
                        goto(Label_1246)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_642 = and:int(var_3_642:int, ldc:int(-950890552))
                        goto(Label_1141)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0990)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(256)), ldc:int(0))) {
                        var_3_642 = and:int(var_3_642:int, ldc:int(2049855554))
                        goto(Label_0830)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0708)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_642 = and:int(var_3_642:int, ldc:int(222907206))
                        goto(Label_0585)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_642:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_642 = and:int(var_3_642:int, ldc:int(-1142575783))
                        
                        if (cmplt:boolean(var_16_110:int, var_6_88:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0585)
                            }
                            
                            goto(Label_0830)
                        }
                    }
                    
                    Label_0401:
                    
                    if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_642 = and:int(var_3_642:int, ldc:int(671396643))
                        goto(Label_1491)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_642:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1372)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_642:int, ldc:int(1)), ldc:int(0))) {
                        var_3_642 = and:int(var_3_642:int, ldc:int(1318455031))
                        goto(Label_1246)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_642:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_642 = and:int(var_3_642:int, ldc:int(283402265))
                        goto(Label_1141)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(16)), ldc:int(0))) {
                        var_3_642 = and:int(var_3_642:int, ldc:int(1497856332))
                        goto(Label_0990)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_642:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_642 = and:int(var_3_642:int, ldc:int(-1194229737))
                        goto(Label_0830)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_642:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0708)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(8)), ldc:int(0))) {
                        var_3_642 = and:int(var_3_642:int, ldc:int(1341192870))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_642 = and:int(var_3_642:int, ldc:int(-353929447))
                            var_11_E2 = and:int(ldc:int(-4387), ldc:int(4386))
                            goto(Label_1480)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0585:
                    
                    if (cmpne:boolean(and:int(var_3_642:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1491)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_642:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1372)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_642:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_642 = and:int(var_3_642:int, ldc:int(-680872460))
                        goto(Label_1246)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1141)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(256)), ldc:int(0))) {
                        var_3_642 = and:int(var_3_642:int, ldc:int(1270922194))
                        goto(Label_0990)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0830)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_642:int, ldc:int(4194304)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_642:int, ldc:int(1)), ldc:int(0))) {
                            var_3_642 = and:int(var_3_642:int, ldc:int(1394585373))
                            goto(Label_0401)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_642 = and:int(var_3_642:int, ldc:int(89177113))
                            loopcontinue()
                        }
                        
                        var_3_642 = and:int(var_3_642:int, ldc:int(870444442))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10C = var_9_BF:double
                            goto(Label_0830)
                        }
                    }
                    
                    Label_0708:
                    
                    if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_642 = and:int(var_3_642:int, ldc:int(-496461025))
                        goto(Label_1491)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(8)), ldc:int(0))) {
                        var_3_642 = and:int(var_3_642:int, ldc:int(-484779881))
                        goto(Label_1372)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_642 = and:int(var_3_642:int, ldc:int(-1399357210))
                        goto(Label_1246)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1141)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0990)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(32)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_642:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0585)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0401)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_642:int, ldc:int(1)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_642 = and:int(var_3_642:int, ldc:int(861988735))
                        var_14_10C = mul:double(ldc:double(0.5), add:double(var_9_BF:double, var_14_10C:double))
                    }
                    
                    Label_0830:
                    
                    if (cmpne:boolean(and:int(var_3_642:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1491)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_642 = and:int(var_3_642:int, ldc:int(1279155209))
                        goto(Label_1372)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_642:int, ldc:int(64)), ldc:int(0))) {
                        var_3_642 = and:int(var_3_642:int, ldc:int(-1878425227))
                        goto(Label_1246)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_642:int, ldc:int(1)), ldc:int(0))) {
                        var_3_642 = and:int(var_3_642:int, ldc:int(-1094988558))
                        goto(Label_1141)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_642 = and:int(var_3_642:int, ldc:int(-1046586367))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(256)), ldc:int(0))) {
                            var_3_642 = and:int(var_3_642:int, ldc:int(-690081297))
                            goto(Label_0708)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_642:int, ldc:int(1)), ldc:int(0))) {
                            var_3_642 = and:int(var_3_642:int, ldc:int(1114238331))
                            goto(Label_0585)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_642 = and:int(var_3_642:int, ldc:int(434104443))
                            goto(Label_0401)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_642 = and:int(var_3_642:int, ldc:int(155211558))
                            loopcontinue()
                        }
                        
                        var_3_642 = and:int(var_3_642:int, ldc:int(-68426246))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81:int), var_7_97:double)) {
                                var_11_E2 = and:int(ldc:int(20545), ldc:int(11393))
                                goto(Label_1141)
                            }
                        }
                    }
                    
                    Label_0990:
                    
                    if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1491)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_642:int, ldc:int(32)), ldc:int(0))) {
                        var_3_642 = and:int(var_3_642:int, ldc:int(837328813))
                        goto(Label_1372)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_642:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1246)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(256)), ldc:int(0))) {
                        var_3_642 = and:int(var_3_642:int, ldc:int(438418739))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0830)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_642:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0708)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0585)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_642:int, ldc:int(32)), ldc:int(0))) {
                            var_3_642 = and:int(var_3_642:int, ldc:int(1607469421))
                            goto(Label_0401)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_642:int, ldc:int(32)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_642 = and:int(var_3_642:int, ldc:int(778927421))
                        var_11_E2 = and:int(ldc:int(16728), ldc:int(-18782))
                    }
                    
                    Label_1141:
                    
                    if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_642 = and:int(var_3_642:int, ldc:int(388863096))
                        goto(Label_1491)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_642:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_642 = and:int(var_3_642:int, ldc:int(-1335368433))
                        goto(Label_1372)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_642:int, ldc:int(1024)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0990)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0830)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0708)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0585)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0401)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_642:int, ldc:int(64)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_642 = and:int(var_3_642:int, ldc:int(1801878906))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E2:int, ldc:int(0))) {
                                goto(Label_1372)
                            }
                        }
                    }
                    
                    Label_1246:
                    
                    if (cmpne:boolean(and:int(var_3_642:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_642 = and:int(var_3_642:int, ldc:int(-100921669))
                        goto(Label_1491)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(32)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_1141)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_642:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0990)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0830)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_642:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0708)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(256)), ldc:int(0))) {
                            var_3_642 = and:int(var_3_642:int, ldc:int(-1619267522))
                            goto(Label_0585)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_642 = and:int(var_3_642:int, ldc:int(-1984128986))
                            goto(Label_0401)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_642:int, ldc:int(8)), ldc:int(0))) {
                            var_3_642 = and:int(var_3_642:int, ldc:int(2070621533))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10C:double, var_5_81:int, var_16_110:int)
                            goto(Label_1480)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1372:
                    
                    if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1491)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_642:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1246)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_642:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1141)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_642:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0990)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0830)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0708)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_642:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0585)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_642 = and:int(var_3_642:int, ldc:int(-267820080))
                        goto(Label_0401)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(2147483647)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_642 = and:int(var_3_642:int, ldc:int(1726445433))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10C:double, ldc:double(0.0))
                    Label_1480:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_64D = var_5_81:int
                        
                        if (cmpeq:boolean(var_11_E2:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1491:
                    
                    if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1372)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1246)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_642:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_642 = and:int(var_3_642:int, ldc:int(-1208631016))
                        goto(Label_1141)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0990)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_642:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_642 = and:int(var_3_642:int, ldc:int(2022555938))
                        goto(Label_0830)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0708)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_642:int, ldc:int(32)), ldc:int(0))) {
                        var_3_642 = and:int(var_3_642:int, ldc:int(-1009057596))
                        goto(Label_0585)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_642:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0401)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_642:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_642 = and:int(var_3_642:int, ldc:int(2054926236))
                        var_17_64D = add:int(var_16_110:int, xor:int(ldc:int(-32704), ldc:int(-32703)))
                        looporswitchbreak()
                    }
                    
                    var_3_642 = and:int(var_3_642:int, ldc:int(633064456))
                }
                
                var_3_642 = and:int(var_3_642:int, ldc:int(-403884609))
                
                if (cmple:boolean(var_5_81 = var_17_64D:int, sub:int(var_6_88:int, xor:int(ldc:int(-29952), ldc:int(-29951))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0171:
        
        if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(131072)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
